package uniandes.dpoo.taller4.interfaz;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class InterfazJuego extends JFrame
{
	private PanelPropiedades panelPropiedades;
	private PanelPartida panelPartida;
	private PanelOpciones panelOpciones;
	private InfoPartida infoPartida;	
	
	public InterfazJuego()
	{
		setTitle("LightsOut");
		setSize(900,680);
		setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        panelPropiedades = new PanelPropiedades();
        add(panelPropiedades,BorderLayout.NORTH);
        
        panelPartida = new PanelPartida();
        add(panelPartida,BorderLayout.CENTER);
        
        panelOpciones = new PanelOpciones();
        add(panelOpciones,BorderLayout.EAST);
        
        infoPartida = new InfoPartida();
        add(infoPartida,BorderLayout.SOUTH);
	}
	
	public static void main( String[] pArgs )
    	{
        	try
        	{
            	// Unifica la interfaz para Mac y para Windows.
            	UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName( ) );

            	InterfazJuego interfaz = new InterfazJuego( );
            	interfaz.setVisible( true );
        	}
        	catch( Exception e )
        	{
            	e.printStackTrace( );
        	}
    	}
}