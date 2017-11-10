package com.greenfoxacademy.peertopeerchat.controller;

import com.greenfoxacademy.peertopeerchat.model.ChatLog;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

@RestController
public class MainController {

    @RequestMapping(value = "/log", method = RequestMethod.GET)
    public ChatLog log(HttpServletRequest request){
        return new ChatLog();
    }
}
