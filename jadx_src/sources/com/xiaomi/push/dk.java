package com.xiaomi.push;

import android.content.Context;
import com.max.xiaoheihe.bean.BizMessageObj;

/* JADX INFO: loaded from: classes4.dex */
public class dk implements hg, ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f106958a;

    public dk(Context context) {
        this.f106958a = context;
    }

    @Override // com.xiaomi.push.hg
    public void a(gq gqVar) {
        if (gqVar != null && gqVar.a() == 0 && BizMessageObj.TYPE_PING.equals(gqVar.m415a())) {
            dv.d(this.f106958a);
        } else {
            dv.b(this.f106958a);
        }
    }

    @Override // com.xiaomi.push.hg
    public void a(hs hsVar) {
        dv.b(this.f106958a);
    }

    @Override // com.xiaomi.push.ho
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean mo252a(hs hsVar) {
        return true;
    }
}
