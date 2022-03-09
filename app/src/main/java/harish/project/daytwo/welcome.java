package harish.project.daytwo;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {
    Button button_back;
    TextView textView_name1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        button_back=findViewById(R.id.button);
        textView_name1=findViewById(R.id.textView_name);

        textView_name1.setText(string_name);

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_back = new Intent(Welcome.this,MainActivity.class);
                startActivity(intent_back);
            }
        });
    }
}