package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: loaded from: classes4.dex */
public class eu extends et {
    public eu(Context context, int i10) {
        super(context, i10);
    }

    @Override // com.xiaomi.push.et
    public ip a() {
        return ip.Storage;
    }

    @Override // com.xiaomi.push.ah.a
    /* JADX INFO: renamed from: a */
    public String mo195a() {
        return "23";
    }

    @Override // com.xiaomi.push.et
    public String b() {
        return "ram:" + i.m465a() + Constants.ACCEPT_TIME_SEPARATOR_SP + "rom:" + i.m470b() + "|ramOriginal:" + i.c() + Constants.ACCEPT_TIME_SEPARATOR_SP + "romOriginal:" + i.d();
    }
}
