package com.google.common.util.concurrent;

import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Platform.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@o9.b(emulated = true)
public final class d1 {
    private d1() {
    }

    static boolean a(@CheckForNull Throwable th2, Class<? extends Throwable> cls) {
        return cls.isInstance(th2);
    }
}
