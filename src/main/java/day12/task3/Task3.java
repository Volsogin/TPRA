package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    static int i;




    public static void main(String[] args) {
        List<MusicBand> band = new ArrayList<>();
        band.add(new MusicBand("Poets of The Fall", 2003));
        band.add(new MusicBand("The Beatles", 1960));
        band.add(new MusicBand("Imagine Dragons", 2008));
        band.add(new MusicBand("Queen", 1970));
        band.add(new MusicBand("Florence and the Machine", 2007));
        band.add(new MusicBand("Nirvana",1987));
        band.add(new MusicBand("Twenty One Pilots",2009));
        band.add(new MusicBand("Led Zeppelin", 1968));
        band.add(new MusicBand("Arctic Monkeys", 2002));
        band.add(new MusicBand("Pink Floyd", 1965));

        Collections.shuffle(band);
        for(int i = 0; i < band.size(); i++)
            System.out.println(band.get(i));
        System.out.println("");

        List<MusicBand> bandsAfter2000 = groupsAfter2000(band);
        for(int i = 0; i < bandsAfter2000.size(); i++)
            System.out.println(bandsAfter2000.get(i));







    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> result = new ArrayList<>();
        for(MusicBand band : bands){
            if(band.getYear() > 2000)
                result.add(band);

        }
        return result;
    }

}
