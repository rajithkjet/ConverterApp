package com.example.converterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Temperature extends AppCompatActivity {

    EditText inputval,outputval;
    RadioGroup radioGroup;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

        inputval=findViewById(R.id.inputval);
        outputval=findViewById(R.id.outputval);
        radioGroup=findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
            radioButton=findViewById(checkedId);

            String value=inputval.getText().toString();
            int finaloutput=Integer.parseInt(value);
            double result;

            switch (checkedId){
                case R.id.c2f:
                    result = ((finaloutput*9)/5)+32;
                    outputval.setText(String.valueOf(result));
                    break;

                    case R.id.f2c:
                        result = ((finaloutput*9)/5)+32;
                        outputval.setText(String.valueOf(result));
                        break;

}


            }
        });
    }

   public void checkview(View v){
        int groupbtnId=radioGroup.getCheckedRadioButtonId();
        radioButton=findViewById(groupbtnId);
        Toast.makeText(this,"Selected for "+radioButton.getText(),Toast.LENGTH_SHORT).show();
   }
}
