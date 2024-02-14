package ch16.lamda03.funcInter01;

//함수형 람다식을 위한 인터페이스
@FunctionalInterface
/* 함수형 인터페이스에는 단 한 개의 추상메서드만 존재 가능
 * 추상메서드가 한 개를 초과하면 에러 발생
 */
public interface MyNumber {
	int getMax(int num1, int num2);
	//int add(int num1, int num2);
}
