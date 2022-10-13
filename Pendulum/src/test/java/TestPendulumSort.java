import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPendulumSort extends TestCase
{
    @Test
    public void testOne()
    {
        IStrangeSort test = new PendulumSort();
        List<Integer> list = new ArrayList<Integer>();
        list.add(6);
        list.add(6);
        list.add(8);
        list.add(5);
        list.add(10);

        List<Integer> newList = test.sort(list);
        System.out.println(newList.toString());
        assertEquals(new Integer(10), newList.get(0));
        assertEquals(new Integer(6), newList.get(1));
        assertEquals(new Integer(5), newList.get(2));
        assertEquals(new Integer(6), newList.get(3));
        assertEquals(new Integer(8), newList.get(4));

    }

    @Test
    public void testTwo()
    {
        IStrangeSort test = new PendulumSort();
        List<Integer> list = new ArrayList<Integer>();
        list.add(-9);
        list.add(-2);
        list.add(-10);
        list.add(-6);

        List<Integer> newList = test.sort(list);
        System.out.println(newList.toString());
        assertEquals(new Integer(-6), newList.get(0));
        assertEquals(new Integer(-10), newList.get(1));
        assertEquals(new Integer(-9), newList.get(2));
        assertEquals(new Integer(-2), newList.get(3));

    }

    @Test
    public void testThree()
    {
        IStrangeSort test = new PendulumSort();
        List<Integer> list = new ArrayList<Integer>();
        list.add(11);
        list.add(-16);
        list.add(-18);
        list.add(13);
        list.add(-11);
        list.add(-12);
        list.add(3);
        list.add(18);

        List<Integer> newList = test.sort(list);
        System.out.println(newList.toString());
        assertEquals(new Integer(13), newList.get(0));
        assertEquals(new Integer(3), newList.get(1));
        assertEquals(new Integer(-12), newList.get(2));
        assertEquals(new Integer(-18), newList.get(3));
        assertEquals(new Integer(-16), newList.get(4));
        assertEquals(new Integer(-11), newList.get(5));
        assertEquals(new Integer(11), newList.get(6));
        assertEquals(new Integer(18), newList.get(7));
    }
}
