package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {


        List<day12.task4.MusicBand> band = new ArrayList<>();
        band.add(new day12.task4.MusicBand("Poets of The Fall", 2003));
        band.add(new day12.task4.MusicBand("The Beatles", 1960));
        band.add(new day12.task4.MusicBand("Imagine Dragons", 2008));
        band.add(new day12.task4.MusicBand("Queen", 1970));
        band.add(new day12.task4.MusicBand("Florence and the Machine", 2007));
        band.add(new day12.task4.MusicBand("Nirvana",1987));
        band.add(new day12.task4.MusicBand("Twenty One Pilots",2009));
        band.add(new day12.task4.MusicBand("Led Zeppelin", 1968));
        band.add(new day12.task4.MusicBand("Arctic Monkeys", 2002));
        band.add(new day12.task4.MusicBand("Pink Floyd", 1965));

        band.get(0).addPlayer(List.of("Marko Saaresto", "Olli Tukiainen"));
        band.get(1).addPlayer(List.of("John Lennon", "Paul McCartney"));
        band.get(2).addPlayer(List.of("Dan Reynolds", "Wayne Sermon"));
        band.get(3).addPlayer(List.of("Freddie Mercury", "Brian May"));
        band.get(4).addPlayer(List.of("Florence Welch", "Isabella Summers"));
        band.get(5).addPlayer(List.of("Kurt Cobain", "Krist Novoselic"));
        band.get(6).addPlayer(List.of("Tyler Joseph", "Josh Dun"));
        band.get(7).addPlayer(List.of("Robert Plant", "Jimmy Page"));
        band.get(8).addPlayer(List.of("Alex Turner", "Matt Helders"));
        band.get(9).addPlayer(List.of("Roger Waters", "David Gilmour"));

        band.get(0).printMembers();
        band.get(2).printMembers();
        MusicBand.transferPlayers(band.get(2), band.get(0));
        band.get(0).printMembers();




    }
}
