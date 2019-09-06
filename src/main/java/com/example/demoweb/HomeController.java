package com.example.demoweb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.HttpURLConnection;
import java.net.URL;


@RestController
public class HomeController {
    @RequestMapping("/")
    public String home(String text){
        try {
            URL url = new URL("localhost:8080");
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("POST");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return text;
    }
}
