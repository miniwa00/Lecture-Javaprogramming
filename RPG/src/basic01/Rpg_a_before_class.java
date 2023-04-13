package basic01;

import java.util.Scanner;

public class Rpg_a_before_class {

	public static void main(String[] args) throws InterruptedException {
		String hero_name;
		int hero_hp = 80, hero_level =1, hero_power = 15, hero_defense = 25, hero_money = 0, hero_experience = 0;
		
//		String monster_name = "너구리";
//		int monster_hp = 100, monster_level =1, monster_power = 20, monster_defense = 5, monster_money = 10, monster_experience = 10;
		
		String monster_name = "살쾡이";
		int monster_hp = 2000, monster_level =5, monster_power = 100, monster_defense = 20, monster_money = 30, monster_experience = 50;
		
		// 영웅 이름 입력
		Scanner sc = new Scanner(System.in);
		System.out.printf("영웅의 이름을 입력하세요. : ");
		hero_name = sc.next();
		System.out.println("이름이 입력되었습니다.");
		System.out.println("게임에 입장하였습니다.");
		
		// 현재 상태 출력
		System.out.println("");
		System.out.println("*********************");
		System.out.println("현재 Hero의 이름 : " + hero_name);
		System.out.println("현재 " + hero_name + "의 레벨 : " + hero_level);
		System.out.println("현재 " + hero_name + "의 힘 : "+ hero_power);
		System.out.println("현재 " + hero_name + "의 방어럭 : " + hero_defense);
		System.out.println("현재 " + hero_name + "의 HP : " + hero_hp);
		System.out.println("현재 " +	hero_name + "의 경험치 : " + hero_experience);
		System.out.println("현재 " +	hero_name + "의 돈 : " + hero_money + "원");
		System.out.println("*********************");
		System.out.println("");
		System.out.println("사냥터에 입장하였습니다.");
		System.out.println("1. " + monster_name);
		
		// 전투 상대 선택
		System.out.printf("전투할 상대를 입력하세요. : ");
		int num = sc.nextInt();
		if (num == 1) {
			
		}
		else if (num == 2) {
			
		}
		
		System.out.println("");
		System.out.println("! " + monster_name + "와(과) 전투를 시작합니다. !");
		System.out.println("");
		
		Thread.sleep(2000);
		while (true) {
			// 몬스터 데미지 초기화
			int monster_damage = 0;
			monster_damage += hero_level * 10 + hero_power * 30;
			
			// 히어로 공격, 몬스터 방어
			if (monster_defense >= monster_damage)
				System.out.println(monster_name + "의 데미지는 0 입니다.");
			else 				
				monster_hp = monster_hp + monster_defense - monster_damage;
				System.out.println(monster_name + "(이)가 " + monster_damage + "의 데미지를 입었습니다.");
				if (monster_hp > 0)
					System.out.println("  - " + monster_name + "의 hp는 " + monster_hp + "입니다.");
				else {
					hero_experience += monster_experience;
					hero_money += monster_money;
					break;
				}
			
				// 몬스터 공격, 히어로 방어
			if (hero_defense >= monster_power)
				System.out.println(hero_name + "데미지는 0 입니다.");
			else 
				hero_hp = hero_hp + hero_defense - monster_power;
				System.out.println( hero_name + "(이)가 " + monster_power + "의 데미지를 입었습니다.");
				if (hero_hp > 0)
					System.out.println("  - " + hero_name + "의 hp는 " + hero_hp + "입니다.");
				else {
					System.out.println("ㅠㅠ " + hero_name + "이(가) 죽었습니다..." + " ㅠㅠ");
					hero_hp = 1;
					Thread.sleep(2000);
					System.out.println("");
					System.out.println("! 신의 은총을 받아 " + hero_name + "이(가) 부활했습니다. !");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					break;
				}

		}
		System.out.println("");
		Thread.sleep(2000);
		System.out.println("*********************");
		System.out.println("현재 Hero의 이름 : " + hero_name);
		System.out.println("현재 " + hero_name + "의 레벨 : " + hero_level);
		System.out.println("현재 " + hero_name + "의 힘 : "+ hero_power);
		System.out.println("현재 " + hero_name + "의 방어럭 : " + hero_defense);
		System.out.println("현재 " + hero_name + "의 HP : " + hero_hp);
		System.out.println("현재 " +	hero_name + "의 경험치 : " + hero_experience);
		System.out.println("현재 " +	hero_name + "의 돈 : " + hero_money + "원");
		System.out.println("*********************");
	}
}