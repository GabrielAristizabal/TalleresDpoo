package GUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

/**
 * Este es el panel donde se encuentran los botones para hacer consulta sobre la exposición
 *
 */
public class PanelConsultar extends JPanel{

    private VentanaExposicion padre;

    private JButton botonGanador;
    private JButton botonMenosPuntos;
    private JButton botonMayorEdad;

    public PanelConsultar(VentanaExposicion papa){
        
    	padre = papa;
    	
        setLayout( new GridLayout( 4, 1, 10, 10 ) );
        setBorder( new CompoundBorder( new EmptyBorder( 4, 3, 3, 3 ), new TitledBorder("Consultas Exposición") ) );

        // Ganador
        botonGanador = new JButton("Ganador");
        add( botonGanador );

        // Menos puntos
        botonMenosPuntos = new JButton("Menor Puntaje");
        add( botonMenosPuntos );

        // Mayos edad
        botonMayorEdad = new JButton("Más Viejo");
        add( botonMayorEdad );
    }

}