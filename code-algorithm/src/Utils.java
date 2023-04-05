import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Utils {


	//int[][] 오름차순(첫번째열 기준)
	public static int[][] intD2ASC(int[][] array) {
		return Arrays.stream(array).sorted(Comparator.comparingInt(arr -> arr[0])).toArray(int[][]::new);
	}

	//int[][] 내림차순(첫번째열 기준)
	public static int[][] intD2DESC(int[][] array) {
		return Arrays.stream(array).sorted(Comparator.comparingInt((int[] arr) -> arr[0]).reversed()).toArray(int[][]::new);
	}

	//int[] 오름차순
	public static int[] intToASC(int[] array) {
		return IntStream.of(array).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
	}

	//int[] 내림차순
	public static int[] intToDESC(int[] array) {
		return IntStream.of(array).boxed().sorted().mapToInt(Integer::intValue).toArray();
	}

	public void solutionLine3() throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		int inN;
		int[] itemA;
		int[] itemB;

		st = new StringTokenizer(br.readLine(), " ");
		inN = Integer.parseInt(st.nextToken());

		itemA = new int[inN];
		itemB = new int[inN];

		st = new StringTokenizer(br.readLine());
		for( int i=0; i<inN; i++ ) {
			itemA[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for( int i=0; i<inN; i++ ) {
			itemB[i] = Integer.parseInt(st.nextToken());
		}

		//execute(inN, itemA, itemB);
	}


}
