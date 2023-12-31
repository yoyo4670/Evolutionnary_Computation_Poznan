import extraction.node_extraction;
import extraction.distance_matrix;

import java.io.FileNotFoundException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //Extract the data and init the distance matrix and the weight list
        node_extraction node_extraction = new node_extraction("C:\\Users\\Yoann\\IdeaProjects\\Evolutionnary Computation\\src\\TSPC.csv");
        distance_matrix matrix = extraction.node_extraction.getMatrix();
        ArrayList<Integer> weight_list = node_extraction.getWeight_list();


//        //Generate 200 random solutions
//        ArrayList<Solution> randomSolutions = new ArrayList<Solution>();
//        //Initiate the timer to measure the execution time
//        long startTime = System.nanoTime();
//        for (int i = 0; i < 200; i++) {
//            randomSolutions.add(randomHamiltonianCycle(matrix, weight_list));
//        }
//        //Print the execution time
//        long endTime = System.nanoTime();
//        System.out.println("Execution time random : " + (endTime - startTime) / 1000000 + " ms");
//        //Sort the solutions
//        randomSolutions.sort(Comparator.comparing(Solution::getCost));
//        //Print the best solution
//        System.out.println("Best solution random : " + randomSolutions.get(0).getCost());
//        //Print the worst solution
//        System.out.println("Worst solution random : " + randomSolutions.get(randomSolutions.size() - 1).getCost());
//        //Print the average solution
//        System.out.println("Average solution random : " + randomSolutions.stream().mapToInt(Solution::getCost).sum() / randomSolutions.size());
//
////
////
////
//        //Generate nearest neighbor solutions for each node
//        ArrayList<Solution> nearestNeighborSolutions = new ArrayList<Solution>();
//        //Initiate the timer to measure the execution time
//        long startTime2 = System.nanoTime();
//        for (int i = 0; i < matrix.getMatrix().size(); i++) {
//            nearestNeighborSolutions.add(NearestNeighbor(matrix, weight_list, i));
//        }
//        //Print the execution time
//        long endTime2 = System.nanoTime();
//        System.out.println("Execution time nearest neighbor : " + (endTime2 - startTime2) / 1000000 + " ms");
//        //Sort the solutions
//        nearestNeighborSolutions.sort(Comparator.comparing(Solution::getCost));
//        //Print the best solution
//        System.out.println("Best solution nearest neighbor : " + nearestNeighborSolutions.get(0).getCost());
//        //Print the worst solution
//        System.out.println("Worst solution nearest neighbor : " + nearestNeighborSolutions.get(nearestNeighborSolutions.size() - 1).getCost());
//        //Print the average solution
//        System.out.println("Average solution nearest neighbor : " + nearestNeighborSolutions.stream().mapToInt(Solution::getCost).sum() / nearestNeighborSolutions.size());
//
//        //Generate greedy cycle solutions for each node
//        ArrayList<Solution> greedyCycleSolutions = new ArrayList<Solution>();
//        //Initiate the timer to measure the execution time
//        long startTime3 = System.nanoTime();
//        for (int i = 0; i < matrix.getMatrix().size(); i++) {
//            greedyCycleSolutions.add(GreedyCycle(i, weight_list,matrix ));
//        }
//        //Print the execution time
//        long endTime3 = System.nanoTime();
//        System.out.println("Execution time greedy cycle : " + (endTime3 - startTime3) / 1000000 + " ms");
//        //Sort the solutions
//        greedyCycleSolutions.sort(Comparator.comparing(Solution::getCost));
//        //Print the best solution
//        System.out.println("Best solution greedy cycle : " + greedyCycleSolutions.get(0).getCost());
//        //Print the worst solution
//        System.out.println("Worst solution greedy cycle : " + greedyCycleSolutions.get(greedyCycleSolutions.size() - 1).getCost());
//        //Print the average solution
//        System.out.println("Average solution greedy cycle : " + greedyCycleSolutions.stream().mapToInt(Solution::getCost).sum() / greedyCycleSolutions.size());
//
//        //Generate greedy cycle solutions for each node
//        ArrayList<Solution> greedyCycleSolutionsRegret = new ArrayList<Solution>();
//        //Initiate the timer to measure the execution time
//        long startTime4 = System.nanoTime();
//        for (int i = 0; i < matrix.getMatrix().size(); i++) {
//            greedyCycleSolutionsRegret.add(Greedy2Regret(i, weight_list,matrix ));
//        }
//        //Print the execution time
//        long endTime4 = System.nanoTime();
//        System.out.println("Execution time greedy cycle 2regret : " + (endTime4 - startTime4) / 1000000 + " ms");
//        //Sort the solutions
//        greedyCycleSolutionsRegret.sort(Comparator.comparing(Solution::getCost));
//        //Print the best solution
//        System.out.println("Best solution greedy cycle 2regret : " + greedyCycleSolutionsRegret.get(0).getCost());
//        //Print the worst solution
//        System.out.println("Worst solution greedy cycle 2regret : " + greedyCycleSolutionsRegret.get(greedyCycleSolutionsRegret.size() - 1).getCost());
//        //Print the average solution
//        System.out.println("Average solution greedy cycle 2regret : " + greedyCycleSolutionsRegret.stream().mapToInt(Solution::getCost).sum() / greedyCycleSolutionsRegret.size());
//
//
//        //Generate greedy cycle solutions for each node
//        ArrayList<Solution> greedyCycleSolutionsSum2Regret = new ArrayList<Solution>();
//        //Initiate the timer to measure the execution time
//        long startTime5 = System.nanoTime();
//        for (int i = 0; i < matrix.getMatrix().size(); i++) {
//            greedyCycleSolutionsSum2Regret.add(GreedySum2Regret(i, weight_list,matrix,1,1 ));
//        }
//        //Print the execution time
//        long endTime5 = System.nanoTime();
//        System.out.println("Execution time greedy cycle sum 2regret : " + (endTime5 - startTime5) / 1000000 + " ms");
//        //Sort the solutions
//        greedyCycleSolutionsSum2Regret.sort(Comparator.comparing(Solution::getCost));
//        //Print the best solution
//        System.out.println("Best solution greedy cycle sum 2regret : " + greedyCycleSolutionsSum2Regret.get(0).getCost());
//        //Print the worst solution
//        System.out.println("Worst solution greedy cycle sum 2regret : " + greedyCycleSolutionsSum2Regret.get(greedyCycleSolutionsSum2Regret.size() - 1).getCost());
//        //Print the average solution
//        System.out.println("Average solution greedy cycle sum 2regret : " + greedyCycleSolutionsSum2Regret.stream().mapToInt(Solution::getCost).sum() / greedyCycleSolutionsSum2Regret.size());


        //Generate 200 local search solutions from random starting solutions
//        ArrayList<Solution> greedyLocalSearchRandomNodesExchangeSolutions = new ArrayList<Solution>();
//        //Initiate the timer to measure the execution time
//        long startTime6 = System.nanoTime();
//        for(int i=0;i<200;i++){
//            System.out.println(i);
//            greedyLocalSearchRandomNodesExchangeSolutions.add(SteepestLocalSearch(matrix,weight_list,randomHamiltonianCycle(matrix, weight_list),2));
//        }
//        //Print the execution time
//        long endTime6 = System.nanoTime();
//        System.out.println("Execution time local search : " + (endTime6 - startTime6) / 1000000 + " ms");
//        //Sort the solutions
//        greedyLocalSearchRandomNodesExchangeSolutions.sort(Comparator.comparing(Solution::getCost));
//        //Print the best solution
//        System.out.println("Best solution local search : " + greedyLocalSearchRandomNodesExchangeSolutions.get(0).getCost());
//        //Print the worst solution
//        System.out.println("Worst solution local search : " + greedyLocalSearchRandomNodesExchangeSolutions.get(greedyLocalSearchRandomNodesExchangeSolutions.size() - 1).getCost());
//        //Print the average solution
//        System.out.println("Average solution local search : " + greedyLocalSearchRandomNodesExchangeSolutions.stream().mapToInt(Solution::getCost).sum() / greedyLocalSearchRandomNodesExchangeSolutions.size());

//        //Generate 200 local search solutions from sum criterion regret starting solutions
//        ArrayList<Solution> greedyLocalSearchBestStartNodesExchangeSolutions = new ArrayList<Solution>();
//        //Initiate the timer to measure the execution time
//        long startTime7 = System.nanoTime();
//        for(int i=0;i<matrix.getMatrix().size();i++){
//            System.out.println(i);
//            greedyLocalSearchBestStartNodesExchangeSolutions.add(GreedyLocalSearch(matrix,weight_list,GreedySum2Regret(i, weight_list,matrix,1,1),2));
//        }
//        //Print the execution time
//        long endTime7 = System.nanoTime();
//        System.out.println("Execution time local search : " + (endTime7 - startTime7) / 1000000 + " ms");
//        //Sort the solutions
//        greedyLocalSearchBestStartNodesExchangeSolutions.sort(Comparator.comparing(Solution::getCost));
//        //Print the best solution
//        System.out.println("Best solution local search sum 2regret : " + greedyLocalSearchBestStartNodesExchangeSolutions.get(0).getCost());
//        //Print the worst solution
//        System.out.println("Worst solution local search sum 2regret : " + greedyLocalSearchBestStartNodesExchangeSolutions.get(greedyLocalSearchBestStartNodesExchangeSolutions.size() - 1).getCost());
//        //Print the average solution
//        System.out.println("Average solution local search sum 2regret : " + greedyLocalSearchBestStartNodesExchangeSolutions.stream().mapToInt(Solution::getCost).sum() / greedyLocalSearchBestStartNodesExchangeSolutions.size());
//

