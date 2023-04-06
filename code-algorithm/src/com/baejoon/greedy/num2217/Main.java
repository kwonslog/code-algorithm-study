package com.baejoon.greedy.num2217;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	private void execute(int in1, int[] in2) {
		//로프개수 k
		//중량 w
		//로프에 걸리는 중량은 w / k  

		//10kg. 1개의 로프를 사용하면  10kg 중량을 up
		//10kg. 15kg 2개의 로프를 사용하면 10kg 로프에 맞춰서 20kg 중량을 up
		//	10kg 기준 20
		//  15kg 기준 1
		//10kg. 15kg 25kg 3개의 로프를 사용시
	    //	10kg 기준 30
		//	15kg 기준 30
		//  25kg 기준 25
		//10kg. 15kg 25kg 45kg 4개의 로프를 사용시
		//	10kg 기준 40
		//	15kg 기준 45
		//	25kg 기준 50
		//  45kg 기준 45

		//1 2 3 4 5
		//1 * 5 = 5
		//2 * 4 = 8
		//3 * 3 = 9
		//4 * 2 = 8
		//5 * 1 = 5

		//1 2 3 3 4 5
		//1 * 6 = 6
		//2 * 5 = 10
		//3 * 4 = 12
		//3 * 3 = 9
		//4 * 2 = 8
		//5 * 1 = 5

		Arrays.sort(in2);

		int t1 = in1;
		int max = 0;
		for( int i=0; i<in1; i++ ) {
			 int cl = in2[i] * t1--;
			 if( max < cl ) {
				max = cl;
			 }
		}

		System.out.println(max);
		
	}

	public void solution() throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int in1;
		int[] in2;
		int in3;
		st = new StringTokenizer(br.readLine());
		in1 = Integer.parseInt(st.nextToken());

		in2 = new int[in1];
		for( int i=0; i<in1; i++ ) {
			st = new StringTokenizer(br.readLine());
			in2[i] = Integer.parseInt(st.nextToken());
		}

		execute(in1, in2);
	}

	public static void main(String[] args) throws Exception {
		new Main().solution();
	}
}
