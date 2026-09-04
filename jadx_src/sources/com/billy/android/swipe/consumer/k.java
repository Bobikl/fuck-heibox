package com.billy.android.swipe.consumer;

import android.view.View;

/* JADX INFO: compiled from: StretchConsumer.java */
/* JADX INFO: loaded from: classes6.dex */
public class k extends com.billy.android.swipe.f {
    @Override // com.billy.android.swipe.f
    public void g1() {
        super.g1();
        View contentView = this.f40407b.getContentView();
        if (contentView != null) {
            contentView.setScaleX(1.0f);
            contentView.setScaleY(1.0f);
            contentView.setTranslationX(0.0f);
            contentView.setTranslationY(0.0f);
        }
    }

    @Override // com.billy.android.swipe.f
    public void h1(int i10, int i11, int i12, int i13) {
        View contentView = this.f40407b.getContentView();
        if (contentView != null) {
            if ((i10 >= 0 && y0()) || (i10 <= 0 && E0())) {
                float f10 = i10;
                contentView.setScaleX((Math.abs(f10) / this.D) + 1.0f);
                contentView.setTranslationX(f10 / 2.0f);
            }
            if ((i11 < 0 || !H0()) && (i11 > 0 || !p0())) {
                return;
            }
            float f11 = i11;
            contentView.setScaleY((Math.abs(f11) / this.E) + 1.0f);
            contentView.setTranslationY(f11 / 2.0f);
        }
    }
}
