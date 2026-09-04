package com.google.android.exoplayer2.drm;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Pair;
import androidx.annotation.w0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: OfflineLicenseHelper.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(18)
public final class n0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a2 f44735e = new a2.b().M(new DrmInitData(new DrmInitData.SchemeData[0])).E();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConditionVariable f44736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DefaultDrmSessionManager f44737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HandlerThread f44738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s.a f44739d;

    /* JADX INFO: compiled from: OfflineLicenseHelper.java */
    public class a implements s {
        a() {
        }

        @Override // com.google.android.exoplayer2.drm.s
        public void L(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar) {
            n0.this.f44736a.open();
        }

        @Override // com.google.android.exoplayer2.drm.s
        public /* synthetic */ void N(int i10, com.google.android.exoplayer2.source.f0.a aVar, int i11) {
            l.e(this, i10, aVar, i11);
        }

        @Override // com.google.android.exoplayer2.drm.s
        public void Q(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar) {
            n0.this.f44736a.open();
        }

        @Override // com.google.android.exoplayer2.drm.s
        public void W(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar) {
            n0.this.f44736a.open();
        }

        @Override // com.google.android.exoplayer2.drm.s
        public /* synthetic */ void Y(int i10, com.google.android.exoplayer2.source.f0.a aVar) {
            l.d(this, i10, aVar);
        }

        @Override // com.google.android.exoplayer2.drm.s
        public void j0(int i10, @androidx.annotation.p0 com.google.android.exoplayer2.source.f0.a aVar, Exception exc) {
            n0.this.f44736a.open();
        }

        @Override // com.google.android.exoplayer2.drm.s
        public /* synthetic */ void r0(int i10, com.google.android.exoplayer2.source.f0.a aVar) {
            l.g(this, i10, aVar);
        }
    }

    public n0(DefaultDrmSessionManager defaultDrmSessionManager, s.a aVar) {
        this.f44737b = defaultDrmSessionManager;
        this.f44739d = aVar;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:OfflineLicenseHelper");
        this.f44738c = handlerThread;
        handlerThread.start();
        this.f44736a = new ConditionVariable();
        aVar.g(new Handler(handlerThread.getLooper()), new a());
    }

    @Deprecated
    public n0(UUID uuid, b0.g gVar, m0 m0Var, @androidx.annotation.p0 Map<String, String> map, s.a aVar) {
        this(new DefaultDrmSessionManager.b().h(uuid, gVar).b(map).a(m0Var), aVar);
    }

    private byte[] b(int i10, @androidx.annotation.p0 byte[] bArr, a2 a2Var) throws DrmSession.DrmSessionException {
        this.f44737b.prepare();
        DrmSession drmSessionH = h(i10, bArr, a2Var);
        DrmSession.DrmSessionException drmSessionExceptionQ = drmSessionH.q();
        byte[] bArrX = drmSessionH.x();
        drmSessionH.r(this.f44739d);
        this.f44737b.release();
        if (drmSessionExceptionQ == null) {
            return (byte[]) com.google.android.exoplayer2.util.a.g(bArrX);
        }
        throw drmSessionExceptionQ;
    }

    public static n0 e(String str, HttpDataSource.b bVar, s.a aVar) {
        return f(str, false, bVar, aVar);
    }

    public static n0 f(String str, boolean z10, HttpDataSource.b bVar, s.a aVar) {
        return g(str, z10, bVar, null, aVar);
    }

    public static n0 g(String str, boolean z10, HttpDataSource.b bVar, @androidx.annotation.p0 Map<String, String> map, s.a aVar) {
        return new n0(new DefaultDrmSessionManager.b().b(map).a(new k0(str, z10, bVar)), aVar);
    }

    private DrmSession h(int i10, @androidx.annotation.p0 byte[] bArr, a2 a2Var) {
        com.google.android.exoplayer2.util.a.g(a2Var.f43596p);
        this.f44737b.D(i10, bArr);
        this.f44736a.close();
        DrmSession drmSessionA = this.f44737b.a(this.f44738c.getLooper(), this.f44739d, a2Var);
        this.f44736a.block();
        return (DrmSession) com.google.android.exoplayer2.util.a.g(drmSessionA);
    }

    public synchronized byte[] c(a2 a2Var) throws DrmSession.DrmSessionException {
        com.google.android.exoplayer2.util.a.a(a2Var.f43596p != null);
        return b(2, null, a2Var);
    }

    public synchronized Pair<Long, Long> d(byte[] bArr) throws DrmSession.DrmSessionException {
        com.google.android.exoplayer2.util.a.g(bArr);
        this.f44737b.prepare();
        DrmSession drmSessionH = h(1, bArr, f44735e);
        DrmSession.DrmSessionException drmSessionExceptionQ = drmSessionH.q();
        Pair<Long, Long> pairB = o0.b(drmSessionH);
        drmSessionH.r(this.f44739d);
        this.f44737b.release();
        if (drmSessionExceptionQ == null) {
            return (Pair) com.google.android.exoplayer2.util.a.g(pairB);
        }
        if (!(drmSessionExceptionQ.getCause() instanceof KeysExpiredException)) {
            throw drmSessionExceptionQ;
        }
        return Pair.create(0L, 0L);
    }

    public void i() {
        this.f44738c.quit();
    }

    public synchronized void j(byte[] bArr) throws DrmSession.DrmSessionException {
        com.google.android.exoplayer2.util.a.g(bArr);
        b(3, bArr, f44735e);
    }

    public synchronized byte[] k(byte[] bArr) throws DrmSession.DrmSessionException {
        com.google.android.exoplayer2.util.a.g(bArr);
        return b(2, bArr, f44735e);
    }
}
