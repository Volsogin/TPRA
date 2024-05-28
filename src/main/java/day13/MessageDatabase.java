package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList();

    public static void addNewMessage(User sender, User receiver, Message message ){
        messages.add(message);
    }

    public static List<Message> getMessages(){
        return messages;
    }

    public static void showDialog(User sender, User receiver){
        for (Message message : messages) {
            if ((message.getSender().equals(sender) && message.getReceiver().equals(receiver)) ||
                    (message.getSender().equals(receiver) && message.getReceiver().equals(sender))) {
                System.out.println(message);
            }
        }
    }



}
