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
public class OcrPhotoRequireOverlay extends FrameLayout {

    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OcrPhotoRequireOverlay.this.setVisibility(4);
        }
    }

    public OcrPhotoRequireOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.f39203l, this);
        ImageView imageView = (ImageView) findViewById(R.id.S);
        if (imageView != null) {
            imageView.setOnClickListener(new a());
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ImageView imageView = (ImageView) findViewById(R.id.f39177l);
        if (imageView != null) {
            int width = (int) (imageView.getWidth() * 0.7717996f);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = width;
            imageView.setLayoutParams(layoutParams);
        }
    }
}
