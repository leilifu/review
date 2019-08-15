package com.weilianda.mapper;

import com.weilianda.pojo.NotificationRequest;
import com.weilianda.pojo.NotificationRequestExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface NotificationRequestMapper {
    int countByExample(NotificationRequestExample example);

    int deleteByExample(NotificationRequestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NotificationRequest record);

    int insertSelective(NotificationRequest record);

    List<NotificationRequest> selectByExampleWithBLOBs(NotificationRequestExample example);

    List<NotificationRequest> selectByExample(NotificationRequestExample example);

    NotificationRequest selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NotificationRequest record, @Param("example") NotificationRequestExample example);

    int updateByExampleWithBLOBs(@Param("record") NotificationRequest record, @Param("example") NotificationRequestExample example);

    int updateByExample(@Param("record") NotificationRequest record, @Param("example") NotificationRequestExample example);

    int updateByPrimaryKeySelective(NotificationRequest record);

    int updateByPrimaryKeyWithBLOBs(NotificationRequest record);

    int updateByPrimaryKey(NotificationRequest record);
}