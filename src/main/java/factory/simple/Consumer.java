package factory.simple;

import java.util.Optional;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/5/30 0030
 * @Time: 21:24
 * @Description:
 */
public class Consumer {
    public static void main(String[] args) {
//        Tesla tesla = new Tesla();
//        Wuling wuling = new Wuling();
//        tesla.name();
//        wuling.name();

        Optional<Car> car = CarFactory.getCar(FactoryKey.WULING);
        car.get().name();
    }
}
