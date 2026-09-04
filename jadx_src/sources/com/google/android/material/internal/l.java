package com.google.android.material.internal;

import android.os.Build;
import androidx.annotation.RestrictTo;
import java.util.Locale;

/* JADX INFO: compiled from: ManufacturerUtils.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f54527a = "lge";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f54528b = "samsung";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f54529c = "meizu";

    private l() {
    }

    public static boolean a() {
        return b() || d();
    }

    public static boolean b() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(f54527a);
    }

    public static boolean c() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu");
    }

    public static boolean d() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(f54528b);
    }
}
