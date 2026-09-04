package com.google.android.play.core.splitinstall.internal;

import java.io.File;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class q implements r {
    q() {
    }

    @Override // com.google.android.play.core.splitinstall.internal.r
    public final boolean a(Object obj, File file, File file2) {
        return new File((String) k0.g(obj.getClass(), "optimizedPathFor", String.class, File.class, file, File.class, file2)).exists();
    }
}
