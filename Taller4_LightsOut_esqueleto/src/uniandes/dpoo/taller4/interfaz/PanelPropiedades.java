package uniandes.dpoo.taller4.interfaz;

import javax.swing.*;
import javax.swing.event.*;

@SuppressWarnings("serial")
public class PanelPropiedades extends JFrame implements ChangeListener{
	
	private JRadioButton radio1,radio2,radio3;
	private ButtonGroup bg;
	private Dificultad dificultad;
	private TamanioHorizontal tamanioHorizontal;
	private TamanioVertical tamanioVertical;
	
	public PanelPropiedades()
	{
	setLayout(null);
	bg = new ButtonGroup();
	radio1 = new JRadioButton("Facil");
	radio1.addChangeListener(this);
	add(radio1);
	bg.add(radio1);
	
	radio2 = new JRadioButton("Medio");
	radio2.addChangeListener(this);
	add(radio2);
	bg.add(radio2);
	
	radio3 = new JRadioButton("Dificil");
	radio3.addChangeListener(this);
	add(radio3);
	bg.add(radio3);
	}
	
	public void stateChanged(ChangeEvent e) {
        if (radio1.isSelected()) {
            setSize(640,480);
        }
        if (radio2.isSelected()) {
            setSize(800,600);
        }
        if (radio3.isSelected()) {
            setSize(1024,768);
        }        
    }
	

}
