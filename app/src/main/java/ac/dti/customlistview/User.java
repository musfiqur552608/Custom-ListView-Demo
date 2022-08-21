package ac.dti.customlistview;

public class User {
    String name, lastMsg, lastMsgTime, phoneNumber, country;
    int imageId;

    public User(String name, String lastMsg, String lastMsgTime, String phoneNumber, String country, int imageId) {
        this.name = name;
        this.lastMsg = lastMsg;
        this.lastMsgTime = lastMsgTime;
        this.phoneNumber = phoneNumber;
        this.country = country;
        this.imageId = imageId;
    }
}
