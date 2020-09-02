package demo.orderserviceconsumer.biz;

import com.alibaba.dubbo.config.annotation.Reference;
import demo.gmallinterface.pojo.User;
import demo.userserviceprovider.biz.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author SugarYe
 * @date 2020年09月02日 16:55
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    UserService userService;

    @Override
    public List<User> initOrder() {
        //调用远程方法
        return userService.getList();
    }
}
