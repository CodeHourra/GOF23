package decorator.example1;

/**
 * @author liugan83@gmail.com
 * @version V1.0
 * @date 2019/11/14 22:58
 * @Description TODO
 */
public class Person extends Human {
		
		public Person(String name) {
				this.name = "装扮的" + name;
		}
		
		public Person() {
		}
		
		/**
		 * 打扮
		 */
		@Override
		public void show() {
				System.out.print(this.name);
		}
}
