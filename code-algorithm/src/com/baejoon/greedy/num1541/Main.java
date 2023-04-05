package com.baejoon.greedy.num1541;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

//2023.04.04 해결
public class Main {

	private void execute(String inN) {

		//괄호를 쳤을때 최소값이 나오도록 해야함.
		//+, - 파싱 필요

		//모두 + 이면 그냥 더해서 출력
		//모두 - 이면 그냥 빼서 출력
		//입력한 값은 Integer.parseInt 처리 필요.(000001) 이렇게 입력 가능.

		int result = 99;
		if( inN.contains("+") && !inN.contains("-") ) {
			result = Arrays.stream(inN.split("\\+")).mapToInt(Integer::parseInt).sum();
		} else if( inN.contains("-") && !inN.contains("+") ) {
			result = Arrays.stream(inN.split("-")).mapToInt(Integer::parseInt).reduce((left, right) -> left - right).getAsInt();
		} else {

			/**
			 * 핵심로직은
			 * 1. "-" split 처리
			 *    100-30+70-20+50-90
			 * 2. split 결과에 "+" 가 포함 될 경우 두 값을 더하기 처리
			 *    100,(30+70),(20+50),90
			 * 3. 값을 순서대로 저장하고
			 * 4. 값을 순서대로 빼기 처리하여 결과값을 얻을수 있음.
			 *    100-(30+70)-(20+50)-90
			 */
			String[] spArray = inN.split("-");

			List<Integer> calcList = new ArrayList<>();
			for( int i=0; i<spArray.length; i++ ) {
				if( spArray[i].contains("+") ) {
					calcList.add(Arrays.stream(spArray[i].split("\\+")).mapToInt(Integer::parseInt).sum());
				} else {
					calcList.add(Integer.parseInt(spArray[i]));
				}
			}

			result = calcList.stream().reduce((t, u) -> t - u).get();
		}

		System.out.println(result);
	}

	public void solution() throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		String inN;

		st = new StringTokenizer(br.readLine(), " ");
		inN = st.nextToken();

		execute(inN);
	}

	public static void main(String[] args) throws Exception {
		new Main().solution();
	}
}
