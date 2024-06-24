package com.example.Receipt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


@RequestMapping("/")
public String index(Model model) {
    
    String name = "tobaco";
    String itemName = "batata";
    double price = 5.25;
    String description = "Metal strips, also an illustration of nanoseconds.";
    String vendor = "Little Things Corner Store";
    
	// Your code here! Add values to the view model to be rendered
    model.addAttribute("name",name);
    model.addAttribute("item",itemName);
    model.addAttribute("price",price);
    model.addAttribute("desc",description);
    model.addAttribute("vend",vendor);

    return "index.jsp";
}
//...


}
