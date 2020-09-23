package proxy2.dynamic.demo01;

import proxy2.dynamic.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/8/5 0005
 * @Time: 21:43
 * @Description: 动态代理处理类， 自动生成
 */
public class ProxyInvocationHandler implements InvocationHandler {
    /**
     * 被代理的接口
     */
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    /**
     * 生成得到代理类
     * @return 代理类
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        // 动态代理的本质使用反射
        Object result = method.invoke(rent, args);
        signContract();
        collectionCommission();
        return result;
    }

    private void seeHouse() {
        System.out.println("中介带看房服务");
    }

    private void signContract() {
        System.out.println("中介签订合同");
    }

    private void collectionCommission() {
        System.out.println("中介收取佣金");
    }
}
