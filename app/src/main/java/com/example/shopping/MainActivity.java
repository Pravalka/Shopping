package com.example.shopping;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.MessageFormat;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText arduinoQty, wifiQty, btQty;
        arduinoQty = (EditText) findViewById(R.id.arduinoQty);
        wifiQty = (EditText) findViewById(R.id.wifiQty);
        btQty = (EditText) findViewById(R.id.btQty);
        TextView res = (TextView) findViewById(R.id.res);
        Button submitBtn, clearBtn;
        submitBtn = (Button) findViewById(R.id.submitBtn);
        clearBtn = (Button) findViewById(R.id.clearBtn);
        int arduinoPrice = 500;
        int wifiPrice = 250;
        int btPrice = 200;
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int QtyArduino = 0;
                int QtyWifi = 0;
                int QtyBt = 0;
                if (!arduinoQty.getText().toString().equals("")) {
                    QtyArduino = Integer.parseInt(arduinoQty.getText().toString());
                }
                if (!wifiQty.getText().toString().equals("")) {
                    QtyWifi = Integer.parseInt(wifiQty.getText().toString());
                }
                if (!btQty.getText().toString().equals("")) {
                    QtyBt = Integer.parseInt(btQty.getText().toString());
                }
                int totalPrice = (QtyArduino * arduinoPrice) + (QtyWifi * wifiPrice) + (QtyBt * btPrice);
                res.setText(totalPrice + " Rs. ");
            }
        });
        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arduinoQty.setText("");
                wifiQty.setText("");
                btQty.setText("");
                res.setText(" 0 Rs. ");
            }
        });
    }
}


