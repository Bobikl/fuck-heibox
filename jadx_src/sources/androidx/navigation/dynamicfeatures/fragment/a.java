package androidx.navigation.dynamicfeatures.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import androidx.navigation.dynamicfeatures.DynamicInstallManager;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.j0;
import androidx.navigation.q0;
import dl.d;
import dl.e;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.s;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: DynamicFragmentNavigator.kt */
/* JADX INFO: loaded from: classes6.dex */
@Navigator.b("fragment")
public final class a extends FragmentNavigator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @d
    private final DynamicInstallManager f25012m;

    /* JADX INFO: renamed from: androidx.navigation.dynamicfeatures.fragment.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DynamicFragmentNavigator.kt */
    @t0({"SMAP\nDynamicFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DynamicFragmentNavigator.kt\nandroidx/navigation/dynamicfeatures/fragment/DynamicFragmentNavigator$Destination\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,104:1\n55#2,6:105\n*S KotlinDebug\n*F\n+ 1 DynamicFragmentNavigator.kt\nandroidx/navigation/dynamicfeatures/fragment/DynamicFragmentNavigator$Destination\n*L\n86#1:105,6\n*E\n"})
    public static final class C0190a extends FragmentNavigator.c {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @e
        private String f25013o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0190a(@d Navigator<? extends FragmentNavigator.c> fragmentNavigator) {
            super(fragmentNavigator);
            f0.p(fragmentNavigator, "fragmentNavigator");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0190a(@d q0 navigatorProvider) {
            super(navigatorProvider);
            f0.p(navigatorProvider, "navigatorProvider");
        }

        @Override // androidx.navigation.fragment.FragmentNavigator.c, androidx.navigation.NavDestination
        public void R(@d Context context, @d AttributeSet attrs) {
            f0.p(context, "context");
            f0.p(attrs, "attrs");
            super.R(context, attrs);
            int[] DynamicFragmentNavigator = R.styleable.f25011a;
            f0.o(DynamicFragmentNavigator, "DynamicFragmentNavigator");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, DynamicFragmentNavigator, 0, 0);
            this.f25013o = typedArrayObtainStyledAttributes.getString(R.styleable.DynamicFragmentNavigator_moduleName);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // androidx.navigation.fragment.FragmentNavigator.c, androidx.navigation.NavDestination
        public boolean equals(@e Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof C0190a)) {
                return false;
            }
            return super.equals(obj) && f0.g(this.f25013o, ((C0190a) obj).f25013o);
        }

        @Override // androidx.navigation.fragment.FragmentNavigator.c, androidx.navigation.NavDestination
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this.f25013o;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @e
        public final String l0() {
            return this.f25013o;
        }

        public final void n0(@e String str) {
            this.f25013o = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@d Context context, @d FragmentManager manager, int i10, @d DynamicInstallManager installManager) {
        super(context, manager, i10);
        f0.p(context, "context");
        f0.p(manager, "manager");
        f0.p(installManager, "installManager");
        this.f25012m = installManager;
    }

    private final void B(NavBackStackEntry navBackStackEntry, j0 j0Var, Navigator.a aVar) {
        String strL0;
        NavDestination navDestinationE = navBackStackEntry.e();
        androidx.navigation.dynamicfeatures.e eVar = aVar instanceof androidx.navigation.dynamicfeatures.e ? (androidx.navigation.dynamicfeatures.e) aVar : null;
        if ((navDestinationE instanceof C0190a) && (strL0 = ((C0190a) navDestinationE).l0()) != null && this.f25012m.e(strL0)) {
            this.f25012m.f(navBackStackEntry, eVar, strL0);
            return;
        }
        List<NavBackStackEntry> listK = s.k(navBackStackEntry);
        if (eVar != null) {
            aVar = eVar.a();
        }
        super.e(listK, j0Var, aVar);
    }

    @Override // androidx.navigation.fragment.FragmentNavigator
    @d
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public C0190a a() {
        return new C0190a(this);
    }

    @Override // androidx.navigation.fragment.FragmentNavigator, androidx.navigation.Navigator
    public void e(@d List<NavBackStackEntry> entries, @e j0 j0Var, @e Navigator.a aVar) {
        f0.p(entries, "entries");
        Iterator<NavBackStackEntry> it = entries.iterator();
        while (it.hasNext()) {
            B(it.next(), j0Var, aVar);
        }
    }
}
