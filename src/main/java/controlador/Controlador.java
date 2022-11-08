package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import modelo.*;
import vista.VistaPrincipal;

public class Controlador implements ActionListener {

    private Alumno alumno;
    private PadreResponsable padre;
    private Administradora administradora;
    private Aseguradora aseguradora;
    private AuxiliarContable auxiliarContable;
    private Campeonato campeonato;
    private Profesor profesor;
    private Trabajador trabajador;

    List<Alumno> alumnosList = null;
    List<PadreResponsable> padreList = null;
    List<Aseguradora> aseguradorasList = null;
    List<Profesor> profesoresList = null;
    List<Trabajador> trabajadoresList = null;

    private VistaPrincipal vistaP;
    Integer gananciasTotales = 0;

    public Controlador() {
    }

    public Controlador(Alumno alumno, PadreResponsable padre, Administradora administradora, Aseguradora aseguradora, AuxiliarContable auxiliarContable, Campeonato campeonato, Profesor profesor, Trabajador trabajador, VistaPrincipal vistaP) {
        this.alumno = alumno;
        this.padre = padre;
        this.administradora = administradora;
        this.aseguradora = aseguradora;
        this.auxiliarContable = auxiliarContable;
        this.campeonato = campeonato;
        this.profesor = profesor;
        this.trabajador = trabajador;
        this.vistaP = vistaP;

        alumnosList = new ArrayList<Alumno>();
        padreList = new ArrayList<PadreResponsable>();
        aseguradorasList = new ArrayList<Aseguradora>();
        profesoresList = new ArrayList<Profesor>();
        trabajadoresList = new ArrayList<Trabajador>();

        actionListener(this);
    }

    public void actionListener(ActionListener control) {

        vistaP.btnMatricular.addActionListener(control);
        vistaP.btnRetirar.addActionListener(control);
        vistaP.btnLimpiar.addActionListener(control);
        vistaP.btnMostrar.addActionListener(control);
        vistaP.btnRegistrarAseguradora.addActionListener(control);
        vistaP.btnRegistrarCampeonato.addActionListener(control);
        vistaP.btnRegistrarPadre.addActionListener(control);
        vistaP.btnRegistrarTrabajador.addActionListener(control);
        vistaP.btnActualizar.addActionListener(control);
        vistaP.btnBuscar.addActionListener(control);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Matricular")) {
            boolean aux = false;
            for (int i = 0; i < alumnosList.size(); i++) {
                if (alumnosList.get(i).getDni().equals(vistaP.txtDNI.getText())) {
                    aux = true;
                    if (aux == true) {
                        vistaP.txtAreaResultado.setText("Usuario Ya existente");
                    }
                }
            }
            if (aux == false) {
                Alumno a1 = new Alumno();
                a1.setDni(vistaP.txtDNI.getText());
                a1.setNombre(vistaP.txtNombre.getText());
                a1.setDireccion(vistaP.txtDireccion.getText());
                a1.setTelefono(vistaP.txtTelefono.getText());

                alumnosList.add(a1);
            }

        } else if (e.getActionCommand().contentEquals("Retirar")) {

            boolean aux = false;
            for (int i = 0; i < alumnosList.size(); i++) {
                if (alumnosList.get(i).getDni().equals(vistaP.txtDNI.getText())) {
                    aux = true;
                    if (aux = true) {
                        alumnosList.remove(alumnosList.get(i));
                    }
                }
            }

        } else if (e.getActionCommand().contentEquals("Actualizar")) {

            boolean aux = false;
            for (int i = 0; i < alumnosList.size(); i++) {
                if (alumnosList.get(i).getDni().equals(vistaP.txtDNI.getText())) {
                    aux = true;
                    if (aux == true) {

                        alumnosList.get(i).setNombre(vistaP.txtNombre.getText());
                        alumnosList.get(i).setApellidos(vistaP.txtApellidos.getText());
                        alumnosList.get(i).setDireccion(vistaP.txtDireccion.getText());
                        alumnosList.get(i).setTelefono(vistaP.txtTelefono.getText());
                        alumnosList.get(i).setFechaNacimiento(Integer.parseInt((String) vistaP.jcbFechaNacimiento.getSelectedItem()));
                        alumnosList.get(i).setGenero((String) vistaP.jcbGenero.getSelectedItem());

                    }
                }
                vistaP.txtAreaResultado.setText("Usuario Actualizado");
            }
            if (aux == false) {
                vistaP.txtAreaResultado.setText("Usuario No existe");
            }

        } else if (e.getActionCommand().contentEquals("Buscar")) {

        } else if (e.getActionCommand().contentEquals("Mostrar")) {

            vistaP.txtAreaResultado.setText("");
            for (int i = 0; i < alumnosList.size(); i++) {
                vistaP.txtAreaResultado.setText(vistaP.txtAreaResultado.getText() + "\n" + alumnosList.get(i).toString());
            }
        } else if (e.getActionCommand().contentEquals("Limpiar")) {
            vistaP.txtAreaResultado.setText("");

        }

    }

}
