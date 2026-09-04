package com.google.common.primitives;

/* JADX INFO: compiled from: ParseRequest.java */
/* JADX INFO: loaded from: classes7.dex */
@b
@o9.b
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f59088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f59089b;

    private f(String str, int i10) {
        this.f59088a = str;
        this.f59089b = i10;
    }

    static f a(String str) {
        if (str.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        char cCharAt = str.charAt(0);
        int i10 = 16;
        if (str.startsWith("0x") || str.startsWith("0X")) {
            str = str.substring(2);
        } else if (cCharAt == '#') {
            str = str.substring(1);
        } else if (cCharAt != '0' || str.length() <= 1) {
            i10 = 10;
        } else {
            str = str.substring(1);
            i10 = 8;
        }
        return new f(str, i10);
    }
}
