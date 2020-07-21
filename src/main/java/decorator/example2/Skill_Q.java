package decorator.example2;

/**
 * @author liugan83@gmail.com
 * @version V1.0
 * @date 2019/11/18 21:23
 * @Description ConreteDecorator 技能：Q
 */
public class Skill_Q extends Skills{
		
		private String skillName;
		
		public Skill_Q(Hero hero, String skillName) {
				super(hero);
				this.skillName = skillName;
		}
		
		/**
		 * 学习技能
		 */
		@Override
		public void learnSkills() {
				System.out.println("学习了技能Q: " + skillName);
				super.learnSkills();
				this.addHp();
				this.addLevel(0);
		}
		
		/**
		 * 升级技能
		 *
		 * @param skill
		 */
		@Override
		public void addLevel(Integer skill) {
				super.addLevel(skill);
		}
		
		public void addHp() {
				System.out.println("生命值+100");
		}
}
