package com.baejoon.greedy.num18185;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//2023.04.04 풀지 못함
public class Main {

	private int factoryCount;
	private int[] itemCount;

	private void execute() {
	}

	public void solution() throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		st = new StringTokenizer(br.readLine());
		factoryCount = Integer.parseInt(st.nextToken());
		System.out.println(factoryCount);

		st = new StringTokenizer(br.readLine(), " ");
		itemCount = new int[st.countTokens()];
		System.out.println(itemCount.length);
	}

	public static void main(String[] args) throws Exception {
		new Main().solution();
	}
}
