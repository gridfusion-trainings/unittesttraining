package junitfeatures;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gridfusion on 13/08/15.
 */
public class AssertionsTest {

        @Test
        public void assertTrueAndFalse() {
            Assert.assertTrue(true);
            Assert.assertFalse("your condition is not false", false);
        }

        @Test
        public void assertNullAndNotNull() {

            Object myobject1 = null;
            Assert.assertNull(myobject1);

            Object myobject2 = new Object();
            Assert.assertNotNull(myobject2);
        }

        @Test
        public void assertEquals() {
            int x = 5;
            int y = 5;

            Assert.assertEquals(x, y);
        }

        @Test
        public void assertNotSame() {

            Integer x = new Integer(5);
            Integer y = new Integer(5);

            Assert.assertNotSame(x, y);
        }

        @Test
        public void assertSame() {

            Integer x = new Integer(5);
            Integer y = x;

            Assert.assertSame(x, y);
        }
    }


