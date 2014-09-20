/**
 * Created by Админ on 17.09.2014.
 */
class Test2 {
    int a;          // Доступ определен по умолчанию
    public int b;   // Открытый доступ
    private int c;  // Закрытый доступ

    // Method access to set the c variable
    void setc(int i) {
        c = i;      // Set c variable
    }
    int getc() {
        return c;   // Get c variable
    }
}
public class AccessTest {
    public static void main(String[] args) {
        Test2 ob = new Test2();     // Create a object for the class

        ob.a = 10;  // Имеет прямой доступ
        ob.b = 20;  // Имеет прямой доступ
        //ob.c = 30;  // Ошибка
        System.out.println("ob.a = " + ob.a + " ob.b = " + ob.b);
        ob.setc(30);
        System.out.println("ob.c = " + ob.getc());
    }
}