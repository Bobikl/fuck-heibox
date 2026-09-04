package com.google.android.exoplayer2.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.d1;
import java.util.List;

/* JADX INFO: compiled from: DownloadNotificationHelper.java */
/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d1
    private static final int f50733b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.core.app.o0.n f50734a;

    public j(Context context, String str) {
        this.f50734a = new androidx.core.app.o0.n(context.getApplicationContext(), str);
    }

    private Notification c(Context context, @androidx.annotation.v int i10, @androidx.annotation.p0 PendingIntent pendingIntent, @androidx.annotation.p0 String str, @d1 int i11) {
        return d(context, i10, pendingIntent, str, i11, 0, 0, false, false, true);
    }

    private Notification d(Context context, @androidx.annotation.v int i10, @androidx.annotation.p0 PendingIntent pendingIntent, @androidx.annotation.p0 String str, @d1 int i11, int i12, int i13, boolean z10, boolean z11, boolean z12) {
        this.f50734a.t0(i10);
        this.f50734a.P(i11 == 0 ? null : context.getResources().getString(i11));
        this.f50734a.N(pendingIntent);
        this.f50734a.z0(str != null ? new androidx.core.app.o0.l().A(str) : null);
        this.f50734a.l0(i12, i13, z10);
        this.f50734a.i0(z11);
        this.f50734a.r0(z12);
        return this.f50734a.h();
    }

    public Notification a(Context context, @androidx.annotation.v int i10, @androidx.annotation.p0 PendingIntent pendingIntent, @androidx.annotation.p0 String str) {
        return c(context, i10, pendingIntent, str, com.google.android.exoplayer2.core.R.string.exo_download_completed);
    }

    public Notification b(Context context, @androidx.annotation.v int i10, @androidx.annotation.p0 PendingIntent pendingIntent, @androidx.annotation.p0 String str) {
        return c(context, i10, pendingIntent, str, com.google.android.exoplayer2.core.R.string.exo_download_failed);
    }

    @Deprecated
    public Notification e(Context context, @androidx.annotation.v int i10, @androidx.annotation.p0 PendingIntent pendingIntent, @androidx.annotation.p0 String str, List<com.google.android.exoplayer2.offline.e> list) {
        return f(context, i10, pendingIntent, str, list, 0);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    public Notification f(Context context, @androidx.annotation.v int i10, @androidx.annotation.p0 PendingIntent pendingIntent, @androidx.annotation.p0 String str, List<com.google.android.exoplayer2.offline.e> list, int i11) {
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z11;
        float fB;
        boolean z12;
        float f10 = 0.0f;
        boolean z13 = true;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        int i16 = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            com.google.android.exoplayer2.offline.e eVar = list.get(i17);
            int i18 = eVar.f47236b;
            if (i18 == 0) {
                z15 = true;
            } else if (i18 == 2) {
                fB = eVar.b();
                if (fB != -1.0f) {
                    f10 += fB;
                    z13 = false;
                }
                if (eVar.a() > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z16 |= z12;
                i16++;
                z14 = true;
            } else if (i18 == 5) {
                z17 = true;
            } else if (i18 == 7) {
                fB = eVar.b();
                if (fB != -1.0f) {
                    f10 += fB;
                    z13 = false;
                }
                if (eVar.a() > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z16 |= z12;
                i16++;
                z14 = true;
            }
        }
        if (!z14) {
            if (z15 && i11 != 0) {
                i12 = (i11 & 2) != 0 ? com.google.android.exoplayer2.core.R.string.exo_download_paused_for_wifi : (i11 & 1) != 0 ? com.google.android.exoplayer2.core.R.string.exo_download_paused_for_network : com.google.android.exoplayer2.core.R.string.exo_download_paused;
                z10 = false;
            } else if (z17) {
                i13 = com.google.android.exoplayer2.core.R.string.exo_download_removing;
            } else {
                z10 = true;
                i12 = 0;
            }
            if (z10) {
                if (z14) {
                    int i19 = (int) (f10 / i16);
                    z11 = !z13 && z16;
                    i15 = i19;
                } else {
                    z11 = true;
                    i15 = 0;
                }
                i14 = 100;
            } else {
                i14 = 0;
                i15 = 0;
                z11 = false;
            }
            return d(context, i10, pendingIntent, str, i12, i14, i15, z11, true, false);
        }
        i13 = com.google.android.exoplayer2.core.R.string.exo_download_downloading;
        i12 = i13;
        z10 = true;
        if (z10) {
            if (z14) {
                int i110 = (int) (f10 / i16);
                z11 = !z13 && z16;
                i15 = i110;
            } else {
                z11 = true;
                i15 = 0;
            }
            i14 = 100;
        } else {
            i14 = 0;
            i15 = 0;
            z11 = false;
        }
        return d(context, i10, pendingIntent, str, i12, i14, i15, z11, true, false);
    }
}
