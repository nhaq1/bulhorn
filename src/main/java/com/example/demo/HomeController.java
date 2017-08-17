package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by oracle on 8/16/17.
 */

@Controller
public class HomeController {

    @Autowired
    MessageRepository messageRepository;

    @RequestMapping("/")
    public String mainPage(Model model){
        model.addAttribute("messages", messageRepository.findAll());

        return "index";
    }

    @GetMapping("/add")
    public String addMessage(Model model){
        model.addAttribute("message", new Message());
        return "messageform";

    }

    @PostMapping("/process")
    public String processForm(Message message){
        messageRepository.save(message);
        return "redirect:/";

    }

}
