package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: compiled from: MetadataRetriever.java */
/* JADX INFO: loaded from: classes7.dex */
public final class u2 {

    /* JADX INFO: compiled from: MetadataRetriever.java */
    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f50355e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f50356f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f50357g = 2;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f50358h = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.google.android.exoplayer2.source.p0 f50359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HandlerThread f50360b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.google.android.exoplayer2.util.p f50361c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final com.google.common.util.concurrent.h1<com.google.android.exoplayer2.source.p1> f50362d;

        /* JADX INFO: compiled from: MetadataRetriever.java */
        public final class a implements Handler.Callback {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static final int f50363f = 100;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final C0401a f50364b = new C0401a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private com.google.android.exoplayer2.source.f0 f50365c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private com.google.android.exoplayer2.source.c0 f50366d;

            /* JADX INFO: renamed from: com.google.android.exoplayer2.u2$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: MetadataRetriever.java */
            public final class C0401a implements com.google.android.exoplayer2.source.f0.b {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final C0402a f50368b = new C0402a();

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final com.google.android.exoplayer2.upstream.b f50369c = new com.google.android.exoplayer2.upstream.s(true, 65536);

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private boolean f50370d;

                /* JADX INFO: renamed from: com.google.android.exoplayer2.u2$b$a$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: MetadataRetriever.java */
                public final class C0402a implements com.google.android.exoplayer2.source.c0.a {
                    private C0402a() {
                    }

                    @Override // com.google.android.exoplayer2.source.e1.a
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void n(com.google.android.exoplayer2.source.c0 c0Var) {
                        b.this.f50361c.c(2).a();
                    }

                    @Override // com.google.android.exoplayer2.source.c0.a
                    public void q(com.google.android.exoplayer2.source.c0 c0Var) {
                        b.this.f50362d.B(c0Var.o());
                        b.this.f50361c.c(3).a();
                    }
                }

                public C0401a() {
                }

                @Override // com.google.android.exoplayer2.source.f0.b
                public void e(com.google.android.exoplayer2.source.f0 f0Var, z3 z3Var) {
                    if (this.f50370d) {
                        return;
                    }
                    this.f50370d = true;
                    a.this.f50366d = f0Var.h(new com.google.android.exoplayer2.source.f0.a(z3Var.t(0)), this.f50369c, 0L);
                    a.this.f50366d.r(this.f50368b, 0L);
                }
            }

            public a() {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int i10 = message.what;
                if (i10 == 0) {
                    com.google.android.exoplayer2.source.f0 f0VarG = b.this.f50359a.g((i2) message.obj);
                    this.f50365c = f0VarG;
                    f0VarG.d(this.f50364b, null);
                    b.this.f50361c.l(1);
                    return true;
                }
                if (i10 == 1) {
                    try {
                        com.google.android.exoplayer2.source.c0 c0Var = this.f50366d;
                        if (c0Var == null) {
                            ((com.google.android.exoplayer2.source.f0) com.google.android.exoplayer2.util.a.g(this.f50365c)).f();
                        } else {
                            c0Var.u();
                        }
                        b.this.f50361c.a(1, 100);
                    } catch (Exception e10) {
                        b.this.f50362d.C(e10);
                        b.this.f50361c.c(3).a();
                    }
                    return true;
                }
                if (i10 == 2) {
                    ((com.google.android.exoplayer2.source.c0) com.google.android.exoplayer2.util.a.g(this.f50366d)).d(0L);
                    return true;
                }
                if (i10 != 3) {
                    return false;
                }
                if (this.f50366d != null) {
                    ((com.google.android.exoplayer2.source.f0) com.google.android.exoplayer2.util.a.g(this.f50365c)).k(this.f50366d);
                }
                ((com.google.android.exoplayer2.source.f0) com.google.android.exoplayer2.util.a.g(this.f50365c)).a(this.f50364b);
                b.this.f50361c.f(null);
                b.this.f50360b.quit();
                return true;
            }
        }

        public b(com.google.android.exoplayer2.source.p0 p0Var, com.google.android.exoplayer2.util.e eVar) {
            this.f50359a = p0Var;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:MetadataRetriever");
            this.f50360b = handlerThread;
            handlerThread.start();
            this.f50361c = eVar.e(handlerThread.getLooper(), new a());
            this.f50362d = com.google.common.util.concurrent.h1.F();
        }

        public com.google.common.util.concurrent.p0<com.google.android.exoplayer2.source.p1> e(i2 i2Var) {
            this.f50361c.e(0, i2Var).a();
            return this.f50362d;
        }
    }

    private u2() {
    }

    public static com.google.common.util.concurrent.p0<com.google.android.exoplayer2.source.p1> a(Context context, i2 i2Var) {
        return b(context, i2Var, com.google.android.exoplayer2.util.e.f51387a);
    }

    @androidx.annotation.j1
    static com.google.common.util.concurrent.p0<com.google.android.exoplayer2.source.p1> b(Context context, i2 i2Var, com.google.android.exoplayer2.util.e eVar) {
        return d(new com.google.android.exoplayer2.source.l(context, new com.google.android.exoplayer2.extractor.h().l(6)), i2Var, eVar);
    }

    public static com.google.common.util.concurrent.p0<com.google.android.exoplayer2.source.p1> c(com.google.android.exoplayer2.source.p0 p0Var, i2 i2Var) {
        return d(p0Var, i2Var, com.google.android.exoplayer2.util.e.f51387a);
    }

    private static com.google.common.util.concurrent.p0<com.google.android.exoplayer2.source.p1> d(com.google.android.exoplayer2.source.p0 p0Var, i2 i2Var, com.google.android.exoplayer2.util.e eVar) {
        return new b(p0Var, eVar).e(i2Var);
    }
}
