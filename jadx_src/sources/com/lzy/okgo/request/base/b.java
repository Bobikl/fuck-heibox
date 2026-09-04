package com.lzy.okgo.request.base;

import com.lzy.okgo.model.Progress;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.IOException;
import la.d;
import okhttp3.b0;
import okhttp3.v;
import okio.Buffer;
import okio.BufferedSink;
import okio.ForwardingSink;
import okio.Okio;
import okio.Sink;

/* JADX INFO: compiled from: ProgressRequestBody.java */
/* JADX INFO: loaded from: classes6.dex */
public class b<T> extends b0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b0 f64833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ia.c<T> f64834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f64835c;

    /* JADX INFO: compiled from: ProgressRequestBody.java */
    public class a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Progress f64836b;

        a(Progress progress) {
            this.f64836b = progress;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30746ka, new Class[0], Void.TYPE).isSupported || b.this.f64834b == null) {
                return;
            }
            b.this.f64834b.a(this.f64836b);
        }
    }

    /* JADX INFO: renamed from: com.lzy.okgo.request.base.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ProgressRequestBody.java */
    public final class C0525b extends ForwardingSink {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Progress f64838b;

        /* JADX INFO: renamed from: com.lzy.okgo.request.base.b$b$a */
        /* JADX INFO: compiled from: ProgressRequestBody.java */
        public class a implements Progress.a {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.lzy.okgo.model.Progress.a
            public void a(Progress progress) {
                if (PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, bb.c.b.f30792ma, new Class[]{Progress.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (b.this.f64835c != null) {
                    b.this.f64835c.a(progress);
                } else {
                    b.b(b.this, progress);
                }
            }
        }

        C0525b(Sink sink) {
            super(sink);
            Progress progress = new Progress();
            this.f64838b = progress;
            progress.f64782h = b.this.contentLength();
        }

        @Override // okio.ForwardingSink, okio.Sink
        public void write(Buffer buffer, long j10) throws IOException {
            if (PatchProxy.proxy(new Object[]{buffer, new Long(j10)}, this, changeQuickRedirect, false, bb.c.b.f30769la, new Class[]{Buffer.class, Long.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.write(buffer, j10);
            Progress.e(this.f64838b, j10, new a());
        }
    }

    /* JADX INFO: compiled from: ProgressRequestBody.java */
    public interface c {
        void a(Progress progress);
    }

    b(b0 b0Var, ia.c<T> cVar) {
        this.f64833a = b0Var;
        this.f64834b = cVar;
    }

    static /* synthetic */ void b(b bVar, Progress progress) {
        if (PatchProxy.proxy(new Object[]{bVar, progress}, null, changeQuickRedirect, true, bb.c.b.f30723ja, new Class[]{b.class, Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.d(progress);
    }

    private void d(Progress progress) {
        if (PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, bb.c.b.f30700ia, new Class[]{Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        la.b.j(new a(progress));
    }

    @Override // okhttp3.b0
    public long contentLength() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30654ga, new Class[0], Long.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Long) patchProxyResultProxy.result).longValue();
        }
        try {
            return this.f64833a.contentLength();
        } catch (IOException e10) {
            d.i(e10);
            return -1L;
        }
    }

    @Override // okhttp3.b0
    /* JADX INFO: renamed from: contentType */
    public v getContentType() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30631fa, new Class[0], v.class);
        return patchProxyResultProxy.isSupported ? (v) patchProxyResultProxy.result : this.f64833a.getContentType();
    }

    public void e(c cVar) {
        this.f64835c = cVar;
    }

    @Override // okhttp3.b0
    public void writeTo(BufferedSink bufferedSink) throws IOException {
        if (PatchProxy.proxy(new Object[]{bufferedSink}, this, changeQuickRedirect, false, bb.c.b.f30677ha, new Class[]{BufferedSink.class}, Void.TYPE).isSupported) {
            return;
        }
        BufferedSink bufferedSinkBuffer = Okio.buffer(new C0525b(bufferedSink));
        this.f64833a.writeTo(bufferedSinkBuffer);
        bufferedSinkBuffer.flush();
    }
}
