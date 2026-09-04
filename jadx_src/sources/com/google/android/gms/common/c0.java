package com.google.android.gms.common;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class c0 extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f52401c;

    c0(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f52401c = bArr;
    }

    @Override // com.google.android.gms.common.b0
    final byte[] f1() {
        return this.f52401c;
    }
}
