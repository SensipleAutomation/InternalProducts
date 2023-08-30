package org.Test;

import org.testng.TestListenerAdapter;
import org.testng.ITestContext;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class TestPart extends TestListenerAdapter {
	
	private static final String WEBHOOK_URL = "https://sensipleo365.webhook.office.com/webhookb2/9c03357f-d306-42eb-96af-7aeeadd7a069@703c053d-5afe-45e5-90aa-84ff8728deee/IncomingWebhook/c6817845a2f8482a82ce7463ca5dce02/f7fa9f9b-e926-40a8-a9aa-a4916e42d6db";

	@Override
	public void onFinish(ITestContext context) {
		try {
			// Read the generated HTML report file
			File reportFile = new File("test-output", "emailable-report.html");
			byte[] reportBytes = readBytesFromFile(reportFile);
			String reportBase64 = Base64.getEncoder().encodeToString(reportBytes);

			// Create a JSON payload with the report attachment
			String projectName = "Internal Product(Tryvium)";
			String suiteName = context.getSuite().getName();
			int passedTests = context.getPassedTests().size();
			int failedTests = context.getFailedTests().size();
			String message = String.format("%s - %s: %d passed, %d failed", projectName, suiteName, passedTests,
					failedTests);
			String payload = String.format(
					"{\"text\": \"%s\", \"attachments\": [{\"name\": \"TestReport.html\", \"content\": \"%s\"}]}",
					message, reportBase64);

			// Set up the HTTP request
			URL url = new URL(WEBHOOK_URL);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/json");
			connection.setDoOutput(true);

			// Write the payload to the output stream of the request
			try (OutputStream outputStream = connection.getOutputStream()) {
				byte[] payloadBytes = payload.getBytes(StandardCharsets.UTF_8);
				outputStream.write(payloadBytes);
				outputStream.flush();
			}

			// Read the response from the webhook
			int statusCode = connection.getResponseCode();
			String responseMessage = connection.getResponseMessage();
			System.out.println(String.format("Status: %d, Message: %s", statusCode, responseMessage));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private byte[] readBytesFromFile(File file) throws IOException {
		try (FileInputStream inputStream = new FileInputStream(file)) {
			byte[] buffer = new byte[(int) file.length()];
			int bytesRead = inputStream.read(buffer);
			if (bytesRead != -1) {
				return buffer;
			}
		}
		return new byte[0];

	}
}
