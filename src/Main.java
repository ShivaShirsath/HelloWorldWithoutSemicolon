public class Main{
	public static void main(String[] args){
		if(System.out.printf("Hello World !" + " ( using '.printf'   & 'null'      )" + "\n")==null){}
		if(System.out.printf("Hello World !" + " ( using '.printf'   & '.equals()' )" + "\n").equals("")){}
		if(System.out.append("Hello World !" + " ( using '.append()' & 'null'      )" + "\n")==null){}
		if(System.out.append("Hello World !" + " ( using '.append()' & '.equals()' )" + "\n").equals("")){}
		while(System.out.format("In this Program, there is no semicolon used !", null)==null){}
	}
}
