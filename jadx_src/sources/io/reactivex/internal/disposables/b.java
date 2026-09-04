package io.reactivex.internal.disposables;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: ListCompositeDisposable.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b implements io.reactivex.disposables.b, a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    List<io.reactivex.disposables.b> f119554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile boolean f119555c;

    public b() {
    }

    public b(Iterable<? extends io.reactivex.disposables.b> iterable) {
        io.reactivex.internal.functions.a.g(iterable, "resources is null");
        this.f119554b = new LinkedList();
        for (io.reactivex.disposables.b bVar : iterable) {
            io.reactivex.internal.functions.a.g(bVar, "Disposable item is null");
            this.f119554b.add(bVar);
        }
    }

    public b(io.reactivex.disposables.b... bVarArr) {
        io.reactivex.internal.functions.a.g(bVarArr, "resources is null");
        this.f119554b = new LinkedList();
        for (io.reactivex.disposables.b bVar : bVarArr) {
            io.reactivex.internal.functions.a.g(bVar, "Disposable item is null");
            this.f119554b.add(bVar);
        }
    }

    @Override // io.reactivex.internal.disposables.a
    public boolean a(io.reactivex.disposables.b bVar) {
        if (!b(bVar)) {
            return false;
        }
        bVar.dispose();
        return true;
    }

    @Override // io.reactivex.internal.disposables.a
    public boolean b(io.reactivex.disposables.b bVar) {
        io.reactivex.internal.functions.a.g(bVar, "Disposable item is null");
        if (this.f119555c) {
            return false;
        }
        synchronized (this) {
            if (this.f119555c) {
                return false;
            }
            List<io.reactivex.disposables.b> list = this.f119554b;
            if (list != null && list.remove(bVar)) {
                return true;
            }
            return false;
        }
    }

    @Override // io.reactivex.internal.disposables.a
    public boolean c(io.reactivex.disposables.b bVar) {
        io.reactivex.internal.functions.a.g(bVar, "d is null");
        if (!this.f119555c) {
            synchronized (this) {
                if (!this.f119555c) {
                    List linkedList = this.f119554b;
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                        this.f119554b = linkedList;
                    }
                    linkedList.add(bVar);
                    return true;
                }
            }
        }
        bVar.dispose();
        return false;
    }

    public boolean d(io.reactivex.disposables.b... bVarArr) {
        io.reactivex.internal.functions.a.g(bVarArr, "ds is null");
        if (!this.f119555c) {
            synchronized (this) {
                if (!this.f119555c) {
                    List linkedList = this.f119554b;
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                        this.f119554b = linkedList;
                    }
                    for (io.reactivex.disposables.b bVar : bVarArr) {
                        io.reactivex.internal.functions.a.g(bVar, "d is null");
                        linkedList.add(bVar);
                    }
                    return true;
                }
            }
        }
        for (io.reactivex.disposables.b bVar2 : bVarArr) {
            bVar2.dispose();
        }
        return false;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        if (this.f119555c) {
            return;
        }
        synchronized (this) {
            if (this.f119555c) {
                return;
            }
            this.f119555c = true;
            List<io.reactivex.disposables.b> list = this.f119554b;
            this.f119554b = null;
            g(list);
        }
    }

    public void f() {
        if (this.f119555c) {
            return;
        }
        synchronized (this) {
            if (this.f119555c) {
                return;
            }
            List<io.reactivex.disposables.b> list = this.f119554b;
            this.f119554b = null;
            g(list);
        }
    }

    void g(List<io.reactivex.disposables.b> list) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = null;
        Iterator<io.reactivex.disposables.b> it = list.iterator();
        while (it.hasNext()) {
            try {
                it.next().dispose();
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th2);
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw ExceptionHelper.f((Throwable) arrayList.get(0));
        }
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return this.f119555c;
    }
}
