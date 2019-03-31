package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConverterController {
    @GetMapping("/result")
    public String getConverted(@RequestParam(name="USD")float USD , Model model){
         float VND = USD * 23255;
        model.addAttribute("USD",USD);
        model.addAttribute("VND",VND);
        return "result";
    }
    @GetMapping("/converter")
    public String home(){
        return "index";
    }

}
