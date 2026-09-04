package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.in;
import com.xiaomi.push.ix;
import com.xiaomi.push.ja;
import com.xiaomi.push.jm;
import com.xiaomi.push.service.bc;

/* JADX INFO: loaded from: classes4.dex */
public class MiPushClient4VR {
    public static void uploadData(Context context, String str) {
        jm jmVar = new jm();
        jmVar.c(ix.VRUpload.f623a);
        jmVar.b(b.m111a(context).m112a());
        jmVar.d(context.getPackageName());
        jmVar.a("data", str);
        jmVar.a(bc.a());
        ao.a(context).a(jmVar, in.Notification, (ja) null);
    }
}
