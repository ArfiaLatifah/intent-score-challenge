package id.putraprima.skorbola;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ScorerActivity extends AppCompatActivity {

    private EditText edit;
    private int request;
    private String scorerName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scorer);

        edit = findViewById(R.id.editText);

        Bundle bundle = getIntent().getExtras();
        if (bundle !=null){
            request = bundle.getInt("REQUEST_KEY");
        }
    }

    public void buttonBack(View view) {
        scorerName = edit.getText().toString();
        if ((scorerName).equals("")){
            Toast.makeText(this, "Anda belum memasukkan nama pemain", Toast.LENGTH_SHORT).show();
        }else{
            if (request == 1){
                scorerName = edit.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("HOME_SCORER_KEY", scorerName);
                setResult(1, intent);
                finish();
            }else if (request == 2){
                scorerName = edit.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("AWAY_SCORER_KEY", scorerName);
                setResult(1, intent);
                finish();
            }
        }
    }
}