package Main.Materia.Controllers;

import java.util.ArrayList;
import java.util.List;

import Main.Materia.Models.NodeGraph;

public class Graph<T> {
    private List<NodeGraph<T>> nodes;

    public Graph() {
        this.nodes = new ArrayList<>();
    }

    public void addNode(NodeGraph<T> node) {
        if (!nodes.contains(node)) {
            nodes.add(node);
        }
    }

    public void addConnection(NodeGraph<T> node1, NodeGraph<T> node2) {
        node1.addFriend(node2);
        node2.addFriend(node1);
    }

    public List<T> getFriends(NodeGraph<T> node) {
        return node.getFriends();
    }

    public List<T> recommendFriends(NodeGraph<T> node) {
        // Este método sería implementado por RecommendationEngine
        //asdasdasdasasd
        return new ArrayList<>();
    }

    public List<NodeGraph<T>> getNodes() {
        return nodes;
    }

    public void printGraph() {
        for (NodeGraph<T> node : nodes) {
            System.out.print("Vertex " + node.getUser() + ":");
            for (NodeGraph<T> neighbor : node.getNeighbors()) {
                System.out.print(" -> " + neighbor.getUser());
            }
            System.out.println();
        }
    }
}