//        //Generate 200 local search solutions from random starting solutions
//        ArrayList<Solution> CanditatSteepestLocalSearch = new ArrayList<Solution>();
//        //Initiate the timer to measure the execution time
//        long startTime8 = System.nanoTime();
//        for(int i=0;i<200;i++){
//            //System.out.println(i);
//            CanditatSteepestLocalSearch.add(SteepestLocalSearchCandidatMove(matrix,weight_list,randomHamiltonianCycle(matrix, weight_list),10));
//        }
//        //Print the execution time
//        long endTime8 = System.nanoTime();
//        System.out.println("Execution time local search : " + (endTime8 - startTime8) / 1000000 + " ms");
//        //Sort the solutions
//        CanditatSteepestLocalSearch.sort(Comparator.comparing(Solution::getCost));
//        //Print the best solution
//        System.out.println("Best solution local search : " + CanditatSteepestLocalSearch.get(0).getCost());
//        //Print the worst solution
//        System.out.println("Worst solution local search : " + CanditatSteepestLocalSearch.get(CanditatSteepestLocalSearch.size() - 1).getCost());
//        //Print the average solution
//        System.out.println("Average solution local search : " + CanditatSteepestLocalSearch.stream().mapToInt(Solution::getCost).sum() / CanditatSteepestLocalSearch.size());

        ArrayList<Solution> PreviousSteepestLocalSearch = new ArrayList<Solution>();
        //Initiate the timer to measure the execution time
        long startTime9 = System.nanoTime();
        for (int i = 0; i < 200; i++) {
//            System.out.println(i);
            try {
                PreviousSteepestLocalSearch.add(localsearchPreviousIteration(matrix, weight_list, randomHamiltonianCycle(matrix, weight_list)));

            } catch (Exception e) {
                System.out.println("error");
                i--;
            }
        }
        //Print the execution time
        long endTime9 = System.nanoTime();
        System.out.println("Execution time local search : " + (endTime9 - startTime9) / 1000000 + " ms");
        //Sort the solutions
        PreviousSteepestLocalSearch.sort(Comparator.comparing(Solution::getCost));
        //Print the best solution
        System.out.println("Best solution local search : " + PreviousSteepestLocalSearch.get(0).getCost());
        //Print the worst solution
        System.out.println("Worst solution local search : " + PreviousSteepestLocalSearch.get(PreviousSteepestLocalSearch.size() - 1).getCost());
        //Print the average solution
        System.out.println("Average solution local search : " + PreviousSteepestLocalSearch.stream().mapToInt(Solution::getCost).sum() / PreviousSteepestLocalSearch.size());
        System.out.println("Number of iteration : " + PreviousSteepestLocalSearch.size());


