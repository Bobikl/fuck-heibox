package com.google.android.play.core.splitinstall.internal;

import java.io.File;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class b0 implements n {
    b0() {
    }

    @Override // com.google.android.play.core.splitinstall.internal.n
    public final void a(ClassLoader classLoader, Set set) {
        y.c(classLoader, set, new w());
    }

    @Override // com.google.android.play.core.splitinstall.internal.n
    public final boolean b(ClassLoader classLoader, File file, File file2, boolean z10) {
        return y.d(classLoader, file, file2, z10, "zip");
    }
}
