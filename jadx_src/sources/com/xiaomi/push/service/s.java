package com.xiaomi.push.service;

import com.xiaomi.push.im;
import com.xiaomi.push.ir;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class s implements im {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final XMPushService f108034a;

    public s(XMPushService xMPushService) {
        this.f108034a = xMPushService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        return "com.xiaomi.xmsf".equals(str) ? "1000271" : this.f108034a.getSharedPreferences("pref_registered_pkg_names", 0).getString(str, null);
    }

    @Override // com.xiaomi.push.im
    public void a(List<ir> list, String str, String str2) {
        this.f108034a.a(new t(this, 4, str, list, str2));
    }
}
