package com.google.android.play.core.splitinstall.internal;

import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import java.io.File;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class h0 implements n {
    h0() {
    }

    @Override // com.google.android.play.core.splitinstall.internal.n
    public final void a(ClassLoader classLoader, Set set) {
        e0.c(classLoader, set);
    }

    @Override // com.google.android.play.core.splitinstall.internal.n
    public final boolean b(ClassLoader classLoader, File file, File file2, boolean z10) {
        return t.e(classLoader, file, file2, z10, new v(), FlutterActivityLaunchConfigs.EXTRA_PATH, new g0());
    }
}
