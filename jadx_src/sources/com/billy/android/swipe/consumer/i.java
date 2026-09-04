package com.billy.android.swipe.consumer;

import android.view.View;

/* JADX INFO: compiled from: SpaceConsumer.java */
/* JADX INFO: loaded from: classes6.dex */
public class i extends com.billy.android.swipe.f {
    public i() {
        H1(new q6.a(0.5f));
    }

    @Override // com.billy.android.swipe.f
    public void g1() {
        super.g1();
        View contentView = this.f40407b.getContentView();
        if (contentView != null) {
            contentView.setTranslationX(0.0f);
            contentView.setTranslationY(0.0f);
        }
    }

    @Override // com.billy.android.swipe.f
    public void h1(int i10, int i11, int i12, int i13) {
        View contentView = this.f40407b.getContentView();
        if (contentView != null) {
            if ((i10 >= 0 && y0()) || (i10 <= 0 && E0())) {
                contentView.setTranslationX(i10);
            }
            if ((i11 < 0 || !H0()) && (i11 > 0 || !p0())) {
                return;
            }
            contentView.setTranslationY(i11);
        }
    }
}
