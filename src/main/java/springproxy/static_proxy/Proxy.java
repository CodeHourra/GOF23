package springproxy.static_proxy;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/8/3 0003
 * @Time: 20:50
 * @Description: 代理角色 -- 中介
 */
public class Proxy implements Rent {

    private Landlord landlord;

    public Proxy(Landlord landlord) {
        this.landlord = landlord;
    }

    public Proxy() {}

    /**
     * 出租
     */
    @Override
    public void rent() {
        seeHouse();
        this.landlord.rent();
        signContract();
        collectionCommission();
        System.out.println("交易完成");
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
