import javax.swing.JOptionPane;

public class Latihan04 {

	public static void main(String[] args) {
		Biodata bio = new Biodata();
		
		final String WARN = "PERINGATAN!";
		boolean isLanjut = true;
		
		while(isLanjut) {
			String nama = JOptionPane.showInputDialog(null, "Fullname : ", "Form Nama", JOptionPane.QUESTION_MESSAGE);
			
			if(nama.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Field Form Nama tidak boleh kosong!", WARN, JOptionPane.WARNING_MESSAGE);
				System.exit(0);
			}
			
			String usia = JOptionPane.showInputDialog(null, "Usia : ", "Form Usia", JOptionPane.QUESTION_MESSAGE);
			final String REG_NUMERIK = "[0-9]+";
			
			if(usia.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Field Form Usia tidak boleh kosong!", WARN, JOptionPane.WARNING_MESSAGE);
				} else if(!usia.matches(REG_NUMERIK)) {
					JOptionPane.showMessageDialog(null, "Isian Form Usia harus numerik!", WARN, JOptionPane.WARNING_MESSAGE);
					System.exit(0);
				}
			
			String alamat = JOptionPane.showInputDialog(null, "Alamat : ", "Form Alamat", JOptionPane.QUESTION_MESSAGE);
			
			if(alamat.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Field Form Alamat tidak boleh kosong!", WARN, JOptionPane.WARNING_MESSAGE);
				} else if(alamat.length() < 10) {
					JOptionPane.showMessageDialog(null, "Masukkan alamat minimum 10 karakter!", WARN, JOptionPane.WARNING_MESSAGE);
				}
			
			int pUsia = Integer.parseInt(usia);
			
			bio.setData(nama, pUsia, alamat);
			bio.getData();
			
			int keluar = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin keluar?", "Keluar?", JOptionPane.YES_NO_OPTION);
			
			if(keluar == JOptionPane.YES_OPTION) {
				isLanjut = false;
				} else {
					isLanjut = true;
			}
		}
	}
}