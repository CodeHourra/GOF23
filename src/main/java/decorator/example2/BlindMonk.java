package decorator.example2;

import java.util.Arrays;
import java.util.List;

/**
 * @author liugan83@gmail.com
 * @version V1.0
 * @date 2019/11/18 21:17
 * @Description ConcreteComponent 具体英雄盲僧
 */
public class BlindMonk implements Hero{

		private String name;
		
		private List<Integer> levels;
		
		public BlindMonk(String name) {
				this.name = name;
				this.levels = Arrays.asList(0, 0, 0, 0);
		}

		/**
		 * 学习技能
		 */
		@Override
		public void learnSkills() {
				System.out.println(name + "学习了以上技能");
		}
		
		/**
		 * 升级
		 * @param skill
		 */
		@Override
		public void addLevel(Integer skill) {
				int l = this.levels.get(skill) + 1;
				this.levels.set(skill, l);
				System.out.println("当前技能等级为: " + this.levels.toString());
		}
		
}
