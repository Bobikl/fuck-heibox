package com.xiaomi.mipush.sdk;

import com.xiaomi.push.is;
import com.xiaomi.push.service.az;

/* JADX INFO: loaded from: classes4.dex */
public class g extends az.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f106788a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(f fVar, int i10, String str) {
        super(i10, str);
        this.f106788a = fVar;
    }

    @Override // com.xiaomi.push.service.az.a
    protected void onCallback() {
        boolean zA = az.a(this.f106788a.f150a).a(is.AggregatePushSwitch.a(), true);
        if (this.f106788a.f153a != zA) {
            this.f106788a.f153a = zA;
            i.b(this.f106788a.f150a);
        }
    }
}
