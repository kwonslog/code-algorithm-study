package com.baejoon.greedy.num5585;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private void execute(int inValue) {

		int money = 1000 - inValue;
		int count = 0;
		int[] unit = new int[] {500,100,50,10,5,1};

		for( int i=0; i<unit.length; i++ ) {
			count += money / unit[i];
			money = money % unit[i];
		}

//		count += money / 500;
//		money = money % 500;
//
//		count += money / 100;
//		money = money % 100;
//
//		count += money / 50;
//		money = money % 50;
//
//		count += money / 10;
//		money = money % 10;
//
//		count += money / 5;
//		money = money % 5;
//
//		count += money / 1;
//		money = money % 1;

		System.out.println(count);
	}

	public void solution() throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int inValue;
		st = new StringTokenizer(br.readLine());
		inValue = Integer.parseInt(st.nextToken());

//		inValue = 380;
		execute(inValue);
	}

	public static void main(String[] args) throws Exception {
		new Main().solution();

//		System.out.println(100 / 500);

	}
}
