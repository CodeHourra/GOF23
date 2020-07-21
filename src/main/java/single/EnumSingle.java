package single;

import java.lang.reflect.Constructor;

/**
 * @author liugan83@gmail.com
 * @version V1.0
 * @date 2020/5/24 0024 12:18
 * @Description 枚举单例
 * enum 本身也是一个class类
 *
 * 反编译:
 * javap -p xxx.class
 * jad -sjava xxx.class
 */
public enum EnumSingle {
		/**
		 * 实例
		 */
		INSTANCE;
		
		public EnumSingle getInstance() {
				return INSTANCE;
		}
}

class Test {
		public static void main(String[] args) throws Exception {
				EnumSingle instance = EnumSingle.INSTANCE;
				EnumSingle instance2 = EnumSingle.INSTANCE;
				
				Constructor<EnumSingle> declaredConstructor = EnumSingle.class.getDeclaredConstructor(String.class, int.class);
				declaredConstructor.setAccessible(true);
				// java.lang.NoSuchMethodException: single.pattern.EnumSingle.<init>()
				EnumSingle enumSingle = declaredConstructor.newInstance();
				System.out.println(instance);
				System.out.println(instance2);
				System.out.println(enumSingle);
		}
}
