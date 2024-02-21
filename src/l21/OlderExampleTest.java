package l21;

import org.junit.jupiter.api.*;

public class OlderExampleTest {

    static int var1;

    @BeforeAll
    public static void setUpClass() {
        var1 = 2;
        System.out.println("SetUpClass()");
    }

    @BeforeEach
    public void Set() {
        System.out.println("SetUp()");
    }

    @Test
    public void TestX() {
        System.out.println("TestX()");
        int value = 2 + 2;
        Assertions.assertEquals(5, value, "Лож это правда");
    }

    @Test
    public void TestY() {
        System.out.println("TestY()");
    }

    @Test
    public void TestZ() {
        System.out.println("TestZ()");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("tearDown()");
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("tearDownClass()");
    }
}
