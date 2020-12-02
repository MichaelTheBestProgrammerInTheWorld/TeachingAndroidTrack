package session2.variables;

import java.text.DecimalFormat;

public class NumDemo {


    public static void main(String[] args) {

        float f1 = 15.123456f;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println(decimalFormat.format(f1));

    }
}
