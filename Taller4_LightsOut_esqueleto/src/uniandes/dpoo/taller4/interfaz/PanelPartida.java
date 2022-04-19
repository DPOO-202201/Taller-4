package uniandes.dpoo.taller4.interfaz;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JPanel;

public class PanelPartida extends JPanel {
	
	public PanelPartida() {
		
		setBackground(Color.GRAY);
		
	}
	
	public void paint(Graphics g) {
		
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		
		RoundRectangle2D.Double boton11 = new RoundRectangle2D.Double(20,20,220,170,10,10);
		RoundRectangle2D.Double boton21 = new RoundRectangle2D.Double(20,210,220,170,10,10);
		RoundRectangle2D.Double boton31 = new RoundRectangle2D.Double(20,400,220,170,10,10);
		g2d.setColor(new Color(255,252,88));
		g2d.fill(boton11);
		g2d.fill(boton21);
		g2d.fill(boton31);
		
		RoundRectangle2D.Double boton12 = new RoundRectangle2D.Double(260,20,220,170,10,10);
		RoundRectangle2D.Double boton22 = new RoundRectangle2D.Double(260,210,220,170,10,10);
		RoundRectangle2D.Double boton32 = new RoundRectangle2D.Double(260,400,220,170,10,10);
		g2d.fill(boton12);
		g2d.fill(boton22);
		g2d.fill(boton32);
		
		RoundRectangle2D.Double boton13 = new RoundRectangle2D.Double(500,20,220,170,10,10);
		RoundRectangle2D.Double boton23 = new RoundRectangle2D.Double(500,210,220,170,10,10);
		RoundRectangle2D.Double boton33 = new RoundRectangle2D.Double(500,400,220,170,10,10);
		g2d.fill(boton13);
		g2d.fill(boton23);
		g2d.fill(boton33);
		
	}

}
