package co.micol.tv;

public class BeanFactory {
	public static Object getBean(String beanName) {
		if (beanName.equals("samsung")) {
			return new SamsungTV();
		}
		else if (beanName.equals("lg")) {
			return new LgTV();
		}
		return null;
		
	}
}
