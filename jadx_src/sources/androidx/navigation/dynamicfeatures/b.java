package androidx.navigation.dynamicfeatures;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.navigation.ActivityNavigator;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import androidx.navigation.j0;
import androidx.navigation.q0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.s;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: DynamicActivityNavigator.kt */
/* JADX INFO: loaded from: classes6.dex */
@Navigator.b(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY)
public final class b extends ActivityNavigator {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final DynamicInstallManager f24987k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final String f24988l;

    /* JADX INFO: compiled from: DynamicActivityNavigator.kt */
    @t0({"SMAP\nDynamicActivityNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DynamicActivityNavigator.kt\nandroidx/navigation/dynamicfeatures/DynamicActivityNavigator$Destination\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,114:1\n55#2,6:115\n*S KotlinDebug\n*F\n+ 1 DynamicActivityNavigator.kt\nandroidx/navigation/dynamicfeatures/DynamicActivityNavigator$Destination\n*L\n96#1:115,6\n*E\n"})
    public static final class a extends ActivityNavigator.b {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @dl.e
        private String f24989t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@dl.d Navigator<? extends ActivityNavigator.b> activityNavigator) {
            super(activityNavigator);
            f0.p(activityNavigator, "activityNavigator");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@dl.d q0 navigatorProvider) {
            super(navigatorProvider);
            f0.p(navigatorProvider, "navigatorProvider");
        }

        @dl.e
        public final String C0() {
            return this.f24989t;
        }

        public final void D0(@dl.e String str) {
            this.f24989t = str;
        }

        @Override // androidx.navigation.ActivityNavigator.b, androidx.navigation.NavDestination
        public void R(@dl.d Context context, @dl.d AttributeSet attrs) {
            f0.p(context, "context");
            f0.p(attrs, "attrs");
            super.R(context, attrs);
            int[] DynamicActivityNavigator = R.styleable.f24980a;
            f0.o(DynamicActivityNavigator, "DynamicActivityNavigator");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, DynamicActivityNavigator, 0, 0);
            this.f24989t = typedArrayObtainStyledAttributes.getString(R.styleable.DynamicActivityNavigator_moduleName);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // androidx.navigation.ActivityNavigator.b, androidx.navigation.NavDestination
        public boolean equals(@dl.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            return super.equals(obj) && f0.g(this.f24989t, ((a) obj).f24989t);
        }

        @Override // androidx.navigation.ActivityNavigator.b, androidx.navigation.NavDestination
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this.f24989t;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@dl.d Context context, @dl.d DynamicInstallManager installManager) {
        super(context);
        f0.p(context, "context");
        f0.p(installManager, "installManager");
        this.f24987k = installManager;
        String packageName = context.getPackageName();
        f0.o(packageName, "context.packageName");
        this.f24988l = packageName;
    }

    private final void r(NavBackStackEntry navBackStackEntry, j0 j0Var, Navigator.a aVar) {
        String strC0;
        NavDestination navDestinationE = navBackStackEntry.e();
        e eVar = aVar instanceof e ? (e) aVar : null;
        if ((navDestinationE instanceof a) && (strC0 = ((a) navDestinationE).C0()) != null && this.f24987k.e(strC0)) {
            this.f24987k.f(navBackStackEntry, eVar, strC0);
            return;
        }
        List<NavBackStackEntry> listK = s.k(navBackStackEntry);
        if (eVar != null) {
            aVar = eVar.a();
        }
        super.e(listK, j0Var, aVar);
    }

    @Override // androidx.navigation.Navigator
    public void e(@dl.d List<NavBackStackEntry> entries, @dl.e j0 j0Var, @dl.e Navigator.a aVar) {
        f0.p(entries, "entries");
        Iterator<NavBackStackEntry> it = entries.iterator();
        while (it.hasNext()) {
            r(it.next(), j0Var, aVar);
        }
    }

    @Override // androidx.navigation.ActivityNavigator
    @dl.d
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public a a() {
        return new a(this);
    }

    @dl.d
    public final String q() {
        return this.f24988l;
    }
}
