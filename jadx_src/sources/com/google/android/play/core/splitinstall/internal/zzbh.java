package com.google.android.play.core.splitinstall.internal;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzbh extends RuntimeException {
    public zzbh(String str) {
        super(str);
    }

    public zzbh(String str, Throwable th2) {
        super("Failed to initialize FileStorage", th2);
    }
}
