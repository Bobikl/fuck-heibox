package com.google.android.play.core.splitinstall.internal;

import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import java.io.File;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class e0 implements n {
    e0() {
    }

    static void c(ClassLoader classLoader, Set set) {
        y.c(classLoader, set, new c0());
    }

    static boolean d(ClassLoader classLoader, File file, File file2, boolean z10) {
        return t.e(classLoader, file, file2, z10, new v(), FlutterActivityLaunchConfigs.EXTRA_PATH, new d0());
    }

    @Override // com.google.android.play.core.splitinstall.internal.n
    public final void a(ClassLoader classLoader, Set set) {
        c(classLoader, set);
    }

    @Override // com.google.android.play.core.splitinstall.internal.n
    public final boolean b(ClassLoader classLoader, File file, File file2, boolean z10) {
        return d(classLoader, file, file2, z10);
    }
}
