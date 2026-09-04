package io.reactivex.disposables;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.k;
import java.util.ArrayList;
import jh.e;

/* JADX INFO: compiled from: CompositeDisposable.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements b, io.reactivex.internal.disposables.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    k<b> f119530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile boolean f119531c;

    public a() {
    }

    public a(@e Iterable<? extends b> iterable) {
        io.reactivex.internal.functions.a.g(iterable, "disposables is null");
        this.f119530b = new k<>();
        for (b bVar : iterable) {
            io.reactivex.internal.functions.a.g(bVar, "A Disposable item in the disposables sequence is null");
            this.f119530b.a(bVar);
        }
    }

    public a(@e b... bVarArr) {
        io.reactivex.internal.functions.a.g(bVarArr, "disposables is null");
        this.f119530b = new k<>(bVarArr.length + 1);
        for (b bVar : bVarArr) {
            io.reactivex.internal.functions.a.g(bVar, "A Disposable in the disposables array is null");
            this.f119530b.a(bVar);
        }
    }

    @Override // io.reactivex.internal.disposables.a
    public boolean a(@e b bVar) {
        if (!b(bVar)) {
            return false;
        }
        bVar.dispose();
        return true;
    }

    @Override // io.reactivex.internal.disposables.a
    public boolean b(@e b bVar) {
        io.reactivex.internal.functions.a.g(bVar, "disposables is null");
        if (this.f119531c) {
            return false;
        }
        synchronized (this) {
            if (this.f119531c) {
                return false;
            }
            k<b> kVar = this.f119530b;
            if (kVar != null && kVar.e(bVar)) {
                return true;
            }
            return false;
        }
    }

    @Override // io.reactivex.internal.disposables.a
    public boolean c(@e b bVar) {
        io.reactivex.internal.functions.a.g(bVar, "disposable is null");
        if (!this.f119531c) {
            synchronized (this) {
                if (!this.f119531c) {
                    k<b> kVar = this.f119530b;
                    if (kVar == null) {
                        kVar = new k<>();
                        this.f119530b = kVar;
                    }
                    kVar.a(bVar);
                    return true;
                }
            }
        }
        bVar.dispose();
        return false;
    }

    public boolean d(@e b... bVarArr) {
        io.reactivex.internal.functions.a.g(bVarArr, "disposables is null");
        if (!this.f119531c) {
            synchronized (this) {
                if (!this.f119531c) {
                    k<b> kVar = this.f119530b;
                    if (kVar == null) {
                        kVar = new k<>(bVarArr.length + 1);
                        this.f119530b = kVar;
                    }
                    for (b bVar : bVarArr) {
                        io.reactivex.internal.functions.a.g(bVar, "A Disposable in the disposables array is null");
                        kVar.a(bVar);
                    }
                    return true;
                }
            }
        }
        for (b bVar2 : bVarArr) {
            bVar2.dispose();
        }
        return false;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        if (this.f119531c) {
            return;
        }
        synchronized (this) {
            if (this.f119531c) {
                return;
            }
            this.f119531c = true;
            k<b> kVar = this.f119530b;
            this.f119530b = null;
            g(kVar);
        }
    }

    public void f() {
        if (this.f119531c) {
            return;
        }
        synchronized (this) {
            if (this.f119531c) {
                return;
            }
            k<b> kVar = this.f119530b;
            this.f119530b = null;
            g(kVar);
        }
    }

    void g(k<b> kVar) {
        if (kVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : kVar.b()) {
            if (obj instanceof b) {
                try {
                    ((b) obj).dispose();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw ExceptionHelper.f((Throwable) arrayList.get(0));
        }
    }

    public int h() {
        if (this.f119531c) {
            return 0;
        }
        synchronized (this) {
            if (this.f119531c) {
                return 0;
            }
            k<b> kVar = this.f119530b;
            return kVar != null ? kVar.g() : 0;
        }
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return this.f119531c;
    }
}
