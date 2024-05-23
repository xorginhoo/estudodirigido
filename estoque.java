package atvidadeestoque;
import javax.swing.JOptionPane;
public class estoque {

	public static void main(String[] args) {
	
JOptionPane.showMessageDialog(null,"produto1");
		
		String m1 = JOptionPane.showInputDialog("digite a venda do mes 1:");
		int mes1 = Integer.parseInt(m1);
		
		String m2 = JOptionPane.showInputDialog("digite a venda do mes 2:");
		int mes2 = Integer.parseInt(m2);
		
		String m3 = JOptionPane.showInputDialog("digite a venda do mes 3:");
		int mes3 = Integer.parseInt(m3);
		
		int vmd = ((mes1 + mes2 + mes3) / 3) / 25;
		
		JOptionPane.showMessageDialog(null,"vmd:" + vmd);
		
		
		JOptionPane.showMessageDialog(null,"produto2");
		
		String m01 = JOptionPane.showInputDialog("digite a venda do mes 1:");
		int mes01 = Integer.parseInt(m01);
		
		String m02 = JOptionPane.showInputDialog("digite a venda do mes 2:");
		int mes02 = Integer.parseInt(m02);
		
		String m03 = JOptionPane.showInputDialog("digite a venda do mes 3:");
		int mes03 = Integer.parseInt(m03);
		
		int vmd2 = ((mes01 + mes02 + mes03) / 3) / 25;
		
		JOptionPane.showMessageDialog(null,"vmd:" + vmd2);
		
		
		JOptionPane.showMessageDialog(null,"conferindo estoque minimo do produto 1....");
		
		String tr1 = JOptionPane.showInputDialog("digite o tempo de reposição:");
		int tr01 = Integer.parseInt(tr1);
		
		int emin = tr01 * vmd;
		
		JOptionPane.showMessageDialog(null,"estoque minimo:" + emin);
		
		JOptionPane.showMessageDialog(null,"conferindo estoque minimo do produto 2....");
		
		String tr2 = JOptionPane.showInputDialog("digite o tempo de reposição:");
		int tr02 = Integer.parseInt(tr2);
		
		int emin2 = tr02 * vmd2;
		
		JOptionPane.showMessageDialog(null,"estoque minimo:" + emin2);
		
		
		JOptionPane.showMessageDialog(null,"conferindo estoque máximo do produto 1....");
		
		String lr1 = JOptionPane.showInputDialog("digite o lote de reposição:");
		int lr01 = Integer.parseInt(lr1);
		
		
		int emax = emin + lr01;
		
		JOptionPane.showMessageDialog(null,"estoque máximo:" + emax);
		
		
		JOptionPane.showMessageDialog(null,"conferindo estoque máximo do produto 2....");
		
		
		String lr2 = JOptionPane.showInputDialog("digite o lote de reposição:");
		int lr02 = Integer.parseInt(lr2);
		
		
		int emax2 = emin2 + lr02;
		
		JOptionPane.showMessageDialog(null,"estoque máximo:" + emax2);
		
		
		JOptionPane.showMessageDialog(null,"conferindo estoque atual do produto 1....");
		
		String ea = JOptionPane.showInputDialog("digite o estoque atual:");
		int ea1 = Integer.parseInt(ea);
		
		if(ea1 < emin) {
			JOptionPane.showMessageDialog(null,"comprar");
		}
		
		else {
			JOptionPane.showMessageDialog(null,"não comprar");
		}
		

		JOptionPane.showMessageDialog(null,"conferindo estoque atual do produto 2....");
		
		String ea2 = JOptionPane.showInputDialog("digite o estoque atual:");
		int ea02 = Integer.parseInt(ea2);
		
		if(ea02 < emin2) {
			JOptionPane.showMessageDialog(null,"comprar");
		}
		
		else {
			JOptionPane.showMessageDialog(null,"não comprar");
		}
		}
	
	
	}
		
				
		
		

	
	


