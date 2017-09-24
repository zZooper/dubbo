import com.zZooper.model.User;
import com.zZooper.service.UserService;
import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class Test {
    private Logger logger = Logger.getLogger(Test.class);
    @Resource
    private UserService userService;

    @org.junit.Test
    public void test(){
        User user = userService.queryByUserName("xiaoming");
        logger.info("用户名为:"+user.getUsername()+"的密码是:"+user.getPassword());
        System.out.println(user.getPassword());
    }
}
