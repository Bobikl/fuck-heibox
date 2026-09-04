package com.tencent.liteav.txcvodplayer.renderer;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f100173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f100174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f100175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f100176d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WeakReference<View> f100177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f100178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f100179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f100180h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f100181i;

    public b(View view) {
        this.f100177e = new WeakReference<>(view);
    }

    public final void a(int i10, int i11) {
        this.f100178f = i10;
        this.f100179g = i11;
    }

    public final void b(int i10, int i11) {
        this.f100180h = i10;
        this.f100181i = i11;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0073 A[PHI: r6
  0x0073: PHI (r6v1 float) = (r6v0 float), (r6v2 float) binds: [B:30:0x0070, B:26:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    public final void c(int i10, int i11) {
        int i12;
        float f10;
        float f11;
        int i13;
        int i14 = this.f100173a;
        if (i14 == 90 || i14 == 270) {
            i11 = i10;
            i10 = i11;
        }
        int defaultSize = View.getDefaultSize(this.f100178f, i10);
        int defaultSize2 = View.getDefaultSize(this.f100179g, i11);
        if (this.f100176d != 3) {
            if (this.f100178f <= 0 || this.f100179g <= 0) {
                i10 = defaultSize;
                i11 = defaultSize2;
            } else {
                int mode = View.MeasureSpec.getMode(i10);
                i10 = View.MeasureSpec.getSize(i10);
                int mode2 = View.MeasureSpec.getMode(i11);
                i11 = View.MeasureSpec.getSize(i11);
                if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
                    float f12 = i10 / i11;
                    int i15 = this.f100176d;
                    if (i15 == 4) {
                        f10 = 1.7777778f;
                        int i16 = this.f100173a;
                        if (i16 == 90 || i16 == 270) {
                            f11 = 0.5625f;
                        } else {
                            f11 = f10;
                        }
                    } else if (i15 != 5) {
                        f11 = this.f100178f / this.f100179g;
                        int i17 = this.f100180h;
                        if (i17 > 0 && (i13 = this.f100181i) > 0) {
                            f11 = (f11 * i17) / i13;
                        }
                    } else {
                        f10 = 1.3333334f;
                        int i18 = this.f100173a;
                        if (i18 == 90 || i18 == 270) {
                            f11 = 0.75f;
                        } else {
                            f11 = f10;
                        }
                    }
                    boolean z10 = f11 > f12;
                    if (i15 != 0) {
                        if (i15 == 1) {
                            if (z10) {
                                this.f100175c = i11;
                                this.f100174b = (int) (i11 * f11);
                                return;
                            } else {
                                this.f100174b = i10;
                                this.f100175c = (int) (i10 / f11);
                                return;
                            }
                        }
                        if (i15 != 4 && i15 != 5) {
                            if (z10) {
                                int iMin = Math.min(this.f100178f, i10);
                                this.f100174b = iMin;
                                this.f100175c = (int) (iMin / f11);
                                return;
                            } else {
                                int iMin2 = Math.min(this.f100179g, i11);
                                this.f100175c = iMin2;
                                this.f100174b = (int) (iMin2 * f11);
                                return;
                            }
                        }
                    }
                    if (z10) {
                        this.f100174b = i10;
                        this.f100175c = (int) (i10 / f11);
                        return;
                    } else {
                        this.f100175c = i11;
                        this.f100174b = (int) (i11 * f11);
                        return;
                    }
                }
                if (mode == 1073741824 && mode2 == 1073741824) {
                    int i19 = this.f100178f;
                    int i20 = i19 * i11;
                    int i21 = this.f100179g;
                    if (i20 < i10 * i21) {
                        i10 = (i19 * i11) / i21;
                    } else if (i19 * i11 > i10 * i21) {
                        i11 = (i21 * i10) / i19;
                    }
                } else if (mode == 1073741824) {
                    int i22 = (this.f100179g * i10) / this.f100178f;
                    if (mode2 != Integer.MIN_VALUE || i22 <= i11) {
                        i11 = i22;
                    }
                } else if (mode2 == 1073741824) {
                    int i23 = (this.f100178f * i11) / this.f100179g;
                    if (mode != Integer.MIN_VALUE || i23 <= i10) {
                        i10 = i23;
                    }
                } else {
                    int i24 = this.f100178f;
                    int i25 = this.f100179g;
                    if (mode2 != Integer.MIN_VALUE || i25 <= i11) {
                        i12 = i24;
                        i11 = i25;
                    } else {
                        i12 = (i11 * i24) / i25;
                    }
                    if (mode != Integer.MIN_VALUE || i12 <= i10) {
                        i10 = i12;
                    } else {
                        i11 = (i25 * i10) / i24;
                    }
                }
            }
        }
        this.f100174b = i10;
        this.f100175c = i11;
    }
}
