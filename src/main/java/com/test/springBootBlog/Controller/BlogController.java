package com.test.springBootBlog.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BlogController {
    @GetMapping("/")//просто слэш это главная страница.отслеживаем главную стр аннотация
    public String home( Model model) {//будет вызываться при переходе на гл стр
        model.addAttribute("title","Главная страница");//передаем определенные данные внутрь шаблона
        return "home"; //при переходе на глав стр будет вызван шаблон home
    }

        @GetMapping("/about")
        public String blog1(Model model){
        model.addAttribute("title"," страница о  нас");
            return "about";
        }
}