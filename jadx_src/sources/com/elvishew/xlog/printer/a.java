package com.elvishew.xlog.printer;

import android.util.Log;

/* JADX INFO: compiled from: AndroidPrinter.java */
/* JADX INFO: loaded from: classes6.dex */
public class a implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f42913c = 4000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f42914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42915b;

    public a() {
        this(false, 4000);
    }

    public a(int i10) {
        this(false, i10);
    }

    public a(boolean z10) {
        this(z10, 4000);
    }

    public a(boolean z10, int i10) {
        this.f42914a = z10;
        this.f42915b = i10;
    }

    static int b(String str, int i10, int i11) {
        if (i11 == str.length() || str.charAt(i11) == '\n') {
            return i11;
        }
        for (int i12 = i11 - 1; i10 < i12; i12--) {
            if (str.charAt(i12) == '\n') {
                return i12;
            }
        }
        return i11;
    }

    @Override // com.elvishew.xlog.printer.c
    public void a(int i10, String str, String str2) {
        int length = str2.length();
        int i11 = 0;
        while (i11 < length) {
            if (str2.charAt(i11) == '\n') {
                i11++;
            } else {
                int iMin = Math.min(this.f42915b + i11, length);
                if (this.f42914a) {
                    int iIndexOf = str2.indexOf(10, i11);
                    if (iIndexOf != -1) {
                        iMin = iIndexOf;
                    }
                } else {
                    iMin = b(str2, i11, iMin);
                }
                c(i10, str, str2.substring(i11, iMin));
                i11 = iMin;
            }
        }
    }

    void c(int i10, String str, String str2) {
        Log.println(i10, str, str2);
    }
}
