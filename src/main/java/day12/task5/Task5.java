package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<day12.task5.MusicBand> band = new ArrayList<>();
        band.add(new day12.task5.MusicBand("Poets of The Fall", 2003));
        band.add(new day12.task5.MusicBand("The Beatles", 1960));
        band.add(new day12.task5.MusicBand("Imagine Dragons", 2008));
        band.add(new day12.task5.MusicBand("Queen", 1970));
        band.add(new day12.task5.MusicBand("Florence and the Machine", 2007));
        band.add(new day12.task5.MusicBand("Nirvana",1987));
        band.add(new day12.task5.MusicBand("Twenty One Pilots",2009));
        band.add(new day12.task5.MusicBand("Led Zeppelin", 1968));
        band.add(new day12.task5.MusicBand("Arctic Monkeys", 2002));
        band.add(new day12.task5.MusicBand("Pink Floyd", 1965));



        List<MusicArtist> poetsOfTheFallMembers = List.of(
                new MusicArtist("Marko Saaresto", 50),
                new MusicArtist("Olli Tukiainen", 48)
        );
        band.get(0).addPlayer(poetsOfTheFallMembers);

        List<MusicArtist> beatlesMembers = List.of(
                new MusicArtist("John Lennon", 40),
                new MusicArtist("Paul McCartney", 79),
                new MusicArtist("George Harrison", 58),
                new MusicArtist("Ringo Starr", 80)
        );
        band.get(1).addPlayer(beatlesMembers);

        band.get(0).printMembers();
        band.get(1).printMembers();
        MusicBand.transferPlayers(band.get(0), band.get(1));
        band.get(1).printMembers();






    }
}
