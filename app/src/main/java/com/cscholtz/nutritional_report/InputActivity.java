package com.cscholtz.nutritional_report;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        Button calculateButton = findViewById(R.id.calculatebutton);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TemplatePDF templatePDF = new TemplatePDF(getApplicationContext());
                templatePDF.openDocument("archivo_PDF");
                templatePDF.addMetaData("Evaluacion Nutricional","evaluacion","cs");
                templatePDF.addTitles("Evaluacion Nutricional","Paciente: ","slhsd");
                templatePDF.addParagraph("JAOSDDKAÑSDKLJASÑLDKJASKDJAÑSKLDJAÑSDKAÑSLDKAÑLDKAÑSLDAÑLSDKÑ");
                templatePDF.closeDocument();
                templatePDF.viewPDF();
            }
        });

    }
}
