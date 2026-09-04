package com.max.hbimage.image;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.d0;

/* JADX INFO: compiled from: OkHttpStreamFetcher.java */
/* JADX INFO: loaded from: classes10.dex */
public class m implements com.bumptech.glide.load.data.d<InputStream> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f70476g = "OkHttpFetcher";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final okhttp3.e.a f70477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.model.h f70478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    InputStream f70479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    d0 f70480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile okhttp3.e f70481f;

    /* JADX INFO: compiled from: OkHttpStreamFetcher.java */
    public class a implements okhttp3.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.data.d.a f70482b;

        a(com.bumptech.glide.load.data.d.a aVar) {
            this.f70482b = aVar;
        }

        @Override // okhttp3.f
        public void onFailure(okhttp3.e eVar, IOException iOException) {
            if (PatchProxy.proxy(new Object[]{eVar, iOException}, this, changeQuickRedirect, false, bb.c.g.Fd, new Class[]{okhttp3.e.class, IOException.class}, Void.TYPE).isSupported) {
                return;
            }
            if (Log.isLoggable(m.f70476g, 3)) {
                Log.d(m.f70476g, "OkHttp failed to obtain result", iOException);
            }
            this.f70482b.f(iOException);
        }

        @Override // okhttp3.f
        public void onResponse(okhttp3.e eVar, c0 c0Var) throws IOException {
            if (PatchProxy.proxy(new Object[]{eVar, c0Var}, this, changeQuickRedirect, false, bb.c.g.Gd, new Class[]{okhttp3.e.class, c0.class}, Void.TYPE).isSupported) {
                return;
            }
            m.this.f70480e = c0Var.q();
            if (!c0Var.c1()) {
                this.f70482b.f(new HttpException(c0Var.getMessage(), c0Var.x()));
                return;
            }
            long contentLength = m.this.f70480e.getContentLength();
            m mVar = m.this;
            mVar.f70479d = com.bumptech.glide.util.c.b(mVar.f70480e.byteStream(), contentLength);
            this.f70482b.e(m.this.f70479d);
        }
    }

    public m(okhttp3.e.a aVar, com.bumptech.glide.load.model.h hVar) {
        this.f70477b = aVar;
        this.f70478c = hVar;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Dd, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        try {
            InputStream inputStream = this.f70479d;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        }
        d0 d0Var = this.f70480e;
        if (d0Var != null) {
            d0Var.close();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public DataSource c() {
        return DataSource.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        okhttp3.e eVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Ed, new Class[0], Void.TYPE).isSupported || (eVar = this.f70481f) == null) {
            return;
        }
        eVar.cancel();
    }

    @Override // com.bumptech.glide.load.data.d
    public void d(Priority priority, com.bumptech.glide.load.data.d.a<? super InputStream> aVar) {
        if (PatchProxy.proxy(new Object[]{priority, aVar}, this, changeQuickRedirect, false, bb.c.g.Cd, new Class[]{Priority.class, com.bumptech.glide.load.data.d.a.class}, Void.TYPE).isSupported) {
            return;
        }
        a0.a aVarB = new a0.a().B(this.f70478c.h());
        for (Map.Entry<String, String> entry : this.f70478c.e().entrySet()) {
            aVarB.a(entry.getKey(), entry.getValue());
        }
        this.f70481f = this.f70477b.a(aVarB.b());
        this.f70481f.enqueue(new a(aVar));
    }
}
