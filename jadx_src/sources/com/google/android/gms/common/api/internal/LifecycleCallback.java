package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.k0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.p;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public class LifecycleCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    @v8.a
    protected final d f52370a;

    @v8.a
    protected LifecycleCallback(@n0 d dVar) {
        this.f52370a = dVar;
    }

    @n0
    @v8.a
    public static d c(@n0 Activity activity) {
        return e(new c(activity));
    }

    @n0
    @v8.a
    public static d d(@n0 ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    @n0
    @v8.a
    protected static d e(@n0 c cVar) {
        if (cVar.d()) {
            return h.N3(cVar.b());
        }
        if (cVar.c()) {
            return zzb.c(cVar.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static d getChimeraLifecycleFragmentImpl(c cVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    @k0
    @v8.a
    public void a(@n0 String str, @n0 FileDescriptor fileDescriptor, @n0 PrintWriter printWriter, @n0 String[] strArr) {
    }

    @n0
    @v8.a
    public Activity b() {
        Activity activityA1 = this.f52370a.a1();
        p.l(activityA1);
        return activityA1;
    }

    @k0
    @v8.a
    public void f(int i10, int i11, @n0 Intent intent) {
    }

    @k0
    @v8.a
    public void g(@p0 Bundle bundle) {
    }

    @k0
    @v8.a
    public void h() {
    }

    @k0
    @v8.a
    public void i() {
    }

    @k0
    @v8.a
    public void j(@n0 Bundle bundle) {
    }

    @k0
    @v8.a
    public void k() {
    }

    @k0
    @v8.a
    public void l() {
    }
}
