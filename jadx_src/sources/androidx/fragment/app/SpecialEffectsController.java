package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.j1;
import androidx.fragment.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: SpecialEffectsController.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,710:1\n288#2,2:711\n288#2,2:713\n533#2,6:715\n*S KotlinDebug\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController\n*L\n69#1:711,2\n75#1:713,2\n166#1:715,6\n*E\n"})
public abstract class SpecialEffectsController {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final a f23670f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final ViewGroup f23671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final List<Operation> f23672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final List<Operation> f23673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f23674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23675e;

    /* JADX INFO: compiled from: SpecialEffectsController.kt */
    @kotlin.jvm.internal.t0({"SMAP\nSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController$Operation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,710:1\n1855#2,2:711\n*S KotlinDebug\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController$Operation\n*L\n607#1:711,2\n*E\n"})
    public static class Operation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private State f23676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private LifecycleImpact f23677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private final Fragment f23678c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        private final List<Runnable> f23679d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dl.d
        private final Set<androidx.core.os.f> f23680e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f23681f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f23682g;

        /* JADX INFO: compiled from: SpecialEffectsController.kt */
        public enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING
        }

        /* JADX INFO: compiled from: SpecialEffectsController.kt */
        public enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            @dl.d
            public static final a Companion = new a(null);

            /* JADX INFO: compiled from: SpecialEffectsController.kt */
            public static final class a {
                private a() {
                }

                public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
                    this();
                }

                @dl.d
                public final State a(@dl.d View view) {
                    kotlin.jvm.internal.f0.p(view, "<this>");
                    return (((view.getAlpha() > 0.0f ? 1 : (view.getAlpha() == 0.0f ? 0 : -1)) == 0) && view.getVisibility() == 0) ? State.INVISIBLE : b(view.getVisibility());
                }

                @dl.d
                @xh.m
                public final State b(int i10) {
                    if (i10 == 0) {
                        return State.VISIBLE;
                    }
                    if (i10 == 4) {
                        return State.INVISIBLE;
                    }
                    if (i10 == 8) {
                        return State.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i10);
                }
            }

            /* JADX INFO: compiled from: SpecialEffectsController.kt */
            public final /* synthetic */ class b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f23683a;

                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[State.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[State.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[State.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[State.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f23683a = iArr;
                }
            }

            @dl.d
            @xh.m
            public static final State from(int i10) {
                return Companion.b(i10);
            }

            public final void applyState(@dl.d View view) {
                kotlin.jvm.internal.f0.p(view, "view");
                int i10 = b.f23683a[ordinal()];
                if (i10 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (FragmentManager.X0(2)) {
                            Log.v(FragmentManager.X, "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i10 == 2) {
                    if (FragmentManager.X0(2)) {
                        Log.v(FragmentManager.X, "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i10 == 3) {
                    if (FragmentManager.X0(2)) {
                        Log.v(FragmentManager.X, "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i10 != 4) {
                    return;
                }
                if (FragmentManager.X0(2)) {
                    Log.v(FragmentManager.X, "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        /* JADX INFO: compiled from: SpecialEffectsController.kt */
        public final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f23684a;

            static {
                int[] iArr = new int[LifecycleImpact.values().length];
                try {
                    iArr[LifecycleImpact.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LifecycleImpact.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LifecycleImpact.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f23684a = iArr;
            }
        }

        public Operation(@dl.d State finalState, @dl.d LifecycleImpact lifecycleImpact, @dl.d Fragment fragment, @dl.d androidx.core.os.f cancellationSignal) {
            kotlin.jvm.internal.f0.p(finalState, "finalState");
            kotlin.jvm.internal.f0.p(lifecycleImpact, "lifecycleImpact");
            kotlin.jvm.internal.f0.p(fragment, "fragment");
            kotlin.jvm.internal.f0.p(cancellationSignal, "cancellationSignal");
            this.f23676a = finalState;
            this.f23677b = lifecycleImpact;
            this.f23678c = fragment;
            this.f23679d = new ArrayList();
            this.f23680e = new LinkedHashSet();
            cancellationSignal.d(new androidx.core.os.f.b() { // from class: androidx.fragment.app.z0
                @Override // androidx.core.os.f.b
                public final void onCancel() {
                    SpecialEffectsController.Operation.b(this.f23900a);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(Operation this$0) {
            kotlin.jvm.internal.f0.p(this$0, "this$0");
            this$0.d();
        }

        public final void c(@dl.d Runnable listener) {
            kotlin.jvm.internal.f0.p(listener, "listener");
            this.f23679d.add(listener);
        }

        public final void d() {
            if (this.f23681f) {
                return;
            }
            this.f23681f = true;
            if (this.f23680e.isEmpty()) {
                e();
                return;
            }
            Iterator it = CollectionsKt___CollectionsKt.U5(this.f23680e).iterator();
            while (it.hasNext()) {
                ((androidx.core.os.f) it.next()).a();
            }
        }

        @androidx.annotation.i
        public void e() {
            if (this.f23682g) {
                return;
            }
            if (FragmentManager.X0(2)) {
                Log.v(FragmentManager.X, "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f23682g = true;
            Iterator<T> it = this.f23679d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void f(@dl.d androidx.core.os.f signal) {
            kotlin.jvm.internal.f0.p(signal, "signal");
            if (this.f23680e.remove(signal) && this.f23680e.isEmpty()) {
                e();
            }
        }

        @dl.d
        public final State g() {
            return this.f23676a;
        }

        @dl.d
        public final Fragment h() {
            return this.f23678c;
        }

        @dl.d
        public final LifecycleImpact i() {
            return this.f23677b;
        }

        public final boolean j() {
            return this.f23681f;
        }

        public final boolean k() {
            return this.f23682g;
        }

        public final void l(@dl.d androidx.core.os.f signal) {
            kotlin.jvm.internal.f0.p(signal, "signal");
            n();
            this.f23680e.add(signal);
        }

        public final void m(@dl.d State finalState, @dl.d LifecycleImpact lifecycleImpact) {
            kotlin.jvm.internal.f0.p(finalState, "finalState");
            kotlin.jvm.internal.f0.p(lifecycleImpact, "lifecycleImpact");
            int i10 = a.f23684a[lifecycleImpact.ordinal()];
            if (i10 == 1) {
                if (this.f23676a == State.REMOVED) {
                    if (FragmentManager.X0(2)) {
                        Log.v(FragmentManager.X, "SpecialEffectsController: For fragment " + this.f23678c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f23677b + " to ADDING.");
                    }
                    this.f23676a = State.VISIBLE;
                    this.f23677b = LifecycleImpact.ADDING;
                    return;
                }
                return;
            }
            if (i10 == 2) {
                if (FragmentManager.X0(2)) {
                    Log.v(FragmentManager.X, "SpecialEffectsController: For fragment " + this.f23678c + " mFinalState = " + this.f23676a + " -> REMOVED. mLifecycleImpact  = " + this.f23677b + " to REMOVING.");
                }
                this.f23676a = State.REMOVED;
                this.f23677b = LifecycleImpact.REMOVING;
                return;
            }
            if (i10 == 3 && this.f23676a != State.REMOVED) {
                if (FragmentManager.X0(2)) {
                    Log.v(FragmentManager.X, "SpecialEffectsController: For fragment " + this.f23678c + " mFinalState = " + this.f23676a + " -> " + finalState + lg.a.f131414g);
                }
                this.f23676a = finalState;
            }
        }

        public void n() {
        }

        public final void o(@dl.d State state) {
            kotlin.jvm.internal.f0.p(state, "<set-?>");
            this.f23676a = state;
        }

        public final void p(@dl.d LifecycleImpact lifecycleImpact) {
            kotlin.jvm.internal.f0.p(lifecycleImpact, "<set-?>");
            this.f23677b = lifecycleImpact;
        }

        @dl.d
        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.f23676a + " lifecycleImpact = " + this.f23677b + " fragment = " + this.f23678c + '}';
        }
    }

    /* JADX INFO: compiled from: SpecialEffectsController.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final SpecialEffectsController a(@dl.d ViewGroup container, @dl.d FragmentManager fragmentManager) {
            kotlin.jvm.internal.f0.p(container, "container");
            kotlin.jvm.internal.f0.p(fragmentManager, "fragmentManager");
            a1 a1VarP0 = fragmentManager.P0();
            kotlin.jvm.internal.f0.o(a1VarP0, "fragmentManager.specialEffectsControllerFactory");
            return b(container, a1VarP0);
        }

        @dl.d
        @xh.m
        public final SpecialEffectsController b(@dl.d ViewGroup container, @dl.d a1 factory) {
            kotlin.jvm.internal.f0.p(container, "container");
            kotlin.jvm.internal.f0.p(factory, "factory");
            int i10 = R.id.special_effects_controller_view_tag;
            Object tag = container.getTag(i10);
            if (tag instanceof SpecialEffectsController) {
                return (SpecialEffectsController) tag;
            }
            SpecialEffectsController specialEffectsControllerA = factory.a(container);
            kotlin.jvm.internal.f0.o(specialEffectsControllerA, "factory.createController(container)");
            container.setTag(i10, specialEffectsControllerA);
            return specialEffectsControllerA;
        }
    }

    /* JADX INFO: compiled from: SpecialEffectsController.kt */
    public static final class b extends Operation {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @dl.d
        private final m0 f23685h;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(@dl.d Operation.State finalState, @dl.d Operation.LifecycleImpact lifecycleImpact, @dl.d m0 fragmentStateManager, @dl.d androidx.core.os.f cancellationSignal) {
            kotlin.jvm.internal.f0.p(finalState, "finalState");
            kotlin.jvm.internal.f0.p(lifecycleImpact, "lifecycleImpact");
            kotlin.jvm.internal.f0.p(fragmentStateManager, "fragmentStateManager");
            kotlin.jvm.internal.f0.p(cancellationSignal, "cancellationSignal");
            Fragment fragmentK = fragmentStateManager.k();
            kotlin.jvm.internal.f0.o(fragmentK, "fragmentStateManager.fragment");
            super(finalState, lifecycleImpact, fragmentK, cancellationSignal);
            this.f23685h = fragmentStateManager;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void e() {
            super.e();
            this.f23685h.m();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void n() {
            if (i() != Operation.LifecycleImpact.ADDING) {
                if (i() == Operation.LifecycleImpact.REMOVING) {
                    Fragment fragmentK = this.f23685h.k();
                    kotlin.jvm.internal.f0.o(fragmentK, "fragmentStateManager.fragment");
                    View viewRequireView = fragmentK.requireView();
                    kotlin.jvm.internal.f0.o(viewRequireView, "fragment.requireView()");
                    if (FragmentManager.X0(2)) {
                        Log.v(FragmentManager.X, "Clearing focus " + viewRequireView.findFocus() + " on view " + viewRequireView + " for Fragment " + fragmentK);
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragmentK2 = this.f23685h.k();
            kotlin.jvm.internal.f0.o(fragmentK2, "fragmentStateManager.fragment");
            View viewFindFocus = fragmentK2.mView.findFocus();
            if (viewFindFocus != null) {
                fragmentK2.setFocusedView(viewFindFocus);
                if (FragmentManager.X0(2)) {
                    Log.v(FragmentManager.X, "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragmentK2);
                }
            }
            View viewRequireView2 = h().requireView();
            kotlin.jvm.internal.f0.o(viewRequireView2, "this.fragment.requireView()");
            if (viewRequireView2.getParent() == null) {
                this.f23685h.b();
                viewRequireView2.setAlpha(0.0f);
            }
            if ((viewRequireView2.getAlpha() == 0.0f) && viewRequireView2.getVisibility() == 0) {
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(fragmentK2.getPostOnViewCreatedAlpha());
        }
    }

    /* JADX INFO: compiled from: SpecialEffectsController.kt */
    public final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23686a;

        static {
            int[] iArr = new int[Operation.LifecycleImpact.values().length];
            try {
                iArr[Operation.LifecycleImpact.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f23686a = iArr;
        }
    }

    public SpecialEffectsController(@dl.d ViewGroup container) {
        kotlin.jvm.internal.f0.p(container, "container");
        this.f23671a = container;
        this.f23672b = new ArrayList();
        this.f23673c = new ArrayList();
    }

    private final void c(Operation.State state, Operation.LifecycleImpact lifecycleImpact, m0 m0Var) {
        synchronized (this.f23672b) {
            androidx.core.os.f fVar = new androidx.core.os.f();
            Fragment fragmentK = m0Var.k();
            kotlin.jvm.internal.f0.o(fragmentK, "fragmentStateManager.fragment");
            Operation operationL = l(fragmentK);
            if (operationL != null) {
                operationL.m(state, lifecycleImpact);
                return;
            }
            final b bVar = new b(state, lifecycleImpact, m0Var, fVar);
            this.f23672b.add(bVar);
            bVar.c(new Runnable() { // from class: androidx.fragment.app.x0
                @Override // java.lang.Runnable
                public final void run() {
                    SpecialEffectsController.d(this.f23894b, bVar);
                }
            });
            bVar.c(new Runnable() { // from class: androidx.fragment.app.y0
                @Override // java.lang.Runnable
                public final void run() {
                    SpecialEffectsController.e(this.f23897b, bVar);
                }
            });
            b2 b2Var = b2.f124493a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(SpecialEffectsController this$0, b operation) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(operation, "$operation");
        if (this$0.f23672b.contains(operation)) {
            Operation.State stateG = operation.g();
            View view = operation.h().mView;
            kotlin.jvm.internal.f0.o(view, "operation.fragment.mView");
            stateG.applyState(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(SpecialEffectsController this$0, b operation) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(operation, "$operation");
        this$0.f23672b.remove(operation);
        this$0.f23673c.remove(operation);
    }

    private final Operation l(Fragment fragment) {
        Object next;
        Iterator<T> it = this.f23672b.iterator();
        while (it.hasNext()) {
            next = it.next();
            Operation operation = (Operation) next;
            if (kotlin.jvm.internal.f0.g(operation.h(), fragment) && !operation.j()) {
                return (Operation) next;
            }
        }
        next = null;
        return (Operation) next;
    }

    private final Operation m(Fragment fragment) {
        Object next;
        Iterator<T> it = this.f23673c.iterator();
        while (it.hasNext()) {
            next = it.next();
            Operation operation = (Operation) next;
            if (kotlin.jvm.internal.f0.g(operation.h(), fragment) && !operation.j()) {
                return (Operation) next;
            }
        }
        next = null;
        return (Operation) next;
    }

    @dl.d
    @xh.m
    public static final SpecialEffectsController r(@dl.d ViewGroup viewGroup, @dl.d FragmentManager fragmentManager) {
        return f23670f.a(viewGroup, fragmentManager);
    }

    @dl.d
    @xh.m
    public static final SpecialEffectsController s(@dl.d ViewGroup viewGroup, @dl.d a1 a1Var) {
        return f23670f.b(viewGroup, a1Var);
    }

    private final void u() {
        for (Operation operation : this.f23672b) {
            if (operation.i() == Operation.LifecycleImpact.ADDING) {
                View viewRequireView = operation.h().requireView();
                kotlin.jvm.internal.f0.o(viewRequireView, "fragment.requireView()");
                operation.m(Operation.State.Companion.b(viewRequireView.getVisibility()), Operation.LifecycleImpact.NONE);
            }
        }
    }

    public final void f(@dl.d Operation.State finalState, @dl.d m0 fragmentStateManager) {
        kotlin.jvm.internal.f0.p(finalState, "finalState");
        kotlin.jvm.internal.f0.p(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.X0(2)) {
            Log.v(FragmentManager.X, "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.k());
        }
        c(finalState, Operation.LifecycleImpact.ADDING, fragmentStateManager);
    }

    public final void g(@dl.d m0 fragmentStateManager) {
        kotlin.jvm.internal.f0.p(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.X0(2)) {
            Log.v(FragmentManager.X, "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.k());
        }
        c(Operation.State.GONE, Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    public final void h(@dl.d m0 fragmentStateManager) {
        kotlin.jvm.internal.f0.p(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.X0(2)) {
            Log.v(FragmentManager.X, "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.k());
        }
        c(Operation.State.REMOVED, Operation.LifecycleImpact.REMOVING, fragmentStateManager);
    }

    public final void i(@dl.d m0 fragmentStateManager) {
        kotlin.jvm.internal.f0.p(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.X0(2)) {
            Log.v(FragmentManager.X, "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.k());
        }
        c(Operation.State.VISIBLE, Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    public abstract void j(@dl.d List<Operation> list, boolean z10);

    public final void k() {
        if (this.f23675e) {
            return;
        }
        if (!j1.O0(this.f23671a)) {
            n();
            this.f23674d = false;
            return;
        }
        synchronized (this.f23672b) {
            if (!this.f23672b.isEmpty()) {
                List<Operation> listT5 = CollectionsKt___CollectionsKt.T5(this.f23673c);
                this.f23673c.clear();
                for (Operation operation : listT5) {
                    if (FragmentManager.X0(2)) {
                        Log.v(FragmentManager.X, "SpecialEffectsController: Cancelling operation " + operation);
                    }
                    operation.d();
                    if (!operation.k()) {
                        this.f23673c.add(operation);
                    }
                }
                u();
                List<Operation> listT6 = CollectionsKt___CollectionsKt.T5(this.f23672b);
                this.f23672b.clear();
                this.f23673c.addAll(listT6);
                if (FragmentManager.X0(2)) {
                    Log.v(FragmentManager.X, "SpecialEffectsController: Executing pending operations");
                }
                Iterator<Operation> it = listT6.iterator();
                while (it.hasNext()) {
                    it.next().n();
                }
                j(listT6, this.f23674d);
                this.f23674d = false;
                if (FragmentManager.X0(2)) {
                    Log.v(FragmentManager.X, "SpecialEffectsController: Finished executing pending operations");
                }
            }
            b2 b2Var = b2.f124493a;
        }
    }

    public final void n() {
        if (FragmentManager.X0(2)) {
            Log.v(FragmentManager.X, "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zO0 = j1.O0(this.f23671a);
        synchronized (this.f23672b) {
            u();
            Iterator<Operation> it = this.f23672b.iterator();
            while (it.hasNext()) {
                it.next().n();
            }
            for (Operation operation : CollectionsKt___CollectionsKt.T5(this.f23673c)) {
                if (FragmentManager.X0(2)) {
                    Log.v(FragmentManager.X, "SpecialEffectsController: " + (zO0 ? "" : "Container " + this.f23671a + " is not attached to window. ") + "Cancelling running operation " + operation);
                }
                operation.d();
            }
            for (Operation operation2 : CollectionsKt___CollectionsKt.T5(this.f23672b)) {
                if (FragmentManager.X0(2)) {
                    Log.v(FragmentManager.X, "SpecialEffectsController: " + (zO0 ? "" : "Container " + this.f23671a + " is not attached to window. ") + "Cancelling pending operation " + operation2);
                }
                operation2.d();
            }
            b2 b2Var = b2.f124493a;
        }
    }

    public final void o() {
        if (this.f23675e) {
            if (FragmentManager.X0(2)) {
                Log.v(FragmentManager.X, "SpecialEffectsController: Forcing postponed operations");
            }
            this.f23675e = false;
            k();
        }
    }

    @dl.e
    public final Operation.LifecycleImpact p(@dl.d m0 fragmentStateManager) {
        kotlin.jvm.internal.f0.p(fragmentStateManager, "fragmentStateManager");
        Fragment fragmentK = fragmentStateManager.k();
        kotlin.jvm.internal.f0.o(fragmentK, "fragmentStateManager.fragment");
        Operation operationL = l(fragmentK);
        Operation.LifecycleImpact lifecycleImpactI = operationL != null ? operationL.i() : null;
        Operation operationM = m(fragmentK);
        Operation.LifecycleImpact lifecycleImpactI2 = operationM != null ? operationM.i() : null;
        int i10 = lifecycleImpactI == null ? -1 : c.f23686a[lifecycleImpactI.ordinal()];
        return (i10 == -1 || i10 == 1) ? lifecycleImpactI2 : lifecycleImpactI;
    }

    @dl.d
    public final ViewGroup q() {
        return this.f23671a;
    }

    public final void t() {
        Operation operationPrevious;
        Operation.State stateA;
        Operation.State stateG;
        Operation.State state;
        synchronized (this.f23672b) {
            u();
            List<Operation> list = this.f23672b;
            ListIterator<Operation> listIterator = list.listIterator(list.size());
            do {
                if (!listIterator.hasPrevious()) {
                    operationPrevious = null;
                    break;
                }
                operationPrevious = listIterator.previous();
                Operation operation = operationPrevious;
                Operation.State.a aVar = Operation.State.Companion;
                View view = operation.h().mView;
                kotlin.jvm.internal.f0.o(view, "operation.fragment.mView");
                stateA = aVar.a(view);
                stateG = operation.g();
                state = Operation.State.VISIBLE;
            } while (!(stateG == state && stateA != state));
            Operation operation2 = operationPrevious;
            Fragment fragmentH = operation2 != null ? operation2.h() : null;
            this.f23675e = fragmentH != null ? fragmentH.isPostponed() : false;
            b2 b2Var = b2.f124493a;
        }
    }

    public final void v(boolean z10) {
        this.f23674d = z10;
    }
}
