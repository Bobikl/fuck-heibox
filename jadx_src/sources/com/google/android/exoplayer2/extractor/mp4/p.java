package com.google.android.exoplayer2.extractor.mp4;

import androidx.annotation.p0;
import com.google.android.exoplayer2.extractor.e0;
import com.google.android.exoplayer2.util.u;

/* JADX INFO: compiled from: TrackEncryptionBox.java */
/* JADX INFO: loaded from: classes7.dex */
public final class p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f45563f = "TrackEncryptionBox";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f45564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final String f45565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0.a f45566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f45567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    public final byte[] f45568e;

    public p(boolean z10, @p0 String str, int i10, byte[] bArr, int i11, int i12, @p0 byte[] bArr2) {
        com.google.android.exoplayer2.util.a.a((bArr2 == null) ^ (i10 == 0));
        this.f45564a = z10;
        this.f45565b = str;
        this.f45567d = i10;
        this.f45568e = bArr2;
        this.f45566c = new e0.a(a(str), bArr, i11, i12);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int a(@p0 String str) {
        if (str == null) {
            return 1;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(com.google.android.exoplayer2.j.R1)) {
                    b10 = 0;
                }
                break;
            case 3046671:
                if (str.equals(com.google.android.exoplayer2.j.T1)) {
                    b10 = 1;
                }
                break;
            case 3049879:
                if (str.equals(com.google.android.exoplayer2.j.Q1)) {
                    b10 = 2;
                }
                break;
            case 3049895:
                if (str.equals(com.google.android.exoplayer2.j.S1)) {
                    b10 = 3;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 1:
                return 2;
            default:
                StringBuilder sb2 = new StringBuilder(str.length() + 68);
                sb2.append("Unsupported protection scheme type '");
                sb2.append(str);
                sb2.append("'. Assuming AES-CTR crypto mode.");
                u.m(f45563f, sb2.toString());
            case 2:
            case 3:
                return 1;
        }
    }
}
