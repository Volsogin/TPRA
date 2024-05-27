package day12.task3;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;

    public MusicBand(String name, int year){
        this.name = name;
        this.year = year;

    }

    public int getYear(){
        return year;
    }


    public String toString(){
        return name + " была создана в " + getYear() + " году";
    }



}
