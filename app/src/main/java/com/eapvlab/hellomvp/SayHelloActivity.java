package com.eapvlab.hellomvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SayHelloActivity extends AppCompatActivity implements SayHelloContract.View, View.OnClickListener{

    private SayHelloContract.Presenter presentador;

    //Propiedades gráficas
    private TextView mensaje;
    private EditText primerNombre;
    private EditText segundoNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciarVista();

        // Instanciar Presenter
        presentador = new SayHelloPresenter(this);
    }

    private void iniciarVista() {
        mensaje = (TextView) findViewById(R.id.tv_mensaje);
        primerNombre = (EditText) findViewById(R.id.et_nombre);
        segundoNombre = (EditText) findViewById(R.id.et_apellido);

        findViewById(R.id.btn_actualizar).setOnClickListener(this);
        findViewById(R.id.btn_visualizar).setOnClickListener(this);
    }

    /**
     * La vista solo recibe la acción del usuario y deja todas las tareas restantes para el
     * presentador
     */
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_actualizar:
                presentador.guardarNombre(primerNombre.getText().toString(), segundoNombre.getText().toString());
                break;
            case R.id.btn_visualizar:
                presentador.CargarMensaje();
                break;
        }
    }

    @Override
    public void mostrarMensaje(String message) {
        mensaje.setText(message);
    }

    @Override
    public void mostrarError(String error) {
        Toast.makeText(getApplicationContext(), error, Toast.LENGTH_SHORT).show();
    }

}