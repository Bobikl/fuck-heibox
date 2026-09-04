package com.google.android.exoplayer2.trackselection;

import androidx.annotation.p0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.o3;
import com.google.android.exoplayer2.source.f0;
import com.google.android.exoplayer2.source.p1;
import com.google.android.exoplayer2.z3;

/* JADX INFO: compiled from: TrackSelector.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private a f50188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private com.google.android.exoplayer2.upstream.e f50189b;

    /* JADX INFO: compiled from: TrackSelector.java */
    public interface a {
        void a();
    }

    protected final com.google.android.exoplayer2.upstream.e a() {
        return (com.google.android.exoplayer2.upstream.e) com.google.android.exoplayer2.util.a.g(this.f50189b);
    }

    public u b() {
        return u.f50139z;
    }

    public final void c(a aVar, com.google.android.exoplayer2.upstream.e eVar) {
        this.f50188a = aVar;
        this.f50189b = eVar;
    }

    protected final void d() {
        a aVar = this.f50188a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public boolean e() {
        return false;
    }

    public abstract void f(@p0 Object obj);

    public abstract x g(o3[] o3VarArr, p1 p1Var, f0.a aVar, z3 z3Var) throws ExoPlaybackException;

    public void h(u uVar) {
    }
}
