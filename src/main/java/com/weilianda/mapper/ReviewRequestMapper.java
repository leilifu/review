package com.weilianda.mapper;

import com.weilianda.pojo.ReviewRequest;
import com.weilianda.pojo.ReviewRequestExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface ReviewRequestMapper {
    int countByExample(ReviewRequestExample example);

    int deleteByExample(ReviewRequestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ReviewRequest record);

    int insertSelective(ReviewRequest record);

    List<ReviewRequest> selectByExampleWithBLOBs(ReviewRequestExample example);

    List<ReviewRequest> selectByExample(ReviewRequestExample example);

    ReviewRequest selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ReviewRequest record, @Param("example") ReviewRequestExample example);

    int updateByExampleWithBLOBs(@Param("record") ReviewRequest record, @Param("example") ReviewRequestExample example);

    int updateByExample(@Param("record") ReviewRequest record, @Param("example") ReviewRequestExample example);

    int updateByPrimaryKeySelective(ReviewRequest record);

    int updateByPrimaryKeyWithBLOBs(ReviewRequest record);

    int updateByPrimaryKey(ReviewRequest record);
}