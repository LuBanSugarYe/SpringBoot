package demo.userserviceprovider.biz;

import com.alibaba.dubbo.config.annotation.Service;
import demo.gmallinterface.pojo.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SugarYe
 * @date 2020年09月02日 8:04
 */
@Service
@Component
public class UserServiceImpl implements UserService  {
    @Override
    public List<User> getList() {
        //创建用户实例
        User user = new User();
        //
        user.setId(1);
        user.setUsername("zhang3");
        user.setPassword("123456");
        //
        List<User> list = new ArrayList<>();
        list.add(user);

        //返回值
        return list;
    }
}
