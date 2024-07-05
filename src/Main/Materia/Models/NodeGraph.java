package Main.Materia.Models;

import java.util.ArrayList;
import java.util.List;

public class NodeGraph<T> {
    public T user;
    public List<T> friends;

    public NodeGraph(T user) {
        this.user = user;
        this.friends = new ArrayList<>();
    }

    public void addFriend(T friend) {
        friends.add(friend);
    }

    public List<T> getFriends() {
        return friends;
    }

    public T getUser() {
        return user;
    }

    public void setUser(T user) {
        this.user = user;
    }
}
