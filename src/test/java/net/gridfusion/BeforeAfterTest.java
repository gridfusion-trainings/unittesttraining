package net.gridfusion;

import org.junit.*;

/**
 * Created by gridfusion on 13/08/15.
 */
public class BeforeAfterTest {

    @BeforeClass
    public static void beforeClass() {

        System.out.println("=== Before Class ===");
    }

    @AfterClass
    public static void afterClass() {

        System.out.println("=== After Class ===");
    }

    @Before
    public void before() {

        System.out.println("=== Before Method ===");
    }

    @After
    public void after() {

        System.out.println("=== After Method ===");
    }

    @Test
    public void test1() {

        System.out.println("*** Test1 ***");
    }

    @Test
    public void test2() {

        System.out.println("*** Test2 ***");
    }

}
