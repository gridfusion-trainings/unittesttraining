package junitfeatures;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by gridfusion on 13/08/15.
 */
public class IgnoreTest {

    @Test
    public void passingTest(){
        Assert.assertTrue(true);
    }

    @Test
    @Ignore("Hubert is on vacation")
    public void ignoreTest(){
        Assert.assertTrue(false);
    }
}
