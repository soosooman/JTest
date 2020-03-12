package JJTest;

import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import MainSource.Money;

public class FileTest {
	Money c = null;
	Money a = null;
	Money b = null;

	@Before  // @Test가 실행되기 전에 실행
	public void bebe() {
		Money c = null;
		Money a = new Money(10, "won");
		Money b = new Money(10, "won");
	}
	@Test  // 하나의 테스트 규칙
	public void ttt() {
		//assertNull
		// assertEquals(a,b);
		assertNull(c);
		// assertNotNull(c);
		// assertEquals(a.equals(b), true);
		// assertEquals(a.equals(b), false);
		// assertTrue(a) : a가 true 라고 가정
		// assertFalse(a) : a가 false 라고 가정
		// assertEpuals(a, b) : a , b 가 같다고 가정
		// assertNull(a) : a가 null 이라고 가정
		// assertNotNull(a) : a가 값이 있다고 가정
	}

}
