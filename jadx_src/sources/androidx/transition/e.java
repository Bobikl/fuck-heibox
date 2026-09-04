package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: FragmentTransitionSupport.java */
/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"RestrictedApi"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class e extends androidx.fragment.app.t0 {

    /* JADX INFO: compiled from: FragmentTransitionSupport.java */
    public class a extends Transition.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f27842a;

        a(Rect rect) {
            this.f27842a = rect;
        }

        @Override // androidx.transition.Transition.f
        public Rect a(@androidx.annotation.n0 Transition transition) {
            return this.f27842a;
        }
    }

    /* JADX INFO: compiled from: FragmentTransitionSupport.java */
    public class b implements Transition.h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f27844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f27845c;

        b(View view, ArrayList arrayList) {
            this.f27844b = view;
            this.f27845c = arrayList;
        }

        @Override // androidx.transition.Transition.h
        public void a(@androidx.annotation.n0 Transition transition) {
        }

        @Override // androidx.transition.Transition.h
        public void b(@androidx.annotation.n0 Transition transition) {
            transition.n0(this);
            transition.a(this);
        }

        @Override // androidx.transition.Transition.h
        public void c(@androidx.annotation.n0 Transition transition) {
        }

        @Override // androidx.transition.Transition.h
        public void d(@androidx.annotation.n0 Transition transition) {
            transition.n0(this);
            this.f27844b.setVisibility(8);
            int size = this.f27845c.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f27845c.get(i10)).setVisibility(0);
            }
        }

        @Override // androidx.transition.Transition.h
        public void e(@androidx.annotation.n0 Transition transition) {
        }
    }

    /* JADX INFO: compiled from: FragmentTransitionSupport.java */
    public class c extends u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f27847b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f27848c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f27849d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f27850e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f27851f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ArrayList f27852g;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f27847b = obj;
            this.f27848c = arrayList;
            this.f27849d = obj2;
            this.f27850e = arrayList2;
            this.f27851f = obj3;
            this.f27852g = arrayList3;
        }

        @Override // androidx.transition.u, androidx.transition.Transition.h
        public void b(@androidx.annotation.n0 Transition transition) {
            Object obj = this.f27847b;
            if (obj != null) {
                e.this.n(obj, this.f27848c, null);
            }
            Object obj2 = this.f27849d;
            if (obj2 != null) {
                e.this.n(obj2, this.f27850e, null);
            }
            Object obj3 = this.f27851f;
            if (obj3 != null) {
                e.this.n(obj3, this.f27852g, null);
            }
        }

        @Override // androidx.transition.u, androidx.transition.Transition.h
        public void d(@androidx.annotation.n0 Transition transition) {
            transition.n0(this);
        }
    }

    /* JADX INFO: compiled from: FragmentTransitionSupport.java */
    public class d implements androidx.core.os.f.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Transition f27854a;

        d(Transition transition) {
            this.f27854a = transition;
        }

        @Override // androidx.core.os.f.b
        public void onCancel() {
            this.f27854a.cancel();
        }
    }

    /* JADX INFO: renamed from: androidx.transition.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FragmentTransitionSupport.java */
    public class C0221e implements Transition.h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f27856b;

        C0221e(Runnable runnable) {
            this.f27856b = runnable;
        }

        @Override // androidx.transition.Transition.h
        public void a(@androidx.annotation.n0 Transition transition) {
        }

        @Override // androidx.transition.Transition.h
        public void b(@androidx.annotation.n0 Transition transition) {
        }

        @Override // androidx.transition.Transition.h
        public void c(@androidx.annotation.n0 Transition transition) {
        }

        @Override // androidx.transition.Transition.h
        public void d(@androidx.annotation.n0 Transition transition) {
            this.f27856b.run();
        }

        @Override // androidx.transition.Transition.h
        public void e(@androidx.annotation.n0 Transition transition) {
        }
    }

    /* JADX INFO: compiled from: FragmentTransitionSupport.java */
    public class f extends Transition.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f27858a;

        f(Rect rect) {
            this.f27858a = rect;
        }

        @Override // androidx.transition.Transition.f
        public Rect a(@androidx.annotation.n0 Transition transition) {
            Rect rect = this.f27858a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f27858a;
        }
    }

    private static boolean x(Transition transition) {
        return (androidx.fragment.app.t0.i(transition.T()) && androidx.fragment.app.t0.i(transition.U()) && androidx.fragment.app.t0.i(transition.V())) ? false : true;
    }

    @Override // androidx.fragment.app.t0
    public void a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).c(view);
        }
    }

    @Override // androidx.fragment.app.t0
    public void b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i10 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int iR0 = transitionSet.R0();
            while (i10 < iR0) {
                b(transitionSet.Q0(i10), arrayList);
                i10++;
            }
            return;
        }
        if (x(transition) || !androidx.fragment.app.t0.i(transition.X())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            transition.c(arrayList.get(i10));
            i10++;
        }
    }

    @Override // androidx.fragment.app.t0
    public void c(ViewGroup viewGroup, Object obj) {
        v.b(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.t0
    public boolean e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.t0
    public Object f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.t0
    public Object j(Object obj, Object obj2, Object obj3) {
        Transition transitionC1 = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (transitionC1 != null && transition != null) {
            transitionC1 = new TransitionSet().N0(transitionC1).N0(transition).c1(1);
        } else if (transitionC1 == null) {
            transitionC1 = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return transitionC1;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transitionC1 != null) {
            transitionSet.N0(transitionC1);
        }
        transitionSet.N0(transition2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.t0
    public Object k(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.N0((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.N0((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.N0((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.t0
    public void m(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).p0(view);
        }
    }

    @Override // androidx.fragment.app.t0
    public void n(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        Transition transition = (Transition) obj;
        int i10 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int iR0 = transitionSet.R0();
            while (i10 < iR0) {
                n(transitionSet.Q0(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (x(transition)) {
            return;
        }
        List<View> listX = transition.X();
        if (listX.size() == arrayList.size() && listX.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i10 < size) {
                transition.c(arrayList2.get(i10));
                i10++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.p0(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.t0
    public void o(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).a(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.t0
    public void p(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.t0
    public void q(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).x0(new f(rect));
        }
    }

    @Override // androidx.fragment.app.t0
    public void r(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((Transition) obj).x0(new a(rect));
        }
    }

    @Override // androidx.fragment.app.t0
    public void s(@androidx.annotation.n0 Fragment fragment, @androidx.annotation.n0 Object obj, @androidx.annotation.n0 androidx.core.os.f fVar, @androidx.annotation.n0 Runnable runnable) {
        Transition transition = (Transition) obj;
        fVar.d(new d(transition));
        transition.a(new C0221e(runnable));
    }

    @Override // androidx.fragment.app.t0
    public void u(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> listX = transitionSet.X();
        listX.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.fragment.app.t0.d(listX, arrayList.get(i10));
        }
        listX.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.t0
    public void v(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.X().clear();
            transitionSet.X().addAll(arrayList2);
            n(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.t0
    public Object w(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.N0((Transition) obj);
        return transitionSet;
    }
}
