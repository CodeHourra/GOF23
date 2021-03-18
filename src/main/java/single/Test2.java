package single;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> singleClass = Class.forName("single.Hungry");
        Constructor<?> declaredConstructor = singleClass.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        Object o = declaredConstructor.newInstance();
        System.out.println("o = " + o);

        //ExecutorService executorService = ThreadPoolUtil.getExecutorService("HUNGRY-thread");
        //
        //for (int i = 0; i < 10; i++) {
        //    executorService.execute(() -> {
        //        System.out.println(Hungry.getInstance());
        //    });
        //}
        //executorService.shutdown();
    }
}
