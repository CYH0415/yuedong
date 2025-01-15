package com.zju.ina.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zju.ina.entity.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 祝广程
 * @version 1.0
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
