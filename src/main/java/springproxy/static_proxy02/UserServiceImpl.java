package springproxy.static_proxy02;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/8/3 0003
 * @Time: 21:27
 * @Description:
 */
public class UserServiceImpl implements UserService{
    @Override
    public void addUser() {
        System.out.println("增加用户");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除用户");
    }

    @Override
    public void queryUser() {
        System.out.println("查询用户");
    }

    @Override
    public void updateUser() {
        System.out.println("更新用户");
    }
}
