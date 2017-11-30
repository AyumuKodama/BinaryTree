/*
 * This class defines the basic node used in a binary tree
 */
public class Node {

	public int record;
	public Node left, right;
	
	public Node(int newRecord) {
		record = newRecord;
		left = null;
		right = null;
	}
	
}