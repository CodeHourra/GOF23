package decorator.example2;

/**
 * @author liugan83@gmail.com
 * @version V1.0
 * @date 2019/11/18 21:23
 * @Description ConreteDecorator 技能：W
 */
public class Skill_W extends Skills{
		
		private String skillName;
		
		public Skill_W(Hero hero, String skillName) {
				super(hero);
				this.skillName = skillName;
		}
		
		/**
		 * 学习技能
		 */
		@Override
		public void learnSkills() {
				System.out.println("学习了技能W: " + skillName);
				super.learnSkills();
				this.addLevel(1);
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
}
