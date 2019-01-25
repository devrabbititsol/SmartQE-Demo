package com.fileupload;

import java.io.File;
import java.util.List;
import java.util.TimeZone;

public class FileUploaderClient {

	public void uploadFile(String reportUploadURL, String reportPath, String userId, String testCaseId, String testSetID, String moduleId,
			String submoduleId, boolean is_web, String result, String reportstatus, String mobilePlatform) {

		String charset = "UTF-8";
		File uploadFile = new File(reportPath);
		///String requestURL = "http://183.82.106.91:8030/BAF_Automation/UploadReportFile";

		try {
			MultipartUtility multipart = new MultipartUtility(reportUploadURL, charset);
			multipart.addFormField("user_id", userId);
			if (!testSetID.isEmpty()) {
				multipart.addFormField("testset_id", testSetID);
			} else {
				multipart.addFormField("testcase_id", testCaseId);
			}
			
			if(mobilePlatform != null && (mobilePlatform.equalsIgnoreCase("Android")||mobilePlatform.equalsIgnoreCase("iOS"))) {
				multipart.addFormField("report_type", mobilePlatform);
			} else {
				multipart.addFormField("report_type", is_web ? "web" : "api");
			}
			
			multipart.addFormField("module_id", (submoduleId == null || submoduleId.isEmpty() || submoduleId.equals("0")) ? moduleId : submoduleId);
			multipart.addFormField("report_result", result);
			multipart.addFormField("report_status", reportstatus);
			multipart.addFormField("client_time_zone_id", TimeZone.getDefault().getID());
			multipart.addFilePart("file", uploadFile);

			List<String> response = multipart.finish();

			System.out.println("SERVER REPLIED:");

			for (String line : response) {
				System.out.println(line);
			}
		} catch (Exception ex) {
			System.err.println(ex);
		}

	}

}