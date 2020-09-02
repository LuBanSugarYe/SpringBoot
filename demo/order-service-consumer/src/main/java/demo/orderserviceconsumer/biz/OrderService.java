package demo.orderserviceconsumer.biz;

import demo.gmallinterface.pojo.User;

import java.util.List;

public interface OrderService {
    //初始化订单消息
    List<User> initOrder();
}
