package tasks;

public class Task_1 {
    public static void BaseVariables() {
        //byte type example (from -128 to 127)
        byte byteExample = 65;
        System.out.println("Переменная byte: " + byteExample);

        //short type example (from -32,768 to 32,767)
        short shortExample = -19999;
        System.out.println("Переменная short: " + shortExample);

        //int type example (-2,147,483,648 to 2,147,483,647)
        int intExample = 1999555444;
        System.out.println("Переменная int: " + intExample);

        //long type example (from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
        long longExample = -2666555999444888777L;
        System.out.println("Переменная long: " + longExample);

        //float type example (up to 7 decimal digits)
        float floatExample = 45.56783f;
        System.out.println("Переменная float: " + floatExample);

        //double type example (up to 15 decimal digits)
        double doubleExample = -299.9476762553;
        System.out.println("Переменная double: " + doubleExample);

        //boolean "and"
        boolean booleanAndExample = (1 < 2) && (10 > 11);
        System.out.println("boolean and: " + booleanAndExample);

        //boolean "or"
        boolean booleanOrExample = (2 <= 3) || (3 >= 4);
        System.out.println("boolean or: " + booleanAndExample);

        //addition example
        int additionExample = 5 + 3;
        System.out.println(additionExample);

        //subtraction example
        int subtractExample = 5 - 3;
        System.out.println(subtractExample);

        //multiplication example
        int multiplicationExample = 5 * 3;
        System.out.println(multiplicationExample);

        //integer division example
        int intDivisionExample = 15 / 3;
        System.out.println(intDivisionExample);

        //float division example
        float floatDivisionExample = 15.0f / 2;
        System.out.println(floatDivisionExample);

        //modulus division example
        int modDivisionExample = 15 % 2;
        System.out.println(modDivisionExample);

        int varA = 2000000000;
        int varB = 1000000000;
        int overflowMaxResult = varA + varB;
        System.out.println(overflowMaxResult);

        int varC = 2000000000;
        int varD = -1000000000;
        int overflowMinResult = varD - varC;
        System.out.println(overflowMinResult);
    }
}
