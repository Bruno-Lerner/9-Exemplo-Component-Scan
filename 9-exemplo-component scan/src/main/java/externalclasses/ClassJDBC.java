package externalclasses;

import org.springframework.stereotype.Component;

/**
 * @author Bruno Lerner
 * @version 1.0
 * @since 16/04/2020 11:00
 */
@Component
public class ClassJDBC {

    public ClassJDBC() {
        System.out.println("Conexao JDBC!");
    }
}
