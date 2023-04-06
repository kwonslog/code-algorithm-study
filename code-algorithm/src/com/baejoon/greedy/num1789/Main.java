package com.baejoon.greedy.num1789;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private void execute(long in1) {
		//11
		//1 + 2 + 3 + 4 + 5

		long sum = 0;
		long result = 0;
		for( long i=1; i<=in1; i++ ) {
			sum += i;
			if( sum == in1 ) {
				result = i;
				break;
			} else if( sum > in1 ) {
				result = i-1;
				break;
			}
		}

		System.out.println(result);
	}

	public void solution() throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		long in1;
		st = new StringTokenizer(br.readLine());
		in1 = Long.parseLong(st.nextToken());
		execute(in1);
	}

	public static void main(String[] args) throws Exception {
		new Main().solution();
	}
}
