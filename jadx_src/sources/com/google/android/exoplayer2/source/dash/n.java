package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.p0;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.b2;
import com.google.android.exoplayer2.extractor.d0;
import com.google.android.exoplayer2.extractor.e0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.source.c1;
import com.google.android.exoplayer2.util.u0;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: PlayerEmsgHandler.java */
/* JADX INFO: loaded from: classes7.dex */
public final class n implements Handler.Callback {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f47973l = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.b f47974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f47975c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.exoplayer2.source.dash.manifest.c f47979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f47980h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f47981i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f47982j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f47983k;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TreeMap<Long, Long> f47978f = new TreeMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f47977e = u0.z(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.exoplayer2.metadata.emsg.a f47976d = new com.google.android.exoplayer2.metadata.emsg.a();

    /* JADX INFO: compiled from: PlayerEmsgHandler.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f47984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f47985b;

        public a(long j10, long j11) {
            this.f47984a = j10;
            this.f47985b = j11;
        }
    }

    /* JADX INFO: compiled from: PlayerEmsgHandler.java */
    public interface b {
        void a(long j10);

        void b();
    }

    /* JADX INFO: compiled from: PlayerEmsgHandler.java */
    public final class c implements e0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c1 f47986d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b2 f47987e = new b2();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final com.google.android.exoplayer2.metadata.d f47988f = new com.google.android.exoplayer2.metadata.d();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f47989g = com.google.android.exoplayer2.j.f46377b;

        c(com.google.android.exoplayer2.upstream.b bVar) {
            this.f47986d = c1.l(bVar);
        }

        @p0
        private com.google.android.exoplayer2.metadata.d g() {
            this.f47988f.f();
            if (this.f47986d.T(this.f47987e, this.f47988f, 0, false) != -4) {
                return null;
            }
            this.f47988f.p();
            return this.f47988f;
        }

        private void k(long j10, long j11) {
            n.this.f47977e.sendMessage(n.this.f47977e.obtainMessage(1, new a(j10, j11)));
        }

        private void l() {
            while (this.f47986d.L(false)) {
                com.google.android.exoplayer2.metadata.d dVarG = g();
                if (dVarG != null) {
                    long j10 = dVarG.f44490g;
                    Metadata metadataA = n.this.f47976d.a(dVarG);
                    if (metadataA != null) {
                        EventMessage eventMessage = (EventMessage) metadataA.c(0);
                        if (n.h(eventMessage.f46833b, eventMessage.f46834c)) {
                            m(j10, eventMessage);
                        }
                    }
                }
            }
            this.f47986d.s();
        }

        private void m(long j10, EventMessage eventMessage) {
            long jF = n.f(eventMessage);
            if (jF == com.google.android.exoplayer2.j.f46377b) {
                return;
            }
            k(j10, jF);
        }

        @Override // com.google.android.exoplayer2.extractor.e0
        public int a(com.google.android.exoplayer2.upstream.k kVar, int i10, boolean z10, int i11) throws IOException {
            return this.f47986d.b(kVar, i10, z10);
        }

        @Override // com.google.android.exoplayer2.extractor.e0
        public /* synthetic */ int b(com.google.android.exoplayer2.upstream.k kVar, int i10, boolean z10) {
            return d0.a(this, kVar, i10, z10);
        }

        @Override // com.google.android.exoplayer2.extractor.e0
        public /* synthetic */ void c(com.google.android.exoplayer2.util.e0 e0Var, int i10) {
            d0.b(this, e0Var, i10);
        }

        @Override // com.google.android.exoplayer2.extractor.e0
        public void d(a2 a2Var) {
            this.f47986d.d(a2Var);
        }

        @Override // com.google.android.exoplayer2.extractor.e0
        public void e(long j10, int i10, int i11, int i12, @p0 e0.a aVar) {
            this.f47986d.e(j10, i10, i11, i12, aVar);
            l();
        }

        @Override // com.google.android.exoplayer2.extractor.e0
        public void f(com.google.android.exoplayer2.util.e0 e0Var, int i10, int i11) {
            this.f47986d.c(e0Var, i10);
        }

        public boolean h(long j10) {
            return n.this.j(j10);
        }

        public void i(com.google.android.exoplayer2.source.chunk.f fVar) {
            long j10 = this.f47989g;
            if (j10 == com.google.android.exoplayer2.j.f46377b || fVar.f47654h > j10) {
                this.f47989g = fVar.f47654h;
            }
            n.this.m(fVar);
        }

        public boolean j(com.google.android.exoplayer2.source.chunk.f fVar) {
            long j10 = this.f47989g;
            return n.this.n(j10 != com.google.android.exoplayer2.j.f46377b && j10 < fVar.f47653g);
        }

        public void n() {
            this.f47986d.U();
        }
    }

    public n(com.google.android.exoplayer2.source.dash.manifest.c cVar, b bVar, com.google.android.exoplayer2.upstream.b bVar2) {
        this.f47979g = cVar;
        this.f47975c = bVar;
        this.f47974b = bVar2;
    }

    @p0
    private Map.Entry<Long, Long> e(long j10) {
        return this.f47978f.ceilingEntry(Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long f(EventMessage eventMessage) {
        try {
            return u0.c1(u0.I(eventMessage.f46837f));
        } catch (ParserException unused) {
            return com.google.android.exoplayer2.j.f46377b;
        }
    }

    private void g(long j10, long j11) {
        Long l10 = this.f47978f.get(Long.valueOf(j11));
        if (l10 == null) {
            this.f47978f.put(Long.valueOf(j11), Long.valueOf(j10));
        } else if (l10.longValue() > j10) {
            this.f47978f.put(Long.valueOf(j11), Long.valueOf(j10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean h(String str, String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2));
    }

    private void i() {
        if (this.f47981i) {
            this.f47982j = true;
            this.f47981i = false;
            this.f47975c.b();
        }
    }

    private void l() {
        this.f47975c.a(this.f47980h);
    }

    private void p() {
        Iterator<Map.Entry<Long, Long>> it = this.f47978f.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.f47979g.f47880h) {
                it.remove();
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f47983k) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        g(aVar.f47984a, aVar.f47985b);
        return true;
    }

    boolean j(long j10) {
        com.google.android.exoplayer2.source.dash.manifest.c cVar = this.f47979g;
        boolean z10 = false;
        if (!cVar.f47876d) {
            return false;
        }
        if (this.f47982j) {
            return true;
        }
        Map.Entry<Long, Long> entryE = e(cVar.f47880h);
        if (entryE != null && entryE.getValue().longValue() < j10) {
            this.f47980h = entryE.getKey().longValue();
            l();
            z10 = true;
        }
        if (z10) {
            i();
        }
        return z10;
    }

    public c k() {
        return new c(this.f47974b);
    }

    void m(com.google.android.exoplayer2.source.chunk.f fVar) {
        this.f47981i = true;
    }

    boolean n(boolean z10) {
        if (!this.f47979g.f47876d) {
            return false;
        }
        if (this.f47982j) {
            return true;
        }
        if (!z10) {
            return false;
        }
        i();
        return true;
    }

    public void o() {
        this.f47983k = true;
        this.f47977e.removeCallbacksAndMessages(null);
    }

    public void q(com.google.android.exoplayer2.source.dash.manifest.c cVar) {
        this.f47982j = false;
        this.f47980h = com.google.android.exoplayer2.j.f46377b;
        this.f47979g = cVar;
        p();
    }
}
