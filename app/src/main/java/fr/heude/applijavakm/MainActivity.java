package fr.heude.applijavakm;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.nfc.FormatException;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView text;
    Button convertir;
    TextView saisi;
    ImageView image;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Décalration des variables
        convertir = findViewById(R.id.button);
        saisi = findViewById(R.id.textSaisi);
        text = findViewById(R.id.textResult);
        image = findViewById(R.id.image);

        // Au moment du clique sur le bouton faire ...
        convertir.setOnClickListener(new View.OnClickListener() { public void onClick(View view) {


                    try {

                        double km = 0;
                        km = Integer.parseInt(saisi.getText().toString());
                        double miles = (km * 0.62137);
                        text.setText("Le nombre de km en miles est : " + miles);
                        image.setVisibility(View.VISIBLE);

                    }
                    catch (Exception e)
                    {
                        text.setText("Veuillez uniquement saisir un nombre.");
                    }



            }});


    }

}