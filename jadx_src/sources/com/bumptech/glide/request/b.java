package com.bumptech.glide.request;

import androidx.annotation.b0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: ErrorRequestCoordinator.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements RequestCoordinator, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f41858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final RequestCoordinator f41859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile e f41860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile e f41861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @b0("requestLock")
    private RequestCoordinator.RequestState f41862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @b0("requestLock")
    private RequestCoordinator.RequestState f41863f;

    public b(Object obj, @p0 RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f41862e = requestState;
        this.f41863f = requestState;
        this.f41858a = obj;
        this.f41859b = requestCoordinator;
    }

    @b0("requestLock")
    private boolean j(e eVar) {
        RequestCoordinator.RequestState requestState;
        RequestCoordinator.RequestState requestState2 = this.f41862e;
        RequestCoordinator.RequestState requestState3 = RequestCoordinator.RequestState.FAILED;
        if (requestState2 != requestState3) {
            return eVar.equals(this.f41860c);
        }
        return eVar.equals(this.f41861d) && ((requestState = this.f41863f) == RequestCoordinator.RequestState.SUCCESS || requestState == requestState3);
    }

    @b0("requestLock")
    private boolean k() {
        RequestCoordinator requestCoordinator = this.f41859b;
        return requestCoordinator == null || requestCoordinator.i(this);
    }

    @b0("requestLock")
    private boolean l() {
        RequestCoordinator requestCoordinator = this.f41859b;
        return requestCoordinator == null || requestCoordinator.c(this);
    }

    @b0("requestLock")
    private boolean m() {
        RequestCoordinator requestCoordinator = this.f41859b;
        return requestCoordinator == null || requestCoordinator.d(this);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.e
    public boolean a() {
        boolean z10;
        synchronized (this.f41858a) {
            z10 = this.f41860c.a() || this.f41861d.a();
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void b(e eVar) {
        synchronized (this.f41858a) {
            if (eVar.equals(this.f41860c)) {
                this.f41862e = RequestCoordinator.RequestState.SUCCESS;
            } else if (eVar.equals(this.f41861d)) {
                this.f41863f = RequestCoordinator.RequestState.SUCCESS;
            }
            RequestCoordinator requestCoordinator = this.f41859b;
            if (requestCoordinator != null) {
                requestCoordinator.b(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean c(e eVar) {
        boolean z10;
        synchronized (this.f41858a) {
            z10 = l() && j(eVar);
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.e
    public void clear() {
        synchronized (this.f41858a) {
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f41862e = requestState;
            this.f41860c.clear();
            if (this.f41863f != requestState) {
                this.f41863f = requestState;
                this.f41861d.clear();
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean d(e eVar) {
        boolean zM;
        synchronized (this.f41858a) {
            zM = m();
        }
        return zM;
    }

    @Override // com.bumptech.glide.request.e
    public boolean e() {
        boolean z10;
        synchronized (this.f41858a) {
            RequestCoordinator.RequestState requestState = this.f41862e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
            z10 = requestState == requestState2 && this.f41863f == requestState2;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.e
    public boolean f(e eVar) {
        if (!(eVar instanceof b)) {
            return false;
        }
        b bVar = (b) eVar;
        return this.f41860c.f(bVar.f41860c) && this.f41861d.f(bVar.f41861d);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void g(e eVar) {
        synchronized (this.f41858a) {
            if (eVar.equals(this.f41861d)) {
                this.f41863f = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator requestCoordinator = this.f41859b;
                if (requestCoordinator != null) {
                    requestCoordinator.g(this);
                }
                return;
            }
            this.f41862e = RequestCoordinator.RequestState.FAILED;
            RequestCoordinator.RequestState requestState = this.f41863f;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState != requestState2) {
                this.f41863f = requestState2;
                this.f41861d.h();
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f41858a) {
            RequestCoordinator requestCoordinator = this.f41859b;
            root = requestCoordinator != null ? requestCoordinator.getRoot() : this;
        }
        return root;
    }

    @Override // com.bumptech.glide.request.e
    public void h() {
        synchronized (this.f41858a) {
            RequestCoordinator.RequestState requestState = this.f41862e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState != requestState2) {
                this.f41862e = requestState2;
                this.f41860c.h();
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean i(e eVar) {
        boolean z10;
        synchronized (this.f41858a) {
            z10 = k() && eVar.equals(this.f41860c);
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.e
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f41858a) {
            RequestCoordinator.RequestState requestState = this.f41862e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
            z10 = requestState == requestState2 || this.f41863f == requestState2;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.e
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f41858a) {
            RequestCoordinator.RequestState requestState = this.f41862e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            z10 = requestState == requestState2 || this.f41863f == requestState2;
        }
        return z10;
    }

    public void n(e eVar, e eVar2) {
        this.f41860c = eVar;
        this.f41861d = eVar2;
    }

    @Override // com.bumptech.glide.request.e
    public void pause() {
        synchronized (this.f41858a) {
            RequestCoordinator.RequestState requestState = this.f41862e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState == requestState2) {
                this.f41862e = RequestCoordinator.RequestState.PAUSED;
                this.f41860c.pause();
            }
            if (this.f41863f == requestState2) {
                this.f41863f = RequestCoordinator.RequestState.PAUSED;
                this.f41861d.pause();
            }
        }
    }
}
