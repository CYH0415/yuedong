package com.zju.ina.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zju.ina.entity.Venue;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 祝广程
 * @version 1.0
 */
@Mapper
public interface VenueMapper {
    @Select("SELECT * FROM venue WHERE venue_id = #{venueID}")
    Venue getVenueByVenueID(@Param("venueID") String venueID);
    // 模糊搜索场馆信息
    @Select("SELECT * FROM venue WHERE venue_name LIKE CONCAT('%', #{searchInfo}, '%')")
    List<Venue> searchVenues(@Param("searchInfo") String searchInfo);
}