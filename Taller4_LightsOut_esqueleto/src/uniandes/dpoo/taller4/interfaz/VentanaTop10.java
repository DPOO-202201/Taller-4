package uniandes.dpoo.taller4.interfaz;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class VentanaTop10 extends JFrame{
	private JPanel panelTop;
	private JLabel columnaPosicion,columnaNonbre,columnaPuntaje;
	private JLabel infoCuadricula;
	
	public VentanaTop10() {
		setTitle("Top 10");
		setSize(580,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panelTop;
        setLayout(new GridLayout(11,2));
        infoCuadricula = new JLabel();
	}
}