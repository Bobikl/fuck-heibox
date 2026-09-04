package com.google.android.material.color;

import android.os.Build;
import androidx.annotation.p0;

/* JADX INFO: compiled from: ColorResourcesOverride.java */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c {
    @p0
    public static d a() {
        int i10 = Build.VERSION.SDK_INT;
        if ((30 > i10 || i10 > 33) && !androidx.core.os.a.l()) {
            return null;
        }
        return n.c();
    }
}
