package com.gabriel.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.mbms.StreamingServiceInfo;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    //region elementos del proceso
    private Button btsum;
    private Button btres;
    private Button btmul;
    private Button btdiv;
    private Button btigu;
    private Button btpun;
    private Button btcer;
    private Button btuno;
    private Button btdos;
    private Button bttre;
    private Button btcua;
    private Button btcin;
    private Button btsei;
    private Button btsie;
    private Button btoch;
    private Button btnue;
    private Button btbor;
    private Button btlim;
    private EditText txRes;
    private TextView txOpe;
    private int punto = 0;
    private double valor_uno = 0;
    //endregion

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //region define elementos de operacion
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btsum = findViewById(R.id.btsum);
        btres = findViewById(R.id.btres);
        btmul = findViewById(R.id.btmul);
        btdiv = findViewById(R.id.btdiv);
        btigu = findViewById(R.id.btigu);
        btpun = findViewById(R.id.btpun);
        btcer = findViewById(R.id.btcer);
        btuno = findViewById(R.id.btuno);
        btdos = findViewById(R.id.btdos);
        bttre = findViewById(R.id.bttre);
        btcua = findViewById(R.id.btcua);
        btcin = findViewById(R.id.btcin);
        btsei = findViewById(R.id.btsei);
        btsie = findViewById(R.id.btsie);
        btoch = findViewById(R.id.btoch);
        btnue = findViewById(R.id.btnue);
        btbor = findViewById(R.id.btbor);
        btlim = findViewById(R.id.btlim);
        txRes = findViewById(R.id.resultado);
        txOpe = findViewById(R.id.operacion);
        //endregion

        //region botones de operacion
        btsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txOpe.getText().toString() == "") {
                    valor_uno = Double.parseDouble(txRes.getText().toString());
                } else {
                    String result = (realizaOperacion(txOpe.getText().toString(), valor_uno, Double.parseDouble(txRes.getText().toString())));
                    valor_uno = Double.parseDouble(result);
                    txRes.setText(result);
                }
                txOpe.setText("SUMA");
            }
        });

        btres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txOpe.getText().toString() == "") {
                    valor_uno = Double.parseDouble(txRes.getText().toString());
                } else {
                    String result = (realizaOperacion(txOpe.getText().toString(), valor_uno, Double.parseDouble(txRes.getText().toString())));
                    valor_uno = Double.parseDouble(result);
                    txRes.setText(result);
                }
                txOpe.setText("RESTA");
            }
        });

        btmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txOpe.getText().toString() == "") {
                    valor_uno = Double.parseDouble(txRes.getText().toString());
                } else {
                    String result = (realizaOperacion(txOpe.getText().toString(), valor_uno, Double.parseDouble(txRes.getText().toString())));
                    valor_uno = Double.parseDouble(result);
                    txRes.setText(result);
                }
                txOpe.setText("MULTIPLICA");
            }
        });

        btdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txOpe.getText().toString() == "") {
                    valor_uno = Double.parseDouble(txRes.getText().toString());
                } else {
                    String result = (realizaOperacion(txOpe.getText().toString(), valor_uno, Double.parseDouble(txRes.getText().toString())));
                    valor_uno = Double.parseDouble(result);
                    txRes.setText(result);
                }
                txOpe.setText("DIVIDE");
            }
        });

        btigu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txOpe.getText().toString() == "") {
                    valor_uno = Double.parseDouble(txRes.getText().toString());
                } else {
                    txRes.setText(realizaOperacion(txOpe.getText().toString(), valor_uno, Double.parseDouble(txRes.getText().toString())));
                }
                txOpe.setText("");
            }
        });
        //endregion

        //region botones de control
        btlim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limpiarTodo();
            }
        });

        btbor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                borraNumero();
            }
        });
        //endregion

        //region botones del teclado numerico
        btpun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                digitaNumero(".", txRes.getText().toString());
            }
        });

        btcer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                digitaNumero("0", txRes.getText().toString());
            }
        });

        btuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                digitaNumero("1", txRes.getText().toString());
            }
        });

        btdos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                digitaNumero("2", txRes.getText().toString());
            }
        });

        bttre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                digitaNumero("3", txRes.getText().toString());
            }
        });

        btcua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                digitaNumero("4", txRes.getText().toString());
            }
        });

        btcin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                digitaNumero("5", txRes.getText().toString());
            }
        });

        btsei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                digitaNumero("6", txRes.getText().toString());
            }
        });

        btsie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                digitaNumero("7", txRes.getText().toString());
            }
        });

        btoch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                digitaNumero("8", txRes.getText().toString());
            }
        });

        btnue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                digitaNumero("9", txRes.getText().toString());
            }
        });
        //endregion
    }

    public void digitaNumero(String valor, String dato) {
        double gest = 0;
        if (dato.length() > 0) {
            gest = Double.parseDouble(dato);
        }
        if (txOpe.getText().toString() != "") {
            gest = 0;
            dato = "0";
        }
        if (valor == "." && gest == 0 && punto == 0) {
            punto++;
            txRes.setText("0.");
        } else if (valor == "." && punto > 0) {
        } else if (valor == "." && gest != 0 && punto == 0) {
            punto++;
            txRes.setText(dato + valor);
        } else if (valor == "0" && gest == 0 && punto == 0) {
            txRes.setText("0");
        } else if (valor == "0" && gest == 0 && punto > 0) {
            txRes.setText(dato + valor);
        } else if (Integer.parseInt(valor) > 0 && gest == 0 && punto == 0) {
            txRes.setText(valor);
        } else if (Integer.parseInt(valor) > 0 && gest == 0 && punto > 0) {
            txRes.setText(dato + valor);
        } else if (Integer.parseInt(valor) > 0 && gest > 0 && punto == 0) {
            txRes.setText(dato + valor);
        } else if (Integer.parseInt(valor) > 0 && gest > 0 && punto > 0) {
            txRes.setText(dato + valor);
        }
    }

    public void borraNumero() {
        String dato = txRes.getText().toString().trim();
        int tamano = dato.length();
        if (tamano == 1) {
            txRes.setText("0");
            txOpe.setText("");
        } else {
            txRes.setText(dato.substring(0, dato.length() - 1));
        }
    }

    public void limpiarTodo() {
        punto = 0;
        txRes.setText("0");
        txOpe.setText("");
    }

    public String realizaOperacion(String tipo, Double valo1, Double valo2) {
        String valoFin = "0";
        if (tipo == "SUMA") {
            valoFin = String.valueOf(valo1 + valo2);
        } else if (tipo == "RESTA") {
            valoFin = String.valueOf(valo1 - valo2);
        } else if (tipo == "MULTIPLICA") {
            valoFin = String.valueOf(valo1 * valo2);
        } else if (tipo == "DIVIDE") {
            if (valo2 != 0) {
                valoFin = String.valueOf(valo1 / valo2);
            } else {
                txRes.setText("0");
                txOpe.setText("");
                return "0";
            }
        }
        String[] decimal = valoFin.split("\\.");
        if (decimal.length > 0) {
            String valo = decimal[1].replaceFirst("^0+(?!$)", "");
            int dataValo = 0;
            if (valo.length() > 5) {
                dataValo = Integer.parseInt(valo.substring(0, 5));
            } else {
                dataValo = Integer.parseInt(valo);
            }
            if (dataValo == 0) {
                valoFin = decimal[0];
            } else {
                valoFin = decimal[0] + "." + decimal[1];
            }
        }
        return valoFin;
    }
}