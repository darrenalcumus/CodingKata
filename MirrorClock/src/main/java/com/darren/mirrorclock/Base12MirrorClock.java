package com.darren.mirrorclock;

public class Base12MirrorClock implements IMirrorClock
{
    private final int MAX_HOURS = 11;
    private final int MAX_MINUTES = 60;
    private final String TIME_FORMAT = "hh:mm";
    @Override
    public String whatIsTheTime(String timeInMirror)
    {
        String[] timeUnits = timeInMirror.split(":");
        int iMirrorHours = Integer.parseInt(timeUnits[0]);
        int iMirrorMinutes = Integer.parseInt(timeUnits[1]);
        
        int iActualHours;
        if (iMirrorHours == MAX_HOURS)
            iActualHours = MAX_HOURS + 1;
        else if (iMirrorHours > MAX_HOURS)
            iActualHours = MAX_HOURS;
        else
            iActualHours = MAX_HOURS - iMirrorHours;

        int iActualMinutes = MAX_MINUTES - iMirrorMinutes;

        String sActualHours = (iActualHours < 10) ? "0" + iActualHours : "" + iActualHours;
        String sActualMinutes = (iActualMinutes < 10) ? "0" + iActualMinutes : "" + iActualMinutes;

        return sActualHours + ":" + sActualMinutes;
    }
}
