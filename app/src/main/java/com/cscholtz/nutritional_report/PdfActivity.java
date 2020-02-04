package com.cscholtz.nutritional_report;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.view.Window;
import com.github.barteksc.pdfviewer.PDFView;

import java.io.File;


public class PdfActivity extends AppCompatActivity {
    private PDFView pdfView;
    private File file;
    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_pdf);

        pdfView = (PDFView) findViewById(R.id.pdfView);
        bundle = getIntent().getExtras();
        if(bundle!=null){
            file = new File(bundle.getString("path",""));
            //showToast(bundle.getString("path",""));
        }
        pdfView.fromFile(file)
                .enableSwipe(true)
                .swipeHorizontal(false)
                .enableDoubletap(true)
                .enableAntialiasing(true)
                .load();
    }

}
