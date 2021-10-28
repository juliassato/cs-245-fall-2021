/*
	notes 10: trees
	julia sato [fall 2021]
	oct 25, 2021

	
	
	binary tree: 
		> the original node has 0, 1, or 2 children
		> the leaves are at the ends. a leaf is anything with no children. 
		subtree: part of the tree starting with a node and including all the 
		descendant nodes. 
		++ a binary tree can have at most 2 children. ++ 
			that's what makes it binary
	binary search tree: 
		search tree: from a particular node, each value on the left has a key value less
		than the key. everything to right has a greater or equal key value.

		!! generally duplicates are Not Allowed !! (duplicate keys) 
			either not allow or use a consistent rule. 
		
		using int for keys but it should be a Comparable. int is just simpler ? 
		
		functions : 
			find 
			insert
			remove
		
		each are protected. the public ones call the protected versions. shadow version 
		
		recursive function in a recursive data structure etc
		we have to rebuild the entire tree whenver we insert or remove something. :( 
			"i'm getting a lot of pain... i feel a lot of pain from over here...
				we'll get through this together." -professor, in regards to bst

		> there seems to be no standard for binary search trees. 
		

		find:
		recursive definition--every node that has a left must have lesser values to the left. 
			like applies universally. 
			
		sometimes people use 'root' as a parameter name for the recursive function because
		it is technically using the node as a new root, regarding it as such.
		professor says do not do this because we were not raised by wolves. it is not the 
		real root so we are calling it 'node'. 

		it looks and goes left and right as is appropriate. everything has a left and right
		or nothing is there. 

		+ the value of the root does not matter. +
		

		insert: 
		find find find, insert, then rebuild ?
		it is pretty confusing . 
		1. perform a find. where the find fails, that is where you need to insert. 
		2. root = insert(root, key) where key is the value inserted 
		// recursion is hard for me. 
		3. most of the time it is just 'i acknowledge my left child'. 
		4. but sometimes there needs to be a new child. 


		50, 76, 17, 9 14, 54, 23, 12, 72, 67, 19 

				50
			17		76
		9		
			14


	traversals:
	hitting every node on the tree. 
	> in-order : start from root. visit entire left subtree. then visit the right. 
		go left left left left left. then go up one and then go right. 
		aka. visiting the nodes in-order. 
		>>> go left when possible. then go right. but recursively go left when possible. 
	> post-order : useful in 'deficient' languages to destroy trees. very useful there. 
	> pre-order : children first (good for copying things

	copy constructor: recursive copying structure? top down? can do without damaging tree ? 
		important in c++. 
		e.g. you store your tree and then you have to reconstruct it. because you need
		to reconstruct from parents, use parent before children structure. 

	in order : 
	protected void inOrderTraversal(BSTNode node){
		if(node != null){
			inOrderTraversal(node.left);
			System.out.println(node.data);
			inOrderTraversal(node.right);
		}
	}

	BST delete: most terrible code we will write. 
		> easy case - delete a leaf. 
			if it has one child, take the child and put it in the parent pos.
		> harder - replacing with in order successor , leftmost thing in the right subtree
			and then making that the root node instead. you can also look at the ..?

		the find is the ugly thing ? 
		we care about what the tree looks like after a remove. but no memorization 
		may need in-order successor. 

		> find first node matching key
		> if has 0 or 1 child promote to parent. 
		> i missed the next step

	performance of trees: 
		- better than linked list. but can become looking like a link list and therefore 
			performs like one. (worst case) 
		- otherwise generally O(log n) for a find/insert/delete
		- any traversal O(n) 
		> technically what we care about is the height of the tree 
			kind of hard to find ? 
			we write it recursively . 
			base case: the node's next is null
			+ traverse to all the ends, then count up from the ends and figure out 
				which is the highest count. 
		counting nodes: recursively return things to add up !
	
	degenerate tree: each intereior node has 1 child
	full tree: 	each interior has 2 children
	perfect tree: perfectly balanced and full

		







*/


public class Trees{






}


