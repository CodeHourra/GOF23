package springproxy.static_proxy02;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/8/3 0003
 * @Time: 21:31
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        Proxy proxy = new Proxy();
        proxy.setUserService(userService);
        proxy.addUser();
    }
}
