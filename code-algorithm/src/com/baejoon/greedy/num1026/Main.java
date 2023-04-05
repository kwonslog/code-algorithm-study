package com.baejoon.greedy.num1026;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

//2023.04.04 해결
public class Main {

	private void execute(int inN, int[] itemA, int[] itemB) {

		//A 줄에 가장 작은 수와 B 줄의 가장 큰 수를 곱하도록 하자

		//내림차순 정렬(B에서 가장 큰 수가 제일 앞에서 부터)
		itemB = IntStream.of(itemB).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();

		//오름차순 정렬(A에서 가장 작은 수가 제일 앞에서 부터)
		itemA = IntStream.of(itemA).boxed().sorted().mapToInt(Integer::intValue).toArray();

		int sum = 0;
		for( int i=0; i<inN; i++ ) {
			sum += itemA[i] * itemB[i];
		}

		System.out.println(sum);
	}

	public void solution() throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		int inN;
		int[] itemA;
		int[] itemB;

		st = new StringTokenizer(br.readLine(), " ");
		inN = Integer.parseInt(st.nextToken());

		itemA = new int[inN];
		itemB = new int[inN];

		st = new StringTokenizer(br.readLine());
		for( int i=0; i<inN; i++ ) {
			itemA[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for( int i=0; i<inN; i++ ) {
			itemB[i] = Integer.parseInt(st.nextToken());
		}

//		inN = 5;
//		itemA = new int[inN];
//		itemB = new int[inN];
//		itemA[0] = 1; itemB[0] = 2;
//		itemA[1] = 1; itemB[1] = 7;
//		itemA[2] = 1; itemB[2] = 8;
//		itemA[3] = 6; itemB[3] = 3;
//		itemA[4] = 0; itemB[4] = 1;

		execute(inN, itemA, itemB);
	}

	public static void main(String[] args) throws Exception {
		new Main().solution();
	}
}
