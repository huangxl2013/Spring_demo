package cn.com.itcast;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by huangxiaolong on 2017/9/8.
 */
public class UserTest1 {
    @Test
    public void getU(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
        user.add();
    }
}
