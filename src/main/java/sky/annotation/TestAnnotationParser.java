/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sky.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *
 * @author szekai
 */
public class TestAnnotationParser {

    public void parse(Class clazz) throws Exception {
        Method[] methods = clazz.getMethods();


        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)) {
                Test test = method.getAnnotation(Test.class);
                String info = test.info();

                if ("AWESOME".equals(info)) {
                    System.out.println("info is awesome!");
                    // try to invoke the method with param
                    method.invoke(
                            Annotated.class.getDeclaredConstructor().newInstance(),
                            info);
                }
            }
        }
    }

    public <T> T parseField(Class<T> clazz) throws Exception{
        var fields = clazz.getDeclaredFields();
        var obj = clazz.getDeclaredConstructor().newInstance();
        for(Field f: fields){
            var fieldAnnotation = f.getAnnotation(Test2.class);
            if(fieldAnnotation != null){
                f.setAccessible(true);
                f.set(obj, fieldAnnotation.info());
            }
        }
        return obj;
    }
}
