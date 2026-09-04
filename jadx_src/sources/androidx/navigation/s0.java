package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.d1;
import kotlin.collections.e1;

/* JADX INFO: compiled from: NavigatorState.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nNavigatorState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigatorState.kt\nandroidx/navigation/NavigatorState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,217:1\n1#2:218\n1747#3,3:219\n1747#3,3:222\n959#3,7:225\n1747#3,3:232\n2624#3,3:235\n533#3,6:238\n378#3,7:244\n451#3,6:251\n*S KotlinDebug\n*F\n+ 1 NavigatorState.kt\nandroidx/navigation/NavigatorState\n*L\n76#1:219,3\n77#1:222,3\n102#1:225,7\n123#1:232,3\n124#1:235,3\n130#1:238,6\n158#1:244,7\n181#1:251,6\n*E\n"})
public abstract class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final ReentrantLock f25234a = new ReentrantLock(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlinx.coroutines.flow.j<List<NavBackStackEntry>> f25235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final kotlinx.coroutines.flow.j<Set<NavBackStackEntry>> f25236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f25237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final kotlinx.coroutines.flow.u<List<NavBackStackEntry>> f25238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final kotlinx.coroutines.flow.u<Set<NavBackStackEntry>> f25239f;

    public s0() {
        kotlinx.coroutines.flow.j<List<NavBackStackEntry>> jVarA = kotlinx.coroutines.flow.v.a(CollectionsKt__CollectionsKt.E());
        this.f25235b = jVarA;
        kotlinx.coroutines.flow.j<Set<NavBackStackEntry>> jVarA2 = kotlinx.coroutines.flow.v.a(d1.k());
        this.f25236c = jVarA2;
        this.f25238e = kotlinx.coroutines.flow.g.m(jVarA);
        this.f25239f = kotlinx.coroutines.flow.g.m(jVarA2);
    }

    @dl.d
    public abstract NavBackStackEntry a(@dl.d NavDestination navDestination, @dl.e Bundle bundle);

    @dl.d
    public final kotlinx.coroutines.flow.u<List<NavBackStackEntry>> b() {
        return this.f25238e;
    }

    @dl.d
    public final kotlinx.coroutines.flow.u<Set<NavBackStackEntry>> c() {
        return this.f25239f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean d() {
        return this.f25237d;
    }

    public void e(@dl.d NavBackStackEntry entry) {
        kotlin.jvm.internal.f0.p(entry, "entry");
        kotlinx.coroutines.flow.j<Set<NavBackStackEntry>> jVar = this.f25236c;
        jVar.setValue(e1.y(jVar.getValue(), entry));
    }

    @androidx.annotation.i
    public void f(@dl.d NavBackStackEntry backStackEntry) {
        int iNextIndex;
        kotlin.jvm.internal.f0.p(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f25234a;
        reentrantLock.lock();
        try {
            List<NavBackStackEntry> listT5 = CollectionsKt___CollectionsKt.T5(this.f25238e.getValue());
            ListIterator<NavBackStackEntry> listIterator = listT5.listIterator(listT5.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                } else if (kotlin.jvm.internal.f0.g(listIterator.previous().f(), backStackEntry.f())) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            listT5.set(iNextIndex, backStackEntry);
            this.f25235b.setValue(listT5);
            b2 b2Var = b2.f124493a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @androidx.annotation.i
    public void g(@dl.d NavBackStackEntry backStackEntry) {
        kotlin.jvm.internal.f0.p(backStackEntry, "backStackEntry");
        List<NavBackStackEntry> value = this.f25238e.getValue();
        ListIterator<NavBackStackEntry> listIterator = value.listIterator(value.size());
        while (listIterator.hasPrevious()) {
            NavBackStackEntry navBackStackEntryPrevious = listIterator.previous();
            if (kotlin.jvm.internal.f0.g(navBackStackEntryPrevious.f(), backStackEntry.f())) {
                kotlinx.coroutines.flow.j<Set<NavBackStackEntry>> jVar = this.f25236c;
                jVar.setValue(e1.D(e1.D(jVar.getValue(), navBackStackEntryPrevious), backStackEntry));
                f(backStackEntry);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    public void h(@dl.d NavBackStackEntry popUpTo, boolean z10) {
        kotlin.jvm.internal.f0.p(popUpTo, "popUpTo");
        ReentrantLock reentrantLock = this.f25234a;
        reentrantLock.lock();
        try {
            kotlinx.coroutines.flow.j<List<NavBackStackEntry>> jVar = this.f25235b;
            List<NavBackStackEntry> value = jVar.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : value) {
                if (!(!kotlin.jvm.internal.f0.g((NavBackStackEntry) obj, popUpTo))) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            jVar.setValue(arrayList);
            b2 b2Var = b2.f124493a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void i(@dl.d NavBackStackEntry popUpTo, boolean z10) {
        boolean z11;
        NavBackStackEntry navBackStackEntryPrevious;
        NavBackStackEntry navBackStackEntry;
        boolean z12;
        kotlin.jvm.internal.f0.p(popUpTo, "popUpTo");
        Set<NavBackStackEntry> value = this.f25236c.getValue();
        if (!(value instanceof Collection) || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z11 = false;
                    break;
                } else {
                    if (((NavBackStackEntry) it.next()) == popUpTo) {
                        z11 = true;
                        break;
                    }
                }
            }
        } else {
            z11 = false;
            break;
        }
        if (z11) {
            List<NavBackStackEntry> value2 = this.f25238e.getValue();
            if (!(value2 instanceof Collection) || !value2.isEmpty()) {
                Iterator<T> it2 = value2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z12 = true;
                        break;
                    } else {
                        if (((NavBackStackEntry) it2.next()) == popUpTo) {
                            z12 = false;
                            break;
                        }
                    }
                }
            } else {
                z12 = true;
                break;
            }
            if (z12) {
                return;
            }
        }
        kotlinx.coroutines.flow.j<Set<NavBackStackEntry>> jVar = this.f25236c;
        jVar.setValue(e1.D(jVar.getValue(), popUpTo));
        List<NavBackStackEntry> value3 = this.f25238e.getValue();
        ListIterator<NavBackStackEntry> listIterator = value3.listIterator(value3.size());
        do {
            if (!listIterator.hasPrevious()) {
                navBackStackEntryPrevious = null;
                break;
            } else {
                navBackStackEntryPrevious = listIterator.previous();
                navBackStackEntry = navBackStackEntryPrevious;
            }
        } while (!(!kotlin.jvm.internal.f0.g(navBackStackEntry, popUpTo) && this.f25238e.getValue().lastIndexOf(navBackStackEntry) < this.f25238e.getValue().lastIndexOf(popUpTo)));
        NavBackStackEntry navBackStackEntry2 = navBackStackEntryPrevious;
        if (navBackStackEntry2 != null) {
            kotlinx.coroutines.flow.j<Set<NavBackStackEntry>> jVar2 = this.f25236c;
            jVar2.setValue(e1.D(jVar2.getValue(), navBackStackEntry2));
        }
        h(popUpTo, z10);
    }

    @androidx.annotation.i
    public void j(@dl.d NavBackStackEntry entry) {
        kotlin.jvm.internal.f0.p(entry, "entry");
        kotlinx.coroutines.flow.j<Set<NavBackStackEntry>> jVar = this.f25236c;
        jVar.setValue(e1.D(jVar.getValue(), entry));
    }

    public void k(@dl.d NavBackStackEntry backStackEntry) {
        kotlin.jvm.internal.f0.p(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f25234a;
        reentrantLock.lock();
        try {
            kotlinx.coroutines.flow.j<List<NavBackStackEntry>> jVar = this.f25235b;
            jVar.setValue(CollectionsKt___CollectionsKt.z4(jVar.getValue(), backStackEntry));
            b2 b2Var = b2.f124493a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void l(@dl.d NavBackStackEntry backStackEntry) {
        boolean z10;
        kotlin.jvm.internal.f0.p(backStackEntry, "backStackEntry");
        Set<NavBackStackEntry> value = this.f25236c.getValue();
        boolean z11 = true;
        if (!(value instanceof Collection) || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                } else {
                    if (((NavBackStackEntry) it.next()) == backStackEntry) {
                        z10 = true;
                        break;
                    }
                }
            }
        } else {
            z10 = false;
            break;
        }
        if (z10) {
            List<NavBackStackEntry> value2 = this.f25238e.getValue();
            if (!(value2 instanceof Collection) || !value2.isEmpty()) {
                Iterator<T> it2 = value2.iterator();
                do {
                    if (!it2.hasNext()) {
                        z11 = false;
                        break;
                    }
                } while (!(((NavBackStackEntry) it2.next()) == backStackEntry));
            } else {
                z11 = false;
                break;
            }
            if (z11) {
                return;
            }
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) CollectionsKt___CollectionsKt.q3(this.f25238e.getValue());
        if (navBackStackEntry != null) {
            kotlinx.coroutines.flow.j<Set<NavBackStackEntry>> jVar = this.f25236c;
            jVar.setValue(e1.D(jVar.getValue(), navBackStackEntry));
        }
        kotlinx.coroutines.flow.j<Set<NavBackStackEntry>> jVar2 = this.f25236c;
        jVar2.setValue(e1.D(jVar2.getValue(), backStackEntry));
        k(backStackEntry);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void m(boolean z10) {
        this.f25237d = z10;
    }
}
