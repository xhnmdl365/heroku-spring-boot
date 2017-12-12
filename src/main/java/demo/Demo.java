package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description
 * @Author Anthony
 * @Date 12/12/2017 11:42 AM
 */

@RestController

public class Demo {

	@RequestMapping(value = {"/", "/index"})
	public String hello() {
		return "hello word"; // redirects
	}
}
