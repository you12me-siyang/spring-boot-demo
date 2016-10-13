package sy.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {
	
	@RequestMapping("/common/test")
	public String test(){
		return "success";
	}

}
