package com.techacademy;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("/")
    public String index() {
        return "Hello SpringBoot!";
    }
    @GetMapping("dayofweek/{val1}")
    public String dispDayOfWeek(@PathVariable String val1) {
        LocalDate day = LocalDate.parse(val1,DateTimeFormatter.ofPattern("yyyyMMdd") );
        DayOfWeek x =day.getDayOfWeek();
        return "指定日：" +x.toString();
    }
}