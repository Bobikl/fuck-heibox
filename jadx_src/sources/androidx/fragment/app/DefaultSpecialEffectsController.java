package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.p3;
import androidx.core.view.j1;
import androidx.core.view.y2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.c1;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nDefaultSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,877:1\n288#2,2:878\n533#2,6:880\n819#2:886\n847#2,2:887\n766#2:889\n857#2,2:890\n1789#2,3:892\n819#2:895\n847#2,2:896\n1855#2,2:898\n*S KotlinDebug\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController\n*L\n47#1:878,2\n53#1:880,6\n312#1:886\n312#1:887,2\n315#1:889\n315#1:890,2\n317#1:892,3\n629#1:895\n629#1:896,2\n632#1:898,2\n*E\n"})
public final class DefaultSpecialEffectsController extends SpecialEffectsController {

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    public static final class a extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f23491c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f23492d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dl.e
        private p.a f23493e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@dl.d SpecialEffectsController.Operation operation, @dl.d androidx.core.os.f signal, boolean z10) {
            super(operation, signal);
            kotlin.jvm.internal.f0.p(operation, "operation");
            kotlin.jvm.internal.f0.p(signal, "signal");
            this.f23491c = z10;
        }

        @dl.e
        public final p.a e(@dl.d Context context) {
            kotlin.jvm.internal.f0.p(context, "context");
            if (this.f23492d) {
                return this.f23493e;
            }
            p.a aVarB = p.b(context, b().h(), b().g() == SpecialEffectsController.Operation.State.VISIBLE, this.f23491c);
            this.f23493e = aVarB;
            this.f23492d = true;
            return aVarB;
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final SpecialEffectsController.Operation f23494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final androidx.core.os.f f23495b;

        public b(@dl.d SpecialEffectsController.Operation operation, @dl.d androidx.core.os.f signal) {
            kotlin.jvm.internal.f0.p(operation, "operation");
            kotlin.jvm.internal.f0.p(signal, "signal");
            this.f23494a = operation;
            this.f23495b = signal;
        }

        public final void a() {
            this.f23494a.f(this.f23495b);
        }

        @dl.d
        public final SpecialEffectsController.Operation b() {
            return this.f23494a;
        }

        @dl.d
        public final androidx.core.os.f c() {
            return this.f23495b;
        }

        public final boolean d() {
            SpecialEffectsController.Operation.State state;
            SpecialEffectsController.Operation.State.a aVar = SpecialEffectsController.Operation.State.Companion;
            View view = this.f23494a.h().mView;
            kotlin.jvm.internal.f0.o(view, "operation.fragment.mView");
            SpecialEffectsController.Operation.State stateA = aVar.a(view);
            SpecialEffectsController.Operation.State stateG = this.f23494a.g();
            return stateA == stateG || !(stateA == (state = SpecialEffectsController.Operation.State.VISIBLE) || stateG == state);
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    public static final class c extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.e
        private final Object f23496c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f23497d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dl.e
        private final Object f23498e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@dl.d SpecialEffectsController.Operation operation, @dl.d androidx.core.os.f signal, boolean z10, boolean z11) {
            Object returnTransition;
            super(operation, signal);
            kotlin.jvm.internal.f0.p(operation, "operation");
            kotlin.jvm.internal.f0.p(signal, "signal");
            SpecialEffectsController.Operation.State stateG = operation.g();
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            if (stateG == state) {
                Fragment fragmentH = operation.h();
                returnTransition = z10 ? fragmentH.getReenterTransition() : fragmentH.getEnterTransition();
            } else {
                Fragment fragmentH2 = operation.h();
                returnTransition = z10 ? fragmentH2.getReturnTransition() : fragmentH2.getExitTransition();
            }
            this.f23496c = returnTransition;
            this.f23497d = operation.g() == state ? z10 ? operation.h().getAllowReturnTransitionOverlap() : operation.h().getAllowEnterTransitionOverlap() : true;
            this.f23498e = z11 ? z10 ? operation.h().getSharedElementReturnTransition() : operation.h().getSharedElementEnterTransition() : null;
        }

        private final t0 f(Object obj) {
            if (obj == null) {
                return null;
            }
            t0 t0Var = r0.f23811b;
            if (t0Var != null && t0Var.e(obj)) {
                return t0Var;
            }
            t0 t0Var2 = r0.f23812c;
            if (t0Var2 != null && t0Var2.e(obj)) {
                return t0Var2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().h() + " is not a valid framework Transition or AndroidX Transition");
        }

        @dl.e
        public final t0 e() {
            t0 t0VarF = f(this.f23496c);
            t0 t0VarF2 = f(this.f23498e);
            if (t0VarF == null || t0VarF2 == null || t0VarF == t0VarF2) {
                return t0VarF == null ? t0VarF2 : t0VarF;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().h() + " returned Transition " + this.f23496c + " which uses a different Transition  type than its shared element transition " + this.f23498e).toString());
        }

        @dl.e
        public final Object g() {
            return this.f23498e;
        }

        @dl.e
        public final Object h() {
            return this.f23496c;
        }

        public final boolean i() {
            return this.f23498e != null;
        }

        public final boolean j() {
            return this.f23497d;
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    public static final class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f23500c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f23501d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ SpecialEffectsController.Operation f23502e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ a f23503f;

        d(View view, boolean z10, SpecialEffectsController.Operation operation, a aVar) {
            this.f23500c = view;
            this.f23501d = z10;
            this.f23502e = operation;
            this.f23503f = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@dl.d Animator anim) {
            kotlin.jvm.internal.f0.p(anim, "anim");
            DefaultSpecialEffectsController.this.q().endViewTransition(this.f23500c);
            if (this.f23501d) {
                SpecialEffectsController.Operation.State stateG = this.f23502e.g();
                View viewToAnimate = this.f23500c;
                kotlin.jvm.internal.f0.o(viewToAnimate, "viewToAnimate");
                stateG.applyState(viewToAnimate);
            }
            this.f23503f.a();
            if (FragmentManager.X0(2)) {
                Log.v(FragmentManager.X, "Animator from operation " + this.f23502e + " has ended.");
            }
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    public static final class e implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SpecialEffectsController.Operation f23504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ DefaultSpecialEffectsController f23505b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f23506c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f23507d;

        e(SpecialEffectsController.Operation operation, DefaultSpecialEffectsController defaultSpecialEffectsController, View view, a aVar) {
            this.f23504a = operation;
            this.f23505b = defaultSpecialEffectsController;
            this.f23506c = view;
            this.f23507d = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(DefaultSpecialEffectsController this$0, View view, a animationInfo) {
            kotlin.jvm.internal.f0.p(this$0, "this$0");
            kotlin.jvm.internal.f0.p(animationInfo, "$animationInfo");
            this$0.q().endViewTransition(view);
            animationInfo.a();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(@dl.d Animation animation) {
            kotlin.jvm.internal.f0.p(animation, "animation");
            ViewGroup viewGroupQ = this.f23505b.q();
            final DefaultSpecialEffectsController defaultSpecialEffectsController = this.f23505b;
            final View view = this.f23506c;
            final a aVar = this.f23507d;
            viewGroupQ.post(new Runnable() { // from class: androidx.fragment.app.i
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultSpecialEffectsController.e.b(defaultSpecialEffectsController, view, aVar);
                }
            });
            if (FragmentManager.X0(2)) {
                Log.v(FragmentManager.X, "Animation from operation " + this.f23504a + " has ended.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(@dl.d Animation animation) {
            kotlin.jvm.internal.f0.p(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(@dl.d Animation animation) {
            kotlin.jvm.internal.f0.p(animation, "animation");
            if (FragmentManager.X0(2)) {
                Log.v(FragmentManager.X, "Animation from operation " + this.f23504a + " has reached onAnimationStart.");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController(@dl.d ViewGroup container) {
        super(container);
        kotlin.jvm.internal.f0.p(container, "container");
    }

    private final void D(SpecialEffectsController.Operation operation) {
        View view = operation.h().mView;
        SpecialEffectsController.Operation.State stateG = operation.g();
        kotlin.jvm.internal.f0.o(view, "view");
        stateG.applyState(view);
    }

    private final void E(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (y2.c(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View child = viewGroup.getChildAt(i10);
            if (child.getVisibility() == 0) {
                kotlin.jvm.internal.f0.o(child, "child");
                E(arrayList, child);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(List awaitingContainerChanges, SpecialEffectsController.Operation operation, DefaultSpecialEffectsController this$0) {
        kotlin.jvm.internal.f0.p(awaitingContainerChanges, "$awaitingContainerChanges");
        kotlin.jvm.internal.f0.p(operation, "$operation");
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        if (awaitingContainerChanges.contains(operation)) {
            awaitingContainerChanges.remove(operation);
            this$0.D(operation);
        }
    }

    private final void G(Map<String, View> map, View view) {
        String strX0 = j1.x0(view);
        if (strX0 != null) {
            map.put(strX0, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View child = viewGroup.getChildAt(i10);
                if (child.getVisibility() == 0) {
                    kotlin.jvm.internal.f0.o(child, "child");
                    G(map, child);
                }
            }
        }
    }

    private final void H(androidx.collection.a<String, View> aVar, final Collection<String> collection) {
        Set<Map.Entry<String, View>> entries = aVar.entrySet();
        kotlin.jvm.internal.f0.o(entries, "entries");
        kotlin.collections.x.N0(entries, new yh.l<Map.Entry<String, View>, Boolean>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$retainMatchingViews$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.d Map.Entry<String, View> entry) {
                kotlin.jvm.internal.f0.p(entry, "entry");
                return Boolean.valueOf(CollectionsKt___CollectionsKt.R1(collection, j1.x0(entry.getValue())));
            }
        });
    }

    private final void I(List<a> list, List<SpecialEffectsController.Operation> list2, boolean z10, Map<SpecialEffectsController.Operation, Boolean> map) {
        Context context = q().getContext();
        ArrayList<a> arrayList = new ArrayList();
        boolean z11 = false;
        for (a aVar : list) {
            if (aVar.d()) {
                aVar.a();
            } else {
                kotlin.jvm.internal.f0.o(context, "context");
                p.a aVarE = aVar.e(context);
                if (aVarE == null) {
                    aVar.a();
                } else {
                    final Animator animator = aVarE.f23768b;
                    if (animator == null) {
                        arrayList.add(aVar);
                    } else {
                        final SpecialEffectsController.Operation operationB = aVar.b();
                        Fragment fragmentH = operationB.h();
                        if (kotlin.jvm.internal.f0.g(map.get(operationB), Boolean.TRUE)) {
                            if (FragmentManager.X0(2)) {
                                Log.v(FragmentManager.X, "Ignoring Animator set on " + fragmentH + " as this Fragment was involved in a Transition.");
                            }
                            aVar.a();
                        } else {
                            boolean z12 = operationB.g() == SpecialEffectsController.Operation.State.GONE;
                            if (z12) {
                                list2.remove(operationB);
                            }
                            View view = fragmentH.mView;
                            q().startViewTransition(view);
                            animator.addListener(new d(view, z12, operationB, aVar));
                            animator.setTarget(view);
                            animator.start();
                            if (FragmentManager.X0(2)) {
                                Log.v(FragmentManager.X, "Animator from operation " + operationB + " has started.");
                            }
                            aVar.c().d(new androidx.core.os.f.b() { // from class: androidx.fragment.app.g
                                @Override // androidx.core.os.f.b
                                public final void onCancel() {
                                    DefaultSpecialEffectsController.J(animator, operationB);
                                }
                            });
                            z11 = true;
                        }
                    }
                }
            }
        }
        for (final a aVar2 : arrayList) {
            final SpecialEffectsController.Operation operationB2 = aVar2.b();
            Fragment fragmentH2 = operationB2.h();
            if (z10) {
                if (FragmentManager.X0(2)) {
                    Log.v(FragmentManager.X, "Ignoring Animation set on " + fragmentH2 + " as Animations cannot run alongside Transitions.");
                }
                aVar2.a();
            } else if (z11) {
                if (FragmentManager.X0(2)) {
                    Log.v(FragmentManager.X, "Ignoring Animation set on " + fragmentH2 + " as Animations cannot run alongside Animators.");
                }
                aVar2.a();
            } else {
                final View view2 = fragmentH2.mView;
                kotlin.jvm.internal.f0.o(context, "context");
                p.a aVarE2 = aVar2.e(context);
                if (aVarE2 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                Animation animation = aVarE2.f23767a;
                if (animation == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                if (operationB2.g() != SpecialEffectsController.Operation.State.REMOVED) {
                    view2.startAnimation(animation);
                    aVar2.a();
                } else {
                    q().startViewTransition(view2);
                    p.b bVar = new p.b(animation, q(), view2);
                    bVar.setAnimationListener(new e(operationB2, this, view2, aVar2));
                    view2.startAnimation(bVar);
                    if (FragmentManager.X0(2)) {
                        Log.v(FragmentManager.X, "Animation from operation " + operationB2 + " has started.");
                    }
                }
                aVar2.c().d(new androidx.core.os.f.b() { // from class: androidx.fragment.app.h
                    @Override // androidx.core.os.f.b
                    public final void onCancel() {
                        DefaultSpecialEffectsController.K(view2, this, aVar2, operationB2);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(Animator animator, SpecialEffectsController.Operation operation) {
        kotlin.jvm.internal.f0.p(operation, "$operation");
        animator.end();
        if (FragmentManager.X0(2)) {
            Log.v(FragmentManager.X, "Animator from operation " + operation + " has been canceled.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(View view, DefaultSpecialEffectsController this$0, a animationInfo, SpecialEffectsController.Operation operation) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(animationInfo, "$animationInfo");
        kotlin.jvm.internal.f0.p(operation, "$operation");
        view.clearAnimation();
        this$0.q().endViewTransition(view);
        animationInfo.a();
        if (FragmentManager.X0(2)) {
            Log.v(FragmentManager.X, "Animation from operation " + operation + " has been cancelled.");
        }
    }

    private final Map<SpecialEffectsController.Operation, Boolean> L(List<c> list, List<SpecialEffectsController.Operation> list2, final boolean z10, final SpecialEffectsController.Operation operation, final SpecialEffectsController.Operation operation2) {
        View view;
        Object obj;
        Object objK;
        View view2;
        Object obj2;
        LinkedHashMap linkedHashMap;
        Object obj3;
        SpecialEffectsController.Operation operation3;
        final ArrayList<View> arrayList;
        Rect rect;
        View view3;
        Rect rect2;
        Object obj4;
        Object obj5;
        View view4;
        final Rect rect3;
        final View view5;
        DefaultSpecialEffectsController defaultSpecialEffectsController = this;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj6 : list) {
            if (!((c) obj6).d()) {
                arrayList2.add(obj6);
            }
        }
        ArrayList<c> arrayList3 = new ArrayList();
        for (Object obj7 : arrayList2) {
            if (((c) obj7).e() != null) {
                arrayList3.add(obj7);
            }
        }
        final t0 t0Var = null;
        for (c cVar : arrayList3) {
            t0 t0VarE = cVar.e();
            if (!(t0Var == null || t0VarE == t0Var)) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + cVar.b().h() + " returned Transition " + cVar.h() + " which uses a different Transition type than other Fragments.").toString());
            }
            t0Var = t0VarE;
        }
        if (t0Var == null) {
            for (c cVar2 : list) {
                linkedHashMap2.put(cVar2.b(), Boolean.FALSE);
                cVar2.a();
            }
            return linkedHashMap2;
        }
        View view6 = new View(q().getContext());
        Rect rect4 = new Rect();
        ArrayList<View> arrayList4 = new ArrayList<>();
        ArrayList<View> arrayList5 = new ArrayList<>();
        androidx.collection.a aVar = new androidx.collection.a();
        View view7 = null;
        Object obj8 = null;
        boolean z11 = false;
        for (c cVar3 : list) {
            if (!cVar3.i() || operation == null || operation2 == null) {
                rect2 = rect4;
                view6 = view6;
                arrayList5 = arrayList5;
                arrayList4 = arrayList4;
                linkedHashMap2 = linkedHashMap2;
                view7 = view7;
                aVar = aVar;
                rect4 = rect2;
            } else {
                Object objW = t0Var.w(t0Var.f(cVar3.g()));
                ArrayList<String> sharedElementSourceNames = operation2.h().getSharedElementSourceNames();
                kotlin.jvm.internal.f0.o(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementSourceNames2 = operation.h().getSharedElementSourceNames();
                View view8 = view7;
                kotlin.jvm.internal.f0.o(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementTargetNames = operation.h().getSharedElementTargetNames();
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                kotlin.jvm.internal.f0.o(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                int size = sharedElementTargetNames.size();
                View view9 = view6;
                Rect rect5 = rect4;
                int i10 = 0;
                while (i10 < size) {
                    int i11 = size;
                    int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i10));
                    if (iIndexOf != -1) {
                        sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i10));
                    }
                    i10++;
                    size = i11;
                }
                ArrayList<String> sharedElementTargetNames2 = operation2.h().getSharedElementTargetNames();
                kotlin.jvm.internal.f0.o(sharedElementTargetNames2, "lastIn.fragment.sharedElementTargetNames");
                Pair pairA = !z10 ? c1.a(operation.h().getExitTransitionCallback(), operation2.h().getEnterTransitionCallback()) : c1.a(operation.h().getEnterTransitionCallback(), operation2.h().getExitTransitionCallback());
                p3 p3Var = (p3) pairA.a();
                p3 p3Var2 = (p3) pairA.b();
                int size2 = sharedElementSourceNames.size();
                int i12 = 0;
                while (i12 < size2) {
                    aVar.put(sharedElementSourceNames.get(i12), sharedElementTargetNames2.get(i12));
                    i12++;
                    size2 = size2;
                    t0Var = t0Var;
                }
                t0 t0Var2 = t0Var;
                if (FragmentManager.X0(2)) {
                    Log.v(FragmentManager.X, ">>> entering view names <<<");
                    for (Iterator<String> it = sharedElementTargetNames2.iterator(); it.hasNext(); it = it) {
                        Log.v(FragmentManager.X, "Name: " + it.next());
                    }
                    Log.v(FragmentManager.X, ">>> exiting view names <<<");
                    for (Iterator<String> it2 = sharedElementSourceNames.iterator(); it2.hasNext(); it2 = it2) {
                        Log.v(FragmentManager.X, "Name: " + it2.next());
                    }
                }
                androidx.collection.a<String, View> aVar2 = new androidx.collection.a<>();
                View view10 = operation.h().mView;
                kotlin.jvm.internal.f0.o(view10, "firstOut.fragment.mView");
                defaultSpecialEffectsController.G(aVar2, view10);
                aVar2.r(sharedElementSourceNames);
                if (p3Var != null) {
                    if (FragmentManager.X0(2)) {
                        Log.v(FragmentManager.X, "Executing exit callback for operation " + operation);
                    }
                    p3Var.d(sharedElementSourceNames, aVar2);
                    int size3 = sharedElementSourceNames.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i13 = size3 - 1;
                            String str = sharedElementSourceNames.get(size3);
                            View view11 = aVar2.get(str);
                            if (view11 == null) {
                                aVar.remove(str);
                                obj4 = objW;
                            } else {
                                obj4 = objW;
                                if (!kotlin.jvm.internal.f0.g(str, j1.x0(view11))) {
                                    aVar.put(j1.x0(view11), (String) aVar.remove(str));
                                }
                            }
                            if (i13 < 0) {
                                break;
                            }
                            size3 = i13;
                            objW = obj4;
                        }
                    } else {
                        obj4 = objW;
                    }
                } else {
                    obj4 = objW;
                    aVar.r(aVar2.keySet());
                }
                final androidx.collection.a<String, View> aVar3 = new androidx.collection.a<>();
                View view12 = operation2.h().mView;
                kotlin.jvm.internal.f0.o(view12, "lastIn.fragment.mView");
                defaultSpecialEffectsController.G(aVar3, view12);
                aVar3.r(sharedElementTargetNames2);
                aVar3.r(aVar.values());
                if (p3Var2 != null) {
                    if (FragmentManager.X0(2)) {
                        Log.v(FragmentManager.X, "Executing enter callback for operation " + operation2);
                    }
                    p3Var2.d(sharedElementTargetNames2, aVar3);
                    int size4 = sharedElementTargetNames2.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i14 = size4 - 1;
                            String name = sharedElementTargetNames2.get(size4);
                            View view13 = aVar3.get(name);
                            if (view13 == null) {
                                kotlin.jvm.internal.f0.o(name, "name");
                                String strB = r0.b(aVar, name);
                                if (strB != null) {
                                    aVar.remove(strB);
                                }
                            } else if (!kotlin.jvm.internal.f0.g(name, j1.x0(view13))) {
                                kotlin.jvm.internal.f0.o(name, "name");
                                String strB2 = r0.b(aVar, name);
                                if (strB2 != null) {
                                    aVar.put(strB2, j1.x0(view13));
                                }
                            }
                            if (i14 < 0) {
                                break;
                            }
                            size4 = i14;
                        }
                    }
                } else {
                    r0.d(aVar, aVar3);
                }
                Collection<String> collectionKeySet = aVar.keySet();
                kotlin.jvm.internal.f0.o(collectionKeySet, "sharedElementNameMapping.keys");
                defaultSpecialEffectsController.H(aVar2, collectionKeySet);
                Collection<String> collectionValues = aVar.values();
                kotlin.jvm.internal.f0.o(collectionValues, "sharedElementNameMapping.values");
                defaultSpecialEffectsController.H(aVar3, collectionValues);
                if (aVar.isEmpty()) {
                    arrayList4.clear();
                    arrayList5.clear();
                    view7 = view8;
                    rect4 = rect5;
                    linkedHashMap2 = linkedHashMap3;
                    view6 = view9;
                    t0Var = t0Var2;
                    obj8 = null;
                } else {
                    r0.a(operation2.h(), operation.h(), z10, aVar2, true);
                    androidx.core.view.c1.a(q(), new Runnable() { // from class: androidx.fragment.app.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.P(operation2, operation, z10, aVar3);
                        }
                    });
                    arrayList4.addAll(aVar2.values());
                    if (!sharedElementSourceNames.isEmpty()) {
                        view4 = aVar2.get(sharedElementSourceNames.get(0));
                        obj5 = obj4;
                        t0Var = t0Var2;
                        t0Var.r(obj5, view4);
                    } else {
                        obj5 = obj4;
                        t0Var = t0Var2;
                        view4 = view8;
                    }
                    arrayList5.addAll(aVar3.values());
                    if (!(!sharedElementTargetNames2.isEmpty()) || (view5 = aVar3.get(sharedElementTargetNames2.get(0))) == null) {
                        rect3 = rect5;
                    } else {
                        rect3 = rect5;
                        androidx.core.view.c1.a(q(), new Runnable() { // from class: androidx.fragment.app.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                DefaultSpecialEffectsController.M(t0Var, view5, rect3);
                            }
                        });
                        z11 = true;
                    }
                    t0Var.u(obj5, view9, arrayList4);
                    obj8 = obj5;
                    ArrayList<View> arrayList6 = arrayList5;
                    rect2 = rect3;
                    t0Var.p(obj8, null, null, null, null, obj5, arrayList6);
                    Boolean bool = Boolean.TRUE;
                    linkedHashMap3.put(operation, bool);
                    linkedHashMap3.put(operation2, bool);
                    view7 = view4;
                    arrayList5 = arrayList6;
                    arrayList4 = arrayList4;
                    aVar = aVar;
                    view6 = view9;
                    linkedHashMap2 = linkedHashMap3;
                    rect4 = rect2;
                }
            }
        }
        View view14 = view7;
        androidx.collection.a aVar4 = aVar;
        ArrayList<View> arrayList7 = arrayList5;
        ArrayList<View> arrayList8 = arrayList4;
        Rect rect6 = rect4;
        LinkedHashMap linkedHashMap4 = linkedHashMap2;
        View view15 = view6;
        ArrayList arrayList9 = new ArrayList();
        Iterator<c> it3 = list.iterator();
        Object obj9 = null;
        Object objK2 = null;
        while (it3.hasNext()) {
            c next = it3.next();
            if (next.d()) {
                linkedHashMap4.put(next.b(), Boolean.FALSE);
                next.a();
            } else {
                Object objF = t0Var.f(next.h());
                SpecialEffectsController.Operation operationB = next.b();
                boolean z12 = obj8 != null && (operationB == operation || operationB == operation2);
                if (objF != null) {
                    LinkedHashMap linkedHashMap5 = linkedHashMap4;
                    ArrayList<View> arrayList10 = new ArrayList<>();
                    Iterator<c> it4 = it3;
                    View view16 = operationB.h().mView;
                    Object obj10 = obj8;
                    kotlin.jvm.internal.f0.o(view16, "operation.fragment.mView");
                    defaultSpecialEffectsController.E(arrayList10, view16);
                    if (z12) {
                        if (operationB == operation) {
                            arrayList10.removeAll(CollectionsKt___CollectionsKt.V5(arrayList8));
                        } else {
                            arrayList10.removeAll(CollectionsKt___CollectionsKt.V5(arrayList7));
                        }
                    }
                    if (arrayList10.isEmpty()) {
                        t0Var.a(objF, view15);
                        view2 = view15;
                        operation3 = operationB;
                        objK = obj9;
                        obj2 = objK2;
                        arrayList = arrayList10;
                        view = view14;
                        linkedHashMap = linkedHashMap5;
                        obj = obj10;
                        obj3 = objF;
                    } else {
                        t0Var.b(objF, arrayList10);
                        view = view14;
                        obj = obj10;
                        objK = obj9;
                        view2 = view15;
                        obj2 = objK2;
                        linkedHashMap = linkedHashMap5;
                        t0Var.p(objF, objF, arrayList10, null, null, null, null);
                        if (operationB.g() == SpecialEffectsController.Operation.State.GONE) {
                            operation3 = operationB;
                            list2.remove(operation3);
                            arrayList = arrayList10;
                            ArrayList<View> arrayList11 = new ArrayList<>(arrayList);
                            arrayList11.remove(operation3.h().mView);
                            obj3 = objF;
                            t0Var.o(obj3, operation3.h().mView, arrayList11);
                            androidx.core.view.c1.a(q(), new Runnable() { // from class: androidx.fragment.app.e
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DefaultSpecialEffectsController.N(arrayList);
                                }
                            });
                        } else {
                            obj3 = objF;
                            operation3 = operationB;
                            arrayList = arrayList10;
                        }
                    }
                    if (operation3.g() == SpecialEffectsController.Operation.State.VISIBLE) {
                        arrayList9.addAll(arrayList);
                        rect = rect6;
                        if (z11) {
                            t0Var.q(obj3, rect);
                        }
                        view3 = view;
                    } else {
                        rect = rect6;
                        view3 = view;
                        t0Var.r(obj3, view3);
                    }
                    linkedHashMap.put(operation3, Boolean.TRUE);
                    if (next.j()) {
                        objK2 = t0Var.k(obj2, obj3, null);
                    } else {
                        objK = t0Var.k(objK, obj3, null);
                        objK2 = obj2;
                    }
                    linkedHashMap4 = linkedHashMap;
                    rect6 = rect;
                    view14 = view3;
                    obj8 = obj;
                    view15 = view2;
                    it3 = it4;
                    obj9 = objK;
                    defaultSpecialEffectsController = this;
                } else if (!z12) {
                    linkedHashMap4.put(operationB, Boolean.FALSE);
                    next.a();
                }
            }
        }
        LinkedHashMap linkedHashMap6 = linkedHashMap4;
        Object obj11 = obj8;
        Object objJ = t0Var.j(objK2, obj9, obj11);
        if (objJ == null) {
            return linkedHashMap6;
        }
        ArrayList<c> arrayList12 = new ArrayList();
        for (Object obj12 : list) {
            if (!((c) obj12).d()) {
                arrayList12.add(obj12);
            }
        }
        for (final c cVar4 : arrayList12) {
            Object objH = cVar4.h();
            final SpecialEffectsController.Operation operationB2 = cVar4.b();
            boolean z13 = obj11 != null && (operationB2 == operation || operationB2 == operation2);
            if (objH != null || z13) {
                if (j1.U0(q())) {
                    t0Var.s(cVar4.b().h(), objJ, cVar4.c(), new Runnable() { // from class: androidx.fragment.app.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.O(cVar4, operationB2);
                        }
                    });
                } else {
                    if (FragmentManager.X0(2)) {
                        Log.v(FragmentManager.X, "SpecialEffectsController: Container " + q() + " has not been laid out. Completing operation " + operationB2);
                    }
                    cVar4.a();
                }
            }
        }
        if (!j1.U0(q())) {
            return linkedHashMap6;
        }
        r0.e(arrayList9, 4);
        ArrayList<String> arrayListL = t0Var.l(arrayList7);
        if (FragmentManager.X0(2)) {
            Log.v(FragmentManager.X, ">>>>> Beginning transition <<<<<");
            Log.v(FragmentManager.X, ">>>>> SharedElementFirstOutViews <<<<<");
            for (View sharedElementFirstOutViews : arrayList8) {
                kotlin.jvm.internal.f0.o(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                View view17 = sharedElementFirstOutViews;
                Log.v(FragmentManager.X, "View: " + view17 + " Name: " + j1.x0(view17));
            }
            Log.v(FragmentManager.X, ">>>>> SharedElementLastInViews <<<<<");
            for (View sharedElementLastInViews : arrayList7) {
                kotlin.jvm.internal.f0.o(sharedElementLastInViews, "sharedElementLastInViews");
                View view18 = sharedElementLastInViews;
                Log.v(FragmentManager.X, "View: " + view18 + " Name: " + j1.x0(view18));
            }
        }
        t0Var.c(q(), objJ);
        t0Var.t(q(), arrayList8, arrayList7, arrayListL, aVar4);
        r0.e(arrayList9, 0);
        t0Var.v(obj11, arrayList8, arrayList7);
        return linkedHashMap6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(t0 impl, View view, Rect lastInEpicenterRect) {
        kotlin.jvm.internal.f0.p(impl, "$impl");
        kotlin.jvm.internal.f0.p(lastInEpicenterRect, "$lastInEpicenterRect");
        impl.h(view, lastInEpicenterRect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(ArrayList transitioningViews) {
        kotlin.jvm.internal.f0.p(transitioningViews, "$transitioningViews");
        r0.e(transitioningViews, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(c transitionInfo, SpecialEffectsController.Operation operation) {
        kotlin.jvm.internal.f0.p(transitionInfo, "$transitionInfo");
        kotlin.jvm.internal.f0.p(operation, "$operation");
        transitionInfo.a();
        if (FragmentManager.X0(2)) {
            Log.v(FragmentManager.X, "Transition for operation " + operation + " has completed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, boolean z10, androidx.collection.a lastInViews) {
        kotlin.jvm.internal.f0.p(lastInViews, "$lastInViews");
        r0.a(operation.h(), operation2.h(), z10, lastInViews, false);
    }

    private final void Q(List<? extends SpecialEffectsController.Operation> list) {
        Fragment fragmentH = ((SpecialEffectsController.Operation) CollectionsKt___CollectionsKt.k3(list)).h();
        for (SpecialEffectsController.Operation operation : list) {
            operation.h().mAnimationInfo.f23530c = fragmentH.mAnimationInfo.f23530c;
            operation.h().mAnimationInfo.f23531d = fragmentH.mAnimationInfo.f23531d;
            operation.h().mAnimationInfo.f23532e = fragmentH.mAnimationInfo.f23532e;
            operation.h().mAnimationInfo.f23533f = fragmentH.mAnimationInfo.f23533f;
        }
    }

    @Override // androidx.fragment.app.SpecialEffectsController
    public void j(@dl.d List<? extends SpecialEffectsController.Operation> operations, boolean z10) {
        SpecialEffectsController.Operation operation;
        Object next;
        SpecialEffectsController.Operation operation2;
        SpecialEffectsController.Operation.State stateA;
        SpecialEffectsController.Operation.State state;
        kotlin.jvm.internal.f0.p(operations, "operations");
        Iterator<T> it = operations.iterator();
        do {
            operation = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            operation2 = (SpecialEffectsController.Operation) next;
            SpecialEffectsController.Operation.State.a aVar = SpecialEffectsController.Operation.State.Companion;
            View view = operation2.h().mView;
            kotlin.jvm.internal.f0.o(view, "operation.fragment.mView");
            stateA = aVar.a(view);
            state = SpecialEffectsController.Operation.State.VISIBLE;
        } while (!(stateA == state && operation2.g() != state));
        SpecialEffectsController.Operation operation3 = (SpecialEffectsController.Operation) next;
        ListIterator<? extends SpecialEffectsController.Operation> listIterator = operations.listIterator(operations.size());
        while (listIterator.hasPrevious()) {
            SpecialEffectsController.Operation operationPrevious = listIterator.previous();
            SpecialEffectsController.Operation operation4 = operationPrevious;
            SpecialEffectsController.Operation.State.a aVar2 = SpecialEffectsController.Operation.State.Companion;
            View view2 = operation4.h().mView;
            kotlin.jvm.internal.f0.o(view2, "operation.fragment.mView");
            SpecialEffectsController.Operation.State stateA2 = aVar2.a(view2);
            SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.VISIBLE;
            if (stateA2 != state2 && operation4.g() == state2) {
                operation = operationPrevious;
                break;
            }
        }
        SpecialEffectsController.Operation operation5 = operation;
        if (FragmentManager.X0(2)) {
            Log.v(FragmentManager.X, "Executing operations from " + operation3 + " to " + operation5);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final List<SpecialEffectsController.Operation> listT5 = CollectionsKt___CollectionsKt.T5(operations);
        Q(operations);
        Iterator<? extends SpecialEffectsController.Operation> it2 = operations.iterator();
        while (it2.hasNext()) {
            final SpecialEffectsController.Operation next2 = it2.next();
            androidx.core.os.f fVar = new androidx.core.os.f();
            next2.l(fVar);
            arrayList.add(new a(next2, fVar, z10));
            androidx.core.os.f fVar2 = new androidx.core.os.f();
            next2.l(fVar2);
            arrayList2.add(new c(next2, fVar2, z10, !z10 ? next2 != operation5 : next2 != operation3));
            next2.c(new Runnable() { // from class: androidx.fragment.app.b
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultSpecialEffectsController.F(listT5, next2, this);
                }
            });
        }
        Map<SpecialEffectsController.Operation, Boolean> mapL = L(arrayList2, listT5, z10, operation3, operation5);
        I(arrayList, listT5, mapL.containsValue(Boolean.TRUE), mapL);
        Iterator<SpecialEffectsController.Operation> it3 = listT5.iterator();
        while (it3.hasNext()) {
            D(it3.next());
        }
        listT5.clear();
        if (FragmentManager.X0(2)) {
            Log.v(FragmentManager.X, "Completed executing operations from " + operation3 + " to " + operation5);
        }
    }
}
