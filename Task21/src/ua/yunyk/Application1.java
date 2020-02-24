package ua.yunyk;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;

public class Application1 {
	
	public static void main(String[] args) throws IOException {
		getAnnotatedFields(Person.class);
	}
	
	public static void getAnnotatedFields(Class<?> customClass) throws IOException {
		
		Field[] fields = customClass.getDeclaredFields();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			
			if(field.getAnnotation(Annotation.class) instanceof Annotation) {
				sb.append(field.getName() + "\n");
			}
		}
		File file = new File("methods.txt");
		Writer wr = new FileWriter(file);
		wr.write(sb.toString());
		wr.close();
	}
	
}
