package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username){
        this.username = username;
        this.subscriptions = new ArrayList<>();

    }

    public String getUsername(){
        return username;
    }

    public List getsubscriptions(){
        return subscriptions;
    }

    public void subscribe(User user){
        user.subscriptions.add(this);
    }

    public boolean isSubscribed(User user){
        if(subscriptions.contains(user)) {
            return true;
        }
        else {
            return false;
        }

    }


    public boolean isFriend(User user, User user1){
        if(user.getsubscriptions().contains(user1) && user1.getsubscriptions().contains(user)){
            return true;
        }
        else{
            return false;
        }
    }


    public void sendMessage(User receiver, String text){
        Message message = new Message(this, receiver, text);
        MessageDatabase.addNewMessage(this, receiver, message);
    }



    public String toString(){
        return "Пользователь " + getUsername() + ".";
    }







}
