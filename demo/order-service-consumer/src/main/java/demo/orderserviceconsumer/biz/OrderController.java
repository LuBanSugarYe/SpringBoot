package demo.orderserviceconsumer.biz;

import demo.gmallinterface.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author SugarYe
 * @date 2020年09月02日 17:03
 */
@Controller
public class OrderController {

   @Autowired
   OrderService orderService;

   @ResponseBody
   @RequestMapping("/order")
   public List<User> initOrder(){
       return orderService.initOrder();
   }
}
