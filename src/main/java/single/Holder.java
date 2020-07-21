package single;

/**
 * @author liugan83@gmail.com
 * @version V1.0
 * @date 2020/5/24 0024 11:30
 * @Description 静态内部类单例
 */
public class Holder {
		private Holder() {}
		
		public static Holder getInstance() {
				return InnerClass.HOLDER;
		}
		
		public static class InnerClass {
				private static Holder HOLDER = new Holder();
		}
}
