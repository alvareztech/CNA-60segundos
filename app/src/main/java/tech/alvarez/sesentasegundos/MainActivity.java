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
        ContadorTask contadorTask = new ContadorTask();
        contadorTask.execute(60);
    }

    // AsyncTask

    private class ContadorTask extends AsyncTask<Integer, Integer, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            iniciarButton.setEnabled(false);
        }

        @Override
        protected Void doInBackground(Integer... integers) {
            int tope = integers[0];

            publishProgress(tope);

            try {
                do {
                    tope--;
                    Thread.sleep(500);
                    publishProgress(tope);
                } while (tope > 0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);

            String numero = values[0].toString();

            contadorTextView.setText(numero);
        }


        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

            iniciarButton.setEnabled(true);
        }
    }
}
