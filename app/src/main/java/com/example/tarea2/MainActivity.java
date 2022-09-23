package com.example.tarea2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText nombre;
    private TextView valor;
    private double conversion;

    private Button num0;
    private Button num1;
    private Button num2;
    private Button num3;
    private Button num4;
    private Button num5;
    private Button num6;
    private Button num7;
    private Button num8;
    private Button num9;
    private Button c;

    private Button usd;
    private Button eu;
    private Button cad;
    private Button usd_peso;
    private Button eu_peso;
    private Button cad_peso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.nombre);
        nombre.addTextChangedListener(nombreTextWatcher);
        valor = findViewById(R.id.valor);

        num0 = findViewById(R.id.num0);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);
        c = findViewById(R.id.c);

        usd = findViewById(R.id.usd);
        eu = findViewById(R.id.eu);
        cad = findViewById(R.id.cad);
        usd_peso = findViewById(R.id.usd_peso);
        eu_peso = findViewById(R.id.eu_peso);
        cad_peso = findViewById(R.id.cad_peso);

        num0.setOnClickListener(this);
        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);
        num7.setOnClickListener(this);
        num8.setOnClickListener(this);
        num9.setOnClickListener(this);
        c.setOnClickListener(this);
        usd.setOnClickListener(this);
        eu.setOnClickListener(this);
        cad.setOnClickListener(this);
        usd_peso.setOnClickListener(this);
        eu_peso.setOnClickListener(this);
        cad_peso.setOnClickListener(this);
    }

    private TextWatcher nombreTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String nombre_text = nombre.getText().toString().trim();

            num0.setEnabled(!nombre_text.isEmpty());
            num1.setEnabled(!nombre_text.isEmpty());
            num2.setEnabled(!nombre_text.isEmpty());
            num3.setEnabled(!nombre_text.isEmpty());
            num4.setEnabled(!nombre_text.isEmpty());
            num5.setEnabled(!nombre_text.isEmpty());
            num6.setEnabled(!nombre_text.isEmpty());
            num7.setEnabled(!nombre_text.isEmpty());
            num8.setEnabled(!nombre_text.isEmpty());
            num9.setEnabled(!nombre_text.isEmpty());
            c.setEnabled(!nombre_text.isEmpty());
            usd.setEnabled(!nombre_text.isEmpty());
            eu.setEnabled(!nombre_text.isEmpty());
            cad.setEnabled(!nombre_text.isEmpty());
            usd_peso.setEnabled(!nombre_text.isEmpty());
            eu_peso.setEnabled(!nombre_text.isEmpty());
            cad_peso.setEnabled(!nombre_text.isEmpty());
        }
        @Override
        public void afterTextChanged(Editable s) {}
    };

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.num0:
                valor.setText(valor.getText().toString() + '0');
                break;
            case R.id.num1:
                valor.setText(valor.getText().toString() + '1');
                break;
            case R.id.num2:
                valor.setText(valor.getText().toString() + '2');
                break;
            case R.id.num3:
                valor.setText(valor.getText().toString() + '3');
                break;
            case R.id.num4:
                valor.setText(valor.getText().toString() + '4');
                break;
            case R.id.num5:
                valor.setText(valor.getText().toString() + '5');
                break;
            case R.id.num6:
                valor.setText(valor.getText().toString() + '6');
                break;
            case R.id.num7:
                valor.setText(valor.getText().toString() + '7');
                break;
            case R.id.num8:
                valor.setText(valor.getText().toString() + '8');
                break;
            case R.id.num9:
                valor.setText(valor.getText().toString() + '9');
                break;
            case R.id.c:
                valor.setText("");
                break;
            case R.id.usd:
                conversion = Double.parseDouble(valor.getText().toString()) / 52.67;
                conversion = Math.round(conversion*100.0)/100.0;
                valor.setText(conversion + " USD");
                break;
            case R.id.eu:
                conversion = Double.parseDouble(valor.getText().toString()) / 53.33;
                conversion = Math.round(conversion*100.0)/100.0;
                valor.setText(conversion + " EU");
                break;
            case R.id.cad:
                conversion = Double.parseDouble(valor.getText().toString()) / 38.50;
                conversion = Math.round(conversion*100.0)/100.0;
                valor.setText(conversion + " CAD");
                break;
            case R.id.usd_peso:
                conversion = Double.parseDouble(valor.getText().toString()) * 54.95;
                conversion = Math.round(conversion*100.0)/100.0;
                valor.setText(conversion + " Pesos");
                break;
            case R.id.eu_peso:
                conversion = Double.parseDouble(valor.getText().toString()) * 53.33;
                conversion = Math.round(conversion*100.0)/100.0;
                valor.setText(conversion + " Pesos");
                break;
            case R.id.cad_peso:
                conversion = Double.parseDouble(valor.getText().toString()) * 42.50;
                conversion = Math.round(conversion*100.0)/100.0;
                valor.setText(conversion + " Pesos");
                break;
        }
    }
}