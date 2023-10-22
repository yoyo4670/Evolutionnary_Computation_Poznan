import extraction.node_extraction;
import extraction.distance_matrix;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //Extract the data and init the distance matrix and the weight list
        node_extraction node_extraction = new node_extraction("C:\\Users\\Yoann\\IdeaProjects\\Evolutionnary Computation\\src\\TSPD.csv");
        distance_matrix matrix = extraction.node_extraction.getMatrix();
        ArrayList<Integer> weight_list = node_extraction.getWeight_list();


        //Generate 200 random solutions
        ArrayList<Solution> randomSolutions = new ArrayList<Solution>();
        //Initiate the timer to measure the execution time
        long startTime = System.nanoTime();
        for (int i = 0; i < 200; i++) {
            randomSolutions.add(randomHamiltonianCycle(matrix, weight_list));
        }
        //Print the execution time
        long endTime = System.nanoTime();
        System.out.println("Execution time random : " + (endTime - startTime) / 1000000 + " ms");
        //Sort the solutions
        randomSolutions.sort(Comparator.comparing(Solution::getCost));
        //Print the best solution
        System.out.println("Best solution random : " + randomSolutions.get(0).getCost());
        //Print the worst solution
        System.out.println("Worst solution random : " + randomSolutions.get(randomSolutions.size() - 1).getCost());
        //Print the average solution
        System.out.println("Average solution random : " + randomSolutions.stream().mapToInt(Solution::getCost).sum() / randomSolutions.size());




        //Generate nearest neighbor solutions for each node
        ArrayList<Solution> nearestNeighborSolutions = new ArrayList<Solution>();
        //Initiate the timer to measure the execution time
        long startTime2 = System.nanoTime();
        for (int i = 0; i < matrix.getMatrix().size(); i++) {
            nearestNeighborSolutions.add(NearestNeighbor(matrix, weight_list, i));
        }
        //Print the execution time
        long endTime2 = System.nanoTime();
        System.out.println("Execution time nearest neighbor : " + (endTime2 - startTime2) / 1000000 + " ms");
        //Sort the solutions
        nearestNeighborSolutions.sort(Comparator.comparing(Solution::getCost));
        //Print the best solution
        System.out.println("Best solution nearest neighbor : " + nearestNeighborSolutions.get(0).getCost());
        //Print the worst solution
        System.out.println("Worst solution nearest neighbor : " + nearestNeighborSolutions.get(nearestNeighborSolutions.size() - 1).getCost());
        //Print the average solution
        System.out.println("Average solution nearest neighbor : " + nearestNeighborSolutions.stream().mapToInt(Solution::getCost).sum() / nearestNeighborSolutions.size());

        //Generate greedy cycle solutions for each node
        ArrayList<Solution> greedyCycleSolutions = new ArrayList<Solution>();
        //Initiate the timer to measure the execution time
        long startTime3 = System.nanoTime();
        for (int i = 0; i < matrix.getMatrix().size(); i++) {
            greedyCycleSolutions.add(GreedyCycle(i, weight_list,matrix ));
        }
        //Print the execution time
        long endTime3 = System.nanoTime();
        System.out.println("Execution time greedy cycle : " + (endTime3 - startTime3) / 1000000 + " ms");
        //Sort the solutions
        greedyCycleSolutions.sort(Comparator.comparing(Solution::getCost));
        //Print the best solution
        System.out.println("Best solution greedy cycle : " + greedyCycleSolutions.get(0).getCost());
        //Print the worst solution
        System.out.println("Worst solution greedy cycle : " + greedyCycleSolutions.get(greedyCycleSolutions.size() - 1).getCost());
        //Print the average solution
        System.out.println("Average solution greedy cycle : " + greedyCycleSolutions.stream().mapToInt(Solution::getCost).sum() / greedyCycleSolutions.size());

        //Generate greedy cycle solutions for each node
        ArrayList<Solution> greedyCycleSolutionsRegret = new ArrayList<Solution>();
        //Initiate the timer to measure the execution time
        long startTime4 = System.nanoTime();
        for (int i = 0; i < matrix.getMatrix().size(); i++) {
            greedyCycleSolutionsRegret.add(Greedy2Regret(i, weight_list,matrix ));
        }
        //Print the execution time
        long endTime4 = System.nanoTime();
        System.out.println("Execution time greedy cycle : " + (endTime4 - startTime4) / 1000000 + " ms");
        //Sort the solutions
        greedyCycleSolutionsRegret.sort(Comparator.comparing(Solution::getCost));
        //Print the best solution
        System.out.println("Best solution greedy cycle 2regret : " + greedyCycleSolutionsRegret.get(0).getCost());
        //Print the worst solution
        System.out.println("Worst solution greedy cycle 2regret : " + greedyCycleSolutionsRegret.get(greedyCycleSolutionsRegret.size() - 1).getCost());
        //Print the average solution
        System.out.println("Average solution greedy cycle 2regret : " + greedyCycleSolutionsRegret.stream().mapToInt(Solution::getCost).sum() / greedyCycleSolutionsRegret.size());


        //Generate greedy cycle solutions for each node
        ArrayList<Solution> greedyCycleSolutionsSum2Regret = new ArrayList<Solution>();
        //Initiate the timer to measure the execution time
        long startTime5 = System.nanoTime();
        for (int i = 0; i < matrix.getMatrix().size(); i++) {
            greedyCycleSolutionsSum2Regret.add(GreedySum2Regret(i, weight_list,matrix,1,1 ));
        }
        //Print the execution time
        long endTime5 = System.nanoTime();
        System.out.println("Execution time greedy cycle : " + (endTime5 - startTime5) / 1000000 + " ms");
        //Sort the solutions
        greedyCycleSolutionsSum2Regret.sort(Comparator.comparing(Solution::getCost));
        //Print the best solution
        System.out.println("Best solution greedy cycle sum 2regret : " + greedyCycleSolutionsSum2Regret.get(0).getCost());
        //Print the worst solution
        System.out.println("Worst solution greedy cycle sum 2regret : " + greedyCycleSolutionsSum2Regret.get(greedyCycleSolutionsSum2Regret.size() - 1).getCost());
        //Print the average solution
        System.out.println("Average solution greedy cycle sum 2regret : " + greedyCycleSolutionsSum2Regret.stream().mapToInt(Solution::getCost).sum() / greedyCycleSolutionsSum2Regret.size());



        //Save the best solution for each method as a csv file
        randomSolutions.get(0).saveSolution("random");
        nearestNeighborSolutions.get(0).saveSolution("nearestNeighbor");
        greedyCycleSolutions.get(0).saveSolution("greedyCycle");
        greedyCycleSolutionsRegret.get(0).saveSolution("greedyCycleRegret");
        greedyCycleSolutionsSum2Regret.get(0).saveSolution("greedyCycleSum2Regret");

    }


    public static Solution randomHamiltonianCycle(distance_matrix matrix, ArrayList<Integer> weight_list) {
        //Number of nodes to visit, even the number if odd
        int numberNodeToVisit = matrix.getMatrix().size() / 2;
        if (numberNodeToVisit % 2 != 0) {
            numberNodeToVisit++;
        }
        //List of visited nodes and cost of the path
        ArrayList<Integer> visitedNodes = new ArrayList<Integer>();
        int cost = 0;
        //Random select a non visited node
        for (int i = 0; i < numberNodeToVisit; i++) {
            int randomNode = (int) (Math.random() * matrix.getMatrix().size());
            while (visitedNodes.contains(randomNode)) {
                randomNode = (int) (Math.random() * matrix.getMatrix().size());
            }
            visitedNodes.add(randomNode);
            //Add the cost of the path to the next node
            if (i == 0) {
                cost += weight_list.get(visitedNodes.get(i));
            } else if (i == numberNodeToVisit - 1) {
                cost += matrix.getMatrix().get(visitedNodes.get(i)).get(visitedNodes.get(0)) + weight_list.get(visitedNodes.get(i));
            } else {
                cost += matrix.getMatrix().get(visitedNodes.get(i - 1)).get(visitedNodes.get(i)) + weight_list.get(visitedNodes.get(i));
            }

        }


        return new Solution(cost,visitedNodes);
    }

    //Nearest neighbor algorithm
    public static Solution NearestNeighbor(distance_matrix matrix,ArrayList<Integer> weight_list,int startNode){
        //Number of nodes to visit, even the number if odd
        int numberNodeToVisit = matrix.getMatrix().size() / 2;
        if (numberNodeToVisit % 2 != 0) {
            numberNodeToVisit++;
        }
        //List of visited nodes and cost of the path
        ArrayList<Integer> visitedNodes = new ArrayList<Integer>();
        visitedNodes.add(startNode);
        int cost = weight_list.get(startNode);
        //Random select a non visited vertex
        for (int i = 1; i < numberNodeToVisit; i++) {
            //Select the lowest cost non visited vertex
            int lowestCostNode = 0;
            int lowestCost = Integer.MAX_VALUE;
            for (int j = 0; j < matrix.getMatrix().size(); j++) {
                if (!visitedNodes.contains(j) && matrix.getMatrix().get(visitedNodes.get(i-1)).get(j) + weight_list.get(j) < lowestCost) {
                    lowestCostNode = j;
                    lowestCost = matrix.getMatrix().get(visitedNodes.get(i-1)).get(j) + weight_list.get(j);
                }
            }
            visitedNodes.add(lowestCostNode);
            //Add the cost of the path to the next vertex
            if (i == 0) {
                cost += weight_list.get(visitedNodes.get(i));
            } else if (i == numberNodeToVisit - 1) {
                cost += matrix.getMatrix().get(visitedNodes.get(i)).get(visitedNodes.get(0)) + weight_list.get(visitedNodes.get(i));
            } else {
                cost += matrix.getMatrix().get(visitedNodes.get(i - 1)).get(visitedNodes.get(i)) + weight_list.get(visitedNodes.get(i));
            }
        }
        return new Solution(cost,visitedNodes);
    }



    public static Solution GreedyCycle(int start, List<Integer> weights, distance_matrix matrix) {
        int n = weights.size();
        int result = 0;
        List<Integer> costsCopy = new ArrayList<>(weights);
        result += costsCopy.get(start);
        costsCopy.set(start, Integer.MAX_VALUE);
        List<Integer> nodes = new ArrayList<>();
        nodes.add(start);

        // First node
        int[] near = new int[n];
        for (int i = 0; i < n; i++) {
            near[i] = matrix.getDistance(start, i) + costsCopy.get(i);
            if (costsCopy.get(i) == Integer.MAX_VALUE) {
                near[i] = Integer.MAX_VALUE;
            }
        }
        int node = indexOfMin(near);
        result += costsCopy.get(node);
        result += matrix.getDistance(start, node) * 2;
        nodes.add(node);
        costsCopy.set(node, Integer.MAX_VALUE);

        // Other nodes
        for (int count = 0; count < (n + 1) / 2 - 2; count++) {
            int bestCost = Integer.MAX_VALUE;
            int previousNode = 0;

            for (int i = 0; i < nodes.size(); i++) {
                for (int j = 0; j < n; j++) {
                    if (costsCopy.get(j) != Integer.MAX_VALUE) {
                        int newCost = matrix.getDistance(nodes.get(i), j)
                                + costsCopy.get(j) + matrix.getDistance(j, nodes.get((i + 1) % nodes.size()))
                                - matrix.getDistance(nodes.get(i), nodes.get((i + 1) % nodes.size()));

                        if (newCost < bestCost) {
                            bestCost = newCost;
                            previousNode = i;
                            node = j;
                        }
                    }
                }
            }

            result += bestCost;
            costsCopy.set(node, Integer.MAX_VALUE);
            nodes.add(previousNode + 1, node);
        }

        return new Solution(result, new ArrayList<>(nodes));
    }
    private static int indexOfMin(int[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }


    //Greedy 2-regret algorithm
    public static Solution Greedy2Regret(int start, List<Integer> weights, distance_matrix matrix){
        int n = weights.size();
        int result = 0;
        List<Integer> costsCopy = new ArrayList<>(weights);
        result += costsCopy.get(start);
        costsCopy.set(start, Integer.MAX_VALUE);
        List<Integer> nodes = new ArrayList<>();
        nodes.add(start);

        // First node
        int[] near = new int[n];
        for (int i = 0; i < n; i++) {
            near[i] = matrix.getDistance(start, i) + costsCopy.get(i);
            if (costsCopy.get(i) == Integer.MAX_VALUE) {
                near[i] = Integer.MAX_VALUE;
            }
        }
        int node = indexOfMin(near);
        result += costsCopy.get(node);
        result += matrix.getDistance(start, node) * 2;
        nodes.add(node);
        costsCopy.set(node, Integer.MAX_VALUE);

        // Other nodes
        for (int count = 0; count < (n + 1) / 2 - 2; count++) {
            int maxRegret = Integer.MIN_VALUE;
            //For each node
            for (int i = 0; i < n; i++) {
                int bestCost = Integer.MAX_VALUE;
                int bestCost2 = Integer.MAX_VALUE;
                int previousNode = 0;
                int previousNode2 = 0;
                //If the node is not already in the solution
                if (!nodes.contains(i)) {
                    //For each edge in the solution
                    for (int j = 0; j < nodes.size(); j++) {
                        //Calculate the cost of inserting the node between the two nodes of the edge
                        int newCost = matrix.getDistance(nodes.get(j), i)
                                + costsCopy.get(i) + matrix.getDistance(i, nodes.get((j + 1) % nodes.size()))
                                - matrix.getDistance(nodes.get(j), nodes.get((j + 1) % nodes.size()));
                        //If the cost is lower than the best cost
                        if (newCost < bestCost) {
                            //Save the best cost and the previous node
                            bestCost2 = bestCost;
                            previousNode2 = previousNode;
                            bestCost = newCost;
                            previousNode = j;
                        }
                    }
                    //Calculate the regret of the node
                    int regret = bestCost2 - bestCost;

                    //If the regret is higher than the max regret
                    if (regret > maxRegret) {
                        //Save the node
                        maxRegret = regret;
                        node = i;
                    }
                }
            }

            //Get the best cost and the previous node for the node with the highest regret
            int bestCost = Integer.MAX_VALUE;
            int previousNode = 0;
            for (int j = 0; j < nodes.size(); j++) {
                int newCost = matrix.getDistance(nodes.get(j), node)
                        + costsCopy.get(node) + matrix.getDistance(node, nodes.get((j + 1) % nodes.size()))
                        - matrix.getDistance(nodes.get(j), nodes.get((j + 1) % nodes.size()));
                if (newCost < bestCost) {
                    bestCost = newCost;
                    previousNode = j;
                }
            }
            //Add the node to the solution
            result += bestCost;
            costsCopy.set(node, Integer.MAX_VALUE);
            nodes.add(previousNode + 1, node);

        }
        return new Solution(result, new ArrayList<>(nodes));
    }

    //Greedy heuristics with a weighted sum criterion and 2 regret
    public static Solution GreedySum2Regret(int start, List<Integer> weights, distance_matrix matrix, int weightForCost, int weightForRegret){
        int n = weights.size();
        int result = 0;
        List<Integer> costsCopy = new ArrayList<>(weights);
        result += costsCopy.get(start);
        costsCopy.set(start, Integer.MAX_VALUE);
        List<Integer> nodes = new ArrayList<>();
        nodes.add(start);

        // First node
        int[] near = new int[n];
        for (int i = 0; i < n; i++) {
            near[i] = matrix.getDistance(start, i) + costsCopy.get(i);
            if (costsCopy.get(i) == Integer.MAX_VALUE) {
                near[i] = Integer.MAX_VALUE;
            }
        }
        int node = indexOfMin(near);
        result += costsCopy.get(node);
        result += matrix.getDistance(start, node) * 2;
        nodes.add(node);
        costsCopy.set(node, Integer.MAX_VALUE);

        // Other nodes
        for (int count = 0; count < (n + 1) / 2 - 2; count++) {
            int maxHeuristicFunction = Integer.MIN_VALUE;
            //For each node
            for (int i = 0; i < n; i++) {
                int bestCost = Integer.MAX_VALUE;
                int bestCost2 = Integer.MAX_VALUE;
                int previousNode = 0;
                int previousNode2 = 0;
                //If the node is not already in the solution
                if (!nodes.contains(i)) {
                    //For each edge in the solution
                    for (int j = 0; j < nodes.size(); j++) {
                        //Calculate the cost of inserting the node between the two nodes of the edge
                        int newCost = matrix.getDistance(nodes.get(j), i)
                                + costsCopy.get(i) + matrix.getDistance(i, nodes.get((j + 1) % nodes.size()))
                                - matrix.getDistance(nodes.get(j), nodes.get((j + 1) % nodes.size()));
                        //If the cost is lower than the best cost
                        if (newCost < bestCost) {
                            //Save the best cost and the previous node
                            bestCost2 = bestCost;
                            previousNode2 = previousNode;
                            bestCost = newCost;
                            previousNode = j;
                        }
                    }
                    //Calculate the regret of the node
                    int regret = bestCost2 - bestCost;

                    //Sum the opposite of the cost and the regret, maximise the sum
                    int sum = - weightForCost * bestCost + weightForRegret * regret;

                    //If the sum is higher than the max sum
                    if (sum > maxHeuristicFunction) {
                        //Save the node
                        maxHeuristicFunction = sum;
                        node = i;
                    }

                }
            }

            //Get the best cost and the previous node for the node with the highest regret
            int bestCost = Integer.MAX_VALUE;
            int previousNode = 0;
            for (int j = 0; j < nodes.size(); j++) {
                int newCost = matrix.getDistance(nodes.get(j), node)
                        + costsCopy.get(node) + matrix.getDistance(node, nodes.get((j + 1) % nodes.size()))
                        - matrix.getDistance(nodes.get(j), nodes.get((j + 1) % nodes.size()));
                if (newCost < bestCost) {
                    bestCost = newCost;
                    previousNode = j;
                }
            }
            //Add the node to the solution
            result += bestCost;
            costsCopy.set(node, Integer.MAX_VALUE);
            nodes.add(previousNode + 1, node);

        }
        return new Solution(result, new ArrayList<>(nodes));
    }

}