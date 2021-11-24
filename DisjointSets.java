/*
	notes 12: disjoint sets

	professor's family - motivating problem
	- the siblings: mother, sisters, brorther
	- each had a bumch of sibling piles 
	disjoint set connects groups at certain places (e.g. complex family trees ?)

	>pretty much all you want to be able to do is merge sets. 
	> merge groups, merge individuals into groups, merge individuals into group

	'it's a really weird data structure'. 
	 'computer science don't like things that are complicated. take note of that.' 

	2 essential functions ( most important )
		> union operation - puts them in the same group
			when it merges, what group gets overriden. but 'does it matter owo?' 
			- takes 2 ints to merge . pick one to be parent 

		> find operation - returns group of individual
			recursively goes up the tree until it finds a value > 0 . linear o(n) 

		+ constructur(ish), createSets places each ynique invidual in a group
			the array is initiialized as -1. linear? 
			negative numbers indicates the depth of the tree

		> path compression (part of find?) do a recursive find . flattens all the stuff find and above (betwen parent) . . 


	data structure: using int array to represent a tree (multiple trees). no parent: -1, else , # parent
		items are numbered to corresponding place in array, then at the indicies the numbebrbr is the parent. 




*/

public class DisjointSets{

}


