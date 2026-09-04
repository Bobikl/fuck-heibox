package com.google.common.io;

import java.io.IOException;

/* JADX INFO: compiled from: LineBuffer.java */
/* JADX INFO: loaded from: classes7.dex */
@p
@o9.c
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private StringBuilder f58712a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f58713b;

    t() {
    }

    @s9.a
    private boolean c(boolean z10) throws IOException {
        String str;
        if (this.f58713b) {
            str = z10 ? "\r\n" : "\r";
        } else {
            str = z10 ? "\n" : "";
        }
        d(this.f58712a.toString(), str);
        this.f58712a = new StringBuilder();
        this.f58713b = false;
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001a  */
    protected void a(char[] cArr, int i10, int i11) throws IOException {
        int i12;
        if (!this.f58713b || i11 <= 0) {
            i12 = i10;
        } else {
            if (c(cArr[i10] == '\n')) {
                i12 = i10 + 1;
            } else {
                i12 = i10;
            }
        }
        int i13 = i10 + i11;
        int i14 = i12;
        while (i12 < i13) {
            char c10 = cArr[i12];
            if (c10 != '\n') {
                if (c10 == '\r') {
                    this.f58712a.append(cArr, i14, i12 - i14);
                    this.f58713b = true;
                    int i15 = i12 + 1;
                    if (i15 < i13) {
                        if (c(cArr[i15] == '\n')) {
                            i12 = i15;
                        }
                    }
                }
                i12++;
            } else {
                this.f58712a.append(cArr, i14, i12 - i14);
                c(true);
            }
            i14 = i12 + 1;
            i12++;
        }
        this.f58712a.append(cArr, i14, i13 - i14);
    }

    protected void b() throws IOException {
        if (this.f58713b || this.f58712a.length() > 0) {
            c(false);
        }
    }

    protected abstract void d(String str, String str2) throws IOException;
}
