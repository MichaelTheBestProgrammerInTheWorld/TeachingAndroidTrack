package variables;

public class PrimitiveDataTypes {

    public static void main(String[] args) {

        int integerNumber = 55;
        float floatNumber = 10.5f;
        boolean boolValue = true;
        char character = 'M';

        int secondInteger = (int) floatNumber;
        float secondFloat = integerNumber;
        int charInt = character;

//        System.out.println(integerNumber);
//        System.out.println(floatNumber);
//        System.out.println(boolValue);
        System.out.println(character);

        System.out.println(secondInteger);
        System.out.println(secondFloat);
        System.out.println(charInt);
    }
}
