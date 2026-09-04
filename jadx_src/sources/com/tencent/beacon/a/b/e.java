package com.tencent.beacon.a.b;

import android.os.Build;
import android.text.TextUtils;
import com.taobao.accs.common.Constants;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: AbstractAttaReport.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, String> f98755a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f98756b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f98757c = false;

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(String str, String str2, Throwable th2) {
        a(str, str2, th2, true, new d(this));
    }

    private synchronized void e() {
        if (this.f98756b) {
            return;
        }
        Map<String, String> map = f98755a;
        map.put("attaid", b());
        map.put("token", c());
        map.put("error_code", "");
        map.put("platform", "Android");
        map.put("uin", com.tencent.beacon.a.c.e.l().d());
        map.put(Constants.KEY_MODEL, Build.BOARD + " " + com.tencent.beacon.a.c.f.e().h());
        map.put("os", com.tencent.beacon.a.c.e.l().s());
        map.put("error_msg", "");
        map.put("error_stack_full", "");
        map.put("app_version", com.tencent.beacon.a.c.b.a());
        map.put("sdk_version", com.tencent.beacon.a.c.c.d().j());
        map.put("product_id", com.tencent.beacon.a.c.c.d().f());
        map.put("_dc", "");
        this.f98756b = true;
    }

    public synchronized void a(String str, String str2) {
        a(str, str2, null);
    }

    public synchronized void a(String str, String str2, Throwable th2) {
        a(str, str2, th2, false, new b(this, str, str2, th2));
    }

    public synchronized void a(String str, String str2, Throwable th2, boolean z10, com.tencent.beacon.base.net.a.b<com.tencent.beacon.base.net.a> bVar) {
        if (d()) {
            if (!this.f98756b) {
                e();
            }
            if (TextUtils.isEmpty(str)) {
                com.tencent.beacon.base.util.c.b("[atta] errorCode isn't valid value!", new Object[0]);
            } else {
                a.a().a(new c(this, str, str2, th2, z10, bVar));
            }
        }
    }

    public void a(boolean z10) {
        this.f98757c = z10;
    }

    abstract String b();

    abstract String c();

    public boolean d() {
        if (this.f98757c) {
            return true;
        }
        if (com.tencent.beacon.base.util.c.b()) {
            return false;
        }
        String strD = com.tencent.beacon.a.c.e.l().d();
        return !TextUtils.isEmpty(strD) && ((double) Math.abs(strD.hashCode() % 10000)) < 100.0d;
    }
}
