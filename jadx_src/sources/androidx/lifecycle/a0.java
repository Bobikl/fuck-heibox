package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.annotation.j1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: LifecycleRegistry.kt */
/* JADX INFO: loaded from: classes6.dex */
public class a0 extends Lifecycle {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    public static final a f24167j = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f24168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private androidx.arch.core.internal.a<x, b> f24169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private Lifecycle.State f24170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final WeakReference<y> f24171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f24172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f24173g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f24174h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private ArrayList<Lifecycle.State> f24175i;

    /* JADX INFO: compiled from: LifecycleRegistry.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @j1
        @dl.d
        @xh.m
        public final a0 a(@dl.d y owner) {
            kotlin.jvm.internal.f0.p(owner, "owner");
            return new a0(owner, false, null);
        }

        @dl.d
        @xh.m
        public final Lifecycle.State b(@dl.d Lifecycle.State state1, @dl.e Lifecycle.State state) {
            kotlin.jvm.internal.f0.p(state1, "state1");
            return (state == null || state.compareTo(state1) >= 0) ? state1 : state;
        }
    }

    /* JADX INFO: compiled from: LifecycleRegistry.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private Lifecycle.State f24176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private v f24177b;

        public b(@dl.e x xVar, @dl.d Lifecycle.State initialState) {
            kotlin.jvm.internal.f0.p(initialState, "initialState");
            kotlin.jvm.internal.f0.m(xVar);
            this.f24177b = d0.f(xVar);
            this.f24176a = initialState;
        }

        public final void a(@dl.e y yVar, @dl.d Lifecycle.Event event) {
            kotlin.jvm.internal.f0.p(event, "event");
            Lifecycle.State targetState = event.getTargetState();
            this.f24176a = a0.f24167j.b(this.f24176a, targetState);
            v vVar = this.f24177b;
            kotlin.jvm.internal.f0.m(yVar);
            vVar.d(yVar, event);
            this.f24176a = targetState;
        }

        @dl.d
        public final v b() {
            return this.f24177b;
        }

        @dl.d
        public final Lifecycle.State c() {
            return this.f24176a;
        }

        public final void d(@dl.d v vVar) {
            kotlin.jvm.internal.f0.p(vVar, "<set-?>");
            this.f24177b = vVar;
        }

        public final void e(@dl.d Lifecycle.State state) {
            kotlin.jvm.internal.f0.p(state, "<set-?>");
            this.f24176a = state;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(@dl.d y provider) {
        this(provider, true);
        kotlin.jvm.internal.f0.p(provider, "provider");
    }

    private a0(y yVar, boolean z10) {
        this.f24168b = z10;
        this.f24169c = new androidx.arch.core.internal.a<>();
        this.f24170d = Lifecycle.State.INITIALIZED;
        this.f24175i = new ArrayList<>();
        this.f24171e = new WeakReference<>(yVar);
    }

    public /* synthetic */ a0(y yVar, boolean z10, kotlin.jvm.internal.u uVar) {
        this(yVar, z10);
    }

    private final void f(y yVar) {
        Iterator<Map.Entry<x, b>> itDescendingIterator = this.f24169c.descendingIterator();
        kotlin.jvm.internal.f0.o(itDescendingIterator, "observerMap.descendingIterator()");
        while (itDescendingIterator.hasNext() && !this.f24174h) {
            Map.Entry<x, b> next = itDescendingIterator.next();
            kotlin.jvm.internal.f0.o(next, "next()");
            x key = next.getKey();
            b value = next.getValue();
            while (value.c().compareTo(this.f24170d) > 0 && !this.f24174h && this.f24169c.contains(key)) {
                Lifecycle.Event eventA = Lifecycle.Event.Companion.a(value.c());
                if (eventA == null) {
                    throw new IllegalStateException("no event down from " + value.c());
                }
                r(eventA.getTargetState());
                value.a(yVar, eventA);
                q();
            }
        }
    }

    private final Lifecycle.State g(x xVar) {
        b value;
        Map.Entry<x, b> entryL = this.f24169c.l(xVar);
        Lifecycle.State state = null;
        Lifecycle.State stateC = (entryL == null || (value = entryL.getValue()) == null) ? null : value.c();
        if (!this.f24175i.isEmpty()) {
            ArrayList<Lifecycle.State> arrayList = this.f24175i;
            state = arrayList.get(arrayList.size() - 1);
        }
        a aVar = f24167j;
        return aVar.b(aVar.b(this.f24170d, stateC), state);
    }

    @j1
    @dl.d
    @xh.m
    public static final a0 h(@dl.d y yVar) {
        return f24167j.a(yVar);
    }

