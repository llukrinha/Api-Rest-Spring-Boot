package br.com.alura.forum.controller;

import br.com.alura.forum.ForumApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {
	
	public static void main(String[] args){
        SpringApplication.run(ForumApplication.class, args);
    }

}
