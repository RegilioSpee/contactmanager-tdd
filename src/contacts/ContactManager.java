package contacts;

public class ContactManager {
    // Fields:
    Contact[] myFriends;
    int friendsCount;

    // Constructor:
    public ContactManager(){
        friendsCount = 0;
        myFriends = new Contact[500];
    }

    // Methods:
    public void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    Contact searchContact(String searchName){
        for(int i=0; i<friendsCount; i++){
            if(myFriends[i].getName().equals(searchName)){
                return myFriends[i];
            }
        }
        return null;
    }

    public int getFriendsCount() {
        return friendsCount;
    }
}