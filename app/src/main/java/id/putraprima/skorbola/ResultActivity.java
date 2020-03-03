package id.putraprima.skorbola;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView messageText, scorerText;
    private String pesan, pemain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        messageText =findViewById(R.id.textView3);
        scorerText = findViewById(R.id.scorerText);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            pesan = bundle.getString("MESSAGE_KEY");
            pemain = bundle.getString("SCORER_KEY");
            messageText.setText(pesan);
            scorerText.setText(pemain);
        }
    }

}
