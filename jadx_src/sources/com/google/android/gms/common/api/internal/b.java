package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.constraintlayout.core.motion.utils.w;
import com.google.android.gms.common.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.u;
import javax.annotation.concurrent.GuardedBy;
import z8.d0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
@Deprecated
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f52376e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @GuardedBy("sLock")
    @p0
    private static b f52377f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final String f52378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Status f52379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f52380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f52381d;

    @v8.a
    @d0
    b(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", w.b.f17892b, resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue));
        boolean z10 = true;
        if (identifier != 0) {
            int integer = resources.getInteger(identifier);
            boolean z11 = integer == 0;
            z10 = integer != 0;
            this.f52381d = z11;
        } else {
            this.f52381d = false;
        }
        this.f52380c = z10;
        String strB = com.google.android.gms.common.internal.d0.b(context);
        strB = strB == null ? new u(context).a("google_app_id") : strB;
        if (TextUtils.isEmpty(strB)) {
            this.f52379b = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f52378a = null;
        } else {
            this.f52378a = strB;
            this.f52379b = Status.f52335h;
        }
    }

    @v8.a
    @d0
    b(String str, boolean z10) {
        this.f52378a = str;
        this.f52379b = Status.f52335h;
        this.f52380c = z10;
        this.f52381d = !z10;
    }

    @v8.a
    private static b b(String str) {
        b bVar;
        synchronized (f52376e) {
            bVar = f52377f;
            if (bVar == null) {
                throw new IllegalStateException("Initialize must be called before " + str + ".");
            }
        }
        return bVar;
    }

    @v8.a
    @d0
    static void c() {
        synchronized (f52376e) {
            f52377f = null;
        }
    }

    @v8.a
    @p0
    public static String d() {
        return b("getGoogleAppId").f52378a;
    }

    @n0
    @v8.a
    public static Status e(@n0 Context context) {
        Status status;
        p.m(context, "Context must not be null.");
        synchronized (f52376e) {
            if (f52377f == null) {
                f52377f = new b(context);
            }
            status = f52377f.f52379b;
        }
        return status;
    }

    @n0
    @v8.a
    public static Status f(@n0 Context context, @n0 String str, boolean z10) {
        p.m(context, "Context must not be null.");
        p.i(str, "App ID must be nonempty.");
        synchronized (f52376e) {
            b bVar = f52377f;
            if (bVar != null) {
                return bVar.a(str);
            }
            b bVar2 = new b(str, z10);
            f52377f = bVar2;
            return bVar2.f52379b;
        }
    }

    @v8.a
    public static boolean g() {
        b bVarB = b("isMeasurementEnabled");
        return bVarB.f52379b.l() && bVarB.f52380c;
    }

    @v8.a
    public static boolean h() {
        return b("isMeasurementExplicitlyDisabled").f52381d;
    }

    @v8.a
    @d0
    Status a(String str) {
        String str2 = this.f52378a;
        if (str2 == null || str2.equals(str)) {
            return Status.f52335h;
        }
        return new Status(10, "Initialize was called with two different Google App IDs.  Only the first app ID will be used: '" + this.f52378a + "'.");
    }
}
