package com.zju.ina.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zju.ina.entity.Session;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

import java.util.List;

/**
 * @author 祝广程
 * @version 1.0
 */
@Mapper
public interface SessionMapper {
    @Select("SELECT * FROM session WHERE venue_id = #{venueID}")
    List<Session> getSessionsByVenueID(@Param("venueID") String venueID);

    @Insert("INSERT INTO session (session_id, venue_id, region, date, start_time, end_time, price, status) " +
            "VALUES (#{sessionID}, #{venueID}, #{region}, #{date}, #{startTime}, #{endTime}, #{price}, #{status})")
    int insertSession(Session session);
}
