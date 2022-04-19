package uniandes.dpoo.taller4.interfaz;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.event.*;

@SuppressWarnings("serial")
public class PanelPropiedades extends JPanel implements ChangeListener{
	
	private JRadioButton radio1,radio2,radio3;
	private ButtonGroup bg;
	private JComboBox<String> listaTamanio;
	private JLabel lblDificultad;
	private JLabel lblTamanio;
	
	public PanelPropiedades()
	{
		setLayout(new GridLayout(1,9));
		setBackground(Color.DARK_GRAY);
		bg = new ButtonGroup();
		
		radio1 = new JRadioButton("Facil");
		radio1.setBackground(Color.DARK_GRAY);
		radio1.setForeground(Color.WHITE);
		radio1.addChangeListener(this);
		bg.add(radio1);
		
		radio2 = new JRadioButton("Medio");
		radio2.setBackground(Color.DARK_GRAY);
		radio2.setForeground(Color.WHITE);
		radio2.addChangeListener(this);
		bg.add(radio2);
		
		radio3 = new JRadioButton("Dificil");
		radio3.setBackground(Color.DARK_GRAY);
		radio3.setForeground(Color.WHITE);
		radio3.addChangeListener(this);
		bg.add(radio3);
		
		listaTamanio = new JComboBox<String>();
		listaTamanio.setBackground(Color.WHITE);
		listaTamanio.addItem("3x3");
		listaTamanio.addItem("4x4");
		listaTamanio.addItem("5x5");
		
		lblDificultad = new JLabel("Dificultad:");
		lblDificultad.setForeground(Color.WHITE);
		lblTamanio = new JLabel("Tamaño:");
		lblTamanio.setForeground(Color.WHITE);
		
		add(new JLabel("	"));
		add(lblTamanio);
		add(listaTamanio);
		add(new JLabel("	"));
		add(lblDificultad);
		add(radio1);
		add(radio2);
		add(radio3);
		add(new JLabel("	"));
	
	}
	
	public void stateChanged(ChangeEvent e) {
//        if (radio1.isSelected()) {
//            setSize(640,480);
//        }
//        if (radio2.isSelected()) {
//            setSize(800,600);
//        }
//        if (radio3.isSelected()) {
//            setSize(1024,768);
//        }        
    }
	

}
