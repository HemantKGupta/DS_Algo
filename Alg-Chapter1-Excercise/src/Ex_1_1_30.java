public class Ex_1_1_30 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Node first = new Node();
		first.item=1;
		Node temp = first;		
		
		for(int j=2;j<6;j++){			
			Node n = new Node();
			n.item=j;
			temp.next=n;
			temp=temp.next;			
		}
		
		Node t= first;
		while(null!=t){			
			System.out.println(t.item);
			t=t.next;
		}	
		
		//Node newfirst = reverse(first);
		Node newfirst = reverseRecu(first);
		
		Node t1= newfirst;
		while(null!=t1){			
			System.out.println(t1.item);
			t1=t1.next;
		}	
		
		

	}
	
	public static Node reverseRecu(Node curr){
		
		if (curr.next==null){
			Node n = new Node();
			n.item=curr.item;
			n.next=null;
			return n;
		}else{
			Node n = reverseRecu(curr.next);
			Node m =new Node();
			m.item=curr.item;
			Node tmp=n;
			while(null!=tmp.next){
				tmp=tmp.next;
			}
			tmp.next=m;
			return n;
		}
		
			
	}
	
	public static Node reverse(Node curr){
		
		Node first = new Node();
		first.item=curr.item;
		curr=curr.next;
		while(curr!=null){			
			Node temp = new Node();
			temp.item=curr.item;
			temp.next=first;
			first=temp; 
			curr=curr.next;			
		}		
		
		return first;
		
	}
	
	static class Node{
		
		 private int item;
	     private Node next;
	}

}
