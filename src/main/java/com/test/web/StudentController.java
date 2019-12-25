package com.test.web;

import com.alibaba.fastjson.JSON;
import com.test.pojo.Coerse;
import com.test.pojo.Student;
import com.test.pojo.Study;
import com.test.service.CoerseService;
import com.test.service.StudentService;
import com.test.service.StudyService;
import com.test.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @Autowired
    private CoerseService coerseService;

    @Autowired
    private StudyService studyService;

/*    @RequestMapping(value = "/chongxiu",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void query(HttpServletResponse response) throws IOException {
        List<Student> list = studentService.findAll();
        PrintWriter writer = response.getWriter();
        response.setCharacterEncoding( "utf-8");
        response.setContentType("text/xml;");
        response.setHeader("Content-Type", "application/json");
        writer.write(JSON.toJSONString(list));
        writer.close();
    }*/


      @RequestMapping(value = "/reBuild", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    //String name(前台传值得  key 相同)
    public List<Student> query() {
        List<Student> list = studentService.findAll();
        for (int i = 0; i < list.size(); i++) {
            Date cometime = list.get(i).getCometime();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String format = sdf.format(cometime);
            list.get(i).setComeTimeStr(format);
        }
        return list;
    }


    //修改前的查询
    @RequestMapping("/editFindByStuId")
    public String editFindByStuId(String stuId, ModelMap map) {
        Student student = studentService.selectStuByStuId(Integer.valueOf(stuId));
        //时间类型转化
        student.setComeTimeStr(DateUtils.dateFormat(student.getCometime(), "yyyy-MM-dd"));
        map.addAttribute("student", student);
        return "updateclass";
    }

    @ResponseBody
    @RequestMapping("/findAllcoerses")
    public List<Coerse> findAllcoerses() {
        List<Coerse> courses = coerseService.selectAll();
        return courses;
    }

    /*@ResponseBody
    @RequestMapping("/editStudy")
    public String editStudy(Study study){
        String message = "ERROR";
        try {
            //修改原有的状态为零 （false）
            studyService.updateByStata(study.getStudyId());
            //新增一条新的数据
            studyService.add(study);
            message = "SUCCESS";
        }catch (Exception e){
            System.err.println("网络问题！！！！");
            return message;
        }
        return message;
    }*/
    @RequestMapping("/editStudy")
    public String editStudy(Study study) {

        /*try {
            //修改原有的状态为零 （false）
            studyService.updateByStata(study.getStudyId());
            //新增一条新的数据
            studyService.add(study);

        }catch (Exception e){
            System.err.println("网络问题！！！！");

        }*/
        /*  System.out.println(1);*/
        return "redirect: /findAll";
    }

    @RequestMapping("/findAll")
    public String findAll(ModelMap map) {
        List<Student> list = studentService.findAll();

/*        for (int i = 0; i < list.size(); i++) {
            List<Coerse> coerses = list.get(i).getCoerses();
            String coerse ="";
            for (int j = 0; j < coerses.size(); j++) {
                coerse+=coerses.get(j).getcName()+"-";
            }
            coerse = coerse.substring(0,coerse.length()-1);
            list.get(i).setCoersees(coerse);

        }*/
        //System.out.println(list);
        map.put("Student", list);
        return "findAll";
    }

    /*
        @RequestMapping("/queryAll")
        public String queryAll(ModelMap map){
            List<Student> list = studyService.queryByStuId();
            map.put("Student",list);
            return "findAll";
        }*/
   /* @RequestMapping("/queryByStuId")
    public void queryByStuId(String stuId) {
        Integer integer = studyService.queryByStuId(stuId);
        studyService.updateByScount(integer);
    }*/

   @RequestMapping("/updateByStuId")
    public String updateByStuId(Integer stuId){
       studyService.updateByStuId(stuId);
        //重定向到查询方法
        return "redirect: /findAll";
    }



}
