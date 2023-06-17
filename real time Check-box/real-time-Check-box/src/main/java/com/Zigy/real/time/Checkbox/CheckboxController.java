package com.Zigy.real.time.Checkbox;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class CheckboxController {


        @RequestMapping("/1")
        public String getPage1(ModelMap model) {
            // Add logic to populate the model with necessary data
            return "page1"; // Return the name of the HTML template for this page
        }

//        @PostMapping("/2")
//        public String getPage2(@RequestParam Map<String, String> formData, Model model) {
//            // Process the form data and store it in a suitable data structure
//            // e.g., a List or Map
//            model.addAttribute("formData", formData);
//            return "page2";
//        }


}
