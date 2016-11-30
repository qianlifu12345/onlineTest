package project1;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Link link=new Link(1);
		link.add(2);
		link.add(3);
		link.add(4);
		link.add(5);
		link.add(6);
		link.add(7);
		link.add(8);
		link.add(9);
		link.add(10);

		System.out.println(link.getValueFromBack(10));
		//Test link boundary
		System.out.println(link.getValueFromBack(11));

	}

}
