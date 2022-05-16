/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sky.annotation;

import lombok.Getter;

/**
 *
 * @author szekai
 */
@Getter
public class Annotated {
    @Test2(info = "AWESOME")
    private String myParam;
    @Test(info = "AWESOME")
    public void foo(String myParam) {
        System.out.println("This is " + myParam);
    }
}
