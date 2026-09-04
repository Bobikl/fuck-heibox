package com.alipay.face.ui.overlay;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.alipay.face.verify.ocr.R;

/* JADX INFO: loaded from: classes6.dex */
public class OcrLoadingOverlay extends FrameLayout {
    public OcrLoadingOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.f39200i, this);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration(2000L);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setFillAfter(true);
        ImageView imageView = (ImageView) findViewById(R.id.f39176k);
        if (imageView != null) {
            imageView.setAnimation(rotateAnimation);
        }
    }

    public void setLoadingText(String str) {
        TextView textView = (TextView) findViewById(R.id.G);
        if (textView != null) {
            textView.setText(str);
        }
    }
}
