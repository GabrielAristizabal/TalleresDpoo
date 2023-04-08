package GUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class PanelAgregar extends JPanel{

    private VentanaExposicion padre;

    private JTextField txtImagen;
    private JTextField txtNombre;
    private JTextField txtRaza;
    private JTextField txtEdad;
    private JTextField txtPuntos;
    
    private JLabel etiquetaImagen;
    private JLabel etiquetaNombre;
    private JLabel etiquetaRaza;
    private JLabel etiquetaPuntos;
    private JLabel etiquetaEdad;

    private JButton botonAgregar;
    private JButton botonExaminar;

    public PanelAgregar(VentanaExposicion papa){
        padre = papa;

        setLayout( new GridBagLayout( ) );
        setBorder( new CompoundBorder( new EmptyBorder( 4, 3, 3, 3 ), new TitledBorder("Agregar Perro") ) );

        JPanel panelDatos = new JPanel( new GridBagLayout( ) );

        // Nombre
        etiquetaNombre = new JLabel("Nombre:");
        GridBagConstraints gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 0;
        panelDatos.add( etiquetaNombre, gbc );
        txtNombre = new JTextField("");
        gbc = new GridBagConstraints( );
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridwidth = 1;

        panelDatos.add( txtNombre, gbc );

        // Raza
        etiquetaRaza = new JLabel("Raza:");
        etiquetaRaza.setBorder( new EmptyBorder( 0, 5, 0, 0 ) );
        gbc = new GridBagConstraints( );
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.EAST;

        panelDatos.add( etiquetaRaza, gbc );
        txtRaza = new JTextField("");
        gbc = new GridBagConstraints( );
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        panelDatos.add( txtRaza, gbc );

        // Edad
        etiquetaEdad = new JLabel("Edad:");
        gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 1;
        panelDatos.add( etiquetaEdad, gbc );
        txtEdad = new JTextField("");
        gbc = new GridBagConstraints( );
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridwidth = 1;
        panelDatos.add( txtEdad, gbc );

        // Puntos
        etiquetaPuntos = new JLabel("Puntos:");
        etiquetaPuntos.setBorder( new EmptyBorder( 0, 5, 0, 0 ) );
        gbc = new GridBagConstraints( );
        gbc.gridx = 2;
        gbc.gridy = 1;
        panelDatos.add( etiquetaPuntos, gbc );
        txtPuntos = new JTextField("");
        gbc = new GridBagConstraints( );
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.ipadx = 160;
        panelDatos.add( txtPuntos, gbc );

        // Imagen
        etiquetaImagen = new JLabel("Imagen:");
        gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 2;
        panelDatos.add( etiquetaImagen, gbc );
        txtImagen = new JTextField("");
        botonExaminar = new JButton("Examinar");

        // Botón agregar
        JPanel panelBoton = new JPanel( );
        botonAgregar = new JButton("Agregar Perro");
        panelBoton.add( botonAgregar );

        JPanel panelImagen = new JPanel( new GridLayout( ) );

        gbc = new GridBagConstraints( );
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridwidth = 2;
        panelImagen.add( txtImagen );
        gbc = new GridBagConstraints( );
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridwidth = 2;
        panelImagen.add( botonExaminar );
        gbc = new GridBagConstraints( );
        gbc.gridx = 1;
        gbc.gridy = 2;
        panelDatos.add( panelImagen, gbc );

        gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        add( panelDatos, gbc );

        gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.BOTH;
        add( panelBoton, gbc );
    }

}