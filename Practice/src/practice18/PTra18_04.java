/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> array = new ArrayList<Player>();
		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			for (int i = 0; scanner.hasNext(); i++) {
				Player player = new Player();

				String line = scanner.nextLine();
				String[] list = line.split(",", 0);
				player.setPosition(list[0]);
				player.setName(list[1]);
				player.setCountry(list[2]);
				player.setTeam(list[3]);

				array.add(player);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください

		for (int i = 0; i < array.size(); i++) {
			Player player = new Player();
			player = array.get(new java.util.Random().nextInt(array.size()));

			if (player.position.equals("GK")) {

				System.out.println(player);
				break;

			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < array.size(); j++) {
				Player player = new Player();
				player = array.get(new java.util.Random().nextInt(array.size()));

				if (player.position.equals("DF")) {

					System.out.println(player);
					break;

				}
			}

		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < array.size(); j++) {
				Player player = new Player();
				player = array.get(new java.util.Random().nextInt(array.size()));

				if (player.position.equals("MF")) {

					System.out.println(player);
					break;

				}
			}

		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < array.size(); j++) {
				Player player = new Player();
				player = array.get(new java.util.Random().nextInt(array.size()));

				if (player.position.equals("FW")) {

					System.out.println(player);
					break;

				}
			}

		}

	}
}
