package com.tencent.liteav.sdkcommon;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f99838a;

    private k(g gVar) {
        this.f99838a = gVar;
    }

    public static View.OnClickListener a(g gVar) {
        return new k(gVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f99838a.a(false);
    }
}
