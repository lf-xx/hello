package com.test.service.impl;

import com.test.dao.CoerseMapper;
import com.test.pojo.Coerse;
import com.test.service.CoerseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoerseServiceImpl implements CoerseService {

    @Autowired
    private CoerseMapper coerseMapper;

    @Override
    public List<Coerse> selectAll() {
        return coerseMapper.selectAll();
    }
}
