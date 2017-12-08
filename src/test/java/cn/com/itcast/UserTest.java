package cn.com.itcast;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by huangxiaolong on 2017/9/8.
 */
//创建测试类
public class UserTest {
    @Test
    public void getU(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
        user.add();
        System.out.println(user);
    }
}
