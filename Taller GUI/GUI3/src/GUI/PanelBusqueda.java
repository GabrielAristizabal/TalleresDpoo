package GUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class PanelBusqueda extends JPanel{

    private VentanaExposicion padre;

    private JButton botonOrdenarRaza;
    private JButton botonOrdenarPuntos;
    private JButton botonOrdenarEdad;
    private JButton botonBuscar;

    public PanelBusqueda(VentanaExposicion papa)
    {
        padre = papa;

        setPreferredSize( new Dimension( 200, 0 ) );
        setBorder( new CompoundBorder( new EmptyBorder( 4, 3, 3, 3 ), new TitledBorder("Búsqueda y ordenamientos") ) );
        setLayout( new GridBagLayout( ) );

        botonOrdenarRaza = new JButton("Ordenar por Raza");
        GridBagConstraints gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets( 0, 0, 10, 0 );
        gbc.fill = GridBagConstraints.BOTH;
        add( botonOrdenarRaza, gbc );

        botonOrdenarPuntos = new JButton("Ordenar por Puntos");
        gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets( 0, 0, 10, 0 );
        gbc.fill = GridBagConstraints.BOTH;
        add( botonOrdenarPuntos, gbc );

        botonOrdenarEdad = new JButton("Ordenar por Edad");
        gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.insets = new Insets( 0, 0, 10, 0 );
        gbc.fill = GridBagConstraints.BOTH;
        add( botonOrdenarEdad, gbc );

        botonBuscar = new JButton("Buscar Perro");
        gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.insets = new Insets( 0, 0, 10, 0 );
        gbc.fill = GridBagConstraints.BOTH;
        add( botonBuscar, gbc );
    }

}