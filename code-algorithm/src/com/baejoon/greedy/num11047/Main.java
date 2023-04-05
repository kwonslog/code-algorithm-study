package com.baejoon.greedy.num11047;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

//2023.04.04 해결
public class Main {

	private void execute(int inK, int[] itemCount) {

		//itemCount 내림차순 정렬
		itemCount = IntStream.of(itemCount).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();

		int coinSum = 0;
		for( int i=0; i<itemCount.length; i++ ) {
//			System.out.println("itemCount: " + itemCount[i]);
			if( inK / itemCount[i] > 0) {
				coinSum += inK / itemCount[i];
				inK = inK % itemCount[i];
//				System.out.println("> " + coinSum);
			}
		}

		System.out.println(coinSum);
	}

	public void solution() throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		int inN;
		int inK;
		int[] itemCount;

		st = new StringTokenizer(br.readLine(), " ");
		inN = Integer.parseInt(st.nextToken());
		inK = Integer.parseInt(st.nextToken());

		itemCount = new int[inN];

		for( int i=0; i<inN; i++ ) {
			st = new StringTokenizer(br.readLine());
			itemCount[i] = Integer.parseInt(st.nextToken());
		}

//		inK = 4200;
//		itemCount = new int[] {1,5,10,50,100,500,1000,5000,10000,50000};
		execute(inK, itemCount);
	}

	public static void main(String[] args) throws Exception {
		new Main().solution();
	}
}
