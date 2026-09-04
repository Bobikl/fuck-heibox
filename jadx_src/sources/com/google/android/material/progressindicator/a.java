package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.provider.Settings;
import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import androidx.annotation.n0;

/* JADX INFO: compiled from: AnimatorDurationScaleProvider.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static float f54739a = 1.0f;

    @j1
    public static void b(float f10) {
        f54739a = f10;
    }

    public float a(@n0 ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}
