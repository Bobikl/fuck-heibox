package com.alipay.face.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.alipay.face.log.RecordLevel;
import com.alipay.face.log.RecordService;
import com.alipay.face.verify.ocr.R;

/* JADX INFO: loaded from: classes6.dex */
public class OcrGuideFrontActivity extends OcrGuideBaseActivity {
    @Override // com.alipay.face.ui.OcrGuideBaseActivity
    public boolean A() {
        return true;
    }

    @Override // com.alipay.face.ui.OcrGuideBaseActivity
    public void B() {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "userBack", "loc", "ocrFront");
        K(com.alipay.face.b.a.f38580h);
    }

    @Override // com.alipay.face.ui.OcrGuideBaseActivity
    public void C() {
        String strT = t();
        if (!d4.c.l(strT)) {
            Toast.makeText(this, "身份证姓名格式错误，请检查", 0).show();
            return;
        }
        String strU = u();
        if (!d4.c.m(strU)) {
            Toast.makeText(this, "身份证号码格式错误，请检查", 0).show();
            return;
        }
        e4.c cVar = e4.b.f118543a;
        if (cVar != null) {
            cVar.e(strT, strU);
        }
        startActivity(new Intent(this, (Class<?>) OcrGuideBackActivity.class));
        finish();
    }

    @Override // com.alipay.face.ui.OcrGuideBaseActivity
    public void D() {
        Intent intent = new Intent(this, (Class<?>) OcrTakePhotoActivity.class);
        intent.putExtra("takePhotoFront", true);
        startActivityForResult(intent, 0);
    }

    @Override // com.alipay.face.ui.OcrGuideBaseActivity, com.alipay.face.ui.FaceBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.alipay.face.ui.OcrGuideBaseActivity
    public String s() {
        return getString(R.string.f39225b);
    }

    @Override // com.alipay.face.ui.OcrGuideBaseActivity
    public String v() {
        return getString(R.string.f39229f);
    }
}
