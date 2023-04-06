package com.baejoon.greedy.num13305;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private void execute(int in1, int[] in2, int[] in3) {
		// 5
		// 2   3   1   7
		// 5   2   4   1   10

		// 2 * 5 = 10 원
		// 2 * (3+1) = 8

		//현재 도시의 기름값보다 싼 도시가 나오기 전까지 이동거리르 모두 더해서 기름을 넣는다.
		System.out.println(-1);
	}

	public void solution() throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int in1;
		int[] in2;
		int[] in3;
		st = new StringTokenizer(br.readLine());
		in1 = Integer.parseInt(st.nextToken());

		
		st = new StringTokenizer(br.readLine(), " ");
		in2 = new int[in1-1];
		for( int i=0; i<in2.length; i++ ) {
			in2[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		in3 = new int[in1];
		for( int i=0; i<in3.length; i++ ) {
			in3[i] = Integer.parseInt(st.nextToken());
		}

		execute(in1, in2, in3);
	}

	public static void main(String[] args) throws Exception {
		new Main().solution();
	}
}
