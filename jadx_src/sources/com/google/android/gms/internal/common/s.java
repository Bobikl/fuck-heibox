package com.google.android.gms.internal.common;

import com.tencent.qcloud.core.util.IOUtils;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class s extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f52730a;

    s(char c10) {
        this.f52730a = c10;
    }

    @Override // com.google.android.gms.internal.common.v
    public final boolean a(char c10) {
        return c10 == this.f52730a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CharMatcher.is('");
        int i10 = this.f52730a;
        char[] cArr = {IOUtils.DIR_SEPARATOR_WINDOWS, 'u', 0, 0, 0, 0};
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(i10 & 15);
            i10 >>= 4;
        }
        sb2.append(String.copyValueOf(cArr));
        sb2.append("')");
        return sb2.toString();
    }
}
