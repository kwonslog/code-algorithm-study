package com.baejoon.greedy.num11399;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//2023.04.04 해결
public class Main {

	private void execute(int inValue, int[] itemCount) {

		itemCount = Arrays.stream(itemCount).sorted().toArray();

		int sum = 0;
		int sum2 = 0;

		//핵심은 돈을 인출하는데 걸리는 시간 P분을 정렬하고, 각 사람의 순서에 걸린 시간을 누적하여 최종 결과값을 구하는 것
		for(int i=0; i<itemCount.length; i++ ) {
			sum += itemCount[i];
			sum2 += sum;
		}
		System.out.println(sum2);
	}

	public void solution() throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int inValue;
		int[] itemCount;
		st = new StringTokenizer(br.readLine());
		inValue = Integer.parseInt(st.nextToken());
		//System.out.println(inValue);

		st = new StringTokenizer(br.readLine(), " ");
		itemCount = new int[st.countTokens()];
		for( int i=0; i < itemCount.length; i++ ) itemCount[i] = Integer.parseInt(st.nextToken());

		//System.out.println(itemCount.length);

		execute(inValue, itemCount);
	}

	public static void main(String[] args) throws Exception {
		new Main().solution();
	}
}
