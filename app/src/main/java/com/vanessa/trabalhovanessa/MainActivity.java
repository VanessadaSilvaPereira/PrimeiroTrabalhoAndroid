package com.vanessa.trabalhovanessa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private EditText etNome, etDefeito, etValor;
    private CheckBox cbServicoFinalizado;
    private RadioButton rbOrcamento, rbServico;
    private Button btnSalvar;
    private Spinner spinnerCategorias;
    private ArrayAdapter adapter;
    private String [] listaCategorias;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_inicio, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == R.id.menu_sair){
            finish();

        }
        if(item.getItemId() == R.id.menu_limpar){

            limpar();

        }
        return super.onOptionsItemSelected(item);
    }

    private void limpar(){
        etNome.setText("");
        etDefeito.setText("");
        etValor.setText("");
        cbServicoFinalizado.setChecked(false);
        rbOrcamento.setChecked(false);
        rbServico.setChecked(false);
        spinnerCategorias.setSelection(0);



    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        }

    }

