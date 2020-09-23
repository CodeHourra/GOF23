package proxy2.staticproxy.proxy01;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/8/3 0003
 * @Time: 20:48
 * @Description: 房东
 */
public class Landlord implements Rent {

    /**
     * 出租
     */
    @Override
    public void rent() {
        System.out.println("房东要出租房子！");
    }
}
