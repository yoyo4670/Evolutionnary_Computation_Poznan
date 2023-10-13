# README
***
## Introduction

This project is a solution of the Poznan University of Technology course "Evolutionary Computation". The goal of this project is to generate by different algorithms a solution to the TSP problem.
The project use Java OpenJDK 20.0.1 for the implementation of the algorithms and Python notebook to create graphical representation of the problem and solutions.

The following algorithms were implemented for now:
* Random Search
* Near Neighbour Search
* Greedy Search

***
## How to run

Load the project into your IDE and run the main method in the Main class. After the program is finished, the best, average and worst solution costs will be display on the terminal.
As well, csv files will be generated in the project directory with the best solution of the algorithms. It contains the order of index of the visited points from the instance file.

To generate graphical representation of the problem and solutions, run the python notebook in the Jupyter Notebook.
You will need to tweak the notebook paths to the csv files to generate the graphs.