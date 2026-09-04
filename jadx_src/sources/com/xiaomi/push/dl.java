package com.xiaomi.push;

import android.content.Context;
import com.max.xiaoheihe.bean.BizMessageObj;

/* JADX INFO: loaded from: classes4.dex */
public class dl implements hg, ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f106959a;

    public dl(Context context) {
        this.f106959a = context;
    }

    @Override // com.xiaomi.push.hg
    public void a(gq gqVar) {
        if (gqVar != null && gqVar.a() == 0 && BizMessageObj.TYPE_PING.equals(gqVar.m415a())) {
            dv.c(this.f106959a);
        } else {
            dv.a(this.f106959a);
        }
    }

    @Override // com.xiaomi.push.hg
    public void a(hs hsVar) {
        dv.a(this.f106959a);
    }

    @Override // com.xiaomi.push.ho
    /* JADX INFO: renamed from: a */
    public boolean mo252a(hs hsVar) {
        return true;
    }
}
