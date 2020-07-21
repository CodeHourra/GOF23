package decorator.example2;

/**
 * @author Liugan
 * Component 英雄接口
 */
public interface Hero {
		/**
		 * 学习技能
		 */
		void learnSkills();
		
		/**
		 * 升级技能
		 * @param skill
		 */
		void addLevel(Integer skill);
}
