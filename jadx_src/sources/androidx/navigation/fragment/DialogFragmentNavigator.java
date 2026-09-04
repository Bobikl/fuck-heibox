package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.i0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.v;
import androidx.lifecycle.y;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import androidx.navigation.j0;
import androidx.navigation.q0;
import androidx.navigation.s0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w0;

/* JADX INFO: compiled from: DialogFragmentNavigator.kt */
/* JADX INFO: loaded from: classes6.dex */
@Navigator.b("dialog")
public final class DialogFragmentNavigator extends Navigator<b> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final a f25075h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final String f25076i = "DialogFragmentNavigator";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final Context f25077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final FragmentManager f25078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final Set<String> f25079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final DialogFragmentNavigator$observer$1 f25080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final Map<String, androidx.fragment.app.j> f25081g;

    /* JADX INFO: compiled from: DialogFragmentNavigator.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DialogFragmentNavigator.kt */
    @t0({"SMAP\nDialogFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogFragmentNavigator.kt\nandroidx/navigation/fragment/DialogFragmentNavigator$Destination\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,319:1\n1#2:320\n232#3,3:321\n*S KotlinDebug\n*F\n+ 1 DialogFragmentNavigator.kt\nandroidx/navigation/fragment/DialogFragmentNavigator$Destination\n*L\n283#1:321,3\n*E\n"})
    @NavDestination.a(androidx.fragment.app.j.class)
    public static class b extends NavDestination implements androidx.navigation.h {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @dl.e
        private String f25082n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@dl.d Navigator<? extends b> fragmentNavigator) {
            super(fragmentNavigator);
            f0.p(fragmentNavigator, "fragmentNavigator");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(@dl.d q0 navigatorProvider) {
            this((Navigator<? extends b>) navigatorProvider.e(DialogFragmentNavigator.class));
            f0.p(navigatorProvider, "navigatorProvider");
        }

        @Override // androidx.navigation.NavDestination
        @androidx.annotation.i
        public void R(@dl.d Context context, @dl.d AttributeSet attrs) {
            f0.p(context, "context");
            f0.p(attrs, "attrs");
            super.R(context, attrs);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, R.styleable.f25124a);
            f0.o(typedArrayObtainAttributes, "context.resources.obtain….DialogFragmentNavigator)");
            String string = typedArrayObtainAttributes.getString(R.styleable.DialogFragmentNavigator_android_name);
            if (string != null) {
                k0(string);
            }
            typedArrayObtainAttributes.recycle();
        }

        @Override // androidx.navigation.NavDestination
        public boolean equals(@dl.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            return super.equals(obj) && f0.g(this.f25082n, ((b) obj).f25082n);
        }

        @Override // androidx.navigation.NavDestination
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this.f25082n;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @dl.d
        public final String i0() {
            String str = this.f25082n;
            if (str == null) {
                throw new IllegalStateException("DialogFragment class was not set".toString());
            }
            f0.n(str, "null cannot be cast to non-null type kotlin.String");
            return str;
        }

        @dl.d
        public final b k0(@dl.d String className) {
            f0.p(className, "className");
            this.f25082n = className;
            return this;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.navigation.fragment.DialogFragmentNavigator$observer$1] */
    public DialogFragmentNavigator(@dl.d Context context, @dl.d FragmentManager fragmentManager) {
        f0.p(context, "context");
        f0.p(fragmentManager, "fragmentManager");
        this.f25077c = context;
        this.f25078d = fragmentManager;
        this.f25079e = new LinkedHashSet();
        this.f25080f = new v() { // from class: androidx.navigation.fragment.DialogFragmentNavigator$observer$1

            /* JADX INFO: compiled from: DialogFragmentNavigator.kt */
            public final /* synthetic */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f25084a;

                static {
                    int[] iArr = new int[Lifecycle.Event.values().length];
                    try {
                        iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f25084a = iArr;
                }
            }

            @Override // androidx.lifecycle.v
            public void d(y source, Lifecycle.Event event) {
                int iNextIndex;
                f0.p(source, "source");
                f0.p(event, "event");
                int i10 = a.f25084a[event.ordinal()];
                boolean z10 = true;
                if (i10 == 1) {
                    androidx.fragment.app.j jVar = (androidx.fragment.app.j) source;
                    List<NavBackStackEntry> value = this.f25083b.b().b().getValue();
                    if (!(value instanceof Collection) || !value.isEmpty()) {
                        Iterator<T> it = value.iterator();
                        do {
                            if (!it.hasNext()) {
                                z10 = false;
                                break;
                            }
                        } while (!f0.g(((NavBackStackEntry) it.next()).f(), jVar.getTag()));
                    } else {
                        z10 = false;
                        break;
                    }
                    if (z10) {
                        return;
                    }
                    jVar.dismiss();
                    return;
                }
                Object obj = null;
                if (i10 == 2) {
                    androidx.fragment.app.j jVar2 = (androidx.fragment.app.j) source;
                    for (Object obj2 : this.f25083b.b().c().getValue()) {
                        if (f0.g(((NavBackStackEntry) obj2).f(), jVar2.getTag())) {
                            obj = obj2;
                        }
                    }
                    NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                    if (navBackStackEntry != null) {
                        this.f25083b.b().e(navBackStackEntry);
                        return;
                    }
                    return;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        return;
                    }
                    androidx.fragment.app.j jVar3 = (androidx.fragment.app.j) source;
                    for (Object obj3 : this.f25083b.b().c().getValue()) {
                        if (f0.g(((NavBackStackEntry) obj3).f(), jVar3.getTag())) {
                            obj = obj3;
                        }
                    }
                    NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
                    if (navBackStackEntry2 != null) {
                        this.f25083b.b().e(navBackStackEntry2);
                    }
                    jVar3.getLifecycle().d(this);
                    return;
                }
                androidx.fragment.app.j jVar4 = (androidx.fragment.app.j) source;
                if (jVar4.requireDialog().isShowing()) {
                    return;
                }
                List<NavBackStackEntry> value2 = this.f25083b.b().b().getValue();
                ListIterator<NavBackStackEntry> listIterator = value2.listIterator(value2.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (f0.g(listIterator.previous().f(), jVar4.getTag())) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) CollectionsKt___CollectionsKt.R2(value2, iNextIndex);
                if (!f0.g(CollectionsKt___CollectionsKt.q3(value2), navBackStackEntry3)) {
                    Log.i("DialogFragmentNavigator", "Dialog " + jVar4 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                }
                if (navBackStackEntry3 != null) {
                    this.f25083b.t(iNextIndex, navBackStackEntry3, false);
                }
            }
        };
        this.f25081g = new LinkedHashMap();
    }

    private final androidx.fragment.app.j p(NavBackStackEntry navBackStackEntry) {
        NavDestination navDestinationE = navBackStackEntry.e();
        f0.n(navDestinationE, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        b bVar = (b) navDestinationE;
        String strI0 = bVar.i0();
        if (strI0.charAt(0) == '.') {
            strI0 = this.f25077c.getPackageName() + strI0;
        }
        Fragment fragmentA = this.f25078d.H0().a(this.f25077c.getClassLoader(), strI0);
        f0.o(fragmentA, "fragmentManager.fragment…t.classLoader, className)");
        if (androidx.fragment.app.j.class.isAssignableFrom(fragmentA.getClass())) {
            androidx.fragment.app.j jVar = (androidx.fragment.app.j) fragmentA;
            jVar.setArguments(navBackStackEntry.c());
            jVar.getLifecycle().a(this.f25080f);
            this.f25081g.put(navBackStackEntry.f(), jVar);
            return jVar;
        }
        throw new IllegalArgumentException(("Dialog destination " + bVar.i0() + " is not an instance of DialogFragment").toString());
    }

    private final void r(NavBackStackEntry navBackStackEntry) {
        p(navBackStackEntry).show(this.f25078d, navBackStackEntry.f());
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) CollectionsKt___CollectionsKt.q3(b().b().getValue());
        boolean zR1 = CollectionsKt___CollectionsKt.R1(b().c().getValue(), navBackStackEntry2);
        b().l(navBackStackEntry);
        if (navBackStackEntry2 == null || zR1) {
            return;
        }
        b().e(navBackStackEntry2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(DialogFragmentNavigator this$0, FragmentManager fragmentManager, Fragment childFragment) {
        f0.p(this$0, "this$0");
        f0.p(fragmentManager, "<anonymous parameter 0>");
        f0.p(childFragment, "childFragment");
        Set<String> set = this$0.f25079e;
        if (w0.a(set).remove(childFragment.getTag())) {
            childFragment.getLifecycle().a(this$0.f25080f);
        }
        Map<String, androidx.fragment.app.j> map = this$0.f25081g;
        w0.k(map).remove(childFragment.getTag());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(int i10, NavBackStackEntry navBackStackEntry, boolean z10) {
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) CollectionsKt___CollectionsKt.R2(b().b().getValue(), i10 - 1);
        boolean zR1 = CollectionsKt___CollectionsKt.R1(b().c().getValue(), navBackStackEntry2);
        b().i(navBackStackEntry, z10);
        if (navBackStackEntry2 == null || zR1) {
            return;
        }
        b().e(navBackStackEntry2);
    }

    @Override // androidx.navigation.Navigator
    public void e(@dl.d List<NavBackStackEntry> entries, @dl.e j0 j0Var, @dl.e Navigator.a aVar) {
        f0.p(entries, "entries");
        if (this.f25078d.e1()) {
            Log.i(f25076i, "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator<NavBackStackEntry> it = entries.iterator();
        while (it.hasNext()) {
            r(it.next());
        }
    }

    @Override // androidx.navigation.Navigator
    public void f(@dl.d s0 state) {
        Lifecycle lifecycle;
        f0.p(state, "state");
        super.f(state);
        for (NavBackStackEntry navBackStackEntry : state.b().getValue()) {
            androidx.fragment.app.j jVar = (androidx.fragment.app.j) this.f25078d.s0(navBackStackEntry.f());
            if (jVar == null || (lifecycle = jVar.getLifecycle()) == null) {
                this.f25079e.add(navBackStackEntry.f());
            } else {
                lifecycle.a(this.f25080f);
            }
        }
        this.f25078d.o(new i0() { // from class: androidx.navigation.fragment.b
            @Override // androidx.fragment.app.i0
            public final void a(FragmentManager fragmentManager, Fragment fragment) {
                DialogFragmentNavigator.s(this.f25133b, fragmentManager, fragment);
            }
        });
    }

    @Override // androidx.navigation.Navigator
    public void g(@dl.d NavBackStackEntry backStackEntry) {
        f0.p(backStackEntry, "backStackEntry");
        if (this.f25078d.e1()) {
            Log.i(f25076i, "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        androidx.fragment.app.j jVar = this.f25081g.get(backStackEntry.f());
        if (jVar == null) {
            Fragment fragmentS0 = this.f25078d.s0(backStackEntry.f());
            jVar = fragmentS0 instanceof androidx.fragment.app.j ? (androidx.fragment.app.j) fragmentS0 : null;
        }
        if (jVar != null) {
            jVar.getLifecycle().d(this.f25080f);
            jVar.dismiss();
        }
        p(backStackEntry).show(this.f25078d, backStackEntry.f());
        b().g(backStackEntry);
    }

    @Override // androidx.navigation.Navigator
    public void j(@dl.d NavBackStackEntry popUpTo, boolean z10) {
        f0.p(popUpTo, "popUpTo");
        if (this.f25078d.e1()) {
            Log.i(f25076i, "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List<NavBackStackEntry> value = b().b().getValue();
        int iIndexOf = value.indexOf(popUpTo);
        Iterator it = CollectionsKt___CollectionsKt.S4(value.subList(iIndexOf, value.size())).iterator();
        while (it.hasNext()) {
            Fragment fragmentS0 = this.f25078d.s0(((NavBackStackEntry) it.next()).f());
            if (fragmentS0 != null) {
                ((androidx.fragment.app.j) fragmentS0).dismiss();
            }
        }
        t(iIndexOf, popUpTo, z10);
    }

    @Override // androidx.navigation.Navigator
    @dl.d
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this);
    }

    @dl.d
    public final kotlinx.coroutines.flow.u<List<NavBackStackEntry>> q() {
        return b().b();
    }
}
