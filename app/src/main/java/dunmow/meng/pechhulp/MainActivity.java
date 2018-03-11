package dunmow.meng.pechhulp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mBtnRSR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnRSR =  findViewById(R.id.btnPechhulp);
        mBtnRSR.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this, MapsActivity.class);
               startActivity(intent);
            }
        });
    }
}