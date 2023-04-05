package com.baejoon.greedy.num1931;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

//2023.04.04 해결
public class Main {

	private void execute(int inN, int[][] itemCount) {
		//회의실 1개 고정
		//I 라는 회의는 여러개 -> 시작과 끝이 있음.
		//시간이 겹치지 않으면서 할수 있는 회의의 최대개수 구하기.

		int result = 0;
		int etime = 0;

		//핵심 시간시간을 정렬하고 다시 종료시간을 정렬해서 처리
		itemCount = Arrays.stream(itemCount).sorted(Comparator.comparingInt(arr -> arr[0])).toArray(int[][]::new);
		itemCount = Arrays.stream(itemCount).sorted(Comparator.comparingInt(arr -> arr[1])).toArray(int[][]::new);

		for( int i=0; i<inN; i++ ) {
//			System.out.println("> " + itemCount[i][0] + " " + itemCount[i][1]);
			//시작시간이 끝나는 시간 보다 작은 경우 skip
			if( itemCount[i][0] < etime ) {
//				System.out.println("continue : " + itemCount[i][0]);
				continue;
			}

			//끝나는 시간 저장
			etime = itemCount[i][1];
			result++;
//			System.out.println("result : " + itemCount[i][0] + " " + itemCount[i][1]);
			//System.out.println("result pp : " + itemCount[i].toString());

		}

		System.out.print(result);

	}

	public void solution() throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		int inN;
		int[][] itemCount;
		st = new StringTokenizer(br.readLine());
		inN = Integer.parseInt(st.nextToken());

		itemCount = new int[inN][2];
		for( int i=0; i<itemCount.length; i++ ) {
			st = new StringTokenizer(br.readLine(), " ");
			itemCount[i][0] = Integer.parseInt(st.nextToken());
			itemCount[i][1] = Integer.parseInt(st.nextToken());
		}

//		inN = 11;
//		itemCount = new int[inN][2];
//		itemCount[0][0] = 1; itemCount[0][1] = 4;
//		itemCount[1][0] = 3; itemCount[1][1] = 5;
//		itemCount[2][0] = 0; itemCount[2][1] = 6;
//		itemCount[3][0] = 5; itemCount[3][1] = 7;
//		itemCount[4][0] = 3; itemCount[4][1] = 8;
//		itemCount[5][0] = 5; itemCount[5][1] = 9;
//		itemCount[6][0] = 6; itemCount[6][1] = 10;
//		itemCount[7][0] = 8; itemCount[7][1] = 11;
//		itemCount[8][0] = 8; itemCount[8][1] = 12;
//		itemCount[9][0] = 2; itemCount[9][1] = 13;
//		itemCount[10][0] = 12; itemCount[10][1] = 14;

		execute(inN, itemCount);
	}

	public static void main(String[] args) throws Exception {
		new Main().solution();
	}
}
