

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 복사해서 가져다 쓰기 위한 템플릿용 클래스
 */
public class Main {

	private void execute(int inValue) {

		System.out.println(-1);
	}

	public void solution() throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int in1;
		int in2;
		int in3;
		st = new StringTokenizer(br.readLine());
		in1 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		in2 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		in3 = Integer.parseInt(st.nextToken());

		execute(in1);
	}

	public static void main(String[] args) throws Exception {
		new Main().solution();
	}
}
