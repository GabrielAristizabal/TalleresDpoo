package GUI;

import java.awt.*;
import java.util.*;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;


/**
 * Es el panel donde se muestra la lista de perros y están los botones para interactuar con la lista
 */
public class PanelPerros extends JPanel{

    private VentanaExposicion padre;
    
    private JList listaPerros;
    private JScrollPane scroll;

    public PanelPerros(VentanaExposicion papa){
        
    	padre = papa;

        setLayout( new BorderLayout( ) );
        setBorder( new CompoundBorder( new EmptyBorder( 4, 3, 3, 3 ), new TitledBorder("Perros en la exposición") ) );

        listaPerros = new JList( );
        listaPerros.setSelectionMode( ListSelectionModel.SINGLE_SELECTION );

        scroll = new JScrollPane( listaPerros );
        scroll.setHorizontalScrollBarPolicy( JScrollPane.HORIZONTAL_SCROLLBAR_NEVER );
        scroll.setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_ALWAYS );
        scroll.setBorder( new CompoundBorder( new EmptyBorder( 3, 3, 3, 3 ), new LineBorder( Color.BLACK, 1 ) ) );

        add( scroll, BorderLayout.CENTER );
    }

}