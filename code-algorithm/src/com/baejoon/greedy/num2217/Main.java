package com.baejoon.greedy.num2217;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private void execute(int in1, int[] in2) {

		//문제가 이해 안되는중 ㅋㅋ.
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
