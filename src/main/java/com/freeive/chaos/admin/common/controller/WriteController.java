package com.freeive.chaos.admin.common.controller;
//import java.util.List;
//import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import com.freeive.chaos.admin.WriteMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WriteController {

    @Autowired
    WriteMapper writeMapper;

    @RequestMapping(value="/write.do")
    public String boardInsert(HttpServletRequest req, Model model){
      return "write";
    }

    @RequestMapping(value="/write_ok.do", method=RequestMethod.POST)
    public String boardInsertOk(HttpServletRequest req, Model model) throws Exception {
        req.setCharacterEncoding("UTF-8");
        /*List<Map<String, Object>> course = writeMapper.selectEditor();
        model.addAttribute("category", course);
        return "write";*/
     
        //ModelAndView mav = new ModelAndView();

        String editor_seq = req.getParameter("editor_seq");
        String editor_title = req.getParameter("editor_title");
        String editor_contents = req.getParameter("editor_contents");

        Board board = new Board();
        board.setEditor_seq(editor_seq);
        board.setEditor_title(editor_title);
        board.setEditor_contents(editor_contents);

        writeMapper.insertEditor(board);
        req.setAttribute("editor_title", editor_title);
        req.setAttribute("editor_contents", editor_contents);

        //List<Map<String, Object>> list = writeMapper.selectEditor();
        model.addAttribute("editor", req);
        
		    return "list";
    }


}
