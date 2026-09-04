package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.b2;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.n3;
import com.google.android.exoplayer2.util.u0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: MetadataRenderer.java */
/* JADX INFO: loaded from: classes7.dex */
public final class f extends com.google.android.exoplayer2.e implements Handler.Callback {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f46841x = "MetadataRenderer";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f46842y = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final c f46843n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final e f46844o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private final Handler f46845p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final d f46846q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @p0
    private b f46847r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f46848s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f46849t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f46850u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f46851v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @p0
    private Metadata f46852w;

    public f(e eVar, @p0 Looper looper) {
        this(eVar, looper, c.f46818a);
    }

    public f(e eVar, @p0 Looper looper, c cVar) {
        super(5);
        this.f46844o = (e) com.google.android.exoplayer2.util.a.g(eVar);
        this.f46845p = looper == null ? null : u0.x(looper, this);
        this.f46843n = (c) com.google.android.exoplayer2.util.a.g(cVar);
        this.f46846q = new d();
        this.f46851v = j.f46377b;
    }

    private void N(Metadata metadata, List<Metadata.Entry> list) {
        for (int i10 = 0; i10 < metadata.d(); i10++) {
            a2 a2VarJ0 = metadata.c(i10).J0();
            if (a2VarJ0 == null || !this.f46843n.a(a2VarJ0)) {
                list.add(metadata.c(i10));
            } else {
                b bVarB = this.f46843n.b(a2VarJ0);
                byte[] bArr = (byte[]) com.google.android.exoplayer2.util.a.g(metadata.c(i10).v0());
                this.f46846q.f();
                this.f46846q.o(bArr.length);
                ((ByteBuffer) u0.k(this.f46846q.f44488e)).put(bArr);
                this.f46846q.p();
                Metadata metadataA = bVarB.a(this.f46846q);
                if (metadataA != null) {
                    N(metadataA, list);
                }
            }
        }
    }

    private void O(Metadata metadata) {
        Handler handler = this.f46845p;
        if (handler != null) {
            handler.obtainMessage(0, metadata).sendToTarget();
        } else {
            P(metadata);
        }
    }

    private void P(Metadata metadata) {
        this.f46844o.q(metadata);
    }

    private boolean Q(long j10) {
        boolean z10;
        Metadata metadata = this.f46852w;
        if (metadata == null || this.f46851v > j10) {
            z10 = false;
        } else {
            O(metadata);
            this.f46852w = null;
            this.f46851v = j.f46377b;
            z10 = true;
        }
        if (this.f46848s && this.f46852w == null) {
            this.f46849t = true;
        }
        return z10;
    }

    private void R() {
        if (this.f46848s || this.f46852w != null) {
            return;
        }
        this.f46846q.f();
        b2 b2VarZ = z();
        int iL = L(b2VarZ, this.f46846q, 0);
        if (iL != -4) {
            if (iL == -5) {
                this.f46850u = ((a2) com.google.android.exoplayer2.util.a.g(b2VarZ.f44366b)).f43597q;
                return;
            }
            return;
        }
        if (this.f46846q.k()) {
            this.f46848s = true;
            return;
        }
        d dVar = this.f46846q;
        dVar.f46819n = this.f46850u;
        dVar.p();
        Metadata metadataA = ((b) u0.k(this.f46847r)).a(this.f46846q);
        if (metadataA != null) {
            ArrayList arrayList = new ArrayList(metadataA.d());
            N(metadataA, arrayList);
            if (arrayList.isEmpty()) {
                return;
            }
            this.f46852w = new Metadata(arrayList);
            this.f46851v = this.f46846q.f44490g;
        }
    }

    @Override // com.google.android.exoplayer2.e
    protected void E() {
        this.f46852w = null;
        this.f46851v = j.f46377b;
        this.f46847r = null;
    }

    @Override // com.google.android.exoplayer2.e
    protected void G(long j10, boolean z10) {
        this.f46852w = null;
        this.f46851v = j.f46377b;
        this.f46848s = false;
        this.f46849t = false;
    }

    @Override // com.google.android.exoplayer2.e
    protected void K(a2[] a2VarArr, long j10, long j11) {
        this.f46847r = this.f46843n.b(a2VarArr[0]);
    }

    @Override // com.google.android.exoplayer2.o3
    public int a(a2 a2Var) {
        if (this.f46843n.a(a2Var)) {
            return n3.a(a2Var.F == 0 ? 4 : 2);
        }
        return n3.a(0);
    }

    @Override // com.google.android.exoplayer2.m3
    public boolean b() {
        return this.f46849t;
    }

    @Override // com.google.android.exoplayer2.m3, com.google.android.exoplayer2.o3
    public String getName() {
        return f46841x;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        P((Metadata) message.obj);
        return true;
    }

    @Override // com.google.android.exoplayer2.m3
    public boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.m3
    public void j(long j10, long j11) {
        boolean zQ = true;
        while (zQ) {
            R();
            zQ = Q(j10);
        }
    }
}
