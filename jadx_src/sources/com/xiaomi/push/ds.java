package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class ds implements he {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f106987a;

    public ds(Context context) {
        this.f106987a = context;
    }

    @Override // com.xiaomi.push.he
    public void a(hb hbVar) {
    }

    @Override // com.xiaomi.push.he
    public void a(hb hbVar, int i10, Exception exc) {
        dm.a(this.f106987a, hbVar.mo439a(), i10);
    }

    @Override // com.xiaomi.push.he
    public void a(hb hbVar, Exception exc) {
    }

    @Override // com.xiaomi.push.he
    public void b(hb hbVar) {
        dm.m253a(this.f106987a);
    }
}
