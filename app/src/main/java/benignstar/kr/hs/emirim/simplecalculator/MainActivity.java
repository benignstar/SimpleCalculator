package benignstar.kr.hs.emirim.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static benignstar.kr.hs.emirim.simplecalculator.R.id.but_add;

public class MainActivity extends AppCompatActivity{
    TextView textResult;
    EditText edit_first;
    EditText edit_second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResult = (TextView) findViewById(R.id.textResult);
        edit_first=(EditText) findViewById(R.id.edit_first);
        edit_second=(EditText) findViewById(R.id.edit_second);
        Button but_add=(Button) findViewById(R.id.but_add);
        Button but_sub=(Button) findViewById(R.id.but_sub);
        Button but_mul=(Button) findViewById(R.id.but_mul);
        Button but_div=(Button) findViewById(R.id.but_div);
        but_add.setOnClickListener(butHandler);
        but_sub.setOnClickListener(butHandler);
        but_mul.setOnClickListener(butHandler);
        but_div.setOnClickListener(butHandler);

        /*but_add.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                int num_first=Integer.parseInt(edit_first.getText().toString());
                int num_second=Integer.parseInt(edit_second.getText().toString());
                textResult.setText(String.valueOf("실행결과 : "+(num_first+num_second)));
            }
        });

        but_sub.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                int num_first=Integer.parseInt(edit_first.getText().toString());
                int num_second=Integer.parseInt(edit_second.getText().toString());
                textResult.setText(String.valueOf("실행결과 : "+(num_first-num_second)));

            }
        });

        but_mul.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                int num_first=Integer.parseInt(edit_first.getText().toString());
                int num_second=Integer.parseInt(edit_second.getText().toString());
                textResult.setText(String.valueOf("실행결과 : "+(num_first*num_second)));
            }
        });

        but_div.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                int num_first=Integer.parseInt(edit_first.getText().toString());
                int num_second=Integer.parseInt(edit_second.getText().toString());
                textResult.setText(String.valueOf("실행결과 : "+(num_first/num_second)));
            }
        });*/
    }

    /*@Override
    public void onClick(View view) {
        int num_first=Integer.parseInt(edit_first.getText().toString());
        int num_second=Integer.parseInt(edit_second.getText().toString());
        int result=0;

        switch (view.getId()){
            case but_add :
                result=num_first+num_second;
                break;
            case R.id.but_sub :
                result=num_first-num_second;
                break;
            case R.id.but_mul :
                result=num_first*num_second;
                break;
            case R.id.but_div :
                result=num_first/num_second;
                break;
        }

        textResult.setText("실행결과 : "+(num_first+num_second));
    }*/
    View.OnClickListener butHandler=new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            int num_first = Integer.parseInt(edit_first.getText().toString());
            int num_second = Integer.parseInt(edit_second.getText().toString());
            int result = 0;

            switch (view.getId()) {
                case but_add:
                    result = num_first + num_second;
                    break;
                case R.id.but_sub:
                    result = num_first - num_second;
                    break;
                case R.id.but_mul:
                    result = num_first * num_second;
                    break;
                case R.id.but_div:
                    result = num_first / num_second;
                    break;
            }

            textResult.setText("실행결과 : " + result);
        }
    };


}
