package uniandes.dpoo.taller4.interfaz;

import java.awt.BorderLayout;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;

import javax.swing.*;

import uniandes.dpoo.taller4.modelo.RegistroTop10;
import uniandes.dpoo.taller4.modelo.Top10;

@SuppressWarnings("serial")
public class VentanaTop10 extends JFrame{
	private JPanel columnaPosiciones,columnaNombres,columnaPuntajes;
	private JList<String> listaPosiciones,listaNombres,listaPuntajes;
	private DefaultListModel<String> tempPosiciones,tempNombres,tempPuntajes;
	private Top10 tempDatos;
	
	public VentanaTop10() {
		setTitle("Top 10");
		setSize(580,700);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        columnaPosiciones = new JPanel();
        columnaNombres = new JPanel();
        columnaPuntajes = new JPanel();
        
        tempPosiciones = new DefaultListModel<String>();
        tempNombres = new DefaultListModel<String>();
        tempPuntajes = new DefaultListModel<String>();
        
		listaPosiciones = new JList<String>(tempPosiciones);
		listaNombres = new JList<String>(tempNombres);
		listaPuntajes = new JList<String>(tempPuntajes);
		
		tempPosiciones.addElement("Posicion");
		tempNombres.addElement("Nombre");
		tempPuntajes.addElement("Puntaje");
        
		tempDatos = new Top10();
		File archivo = new File("data\top10.csv");
		tempDatos.cargarRecords(archivo);
        
        Collection<RegistroTop10> tempRegistro = tempDatos.darRegistros();
        
        for (int posicionActual = 1; posicionActual <=10 ; posicionActual = posicionActual + 1) {
        	Iterator<RegistroTop10> j = tempRegistro.iterator();
        	if (j.hasNext()) {
        	tempNombres.addElement((j.next().darNombre()));
        	tempPuntajes.addElement(String.valueOf((j.next().darPuntos())));
       		tempPosiciones.addElement(String.valueOf(posicionActual));
       		j.next();
        	}
        }
        
        columnaPosiciones.add(listaPosiciones);
        columnaNombres.add(listaNombres);
        columnaPuntajes.add(listaPuntajes);
        
        add(columnaPosiciones,BorderLayout.WEST);
        add(columnaNombres,BorderLayout.CENTER);
        add(columnaPuntajes,BorderLayout.EAST);
	}
}