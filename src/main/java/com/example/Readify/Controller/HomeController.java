package com.example.Readify.Controller;

import com.example.Readify.Entity.LogInData;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/form")
    public String formLoad(Model model){
        model.addAttribute("loginData", new LogInData());
        return "form";
    }
    @PostMapping("/process")
    public String processLogin(@Valid @ModelAttribute("loginData") LogInData log, BindingResult result){

        if (result.hasErrors()){
            System.out.println(result);
        }

      return "sucess";
    }
}
