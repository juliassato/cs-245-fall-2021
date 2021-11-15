/*
	notes 11: graphs , breadth-first search, depth-first search
	julia sato for cs-245 [fall 2021]
	november 12, 2021, nov 15, 2021



	graphs vs trees? 
	> a tree is meant to use key-value pairs and get to the items quickly. 
		storing some data: retrieving the data by key. 
		at some point may care abt reproducing items in order. (more or less linear time)
	> graph can be used for modelling contact tracing, spread of ideas, etc... network model
		there are no parents or children in graphs -- association, not hierarchy
		+ adjacency lists and matrices are the main representations
		+ there is no graph package in standard java


	
	++ breadth-first search [BFS] ++ 
	robots.txt 
	- needs a source vertex, quque, and bool array to track visited/notvisited
	- runtime O(|V|+|E|) 
	- how search engines work

	++ depth-first search [DFS] ++ 
	> the only difference between bfs and dfs is that DFS uses a stack and bfs uses a queue.
	+ used for board games and things like that (lots of possibility, x starting position) 
	
	+++ visits in 'chains'... dfs is chains, bfs is layers

*/

public class Graphs{

}
