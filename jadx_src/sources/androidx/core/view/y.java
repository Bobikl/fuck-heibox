package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.Lifecycle;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: MenuHostHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f21823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<p0> f21824b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<p0, a> f21825c = new HashMap();

    /* JADX INFO: compiled from: MenuHostHelper.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Lifecycle f21826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.lifecycle.v f21827b;

        a(@androidx.annotation.n0 Lifecycle lifecycle, @androidx.annotation.n0 androidx.lifecycle.v vVar) {
            this.f21826a = lifecycle;
            this.f21827b = vVar;
            lifecycle.a(vVar);
        }

        void a() {
            this.f21826a.d(this.f21827b);
            this.f21827b = null;
        }
    }

    public y(@androidx.annotation.n0 Runnable runnable) {
        this.f21823a = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(p0 p0Var, androidx.lifecycle.y yVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            l(p0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(Lifecycle.State state, p0 p0Var, androidx.lifecycle.y yVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.upTo(state)) {
            c(p0Var);
            return;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            l(p0Var);
        } else if (event == Lifecycle.Event.downFrom(state)) {
            this.f21824b.remove(p0Var);
            this.f21823a.run();
        }
    }

    public void c(@androidx.annotation.n0 p0 p0Var) {
        this.f21824b.add(p0Var);
        this.f21823a.run();
    }

    public void d(@androidx.annotation.n0 final p0 p0Var, @androidx.annotation.n0 androidx.lifecycle.y yVar) {
        c(p0Var);
        Lifecycle lifecycle = yVar.getLifecycle();
        a aVarRemove = this.f21825c.remove(p0Var);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f21825c.put(p0Var, new a(lifecycle, new androidx.lifecycle.v() { // from class: androidx.core.view.w
            @Override // androidx.lifecycle.v
            public final void d(androidx.lifecycle.y yVar2, Lifecycle.Event event) {
                this.f21818b.f(p0Var, yVar2, event);
            }
        }));
    }

    @SuppressLint({"LambdaLast"})
    public void e(@androidx.annotation.n0 final p0 p0Var, @androidx.annotation.n0 androidx.lifecycle.y yVar, @androidx.annotation.n0 final Lifecycle.State state) {
        Lifecycle lifecycle = yVar.getLifecycle();
        a aVarRemove = this.f21825c.remove(p0Var);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f21825c.put(p0Var, new a(lifecycle, new androidx.lifecycle.v() { // from class: androidx.core.view.x
            @Override // androidx.lifecycle.v
            public final void d(androidx.lifecycle.y yVar2, Lifecycle.Event event) {
                this.f21820b.g(state, p0Var, yVar2, event);
            }
        }));
    }

    public void h(@androidx.annotation.n0 Menu menu, @androidx.annotation.n0 MenuInflater menuInflater) {
        Iterator<p0> it = this.f21824b.iterator();
        while (it.hasNext()) {
            it.next().a(menu, menuInflater);
        }
    }

    public void i(@androidx.annotation.n0 Menu menu) {
        Iterator<p0> it = this.f21824b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
    }

    public boolean j(@androidx.annotation.n0 MenuItem menuItem) {
        Iterator<p0> it = this.f21824b.iterator();
        while (it.hasNext()) {
            if (it.next().d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void k(@androidx.annotation.n0 Menu menu) {
        Iterator<p0> it = this.f21824b.iterator();
        while (it.hasNext()) {
            it.next().c(menu);
        }
    }

    public void l(@androidx.annotation.n0 p0 p0Var) {
        this.f21824b.remove(p0Var);
        a aVarRemove = this.f21825c.remove(p0Var);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f21823a.run();
    }
}
