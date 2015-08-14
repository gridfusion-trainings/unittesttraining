package junitfeatures;

import org.junit.Test;

/**
 * Created by gridfusion on 13/08/15.
 */
public class ExpectedExceptionsTest {

    @Test(expected=RuntimeException.class)
    public void expectedException() throws Exception {
        throw new RuntimeException();
    }
}
