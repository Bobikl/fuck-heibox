package com.airbnb.lottie;

import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import androidx.annotation.p0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: TextDelegate.java */
/* JADX INFO: loaded from: classes6.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f37847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final LottieAnimationView f37848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private final j f37849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f37850d;

    @j1
    v() {
        this.f37847a = new HashMap();
        this.f37850d = true;
        this.f37848b = null;
        this.f37849c = null;
    }

    public v(LottieAnimationView lottieAnimationView) {
        this.f37847a = new HashMap();
        this.f37850d = true;
        this.f37848b = lottieAnimationView;
        this.f37849c = null;
    }

    public v(j jVar) {
        this.f37847a = new HashMap();
        this.f37850d = true;
        this.f37849c = jVar;
        this.f37848b = null;
    }

    private void c() {
        LottieAnimationView lottieAnimationView = this.f37848b;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        j jVar = this.f37849c;
        if (jVar != null) {
            jVar.invalidateSelf();
        }
    }

    public String a(String str) {
        return str;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final String b(String str) {
        if (this.f37850d && this.f37847a.containsKey(str)) {
            return this.f37847a.get(str);
        }
        String strA = a(str);
        if (this.f37850d) {
            this.f37847a.put(str, strA);
        }
        return strA;
    }

    public void d() {
        this.f37847a.clear();
        c();
    }

    public void e(String str) {
        this.f37847a.remove(str);
        c();
    }

    public void f(boolean z10) {
        this.f37850d = z10;
    }

    public void g(String str, String str2) {
        this.f37847a.put(str, str2);
        c();
    }
}
