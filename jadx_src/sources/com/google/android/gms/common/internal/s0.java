package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class s0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Uri f52549f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private final String f52550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private final String f52551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private final ComponentName f52552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f52553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f52554e;

    public s0(ComponentName componentName, int i10) {
        this.f52550a = null;
        this.f52551b = null;
        p.l(componentName);
        this.f52552c = componentName;
        this.f52553d = i10;
        this.f52554e = false;
    }

    public s0(String str, int i10, boolean z10) {
        this(str, "com.google.android.gms", i10, false);
    }

    public s0(String str, String str2, int i10, boolean z10) {
        p.h(str);
        this.f52550a = str;
        p.h(str2);
        this.f52551b = str2;
        this.f52552c = null;
        this.f52553d = i10;
        this.f52554e = z10;
    }

    public final int a() {
        return this.f52553d;
    }

    @androidx.annotation.p0
    public final ComponentName b() {
        return this.f52552c;
    }

    public final Intent c(Context context) {
        Bundle bundleCall;
        if (this.f52550a == null) {
            return new Intent().setComponent(this.f52552c);
        }
        Intent intent = null;
        if (this.f52554e) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", this.f52550a);
            try {
                bundleCall = context.getContentResolver().call(f52549f, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e10) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e10.toString()));
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f52550a)));
            }
        }
        return intent != null ? intent : new Intent(this.f52550a).setPackage(this.f52551b);
    }

    @androidx.annotation.p0
    public final String d() {
        return this.f52551b;
    }

    public final boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return o.b(this.f52550a, s0Var.f52550a) && o.b(this.f52551b, s0Var.f52551b) && o.b(this.f52552c, s0Var.f52552c) && this.f52553d == s0Var.f52553d && this.f52554e == s0Var.f52554e;
    }

    public final int hashCode() {
        return o.c(this.f52550a, this.f52551b, this.f52552c, Integer.valueOf(this.f52553d), Boolean.valueOf(this.f52554e));
    }

    public final String toString() {
        String str = this.f52550a;
        if (str != null) {
            return str;
        }
        p.l(this.f52552c);
        return this.f52552c.flattenToString();
    }
}
