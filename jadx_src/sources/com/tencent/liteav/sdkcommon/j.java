package com.tencent.liteav.sdkcommon;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f99836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Button f99837b;

    private j(g gVar, Button button) {
        this.f99836a = gVar;
        this.f99837b = button;
    }

    public static View.OnClickListener a(g gVar, Button button) {
        return new j(gVar, button);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        g gVar = this.f99836a;
        boolean z10 = gVar.f99825m;
        if (z10) {
            WindowManager.LayoutParams layoutParams = gVar.f99814b;
            int i10 = gVar.f99826n;
            layoutParams.height = i10;
            int i11 = layoutParams.y;
            int i12 = i10 + i11;
            int i13 = gVar.f99813a.heightPixels;
            if (i12 > i13) {
                layoutParams.height = i13 - i11;
            }
        } else {
            gVar.f99814b.height = gVar.f99826n / 2;
        }
        gVar.f99825m = !z10;
        gVar.f99818f.updateViewLayout(gVar.f99819g, gVar.f99814b);
        ViewGroup.LayoutParams layoutParams2 = gVar.f99823k.getLayoutParams();
        layoutParams2.height = gVar.b();
        gVar.f99823k.setLayoutParams(layoutParams2);
        gVar.f99816d.post(l.a(gVar));
    }
}
