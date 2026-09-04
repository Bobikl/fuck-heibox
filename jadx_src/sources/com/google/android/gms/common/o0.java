package com.google.android.gms.common;

import androidx.annotation.p0;
import com.google.android.gms.internal.common.zzag;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private String f52615a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f52616b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private zzag f52617c = zzag.s();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private zzag f52618d = zzag.s();

    o0() {
    }

    @s9.a
    final o0 a(long j10) {
        this.f52616b = j10;
        return this;
    }

    @s9.a
    final o0 b(List list) {
        com.google.android.gms.common.internal.p.l(list);
        this.f52618d = zzag.q(list);
        return this;
    }

    @s9.a
    final o0 c(List list) {
        com.google.android.gms.common.internal.p.l(list);
        this.f52617c = zzag.q(list);
        return this;
    }

    @s9.a
    final o0 d(String str) {
        this.f52615a = str;
        return this;
    }

    final p e() {
        if (this.f52615a == null) {
            throw new IllegalStateException("packageName must be defined");
        }
        if (this.f52616b < 0) {
            throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        }
        if (this.f52617c.isEmpty() && this.f52618d.isEmpty()) {
            throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
        return new p(this.f52615a, this.f52616b, this.f52617c, this.f52618d, null);
    }
}
