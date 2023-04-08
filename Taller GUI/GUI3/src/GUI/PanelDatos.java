package GUI;

import java.awt.*;
import java.awt.image.*;
import java.io.*;

import javax.imageio.*;
import javax.swing.*;
import javax.swing.border.*;


/**
 * Es el panel donde se muestran los datos de un perro
 */
public class PanelDatos extends JPanel{

    private static final int ALTURA = 200;
    private static final int ANCHO = 200;

    private JLabel etiquetaImagen;
    private JLabel etiquetaNombre;
    private JLabel etiquetaRaza;
    private JLabel etiquetaPuntos;
    private JLabel etiquetaEdad;

    private JTextField txtNombre;
    private JTextField txtRaza;
    private JTextField txtEdad;
    private JTextField txtAltura;

    public PanelDatos(){
    	
        setLayout( new BorderLayout( ) );
        setBorder( new CompoundBorder( new EmptyBorder( 4, 3, 3, 3 ), new TitledBorder("Datos Perro") ) );

        JPanel panelImagen = new JPanel( );
        etiquetaImagen = new JLabel( );
        etiquetaImagen.setBorder( new LineBorder( Color.BLACK, 1 ) );
        etiquetaImagen.setMinimumSize( new Dimension( 230, 153 ) );
        etiquetaImagen.setMaximumSize( new Dimension( 230, 153 ) );

        panelImagen.add( etiquetaImagen );
        add( panelImagen, BorderLayout.CENTER );

        JPanel panelDatosTexto = new JPanel( new GridLayout( 2, 4 ) );

        etiquetaNombre = new JLabel("Nombre:");
        txtNombre = new JTextField( );
        txtNombre.setEnabled( false );
        panelDatosTexto.add( etiquetaNombre );
        panelDatosTexto.add( txtNombre );

        etiquetaRaza = new JLabel("Raza:");
        etiquetaRaza.setBorder( new EmptyBorder( 0, 5, 0, 0 ) );
        txtRaza = new JTextField( );
        txtRaza.setEnabled( false );
        panelDatosTexto.add( etiquetaRaza );
        panelDatosTexto.add( txtRaza );

        etiquetaEdad = new JLabel("Edad:");
        txtEdad = new JTextField( );
        txtEdad.setEnabled( false );
        panelDatosTexto.add( etiquetaEdad );
        panelDatosTexto.add( txtEdad );

        etiquetaPuntos = new JLabel("Puntos:");
        etiquetaPuntos.setBorder( new EmptyBorder( 0, 5, 0, 0 ) );
        txtAltura = new JTextField( );
        txtAltura.setEnabled( false );
        panelDatosTexto.add( etiquetaPuntos );
        panelDatosTexto.add( txtAltura );

        add( panelDatosTexto, BorderLayout.SOUTH );
    }

}