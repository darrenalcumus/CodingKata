package com.darren.mirrorclock;

import junit.framework.TestCase;
import org.junit.Test;

public class TestBase12MirrorClock extends TestCase
{
    @Test
    public void testReturnMinutes()
    {
        IMirrorClock clock = new Base12MirrorClock();
        String returnedTime = clock.whatIsTheTime("12:22");
        String returnedMinutes = returnedTime.split(":")[1];
        assertEquals("38", returnedMinutes);
    }

    @Test
    public void testReturnMinutesGreaterThan30()
    {
        IMirrorClock clock = new Base12MirrorClock();
        String returnedTime = clock.whatIsTheTime("12:36");
        String returnedMinutes = returnedTime.split(":")[1];
        assertEquals("24", returnedMinutes);
    }

    @Test
    public void testReturnHours()
    {
        IMirrorClock clock = new Base12MirrorClock();
        String[] returnedTime = clock.whatIsTheTime("01:36").split(":");
        String sReturnedHours = returnedTime[0];
        String sReturnedMinutes = returnedTime[1];
        assertEquals("24", sReturnedMinutes);
        assertEquals("10", sReturnedHours);
    }

    @Test
    public void testProvidedCase1()
    {
        String sProvidedTime = "05:25";
        IMirrorClock clock = new Base12MirrorClock();
        String sReturnedTime = clock.whatIsTheTime(sProvidedTime);
        assertEquals("06:35", sReturnedTime);
    }

    @Test
    public void testProvidedCase2()
    {
        String sProvidedTime = "01:50";
        IMirrorClock clock = new Base12MirrorClock();
        String sReturnedTime = clock.whatIsTheTime(sProvidedTime);
        assertEquals("10:10", sReturnedTime);
    }

    @Test
    public void testProvidedCase3()
    {
        String sProvidedTime = "11:58";
        IMirrorClock clock = new Base12MirrorClock();
        String sReturnedTime = clock.whatIsTheTime(sProvidedTime);
        assertEquals("12:02", sReturnedTime);
    }

    @Test
    public void testProvidedCase4()
    {
        String sProvidedTime = "12:01";
        IMirrorClock clock = new Base12MirrorClock();
        String sReturnedTime = clock.whatIsTheTime(sProvidedTime);
        assertEquals("11:59", sReturnedTime);
    }
}
