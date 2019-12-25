package com.test.dao;
import com.test.pojo.Coerse;
import com.test.pojo.Student;

import java.util.List;

public interface CoerseMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Coerse record);

    int insertSelective(Coerse record);

    Coerse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Coerse record);

    int updateByPrimaryKey(Coerse record);


    public List<Coerse> selectAll();
}