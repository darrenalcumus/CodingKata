import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PendulumSort implements IStrangeSort
{

    @Override
    public List<Integer> sort(List<Integer> input)
    {
        Collections.sort(input);
        List<Integer> newList = new ArrayList<Integer>();
        boolean bIsRight = false;

        for (Integer inputItem : input)
        {
            if (!bIsRight)
            {
                newList.add(0, inputItem);
                bIsRight = true;
            }
            else
            {
                newList.add(newList.size(), inputItem);
                bIsRight = false;
            }
        }

        return newList;
    }
}
