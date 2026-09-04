package com.google.android.gms.internal.common;

import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class d0 extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final CharSequence f52713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final v f52714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f52715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f52716g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f52717h = Integer.MAX_VALUE;

    protected d0(e0 e0Var, CharSequence charSequence) {
        this.f52714e = e0Var.f52719a;
        this.f52715f = e0Var.f52720b;
        this.f52713d = charSequence;
    }

    @Override // com.google.android.gms.internal.common.q
    @CheckForNull
    protected final /* bridge */ /* synthetic */ Object a() {
        int iC;
        int i10 = this.f52716g;
        while (true) {
            int i11 = this.f52716g;
            if (i11 == -1) {
                b();
                return null;
            }
            int iD = d(i11);
            if (iD == -1) {
                iD = this.f52713d.length();
                this.f52716g = -1;
                iC = -1;
            } else {
                iC = c(iD);
                this.f52716g = iC;
            }
            if (iC == i10) {
                int i12 = iC + 1;
                this.f52716g = i12;
                if (i12 > this.f52713d.length()) {
                    this.f52716g = -1;
                }
            } else {
                if (i10 < iD) {
                    this.f52713d.charAt(i10);
                }
                if (i10 < iD) {
                    this.f52713d.charAt(iD - 1);
                }
                if (!this.f52715f || i10 != iD) {
                    int i13 = this.f52717h;
                    if (i13 == 1) {
                        iD = this.f52713d.length();
                        this.f52716g = -1;
                        if (iD > i10) {
                            this.f52713d.charAt(iD - 1);
                        }
                    } else {
                        this.f52717h = i13 - 1;
                    }
                    return this.f52713d.subSequence(i10, iD).toString();
                }
                i10 = this.f52716g;
            }
        }
    }

    abstract int c(int i10);

    abstract int d(int i10);
}
