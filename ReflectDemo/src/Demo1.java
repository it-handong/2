import java.lang.reflect.Field;

/**
 * @description: {@value}
 * @author: handong
 * @date: 2019��11��14������11:45:16
**/
public class Demo1 {

	public static void main(String [] a) {
		try {
			Class<?> studentclazz = Class.forName("Student");
			Field[] declaredFields = studentclazz.getDeclaredFields();
			for (Field field : declaredFields) {
				System.out.println(field.getName());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
