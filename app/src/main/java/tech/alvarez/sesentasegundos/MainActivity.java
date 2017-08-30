package tech.alvarez.sesentasegundos;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView contadorTextView;
    private FloatingActionButton iniciarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contadorTextView = (TextView) findViewById(R.id.contadorTextView);
        iniciarButton = (FloatingActionButton) findViewById(R.id.iniciarButton);
        iniciarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iniciarConteo();
            }
        });
    }

    private void iniciarConteo() {
        // TODO: Paso 5
        // Luego de colocar lo que hara el AsyncTask, lo iniciamos.

    }

    // AsyncTask

    private class ContadorTask extends AsyncTask<Integer, Integer, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            // TODO: Paso 1
            // Aquí se pone lo que quieres hacer antes de iniciar el proceso


        }

        @Override
        protected Void doInBackground(Integer... integers) {

            // TODO: Paso 2
            // Aquí se pone lo que tarda tiempo (el proceso)


            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);

            // TODO: Paso 3
            // Aquí se pone si necesitas actualizar algo de la interfaz durante el proceso


        }


        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

            // TODO: Paso 4
            // Aquí se pone lo que quieres hacer cuando termine el proceso

        }
    }
}
