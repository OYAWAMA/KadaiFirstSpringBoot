package com.techacademy;

import java.time.DayOfWeek;
import java.time.LocalDate;
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
        LocalDate DAY = LocalDate.parse(val1,DateTimeFormatter.ofPattern("yyyyMMdd") );
        DayOfWeek DAYOFWEEK =DAY.getDayOfWeek();
        return "指定日：" + DAYOFWEEK.toString().substring(0,1)+DAYOFWEEK.toString().substring(1).toLowerCase();
    }
    @GetMapping("plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        return "計算結果：" + res;
    }
    @GetMapping("minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 - val2;
        return "計算結果：" + res;
    }
    @GetMapping("times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 * val2;
        return "計算結果：" + res;
    }
    @GetMapping("divide/{val1}/{val2}")
    public String calcDivide(@PathVariable float val1, @PathVariable int val2) {
        float res = 0;
        res = val1 / val2;
        return "計算結果：" + res;
    }
}