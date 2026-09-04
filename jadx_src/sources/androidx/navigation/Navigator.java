package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.NavDestination;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: Navigator.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Navigator.kt\nandroidx/navigation/Navigator\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,242:1\n1313#2,2:243\n*S KotlinDebug\n*F\n+ 1 Navigator.kt\nandroidx/navigation/Navigator\n*L\n136#1:243,2\n*E\n"})
public abstract class Navigator<D extends NavDestination> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private s0 f24948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24949b;

    /* JADX INFO: compiled from: Navigator.kt */
    public interface a {
    }

    /* JADX INFO: compiled from: Navigator.kt */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @mh.c(AnnotationRetention.RUNTIME)
    @Retention(RetentionPolicy.RUNTIME)
    @mh.d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
    public @interface b {
        String value();
    }

    @dl.d
    public abstract D a();

    @dl.d
    protected final s0 b() {
        s0 s0Var = this.f24948a;
        if (s0Var != null) {
            return s0Var;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    public final boolean c() {
        return this.f24949b;
    }

    @dl.e
    public NavDestination d(@dl.d D destination, @dl.e Bundle bundle, @dl.e j0 j0Var, @dl.e a aVar) {
        kotlin.jvm.internal.f0.p(destination, "destination");
        return destination;
    }

    public void e(@dl.d List<NavBackStackEntry> entries, @dl.e final j0 j0Var, @dl.e final a aVar) {
        kotlin.jvm.internal.f0.p(entries, "entries");
        Iterator it = SequencesKt___SequencesKt.v0(SequencesKt___SequencesKt.k1(CollectionsKt___CollectionsKt.v1(entries), new yh.l<NavBackStackEntry, NavBackStackEntry>(this) { // from class: androidx.navigation.Navigator$navigate$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Navigator<D> f24950b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f24950b = this;
            }

            @Override // yh.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final NavBackStackEntry invoke(NavBackStackEntry backStackEntry) {
                NavDestination navDestinationD;
                kotlin.jvm.internal.f0.p(backStackEntry, "backStackEntry");
                NavDestination navDestinationE = backStackEntry.e();
                if (!(navDestinationE instanceof NavDestination)) {
                    navDestinationE = null;
                }
                if (navDestinationE != null && (navDestinationD = this.f24950b.d(navDestinationE, backStackEntry.c(), j0Var, aVar)) != null) {
                    return kotlin.jvm.internal.f0.g(navDestinationD, navDestinationE) ? backStackEntry : this.f24950b.b().a(navDestinationD, navDestinationD.i(backStackEntry.c()));
                }
                return null;
            }
        })).iterator();
        while (it.hasNext()) {
            b().k((NavBackStackEntry) it.next());
        }
    }

    @androidx.annotation.i
    public void f(@dl.d s0 state) {
        kotlin.jvm.internal.f0.p(state, "state");
        this.f24948a = state;
        this.f24949b = true;
    }

    public void g(@dl.d NavBackStackEntry backStackEntry) {
        kotlin.jvm.internal.f0.p(backStackEntry, "backStackEntry");
        NavDestination navDestinationE = backStackEntry.e();
        if (!(navDestinationE instanceof NavDestination)) {
            navDestinationE = null;
        }
        if (navDestinationE == null) {
            return;
        }
        d(navDestinationE, null, k0.a(new yh.l<NavOptionsBuilder, b2>() { // from class: androidx.navigation.Navigator$onLaunchSingleTop$1
            public final void a(NavOptionsBuilder navOptions) {
                kotlin.jvm.internal.f0.p(navOptions, "$this$navOptions");
                navOptions.t(true);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(NavOptionsBuilder navOptionsBuilder) {
                a(navOptionsBuilder);
                return b2.f124493a;
            }
        }), null);
        b().f(backStackEntry);
    }

    public void h(@dl.d Bundle savedState) {
        kotlin.jvm.internal.f0.p(savedState, "savedState");
    }

    @dl.e
    public Bundle i() {
        return null;
    }

    public void j(@dl.d NavBackStackEntry popUpTo, boolean z10) {
        kotlin.jvm.internal.f0.p(popUpTo, "popUpTo");
        List<NavBackStackEntry> value = b().b().getValue();
        if (!value.contains(popUpTo)) {
            throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + value).toString());
        }
        ListIterator<NavBackStackEntry> listIterator = value.listIterator(value.size());
        NavBackStackEntry navBackStackEntryPrevious = null;
        while (k()) {
            navBackStackEntryPrevious = listIterator.previous();
            if (kotlin.jvm.internal.f0.g(navBackStackEntryPrevious, popUpTo)) {
                break;
            }
        }
        if (navBackStackEntryPrevious != null) {
            b().h(navBackStackEntryPrevious, z10);
        }
    }

    public boolean k() {
        return true;
    }
}
