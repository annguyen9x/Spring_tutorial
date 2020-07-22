package com.annguyen;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@RequestMapping("/hello2")
	//HttpServletRequest được sử dụng để đọc dữ liệu biểu mẫu HTML do người dùng cung cấp
	//Có thể dùng thay "HttpServletRequest" bằng @RequestParam được sử dụng để đọc dữ liệu
	//biểu mẫu HTML do người dùng cung cấp và "liên kết nó với tham số yêu cầu".
	public String display(@RequestParam("name") String name, @RequestParam("pass") String pass, Model model) {
		
		//Read the provided(cung cấp) form data
//		String name = req.getParameter("name");
//		String passWord = req.getParameter("pass");
		String message = "";
		
		//Giả sử tên = admin thì đăng nhập đúng
		if(name.equals("admin")) {
			
			//add message to the model
			message = "Đăng nhập thành công. Hello: " + name;
			model.addAttribute("message", message);
			return "viewpage";
		}
		else {
			
			//add message to model
			message = "Đăng nhập thất bại. Tên tài khoản hoặc mật khẩu không đúng !";
			model.addAttribute("message", message);
			return "errorpage";
		}
	}
}
