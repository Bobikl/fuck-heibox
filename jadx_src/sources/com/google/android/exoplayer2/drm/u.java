package com.google.android.exoplayer2.drm;

import android.os.Looper;
import com.google.android.exoplayer2.a2;

/* JADX INFO: compiled from: DrmSessionManager.java */
/* JADX INFO: loaded from: classes7.dex */
public interface u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f44757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final u f44758b;

    /* JADX INFO: compiled from: DrmSessionManager.java */
    public class a implements u {
        a() {
        }

        @Override // com.google.android.exoplayer2.drm.u
        @androidx.annotation.p0
        public DrmSession a(Looper looper, @androidx.annotation.p0 s.a aVar, a2 a2Var) {
            if (a2Var.f43596p == null) {
                return null;
            }
            return new a0(new DrmSession.DrmSessionException(new UnsupportedDrmException(1), 6001));
        }

        @Override // com.google.android.exoplayer2.drm.u
        public int b(a2 a2Var) {
            return a2Var.f43596p != null ? 1 : 0;
        }

        @Override // com.google.android.exoplayer2.drm.u
        public /* synthetic */ b c(Looper looper, s.a aVar, a2 a2Var) {
            return t.a(this, looper, aVar, a2Var);
        }

        @Override // com.google.android.exoplayer2.drm.u
        public /* synthetic */ void prepare() {
            t.b(this);
        }

        @Override // com.google.android.exoplayer2.drm.u
        public /* synthetic */ void release() {
            t.c(this);
        }
    }

    /* JADX INFO: compiled from: DrmSessionManager.java */
    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f44759a = new b() { // from class: com.google.android.exoplayer2.drm.v
            @Override // com.google.android.exoplayer2.drm.u.b
            public final void release() {
                w.a();
            }
        };

        void release();
    }

    static {
        a aVar = new a();
        f44757a = aVar;
        f44758b = aVar;
    }

    @androidx.annotation.p0
    DrmSession a(Looper looper, @androidx.annotation.p0 s.a aVar, a2 a2Var);

    int b(a2 a2Var);

    b c(Looper looper, @androidx.annotation.p0 s.a aVar, a2 a2Var);

    void prepare();

    void release();
}
