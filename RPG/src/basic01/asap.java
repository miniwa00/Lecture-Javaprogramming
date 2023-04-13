package basic01;

public class asap {

}
if (place == 2) {
	Loop_0 :
	while (true) {
		
		int power_up = 30;
		int def_up = 30;
		int exp_up = 100;
		int hp_up = 10;
		int mp_up = 10;
		String str_1, str_2, str_3, str_4, str_5 = null;
		
		System.out.println("> 포션 상점으로 입장합니다.");
		System.out.println("");
		System.out.println("*********************");
		System.out.println("당신의 Money : " + hero_money);
		System.out.println("~~~ 포션 리스트 ~~~");
		System.out.println("1. 힘 증강 포션 (30원)");
		System.out.println("2. 방어력 증강 포션 (30원)");
		System.out.println("3. 경험치 증강 포션 (100원)");
		System.out.println("4. HP 증강 포션 (10원)");
		System.out.println("5. MP 증강 포션 (10원)");
		System.out.println("6. 포션 상점에서 나가기");
		System.out.println("*********************");
		System.out.println("");
		
		System.out.printf("원하시는 옵션을 골라주세요. : ");
		int potion = sc.nextInt();
		if (potion == 1) {
			Loop_1 :
			while (true) {
				System.out.println("");
				System.out.println("구매 가능 개수 : " + hero_money / power_up);
				System.out.printf("포션의 개수를 입력해주세요. : ");
				int how_many = sc.nextInt();
				if (how_many == 0) {
					System.out.println("> 개수가 0일 수는 없습니다.");
					break;
				}
				else {	
					System.out.println("> 힘 증강 포션의 구매를 시도 중입니다...");
					System.out.println("> 금액은 " + power_up * how_many + "원 입니다.");
					Thread.sleep(2000);
					if (hero_money < power_up * how_many) {
						System.out.println("> 돈이 부족합니다. 포션 상점에서 나갑니다.");
						break Loop_0;	
					}
					else {
						System.out.println("");
						System.out.println("구매가 완료되었습니다.");
						hero_money = hero_money - power_up * how_many;
						System.out.println(hero_money + "원 남았습니다.");
						hero_power = hero_power + 10 * how_many;
						System.out.println("");
						if (hero_money <= 0) {
							System.out.println("");
							System.out.println("추가 구매가 불가능하므로 포션 상점에서 나갑니다.");
							break Loop_0;
						}
						else {
							System.out.printf("더 구매하시겠습니까? [y/n] ");
							str_1 = sc.next();
							if (str_1.equals("n")) {
								System.out.println("> 포션 상점에서 나가고 있습니다...");
								break Loop_0;
							}
							else {
								break Loop_1;
							}
						}
					}
				}
			}	
		}
		if (potion == 2) {
			Loop_2 :
			while (true) {
				System.out.println("");
				System.out.println("구매 가능 개수 : " + hero_money / def_up);
				System.out.printf("포션의 개수를 입력해주세요. : ");
				int how_many = sc.nextInt();
				if (how_many == 0) {
					System.out.println("> 개수가 0일 수는 없습니다.");
					break;
				}
				else {
					System.out.println("> 방어력 증강 포션의 구매를 시도 중입니다...");
					System.out.println("> 금액은 " + power_up * how_many + "원 입니다.");
					Thread.sleep(2000);
					if (hero_money < def_up * how_many) {
						System.out.println("> 돈이 부족합니다. 포션 상점에서 나갑니다.");
						break Loop_0;
					}
					else {
						System.out.println("");
						System.out.println("구매가 완료되었습니다.");
						hero_money = hero_money - def_up * how_many;
						System.out.println(hero_money + "원 남았습니다.");
						hero_defense = hero_defense + 50 * how_many;
						System.out.println("");
						if (hero_money <= 0) {
							System.out.println("");
							System.out.println("추가 구매가 불가능하므로 포션 상점에서 나갑니다.");
							break Loop_0;
						}
						else {
							System.out.printf("더 구매하시겠습니까? [y/n] ");
							str_2 = sc.next();
							if (str_2.equals("n") || str_2.equals("ㅜ")) {
								System.out.println("> 포션 상점에서 나가고 있습니다...");
								break Loop_0;
							}
							else {
								break Loop_2;
							}
						}	
					}	
				}
			}
		}
		if (potion == 3) {
			Loop_3 :
			while (true) {
				System.out.println("");
				System.out.println("구매 가능 개수 : " + hero_money / exp_up);
				System.out.printf("포션의 개수를 입력해주세요. : ");
				int how_many = sc.nextInt();
				if (how_many == 0) {
					System.out.println("> 개수가 0일 수는 없습니다.");
					break;
				}
				else {
					System.out.println("> 경험치 증강 포션의 구매를 시도 중입니다...");
					Thread.sleep(2000);
					if (hero_money < exp_up * how_many) {
						System.out.println("> 돈이 부족합니다. 포션 상점에서 나갑니다.");
						break Loop_0;
					}
					else {
						System.out.println("");
						System.out.println("구매가 완료되었습니다.");
						hero_money = hero_money - exp_up * how_many;
						System.out.println(hero_money + "원 남았습니다.");
						hero_experience = hero_experience + 50 * how_many;
						if (hero_experience >= hero_level * 80) {
							hero_level = hero_level + 1;
							System.out.println("");
							System.out.println("-----------------------------");
							System.out.println("레벨이 " + hero_level + "로 증가했습니다.");
							hero_money += hero_level * 50;
							System.out.println("레벨업 보상으로 " + hero_level * 50 + "원을 지급해드립니다.");
							System.out.println("당신의 Money : " + hero_money);
							hero_experience = 0;
						}
						if (hero_money <= 0) {
							System.out.println("");
							System.out.println("추가 구매가 불가능하므로 포션 상점에서 나갑니다.");
							break Loop_0;
						}
						else {
							System.out.println("");
							System.out.printf("더 구매하시겠습니까? [y/n] ");
							str_3 = sc.next();
							if (str_3.equals("n")) {
								System.out.println("> 포션 상점에서 나가고 있습니다...");
								break Loop_0;
							}
							else {
								break Loop_3;
							}
						}	
					}
				}
			}
		}
		if (potion == 4) {
			Loop_4 :
			while (true) {
				System.out.println("");
				System.out.println("구매 가능 개수 : " + hero_money / hp_up);
				System.out.printf("포션의 개수를 입력해주세요. : ");
				int how_many = sc.nextInt();
				if (how_many == 0) {
					System.out.println("> 개수가 0일 수는 없습니다.");
					break;
				}
				else {
					System.out.println("> HP 증강 포션의 구매를 시도 중입니다...");
					Thread.sleep(2000);
					if (hero_money < hp_up * how_many) {
						System.out.println("> 돈이 부족합니다. 포션 상점에서 나갑니다.");
						break Loop_0;
					}
					else {
						System.out.println("");
						System.out.println("구매가 완료되었습니다.");
						hero_money = hero_money - hp_up * how_many;
						System.out.println(hero_money + "원 남았습니다.");
						hero_hp = hero_hp + 50 * how_many;
						System.out.println("");
						if (hero_money <= 0) {
							System.out.println("");
							System.out.println("추가 구매가 불가능하므로 포션 상점에서 나갑니다.");
							break Loop_0;
						}
						else {
							System.out.printf("더 구매하시겠습니까? [y/n] ");
							str_4 = sc.next();
							if (str_4.equals("n")) {
								System.out.println("> 포션 상점에서 나가고 있습니다...");
								break Loop_0;
							}
							else {
								break Loop_4;
							}	
						}
					}	
				}
			}
		}
		if (potion == 5) {
			Loop_5 :
			while (true) {
				System.out.println("");
				System.out.println("구매 가능 개수 : " + hero_money / mp_up);
				System.out.printf("포션의 개수를 입력해주세요. : ");
				int how_many = sc.nextInt();
				if (how_many == 0) {
					System.out.println("> 개수가 0일 수는 없습니다.");
					break;
				}
				else {
					System.out.println("> MP 증강 포션의 구매를 시도 중입니다...");
					Thread.sleep(2000);
					if (hero_money < mp_up * how_many) {
						System.out.println("> 돈이 부족합니다. 포션 상점에서 나갑니다.");
						break Loop_0;
					}
					else {
						System.out.println("");
						System.out.println("구매가 완료되었습니다.");
						hero_money = hero_money - mp_up * how_many;
						System.out.println(hero_money + "원 남았습니다.");
						hero_mp = hero_mp + 100 * how_many;
						System.out.println("");
						if (hero_money <= 0) {
							System.out.println("");
							System.out.println("추가 구매가 불가능하므로 포션 상점에서 나갑니다.");
							break Loop_0;
						}
						else {
							System.out.printf("더 구매하시겠습니까? [y/n] ");
							str_5 = sc.next();
							if (str_5.equals("n")) {
								System.out.println("> 포션 상점에서 나가고 있습니다...");
								break Loop_0;
							}
							else {
								break Loop_5;
							}
						}	
					}							
				}
			}
		}
		if (potion == 6) {
			System.out.println("> 포션 상점에서 나가고 있습니다...");
			break Loop_0;
		}	
	} 
}