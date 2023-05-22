package beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class NewCalculateInterest implements MethodReplacer {

	public Object reimplement(Object object1, Method method, Object[] object2) throws Throwable {
		System.out.println("New Calculate Interest method.....");
		return object1;
	}
}