    @SuppressLint({"RestrictedApi"})
    private final void i(String str) {
        if (!this.f24168b || androidx.arch.core.executor.c.h().c()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    private final void j(y yVar) {
        androidx.arch.core.internal.b<x, b>.d dVarE = this.f24169c.e();
        kotlin.jvm.internal.f0.o(dVarE, "observerMap.iteratorWithAdditions()");
        while (dVarE.hasNext() && !this.f24174h) {
            Map.Entry next = dVarE.next();
            x xVar = (x) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.c().compareTo(this.f24170d) < 0 && !this.f24174h && this.f24169c.contains(xVar)) {
                r(bVar.c());
                Lifecycle.Event eventC = Lifecycle.Event.Companion.c(bVar.c());
                if (eventC == null) {
                    throw new IllegalStateException("no event up from " + bVar.c());
                }
                bVar.a(yVar, eventC);
                q();
            }
        }
    }

    private final boolean m() {
        if (this.f24169c.size() == 0) {
            return true;
        }
        Map.Entry<x, b> entryA = this.f24169c.a();
        kotlin.jvm.internal.f0.m(entryA);
        Lifecycle.State stateC = entryA.getValue().c();
        Map.Entry<x, b> entryG = this.f24169c.g();
        kotlin.jvm.internal.f0.m(entryG);
        Lifecycle.State stateC2 = entryG.getValue().c();
        return stateC == stateC2 && this.f24170d == stateC2;
    }

    @dl.d
    @xh.m
    public static final Lifecycle.State o(@dl.d Lifecycle.State state, @dl.e Lifecycle.State state2) {
        return f24167j.b(state, state2);
    }

    private final void p(Lifecycle.State state) {
        Lifecycle.State state2 = this.f24170d;
        if (state2 == state) {
            return;
        }
        if (!((state2 == Lifecycle.State.INITIALIZED && state == Lifecycle.State.DESTROYED) ? false : true)) {
            throw new IllegalStateException(("no event down from " + this.f24170d + " in component " + this.f24171e.get()).toString());
        }
        this.f24170d = state;
        if (this.f24173g || this.f24172f != 0) {
            this.f24174h = true;
            return;
        }
        this.f24173g = true;
        t();
        this.f24173g = false;
        if (this.f24170d == Lifecycle.State.DESTROYED) {
            this.f24169c = new androidx.arch.core.internal.a<>();
        }
    }

    private final void q() {
        ArrayList<Lifecycle.State> arrayList = this.f24175i;
        arrayList.remove(arrayList.size() - 1);
    }

    private final void r(Lifecycle.State state) {
        this.f24175i.add(state);
    }

    private final void t() {
        y yVar = this.f24171e.get();
        if (yVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!m()) {
            this.f24174h = false;
            Lifecycle.State state = this.f24170d;
            Map.Entry<x, b> entryA = this.f24169c.a();
            kotlin.jvm.internal.f0.m(entryA);
            if (state.compareTo(entryA.getValue().c()) < 0) {
                f(yVar);
            }
            Map.Entry<x, b> entryG = this.f24169c.g();
            if (!this.f24174h && entryG != null && this.f24170d.compareTo(entryG.getValue().c()) > 0) {
                j(yVar);
            }
        }
        this.f24174h = false;
    }

    @Override // androidx.lifecycle.Lifecycle
    public void a(@dl.d x observer) {
        y yVar;
        kotlin.jvm.internal.f0.p(observer, "observer");
        i("addObserver");
        Lifecycle.State state = this.f24170d;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        b bVar = new b(observer, state2);
        if (this.f24169c.i(observer, bVar) == null && (yVar = this.f24171e.get()) != null) {
            boolean z10 = this.f24172f != 0 || this.f24173g;
            Lifecycle.State stateG = g(observer);
            this.f24172f++;
            while (bVar.c().compareTo(stateG) < 0 && this.f24169c.contains(observer)) {
                r(bVar.c());
                Lifecycle.Event eventC = Lifecycle.Event.Companion.c(bVar.c());
                if (eventC == null) {
                    throw new IllegalStateException("no event up from " + bVar.c());
                }
                bVar.a(yVar, eventC);
                q();
                stateG = g(observer);
            }
            if (!z10) {
                t();
            }
            this.f24172f--;
        }
    }

    @Override // androidx.lifecycle.Lifecycle
    @dl.d
    public Lifecycle.State b() {
        return this.f24170d;
    }

    @Override // androidx.lifecycle.Lifecycle
    public void d(@dl.d x observer) {
        kotlin.jvm.internal.f0.p(observer, "observer");
        i("removeObserver");
        this.f24169c.j(observer);
    }

    public int k() {
        i("getObserverCount");
        return this.f24169c.size();
    }

    public void l(@dl.d Lifecycle.Event event) {
        kotlin.jvm.internal.f0.p(event, "event");
        i("handleLifecycleEvent");
        p(event.getTargetState());
    }

    @kotlin.k(message = "Override [currentState].")
    @androidx.annotation.k0
    public void n(@dl.d Lifecycle.State state) {
        kotlin.jvm.internal.f0.p(state, "state");
        i("markState");
        s(state);
    }

    public void s(@dl.d Lifecycle.State state) {
        kotlin.jvm.internal.f0.p(state, "state");
        i("setCurrentState");
        p(state);
    }
}
