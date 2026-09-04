package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.em;
import com.xiaomi.push.in;
import com.xiaomi.push.ja;
import com.xiaomi.push.jm;

/* JADX INFO: loaded from: classes4.dex */
public class r implements em {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f106799a;

    public r(Context context) {
        this.f106799a = context;
    }

    @Override // com.xiaomi.push.em
    public String a() {
        return b.m111a(this.f106799a).d();
    }

    @Override // com.xiaomi.push.em
    public void a(jm jmVar, in inVar, ja jaVar) {
        ao.a(this.f106799a).a(jmVar, inVar, jaVar);
    }
}
