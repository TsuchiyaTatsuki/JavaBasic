package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */


		Car[] cars = new Car[3];

		for (int i = 0; i < cars.length; i++) {

			cars[i] = new Car();


			cars[i].serialNo = new java.util.Random().nextInt(1000) + 1000;
			//色ランダム化
			int co  = new java.util.Random().nextInt(3);

			switch (co) {
				case 0:
					cars[i].color = "白";
					break;
				case 1:
					cars[i].color = "黒";
					break;
				case 2:
					cars[i].color = "赤";
					break;
				default:
					break;
			}
			cars[i].gasoline = new java.util.Random().nextInt(20) + 40;

			System.out.println((i + 1) + "台目 " + cars[i].serialNo + cars[i].color + cars[i].gasoline);

		}

		final int distance = 300;



		for (int j = 0; j < cars.length; j++) {
			int sum = 0;

			for (int i = 1; cars[j].gasoline >= 0 ; i++) {
				int m = cars[j].run();

				sum += m;

				if (sum >= distance) {
					System.out.println((j + 1)+ "台目は目的地までに" + i + "時間かかりました。残りのガソリンは、" + cars[j].gasoline + "リットルです");
					break;

				}else if (sum < 0) {
					System.out.println((j + 1) + "台目は目的地に到達できませんでした");
					break;
				}


			}


		}






	}
}
