package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: FragmentTransitionCompat21.java */
/* JADX INFO: loaded from: classes6.dex */
@androidx.annotation.w0(21)
public class s0 extends t0 {

    /* JADX INFO: compiled from: FragmentTransitionCompat21.java */
    public class a extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f23814a;

        a(Rect rect) {
            this.f23814a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f23814a;
        }
    }

    /* JADX INFO: compiled from: FragmentTransitionCompat21.java */
    public class b implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f23816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f23817b;

        b(View view, ArrayList arrayList) {
            this.f23816a = view;
            this.f23817b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f23816a.setVisibility(8);
            int size = this.f23817b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f23817b.get(i10)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* JADX INFO: compiled from: FragmentTransitionCompat21.java */
    public class c implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f23819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f23820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f23821c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f23822d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f23823e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f23824f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f23819a = obj;
            this.f23820b = arrayList;
            this.f23821c = obj2;
            this.f23822d = arrayList2;
            this.f23823e = obj3;
            this.f23824f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f23819a;
            if (obj != null) {
                s0.this.n(obj, this.f23820b, null);
            }
            Object obj2 = this.f23821c;
            if (obj2 != null) {
                s0.this.n(obj2, this.f23822d, null);
            }
            Object obj3 = this.f23823e;
            if (obj3 != null) {
                s0.this.n(obj3, this.f23824f, null);
            }
        }
    }

    /* JADX INFO: compiled from: FragmentTransitionCompat21.java */
    public class d implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f23826a;

        d(Runnable runnable) {
            this.f23826a = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f23826a.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* JADX INFO: compiled from: FragmentTransitionCompat21.java */
    public class e extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f23828a;

        e(Rect rect) {
            this.f23828a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f23828a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f23828a;
        }
    }

    s0() {
    }

    private static boolean x(Transition transition) {
        return (t0.i(transition.getTargetIds()) && t0.i(transition.getTargetNames()) && t0.i(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.t0
    public void a(@androidx.annotation.n0 Object obj, @androidx.annotation.n0 View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.t0
    public void b(@androidx.annotation.n0 Object obj, @androidx.annotation.n0 ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i10 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i10 < transitionCount) {
                b(transitionSet.getTransitionAt(i10), arrayList);
                i10++;
            }
            return;
        }
        if (x(transition) || !t0.i(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            transition.addTarget(arrayList.get(i10));
            i10++;
        }
    }

    @Override // androidx.fragment.app.t0
    public void c(@androidx.annotation.n0 ViewGroup viewGroup, @androidx.annotation.p0 Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.t0
    public boolean e(@androidx.annotation.n0 Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.t0
    public Object f(@androidx.annotation.p0 Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.t0
    public Object j(@androidx.annotation.p0 Object obj, @androidx.annotation.p0 Object obj2, @androidx.annotation.p0 Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.t0
    public Object k(@androidx.annotation.p0 Object obj, @androidx.annotation.p0 Object obj2, @androidx.annotation.p0 Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.t0
    public void m(@androidx.annotation.n0 Object obj, @androidx.annotation.n0 View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.t0
    public void n(@androidx.annotation.n0 Object obj, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i10 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i10 < transitionCount) {
                n(transitionSet.getTransitionAt(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (x(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i10 < size) {
            transition.addTarget(arrayList2.get(i10));
            i10++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }

    @Override // androidx.fragment.app.t0
    public void o(@androidx.annotation.n0 Object obj, @androidx.annotation.n0 View view, @androidx.annotation.n0 ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.t0
    public void p(@androidx.annotation.n0 Object obj, @androidx.annotation.p0 Object obj2, @androidx.annotation.p0 ArrayList<View> arrayList, @androidx.annotation.p0 Object obj3, @androidx.annotation.p0 ArrayList<View> arrayList2, @androidx.annotation.p0 Object obj4, @androidx.annotation.p0 ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.t0
    public void q(@androidx.annotation.n0 Object obj, @androidx.annotation.n0 Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new e(rect));
        }
    }

    @Override // androidx.fragment.app.t0
    public void r(@androidx.annotation.n0 Object obj, @androidx.annotation.p0 View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(rect));
        }
    }

    @Override // androidx.fragment.app.t0
    public void s(@androidx.annotation.n0 Fragment fragment, @androidx.annotation.n0 Object obj, @androidx.annotation.n0 androidx.core.os.f fVar, @androidx.annotation.n0 Runnable runnable) {
        ((Transition) obj).addListener(new d(runnable));
    }

    @Override // androidx.fragment.app.t0
    public void u(@androidx.annotation.n0 Object obj, @androidx.annotation.n0 View view, @androidx.annotation.n0 ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            t0.d(targets, arrayList.get(i10));
        }
        targets.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.t0
    public void v(@androidx.annotation.p0 Object obj, @androidx.annotation.p0 ArrayList<View> arrayList, @androidx.annotation.p0 ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            n(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.t0
    public Object w(@androidx.annotation.p0 Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }
}
