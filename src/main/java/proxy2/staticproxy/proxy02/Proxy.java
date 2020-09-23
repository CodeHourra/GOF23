package proxy2.staticproxy.proxy02;
/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/8/3 0003
 * @Time: 21:28
 * @Description:
 */
public class Proxy implements UserService {
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void addUser() {
        logMethod("addUser");
        userService.addUser();
    }

    @Override
    public void deleteUser() {
        logMethod("deleteUser");
        userService.deleteUser();
    }

    @Override
    public void queryUser() {
        logMethod("queryUser");
        userService.queryUser();
    }

    @Override
    public void updateUser() {
        logMethod("updateUser");
        userService.updateUser();
    }

    private void logMethod(String msg) {
        System.out.println("执行了" + msg + "方法");
    }
}
