package com.niit.entity;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.servlet.http.Part;

@ManagedBean(name = "fileUploadBean")
@ViewScoped
public class FileUploadBean {
	private Part file;
	private String filename;
	private String path;
	private String url;
	private String message;

	public void uploadFile() throws IOException {
		String sep = File.separator;
		InputStream inputStream = null;
		OutputStream outputStream = null;
		File outputFile = null;
		File sourceFile = null;

		FacesContext context = FacesContext.getCurrentInstance();
		ServletContext servletContext = (ServletContext) context.getExternalContext().getContext();

		String path = servletContext.getRealPath("");
		System.out.println("path:" + path);
		boolean fileSuccess = false;
		if (file.getSize() > 0) {
			String srcFileName = GetFileName.getFileNameFromPart(file);
			System.out.println("srcFileName:" + srcFileName);
			sourceFile = new File(srcFileName);

			String targetFileName = path + "resource" + sep + "image" + sep + sourceFile.getName();
			System.out.println("targetFileName:" + targetFileName);
			outputFile = new File(targetFileName);

			inputStream = file.getInputStream();
			outputStream = new FileOutputStream(outputFile);
			byte[] buffer = new byte[1024];
			int bytesRead = 0;

			while ((bytesRead = inputStream.read(buffer)) != -1) {
				outputStream.write(buffer, 0, bytesRead);
			}
			if (outputStream != null) {
				outputStream.close();
			}
			if (inputStream != null) {
				inputStream.close();
			}
			fileSuccess = true;
		}
		if (fileSuccess) {
			System.out.println("Í¼Æ¬µØÖ·£º" + outputFile.getPath());
			setMessage("Í¼Æ¬µØÖ·£º" + outputFile.getPath());
			setFilename(outputFile.getName());
			setPath(outputFile.getPath());
			setUrl("." + sep + "resource" + sep + "image" + sep + outputFile.getName());
		} else {
			setMessage("´íÎó£¬ÇëÑ¡ÔñÎÄ¼þ£¡");
		}
	}

	public Part getFile() {
		return file;
	}

	public void setFile(Part file) {
		this.file = file;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
