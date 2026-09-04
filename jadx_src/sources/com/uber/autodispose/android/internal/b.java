package com.uber.autodispose.android.internal;

import android.os.Looper;
import androidx.annotation.RestrictTo;
import kh.e;

/* JADX INFO: compiled from: AutoDisposeAndroidUtil.java */
/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e f104065a = new e() { // from class: com.uber.autodispose.android.internal.a
        @Override // kh.e
        public final boolean a() {
            return b.c();
        }
    };

    private b() {
    }

    public static boolean b() {
        return com.uber.autodispose.android.a.c(f104065a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean c() throws Exception {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
