package com.eapvlab.hellomvp;

/**
 * Implementación del Presentador.
 *
 * @author Eimar Pedraza.
 */

public class SayHelloPresenter implements SayHelloContract.Presenter {

  private Persona persona;
  private SayHelloContract.View view;

  public SayHelloPresenter(SayHelloContract.View view) {
    this.persona = new Persona();
    this.view = view;
  }

  public void CargarMensaje() {
    if (persona.getFirstName() == null && persona.getLastName() == null) {
      view.mostrarError("Error 404.");
      return;
    }

    String message = "Hola " + persona.getName() + "!";
    view.mostrarMensaje(message);
  }

  @Override
  public void guardarNombre(String firstName, String lastName) {
    persona.setFirstName(firstName);
    persona.setLastName(lastName);
  }

}
