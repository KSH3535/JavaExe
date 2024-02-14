package ch16.lamda03.funcInter01;

/* 추상메서드를 1개를 초과하면 에러가 발생한다.
 * 함수형 인터페이스는 반드시 추상 메서드가 1개여야만 한다.
 * */
// 함수형 람다식을 위한 인터페이스
@FunctionalInterface
public interface MyNumber {
	int getMax(int num1, int num2);
	//int add(int num1, int num2);
}
