package com.annguyen;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	private static final String UPLOAD_DIRECTORY = "/images";

	@RequestMapping(value= "/uploadform")
	public ModelAndView uploadForm() { // ModelAndView giong String nhung khong bang String (tu 3.0)
		return new ModelAndView("uploadform");
	}

	@RequestMapping(value = "/savefile", method = RequestMethod.POST)
	public ModelAndView saveimage(@RequestParam CommonsMultipartFile file, HttpSession session) throws Exception {

		ServletContext context = session.getServletContext();
		//String path = context.getRealPath(UPLOAD_DIRECTORY);
		String path = "D:/HK119/JAVA/TuHoc/Spring_MVC/tutoral_javatpoint(noi_dung_chu_yeu)" + UPLOAD_DIRECTORY;
		String filename = file.getOriginalFilename();

		System.out.println("URL: " + path + "/" + filename);
		System.out.println("context: " + context);

		byte[] bytes = file.getBytes();
		BufferedOutputStream stream = new BufferedOutputStream(
				new FileOutputStream(new File(path + File.separator + filename)));
		stream.write(bytes);
		stream.flush();
		stream.close();

		return new ModelAndView("uploadform", "filesuccess", "File successfully saved!");
	}
}
