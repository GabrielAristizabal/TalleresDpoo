package GUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

/**
 * Es el panel que contiene los botones de extensión
 */
public class PanelPuntos extends JPanel{

    private final String OPCION_1 ="opcion 1";
    private final String OPCION_2 ="opcion 2";

    private VentanaExposicion padre;

    private JButton botonOpcion1;
    private JButton botonOpcion2;

    public PanelPuntos(VentanaExposicion papa){

    	padre = papa;
    	
        inicializar( );
    }

    private void inicializar( )
    {
        setBorder( new TitledBorder("Puntos de Extensión") );

        setLayout( new FlowLayout( ) );
        botonOpcion1 = new JButton("Opción 1");
        botonOpcion1.setActionCommand( OPCION_1 );

        botonOpcion2 = new JButton("Opción 2");
        botonOpcion2.setActionCommand( OPCION_2 );

        add( botonOpcion1 );
        add( botonOpcion2 );
    }

}