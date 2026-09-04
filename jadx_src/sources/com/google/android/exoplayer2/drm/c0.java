package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.util.u0;
import java.util.UUID;

/* JADX INFO: compiled from: FrameworkCryptoConfig.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c0 implements com.google.android.exoplayer2.decoder.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f44694d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f44695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f44696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f44697c;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z10;
        if ("Amazon".equals(u0.f51538c)) {
            String str = u0.f51539d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        f44694d = z10;
    }

    public c0(UUID uuid, byte[] bArr, boolean z10) {
        this.f44695a = uuid;
        this.f44696b = bArr;
        this.f44697c = z10;
    }
}
