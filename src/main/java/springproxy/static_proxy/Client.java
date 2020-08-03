package springproxy.static_proxy;

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
        Landlord landlord = new Landlord();
        Proxy proxy = new Proxy(landlord);
        proxy.rent();
    }
}
