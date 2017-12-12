package com.freeive.chaos.admin;

import java.util.List;
//import java.util.Map;
import java.util.Map;


public interface WriteMapper {
    <Board> List<Board> selectEditor(Board board) throws Exception;
    public List<Map<String, Object>> selectEditor();

    <Board> List<Board> insertEditor(Board board) throws Exception;
    public List<Map<String, Object>> insertEditor();
   
}
