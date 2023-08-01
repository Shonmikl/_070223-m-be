package org.example._2023_08_01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * \A - выражение в начале стринги
 * \B - граница НЕ слова и НЕ числа
 * \b - граница слова или числа
 * \Z - выражение в конце стринги
 */
public class Re1 {
    public static void main(String[] args) {
        String s = "El Tesla Model Y se ha coronado como " +
                "el modelo más vendido@gmail.com en el primer semestre de 2023 en Europa. " +
                "Según los datos ofrecidos por la consultora Jato Dynamics, " +
                "se han comercial444_izado@gmail.com un total de 136.564 unidades del " +
                "eléctrico de la firma de Elon Musk, es decir, un 204% más que " +
                "en el mismo peeriodo del ejercicio@yahoo.com anterior peeeeeeeeeeee";
        //AADDSFFFSDAGGSJH -> 3A3D

//        Pattern pattern = Pattern.compile("\\b\\d{4}\\b");
//        Pattern pattern = Pattern.compile("\\+\\d{5}");
//        Pattern pattern = Pattern.compile("\\w+@\\w+\\.(ru|com)");
//        Pattern pattern = Pattern.compile("\\D{2,6}");
//        Pattern pattern = Pattern.compile("(ab){2,}");
//        Pattern pattern = Pattern.compile("p(e)?");
        Pattern pattern = Pattern.compile("p(e)*");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println("Pos: " + matcher.start() + " : " + matcher.group());
        }
    }
}