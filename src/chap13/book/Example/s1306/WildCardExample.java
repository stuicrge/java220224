package chap13.book.Example.s1306;
import java.util.Arrays;
public class WildCardExample {
	public static void registerCouse(Course<?> course) {
		System.out.println(course.getName()+"수강생: "+ Arrays.toString(course.getStudents()));
	}
}
