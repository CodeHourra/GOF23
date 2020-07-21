package decorator.example2;

/**
 * @author liugan83@gmail.com
 * @version V1.0
 * @date 2019/11/18 21:20
 * @Description Decorator 技能栏
 */
public class Skills implements Hero{
		
		/**
		 * 持有一个一个英雄对象接口
		 */
		private Hero hero;
		
		public Skills(Hero hero) {
				this.hero = hero;
		}
		
		/**
		 * 学习技能
		 */
		@Override
		public void learnSkills() {
			if (hero != null) {
					hero.learnSkills();
			}
		}
		
		/**
		 * 升级技能
		 *
		 * @param skill
		 */
		@Override
		public void addLevel(Integer skill) {
				hero.addLevel(skill);
		}
}
