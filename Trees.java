/*
	notes 10: trees
	julia sato [fall 2021]
	oct 25, 2021, oct 29, 2021

	
	
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
	
	degenerate tree: each intereior node has zero children or 1 child. worst performance on find/insert/rm
	full tree: 	each interior has 2 children
	perfect tree: perfectly balanced and full and all leaves same distance from depth to root. 
	balanced tree: height of left and right differ at most by 1 


	++++ self balancing trees ++++ 

	AVL tree: rotates to balance by moving the root (prof hates these) 
			red black trees

	2-3 trees, 2-3-4 trees, B trees
	
	2-3 trees :  always a perfect tree. built by '2' nodes and '3' nodes. 	
		2 node: either 2 children or 0 children. has 1 value
		3 node: either 3 children or 0 children. has 2 values

		performance is log2(n) or log3(n)

		> [IMPLEMENTATION NOTE] often people will use 3 nodes as 2 nodes. 
					then just don't use the middle child or the other pair.

		the tree is always balanced because it distributes 
		grows upwards even though always inserting in leaves ?
		
		how do we think about inserting? insert(k)
			1. find k. (where you will perform the insert) 
			2. 2-node: [add k to 2-node]
			   3-node: [arrange keys in sorted order]
			   	   [promote the middle value]
				   [split others to left and right]
				   [recursively add the middle key to parent]
		
		Q: why don't we also have a 4 node? 
		A: would technically be even more efficient, but since you promote the middle it causes issues
			because it's an even number and you have to select it 
		
		prof: why not get carried away? then it becomes a B tree. 
			it is what computers are based on more than anything else. 
			access anything in exactly log n time. 

			it is called a b tree because it's to the degree of b. 
			a 2-3 tree is a b tree of degree n. 

		Q[clay]: what is the largest you should go? 
		A: depends on amt of stuff in b tree but he has seen the degree 11 b tree at most. 
			there is no good answer.. 


	n-ary tree: (aka kary tree kway tree mary tree) 
		>> each node can have any number of children. 
		>> leaves at the same level will link to each other. 

	

	+++++++++++++ databases: bonus notes (after class) ++++++++++++++++++

				how do databases work?
	
	+ if we see any repeats we remove that. ? 
	ex. music
	
	crow's foot erd (entity related database? i missed it) 
	an artist can create many songs, an album can contain many songs. 

	usually in databases we have an arbitrary id. for say an artist. 
	the whole thing becomes a key value pair. 
	[value: drake , key: ..? ] you end up inserting into a tree based on the key. 

	how to determine the key? 
		in classic relational database: eg mysql. 
		you are allowed to have 1 key. 
		to avoid having a linear search time by going through everything. 
		construct a tree on top as a quick index for each search term (e.g. genre) 
	modern databases have different ways of accessing data. 


*/


public class Trees{






}


