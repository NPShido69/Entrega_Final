package Main.Materia.Controllers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* ----------------------------------- */
import Main.Materia.Models.NodeGraph;
import Main.Materia.Models.User;

public class RecommentationEngine {

    public List<User> recommendFriends(NodeGraph<User> node, Graph<User> graph) {
        List<User> recommendations = new ArrayList<>();
        for (NodeGraph<User> potentialFriend : graph.getNodes()) {
            User potentialFriendUser = potentialFriend.getUser();
            if (!node.getFriends().contains(potentialFriend) &&
                    !node.getUser().equals(potentialFriendUser)) {
                double similarity = calculateSimilarity(node.getUser(), potentialFriendUser);
                if (similarity > 0.3) {
                    recommendations.add(potentialFriendUser);
                }
            }
        }
        return recommendations;
    }

    private double calculateSimilarity(User user1, User user2) {
        Set<String> interests1 = new HashSet<>(user1.getInterests());
        Set<String> interests2 = new HashSet<>(user2.getInterests());
        Set<String> intersection = new HashSet<>(interests1);
        intersection.retainAll(interests2);
        Set<String> union = new HashSet<>(interests1);
        union.addAll(interests2);

        double resp = (double) intersection.size() / union.size();
        System.out.println("Valor - " + resp);

        return resp;

    }
}
