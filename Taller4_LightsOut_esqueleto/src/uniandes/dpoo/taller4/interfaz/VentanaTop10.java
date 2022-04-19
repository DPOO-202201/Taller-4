package uniandes.dpoo.taller4.interfaz;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class VentanaTop10 extends JFrame{
	private JPanel panelTop;
	private JLabel columnaPosicion,columnaNombre,columnaPuntaje;
	
	public VentanaTop10() {
		setTitle("Top 10");
		setSize(580,700);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panelTop;
        setLayout(new GridLayout(11,3));
        columnaPosicion = new JLabel("Posicion");
        columnaNombre = new JLabel("Nombre");
        columnaPuntaje = new JLabel("Puntaje");
        
        add(columnaPosicion);
        add(columnaNombre);
        add(columnaPuntaje);
	}
}