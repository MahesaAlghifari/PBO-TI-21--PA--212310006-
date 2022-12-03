import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Latihan02 {

	public static void main(String[] args) {

		
		JOptionPane jop = new JOptionPane();
		ArrayList<ArrayList<Integer>> MatrixA = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> MatrixB = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> MatrixC = new ArrayList<ArrayList<Integer>>();
		
		for (int i = 0; i<2; i++) {
			for (int j = 0; j<2; j++) {
				String value = jop.showInputDialog(null, "Masukkan Angka :","Matriks A["+i+"]["+j+"]",JOptionPane.QUESTION_MESSAGE);
				MatrixA.add(new ArrayList<Integer>());
				MatrixA.get(i).add(j, Integer.parseInt(value));
			}
		}
		for (int i = 0; i<2; i++) {
			for (int j = 0; j<2; j++) {
				String value = jop.showInputDialog(null, "Masukkan Angka :","Matrix B["+i+"]["+j+"]",JOptionPane.QUESTION_MESSAGE);;
				MatrixB.add(new ArrayList<Integer>());
				MatrixB.get(i).add(j, Integer.parseInt(value));
			}
		}
		String output = "";
		System.out.println("Matrix A");
		output += "Matrix A \n";
		for(int i=0; i<2; i++) {
			for(int j = 0; j<2; j++) {
				output+= MatrixA.get(i).get(j)+"";
			}	output+= "\n";
		}
		String output2 = "";
		System.out.println("Matrix B");
		output2 += "\nMatrix B \n";
		for(int i=0; i<2; i++) {
			for(int j = 0; j<2; j++) {
				output2+= MatrixB.get(i).get(j)+"";
			} 	output2+= "\n";
		}
		String output3 = "";
		System.out.println("Matrix C");
		output3 += "\nMatrix C \n";
		for(int i=0; i<2; i++) {
			for(int j = 0; j<2; j++) {
				output3+= MatrixA.get(i).get(j) * MatrixB.get(i).get(j);
			} 	output3+= "\n" ;
				
				
		}
		
	jop.showMessageDialog(null, output+output2+output3);
	}
}