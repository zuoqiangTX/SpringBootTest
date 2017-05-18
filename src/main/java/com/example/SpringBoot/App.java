package com.example.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Hello world!
 *
 */

@RestController
@EnableAutoConfiguration
public class App 
{	
	@RequestMapping("/h")
    public String home() {
      return "Hello world";
    }
     
	@RequestMapping("/")
	public String test(ModelMap map){
        map.addAttribute("host", "My test");
		return "index";
	}

    @RequestMapping("/hello")
    public String test2(ModelMap map){
        map.addAttribute("host", "My test");
        return "helloworld";
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(App.class, args);
    }
}
