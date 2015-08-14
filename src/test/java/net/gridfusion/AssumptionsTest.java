package net.gridfusion;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;

/**
 * Created by gridfusion on 13/08/15.
 */
public class AssumptionsTest {

    boolean isSonarRunning = false;

    @Test
    public void assumptions(){
        isSonarRunning = false;
        Assume.assumeFalse(isSonarRunning);
        Assert.assertTrue(true);

    }

}
