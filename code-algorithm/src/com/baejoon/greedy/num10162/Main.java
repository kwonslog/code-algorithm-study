package com.baejoon.greedy.num10162;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private void execute(int in1) {
		int ba = 5 * 60;
		int bb = 60;
		int bc = 10;

		int bac = 0;
		int bbc = 0;
		int bcc = 0;

		//100
		bac = in1 / ba;
		in1 = in1 % ba;

		bbc = in1 / bb;
		in1 = in1 % bb;

		bcc = in1 / bc;
		in1 = in1 % bc;

		if( in1 != 0 ) {
			System.out.println(-1);
		} else {
			System.out.println(String.format("%d %d %d", bac, bbc, bcc));
		}
	}

	public void solution() throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int in1;
		st = new StringTokenizer(br.readLine());
		in1 = Integer.parseInt(st.nextToken());

		execute(in1);
	}

	public static void main(String[] args) throws Exception {
		new Main().solution();
	}
}
