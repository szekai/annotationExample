/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sky.annotation;

/**
 *
 * @author szekai
 */
public class Annotated {
    @Test(info = "AWESOME")
    public void foo(String myParam) {
        System.out.println("This is " + myParam);
    }
}
