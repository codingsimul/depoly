package com.springstudy.depoly;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicController {
    @GetMapping("/h")
    @ResponseBody
    public String h() {
        return "hello";
    }
}
