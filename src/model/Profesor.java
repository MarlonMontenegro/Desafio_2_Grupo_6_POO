package model;

import javax.swing.*;

public class Profesor extends Usuario {

    public Profesor(int id, String usuario, String contrasena, RolUsuario rol) {
        super(id, usuario, contrasena, rol);
    }

    @Override
    public void redirect(JFrame ventana) {
        //TODO: Agregar la vista
    }
}
