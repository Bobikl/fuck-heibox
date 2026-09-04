package com.alipay.face.ui.overlay;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alipay.face.verify.ocr.R;

/* JADX INFO: loaded from: classes6.dex */
public class OcrIdentityErrorOverlay extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f39017b;

    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (OcrIdentityErrorOverlay.this.f39017b != null) {
                OcrIdentityErrorOverlay.this.setVisibility(4);
                OcrIdentityErrorOverlay.this.f39017b.onClose();
            }
        }
    }

    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (OcrIdentityErrorOverlay.this.f39017b != null) {
                OcrIdentityErrorOverlay.this.setVisibility(4);
                OcrIdentityErrorOverlay.this.f39017b.a();
            }
        }
    }

    public interface c {
        void a();

        void onClose();
    }

    public OcrIdentityErrorOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39017b = null;
        LayoutInflater.from(context).inflate(R.layout.f39198g, this);
        ImageView imageView = (ImageView) findViewById(R.id.A);
        if (imageView != null) {
            imageView.setOnClickListener(new a());
        }
        View viewFindViewById = findViewById(R.id.B);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new b());
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ImageView imageView = (ImageView) findViewById(R.id.f39175j);
        if (imageView != null) {
            int width = (int) (imageView.getWidth() * 0.7717996f);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = width;
            imageView.setLayoutParams(layoutParams);
        }
    }

    public void setOcrIdentityErrorOverlayListener(c cVar) {
        this.f39017b = cVar;
    }
}
