package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.in;
import com.xiaomi.push.it;
import com.xiaomi.push.ix;
import com.xiaomi.push.ja;
import com.xiaomi.push.jf;
import com.xiaomi.push.jm;
import com.xiaomi.push.jx;
import com.xiaomi.push.service.az;
import com.xiaomi.push.service.ba;

/* JADX INFO: loaded from: classes4.dex */
public class ae extends com.xiaomi.push.ah.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f106746a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private boolean f117a = false;

    public ae(Context context) {
        this.f106746a = context;
    }

    @Override // com.xiaomi.push.ah.a
    /* JADX INFO: renamed from: a */
    public String mo195a() {
        return "2";
    }

    @Override // java.lang.Runnable
    public void run() {
        az azVarA = az.a(this.f106746a);
        jf jfVar = new jf();
        if (this.f117a) {
            jfVar.a(0);
            jfVar.b(0);
        } else {
            jfVar.a(ba.a(azVarA, it.MISC_CONFIG));
            jfVar.b(ba.a(azVarA, it.PLUGIN_CONFIG));
        }
        jm jmVar = new jm("-1", false);
        jmVar.c(ix.DailyCheckClientConfig.f623a);
        jmVar.a(jx.a(jfVar));
        com.xiaomi.channel.commonutils.logger.b.b("OcVersionCheckJob", "-->check version: checkMessage=", jfVar);
        ao.a(this.f106746a).a(jmVar, in.Notification, (ja) null);
    }
}
