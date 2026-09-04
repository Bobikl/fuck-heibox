package com.google.android.play.core.splitinstall;

import android.app.PendingIntent;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class h extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f56241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f56242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f56243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f56244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f56245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f56246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f56247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final PendingIntent f56248h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f56249i;

    h(int i10, int i11, int i12, long j10, long j11, @androidx.annotation.p0 List list, @androidx.annotation.p0 List list2, @androidx.annotation.p0 PendingIntent pendingIntent, @androidx.annotation.p0 List list3) {
        this.f56241a = i10;
        this.f56242b = i11;
        this.f56243c = i12;
        this.f56244d = j10;
        this.f56245e = j11;
        this.f56246f = list;
        this.f56247g = list2;
        this.f56248h = pendingIntent;
        this.f56249i = list3;
    }

    @Override // com.google.android.play.core.splitinstall.f
    public final long a() {
        return this.f56244d;
    }

    @Override // com.google.android.play.core.splitinstall.f
    @l9.a
    public final int c() {
        return this.f56243c;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        PendingIntent pendingIntent;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f56241a == fVar.h() && this.f56242b == fVar.i() && this.f56243c == fVar.c() && this.f56244d == fVar.a() && this.f56245e == fVar.j() && ((list = this.f56246f) != null ? list.equals(fVar.l()) : fVar.l() == null) && ((list2 = this.f56247g) != null ? list2.equals(fVar.k()) : fVar.k() == null) && ((pendingIntent = this.f56248h) != null ? pendingIntent.equals(fVar.g()) : fVar.g() == null) && ((list3 = this.f56249i) != null ? list3.equals(fVar.m()) : fVar.m() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.splitinstall.f
    @androidx.annotation.p0
    @Deprecated
    public final PendingIntent g() {
        return this.f56248h;
    }

    @Override // com.google.android.play.core.splitinstall.f
    public final int h() {
        return this.f56241a;
    }

    public final int hashCode() {
        int i10 = ((((this.f56241a ^ 1000003) * 1000003) ^ this.f56242b) * 1000003) ^ this.f56243c;
        long j10 = this.f56244d;
        long j11 = j10 ^ (j10 >>> 32);
        long j12 = this.f56245e;
        long j13 = (j12 >>> 32) ^ j12;
        List list = this.f56246f;
        int iHashCode = ((((((i10 * 1000003) ^ ((int) j11)) * 1000003) ^ ((int) j13)) * 1000003) ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f56247g;
        int iHashCode2 = (iHashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.f56248h;
        int iHashCode3 = (iHashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List list3 = this.f56249i;
        return iHashCode3 ^ (list3 != null ? list3.hashCode() : 0);
    }

    @Override // com.google.android.play.core.splitinstall.f
    @l9.b
    public final int i() {
        return this.f56242b;
    }

    @Override // com.google.android.play.core.splitinstall.f
    public final long j() {
        return this.f56245e;
    }

    @Override // com.google.android.play.core.splitinstall.f
    @androidx.annotation.p0
    final List k() {
        return this.f56247g;
    }

    @Override // com.google.android.play.core.splitinstall.f
    @androidx.annotation.p0
    final List l() {
        return this.f56246f;
    }

    @Override // com.google.android.play.core.splitinstall.f
    @androidx.annotation.p0
    final List m() {
        return this.f56249i;
    }

    public final String toString() {
        return "SplitInstallSessionState{sessionId=" + this.f56241a + ", status=" + this.f56242b + ", errorCode=" + this.f56243c + ", bytesDownloaded=" + this.f56244d + ", totalBytesToDownload=" + this.f56245e + ", moduleNamesNullable=" + String.valueOf(this.f56246f) + ", languagesNullable=" + String.valueOf(this.f56247g) + ", resolutionIntent=" + String.valueOf(this.f56248h) + ", splitFileIntents=" + String.valueOf(this.f56249i) + z5.g.f141884d;
    }
}
