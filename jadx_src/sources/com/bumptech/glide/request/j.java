package com.bumptech.glide.request;

import androidx.annotation.b0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: ThumbnailRequestCoordinator.java */
/* JADX INFO: loaded from: classes6.dex */
public class j implements RequestCoordinator, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final RequestCoordinator f41879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f41880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile e f41881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile e f41882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @b0("requestLock")
    private RequestCoordinator.RequestState f41883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @b0("requestLock")
    private RequestCoordinator.RequestState f41884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @b0("requestLock")
    private boolean f41885g;

    public j(Object obj, @p0 RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f41883e = requestState;
        this.f41884f = requestState;
        this.f41880b = obj;
        this.f41879a = requestCoordinator;
    }

    @b0("requestLock")
    private boolean j() {
        RequestCoordinator requestCoordinator = this.f41879a;
        return requestCoordinator == null || requestCoordinator.i(this);
    }

    @b0("requestLock")
    private boolean k() {
        RequestCoordinator requestCoordinator = this.f41879a;
        return requestCoordinator == null || requestCoordinator.c(this);
    }

    @b0("requestLock")
    private boolean l() {
        RequestCoordinator requestCoordinator = this.f41879a;
        return requestCoordinator == null || requestCoordinator.d(this);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.e
    public boolean a() {
        boolean z10;
        synchronized (this.f41880b) {
            z10 = this.f41882d.a() || this.f41881c.a();
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void b(e eVar) {
        synchronized (this.f41880b) {
            if (eVar.equals(this.f41882d)) {
                this.f41884f = RequestCoordinator.RequestState.SUCCESS;
                return;
            }
            this.f41883e = RequestCoordinator.RequestState.SUCCESS;
            RequestCoordinator requestCoordinator = this.f41879a;
            if (requestCoordinator != null) {
                requestCoordinator.b(this);
            }
            if (!this.f41884f.isComplete()) {
                this.f41882d.clear();
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean c(e eVar) {
        boolean z10;
        synchronized (this.f41880b) {
            z10 = k() && eVar.equals(this.f41881c) && !a();
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.e
    public void clear() {
        synchronized (this.f41880b) {
            this.f41885g = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f41883e = requestState;
            this.f41884f = requestState;
            this.f41882d.clear();
            this.f41881c.clear();
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean d(e eVar) {
        boolean z10;
        synchronized (this.f41880b) {
            z10 = l() && (eVar.equals(this.f41881c) || this.f41883e != RequestCoordinator.RequestState.SUCCESS);
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.e
    public boolean e() {
        boolean z10;
        synchronized (this.f41880b) {
            z10 = this.f41883e == RequestCoordinator.RequestState.CLEARED;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.e
    public boolean f(e eVar) {
        if (!(eVar instanceof j)) {
            return false;
        }
        j jVar = (j) eVar;
        if (this.f41881c == null) {
            if (jVar.f41881c != null) {
                return false;
            }
        } else if (!this.f41881c.f(jVar.f41881c)) {
            return false;
        }
        if (this.f41882d == null) {
            if (jVar.f41882d != null) {
                return false;
            }
        } else if (!this.f41882d.f(jVar.f41882d)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void g(e eVar) {
        synchronized (this.f41880b) {
            if (!eVar.equals(this.f41881c)) {
                this.f41884f = RequestCoordinator.RequestState.FAILED;
                return;
            }
            this.f41883e = RequestCoordinator.RequestState.FAILED;
            RequestCoordinator requestCoordinator = this.f41879a;
            if (requestCoordinator != null) {
                requestCoordinator.g(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f41880b) {
            RequestCoordinator requestCoordinator = this.f41879a;
            root = requestCoordinator != null ? requestCoordinator.getRoot() : this;
        }
        return root;
    }

    @Override // com.bumptech.glide.request.e
    public void h() {
        synchronized (this.f41880b) {
            this.f41885g = true;
            try {
                if (this.f41883e != RequestCoordinator.RequestState.SUCCESS) {
                    RequestCoordinator.RequestState requestState = this.f41884f;
                    RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                    if (requestState != requestState2) {
                        this.f41884f = requestState2;
                        this.f41882d.h();
                    }
                }
                if (this.f41885g) {
                    RequestCoordinator.RequestState requestState3 = this.f41883e;
                    RequestCoordinator.RequestState requestState4 = RequestCoordinator.RequestState.RUNNING;
                    if (requestState3 != requestState4) {
                        this.f41883e = requestState4;
                        this.f41881c.h();
                    }
                }
                this.f41885g = false;
            } catch (Throwable th2) {
                this.f41885g = false;
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean i(e eVar) {
        boolean z10;
        synchronized (this.f41880b) {
            z10 = j() && eVar.equals(this.f41881c) && this.f41883e != RequestCoordinator.RequestState.PAUSED;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.e
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f41880b) {
            z10 = this.f41883e == RequestCoordinator.RequestState.SUCCESS;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.e
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f41880b) {
            z10 = this.f41883e == RequestCoordinator.RequestState.RUNNING;
        }
        return z10;
    }

    public void m(e eVar, e eVar2) {
        this.f41881c = eVar;
        this.f41882d = eVar2;
    }

    @Override // com.bumptech.glide.request.e
    public void pause() {
        synchronized (this.f41880b) {
            if (!this.f41884f.isComplete()) {
                this.f41884f = RequestCoordinator.RequestState.PAUSED;
                this.f41882d.pause();
            }
            if (!this.f41883e.isComplete()) {
                this.f41883e = RequestCoordinator.RequestState.PAUSED;
                this.f41881c.pause();
            }
        }
    }
}
