package decorator.example1;

/**
 * @author liugan83@gmail.com
 * @version V1.0
 * @date 2019/11/14 22:05
 * @Description Decorator类
 */
public class Finery extends Person {
		protected Human human;
		
		/**
		 * 打扮
		 * @param human
		 */
		public Finery(Human human) {
				this.human = human;
		}
		/**
		 * 着装搭配方法
		 */
		@Override
		public void show() {
			if (this.human != null) {
					human.show();
			}
		}
}
