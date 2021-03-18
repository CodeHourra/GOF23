package single;

import java.lang.reflect.Constructor;

/**
 * @author liugan83@gmail.com
 * @version V1.0
 * @date 2020/5/24 0024 10:38
 * @Description 懒汉式单例
 */
public class LazyMen {

    /**
     * 避免指令重排
     */
    private volatile static LazyMen LAZYMEN;

    /**
     * 红绿灯 标志位
     */
    private static boolean created = false;

    /**
     * 1. 私有化构造器
     */
    private LazyMen() {
        // 禁止使用反射破环单例
        synchronized (LazyMen.class) {
            if (created == false) {
                created = true;
            } else {
                throw new RuntimeException("禁止使用反射破环单例");
            }
        }
        System.out.println(Thread.currentThread().getName() + " start");
    }


    /**
     * 返回对象实例
     * 该方法多线程下不安全, 会存在new 多个对象的情况
     *
     * @return
     */
    public static LazyMen getInstance() {
        if (LAZYMEN == null) {
            LAZYMEN = new LazyMen();
        }
        return LAZYMEN;
    }

    /**
     * DCL懒汉式 双重检查锁
     *
     * @return
     */
    public static LazyMen getInstance2() {
        if (LAZYMEN == null) {
            synchronized (LazyMen.class) {
                if (LAZYMEN == null) {
                    LAZYMEN = new LazyMen();
                    /**
                     * new LazyMen()并非原子性操作, 执行时分为3步
                     * 1. 分配内存空间
                     * 2. 执行构造方法, 初始化
                     * 3. 把这个对象指向内存空间
                     *
                     * 这三步操作可能会发生指令重排现象
                     * 期望步骤123
                     * 实际执行 132
                     *              A线程
                     *              B线程 -> 此时LazyMen未完成构造, 但是内存已经有指向了
                     */
                }
            }
        }
        return LAZYMEN;
    }

    public static void main(String[] args) throws Exception {
//				LazyMen lazyMen = LazyMen.getInstance2();
        // 反射可以破环DCL懒汉单例
        //Field created = LazyMen.class.getDeclaredField("created");
        //created.setAccessible(true);


        Constructor<LazyMen> lazyMenConstructor = LazyMen.class.getDeclaredConstructor((Class<?>) null);

        lazyMenConstructor.setAccessible(true);
        LazyMen lazyMen1 = lazyMenConstructor.newInstance();
        //created.set(lazyMen1, false);
        //LazyMen lazyMen2 = lazyMenConstructor.newInstance();
        //
        //System.out.println(lazyMen2);
        //System.out.println(lazyMen1);

        //ExecutorService executorService = ThreadPoolUtil.getExecutorService("LazyMen-thread");
        //
        //for (int i = 0; i < 10; i++) {
        //    executorService.execute(() -> {
        //        System.out.println(LazyMen.getInstance2());
        //    });
        //}
        //executorService.shutdown();
    }
}
