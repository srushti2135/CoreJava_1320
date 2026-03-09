package operator.com;

public class Bitwise {

//	public static void main(String[] args) {
//
//		int a = 4;
//
//		a = a += 4;
//
//		a -= 4;
//	a *= 4;
//		a /= 4;
//		a %= 4;
//
//		System.out.println(a);

	public static void main(String[] args) {

//		System.out.println(17 | 55);
//		System.out.println(17 & 55);
//		System.out.println(13 << 3); left shift
//		System.out.println(13 >> 5); // right shift

		int a = 4;

		a++; // 5
		a += 3; // 8
		--a; // 7
		System.out.println(a++); // 7 // 8
		a %= 2; // 0
		System.out.println(a >> 3); // 0

		System.out.println(a + 3); // 0+3 = 3
		a++; // 1
		System.out.println(a); // 1

	}

}
