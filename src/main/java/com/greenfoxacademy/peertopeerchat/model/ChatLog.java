package com.greenfoxacademy.peertopeerchat.model;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import javax.servlet.http.HttpServletRequest;


public class ChatLog{

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss:SSS")
    LocalDateTime loca;
    String path;
    String method;

    public ChatLog() {
    }


    public ChatLog(HttpServletRequest request, LocalDateTime loca, String path, String method) {
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public LocalDateTime getLoca() {
        return loca;
    }

    public void setLoca(LocalDateTime loca) {
        this.loca = loca;
    }
}
