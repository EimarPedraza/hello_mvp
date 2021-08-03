package com.eapvlab.hellomvp;

/**
 * Nos ayuda a ubicar la relación entre la Vista y el Presentador en un lugar central.
 *
 * @author Eimar Pedraza.
 */

public interface SayHelloContract {

  /** Representador de la vista en MVP. */
  interface View {
    void mostrarMensaje(String message);

    void mostrarError(String error);
  }

  /** Representador del Presenter in MVP. */
  interface Presenter {
    void CargarMensaje();

    void guardarNombre(String firstName, String lastName);
  }
}
