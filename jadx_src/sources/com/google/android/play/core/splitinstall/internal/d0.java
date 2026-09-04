package com.google.android.play.core.splitinstall.internal;

import android.util.Log;
import java.io.File;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class d0 implements r {
    d0() {
    }

    @Override // com.google.android.play.core.splitinstall.internal.r
    public final boolean a(Object obj, File file, File file2) {
        try {
            return !((Boolean) k0.f(Class.forName("dalvik.system.DexFile"), "isDexOptNeeded", Boolean.class, String.class, file.getPath())).booleanValue();
        } catch (ClassNotFoundException unused) {
            Log.e("SplitCompat", "Unexpected missing dalvik.system.DexFile.");
            return false;
        }
    }
}
