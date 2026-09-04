package com.bytedance.sdk.open.tt;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.sdk.open.aweme.authorize.model.Authorization;
import com.bytedance.sdk.open.douyin.model.OpenRecord;
import com.bytedance.sdk.open.douyin.ui.DouYinWebAuthorizeActivity;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p7.g;

/* JADX INFO: loaded from: classes6.dex */
public class f implements q7.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f42285i = "DouYinOpenApiImpl";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f42286j = "douyinapi.DouYinEntryActivity";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f42287k = "share.SystemShareActivity";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f42288l = "openability.CommonAbilityActivity";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f42289m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f42290n = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Integer, j7.b> f42291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f42292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p7.f f42293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m7.d f42294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g7.a f42295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e f42296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final WeakReference<Activity> f42297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private l7.c f42298h;

    public f(Activity activity, String str) {
        HashMap map = new HashMap(2);
        this.f42291a = map;
        Context applicationContext = activity.getApplicationContext();
        this.f42297g = new WeakReference<>(activity);
        this.f42294d = new m7.d(applicationContext, str);
        this.f42295e = new g7.a(str);
        this.f42292b = new g(str);
        this.f42293c = new p7.f(str);
        this.f42298h = new l7.c(applicationContext, str);
        this.f42296f = new e(applicationContext);
        map.put(1, new h7.a());
        map.put(2, new m7.c());
    }

    private boolean n(Authorization.Request request) {
        return this.f42295e.b(this.f42297g.get(), DouYinWebAuthorizeActivity.class, request);
    }

    @Override // q7.a
    public boolean a() {
        return this.f42296f.i();
    }

    @Override // q7.a
    public boolean b(m7.b.a aVar) {
        if (aVar != null && this.f42296f.isAppSupportShare()) {
            return this.f42294d.c(this.f42297g.get(), f42286j, this.f42296f.getPackageName(), f42287k, aVar, this.f42296f.getRemoteAuthEntryActivity(), p7.e.f138175e, "0.1.9.0");
        }
        return false;
    }

    @Override // q7.a
    public boolean c(int i10) {
        return this.f42296f.b(i10);
    }

    @Override // q7.a
    public boolean d() {
        return this.f42296f.f();
    }

    @Override // q7.a
    public boolean e(l7.a.C1198a c1198a) {
        if (c1198a == null) {
            return false;
        }
        if (this.f42296f.b(c1198a.f130902b)) {
            return this.f42298h.a(this.f42297g.get(), f42286j, this.f42296f.getPackageName(), f42288l, c1198a, p7.e.f138175e, "0.1.9.0");
        }
        return false;
    }

    @Override // q7.a
    public boolean f(p7.c.a aVar) {
        if (!this.f42296f.i()) {
            return false;
        }
        this.f42292b.a(this.f42297g.get(), f42286j, this.f42296f.getPackageName(), "openshare.ShareToContactsActivity", aVar);
        return true;
    }

    @Override // q7.a
    public boolean g() {
        return this.f42296f.g();
    }

    @Override // q7.a
    public boolean h() {
        return this.f42296f.e();
    }

    @Override // q7.a
    public boolean i() {
        return this.f42296f.j();
    }

    @Override // q7.a
    public boolean isAppInstalled() {
        return this.f42296f.isAppInstalled();
    }

    @Override // q7.a
    public boolean isAppSupportAuthorization() {
        return this.f42296f.isAppSupportAuthorization();
    }

    @Override // q7.a
    public boolean isAppSupportShare() {
        return this.f42296f.isAppSupportShare();
    }

    @Override // q7.a
    public boolean j() {
        return this.f42296f.c();
    }

    @Override // q7.a
    public boolean k(Authorization.Request request) {
        if (request == null) {
            return false;
        }
        return this.f42296f.isAppSupportAuthorization() ? this.f42295e.a(this.f42297g.get(), request, this.f42296f.getPackageName(), this.f42296f.getRemoteAuthEntryActivity(), f42286j, p7.e.f138175e, "0.1.9.0") : n(request);
    }

    @Override // q7.a
    public boolean l(OpenRecord.Request request) {
        if (!this.f42296f.g()) {
            return false;
        }
        this.f42293c.a(this.f42297g.get(), f42286j, this.f42296f.getPackageName(), "opensdk.OpenCameraActivity", request, p7.e.f138175e, "0.1.9.0");
        return true;
    }

    @Override // q7.a
    public boolean m(Intent intent, j7.a aVar) {
        if (aVar == null) {
            return false;
        }
        if (intent == null) {
            aVar.b(intent);
            return false;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            aVar.b(intent);
            return false;
        }
        int i10 = extras.getInt(i7.a.b.f119252a);
        if (i10 == 0) {
            i10 = extras.getInt(i7.a.f.f119293j);
        }
        switch (i10) {
            case 1:
            case 2:
                return this.f42291a.get(1).a(i10, extras, aVar);
            case 3:
            case 4:
                return this.f42291a.get(2).a(i10, extras, aVar);
            case 5:
            case 6:
                return new d().a(i10, extras, aVar);
            case 7:
            case 8:
                return new c().a(i10, extras, aVar);
            default:
                n7.b.e(f42285i, "handleIntent: unknown type " + i10);
                return this.f42291a.get(1).a(i10, extras, aVar);
        }
    }
}
