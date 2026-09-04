package com.bumptech.glide.request;

import android.graphics.drawable.Drawable;
import androidx.annotation.b0;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.target.p;
import com.bumptech.glide.util.o;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: RequestFutureTarget.java */
/* JADX INFO: loaded from: classes6.dex */
public class f<R> implements d<R>, g<R> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a f41864l = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f41866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f41867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f41868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @b0("this")
    @p0
    private R f41869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @b0("this")
    @p0
    private e f41870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @b0("this")
    private boolean f41871h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @b0("this")
    private boolean f41872i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @b0("this")
    private boolean f41873j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @b0("this")
    @p0
    private GlideException f41874k;

    /* JADX INFO: compiled from: RequestFutureTarget.java */
    @j1
    public static class a {
        a() {
        }

        void a(Object obj) {
            obj.notifyAll();
        }

        void b(Object obj, long j10) throws InterruptedException {
            obj.wait(j10);
        }
    }

    public f(int i10, int i11) {
        this(i10, i11, true, f41864l);
    }

    f(int i10, int i11, boolean z10, a aVar) {
        this.f41865b = i10;
        this.f41866c = i11;
        this.f41867d = z10;
        this.f41868e = aVar;
    }

    private synchronized R c(Long l10) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f41867d && !isDone()) {
            o.a();
        }
        if (this.f41871h) {
            throw new CancellationException();
        }
        if (this.f41873j) {
            throw new ExecutionException(this.f41874k);
        }
        if (this.f41872i) {
            return this.f41869f;
        }
        if (l10 == null) {
            this.f41868e.b(this, 0L);
        } else if (l10.longValue() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = l10.longValue() + jCurrentTimeMillis;
            while (!isDone() && jCurrentTimeMillis < jLongValue) {
                this.f41868e.b(this, jLongValue - jCurrentTimeMillis);
                jCurrentTimeMillis = System.currentTimeMillis();
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this.f41873j) {
            throw new ExecutionException(this.f41874k);
        }
        if (this.f41871h) {
            throw new CancellationException();
        }
        if (!this.f41872i) {
            throw new TimeoutException();
        }
        return this.f41869f;
    }

    @Override // com.bumptech.glide.request.g
    public synchronized boolean a(@p0 GlideException glideException, Object obj, @n0 p<R> pVar, boolean z10) {
        this.f41873j = true;
        this.f41874k = glideException;
        this.f41868e.a(this);
        return false;
    }

    @Override // com.bumptech.glide.request.g
    public synchronized boolean b(@n0 R r10, @n0 Object obj, p<R> pVar, @n0 DataSource dataSource, boolean z10) {
        this.f41872i = true;
        this.f41869f = r10;
        this.f41868e.a(this);
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.f41871h = true;
            this.f41868e.a(this);
            e eVar = null;
            if (z10) {
                e eVar2 = this.f41870g;
                this.f41870g = null;
                eVar = eVar2;
            }
            if (eVar != null) {
                eVar.clear();
            }
            return true;
        }
    }

    @Override // java.util.concurrent.Future
    public R get() throws ExecutionException, InterruptedException {
        try {
            return c(null);
        } catch (TimeoutException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // java.util.concurrent.Future
    public R get(long j10, @n0 TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return c(Long.valueOf(timeUnit.toMillis(j10)));
    }

    @Override // com.bumptech.glide.request.target.p
    @p0
    public synchronized e getRequest() {
        return this.f41870g;
    }

    @Override // com.bumptech.glide.request.target.p
    public void getSize(@n0 com.bumptech.glide.request.target.o oVar) {
        oVar.d(this.f41865b, this.f41866c);
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.f41871h;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        return this.f41871h || this.f41872i || this.f41873j;
    }

    @Override // com.bumptech.glide.manager.k
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.request.target.p
    public void onLoadCleared(@p0 Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.p
    public synchronized void onLoadFailed(@p0 Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.p
    public void onLoadStarted(@p0 Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.p
    public synchronized void onResourceReady(@n0 R r10, @p0 com.bumptech.glide.request.transition.f<? super R> fVar) {
    }

    @Override // com.bumptech.glide.manager.k
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.k
    public void onStop() {
    }

    @Override // com.bumptech.glide.request.target.p
    public void removeCallback(@n0 com.bumptech.glide.request.target.o oVar) {
    }

    @Override // com.bumptech.glide.request.target.p
    public synchronized void setRequest(@p0 e eVar) {
        this.f41870g = eVar;
    }

    public String toString() {
        e eVar;
        String str;
        String str2 = super.toString() + "[status=";
        synchronized (this) {
            eVar = null;
            if (this.f41871h) {
                str = "CANCELLED";
            } else if (this.f41873j) {
                str = "FAILURE";
            } else if (this.f41872i) {
                str = "SUCCESS";
            } else {
                str = BBSLinkObj.REVIEW_STATE_PENDING;
                eVar = this.f41870g;
            }
        }
        if (eVar == null) {
            return str2 + str + "]";
        }
        return str2 + str + ", request=[" + eVar + "]]";
    }
}
