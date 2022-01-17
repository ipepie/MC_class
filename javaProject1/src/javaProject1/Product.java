package javaProject1;

public class Product {
	String prdNo;
	String prdName;
	int prdPrice;
	int prdYear;
	String prdMaker;
	
	
	Product(String prdNo, String prdName, int prdPrice, int prdYear, String prdMaker) {
		this.prdNo = prdNo;
		this.prdName = prdName;
		this.prdPrice =  prdPrice;
		this.prdYear = prdYear;
		this.prdMaker = prdMaker;
	}
	
	@Override
	public String toString() {
		//System.out.println(prdNo+"\t"+prdName+"\t"+prdPrice+"\t"+prdYear+"\t"+prdMaker);
		return prdNo+"\t"+prdName+"\t"+prdPrice+"\t"+prdYear+"\t"+prdMaker;
	}
}
