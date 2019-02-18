package com.cr.test.mapper;

import com.cr.test.pojo.Classs;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface ClasssMapper {

    public Classs getById(String id);
}
