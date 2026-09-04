package com.google.android.exoplayer2.drm;

import android.net.Uri;
import androidx.annotation.w0;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.util.u0;
import com.google.common.collect.b3;
import com.google.common.primitives.Ints;
import java.util.Map;

/* JADX INFO: compiled from: DefaultDrmSessionManagerProvider.java */
/* JADX INFO: loaded from: classes7.dex */
public final class j implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f44710a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.b0("lock")
    private i2.f f44711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.b0("lock")
    private u f44712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private HttpDataSource.b f44713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private String f44714e;

    @w0(18)
    private u b(i2.f fVar) {
        HttpDataSource.b bVarK = this.f44713d;
        if (bVarK == null) {
            bVarK = new com.google.android.exoplayer2.upstream.x.b().k(this.f44714e);
        }
        Uri uri = fVar.f46311c;
        k0 k0Var = new k0(uri == null ? null : uri.toString(), fVar.f46316h, bVarK);
        b3<Map.Entry<String, String>> it = fVar.f46313e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            k0Var.g(next.getKey(), next.getValue());
        }
        DefaultDrmSessionManager defaultDrmSessionManagerA = new DefaultDrmSessionManager.b().h(fVar.f46309a, j0.f44716k).d(fVar.f46314f).e(fVar.f46315g).g(Ints.B(fVar.f46318j)).a(k0Var);
        defaultDrmSessionManagerA.D(0, fVar.c());
        return defaultDrmSessionManagerA;
    }

    @Override // com.google.android.exoplayer2.drm.x
    public u a(i2 i2Var) {
        u uVar;
        com.google.android.exoplayer2.util.a.g(i2Var.f46269c);
        i2.f fVar = i2Var.f46269c.f46347c;
        if (fVar == null || u0.f51536a < 18) {
            return u.f44757a;
        }
        synchronized (this.f44710a) {
            if (!u0.c(fVar, this.f44711b)) {
                this.f44711b = fVar;
                this.f44712c = b(fVar);
            }
            uVar = (u) com.google.android.exoplayer2.util.a.g(this.f44712c);
        }
        return uVar;
    }

    public void c(@androidx.annotation.p0 HttpDataSource.b bVar) {
        this.f44713d = bVar;
    }

    public void d(@androidx.annotation.p0 String str) {
        this.f44714e = str;
    }
}
