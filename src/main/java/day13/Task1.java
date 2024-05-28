package day13;

public class Task1 {
    public static void main(String[] args) {
        User Alexey = new User("Alexey");
        User Sergey = new User("Sergey");
        User Bot = new User("Bot");
        Sergey.subscribe(Alexey);
        Sergey.subscribe(Bot);
        Alexey.subscribe(Bot);

        Alexey.sendMessage(Sergey,"Hi, bro!");
        Alexey.sendMessage(Sergey,"I need your help");
        Sergey.sendMessage(Alexey,"Рш, нуы, рщц сфт Ш рудз?");
        Sergey.sendMessage(Alexey,"Sorry");
        Sergey.sendMessage(Alexey,"Hi, yes, how can I help?");
        Bot.sendMessage(Alexey,"Hello, Aleksey.");
        Bot.sendMessage(Alexey,"Your subscription will end soon.");
        Bot.sendMessage(Alexey,"Pay for it in the next few days if you don’t want to lose access to its privileges");
        Alexey.sendMessage(Bot,"I can’t renew it right now.");
        Alexey.sendMessage(Bot,"Oh, you're a damn bot.");
        Alexey.sendMessage(Bot,"Bye bye.");
        Bot.sendMessage(Alexey,"Rate my work from 0 to 10.");
        MessageDatabase.showDialog(Alexey,Bot);





    }
}
