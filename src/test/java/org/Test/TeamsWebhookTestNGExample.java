package org.Test;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import org.testng.ITestContext;
import org.testng.TestListenerAdapter;

public class TeamsWebhookTestNGExample extends TestListenerAdapter {
	private static final String WEBHOOK_URL = "https://sensipleo365.webhook.office.com/webhookb2/9c03357f-d306-42eb-96af-7aeeadd7a069@703c053d-5afe-45e5-90aa-84ff8728deee/IncomingWebhook/c6817845a2f8482a82ce7463ca5dce02/f7fa9f9b-e926-40a8-a9aa-a4916e42d6db";

	@Override
	public void onFinish(ITestContext context) {
// Create a JSON payload for the test results message
		String projectName = "Internal Product(Tryvium)";
		String suiteName = context.getSuite().getName();
		int passedTests = context.getPassedTests().size();
		int failedTests = context.getFailedTests().size();
		String message = String.format("%s - %s: %d passed, %d failed", projectName, suiteName, passedTests,
				failedTests);
		String payload = String.format("{\"text\": \"%s\"}", message);

		try {
// Set up the HTTP request
			URL url = new URL(WEBHOOK_URL);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/json");
			connection.setDoOutput(true);

// Write the payload to the output stream of the request
			OutputStream outputStream = connection.getOutputStream();
			byte[] payloadBytes = payload.getBytes(StandardCharsets.UTF_8);
			outputStream.write(payloadBytes);
			outputStream.flush();
			outputStream.close();

// Read the response from the webhook
			int statusCode = connection.getResponseCode();
			String responseMessage = connection.getResponseMessage();
			System.out.println(String.format("Status: %d, Message: %s", statusCode, responseMessage));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
