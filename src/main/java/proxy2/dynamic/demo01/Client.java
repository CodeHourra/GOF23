package proxy2.dynamic.demo01;

import proxy2.dynamic.Landlord;
import proxy2.dynamic.Rent;

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
        Landlord landlord = new Landlord();

        // 代理
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        // 传入处理角色
        proxyInvocationHandler.setRent(landlord);
        Rent proxyLandlord = (Rent) proxyInvocationHandler.getProxy();
        proxyLandlord.rent();
    }
}
