package com.freeive.chaos.admin.common.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.freeive.chaos.admin.TestMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class TestController {

    @Autowired
    TestMapper testMapper;
    @RequestMapping(value="/curriculum_list", method=RequestMethod.GET)
    //@ResponseBody
    public String ddddd2(Model model) throws Exception {
        List<Map<String, Object>> course = testMapper.selectCourse();       
        model.addAttribute("category", course);

        return "sh";
    }
    
    @RequestMapping(value="/curriculum_list_data", method=RequestMethod.POST, produces="application/json; charset=utf8")   
    @ResponseBody 
    public List<Map<String, Object>> ffff2(Model model) throws Exception {
        Map<String, Object> result = new HashMap<String, Object>();
        List<Map<String, Object>> course = testMapper.selectCourse();

        result.put("category_name", course.get(0).get("category_name")) ;

        return course;
    }

}