package decorator.example2;

/**
 * @author liugan83@gmail.com
 * @version V1.0
 * @date 2019/11/18 21:27
 * @Description 客户端: 召唤师
 */
public class Player {
		public static void main(String[] args) {
				// 选择英雄
				Hero hero = new BlindMonk("李青");
				
				Skills q = new Skill_Q(hero, "天音波/回音击");
				Skills q1 = new Skill_Q(q, "天音波/回音击");
				Skills w = new Skill_W(q1, "金钟罩/铁布衫");
				Skills e = new Skill_E(w,"天雷破/摧筋断骨");
				Skills r = new Skill_R(e,"猛龙摆尾");
				
				r.learnSkills();
		}
}
