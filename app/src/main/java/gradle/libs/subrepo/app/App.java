/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradle.libs.subrepo.app;

import gradle.libs.utilities.LinkedList;

import static gradle.libs.utilities.StringUtils.join;
import static gradle.libs.utilities.StringUtils.split;
import static gradle.libs.subrepo.app.MessageUtils.getMessage;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        System.out.println(join(tokens));
    }
}
