package GUI;

import java.awt.*;
import java.io.*;
import java.util.*;

import javax.swing.*;

public class VentanaExposicion extends JFrame{

    private PanelPerros panelLista;
    private PanelDatos panelDatos;
    private PanelAgregar panelAgregar;
    private PanelPuntos panelExtension;
    private PanelBusqueda panelBusquedaOrdenamientos;
    private PanelConsultar panelConsultas;

    public VentanaExposicion(){
    	
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setTitle("Exposición Canina");
        setSize( new Dimension( 700, 550 ) );
        setResizable( false );

        setLayout( new GridBagLayout( ) );

        JPanel panelSuperior = new JPanel( );
        panelSuperior.setLayout( new GridBagLayout( ) );

        panelLista = new PanelPerros( this );
        GridBagConstraints gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.ipadx = 175;
        panelSuperior.add( panelLista, gbc );

        panelDatos = new PanelDatos( );
        gbc = new GridBagConstraints( );
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 45;
        gbc.ipady = 40;
        panelSuperior.add( panelDatos, gbc );

        panelBusquedaOrdenamientos = new PanelBusqueda( this );
        gbc = new GridBagConstraints( );
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.ipadx = 10;
        gbc.ipady = 100;
        panelSuperior.add( panelBusquedaOrdenamientos, gbc );

        gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        getContentPane( ).add( panelSuperior, gbc );

        JPanel panelCentral = new JPanel( );
        panelCentral.setLayout( new GridBagLayout( ) );

        panelAgregar = new PanelAgregar( this );
        gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipady = 35;
        gbc.ipadx = 20;
        panelCentral.add( panelAgregar, gbc );

        panelConsultas = new PanelConsultar( this );
        gbc = new GridBagConstraints( );
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 85;
        panelCentral.add( panelConsultas, gbc );

        gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.BOTH;
        getContentPane( ).add( panelCentral, gbc );

        panelExtension = new PanelPuntos( this );
        gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.BOTH;
        getContentPane( ).add( panelExtension, gbc );
    }
    
    public static void main( String[] args )
    {
        VentanaExposicion iec = new VentanaExposicion();
        iec.setVisible( true );
    }
}