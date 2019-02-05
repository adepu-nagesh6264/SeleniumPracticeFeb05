
public class interviewmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int abc[][]= {{6,5,7},{6, 9, 1}, {4, 3, 8}};
int max=abc[0][0];
for(int i =0; i<3; i++) {
	for(int j = 0;j<3; j++) {
		if(abc[i][j]>max) {
			max = abc[i][j];			
		}
		
	}
	}
System.out.println(max);
	}

}
