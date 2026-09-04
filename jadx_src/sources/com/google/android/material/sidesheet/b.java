package com.google.android.material.sidesheet;

import androidx.annotation.RestrictTo;
import com.google.android.material.sidesheet.c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: Sheet.java */
/* JADX INFO: loaded from: classes7.dex */
public interface b<C extends com.google.android.material.sidesheet.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f55242a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f55243b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f55244c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f55245d = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f55246e = 0;

    /* JADX INFO: compiled from: Sheet.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface a {
    }

    /* JADX INFO: renamed from: com.google.android.material.sidesheet.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Sheet.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface InterfaceC0430b {
    }

    /* JADX INFO: compiled from: Sheet.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface c {
    }

    void a(C c10);

    void b(C c10);

    void c(int i10);

    int getState();
}
