package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.j1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: TransitionManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f27945c = "TransitionManager";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Transition f27946d = new AutoTransition();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static ThreadLocal<WeakReference<androidx.collection.a<ViewGroup, ArrayList<Transition>>>> f27947e = new ThreadLocal<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static ArrayList<ViewGroup> f27948f = new ArrayList<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private androidx.collection.a<p, Transition> f27949a = new androidx.collection.a<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.collection.a<p, androidx.collection.a<p, Transition>> f27950b = new androidx.collection.a<>();

    /* JADX INFO: compiled from: TransitionManager.java */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Transition f27951b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ViewGroup f27952c;

        /* JADX INFO: renamed from: androidx.transition.v$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: TransitionManager.java */
        public class C0222a extends u {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.collection.a f27953b;

            C0222a(androidx.collection.a aVar) {
                this.f27953b = aVar;
            }

            @Override // androidx.transition.u, androidx.transition.Transition.h
            public void d(@androidx.annotation.n0 Transition transition) {
                ((ArrayList) this.f27953b.get(a.this.f27952c)).remove(transition);
                transition.n0(this);
            }
        }

        a(Transition transition, ViewGroup viewGroup) {
            this.f27951b = transition;
            this.f27952c = viewGroup;
        }

        private void a() {
            this.f27952c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f27952c.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!v.f27948f.remove(this.f27952c)) {
                return true;
            }
            androidx.collection.a<ViewGroup, ArrayList<Transition>> aVarE = v.e();
            ArrayList<Transition> arrayList = aVarE.get(this.f27952c);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                aVarE.put(this.f27952c, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f27951b);
            this.f27951b.a(new C0222a(aVarE));
            this.f27951b.n(this.f27952c, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).s0(this.f27952c);
                }
            }
            this.f27951b.m0(this.f27952c);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            v.f27948f.remove(this.f27952c);
            ArrayList<Transition> arrayList = v.e().get(this.f27952c);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<Transition> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().s0(this.f27952c);
                }
            }
            this.f27951b.o(true);
        }
    }

    public static void a(@androidx.annotation.n0 ViewGroup viewGroup) {
        b(viewGroup, null);
    }

    public static void b(@androidx.annotation.n0 ViewGroup viewGroup, @androidx.annotation.p0 Transition transition) {
        if (f27948f.contains(viewGroup) || !j1.U0(viewGroup)) {
            return;
        }
        f27948f.add(viewGroup);
        if (transition == null) {
            transition = f27946d;
        }
        Transition transitionClone = transition.clone();
        j(viewGroup, transitionClone);
        p.g(viewGroup, null);
        i(viewGroup, transitionClone);
    }

    private static void c(p pVar, Transition transition) {
        ViewGroup viewGroupE = pVar.e();
        if (f27948f.contains(viewGroupE)) {
            return;
        }
        p pVarC = p.c(viewGroupE);
        if (transition == null) {
            if (pVarC != null) {
                pVarC.b();
            }
            pVar.a();
            return;
        }
        f27948f.add(viewGroupE);
        Transition transitionClone = transition.clone();
        if (pVarC != null && pVarC.f()) {
            transitionClone.v0(true);
        }
        j(viewGroupE, transitionClone);
        pVar.a();
        i(viewGroupE, transitionClone);
    }

    public static void d(ViewGroup viewGroup) {
        f27948f.remove(viewGroup);
        ArrayList<Transition> arrayList = e().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((Transition) arrayList2.get(size)).F(viewGroup);
        }
    }

    static androidx.collection.a<ViewGroup, ArrayList<Transition>> e() {
        androidx.collection.a<ViewGroup, ArrayList<Transition>> aVar;
        WeakReference<androidx.collection.a<ViewGroup, ArrayList<Transition>>> weakReference = f27947e.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        androidx.collection.a<ViewGroup, ArrayList<Transition>> aVar2 = new androidx.collection.a<>();
        f27947e.set(new WeakReference<>(aVar2));
        return aVar2;
    }

    private Transition f(p pVar) {
        p pVarC;
        androidx.collection.a<p, Transition> aVar;
        Transition transition;
        ViewGroup viewGroupE = pVar.e();
        if (viewGroupE != null && (pVarC = p.c(viewGroupE)) != null && (aVar = this.f27950b.get(pVar)) != null && (transition = aVar.get(pVarC)) != null) {
            return transition;
        }
        Transition transition2 = this.f27949a.get(pVar);
        return transition2 != null ? transition2 : f27946d;
    }

    public static void g(@androidx.annotation.n0 p pVar) {
        c(pVar, f27946d);
    }

    public static void h(@androidx.annotation.n0 p pVar, @androidx.annotation.p0 Transition transition) {
        c(pVar, transition);
    }

    private static void i(ViewGroup viewGroup, Transition transition) {
        if (transition == null || viewGroup == null) {
            return;
        }
        a aVar = new a(transition, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void j(ViewGroup viewGroup, Transition transition) {
        ArrayList<Transition> arrayList = e().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<Transition> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().l0(viewGroup);
            }
        }
        if (transition != null) {
            transition.n(viewGroup, true);
        }
        p pVarC = p.c(viewGroup);
        if (pVarC != null) {
            pVarC.b();
        }
    }

    public void k(@androidx.annotation.n0 p pVar, @androidx.annotation.n0 p pVar2, @androidx.annotation.p0 Transition transition) {
        androidx.collection.a<p, Transition> aVar = this.f27950b.get(pVar2);
        if (aVar == null) {
            aVar = new androidx.collection.a<>();
            this.f27950b.put(pVar2, aVar);
        }
        aVar.put(pVar, transition);
    }

    public void l(@androidx.annotation.n0 p pVar, @androidx.annotation.p0 Transition transition) {
        this.f27949a.put(pVar, transition);
    }

    public void m(@androidx.annotation.n0 p pVar) {
        c(pVar, f(pVar));
    }
}
