package bess.com.guess;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int r = new Random().nextInt(100)+1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView b = (TextView)findViewById(R.id.txt_begin);
        b.setText(Integer.toString(1));
        TextView f = (TextView)findViewById(R.id.txt_final);
        f.setText(Integer.toString(100));
    }

    public void guess(View view){
        EditText edNumber = (EditText)findViewById(R.id.ed_number);
        int number = Integer.parseInt(edNumber.getText().toString());
        TextView b = (TextView)findViewById(R.id.txt_begin);
        TextView f = (TextView)findViewById(R.id.txt_final);
        int nb, nf;
//        for (int i=0; i<2; i++){
            if(number > 1 && number < r){
                b.setText(Integer.toString(number));
                nb = number;
            }else if(number > r && number < 100){
                f.setText(Integer.toString(number));
                nf = number;
            }else{
                new AlertDialog.Builder(this)
                        .setMessage("猜對了")
                        .setPositiveButton("OK", null)
                        .show();
            }

//            if (number < nb || number > nf){
//                    Toast.makeText(this, "不屬於猜測數字之範圍", Toast.LENGTH_SHORT).show();
//            }else if(number > nb && number < r){
//                    b.setText(Integer.toString(number));
//            }else if(number > r && number < nf){
//                    f.setText(Integer.toString(number));
//            }else{
//                    new AlertDialog.Builder(this)
//                            .setMessage("猜對了")
//                            .setPositiveButton("OK", null)
//                            .show();
//            }
//        }
    }
}
