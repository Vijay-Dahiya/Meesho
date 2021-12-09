package vijay.masai.meesho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import vijay.masai.meesho.R;

public class Sign_up extends AppCompatActivity {
    private TextView t;
    private TextView v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        t=findViewById(R.id.textView3);
        v=findViewById(R.id.textView4);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Sign_up.this,firstPage.class);
                startActivity(i);
            }
        });
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Sign_up.this,Login.class);
                startActivity(i);
            }
        });

    }
}