package io.reactivex.internal.operators.mixed;

import a.a.a.a.d.p.d.c;
import io.reactivex.d;
import io.reactivex.g;
import io.reactivex.g0;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.maybe.MaybeToObservable;
import io.reactivex.internal.operators.single.SingleToObservable;
import io.reactivex.o0;
import io.reactivex.w;
import java.util.concurrent.Callable;
import kh.o;

/* JADX INFO: compiled from: ScalarXMapZHelper.java */
/* JADX INFO: loaded from: classes12.dex */
public final class b {
    private b() {
        throw new IllegalStateException("No instances!");
    }

    static <T> boolean a(Object obj, o<? super T, ? extends g> oVar, d dVar) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            c.C0001c.a aVar = (Object) ((Callable) obj).call();
            g gVar = aVar != null ? (g) io.reactivex.internal.functions.a.g(oVar.apply(aVar), "The mapper returned a null CompletableSource") : null;
            if (gVar == null) {
                EmptyDisposable.complete(dVar);
            } else {
                gVar.d(dVar);
            }
            return true;
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            EmptyDisposable.error(th2, dVar);
            return true;
        }
    }

    static <T, R> boolean b(Object obj, o<? super T, ? extends w<? extends R>> oVar, g0<? super R> g0Var) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            c.C0001c.a aVar = (Object) ((Callable) obj).call();
            w wVar = aVar != null ? (w) io.reactivex.internal.functions.a.g(oVar.apply(aVar), "The mapper returned a null MaybeSource") : null;
            if (wVar == null) {
                EmptyDisposable.complete(g0Var);
            } else {
                wVar.f(MaybeToObservable.h8(g0Var));
            }
            return true;
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            EmptyDisposable.error(th2, g0Var);
            return true;
        }
    }

    static <T, R> boolean c(Object obj, o<? super T, ? extends o0<? extends R>> oVar, g0<? super R> g0Var) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            c.C0001c.a aVar = (Object) ((Callable) obj).call();
            o0 o0Var = aVar != null ? (o0) io.reactivex.internal.functions.a.g(oVar.apply(aVar), "The mapper returned a null SingleSource") : null;
            if (o0Var == null) {
                EmptyDisposable.complete(g0Var);
            } else {
                o0Var.f(SingleToObservable.h8(g0Var));
            }
            return true;
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            EmptyDisposable.error(th2, g0Var);
            return true;
        }
    }
}
