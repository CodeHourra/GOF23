package proxy2.dynamic.demo02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/8/5 0005
 * @Time: 22:13
 * @Description: 通用动态代理类
 */
public class ProxyUtil implements InvocationHandler {
    private Object target;

    public ProxyUtil(Object target) {
        this.target = target;
    }

    public ProxyUtil() {
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeLog(method.getName());
        Object invoke = method.invoke(target, args);
        afterLog(method.getName());
        return invoke;
    }

    private void beforeLog(String methodName) {
        System.out.println(methodName + " 方法被调用前");
    }

    private void afterLog(String methodName) {
        System.out.println(methodName + " 方法被调用后");
    }
}
