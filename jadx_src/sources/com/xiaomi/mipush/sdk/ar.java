package com.xiaomi.mipush.sdk;

import android.database.ContentObserver;
import android.os.Handler;
import com.xiaomi.push.bg;
import com.xiaomi.push.service.bm;

/* JADX INFO: loaded from: classes4.dex */
public class ar extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ao f106764a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(ao aoVar, Handler handler) {
        super(handler);
        this.f106764a = aoVar;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        ao aoVar = this.f106764a;
        aoVar.f131a = Integer.valueOf(bm.a(aoVar.f127a).a());
        if (this.f106764a.f131a.intValue() != 0) {
            this.f106764a.f127a.getContentResolver().unregisterContentObserver(this);
            if (bg.b(this.f106764a.f127a)) {
                this.f106764a.m108c();
            }
        }
    }
}
