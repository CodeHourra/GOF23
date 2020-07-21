package decorator.example1;

/**
 * @author liugan83@gmail.com
 * @version V1.0
 * @date 2019/11/14 23:00
 * @Description TODO
 */
public abstract class Human {
		protected String name;
		
		/**
		 * 打扮
		 */
		public abstract void show();
		
		public String getName() {
				return name;
		}
}
