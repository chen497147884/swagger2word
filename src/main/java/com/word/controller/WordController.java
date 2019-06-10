package com.word.controller;

import com.word.dto.Table;
import com.word.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.List;

/**
 * Created by XiuYin.Cui on 2018/1/11.
 */
@Controller
public class WordController {

    @Autowired
    private WordService tableService;

    @RequestMapping("/getWord")
    public String getJson(Model model){
        List<Table> list = tableService.tableList();
        model.addAttribute("table",list);
        return "word";
    }
    @RequestMapping("/getIstarWord")
    public String getIstarJson(Model model, @RequestParam("mySwaggerUrl") String url){
        try {
            url = URLDecoder.decode(url,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        List<Table> list = tableService.tableList(url);
        model.addAttribute("table",list);
        return "word";
    }
}