//        //Save the best solution for each method as a csv file
//        randomSolutions.get(0).saveSolution("random");
//        nearestNeighborSolutions.get(0).saveSolution("nearestNeighbor");
//        greedyCycleSolutions.get(0).saveSolution("greedyCycle");
//        greedyCycleSolutionsRegret.get(0).saveSolution("greedyCycleRegret");
//        greedyCycleSolutionsSum2Regret.get(0).saveSolution("greedyCycleSum2Regret");
//        greedyLocalSearchRandomNodesExchangeSolutions.get(0).saveSolution("greedyLocalSearchRandomNodesExchange");
//        greedyLocalSearchBestStartNodesExchangeSolutions.get(0).saveSolution("greedyLocalSearchBestStartNodesExchange");
//        CanditatSteepestLocalSearch.get(0).saveSolution("CanditatSteepestLocalSearch");
        PreviousSteepestLocalSearch.get(0).saveSolution("PreviousSteepestLocalSearch");
        System.out.println("done");
        System.out.println("Cost recalculated : " + computeCost(PreviousSteepestLocalSearch.get(0), matrix, weight_list));


    }


    public static int computeCost(Solution solution, distance_matrix matrix, List<Integer> weights) {
        int cost = 0;
        for (int i = 0; i < solution.getVisitedNodes().size() - 1; i++) {
            cost += matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(i + 1)) + weights.get(solution.getVisitedNodes().get(i));
        }
        cost += matrix.getDistance(solution.getVisitedNodes().get(solution.getVisitedNodes().size() - 1), solution.getVisitedNodes().get(0)) + weights.get(solution.getVisitedNodes().get(solution.getVisitedNodes().size() - 1));
        return cost;
    }




    public static Solution randomHamiltonianCycle(distance_matrix matrix, ArrayList<Integer> weight_list) {
        //Number of nodes to visit, even the number if odd
        int numberNodeToVisit = matrix.getMatrix().size() / 2;
        if (numberNodeToVisit % 2 != 0) {
            numberNodeToVisit++;
        }
        //List of visited nodes and cost of the path
        ArrayList<Integer> visitedNodes = new ArrayList<Integer>();
        //Random select a non visited node
        for (int i = 0; i < numberNodeToVisit; i++) {
            int randomNode = (int) (Math.random() * matrix.getMatrix().size());
            while (visitedNodes.contains(randomNode)) {
                randomNode = (int) (Math.random() * matrix.getMatrix().size());
            }
            visitedNodes.add(randomNode);
        }
        int cost = computeCost(new Solution(0, visitedNodes), matrix, weight_list);
        return new Solution(cost, visitedNodes);
    }

    //Nearest neighbor algorithm
    public static Solution NearestNeighbor(distance_matrix matrix, ArrayList<Integer> weight_list, int startNode) {
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
                if (!visitedNodes.contains(j) && matrix.getMatrix().get(visitedNodes.get(i - 1)).get(j) + weight_list.get(j) < lowestCost) {
                    lowestCostNode = j;
                    lowestCost = matrix.getMatrix().get(visitedNodes.get(i - 1)).get(j) + weight_list.get(j);
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
        return new Solution(cost, visitedNodes);
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
    public static Solution Greedy2Regret(int start, List<Integer> weights, distance_matrix matrix) {
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
    public static Solution GreedySum2Regret(int start, List<Integer> weights, distance_matrix matrix, int weightForCost, int weightForRegret) {
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
                    int sum = -weightForCost * bestCost + weightForRegret * regret;

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


    //Function that generate the list of moves to all neighboring solutions
    public static ArrayList<Move> NodesExchanges(Solution solution, distance_matrix matrix, List<Integer> weights) {
        //List of moves
        ArrayList<Move> moves = new ArrayList<Move>();
        //For each node in the solution
        for (int i = 0; i < solution.getVisitedNodes().size() - 1; i++) {
            //For each node in the solution
            for (int j = i + 1; j < solution.getVisitedNodes().size(); j++) {
                //If the nodes are different

                //Calculate the cost of the move
                int deltaCost = 0;
                if (i == 0) {
                    deltaCost = deltaCost - matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(solution.getVisitedNodes().size() - 1))
                            - matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(i + 1))
                            + matrix.getDistance(solution.getVisitedNodes().get(j), solution.getVisitedNodes().get(solution.getVisitedNodes().size() - 1))
                            + matrix.getDistance(solution.getVisitedNodes().get(j), solution.getVisitedNodes().get(i + 1));
                } else if (i == solution.getVisitedNodes().size() - 1) {
                    deltaCost = deltaCost - matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(i - 1))
                            - matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(0))
                            + matrix.getDistance(solution.getVisitedNodes().get(j), solution.getVisitedNodes().get(i - 1))
                            + matrix.getDistance(solution.getVisitedNodes().get(j), solution.getVisitedNodes().get(0));
                } else {
                    deltaCost = deltaCost - matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(i - 1))
                            - matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(i + 1))
                            + matrix.getDistance(solution.getVisitedNodes().get(j), solution.getVisitedNodes().get(i - 1))
                            + matrix.getDistance(solution.getVisitedNodes().get(j), solution.getVisitedNodes().get(i + 1));
                }
                if (j == i + 1) {

                    if (j == solution.getVisitedNodes().size() - 1) {
                        deltaCost = deltaCost - matrix.getDistance(solution.getVisitedNodes().get(j), solution.getVisitedNodes().get(0))
                                + matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(j))
                                + matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(0));
                    } else {
                        deltaCost = deltaCost - matrix.getDistance(solution.getVisitedNodes().get(j), solution.getVisitedNodes().get(j + 1))
                                + matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(j + 1))
                                + matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(j));
                    }
                } else if (j == solution.getVisitedNodes().size() - 1) {
                    if (i == 0) {
                        deltaCost = deltaCost - matrix.getDistance(solution.getVisitedNodes().get(j), solution.getVisitedNodes().get(j - 1))
                                + matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(j - 1))
                                + matrix.getDistance(solution.getVisitedNodes().get(j), solution.getVisitedNodes().get(i));
                    } else {
                        deltaCost = deltaCost - matrix.getDistance(solution.getVisitedNodes().get(j), solution.getVisitedNodes().get(j - 1))
                                - matrix.getDistance(solution.getVisitedNodes().get(j), solution.getVisitedNodes().get(0))
                                + matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(j - 1))
                                + matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(0));
                    }
                } else {
                    deltaCost = deltaCost - matrix.getDistance(solution.getVisitedNodes().get(j), solution.getVisitedNodes().get(j - 1))
                            - matrix.getDistance(solution.getVisitedNodes().get(j), solution.getVisitedNodes().get(j + 1))
                            + matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(j - 1))
                            + matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(j + 1));
                }
                //Add the move to the list of moves
                moves.add(new Move(i, j, deltaCost, 1));

            }
        }
        return moves;
    }

    //Function that generates the list of moves to all neighboring solutions for the exchange of two edges
    public static ArrayList<Move> EdgesExchanges(Solution solution, distance_matrix matrix, List<Integer> weights) {
        //List of moves
        ArrayList<Move> moves = new ArrayList<Move>();
        //For each node in the solution
        for (int i = 0; i < solution.getVisitedNodes().size() - 2; i++) {
            //For each node in the solution
            for (int j = i + 2; j < solution.getVisitedNodes().size(); j++) {
                int deltaCost = 0;
                if (i == 0) {
                    deltaCost = deltaCost - matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(solution.getVisitedNodes().size() - 1))
                            + matrix.getDistance(solution.getVisitedNodes().get(j), solution.getVisitedNodes().get(solution.getVisitedNodes().size() - 1));
                } else {
                    deltaCost = deltaCost - matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(i - 1))
                            + matrix.getDistance(solution.getVisitedNodes().get(j), solution.getVisitedNodes().get(i - 1));
                }
                if (j == solution.getVisitedNodes().size() - 1) {
                    deltaCost = deltaCost - matrix.getDistance(solution.getVisitedNodes().get(j), solution.getVisitedNodes().get(0))
                            + matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(0));
                } else {
                    deltaCost = deltaCost - matrix.getDistance(solution.getVisitedNodes().get(j), solution.getVisitedNodes().get(j + 1))
                            + matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(j + 1));
                }
                //Add the move to the list of moves
                if (!(i == 0 && j == solution.getVisitedNodes().size() - 1)) {
                    moves.add(new Move(i, j, deltaCost, 2));
                }
            }

        }
        return moves;
    }

    //Function that generates the list of moves to all neighboring solutions for the exchange of two nodes, one in the solution and one not
    public static ArrayList<Move> InterRouteExchange(Solution solution, distance_matrix matrix, List<Integer> weights) {
        //List of moves
        ArrayList<Move> moves = new ArrayList<Move>();
        //For each node in the solution
        for (int i = 0; i < solution.getVisitedNodes().size(); i++) {
            //For each node in the solution
            for (int j = 0; j < matrix.getMatrix().size(); j++) {
                //If the nodes are different
                if (!solution.getVisitedNodes().contains(j)) {
                    //Calculate the cost of the move
                    int deltaCost = 0;
                    if (i == 0) {
                        deltaCost = deltaCost - matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(solution.getVisitedNodes().size() - 1))
                                - matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(i + 1))
                                + matrix.getDistance(j, solution.getVisitedNodes().get(solution.getVisitedNodes().size() - 1))
                                + matrix.getDistance(j, solution.getVisitedNodes().get(i + 1))
                                + weights.get(j) - weights.get(solution.getVisitedNodes().get(i));
                    } else if (i == solution.getVisitedNodes().size() - 1) {
                        deltaCost = deltaCost - matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(i - 1))
                                - matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(0))
                                + matrix.getDistance(j, solution.getVisitedNodes().get(i - 1))
                                + matrix.getDistance(j, solution.getVisitedNodes().get(0))
                                + weights.get(j) - weights.get(solution.getVisitedNodes().get(i));
                    } else {
                        deltaCost = deltaCost - matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(i - 1))
                                - matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(i + 1))
                                + matrix.getDistance(j, solution.getVisitedNodes().get(i - 1))
                                + matrix.getDistance(j, solution.getVisitedNodes().get(i + 1))
                                + weights.get(j) - weights.get(solution.getVisitedNodes().get(i));
                    }
                    //Add the move to the list of moves
                    moves.add(new Move(i, j, deltaCost, 3));
                }
            }
        }
        return moves;
    }

    public static Solution SteepestLocalSearch(distance_matrix matrix, List<Integer> weights, Solution initialSolution, int TypeOfIntraRoute) {
        //Copy the initial solution
        Solution bestSolution = new Solution(initialSolution.getCost(), (ArrayList<Integer>) initialSolution.getVisitedNodes().clone());
        //List of moves to all neighboring solutions
        ArrayList<Move> moves = new ArrayList<Move>();
        //Get the intra route exchange moves
        if (TypeOfIntraRoute == 1) {
            moves = NodesExchanges(bestSolution, matrix, weights);
        } else if (TypeOfIntraRoute == 2) {
            moves = EdgesExchanges(bestSolution, matrix, weights);
        } else {
            Exception e = new Exception("Type of intra route exchange not valid, choose 1 for nodes exchange or 2 for edges exchange");
        }
        //Get the inter route exchange moves
        ArrayList<Move> moves2 = InterRouteExchange(bestSolution, matrix, weights);
        //Add the inter route exchange moves to the list of moves
        moves.addAll(moves2);

        while (true) {
            //System.out.println(bestSolution.getCost());
            //Find the best move
            Move bestMove = new Move(0, 0, Integer.MAX_VALUE, 0);
            for (int i = 0; i < moves.size(); i++) {
                if (moves.get(i).getCost() < bestMove.getCost()) {
                    bestMove = moves.get(i);
                }
            }
            //If the best move is improving the solution
            if (bestMove.getCost() < 0) {
                //Construct the new solution with the move
                Solution newSolution = new Solution(bestSolution.getCost() + bestMove.getCost(), bestSolution.getVisitedNodes());
                if (bestMove.getType() == 1) {
                    int temp_index = newSolution.getVisitedNodes().get(bestMove.getI());
                    newSolution.getVisitedNodes().set(bestMove.getI(), newSolution.getVisitedNodes().get(bestMove.getJ()));
                    newSolution.getVisitedNodes().set(bestMove.getJ(), temp_index);
                } else if (bestMove.getType() == 2) {
                    Collections.reverse(newSolution.getVisitedNodes().subList(Math.min(bestMove.getI(), bestMove.getJ()), Math.max(bestMove.getI() + 1, bestMove.getJ()) + 1));
                } else if (bestMove.getType() == 3) {
                    newSolution.getVisitedNodes().remove(bestMove.getI());
                    newSolution.getVisitedNodes().add(bestMove.getI(), bestMove.getJ());
                }
                //Update the neighbors
                if (TypeOfIntraRoute == 1) {
                    moves = NodesExchanges(newSolution, matrix, weights);
                } else if (TypeOfIntraRoute == 2) {
                    moves = EdgesExchanges(newSolution, matrix, weights);
                } else {
                    Exception e = new Exception("Type of intra route exchange not valid, choose 1 for nodes exchange or 2 for edges exchange");
                }
                moves2 = InterRouteExchange(newSolution, matrix, weights);
                moves.addAll(moves2);
                //Update the best solution
                bestSolution = newSolution;

            } else {
                //If the best move is not improving the solution, stop the algorithm
                break;
            }
        }
        return bestSolution;
    }


    public static Solution GreedyLocalSearch(distance_matrix matrix, List<Integer> weights, Solution initialSolution, int TypeOfIntraRoute) {
        //Copy the initial solution
        Solution bestSolution = new Solution(initialSolution.getCost(), initialSolution.getVisitedNodes());
        //List of moves to all neighboring solutions
        ArrayList<Move> moves = new ArrayList<Move>();
        //Get the intra route exchange moves
        if (TypeOfIntraRoute == 1) {
            moves = NodesExchanges(bestSolution, matrix, weights);
        } else if (TypeOfIntraRoute == 2) {
            moves = EdgesExchanges(bestSolution, matrix, weights);
        } else {
            Exception e = new Exception("Type of intra route exchange not valid, choose 1 for nodes exchange or 2 for edges exchange");
        }
        //Get the inter route exchange moves
        ArrayList<Move> moves2 = InterRouteExchange(bestSolution, matrix, weights);
        //Add the inter route exchange moves to the list of moves
        moves.addAll(moves2);
        while (true) {
            //System.out.println(bestSolution.getCost());
            //Randomize the list of moves
            Collections.shuffle(moves);
            //Iterate through the list of moves, if the move is improving the solution, apply it and regenerate the list of moves
            for (int i = 0; i < moves.size(); i++) {
                //If the move is improving the solution
                if (moves.get(i).getCost() < 0) {
                    //Construct the new solution with the move
                    Solution newSolution = new Solution(bestSolution.getCost() + moves.get(i).getCost(), bestSolution.getVisitedNodes());
                    if (moves.get(i).getType() == 1) {
                        int temp_index = newSolution.getVisitedNodes().get(moves.get(i).getI());
                        newSolution.getVisitedNodes().set(moves.get(i).getI(), newSolution.getVisitedNodes().get(moves.get(i).getJ()));
                        newSolution.getVisitedNodes().set(moves.get(i).getJ(), temp_index);
                    } else if (moves.get(i).getType() == 2) {
                        Collections.reverse(newSolution.getVisitedNodes().subList(Math.min(moves.get(i).getI(), moves.get(i).getJ()), Math.max(moves.get(i).getI() + 1, moves.get(i).getJ()) + 1));
                    } else if (moves.get(i).getType() == 3) {
                        newSolution.getVisitedNodes().remove(moves.get(i).getI());
                        newSolution.getVisitedNodes().add(moves.get(i).getI(), moves.get(i).getJ());
                    }
                    //Update the neighbors
                    if (TypeOfIntraRoute == 1) {
                        moves = NodesExchanges(newSolution, matrix, weights);
                    } else if (TypeOfIntraRoute == 2) {
                        moves = EdgesExchanges(newSolution, matrix, weights);
                    } else {
                        Exception e = new Exception("Type of intra route exchange not valid, choose 1 for nodes exchange or 2 for edges exchange");
                    }
                    moves2 = InterRouteExchange(newSolution, matrix, weights);
                    moves.addAll(moves2);
                    //Update the best solution
                    bestSolution = newSolution;
                    //Break the loop
                    break;
                }
                if (i == moves.size() - 1 && moves.get(i).getCost() >= 0) {
                    //If no move is improving the solution, stop the algorithm
                    return bestSolution;
                }
            }
        }
    }

    public static ArrayList<Move> InterRouteExchangeCanditat(Solution solution, distance_matrix matrix, List<Integer> weights, CandidatMove candidatMoves) {
        //List of moves
        ArrayList<Move> moves = new ArrayList<Move>();
        for (int i = 0; i < solution.getVisitedNodes().size(); i++) {
            ArrayList<Integer> endNodesForEdges = candidatMoves.getCandidatMoves().get(i);
            for (int j = 0; j < endNodesForEdges.size(); j++) {
                if (!solution.getVisitedNodes().contains(endNodesForEdges.get(j))) {
                    //We want that the edges of i and j is in the solution,
                    //So we need to perform exchange between the i-1 node and the j node or the i+1 node and the j node

                    //First exchange of i-1 with j
                    int deltaCost1 = 0;
                    if (i == 0) {
                        deltaCost1 = deltaCost1 - matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(solution.getVisitedNodes().size() - 1))
                                - matrix.getDistance(solution.getVisitedNodes().get(solution.getVisitedNodes().size() - 1), solution.getVisitedNodes().get(solution.getVisitedNodes().size() - 2))
                                + matrix.getDistance(endNodesForEdges.get(j), solution.getVisitedNodes().get(solution.getVisitedNodes().size() - 2))
                                + matrix.getDistance(endNodesForEdges.get(j), solution.getVisitedNodes().get(i))
                                + weights.get(endNodesForEdges.get(j)) - weights.get(solution.getVisitedNodes().get(solution.getVisitedNodes().size() - 1));
                    } else if (i == 1) {
                        deltaCost1 = deltaCost1 - matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(0))
                                - matrix.getDistance(solution.getVisitedNodes().get(0), solution.getVisitedNodes().get(solution.getVisitedNodes().size() - 1))
                                + matrix.getDistance(endNodesForEdges.get(j), solution.getVisitedNodes().get(solution.getVisitedNodes().size() - 1))
                                + matrix.getDistance(endNodesForEdges.get(j), solution.getVisitedNodes().get(i))
                                + weights.get(endNodesForEdges.get(j)) - weights.get(solution.getVisitedNodes().get(0));
                    } else {
                        deltaCost1 = deltaCost1 - matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(i - 1))
                                - matrix.getDistance(solution.getVisitedNodes().get(i - 1), solution.getVisitedNodes().get(i - 2))
                                + matrix.getDistance(endNodesForEdges.get(j), solution.getVisitedNodes().get(i - 2))
                                + matrix.getDistance(endNodesForEdges.get(j), solution.getVisitedNodes().get(i))
                                + weights.get(endNodesForEdges.get(j)) - weights.get(solution.getVisitedNodes().get(i - 1));
                    }

                    //Second exchange of i+1 with j
                    int deltaCost2 = 0;
                    if (i == solution.getVisitedNodes().size() - 1) {
                        deltaCost2 = deltaCost2 - matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(0))
                                - matrix.getDistance(solution.getVisitedNodes().get(0), solution.getVisitedNodes().get(1))
                                + matrix.getDistance(endNodesForEdges.get(j), solution.getVisitedNodes().get(1))
                                + matrix.getDistance(endNodesForEdges.get(j), solution.getVisitedNodes().get(i))
                                + weights.get(endNodesForEdges.get(j)) - weights.get(solution.getVisitedNodes().get(0));
                    } else if (i == solution.getVisitedNodes().size() - 2) {
                        deltaCost2 = deltaCost2 - matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(i + 1))
                                - matrix.getDistance(solution.getVisitedNodes().get(i + 1), solution.getVisitedNodes().get(0))
                                + matrix.getDistance(endNodesForEdges.get(j), solution.getVisitedNodes().get(0))
                                + matrix.getDistance(endNodesForEdges.get(j), solution.getVisitedNodes().get(i))
                                + weights.get(endNodesForEdges.get(j)) - weights.get(solution.getVisitedNodes().get(i + 1));
                    } else {
                        deltaCost2 = deltaCost2 - matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(i + 1))
                                - matrix.getDistance(solution.getVisitedNodes().get(i + 1), solution.getVisitedNodes().get(i + 2))
                                + matrix.getDistance(endNodesForEdges.get(j), solution.getVisitedNodes().get(i + 2))
                                + matrix.getDistance(endNodesForEdges.get(j), solution.getVisitedNodes().get(i))
                                + weights.get(endNodesForEdges.get(j)) - weights.get(solution.getVisitedNodes().get(i + 1));
                    }
                    //Add the move to the list of moves
                    moves.add(new Move((i - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size(), endNodesForEdges.get(j), deltaCost1, 3));
                    moves.add(new Move((i + 1) % solution.getVisitedNodes().size(), endNodesForEdges.get(j), deltaCost2, 3));
                }

            }
        }
        return moves;
    }


    public static ArrayList<Move> EdgesExchangesCandidat(Solution solution, distance_matrix matrix, List<Integer> weights, CandidatMove candidatMoves) {
        //List of moves
        ArrayList<Move> moves = new ArrayList<Move>();
        //For each node in the solution
        for (int i = 0; i < solution.getVisitedNodes().size() - 1; i++) {
            //For each node in the solution
            ArrayList<Integer> endNodesForEdges = candidatMoves.getCandidatMoves().get(i);
            for (int k = 0; k < endNodesForEdges.size(); k++) {
                if (solution.getVisitedNodes().get(i) != endNodesForEdges.get(k)) {
                    if (solution.getVisitedNodes().contains(endNodesForEdges.get(k))) {
                        int j = solution.getVisitedNodes().indexOf(endNodesForEdges.get(k));
                        if (i == j || i == (j + 1) % solution.getVisitedNodes().size() || i == (j - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size() || i == (j + 2) % solution.getVisitedNodes().size() || i == (j - 2 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size()) {
                            continue;
                        }
                        // j -> i -> i+1 -> j+1
                        int deltaCost1 = 0;
                        deltaCost1 = deltaCost1 - matrix.getDistance(solution.getVisitedNodes().get(j), solution.getVisitedNodes().get((j + 1) % solution.getVisitedNodes().size()))
                                - matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get((i + 1) % solution.getVisitedNodes().size()))
                                + matrix.getDistance(solution.getVisitedNodes().get(j), solution.getVisitedNodes().get(i))
                                + matrix.getDistance(solution.getVisitedNodes().get((j + 1) % solution.getVisitedNodes().size()), solution.getVisitedNodes().get((i + 1) % solution.getVisitedNodes().size()));

                        // j-1 -> i-1 -> j -> i
                        int deltaCost2 = 0;
                        deltaCost2 = deltaCost2 - matrix.getDistance(solution.getVisitedNodes().get((j - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size()), solution.getVisitedNodes().get(j))
                                - matrix.getDistance(solution.getVisitedNodes().get((i - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size()), solution.getVisitedNodes().get(i))
                                + matrix.getDistance(solution.getVisitedNodes().get((j - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size()), solution.getVisitedNodes().get((i - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size()))
                                + matrix.getDistance(solution.getVisitedNodes().get(j), solution.getVisitedNodes().get(i));

                        //Add the move to the list of moves
                        if (i > j) {
                            moves.add(new Move(i, (j + 1) % solution.getVisitedNodes().size(), deltaCost1, 2));
                            moves.add(new Move((i - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size(), j, deltaCost2, 2));
                        } else {
                            moves.add(new Move(j, (i + 1) % solution.getVisitedNodes().size(), deltaCost1, 2));
                            moves.add(new Move((j - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size(), i, deltaCost2, 2));
                        }
                    }
                }
            }
        }
        return moves;
    }

    public static CandidatMove CanditatMoves(distance_matrix matrix, List<Integer> weights, int nbCandidatMoves) {
        //List of candidate moves
        CandidatMove candidatMove = new CandidatMove();

        for (int i = 0; i < matrix.getMatrix().size(); i++) {
            //Find the nearest edge to the node
            Integer[] bestNodes = new Integer[nbCandidatMoves];
            Integer[] bestNodeCost = new Integer[nbCandidatMoves];
            for (int j = 0; j < matrix.getMatrix().size(); j++) {
                if (i != j) {
                    for (int k = 0; k < nbCandidatMoves; k++) {
                        if (bestNodeCost[k] == null || matrix.getDistance(i, j) + weights.get(j) < bestNodeCost[k]) {
                            //Shift the nodes
                            for (int l = nbCandidatMoves - 1; l > k; l--) {
                                bestNodeCost[l] = bestNodeCost[l - 1];
                                bestNodes[l] = bestNodes[l - 1];
                            }
                            bestNodeCost[k] = matrix.getDistance(i, j) + weights.get(j);
                            bestNodes[k] = j;
                            break;
                        }
                    }
                }
            }
            //Add the nodes to the list of candidate moves
            ArrayList<Integer> bestNodesArray = new ArrayList<Integer>();
            for (int k = 0; k < nbCandidatMoves; k++) {
                bestNodesArray.add(bestNodes[k]);
            }
            candidatMove.addCandidatMove(i, bestNodesArray);
        }
        return candidatMove;
    }


    public static Solution SteepestLocalSearchCandidatMove(distance_matrix matrix, List<Integer> weights, Solution initialSolution, int nbCandidatMoves) {

        //Copy the initial solution
        Solution bestSolution = new Solution(initialSolution.getCost(), initialSolution.getVisitedNodes());
        //Candidate moves
        CandidatMove candidatMoves = CanditatMoves(matrix, weights, nbCandidatMoves);

        //List of moves to all neighboring solutions
        ArrayList<Move> moves = new ArrayList<Move>();
        //Get the intra route exchange moves
        moves = EdgesExchangesCandidat(bestSolution, matrix, weights, candidatMoves);
        //Get the inter route exchange moves
        ArrayList<Move> moves2 = InterRouteExchangeCanditat(bestSolution, matrix, weights, candidatMoves);
        //Add the inter route exchange moves to the list of moves
        moves.addAll(moves2);

        while (true) {
            //System.out.println(bestSolution.getCost());
            Move bestMove = new Move(0, 0, Integer.MAX_VALUE, 0);
            for (int i = 0; i < moves.size(); i++) {
                if (moves.get(i).getCost() < bestMove.getCost()) {
                    bestMove = moves.get(i);
                }
            }
            if (bestMove.getCost() < 0) {
                //Construct the new solution with the move
                Solution newSolution = new Solution(bestSolution.getCost() + bestMove.getCost(), bestSolution.getVisitedNodes());
                if (bestMove.getType() == 2) {
                    if (Math.max(bestMove.getI() + 1, bestMove.getJ() + 1) == bestSolution.getVisitedNodes().size()) {
                        Collections.reverse(newSolution.getVisitedNodes().subList(0, Math.min(bestMove.getI(), bestMove.getJ())));
                    } else {
                        Collections.reverse(newSolution.getVisitedNodes().subList(Math.min(bestMove.getI(), bestMove.getJ()), Math.max(bestMove.getI() + 1, bestMove.getJ() + 1)));
                    }
                } else if (bestMove.getType() == 3) {
                    newSolution.getVisitedNodes().remove(bestMove.getI());
                    newSolution.getVisitedNodes().add(bestMove.getI(), bestMove.getJ());
                }
                //Update the neighbors
                moves = EdgesExchangesCandidat(bestSolution, matrix, weights, candidatMoves);
                moves2 = InterRouteExchangeCanditat(bestSolution, matrix, weights, candidatMoves);
                moves.addAll(moves2);
                //Update the best solution
                bestSolution = newSolution;

            } else {
                //If the best move is not improving the solution, stop the algorithm
                break;
            }

        }
        return bestSolution;
    }


    public static ArrayList<PotentialMove> generatePotentialMoves(Solution solution, distance_matrix matrix, List<Integer> weights) {
        //List of potential moves
        ArrayList<PotentialMove> potentialMoves = new ArrayList<PotentialMove>();

        //List of edges in the solution
        ArrayList<Edge> edges = new ArrayList<Edge>();
        for (int i = 0; i < solution.getVisitedNodes().size() - 1; i++) {
            edges.add(new Edge(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(i + 1), i, i + 1));
        }
        edges.add(new Edge(solution.getVisitedNodes().get(solution.getVisitedNodes().size() - 1), solution.getVisitedNodes().get(0), solution.getVisitedNodes().size() - 1, 0));

        //For each node in the solution
        for (int i = 0; i < solution.getVisitedNodes().size(); i++) {
            //For each node in the solution
            for (int j = 0; j < matrix.getMatrix().size(); j++) {
                //If the nodes are different
                if (!solution.getVisitedNodes().contains(j)) {
                    //Calculate the cost of the move
                    int deltaCost = 0;
                    if (i == 0) {
                        deltaCost = deltaCost - matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(solution.getVisitedNodes().size() - 1))
                                - matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(i + 1))
                                + matrix.getDistance(j, solution.getVisitedNodes().get(solution.getVisitedNodes().size() - 1))
                                + matrix.getDistance(j, solution.getVisitedNodes().get(i + 1))
                                + weights.get(j) - weights.get(solution.getVisitedNodes().get(i));
                    } else if (i == solution.getVisitedNodes().size() - 1) {
                        deltaCost = deltaCost - matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(i - 1))
                                - matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(0))
                                + matrix.getDistance(j, solution.getVisitedNodes().get(i - 1))
                                + matrix.getDistance(j, solution.getVisitedNodes().get(0))
                                + weights.get(j) - weights.get(solution.getVisitedNodes().get(i));
                    } else {
                        deltaCost = deltaCost - matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(i - 1))
                                - matrix.getDistance(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(i + 1))
                                + matrix.getDistance(j, solution.getVisitedNodes().get(i - 1))
                                + matrix.getDistance(j, solution.getVisitedNodes().get(i + 1))
                                + weights.get(j) - weights.get(solution.getVisitedNodes().get(i));
                    }
                    //Add the move to the list of moves
                    if (deltaCost < 0) {
                        potentialMoves.add(new PotentialMove(new nodeExchangeInter(
                                solution.getVisitedNodes().get(i), j, deltaCost, i, solution.getVisitedNodes().get((i - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size()), solution.getVisitedNodes().get((i + 1) % solution.getVisitedNodes().size())
                        )));

                    }
                }
            }
        }

        //Edges exchange moves
        for (int i = 0; i < edges.size(); i++) {
            for (int j = 0; j < edges.size(); j++) {

                if (i != j && (i + 1) % edges.size() != j && (i - 1 + edges.size()) % edges.size() != j) {
                    //Calculate the delta cost
                    int deltaCost = -matrix.getDistance(edges.get(i).getStartNode(), edges.get(i).getEndNode())
                            - matrix.getDistance(edges.get(j).getStartNode(), edges.get(j).getEndNode())
                            + matrix.getDistance(edges.get(i).getStartNode(), edges.get(j).getStartNode())
                            + matrix.getDistance(edges.get(j).getEndNode(), edges.get(i).getEndNode());
                    if (deltaCost < 0) {
                        //Add the move to the list of moves
                        potentialMoves.add(new PotentialMove(
                                new edgesExchange(
                                        edges.get(i).getStartNode(), edges.get(i).getEndNode(),
                                        edges.get(j).getStartNode(), edges.get(j).getEndNode(),
                                        i, j,
                                        solution.getVisitedNodes().indexOf(solution.getIndexOfNode(edges.get(i).getStartNode())),
                                        solution.getVisitedNodes().indexOf(solution.getIndexOfNode(edges.get(i).getEndNode())),
                                        solution.getVisitedNodes().get((i + 1) % solution.getVisitedNodes().size()), (i + 1) % solution.getVisitedNodes().size(),
                                        solution.getVisitedNodes().get((j + 1) % solution.getVisitedNodes().size()), (j + 1) % solution.getVisitedNodes().size(),
                                        edges.get((i + 1) % edges.size()).getStartNode(), solution.getIndexOfNode(edges.get((i + 1) % edges.size()).getStartNode()),
                                        edges.get((i + 1) % edges.size()).getEndNode(), solution.getIndexOfNode(edges.get((i + 1) % edges.size()).getEndNode()),
                                        solution.getVisitedNodes().get((i - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size()), (i - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size(),
                                        solution.getVisitedNodes().get((j - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size()), (j - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size(),
                                        edges.get((j - 1 + edges.size()) % edges.size()).getStartNode(), solution.getIndexOfNode(edges.get((j - 1 + edges.size()) % edges.size()).getStartNode()),
                                        edges.get((j - 1 + edges.size()) % edges.size()).getEndNode(), solution.getIndexOfNode(edges.get((j - 1 + edges.size()) % edges.size()).getEndNode()),
                                        deltaCost,
                                        edges.get(j).getEndNode(),
                                        edges.get(i).getStartNode(),
                                        edges.get(i).getEndNode(),
                                        edges.get(j).getStartNode()
                                )
                        ));

                    }
                }
            }
        }

        //Sort the list of potential moves
        Collections.sort(potentialMoves, new Comparator<PotentialMove>() {
            @Override
            public int compare(PotentialMove o1, PotentialMove o2) {
                return o1.getCost() - o2.getCost();
            }
        });

        return potentialMoves;
    }


    public static void addNewPotentialMoves(Solution solution, distance_matrix matrix, List<Integer> weights, ArrayList<PotentialMove> potentialMoves, PotentialMove usedMove) {
        //Create a list of edges in the solution
        ArrayList<Edge> edges = new ArrayList<Edge>();
        for (int i = 0; i < solution.getVisitedNodes().size() - 1; i++) {
            edges.add(new Edge(solution.getVisitedNodes().get(i), solution.getVisitedNodes().get(i + 1), i, i + 1));
        }
        edges.add(new Edge(solution.getVisitedNodes().get(solution.getVisitedNodes().size() - 1), solution.getVisitedNodes().get(0), solution.getVisitedNodes().size() - 1, 0));


        if (usedMove.isNodeExchangeInter()) {
            nodeExchangeInter pMove = usedMove.getNodeExchangeInter();
            int indexStartNewEdgeAlpha = solution.getIndexOfNode(pMove.getPreviousNodeInSolution());
            int indexEndNewEdgeAlpha = pMove.getNodeInSolutionIndex();
            int indexStartNewEdgeBeta = pMove.getNodeInSolutionIndex();
            int indexEndNewEdgeBeta = solution.getIndexOfNode(pMove.getNextNodeInSolution());
            int indexEdgeAlpha = -1;
            int indexEdgeBeta = -1;

            for (int k = 0; k < edges.size(); k++) {
                if (edges.get(k).getStartNode() == pMove.getPreviousNodeInSolution() && edges.get(k).getEndNode() == pMove.getNodeNotInSolution() || edges.get(k).getStartNode() == pMove.getNodeNotInSolution() && edges.get(k).getEndNode() == pMove.getPreviousNodeInSolution()) {
                    indexEdgeAlpha = k;
                }
                if (edges.get(k).getStartNode() == pMove.getNodeNotInSolution() && edges.get(k).getEndNode() == pMove.getNextNodeInSolution() || edges.get(k).getStartNode() == pMove.getNextNodeInSolution() && edges.get(k).getEndNode() == pMove.getNodeNotInSolution()) {
                    indexEdgeBeta = k;
                }

            }

            //Add the new potential moves
            for (int i = 0; i < edges.size(); i++) {
                //First the new edge exchanges with the edge alpha
                if (indexEdgeAlpha != i && (indexEdgeAlpha + 1) % edges.size() != i && (indexEdgeAlpha - 1 + edges.size()) % edges.size() != i) {
                    //Calculate the delta cost
                    int deltaCost = -matrix.getDistance(edges.get(indexEdgeAlpha).getStartNode(), edges.get(indexEdgeAlpha).getEndNode())
                            - matrix.getDistance(edges.get(i).getStartNode(), edges.get(i).getEndNode())
                            + matrix.getDistance(edges.get(indexEdgeAlpha).getStartNode(), edges.get(i).getStartNode())
                            + matrix.getDistance(edges.get(i).getEndNode(), edges.get(indexEdgeAlpha).getEndNode());
                    if (deltaCost < 0) {
                        //Add the move to the list of moves
                        potentialMoves.add(new PotentialMove(
                                new edgesExchange(
                                        pMove.getPreviousNodeInSolution(), pMove.getNodeNotInSolution(),
                                        edges.get(i).getStartNode(), edges.get(i).getEndNode(),
                                        indexStartNewEdgeAlpha, indexEndNewEdgeAlpha,
                                        solution.getIndexOfNode(edges.get(i).getStartNode()),
                                        solution.getIndexOfNode(edges.get(i).getEndNode()),
                                        solution.getVisitedNodes().get((indexStartNewEdgeAlpha + 1) % solution.getVisitedNodes().size()), (indexStartNewEdgeAlpha + 1) % solution.getVisitedNodes().size(),
                                        solution.getVisitedNodes().get((indexEndNewEdgeAlpha + 1) % solution.getVisitedNodes().size()), (indexEndNewEdgeAlpha + 1) % solution.getVisitedNodes().size(),
                                        edges.get((i + 1) % edges.size()).getStartNode(), solution.getIndexOfNode(edges.get((i + 1) % edges.size()).getStartNode()),
                                        edges.get((i + 1) % edges.size()).getEndNode(), solution.getIndexOfNode(edges.get((i + 1) % edges.size()).getEndNode()),
                                        solution.getVisitedNodes().get((indexStartNewEdgeAlpha - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size()), (indexStartNewEdgeAlpha - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size(),
                                        solution.getVisitedNodes().get((indexEndNewEdgeAlpha - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size()), (indexEndNewEdgeAlpha - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size(),
                                        edges.get((i - 1 + edges.size()) % edges.size()).getStartNode(), solution.getIndexOfNode(edges.get((i - 1 + edges.size()) % edges.size()).getStartNode()),
                                        edges.get((i - 1 + edges.size()) % edges.size()).getEndNode(), solution.getIndexOfNode(edges.get((i - 1 + edges.size()) % edges.size()).getEndNode()),
                                        deltaCost,
                                        edges.get(indexEdgeAlpha).getStartNode(),
                                        edges.get(i).getEndNode(),
                                        edges.get(i).getStartNode(),
                                        edges.get(indexEdgeAlpha).getEndNode()
                                )
                        ));

                    }
                }
                //Then the new edge exchanges with the edge beta
                if (indexEdgeBeta != i && (indexEdgeBeta + 1) % edges.size() != i && (indexEdgeBeta - 1 + edges.size()) % edges.size() != i) {
                    //Calculate the delta cost
                    int deltaCost = -matrix.getDistance(edges.get(indexEdgeBeta).getStartNode(), edges.get(indexEdgeBeta).getEndNode())
                            - matrix.getDistance(edges.get(i).getStartNode(), edges.get(i).getEndNode())
                            + matrix.getDistance(edges.get(indexEdgeBeta).getStartNode(), edges.get(i).getStartNode())
                            + matrix.getDistance(edges.get(i).getEndNode(), edges.get(indexEdgeBeta).getEndNode());
                    if (deltaCost < 0) {
                        //Add the move to the list of moves
                        potentialMoves.add(new PotentialMove(
                                new edgesExchange(
                                        pMove.getNodeNotInSolution(), pMove.getNextNodeInSolution(),
                                        edges.get(i).getStartNode(), edges.get(i).getEndNode(),
                                        indexStartNewEdgeBeta, indexEndNewEdgeBeta,
                                        solution.getIndexOfNode(edges.get(i).getStartNode()),
                                        solution.getIndexOfNode(edges.get(i).getEndNode()),
                                        solution.getVisitedNodes().get((indexStartNewEdgeBeta + 1) % solution.getVisitedNodes().size()), (indexStartNewEdgeBeta + 1) % solution.getVisitedNodes().size(),
                                        solution.getVisitedNodes().get((indexEndNewEdgeBeta + 1) % solution.getVisitedNodes().size()), (indexEndNewEdgeBeta + 1) % solution.getVisitedNodes().size(),
                                        edges.get((i + 1) % edges.size()).getStartNode(), solution.getIndexOfNode(edges.get((i + 1) % edges.size()).getStartNode()),
                                        edges.get((i + 1) % edges.size()).getEndNode(), solution.getIndexOfNode(edges.get((i + 1) % edges.size()).getEndNode()),
                                        solution.getVisitedNodes().get((indexStartNewEdgeBeta - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size()), (indexStartNewEdgeBeta - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size(),
                                        solution.getVisitedNodes().get((indexEndNewEdgeBeta - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size()), (indexEndNewEdgeBeta - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size(),
                                        edges.get((i - 1 + edges.size()) % edges.size()).getStartNode(), solution.getIndexOfNode(edges.get((i - 1 + edges.size()) % edges.size()).getStartNode()),
                                        edges.get((i - 1 + edges.size()) % edges.size()).getEndNode(), solution.getIndexOfNode(edges.get((i - 1 + edges.size()) % edges.size()).getEndNode()),
                                        deltaCost,
                                        edges.get(indexEdgeBeta).getStartNode(),
                                        edges.get(i).getEndNode(),
                                        edges.get(i).getStartNode(),
                                        edges.get(indexEdgeBeta).getEndNode()
                                )
                        ));

                    }
                }
            }


        } else {

            edgesExchange pMove = usedMove.getEdgesExchange();
            int startingReverseIndex = pMove.getNodeStartReverse();
            int endingReverseIndex = pMove.getNodeEndReverse();


            int indexEdgeAlpha = -1;
            int indexEdgeBeta = -1;
            int startingReverseEdgeIndex = -1;
            int endingReverseEdgeIndex = -1;

            for (int e = 0; e < edges.size(); e++) {
                if ((edges.get(e).getStartNode() == pMove.getStartingEdgeToReplace() && edges.get(e).getEndNode() == pMove.getStartingEdgeToReplaceWith()) ||
                        (edges.get(e).getStartNode() == pMove.getStartingEdgeToReplaceWith() && edges.get(e).getEndNode() == pMove.getStartingEdgeToReplace())) {
                    indexEdgeAlpha = e;
                }
                if ((edges.get(e).getStartNode() == pMove.getEndingEdgeToReplaceWith() && edges.get(e).getEndNode() == pMove.getEndingEdgeToReplace()) ||
                        (edges.get(e).getStartNode() == pMove.getEndingEdgeToReplace() && edges.get(e).getEndNode() == pMove.getEndingEdgeToReplaceWith())) {
                    indexEdgeBeta = e;
                }
                if (edges.get(e).getStartNode() == pMove.nodeEndReverse) {
                    startingReverseEdgeIndex = e;
                }
                if (edges.get(e).getEndNode() == pMove.nodeStartReverse) {
                    endingReverseEdgeIndex = e;
                }

            }

            //Add the edges exchange for the first new edge
            for (int i = 0; i < edges.size(); i++) {
                if (i != indexEdgeAlpha && (indexEdgeAlpha + 1) % edges.size() != i && (indexEdgeAlpha - 1 + edges.size()) % edges.size() != i) {
                    //Calculate the delta cost
                    int deltaCost = -matrix.getDistance(edges.get(indexEdgeAlpha).getStartNode(), edges.get(indexEdgeAlpha).getEndNode())
                            - matrix.getDistance(edges.get(i).getStartNode(), edges.get(i).getEndNode())
                            + matrix.getDistance(edges.get(indexEdgeAlpha).getStartNode(), edges.get(i).getStartNode())
                            + matrix.getDistance(edges.get(i).getEndNode(), edges.get(indexEdgeAlpha).getEndNode());
                    if (deltaCost < 0) {
                        int EdgeAlphaStartIndex = solution.getIndexOfNode(edges.get(indexEdgeAlpha).getStartNode());
                        int EdgeAlphaEndIndex = solution.getIndexOfNode(edges.get(indexEdgeAlpha).getEndNode());
                        //Add the move to the list of moves
                        potentialMoves.add(new PotentialMove(
                                new edgesExchange(
                                        pMove.startingEdgeToReplace, pMove.startingEdgeToReplaceWith,
                                        edges.get(i).getStartNode(), edges.get(i).getEndNode(),
                                        EdgeAlphaStartIndex, EdgeAlphaEndIndex,
                                        solution.getIndexOfNode(edges.get(i).getStartNode()),
                                        solution.getIndexOfNode(edges.get(i).getEndNode()),
                                        solution.getVisitedNodes().get((EdgeAlphaStartIndex + 1) % solution.getVisitedNodes().size()), (EdgeAlphaStartIndex + 1) % solution.getVisitedNodes().size(),
                                        solution.getVisitedNodes().get((EdgeAlphaEndIndex + 1) % solution.getVisitedNodes().size()), (EdgeAlphaEndIndex + 1) % solution.getVisitedNodes().size(),
                                        edges.get((i + 1) % edges.size()).getStartNode(), solution.getIndexOfNode(edges.get((i + 1) % edges.size()).getStartNode()),
                                        edges.get((i + 1) % edges.size()).getEndNode(), solution.getIndexOfNode(edges.get((i + 1) % edges.size()).getEndNode()),
                                        solution.getVisitedNodes().get((EdgeAlphaStartIndex - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size()), (EdgeAlphaStartIndex - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size(),
                                        solution.getVisitedNodes().get((EdgeAlphaEndIndex - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size()), (EdgeAlphaEndIndex - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size(),
                                        edges.get((i - 1 + edges.size()) % edges.size()).getStartNode(), solution.getIndexOfNode(edges.get((i - 1 + edges.size()) % edges.size()).getStartNode()),
                                        edges.get((i - 1 + edges.size()) % edges.size()).getEndNode(), solution.getIndexOfNode(edges.get((i - 1 + edges.size()) % edges.size()).getEndNode()),
                                        deltaCost,
                                        edges.get(indexEdgeAlpha).getEndNode(),
                                        edges.get(i).getStartNode(),
                                        edges.get(i).getEndNode(),
                                        edges.get(indexEdgeAlpha).getStartNode()
                                )
                        ));
                    }
                }

                //Add the edges exchange for the second new edge
                if (i != indexEdgeBeta && (indexEdgeBeta + 1) % edges.size() != i && (indexEdgeBeta - 1 + edges.size()) % edges.size() != i) {
                    //Calculate the delta cost
                    int deltaCost = -matrix.getDistance(edges.get(indexEdgeBeta).getStartNode(), edges.get(indexEdgeBeta).getEndNode())
                            - matrix.getDistance(edges.get(i).getStartNode(), edges.get(i).getEndNode())
                            + matrix.getDistance(edges.get(indexEdgeBeta).getStartNode(), edges.get(i).getStartNode())
                            + matrix.getDistance(edges.get(i).getEndNode(), edges.get(indexEdgeBeta).getEndNode());
                    if (deltaCost < 0) {
                        int EdgeBetaStartIndex = solution.getIndexOfNode(edges.get(indexEdgeBeta).getStartNode());
                        int EdgeBetaEndIndex = solution.getIndexOfNode(edges.get(indexEdgeBeta).getEndNode());
                        //Add the move to the list of moves
                        potentialMoves.add(new PotentialMove(
                                new edgesExchange(
                                        pMove.endingEdgeToReplaceWith, pMove.endingEdgeToReplace,
                                        edges.get(i).getStartNode(), edges.get(i).getEndNode(),
                                        EdgeBetaStartIndex, EdgeBetaEndIndex,
                                        solution.getIndexOfNode(edges.get(i).getStartNode()),
                                        solution.getIndexOfNode(edges.get(i).getEndNode()),
                                        solution.getVisitedNodes().get((EdgeBetaStartIndex + 1) % solution.getVisitedNodes().size()), (EdgeBetaStartIndex + 1) % solution.getVisitedNodes().size(),
                                        solution.getVisitedNodes().get((EdgeBetaEndIndex + 1) % solution.getVisitedNodes().size()), (EdgeBetaEndIndex + 1) % solution.getVisitedNodes().size(),
                                        edges.get((i + 1) % edges.size()).getStartNode(), solution.getIndexOfNode(edges.get((i + 1) % edges.size()).getStartNode()),
                                        edges.get((i + 1) % edges.size()).getEndNode(), solution.getIndexOfNode(edges.get((i + 1) % edges.size()).getEndNode()),
                                        solution.getVisitedNodes().get((EdgeBetaStartIndex - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size()), (EdgeBetaStartIndex - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size(),
                                        solution.getVisitedNodes().get((EdgeBetaEndIndex - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size()), (EdgeBetaEndIndex - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size(),
                                        edges.get((i - 1 + edges.size()) % edges.size()).getStartNode(), solution.getIndexOfNode(edges.get((i - 1 + edges.size()) % edges.size()).getStartNode()),
                                        edges.get((i - 1 + edges.size()) % edges.size()).getEndNode(), solution.getIndexOfNode(edges.get((i - 1 + edges.size()) % edges.size()).getEndNode()),
                                        deltaCost,
                                        edges.get(indexEdgeBeta).getEndNode(),
                                        edges.get(i).getStartNode(),
                                        edges.get(i).getEndNode(),
                                        edges.get(indexEdgeBeta).getStartNode()
                                )
                        ));


                    }
                }
            }

            // Add edges exchange for the reversed edges in the solution


            if (startingReverseIndex < endingReverseIndex) {
//                for (int e = startingReverseEdgeIndex; e < endingReverseEdgeIndex + 1; e++) {
//                    for (int i = 0; i < edges.size(); i++) {
//                        if (i != e && (e + 1) % edges.size() != i && (e - 1 + edges.size()) % edges.size() != i) {
//                            //Calculate the delta cost
//                            int deltaCost = -matrix.getDistance(edges.get(e).getStartNode(), edges.get(e).getEndNode())
//                                    - matrix.getDistance(edges.get(i).getStartNode(), edges.get(i).getEndNode())
//                                    + matrix.getDistance(edges.get(e).getStartNode(), edges.get(i).getStartNode())
//                                    + matrix.getDistance(edges.get(i).getEndNode(), edges.get(e).getEndNode());
//
//                            if (deltaCost < 0) {
//                                potentialMoves.add(new PotentialMove(
//                                        new edgesExchange(
//                                                edges.get(e).getStartNode(), edges.get(e).getEndNode(),
//                                                edges.get(i).getStartNode(), edges.get(i).getEndNode(),
//                                                edges.get(e).getStartNodeIndex(), edges.get(e).getEndNodeIndex(),
//                                                solution.getIndexOfNode(edges.get(i).getStartNode()),
//                                                solution.getIndexOfNode(edges.get(i).getEndNode()),
//                                                solution.getVisitedNodes().get((edges.get(e).getStartNodeIndex() + 1) % solution.getVisitedNodes().size()), (edges.get(e).getStartNodeIndex() + 1) % solution.getVisitedNodes().size(),
//                                                solution.getVisitedNodes().get((edges.get(e).getEndNodeIndex() + 1) % solution.getVisitedNodes().size()), (edges.get(e).getEndNodeIndex() + 1) % solution.getVisitedNodes().size(),
//                                                edges.get((i + 1) % edges.size()).getStartNode(), solution.getIndexOfNode(edges.get((i + 1) % edges.size()).getStartNode()),
//                                                edges.get((i + 1) % edges.size()).getEndNode(), solution.getIndexOfNode(edges.get((i + 1) % edges.size()).getEndNode()),
//                                                solution.getVisitedNodes().get((edges.get(e).getStartNodeIndex() - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size()), (edges.get(e).getStartNodeIndex() - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size(),
//                                                solution.getVisitedNodes().get((edges.get(e).getEndNodeIndex() - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size()), (edges.get(e).getEndNodeIndex() - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size(),
//                                                edges.get((i - 1 + edges.size()) % edges.size()).getStartNode(), solution.getIndexOfNode(edges.get((i - 1 + edges.size()) % edges.size()).getStartNode()),
//                                                edges.get((i - 1 + edges.size()) % edges.size()).getEndNode(), solution.getIndexOfNode(edges.get((i - 1 + edges.size()) % edges.size()).getEndNode()),
//                                                deltaCost,
//                                                edges.get(e).getEndNode(),
//                                                edges.get(i).getStartNode(),
//                                                edges.get(i).getEndNode(),
//                                                edges.get(e).getStartNode()
//                                        )
//                                ));
//                            }
//
//                        }
//                    }
//                }
            } else {
                // Get the edges that have been reversed
                ArrayList<Edge> reversedEdges = new ArrayList<Edge>();
                for (int i = startingReverseEdgeIndex; i < edges.size(); i++) {
                    reversedEdges.add(edges.get(i));
                }
                for (int i = 0; i < endingReverseEdgeIndex + 1; i++) {
                    reversedEdges.add(edges.get(i));
                }

                for (int e = 0; e < reversedEdges.size(); e++) {
                    for (int i = 0; i < edges.size(); i++) {
                        if (i != edges.indexOf(reversedEdges.get(e)) && (edges.indexOf(reversedEdges.get(e)) + 1) % edges.size() != i && (edges.indexOf(reversedEdges.get(e)) - 1 + edges.size()) % edges.size() != i) {
                            //Calculate the delta cost
                            int deltaCost = -matrix.getDistance(reversedEdges.get(e).getStartNode(), reversedEdges.get(e).getEndNode())
                                    - matrix.getDistance(edges.get(i).getStartNode(), edges.get(i).getEndNode())
                                    + matrix.getDistance(reversedEdges.get(e).getStartNode(), edges.get(i).getStartNode())
                                    + matrix.getDistance(edges.get(i).getEndNode(), reversedEdges.get(e).getEndNode());

                            if (deltaCost < 0) {
                                potentialMoves.add(new PotentialMove(
                                        new edgesExchange(
                                                reversedEdges.get(e).getStartNode(), reversedEdges.get(e).getEndNode(),
                                                edges.get(i).getStartNode(), edges.get(i).getEndNode(),
                                                reversedEdges.get(e).getStartNodeIndex(), reversedEdges.get(e).getEndNodeIndex(),
                                                solution.getIndexOfNode(edges.get(i).getStartNode()),
                                                solution.getIndexOfNode(edges.get(i).getEndNode()),
                                                solution.getVisitedNodes().get((reversedEdges.get(e).getStartNodeIndex() + 1) % solution.getVisitedNodes().size()), (reversedEdges.get(e).getStartNodeIndex() + 1) % solution.getVisitedNodes().size(),
                                                solution.getVisitedNodes().get((reversedEdges.get(e).getEndNodeIndex() + 1) % solution.getVisitedNodes().size()), (reversedEdges.get(e).getEndNodeIndex() + 1) % solution.getVisitedNodes().size(),
                                                edges.get((i + 1) % edges.size()).getStartNode(), solution.getIndexOfNode(edges.get((i + 1) % edges.size()).getStartNode()),
                                                edges.get((i + 1) % edges.size()).getEndNode(), solution.getIndexOfNode(edges.get((i + 1) % edges.size()).getEndNode()),
                                                solution.getVisitedNodes().get((reversedEdges.get(e).getStartNodeIndex() - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size()), (reversedEdges.get(e).getStartNodeIndex() - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size(),
                                                solution.getVisitedNodes().get((reversedEdges.get(e).getEndNodeIndex() - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size()), (reversedEdges.get(e).getEndNodeIndex() - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size(),
                                                edges.get((i - 1 + edges.size()) % edges.size()).getStartNode(), solution.getIndexOfNode(edges.get((i - 1 + edges.size()) % edges.size()).getStartNode()),
                                                edges.get((i - 1 + edges.size()) % edges.size()).getEndNode(), solution.getIndexOfNode(edges.get((i - 1 + edges.size()) % edges.size()).getEndNode()),
                                                deltaCost,
                                                reversedEdges.get(e).getEndNode(),
                                                edges.get(i).getStartNode(),
                                                edges.get(i).getEndNode(),
                                                reversedEdges.get(e).getStartNode()
                                        )
                                ));


                            }
                        }
                    }
                }
            }
            // Add the node exchange for the node of the new edges
            for (int i = 0; i < matrix.getMatrix().size(); i++) {
                if (!solution.getVisitedNodes().contains(i)) {
                    int previousNodeAlphaStart = solution.getVisitedNodes().get((indexEdgeAlpha - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size());
                    int nextNodeAlphaStart = solution.getVisitedNodes().get((indexEdgeAlpha + 1) % solution.getVisitedNodes().size());
                    int previousNodeAlphaEnd = solution.getVisitedNodes().get((indexEdgeAlpha - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size());
                    int nextNodeAlphaEnd = solution.getVisitedNodes().get((indexEdgeAlpha + 1) % solution.getVisitedNodes().size());

                    int deltaCostAlphaStart = -matrix.getDistance(previousNodeAlphaStart, edges.get(indexEdgeAlpha).getStartNode())
                            - matrix.getDistance(edges.get(indexEdgeAlpha).getStartNode(), nextNodeAlphaStart)
                            + matrix.getDistance(previousNodeAlphaStart, i)
                            + matrix.getDistance(i, nextNodeAlphaStart)
                            + weights.get(i) - weights.get(edges.get(indexEdgeAlpha).getStartNode());

                    int deltaCostAlphaEnd = -matrix.getDistance(previousNodeAlphaEnd, edges.get(indexEdgeAlpha).getEndNode())
                            - matrix.getDistance(edges.get(indexEdgeAlpha).getEndNode(), nextNodeAlphaEnd)
                            + matrix.getDistance(previousNodeAlphaEnd, i)
                            + matrix.getDistance(i, nextNodeAlphaEnd)
                            + weights.get(i) - weights.get(edges.get(indexEdgeAlpha).getEndNode());

                    int previousNodeBetaStart = solution.getVisitedNodes().get((indexEdgeBeta - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size());
                    int nextNodeBetaStart = solution.getVisitedNodes().get((indexEdgeBeta + 1) % solution.getVisitedNodes().size());
                    int previousNodeBetaEnd = solution.getVisitedNodes().get((indexEdgeBeta - 1 + solution.getVisitedNodes().size()) % solution.getVisitedNodes().size());
                    int nextNodeBetaEnd = solution.getVisitedNodes().get((indexEdgeBeta + 1) % solution.getVisitedNodes().size());

                    int deltaCostBetaStart = -matrix.getDistance(previousNodeBetaStart, edges.get(indexEdgeBeta).getStartNode())
                            - matrix.getDistance(edges.get(indexEdgeBeta).getStartNode(), nextNodeBetaStart)
                            + matrix.getDistance(previousNodeBetaStart, i)
                            + matrix.getDistance(i, nextNodeBetaStart)
                            + weights.get(i) - weights.get(edges.get(indexEdgeBeta).getStartNode());

                    int deltaCostBetaEnd = -matrix.getDistance(previousNodeBetaEnd, edges.get(indexEdgeBeta).getEndNode())
                            - matrix.getDistance(edges.get(indexEdgeBeta).getEndNode(), nextNodeBetaEnd)
                            + matrix.getDistance(previousNodeBetaEnd, i)
                            + matrix.getDistance(i, nextNodeBetaEnd)
                            + weights.get(i) - weights.get(edges.get(indexEdgeBeta).getEndNode());


                    if (deltaCostAlphaStart < 0) {
                        //Add the move to the list of moves
                        potentialMoves.add(new PotentialMove(
                                new nodeExchangeInter(
                                        edges.get(indexEdgeAlpha).getStartNode(), i, deltaCostAlphaStart,
                                        solution.getIndexOfNode(edges.get(indexEdgeAlpha).getStartNode()),
                                        previousNodeAlphaStart, nextNodeAlphaStart
                                )
                        ));

                    }

                    if (deltaCostAlphaEnd < 0) {
                        //Add the move to the list of moves
                        potentialMoves.add(new PotentialMove(
                                new nodeExchangeInter(
                                        edges.get(indexEdgeAlpha).getEndNode(), i, deltaCostAlphaEnd,
                                        solution.getIndexOfNode(edges.get(indexEdgeAlpha).getEndNode()),
                                        previousNodeAlphaEnd, nextNodeAlphaEnd
                                )
                        ));

                    }

                    if (deltaCostBetaStart < 0) {
                        //Add the move to the list of moves
                        potentialMoves.add(new PotentialMove(
                                new nodeExchangeInter(
                                        edges.get(indexEdgeBeta).getStartNode(), i, deltaCostBetaStart,
                                        solution.getIndexOfNode(edges.get(indexEdgeBeta).getStartNode()),
                                        previousNodeBetaStart, nextNodeBetaStart
                                )
                        ));


                    }

                    if (deltaCostBetaEnd < 0) {
                        //Add the move to the list of moves
                        potentialMoves.add(new PotentialMove(
                                new nodeExchangeInter(
                                        edges.get(indexEdgeBeta).getEndNode(), i, deltaCostBetaEnd,
                                        solution.getIndexOfNode(edges.get(indexEdgeBeta).getEndNode()),
                                        previousNodeBetaEnd, nextNodeBetaEnd
                                )
                        ));


                    }
                }
            }
        }

        //Sort the potential moves by cost
        Collections.sort(potentialMoves, new Comparator<PotentialMove>() {
            @Override
            public int compare(PotentialMove o1, PotentialMove o2) {
                return o1.getCost() - o2.getCost();
            }
        });

    }

    public static Solution localsearchPreviousIteration(distance_matrix matrix, List<Integer> weights, Solution initialSolution)  {
        // Generate potential moves
        ArrayList<PotentialMove> potentialMoves = generatePotentialMoves(initialSolution, matrix, weights);

        //Best solution
        Solution bestSolution = new Solution(initialSolution.getCost(), new ArrayList<>(initialSolution.getVisitedNodes()));

        int j = 0;
        while (true) {

            if (potentialMoves.isEmpty() || j >= potentialMoves.size()) {
                return bestSolution;
            }
            j =  0;
            // Apply the first move


            ArrayList<Edge> edges = new ArrayList<Edge>();
            for (int i = 0; i < bestSolution.getVisitedNodes().size(); i++) {
                edges.add(new Edge(bestSolution.getVisitedNodes().get(i), bestSolution.getVisitedNodes().get((i + 1) % bestSolution.getVisitedNodes().size()), i, (i + 1) % bestSolution.getVisitedNodes().size()));
            }

            while (j < potentialMoves.size()) {
                PotentialMove usedMove = potentialMoves.get(j);
                if (usedMove.isNodeExchangeInter()) {
                    // Apply the node exchange
                    ArrayList<Integer> tmp_solutionArray = new ArrayList<Integer>(bestSolution.getVisitedNodes());
                    Solution tmp_solution = new Solution(bestSolution.getCost(), tmp_solutionArray);
                    int nodeToReplace = usedMove.getNodeExchangeInter().getNodeInSolution();
                    int nodeNotInSolution = usedMove.getNodeExchangeInter().getNodeNotInSolution();
                    int previousNode = usedMove.getNodeExchangeInter().getPreviousNodeInSolution();
                    int nextNode = usedMove.getNodeExchangeInter().getNextNodeInSolution();
                    int cost = usedMove.getNodeExchangeInter().getCost();
                    int indexNodeToReplace = bestSolution.getVisitedNodes().indexOf(nodeToReplace);
                    if (bestSolution.getVisitedNodes().contains(nodeNotInSolution) || !bestSolution.getVisitedNodes().contains(nodeToReplace) || !bestSolution.getVisitedNodes().contains(previousNode) || !bestSolution.getVisitedNodes().contains(nextNode)
                            || (bestSolution.getVisitedNodes().get((bestSolution.getVisitedNodes().indexOf(nodeToReplace) - 1 + bestSolution.getVisitedNodes().size()) % bestSolution.getVisitedNodes().size()) != previousNode && bestSolution.getVisitedNodes().get((bestSolution.getVisitedNodes().indexOf(nodeToReplace) + 1) % bestSolution.getVisitedNodes().size()) != previousNode)
                            || (bestSolution.getVisitedNodes().get((bestSolution.getVisitedNodes().indexOf(nodeToReplace) - 1 + bestSolution.getVisitedNodes().size()) % bestSolution.getVisitedNodes().size()) != nextNode && bestSolution.getVisitedNodes().get((bestSolution.getVisitedNodes().indexOf(nodeToReplace) + 1) % bestSolution.getVisitedNodes().size()) != nextNode)
                            || nextNode == previousNode
                    ) {
                        potentialMoves.remove(usedMove);
                    } else {
                        tmp_solution.getVisitedNodes().set(indexNodeToReplace, nodeNotInSolution);
                        bestSolution = new Solution(tmp_solution.getCost() + cost, tmp_solution.getVisitedNodes());
                        potentialMoves.remove(usedMove);
                        // Add the new potential moves for the node exchange
                        addNewPotentialMoves(bestSolution, matrix, weights, potentialMoves, usedMove);
                        break;
                    }
                } else {
                    // Apply the edges exchange
                    ArrayList<Integer> tmp_solutionArray = new ArrayList<Integer>(bestSolution.getVisitedNodes());
                    Solution tmp_solution = new Solution(bestSolution.getCost(), tmp_solutionArray);
                    int startingEdgeToReplace = usedMove.getEdgesExchange().getStartingEdgeToReplace();
                    int startingEdgeToReplaceWith = usedMove.getEdgesExchange().getStartingEdgeToReplaceWith();
                    int endingEdgeToReplace = usedMove.getEdgesExchange().getEndingEdgeToReplace();
                    int endingEdgeToReplaceWith = usedMove.getEdgesExchange().getEndingEdgeToReplaceWith();
                    int indexReverseStart = usedMove.getEdgesExchange().getNodeStartReverse();
                    int indexReverseEnd = usedMove.getEdgesExchange().getNodeEndReverse();
                    int cost = usedMove.getEdgesExchange().getCost();

                    int indexEdgeAlpha = -1;
                    int indexEdgeBeta = -1;
                    int indexEdgeAlphaReversed = -1;
                    int indexEdgeBetaReversed = -1;

                    int sucessorEdgeAlphaIndex = -1;
                    int sucessorEdgeBetaIndex = -1;
                    int predecessorEdgeAlphaIndex = -1;
                    int predecessorEdgeBetaIndex = -1;


                    for (int e = 0; e < edges.size(); e++) {
                        if (edges.get(e).getStartNode() == startingEdgeToReplace && edges.get(e).getEndNode() == endingEdgeToReplace) {
                            indexEdgeAlpha = e;
                        }
                        if (edges.get(e).getStartNode() == startingEdgeToReplaceWith && edges.get(e).getEndNode() == endingEdgeToReplaceWith) {
                            indexEdgeBeta = e;
                        }
                        if (edges.get(e).getStartNode() == endingEdgeToReplace && edges.get(e).getEndNode() == startingEdgeToReplace) {
                            indexEdgeAlphaReversed = e;
                        }
                        if (edges.get(e).getStartNode() == endingEdgeToReplaceWith && edges.get(e).getEndNode() == startingEdgeToReplaceWith) {
                            indexEdgeBetaReversed = e;
                        }
                        if (edges.get(e).getStartNode() == usedMove.getEdgesExchange().startToReplaceSuccessor[0] && edges.get(e).getEndNode() == usedMove.getEdgesExchange().endToReplaceSuccessor[0]) {
                            sucessorEdgeAlphaIndex = e;
                        }
                        if (edges.get(e).getStartNode() == usedMove.getEdgesExchange().startToReplaceWithSuccessor[0] && edges.get(e).getEndNode() == usedMove.getEdgesExchange().endToReplaceWithSuccessor[0]) {
                            sucessorEdgeBetaIndex = e;
                        }
                        if (edges.get(e).getStartNode() == usedMove.getEdgesExchange().startToReplacePredecessor[0] && edges.get(e).getEndNode() == usedMove.getEdgesExchange().endToReplacePredecessor[0]) {
                            predecessorEdgeAlphaIndex = e;
                        }
                        if (edges.get(e).getStartNode() == usedMove.getEdgesExchange().startToReplaceWithPredecessor[0] && edges.get(e).getEndNode() == usedMove.getEdgesExchange().endToReplaceWithPredecessor[0]) {
                            predecessorEdgeBetaIndex = e;
                        }
                    }



                    // If the edges are not into the solution anymore, we remove the move from the list of potential moves
                    if ((indexEdgeAlpha == -1 && indexEdgeAlphaReversed == -1) || (indexEdgeBeta == -1 && indexEdgeBetaReversed == -1)
                            || sucessorEdgeAlphaIndex == -1 || sucessorEdgeBetaIndex == -1 || predecessorEdgeAlphaIndex == -1 || predecessorEdgeBetaIndex == -1
                    ) {

                        potentialMoves.remove(usedMove);

                    } else {


                        // If the edges are still into the solution but the direction has changed, we keep the move from the list of potential moves and we try the next move
                        if ((indexEdgeAlphaReversed != -1 && indexEdgeBetaReversed == -1) || (indexEdgeAlphaReversed == -1 && indexEdgeBetaReversed != -1)) {

                            j++;

                        } else {


                            int differenceStandard = tmp_solution.getIndexOfNode(usedMove.edgesExchange.nodeEndReverse) - tmp_solution.getIndexOfNode(usedMove.edgesExchange.nodeStartReverse);
                            int differenceReversed = tmp_solution.getIndexOfNode(usedMove.edgesExchange.nodeEndReverseIfReversed) - tmp_solution.getIndexOfNode(usedMove.edgesExchange.nodeStartReverseIfReversed);
                            int distanceByBoucling = tmp_solution.getVisitedNodes().size() - tmp_solution.getIndexOfNode(usedMove.edgesExchange.nodeStartReverse) + tmp_solution.getIndexOfNode(usedMove.edgesExchange.nodeEndReverse);
                            int distanceByBouclingReversed = tmp_solution.getVisitedNodes().size() - tmp_solution.getIndexOfNode(usedMove.edgesExchange.nodeStartReverseIfReversed) + tmp_solution.getIndexOfNode(usedMove.edgesExchange.nodeEndReverseIfReversed);


                            // Depending on the minimum difference between the two edges, we apply the move
                            if (Math.abs(differenceStandard) <= Math.abs(differenceReversed)) {
                                // Reverse the edges
                                if (Math.abs(distanceByBouclingReversed) < Math.abs(differenceStandard)) {
                                    // The best exchange is the one that from end part of the list to the start part of the list
                                    ArrayList<Integer> tmp = new ArrayList<Integer>();
                                    int index_end = Math.max(tmp_solution.getIndexOfNode(usedMove.edgesExchange.nodeStartReverseIfReversed), tmp_solution.getIndexOfNode(usedMove.edgesExchange.nodeEndReverseIfReversed));
                                    for (int i = index_end; i < tmp_solution.getVisitedNodes().size(); i++) {
                                        tmp.add(tmp_solution.getVisitedNodes().get(i));
                                    }
                                    int index_start = Math.min(tmp_solution.getIndexOfNode(usedMove.edgesExchange.nodeStartReverseIfReversed), tmp_solution.getIndexOfNode(usedMove.edgesExchange.nodeEndReverseIfReversed));
                                    for (int i = 0; i < index_start + 1; i++) {
                                        tmp.add(tmp_solution.getVisitedNodes().get(i));
                                    }
                                    Collections.reverse(tmp);
                                    for (int i = index_end; i < tmp_solution.getVisitedNodes().size(); i++) {
                                        tmp_solution.getVisitedNodes().set(i, tmp.get(i - index_end));
                                    }
                                    for (int i = 0; i < index_start + 1; i++) {
                                        tmp_solution.getVisitedNodes().set(i, tmp.get(i + tmp_solution.getVisitedNodes().size() - index_end));
                                    }


                                } else {
                                    Collections.reverse(
                                            tmp_solution.getVisitedNodes().subList(
                                                    Math.min(tmp_solution.getIndexOfNode(usedMove.edgesExchange.nodeStartReverse),
                                                            tmp_solution.getIndexOfNode(usedMove.edgesExchange.nodeEndReverse)),
                                                    Math.max(tmp_solution.getIndexOfNode(usedMove.edgesExchange.nodeStartReverse),
                                                            tmp_solution.getIndexOfNode(usedMove.edgesExchange.nodeEndReverse)) + 1
                                            ));
                                }
                            } else {
                                Collections.reverse(
                                        tmp_solution.getVisitedNodes().subList(
                                                Math.min(tmp_solution.getIndexOfNode(usedMove.edgesExchange.nodeStartReverseIfReversed),
                                                        tmp_solution.getIndexOfNode(usedMove.edgesExchange.nodeEndReverseIfReversed)),
                                                Math.max(tmp_solution.getIndexOfNode(usedMove.edgesExchange.nodeStartReverseIfReversed),
                                                        tmp_solution.getIndexOfNode(usedMove.edgesExchange.nodeEndReverseIfReversed)) + 1
                                        ));
                            }

                            bestSolution = new Solution(tmp_solution.getCost() + cost, tmp_solution.getVisitedNodes());
                            potentialMoves.remove(usedMove);
                            // Add the new potential moves for the edges exchange
                            addNewPotentialMoves(bestSolution, matrix, weights, potentialMoves, usedMove);
                            break;
                        }
                    }
                }

            }

        }
    }
}