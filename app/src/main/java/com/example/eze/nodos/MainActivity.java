package com.example.eze.nodos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    protected  MySimpleLinkedList lista = new MySimpleLinkedList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view) {
        RadioButton agregar = (RadioButton) findViewById(R.id.agregar);
        RadioButton buscar = (RadioButton) findViewById(R.id.buscar);
        RadioButton borrar = (RadioButton) findViewById(R.id.borrar);
        TextView mostrar = (TextView) findViewById(R.id.mostrar);

        EditText editText = (EditText) findViewById(R.id.numero);

        String message = editText.getText().toString();
        Integer num = Integer.parseInt(message);
        //char[] array = message.toCharArray();
        //mostrar.setText(array.length);

       /* if(array.length != 0){*/
           // mostrar.setText(message);
         /*}
        else{
           // mostrar.setText("Escriba algo");

        }*/


        //arr[3] =  Integer.parseInt(message.toString());


        if (agregar.isChecked()) {
            if (lista.findElement(num)){
                mostrar.setText("El número: " + num + " ya estaba en la leesta.");
            }else{
                lista.insert(num);
                mostrar.setText("Se agregó correctamente el número: " + num + " a la leesta.");
            }
        } else if (buscar.isChecked()) {
            if (lista.findElement(num)) {
                mostrar.setText("Se encontró el: " + num + " dentro de la leesta.");
            } else {
                mostrar.setText("No se encontró el: " + num + " dentro de la leesta.");
            }

        } else if (borrar.isChecked()) {
            if (lista.deleteElement(num)) {
                mostrar.setText("Se eliminó correctamente el número: " + num + " de la leesta.");
            } else {
                mostrar.setText("No se encontró el número: " + num + " en la leesta, como pa' borrarlo.");
            }
        }
    }

}
