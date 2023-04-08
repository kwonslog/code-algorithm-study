package com.programmers.greedy.num42860;

import java.util.zip.ZipEntry;

/*
 * 문제위치 : https://school.programmers.co.kr/learn/courses/30/lessons/42862
 */
public class Main {

	public int solution(String name) {

		int answer = 0;

		//A 가 더 가까운 범위는 77이하
		//Z 가 더 가까운 범위는 78이상

		//문자를 INT CHAR 변환
		//77이하 이면 위로 
		//78이상 이면 아래로 

		int[] nn = new int[name.length()];

		for( int i=0; i<name.length(); i++ ) {
			nn[i] = (int)name.charAt(i);
		}

		//AAA
		//J : 74 - 65 = 9
		//A : 65 - 65 = 0
		//N : 78 - 65 = 13,  N : 90 - 78 = 13

		//J,  90 - 74 = 16
		//J,  74 - 65 = 9


		for( int i=0; i<nn.length; i++ ) {
			int a1 = nn[i] - 65;
			int z1 = 90 - nn[i];

			System.out.println((char)nn[i] + " a기준: " + a1 + " z기준: " + z1);

			if( a1 < z1 ) {
				answer += a1;
			} else if( z1 < a1 || z1 == 0) {
				answer += z1 + 1;
			}
		}

		System.out.println(answer);

		//JAN 
		for( int i=0; i<nn.length; i++ ) {
			if( 65 != nn[i] ) {
				answer++;
			}
		}

		answer--;

		if( answer < 0 ) answer = 0;

		System.out.println(answer);

        return answer;
    }

	public static void main(String[] args) throws Exception {
		String name = "JAN";
		name = "JEROEN";
		// name = "BAB";
		// name = "LMNOPQRZ";
		// name = "XYZ";
		//name = "AAAA";
		name = "ABC";
		//0 2 3
		//3 2 1
		new Main().solution(name);

		//ABCDEFGHIJKLMNOPQRSTUVWXYZ

		//Z 일때 +1

		// for( int i=65; i<=90; i++ ) {
		// 	System.out.print((char)i);
		// }
	}
}
