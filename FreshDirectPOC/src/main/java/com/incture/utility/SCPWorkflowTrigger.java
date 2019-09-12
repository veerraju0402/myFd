package com.incture.utility;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class SCPWorkflowTrigger {

	public String triggerWorkflow(String  payload) {
		int i=1;
		try {
			String xcsrfToken = null;
			List<String> cookies = null;
			String url = "https://bpmworkflowruntimea2d6007ea-af91a028a.hana.ondemand.com/workflow-service/rest/v1/workflow-instances";
			URL urlObj = new URL(url);
			HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
			String userpass = "P1942347420" + ":" + "Kiru123!";
			String auth = "Basic " + javax.xml.bind.DatatypeConverter.printBase64Binary(userpass.getBytes());
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Authorization", auth);
			connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			connection.setRequestProperty("X-CSRF-Token", "Fetch");
			connection.connect();
			System.err.println("Response Code0:"+connection.getResponseCode());
			if (HttpURLConnection.HTTP_OK == connection.getResponseCode()) {
				HttpURLConnection connection1 = (HttpURLConnection) urlObj.openConnection();
				connection1.setRequestMethod("POST");
				xcsrfToken = connection.getHeaderField("X-CSRF-Token");
				cookies = connection.getHeaderFields().get("Set-Cookie");
				System.err.println("XSRF Token"+xcsrfToken);
				// SET COOKIES
				for (String cookie : cookies) {
					String tmp = cookie.split(";", 2)[0];
					connection1.addRequestProperty("Cookie", tmp);
				}

				connection1.setRequestProperty("Authorization", auth);
				connection1.setRequestProperty("x-csrf-token", xcsrfToken);
				connection1.setRequestProperty("Content-Type", "application/json; charset=utf-8");
				connection1.setRequestProperty("Accept", "application/json");
				connection1.setRequestProperty("DataServiceVersion", "2.0");
				connection1.setRequestProperty("X-Requested-With", "XMLHttpRequest");
				connection1.setRequestProperty("Accept-Encoding", "gzip, deflate");
				connection1.setRequestProperty("Accept-Charset", "UTF-8");
				connection1.setDoInput(true);
				connection1.setDoOutput(true);
				connection1.setUseCaches(false);
				System.err.println("Workflow "+i+" Payload :"+payload);
				DataOutputStream dataOutputStream = new DataOutputStream(connection1.getOutputStream());
				dataOutputStream.write(payload.getBytes());
				dataOutputStream.flush();
				dataOutputStream.close();
				connection1.connect();
				System.err.println("Workflow "+i+" Response Code :"+connection1.getResponseCode());
				System.err.println("Workflow "+i+" Response :"+getDataFromStream(connection1.getInputStream()));
			} else {
				System.err.println("Else Trigger FAILURE ");
				return "Trigger FAILURE";
			}
		} catch (Exception e) {
			System.err.println("Trigger FAILURE "+e.getMessage());
			return "Trigger FAILURE";
		}
		i++;
		return "Workflow triggered successfully";
	}

	private String getDataFromStream(InputStream stream) throws IOException {
		StringBuffer dataBuffer = new StringBuffer();
		BufferedReader inStream = new BufferedReader(new InputStreamReader(stream));
		String data = "";

		while ((data = inStream.readLine()) != null) {
			dataBuffer.append(data);
		}
		inStream.close();

		return dataBuffer.toString();
	}

}
