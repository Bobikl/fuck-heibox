package com.vivo.push.d;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: compiled from: OnNotificationArrivedReceiveTask.java */
/* JADX INFO: loaded from: classes4.dex */
public final class t implements r.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f106561a;

    t(s sVar) {
        this.f106561a = sVar;
    }

    @Override // com.vivo.push.d.r.a
    public final void a() {
        long jL = com.vivo.push.e.a().l();
        if (jL < 1400 && jL != 1340) {
            com.vivo.push.util.p.b("OnNotificationArrivedTask", "引擎版本太低，不支持正向展示功能，pushEngineSDKVersion：".concat(String.valueOf(jL)));
            return;
        }
        HashMap map = new HashMap();
        map.put("srt", "1");
        map.put("message_id", String.valueOf(this.f106561a.f106559b.f()));
        String strB = com.vivo.push.util.z.b(((com.vivo.push.l) this.f106561a.f106560c).f106610a, ((com.vivo.push.l) this.f106561a.f106560c).f106610a.getPackageName());
        if (!TextUtils.isEmpty(strB)) {
            map.put("app_id", strB);
        }
        map.put("type", "1");
        map.put("dtp", "1");
        com.vivo.push.util.e.a(6L, map);
    }

    @Override // com.vivo.push.d.r.a
    public final void b() {
        HashMap map = new HashMap();
        map.put(x9.b.f141138c, String.valueOf(this.f106561a.f106559b.f()));
        String strB = com.vivo.push.util.z.b(((com.vivo.push.l) this.f106561a.f106560c).f106610a, ((com.vivo.push.l) this.f106561a.f106560c).f106610a.getPackageName());
        if (!TextUtils.isEmpty(strB)) {
            map.put("remoteAppId", strB);
        }
        com.vivo.push.util.e.a(2122L, map);
    }
}
