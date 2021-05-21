package sg.edu.rp.c346.id20023766.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.C206);
        tv2 = findViewById(R.id.C235);
        tv3 = findViewById(R.id.C203);
        tv4 = findViewById(R.id.C346);
        tv5 = findViewById(R.id.C218);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code", "Module Code: C206");
                intent.putExtra("Module Name", "Module Name: Software Development Process");
                intent.putExtra("Academic Year", "Academic Year: 2021");
                intent.putExtra("Semester", "Semester: 1");
                intent.putExtra("Module Credit", "Module Credit: 4");
                intent.putExtra("Venue", "Venue: W67L");
                startActivity(intent);
            }
    });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code", "Module Code: C235");
                intent.putExtra("Module Name", "Module Name: IT security and Management");
                intent.putExtra("Academic Year", "Academic Year: 2021");
                intent.putExtra("Semester", "Semester: 1");
                intent.putExtra("Module Credit", "Module Credit: 4");
                intent.putExtra("Venue", "Venue: W67L");
                startActivity(intent);
            }
        });

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code", "Module Code: C203");
                intent.putExtra("Module Name", "Module Name: Web AppIn Development in php");
                intent.putExtra("Academic Year", "Academic Year: 2021");
                intent.putExtra("Semester", "Semester: 1");
                intent.putExtra("Module Credit", "Module Credit: 4");
                intent.putExtra("Venue", "Venue: W67L");
                startActivity(intent);
            }
        });

        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code", "Module Code: C346");
                intent.putExtra("Module Name", "Module Name: Mobile App Development");
                intent.putExtra("Academic Year", "Academic Year: 2021");
                intent.putExtra("Semester", "Semester: 1");
                intent.putExtra("Module Credit", "Module Credit: 4");
                intent.putExtra("Venue", "Venue: E62E");
                startActivity(intent);
            }
        });

        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code", "Module Code: C218");
                intent.putExtra("Module Name", "Module Name: UI/UX Design for Apps");
                intent.putExtra("Academic Year", "Academic Year: 2021");
                intent.putExtra("Semester", "Semester: 1");
                intent.putExtra("Module Credit", "Module Credit: 4");
                intent.putExtra("Venue", "Venue: W64G");
                startActivity(intent);
            }
        });
}
}