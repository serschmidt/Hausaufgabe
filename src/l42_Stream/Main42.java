package l42_Stream;

class Utils {
    public static boolean isInt(String str) {
        try {  // блок с которого все начнется тут
            // если завершится с ошибкой, то перейдет в catche блок
            Integer.valueOf(str);
            // если предыдущая строка успешно отработала, то возвращаем true
            return true;
        } catch (Exception e) {
            return false; // если попали в catch, то возращаем false
        }
    }

    public static boolean isDouble(String str) {
        try {  // блок с которого все начнется тут
            // если завершится с ошибкой, то перейдет в catche блок
            Double.valueOf(str);
            // если предыдущая строка успешно отработала, то возвращаем true
            return true;
        } catch (Exception e) {
            return false; // если попали в catch, то возращаем false
        }
    }

    public static boolean isBoolean(String str) {
        try {  // блок с которого все начнется тут
            // если завершится с ошибкой, то перейдет в catche блок
            //noinspection ResultOfMethodCallIgnored
            Boolean.valueOf(str);
            // если предыдущая строка успешно отработала, то возвращаем true
            return true;
        } catch (Exception e) {
            return false; // если попали в catch, то возращаем false
        }
    }

    public static boolean isEnum(String str, Class<? extends Enum<?>> enumClass) {
        try {  // блок с которого все начнется тут
            // если завершится с ошибкой, то перейдет в catche блок
            enumClass.getField(str);
            // если предыдущая строка успешно отработала, то возвращаем true
            return true;
        } catch (Exception e) {
            return false; // если попали в catch, то возращаем false
        }
    }
}


enum MyEnum {
    VAL1,
    VAL2;
}

public class Main42 {
    // пример использования
    public static void main(String[] args) {
        String booleanValue = "true";
        String integerValue = "100";
        String doubleValue = "10.5";
        String myEnumValue = "VAL1";

        if (Utils.isBoolean(booleanValue)) {
            System.out.println(booleanValue + " is boolean");
        }

        if (Utils.isInt(integerValue)) {
            System.out.println(integerValue + " is integer");
        }

        if (Utils.isDouble(doubleValue)) {
            System.out.println(doubleValue + " is double");
        }

        if (Utils.isEnum(myEnumValue, MyEnum.class)) {
            System.out.println(myEnumValue + " is MyEnum");
        }
    }
}