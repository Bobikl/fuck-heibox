package com.alipay.face.ui.overlay;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.alipay.face.verify.ocr.R;

/* JADX INFO: loaded from: classes6.dex */
public class OcrIdentityNetErrorOverlay extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f39020b;

    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (OcrIdentityNetErrorOverlay.this.f39020b != null) {
                OcrIdentityNetErrorOverlay.this.setVisibility(4);
                OcrIdentityNetErrorOverlay.this.f39020b.b();
            }
        }
    }

    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (OcrIdentityNetErrorOverlay.this.f39020b != null) {
                OcrIdentityNetErrorOverlay.this.setVisibility(4);
                OcrIdentityNetErrorOverlay.this.f39020b.a();
            }
        }
    }

    public interface c {
        void a();

        void b();
    }

    public OcrIdentityNetErrorOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39020b = null;
        LayoutInflater.from(context).inflate(R.layout.f39199h, this);
        View viewFindViewById = findViewById(R.id.f39181p);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new a());
        }
        View viewFindViewById2 = findViewById(R.id.f39182q);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new b());
        }
    }

    public void setOnNetworkErrorListener(c cVar) {
        this.f39020b = cVar;
    }
}
