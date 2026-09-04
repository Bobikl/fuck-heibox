package com.alipay.android.phone.mrpc.core;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f38100a;

    public h(Context context) {
        this.f38100a = context;
    }

    @Override // com.alipay.android.phone.mrpc.core.w
    public final <T> T a(Class<T> cls, aa aaVar) {
        return (T) new x(new i(this, aaVar)).a(cls);
    }
}
