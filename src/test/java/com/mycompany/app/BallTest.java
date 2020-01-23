package com.mycompany.app;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

/**
 * Unit test for Ball class.
 */
public class BallTest
{

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testBallConstructor() {
        try {
            new Ball();
        } catch (Exception e) {
            fail("Construction failed.");
        }
    }

    @Test
    public void testBallStep()
    {
        try{
            Ball ball = new Ball();
            ball.Step();
            assertEquals(1,1);
        } catch (Exception e) {
            fail("Step method failed.");
        }

    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

}
