package com.igexin.push.core.b;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class z extends com.igexin.push.b.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f63553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f63554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f63555c;

    z(i iVar, String str, String str2) {
        this.f63555c = iVar;
        this.f63553a = str;
        this.f63554b = str2;
    }

    @Override // com.igexin.push.b.d
    public void a() throws Exception {
        if (!TextUtils.isEmpty(this.f63553a)) {
            i.a().a(this.f63328d, 53, this.f63553a);
        }
        if (TextUtils.isEmpty(this.f63554b)) {
            return;
        }
        i.a().a(this.f63328d, 54, this.f63554b);
    }
}
