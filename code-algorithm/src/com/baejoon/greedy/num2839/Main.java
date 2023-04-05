package com.baejoon.greedy.num2839;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//2023.04.04 해결
public class Main {

	private void execute(int inValue) {

		int b5 = 0;
		int b3 = 0;
		while( inValue >= 0 ) {
			//5로 정확히 나누어지면 해당 봉지만 사용
			if( inValue % 5 == 0 ) {
				b5 += inValue / 5;
				System.out.println(b5 + b3);
				return;
			} else {
				//5로 나누어 지지 않으면 3봉지 한번 사용
				inValue -= 3;
				b3++; //봉지 카운트 누적
			}
		}

		System.out.println(-1);
	}

	public void solution() throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int inValue;
		st = new StringTokenizer(br.readLine());
		inValue = Integer.parseInt(st.nextToken());
		//System.out.println(inValue);

		execute(inValue);
	}

	public static void main(String[] args) throws Exception {
		new Main().solution();
	}
}
