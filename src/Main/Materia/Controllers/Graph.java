package Main.Materia.Controllers;

import java.util.ArrayList;
import java.util.List;
import Main.Materia.Models.NodeGraph;
import Main.Materia.Models.User;

public class Graph<T> {
    private List<NodeGraph<T>> nodes;

    public Graph() {
        this.nodes = new ArrayList<>();
    }

    public void addNode(NodeGraph<T> node) {
        nodes.add(node);
    }

    public void addConnection(NodeGraph<T> node1, NodeGraph<T> node2) {
        node1.addFriend(node2.getUser());
        node2.addFriend(node1.getUser());
    }

    public List<T> getFriends(NodeGraph<T> node) {
        return node.getFriends();
    }

    public List<T> recommendFriends(NodeGraph<T> node) {
        // Este método sería implementado por RecommendationEngine
        return new ArrayList<>();
    }

    public List<NodeGraph<T>> getNodes() {
        return nodes;
    }
}
