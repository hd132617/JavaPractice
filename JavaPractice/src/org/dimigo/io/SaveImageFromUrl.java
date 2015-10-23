package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class SaveImageFromUrl {

	public static void main(String[] args) {
		
		String imageUrl = "http://dimigo.in/data/file/main_img/1822611405_OZW6uB9Q_EC9E94EBA598.png";

		try {
			URL url = new URL(imageUrl);
			
			try(InputStream is =url.openStream();
					OutputStream os = new FileOutputStream("files/logo.png")) {
				
				int result;
				while((result = is.read()) != -1){
					os.write(result);
				}
				
			}
			
			
			
			System.out.println("생성 완료!");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
