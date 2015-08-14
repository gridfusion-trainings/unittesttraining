package net.gridfusion;

import org.junit.Test;

/**
 * Created by gridfusion on 13/08/15.
 */
public class ExecutionOrderTest {

    @Test
    public void bTest()
    {
        System.out.println("=== B TEST ===");
    }

    @Test
    public void aTest()
    {
        System.out.println("=== A TEST ===");
    }

    @Test
    public void cTest()
    {
        System.out.println("=== C TEST ===");
    }


}
