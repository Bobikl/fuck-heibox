package com.uber.autodispose;

/* JADX INFO: compiled from: AutoDisposeUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public final class n {
    private n() {
        throw new InstantiationError();
    }

    static <T> T a(@jh.f T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }
}
