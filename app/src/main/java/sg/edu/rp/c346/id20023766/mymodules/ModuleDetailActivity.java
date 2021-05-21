package sg.edu.rp.c346.id20023766.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;
    Button bckbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);
        tv1 = findViewById(R.id.textView);
        tv2 = findViewById(R.id.textView2);
        tv3 = findViewById(R.id.textView3);
        tv4 = findViewById(R.id.textView4);
        tv5 = findViewById(R.id.textView5);
        tv6 = findViewById(R.id.textView6);
        bckbtn = findViewById(R.id.button);

        Intent intentReceived = getIntent();
        String mc = intentReceived.getStringExtra("Module Code");
        tv1.setText(mc);

        String mn = intentReceived.getStringExtra("Module Name");
        tv2.setText(mn);

        String ac = intentReceived.getStringExtra("Academic Year");
        tv3.setText(ac);

        String sem = intentReceived.getStringExtra("Semester");
        tv4.setText(sem);

        String mcr = intentReceived.getStringExtra("Module Credit");
        tv5.setText(mcr);

        String vn = intentReceived.getStringExtra("Venue");
        tv6.setText(vn);

        bckbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}