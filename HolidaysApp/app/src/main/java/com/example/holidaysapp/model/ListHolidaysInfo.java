package com.example.holidaysapp.model;

public class ListHolidaysInfo {

    public HolidayInfo[] listHolydaysinfo;

    public ListHolidaysInfo(int size){
        listHolydaysinfo=new HolidayInfo[size];
    }

    public void addHoliday(String holiday_name, String holiday_date, int id){
        HolidayInfo holiday=new HolidayInfo(holiday_name, holiday_date);
        listHolydaysinfo[id]=holiday;
    }

}
