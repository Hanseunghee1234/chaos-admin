package com.freeive.chaos.admin;

import java.util.List;
import java.util.Map;


public interface TestMapper {

   public List<Map<String, Object>> selectCourse() throws Exception;
   public List<Object> selectCourse2() throws Exception;

}