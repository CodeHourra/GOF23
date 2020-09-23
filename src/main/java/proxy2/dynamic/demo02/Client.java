package proxy2.dynamic.demo02;

import proxy2.staticproxy.proxy02.UserService;
import proxy2.staticproxy.proxy02.UserServiceImpl;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/8/3 0003
 * @Time: 20:49
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        // 真实角色
        UserServiceImpl userService = new UserServiceImpl();
        // 代理
        // 传入处理角色
        ProxyUtil proxyInvocationHandler = new ProxyUtil(userService);
        UserService proxyLandlord = (UserService) proxyInvocationHandler.getProxy();
        proxyLandlord.addUser();
    }
}
