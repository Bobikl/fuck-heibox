package androidx.browser.trusted;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: TrustedWebActivityIntentBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f3332i = "androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f3333j = "android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f3334k = "androidx.browser.trusted.extra.SHARE_TARGET";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f3335l = "androidx.browser.trusted.extra.SHARE_DATA";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f3336m = "androidx.browser.trusted.extra.DISPLAY_MODE";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f3337n = "androidx.browser.trusted.extra.SCREEN_ORIENTATION";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final Uri f3338a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private List<String> f3340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private Bundle f3341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private androidx.browser.trusted.sharing.a f3342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private androidx.browser.trusted.sharing.b f3343f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final androidx.browser.customtabs.d.c f3339b = new androidx.browser.customtabs.d.c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    private t f3344g = new t.a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f3345h = 0;

    public v(@n0 Uri uri) {
        this.f3338a = uri;
    }

    @n0
    public u a(@n0 androidx.browser.customtabs.g gVar) {
        if (gVar == null) {
            throw new NullPointerException("CustomTabsSession is required for launching a TWA");
        }
        this.f3339b.x(gVar);
        Intent intent = this.f3339b.d().f3223a;
        intent.setData(this.f3338a);
        intent.putExtra(androidx.browser.customtabs.k.f3257a, true);
        if (this.f3340c != null) {
            intent.putExtra(f3333j, new ArrayList(this.f3340c));
        }
        Bundle bundle = this.f3341d;
        if (bundle != null) {
            intent.putExtra(f3332i, bundle);
        }
        List<Uri> listEmptyList = Collections.emptyList();
        androidx.browser.trusted.sharing.b bVar = this.f3343f;
        if (bVar != null && this.f3342e != null) {
            intent.putExtra(f3334k, bVar.b());
            intent.putExtra(f3335l, this.f3342e.b());
            List<Uri> list = this.f3342e.f3300c;
            if (list != null) {
                listEmptyList = list;
            }
        }
        intent.putExtra(f3336m, this.f3344g.a());
        intent.putExtra(f3337n, this.f3345h);
        return new u(intent, listEmptyList);
    }

    @n0
    public androidx.browser.customtabs.d b() {
        return this.f3339b.d();
    }

    @n0
    public t c() {
        return this.f3344g;
    }

    @n0
    public Uri d() {
        return this.f3338a;
    }

    @n0
    public v e(@n0 List<String> list) {
        this.f3340c = list;
        return this;
    }

    @n0
    public v f(int i10) {
        this.f3339b.j(i10);
        return this;
    }

    @n0
    public v g(int i10, @n0 androidx.browser.customtabs.a aVar) {
        this.f3339b.k(i10, aVar);
        return this;
    }

    @n0
    public v h(@n0 androidx.browser.customtabs.a aVar) {
        this.f3339b.m(aVar);
        return this;
    }

    @n0
    public v i(@n0 t tVar) {
        this.f3344g = tVar;
        return this;
    }

    @n0
    public v j(@androidx.annotation.l int i10) {
        this.f3339b.s(i10);
        return this;
    }

    @n0
    public v k(@androidx.annotation.l int i10) {
        this.f3339b.t(i10);
        return this;
    }

    @n0
    public v l(int i10) {
        this.f3345h = i10;
        return this;
    }

    @n0
    public v m(@n0 androidx.browser.trusted.sharing.b bVar, @n0 androidx.browser.trusted.sharing.a aVar) {
        this.f3343f = bVar;
        this.f3342e = aVar;
        return this;
    }

    @n0
    public v n(@n0 Bundle bundle) {
        this.f3341d = bundle;
        return this;
    }

    @n0
    public v o(@androidx.annotation.l int i10) {
        this.f3339b.C(i10);
        return this;
    }
}
