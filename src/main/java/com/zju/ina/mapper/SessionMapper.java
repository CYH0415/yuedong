package com.zju.ina.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zju.ina.entity.Session;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 祝广程
 * @version 1.0
 */
@Mapper
public interface SessionMapper {
    @Select("SELECT * FROM session WHERE venueID = #{venueID}")
    List<Session> getSessionsByVenueID(@Param("venueID") String venueID);
}
