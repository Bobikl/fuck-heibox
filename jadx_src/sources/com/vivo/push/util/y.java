package com.vivo.push.util;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: compiled from: SystemCache.java */
/* JADX INFO: loaded from: classes4.dex */
public final class y implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashMap<String, Integer> f106699a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashMap<String, Long> f106700b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HashMap<String, String> f106701c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static y f106702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f106703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f106704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f106705g;

    private y(Context context) {
        this.f106705g = false;
        this.f106703e = context;
        this.f106705g = a(context);
        p.d("SystemCache", "init status is " + this.f106705g + ";  curCache is " + this.f106704f);
    }

    public static synchronized y b(Context context) {
        if (f106702d == null) {
            f106702d = new y(context.getApplicationContext());
        }
        return f106702d;
    }

    @Override // com.vivo.push.util.d
    public final String a(String str, String str2) {
        d dVar;
        String str3 = f106701c.get(str);
        return (str3 != null || (dVar = this.f106704f) == null) ? str3 : dVar.a(str, str2);
    }

    public final void a() {
        x xVar = new x();
        if (xVar.a(this.f106703e)) {
            xVar.a();
            p.d("SystemCache", "sp cache is cleared");
        }
    }

    @Override // com.vivo.push.util.d
    public final boolean a(Context context) {
        v vVar = new v();
        this.f106704f = vVar;
        boolean zA = vVar.a(context);
        if (!zA) {
            x xVar = new x();
            this.f106704f = xVar;
            zA = xVar.a(context);
        }
        if (!zA) {
            this.f106704f = null;
        }
        return zA;
    }

    @Override // com.vivo.push.util.d
    public final void b(String str, String str2) {
        d dVar;
        f106701c.put(str, str2);
        if (!this.f106705g || (dVar = this.f106704f) == null) {
            return;
        }
        dVar.b(str, str2);
    }
}
