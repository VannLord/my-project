package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConverterController {
    @GetMapping("/result")
    public String getConverted(@RequestParam(name="dollar")String name , Model model){
         float dong = Float.parseFloat(name) * 23255;
        model.addAttribute("USD",name);
        model.addAttribute("VND",dong);
        return "result";
    }
    @GetMapping("/converter")
    public String home(){
        return "index";
    }

}
