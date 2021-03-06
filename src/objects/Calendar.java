package objects;

import java.util.ArrayList;

public class Calendar {
    private String month;
    private String week;
    private int groupId;
    private ArrayList<Day> days;

    public void addEvent(Event e, int day){
        days.get(day).insertEvent(e);
    }

    public void removeEvent(int eventId, int day){
        days.get(day).removeEvent(eventId);
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public ArrayList<Day> getDays() {
        return days;
    }

    public void setDays(ArrayList<Day> days) {
        this.days = days;
    }
}
