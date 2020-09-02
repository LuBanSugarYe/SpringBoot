package demo.userserviceprovider.biz;

import demo.gmallinterface.pojo.User;

import java.util.List;

/**
 * @author SugarYe
 * @date 2020年09月02日 8:05
 */
public interface UserService {
   //查询用户信息
   List<User> getList();
}
