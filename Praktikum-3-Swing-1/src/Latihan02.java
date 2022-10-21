import javax.swing.JOptionPane;

public class Latihan02 {

	public static void main(String[] args) {
		Biodata bio = new Biodata();
		
		String nama = JOptionPane.showInputDialog(null, "Fullname : ", "Form Nama", JOptionPane.QUESTION_MESSAGE);
		String usia = JOptionPane.showInputDialog(null, "Usia : ", "Form Usia", JOptionPane.QUESTION_MESSAGE);
		String alamat = JOptionPane.showInputDialog(null, "Alamat : ", "Form Alamat", JOptionPane.QUESTION_MESSAGE);
		
		int pUsia = Integer.parseInt(usia);
		
		bio.setData(nama, pUsia, alamat);
		bio.getData();
	}
	
}