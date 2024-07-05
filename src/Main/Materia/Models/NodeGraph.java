package Main.Materia.Models;

import java.util.ArrayList;
import java.util.List;

public class NodeGraph<T> {
    private T user;
    private List<NodeGraph<T>> friends;

    public NodeGraph(T user) {
        this.user = user;
        this.friends = new ArrayList<>();
    }

    public void addFriend(NodeGraph<T> friend) {
        if (!friends.contains(friend)) {
            friends.add(friend);
        }
    }

    public List<T> getFriends() {
        List<T> friendUsers = new ArrayList<>();
        for (NodeGraph<T> friend : friends) {
            friendUsers.add(friend.getUser());
        }
        return friendUsers;
    }

    public T getUser() {
        return user;
    }

    public void setUser(T user) {
        this.user = user;
    }

    public List<NodeGraph<T>> getNeighbors() {
        return friends;
    }

    public void print() {
        System.out.println("User: " + user.toString());
        System.out.println("Friends: ");
        for (NodeGraph<T> friend : friends) {
            System.out.println(" -- " + friend.getUser().toString());
        }
    }
}
