package com.alipay.face.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.alipay.face.ui.overlay.OcrLoadingOverlay;
import com.alipay.face.ui.widget.OcrGuideStageView;
import com.alipay.face.verify.ocr.R;

/* JADX INFO: loaded from: classes6.dex */
public class OcrGuideFaceActivity extends FaceBaseActivity {

    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            OcrGuideFaceActivity.this.startActivity(new Intent(OcrGuideFaceActivity.this, e4.b.f118543a.f()));
            OcrGuideFaceActivity.this.finish();
        }
    }

    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    @Override // com.alipay.face.ui.FaceBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f39193b);
        OcrLoadingOverlay ocrLoadingOverlay = (OcrLoadingOverlay) findViewById(R.id.F);
        if (ocrLoadingOverlay != null) {
            ocrLoadingOverlay.setLoadingText("即将进入刷脸页...");
            ocrLoadingOverlay.setVisibility(0);
            ocrLoadingOverlay.postDelayed(new a(), 2000L);
        }
        OcrGuideStageView ocrGuideStageView = (OcrGuideStageView) findViewById(R.id.f39188w);
        if (ocrGuideStageView != null) {
            ocrGuideStageView.setStage(2);
        }
        View viewFindViewById = findViewById(R.id.f39184s);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new b());
        }
    }
}
