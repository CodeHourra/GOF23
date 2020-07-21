package factory.simple;

import java.util.Optional;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Liugan
 * @Date: 2020/5/30 0030
 * @Time: 21:26
 * @Description: 简单工厂模式 静态工厂模式
 */
public class CarFactory {
    /**
     * 方法一： 静态工程
     * @param car 实例名称
     * @return 对应的实例
     */
    public static Optional<Car> getCar(FactoryKey car) {
        if (FactoryKey.WULING.equals(car)) {
            return Optional.of(new Wuling());
        }
        if (FactoryKey.TESLA.equals(car)) {
            return Optional.of(new Tesla());
        }
        return Optional.empty();
    }
    // 方法二
    public Car getWuling() {
        return new Wuling();
    }

    public Car getTesla() {
        return new Tesla();
    }
}
