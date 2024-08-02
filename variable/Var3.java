package variable;

public class Var3 {
    public static void main(String[] args) {
        // 정수 -> int를 기본으로 사용하고 리터럴이 20억이 넘어갈 것 같으면 long을 사용한다.
        byte b = 127; // -128 ~ 127 (1byte, 2^8)
        short s = -32767; // = -32,768 ~ 32,767 (2byte, 2^16)
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (약 20억) (4byte, 2^32)
        long l = 9223372036854775807L;  // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 (8byte, 2^64)
                                       // long의 리터럴이 2147483647를 넘어가면 리터럴 뒤에 L을 붙여줘야 한다. -> long l = 2147483648L;

        // 실수 -> double을 기본적으로 사용한다.(float은 정밀도가 낮다.)
        float f = 10.0f; // 4byte // float의 리터럴 뒤에는 f를 붙여줘야 한다.
        double d = 10.0; // 8byte

        // 기타
        boolean bool = true; // 1byte
        char c = 'A'; // 1byte // 문자 하나만을 표현하는 일은 거의 없다. 심지어 문자 하나를 표현한다고 해도 String c = "b"; 와 같이 String을  사용하면 된다.
        String str = "abc"; // 문자의 길이애 따라 메모리 사용량이 달라짐
    }
}
