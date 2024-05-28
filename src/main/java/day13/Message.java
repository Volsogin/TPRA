package day13;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Message {
    private User sender;
    private User receiver;
    private String text;
    private Date date;
    Calendar calendar = new GregorianCalendar();


    public Message(User sender, User receiver, String text){
        this.text = text;
        this.sender = sender;
        this.receiver = receiver;
        Date date = calendar.getTime();
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public User getReceiver() {
        return receiver;
    }

    public User getSender() {
        return sender;
    }

    public Date getDate() {
        return date;
    }

    public String toString(){
        return "FROM: " + getSender() + "\nTO: " + getReceiver() + "\nON: " + getDate() + "\n" + getText() + "\n";
    }









}
