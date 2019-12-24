package kcp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javazoom.upload.MultipartFormDataRequest;
import javazoom.upload.UploadBean;
import javazoom.upload.UploadException;

@WebServlet("/UploadFile")
public class UploadFile extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw = null;
		UploadBean bean = null;
		Enumeration e = null;
		Object file = null;
		Hashtable ht = null;
		MultipartFormDataRequest data = null;
		pw = response.getWriter();
		response.setContentType("text/html");
		bean = new UploadBean();
		boolean flag = false;

		try {
			data = new MultipartFormDataRequest(request);
			bean.setFolderstore("f:/store");
			bean.setOverwrite(false);
			bean.store(data);
			pw.println("<h1> The upload file are</h1>");
			ht = data.getFiles();
			e = ht.elements();
			if (ht != null) {
				while (e.hasMoreElements()) {
					flag = true;
					file = e.nextElement();
					 pw.println("<br>"+file.toString());
				}
				pw.println("<h1> store</h2>");
			}
			if (!flag) {
				pw.println("<h1> not store</h1>");
			}

		} catch (UploadException uf) {
			uf.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
