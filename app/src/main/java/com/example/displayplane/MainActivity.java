package com.example.displayplane;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

        import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    TextView display;
    Button btnclick;
    private String abs[]={"sujan", "shrestha", "Suman", "King", "Queen", "Generated"};
    int Counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.etDisplay);
        btnclick=findViewById(R.id.etClick);

        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(abs[Counter]);
                if (Counter < abs.length - 1){
                    Counter++;
                } else {
                    Counter = 0;
                }
            }
        });

    }
}