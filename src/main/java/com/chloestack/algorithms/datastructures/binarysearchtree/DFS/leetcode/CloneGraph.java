package com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode;

import java.util.*;

/**
 * leet 133.
 *
 */
public class CloneGraph {

    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    public Node cloneGraph(Node node) {
        if (node == null) return null;

        Map<Node, Node> map = new HashMap<>();

        Deque<Node> queue = new ArrayDeque<>();
        map.put(node, new Node(node.val));
        queue.addLast(node);

        while (!queue.isEmpty()) {
            Node clone = queue.removeFirst();
            for (Node neighbor : clone.neighbors) {
                if (!map.containsKey(neighbor)) {
                    map.put(neighbor, new Node(neighbor.val));
                    queue.addLast(neighbor);
                }
                map.get(clone).neighbors.add(map.get(neighbor));
            }
        }

        return map.get(node);
    }

    public Node cloneGraph2(Node node) {
        HashMap<Node, Node> mapper = new HashMap<>();
        return dfs(node, mapper);
    }

    private Node dfs(Node node, HashMap<Node, Node> mapper) {
        if (node == null ) {
            return null;
        }

        if(mapper.containsKey(node)) {
            return mapper.get(node);
        }

        Node clone = new Node(node.val);
        mapper.put(node, clone); // A -> B

        List<Node> neighbors = node.neighbors;
        for(Node n : neighbors) { // neighbors of A
            clone.neighbors.add(dfs(n, mapper));
        }

        return clone;
    }



}
