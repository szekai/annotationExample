package sky.annotation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws Exception {
        TestAnnotationParser parser = new TestAnnotationParser();
        parser.parse(Annotated.class);

        var test = parser.parseField(Annotated.class);
        System.out.println(test.getMyParam());
    }
}
