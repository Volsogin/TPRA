package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> players;

    public MusicBand(String name, int year){
        this.name = name;
        this.year = year;
        this.players = new ArrayList<>();

    }

    public void removePlayers(List<String> playersToRemove) {
        players.removeAll(playersToRemove);
    }

    public void clearPlayers() {
        players.clear();
    }


    public static void transferPlayers(MusicBand fromBand, MusicBand toBand) {
        toBand.addPlayer(fromBand.getPlayers());
        fromBand.clearPlayers();
    }



    public int getYear(){
        return year;
    }


    public String toString(){
        return name + " была создана в " + getYear() + " году";
    }

    public void addPlayer(List<String> newPlayers) {
        players.addAll(newPlayers);
    }

    public void printMembers() {
        System.out.println("Музыкальная группа " + name + " Участники: " + players);
    }

    public List<String> getPlayers(){
        return players;
    }



}
