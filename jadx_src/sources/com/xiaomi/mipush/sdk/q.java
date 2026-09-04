package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.fd;
import com.xiaomi.push.is;
import com.xiaomi.push.service.az;

/* JADX INFO: loaded from: classes4.dex */
public class q extends az.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f106798a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(int i10, String str, Context context) {
        super(i10, str);
        this.f106798a = context;
    }

    @Override // com.xiaomi.push.service.az.a
    protected void onCallback() {
        fd.a(this.f106798a).a(az.a(this.f106798a).a(is.AwakeInfoUploadWaySwitch.a(), 0));
    }
}
