package basic01;

import java.util.Scanner;

public class Rpg_b_before_class {

	static int hero_level, hero_power, hero_hp, hero_defense, hero_mp, hero_experience, hero_money;
	static int monster_hp, monster_defense, monster_power, monster_mp, monster_level, monster_experience, monster_money;
	static String hero_name, monster_name;
	
	static int hero_attack() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		// 히어로 공격 처리
		while (true) {
			System.out.println("\n~~~ 스킬 리스트 ~~~");
			System.out.println("1. 쓰러스트");
			System.out.println("2. 전광석화 (현재 지원 않음)");
			System.out.println("3. 다크포스 (현재 지원 않음)");
			System.out.printf("\n어떤 스킬을 사용하시겠습니까? : ");
			int attack_num = sc.nextInt();
			if (attack_num == 1) {
				System.out.println("\n!!! 쓰러스트 !!!\n");
				break;
			} 
			else
				System.out.println("> 지금은 지원하지 않는 기능입니다.");
		}
		int monster_damage = 0;
		monster_damage += hero_level * 10 + hero_power * 30;
		Thread.sleep(1500);
		System.out.println(monster_name + "에게 " + monster_damage + "만큼의 데미지가 들어갔습니다.");
		return monster_damage;
	}
	static int monster_attack() throws InterruptedException {
		// 몬스터 공격 처리
		Thread.sleep(1500);
		System.out.println(hero_name + "에게 " + monster_power + "만큼의 데미지가 들어갔습니다.");
		return monster_power;
	}
	static void hero_attacked(int hero_damage) {   // monster_attack에 hero_damage 리턴값이 바뀌면 내용이 달라질 수 있다.
		// 히어로 방어 처리
		if (hero_defense >= monster_power) {
			hero_hp = hero_hp - 0;
		}
		else {
			hero_hp = hero_hp + hero_defense - monster_power;
		}		
	}
	static void monster_attacked(int monster_damage) {
		// 몬스터 방어 처리
		if (monster_defense >= monster_damage) {
			monster_hp = monster_hp - 0;
		}
		else {
			monster_hp = monster_hp + monster_defense - monster_damage;
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("******RPG GAME******");
		
		// 직업 선택
		System.out.println("\n~~~ 직업 리스트 ~~~");
		System.out.println("1. 전사");
		System.out.println("2. 궁수 (현재 지원 않음)");
		System.out.println("3. 마법사 (현재 지원 않음)");
		while (true) {
			System.out.printf("\n직업의 번호를 입력하세요. : ");
			int num = sc.nextInt();
			if (num == 1) {
				System.out.println("> 전사가 선택되었습니다.");
				hero_money = 10000;
				hero_defense = 25;
				hero_power = 15;
				hero_level = 1; 
				hero_hp = 80;
				hero_mp = 0; // 전사는 mp 필요없음
				break;
			}
			else
				System.out.println("> 지금은 지원하지 않는 기능입니다.");
		}
		// 이름 입력
		System.out.printf("\n영웅의 이름을 알려주세요. : ");
		hero_name = sc.next();
		System.out.println("> 이름이 입력되었습니다.");
		System.out.println("> 게임에 입장하였습니다.");
		
		while (true) {
			// 턴이 돌아올 때마다 유저 캐릭터 정보 출력
			Thread.sleep(1500);
			System.out.println("\n*********************");
			System.out.println("현재 Hero의 이름 : " + hero_name);
			System.out.println("현재 " + hero_name + "의 레벨 : " + hero_level);
			System.out.println("현재 " + hero_name + "의 힘 : "+ hero_power);
			System.out.println("현재 " + hero_name + "의 방어럭 : " + hero_defense);
			System.out.println("현재 " + hero_name + "의 HP : " + hero_hp);
			System.out.println("현재 " +	hero_name + "의 경험치 : " + hero_experience);
			System.out.println("현재 " +	hero_name + "의 돈 : " + hero_money + "원");
			System.out.println("*********************\n");
			
			// 입장할 장소 선택 프로세스
			System.out.println("~~~ 여행지 리스트 ~~~");
			System.out.println("1. 사냥터");
			System.out.println("2. 포션 상점");
			System.out.println("3. 무기 상점 (현재 지원 않음)");
			System.out.println("4. 게임 종료");
			System.out.printf("\n어디로 여행하시겠습니까? : ");
			int place = sc.nextInt();
			if (place == 1) {
				System.out.println("> 사냥터로 입장합니다.");
				while (true) {
					System.out.println("\n~~~ 적 리스트 ~~~");
					System.out.println("1. 너구리 (hp:100)");
					System.out.println("2. 살쾡이 (hp:2000)");
					System.out.println("3. 고라니 (현재 지원 않음)");
					System.out.printf("\n어떤 몬스터와 교전하시겠습니까? : ");
					int monster = sc.nextInt();
					if (monster == 1) {
						monster_name = "너구리";
						monster_hp = 100;
						monster_level = 1;
						monster_power = 20;
						monster_defense = 5;
						monster_money = 10;
						monster_experience = 10;
						break;
	 				}
					else if (monster == 2) {
						monster_name = "살쾡이";
						monster_hp = 2000;
						monster_level =5;
						monster_power = 100; 
						monster_defense = 20; 
						monster_money = 30;
						monster_experience = 50;
						break;
					}
					else if (monster >= 3) {
						System.out.println("> 더 수련하고 오거라...");
					}
				}	
				System.out.println("> " + monster_name + "과(와) 교전을 게시하겠습니다.");
				
				while (true) {
					// 유저 공격
					Thread.sleep(1500);
					System.out.println("\n<<< " + hero_name + "의 공격입니다 >>>");
					monster_attacked(hero_attack());
					if (monster_hp <= 0) {
						Thread.sleep(1500);
						System.out.println("\n" + monster_name + "(이)가 죽었습니다. 사냥터에서 나갑니다.");
						hero_experience += monster_experience;
						hero_money += monster_money;
						break;
					}
					// 몬스터 공격
					Thread.sleep(1500);
					System.out.println("\n<<< " + monster_name + "의 공격입니다. >>>\n");
					hero_attacked(monster_attack());
					if (hero_hp <= 0) {
						Thread.sleep(1500);
						System.out.println("\n" + hero_name + "(이)가 죽었습니다. 사냥터에서 나갑니다.");
						hero_hp = 1;
						Thread.sleep(1000);
						System.out.println(".");
						Thread.sleep(1000);
						System.out.println(".");
						Thread.sleep(1000);
						System.out.println(".");
						Thread.sleep(1000);
						System.out.println("!!! 신의 은총을 받아 " + hero_name + "이(가) 부활했습니다. !!!");
						break;
					}
				}
			}
			if (place == 2) {
				Loop:
				while (true) {
			        if (hero_money <= 0) {
			        	Thread.sleep(1500);
			        	System.out.println("돈이 없습니다...");
				    	break;
				    }
			        
			        System.out.println("> 포션 상점으로 입장합니다.\n");
			        System.out.println("*********************");
			        System.out.printf("당신의 Money : %d\n", hero_money);
			        System.out.println("~~~ 포션 리스트 ~~~");
			        System.out.println("1. 힘 증강 포션 (30원)");
			        System.out.println("2. 방어력 증강 포션 (30원)");
			        System.out.println("3. 경험치 증강 포션 (100원)");
			        System.out.println("4. HP 증강 포션 (10원)");
			        System.out.println("5. MP 증강 포션 (10원)");
			        System.out.println("6. 포션 상점에서 나가기");
			        System.out.println("*********************\n");
			        
			        System.out.print("원하시는 옵션을 골라주세요. : ");
			        int potion = sc.nextInt();
			        if (potion == 6) {
			            System.out.println("> 포션 상점에서 나가고 있습니다...");
			            break;
			        }
			        if (potion < 1 || potion > 6) {
			            System.out.println("> 잘못된 입력입니다. 다시 입력해주세요.");
			            continue;
			        }
			        
			        int price = 0;
			        int upAmount = 0;
			        switch (potion) {
			            case 1:
			                price = 30;
			                upAmount = 10;
			                break;
			            case 2:
			                price = 30;
			                upAmount = 50;
			                break;
			            case 3:
			                price = 100;
			                upAmount = 50;
			                break;
			            case 4:
			                price = 10;
			                upAmount = 50;
			                break;
			            case 5:
			                price = 10;
			                upAmount = 100;
			                break;
			        }
			        while (true) {
			            System.out.printf("\n구매 가능 개수 : %d\n", hero_money / price);
			            System.out.print("포션의 개수를 입력해주세요. 뒤로 가시려면 0을 입력해주세요 : ");
			            int quantity = sc.nextInt();
			            if (quantity == 0) {
			                break;
			            }
			            if (hero_money < price * quantity) {
			                System.out.printf("> %d개를 사기에는 돈이 부족합니다.\n", quantity);
			                continue;
			            }
			            hero_money -= price * quantity;
			            System.out.printf("> 금액은 %d원 입니다.\n", price * quantity);
			            System.out.printf("> 남은 돈은 %d원 입니다.\n", hero_money);
			            switch (potion) {
			            case 1:
			                hero_power += upAmount * quantity;
			                break;
			            case 2:
			                hero_defense += upAmount * quantity;
			                break;
			            case 3:
			                hero_experience += upAmount * quantity;
			                break;
			            case 4:
			                hero_hp += upAmount * quantity;
			                break;
			            case 5:
			                hero_mp += upAmount * quantity;
			                break;
			            }
			            if (hero_experience >= hero_level * 80) {
			                while (hero_experience >= hero_level * 80) {
			                    hero_experience -= hero_level * 80;
			                    hero_level++;
			                    hero_money += hero_level * 50;
			                    System.out.println("\n- - - - - - - - - - - - - - - - -");
			                    System.out.println("레벨이 " + hero_level + "로 증가했습니다.");
			                    System.out.println("레벨업 보상으로 " + hero_level * 50 + "원을 지급해드립니다.");
			                    System.out.println("당신의 Money : " + hero_money);
			                    System.out.println("- - - - - - - - - - - - - - - - -");
			                }
			            }
			            if (hero_money <= 0) {
					    	Thread.sleep(1500);
			            	System.out.println("\n돈이 없습니다... 포션 상점에서 나갑니다.");
					    	break Loop;
					    }
			            Thread.sleep(1500);
			            break;
			        }
			    }   
			}
			if (place == 3) {
				System.out.println("> 지금은 지원하지 않는 기능입니다.");
			}
			if (place == 4) {
				System.out.println("게임 종료!");
				break;
			}
			// 레벨업 프로세스
			if (hero_experience >= hero_level * 80) {
			    while (hero_experience >= hero_level * 80) {
			        hero_experience -= hero_level * 80;
			        hero_level++;
			        hero_money += hero_level * 50;
                    System.out.println("\n- - - - - - - - - - - - - - - - -");
			        System.out.println("레벨이 " + hero_level + "로 증가했습니다.");
			        System.out.println("레벨업 보상으로 " + hero_level * 50 + "원을 지급해드립니다.");
			        System.out.println("당신의 Money : " + hero_money);
                    System.out.println("- - - - - - - - - - - - - - - - -");
			    }
			}
		} 
	}

}

