package com.alipay.face.ui;

import android.content.Intent;
import android.os.Bundle;
import com.alipay.face.log.RecordLevel;
import com.alipay.face.log.RecordService;
import com.alipay.face.verify.ocr.R;

/* JADX INFO: loaded from: classes6.dex */
public class OcrGuideBackActivity extends OcrGuideBaseActivity {
    @Override // com.alipay.face.ui.OcrGuideBaseActivity
    public void B() {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "userBack", "loc", "ocrBack");
        K(com.alipay.face.b.a.f38580h);
    }

    @Override // com.alipay.face.ui.OcrGuideBaseActivity
    public void C() {
        startActivity(new Intent(this, (Class<?>) OcrGuideFaceActivity.class));
        finish();
    }

    @Override // com.alipay.face.ui.OcrGuideBaseActivity
    public void D() {
        Intent intent = new Intent(this, (Class<?>) OcrTakePhotoActivity.class);
        intent.putExtra("takePhotoFront", false);
        startActivityForResult(intent, 0);
    }

    @Override // com.alipay.face.ui.OcrGuideBaseActivity, com.alipay.face.ui.FaceBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.alipay.face.ui.OcrGuideBaseActivity
    public String s() {
        return getString(R.string.f39224a);
    }

    @Override // com.alipay.face.ui.OcrGuideBaseActivity
    public String v() {
        return getString(R.string.f39228e);
    }

    @Override // com.alipay.face.ui.OcrGuideBaseActivity
    public boolean z() {
        return true;
    }
}
