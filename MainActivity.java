package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public EditText pantalla;

    public double operacion1, operacion2, resultado;
    int operacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pantalla=(EditText)findViewById(R.id.cuadrotext);


    }

    public void bt1 (View view) {
        String guardar=pantalla.getText().toString();
        guardar=guardar+"1";
        pantalla.setText(guardar);
    }

    public void bt2 (View view) {
        String guardar=pantalla.getText().toString();
        guardar=guardar+"2";
        pantalla.setText(guardar);
    }

    public void bt3 (View view) {
        String guardar=pantalla.getText().toString();
        guardar=guardar+"3";
        pantalla.setText(guardar);
    }

    public void bt4 (View view) {
        String guardar=pantalla.getText().toString();
        guardar=guardar+"4";
        pantalla.setText(guardar);
    }

    public void bt5 (View view) {
        String guardar=pantalla.getText().toString();
        guardar=guardar+"5";
        pantalla.setText(guardar);
    }

    public void bt6 (View view) {
        String guardar=pantalla.getText().toString();
        guardar=guardar+"6";
        pantalla.setText(guardar);
    }

    public void bt7 (View view) {
        String guardar=pantalla.getText().toString();
        guardar=guardar+"7";
        pantalla.setText(guardar);
    }

    public void bt8 (View view) {
        String guardar=pantalla.getText().toString();
        guardar=guardar+"8";
        pantalla.setText(guardar);
    }

    public void bt9 (View view) {
        String guardar=pantalla.getText().toString();
        guardar=guardar+"9";
        pantalla.setText(guardar);
    }

    public void bt0 (View view) {
        String guardar=pantalla.getText().toString();
        guardar=guardar+"0";
        pantalla.setText(guardar);
    }

    public void btnparentesis(View v) {
        String guardar = pantalla.getText().toString();
        guardar = guardar + "( )";
        pantalla.setText(guardar);
    }
    public void btnpunto(View v) {
        String guardar = pantalla.getText().toString();
        guardar = guardar + ".";
        pantalla.setText(guardar);
    }
    public void sum(View view){
        try {
            String auxiliar = pantalla.getText().toString();
            operacion1 = Double.parseDouble((auxiliar));
        }catch(NumberFormatException error){}
        pantalla.setText("");
        operacion=1;
    }
    public void res(View view){
        try {
            String auxiliar = pantalla.getText().toString();
            operacion1 = Double.parseDouble((auxiliar));
        }catch(NumberFormatException error){}
        pantalla.setText("");
        operacion=2;
    }
    public void multiplicacion(View view){
        try {
            String auxiliar = pantalla.getText().toString();
            operacion1 = Double.parseDouble((auxiliar));
        }catch(NumberFormatException error){}
        pantalla.setText("");
        operacion=3;
    }
    public void division(View view){
        try {
            String auxiliar = pantalla.getText().toString();
            operacion1 = Double.parseDouble((auxiliar));
        }catch(NumberFormatException error){}
        pantalla.setText("");
        operacion=4;
    }
    public void seno(View view){
        try {
            String auxiliar = pantalla.getText().toString();
            operacion1 = Double.parseDouble((auxiliar));
        }catch(NumberFormatException error){}
        pantalla.setText("Sin("+operacion1+")");
        operacion=5;
    }
    public void coseno(View view){
        try {
            String auxiliar = pantalla.getText().toString();
            operacion1 = Double.parseDouble((auxiliar));
        }catch(NumberFormatException error){}
        pantalla.setText("Cos("+operacion1+")");
        operacion=6;
    }
    public void tangente(View view){
        try {
            String auxiliar = pantalla.getText().toString();
            operacion1 = Double.parseDouble((auxiliar));
        }catch(NumberFormatException error){}
        pantalla.setText("Tan("+operacion1+")");
        operacion=7;
    }

    public void igual (View view){
        try {
            String auxiliar2 = pantalla.getText().toString();
            operacion2 = Double.parseDouble((auxiliar2));
        }catch(NumberFormatException error){}
        pantalla.setText("");

        if(operacion==1){
            resultado=operacion1+operacion2;
        }
        else if (operacion==2){
            resultado=operacion1-operacion2;
        }
        else if (operacion==3){
            resultado=operacion1*operacion2;
        }
        else if (operacion==4){
            if(operacion2==0){
                pantalla.setText("ERROR!");
            }else
            resultado=operacion1/operacion2;
        }
        else if(operacion==5){
            double rad=Math.toRadians(operacion1);
            resultado=(Math.sin(rad));
        }
        else if(operacion==6){
            double rad=Math.toRadians(operacion1);
            resultado=(Math.cos(rad));
        }
        else if(operacion==7){
            double rad=Math.toRadians(operacion1);
            resultado=(Math.tan(rad));
        }
        pantalla.setText(""+resultado);
        operacion1=resultado;
    }

    public void clear(View view){
        pantalla.setText("");
        operacion1=0.0;
        operacion2=0.0;
        resultado=0.0;
    }

    public void borrar (View view){
        if(!pantalla.getText().toString().equals("")){
            pantalla.setText(pantalla.getText().subSequence(0,pantalla.getText().length()-1)+"");
        }
    }

}