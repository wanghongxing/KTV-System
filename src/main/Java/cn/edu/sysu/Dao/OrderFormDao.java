package cn.edu.sysu.Dao;

import cn.edu.sysu.Entity.OrderForm;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Project name: KTV-System
 * Package name: cn.edu.sysu.Dao
 * Created by Houben on 2018/4/10
 * Description:OrderForm（订单）数据访问接口
 */
public interface OrderFormDao {
    /**
     * 新增一个订单
     *
     * @param OrderForm 将要被增加的订单
     */
    void addOrderForm(OrderForm OrderForm);

    /**
     * 根据主键删除一个订单
     *
     * @param orderTime 下订单的时间
     * @param room      下订单的房间号
     */
    void deleteOrderForm(@Param("orderTime") Date orderTime, @Param("room") String room);

    /**
     * 查询一个vip客户的所有订单信息
     *
     * @param vipphone 查询的vip的电话号码
     * @return 该vip所有订单信息列表
     */
    List<OrderForm> queryOrderFormByVIP(String vipphone);

    /**
     * 查询已付费（未付费）的所有订单
     *
     * @param pay 是否付块信息
     * @return 未付费的所有订单列表
     */
    List<OrderForm> queryOrderFormByPay(int pay);

    /**
     * 根据主键把一个订单的状态设置为已支付
     *
     * @param orderTime 下订单的时间
     * @param room      下订单的房间
     */
    void payOrder(@Param("orderTime") Date orderTime, @Param("room") String room);

}
