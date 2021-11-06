


public boolean isPerfect(){

	if(height(root) == 1)
		return true;
	
	if(root.left == null || root.right == null)
		return false;

	if(subTreeCount(root.left, 0) != subTreeCount(root.right, 0))
		return false;
	if(height(root.left) != height(root.right)) 
		return false; 
	
	return true;

}


public int height(BSTNode node){
	
	int nl = 0;
	int nr = 0;

	if(node.left == null && node.right == null) 
		return 1;

	if(node.left != null) 
		nl = height(node.left);
	if(node.right != null)
		nr = height(node.right);
	if(nl > nr)
		return nl++;
	return nr++;

}



public int subTreeCount(BSTNode node, int count){
	if(node.left == null && node.right == null){
		return count++;
	}

	if(node.left != null)
		count += subTreeCount(node.left, count);
	if(node.right != null)
		count += subTreeCount(node.right, count);
	
	return count++; 
}










public void insert(int pos, T item){
	
	LLNode node = new LLNode(item); 

	if(pos == 0){
		node.next = head;
		node.prev = head.prev;
		head = node; 
	}else{

		LLNode current = head; 

		for(int i = 0; i < pos; i++){
			current = current.next; 
		}
		
		if(pos == count)
		
		else{
			node.prev = current.prev; 
			node.next = current; 
		}

	}

}































