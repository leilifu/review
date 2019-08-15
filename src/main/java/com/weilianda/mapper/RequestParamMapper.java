package com.weilianda.mapper;

import com.weilianda.pojo.RequestParam;
import com.weilianda.pojo.RequestParamExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface RequestParamMapper {
    int countByExample(RequestParamExample example);

    int deleteByExample(RequestParamExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RequestParam record);

    int insertSelective(RequestParam record);

    List<RequestParam> selectByExample(RequestParamExample example);

    RequestParam selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RequestParam record, @Param("example") RequestParamExample example);

    int updateByExample(@Param("record") RequestParam record, @Param("example") RequestParamExample example);

    int updateByPrimaryKeySelective(RequestParam record);

    int updateByPrimaryKey(RequestParam record);
}