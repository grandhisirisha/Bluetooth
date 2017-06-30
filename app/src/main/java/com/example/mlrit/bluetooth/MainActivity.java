package com.example.mlrit.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Switch s;
    TextView t;

    BluetoothAdapter ba=BluetoothAdapter.getDefaultAdapter();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final BluetoothAdapter ba=BluetoothAdapter.getDefaultAdapter();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s=(Switch)findViewById(R.id.sw);
        t=(TextView)findViewById(R.id.tv);

        s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b)
                {
                    ba.enable();
                    t.setText("ON");
                }
                else
                {
                    ba.disable();
                    t.setText("OFF");
                }
            }
        });
    }
}
