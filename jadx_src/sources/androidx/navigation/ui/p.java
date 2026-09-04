package androidx.navigation.ui;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.RestrictTo;
import androidx.annotation.d0;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.navigation.ActivityNavigator;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.j0;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: NavigationUI.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nNavigationUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationUI.kt\nandroidx/navigation/ui/NavigationUI\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,714:1\n1247#2,2:715\n*S KotlinDebug\n*F\n+ 1 NavigationUI.kt\nandroidx/navigation/ui/NavigationUI\n*L\n712#1:715,2\n*E\n"})
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final p f25317a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final String f25318b = "NavigationUI";

    /* JADX INFO: compiled from: NavigationUI.kt */
    @t0({"SMAP\nNavigationUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationUI.kt\nandroidx/navigation/ui/NavigationUI$setupWithNavController$12\n+ 2 Menu.kt\nandroidx/core/view/MenuKt\n*L\n1#1,714:1\n56#2,4:715\n*S KotlinDebug\n*F\n+ 1 NavigationUI.kt\nandroidx/navigation/ui/NavigationUI$setupWithNavController$12\n*L\n695#1:715,4\n*E\n"})
    public static final class a implements NavController.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference<NavigationBarView> f25319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ NavController f25320b;

        a(WeakReference<NavigationBarView> weakReference, NavController navController) {
            this.f25319a = weakReference;
            this.f25320b = navController;
        }

        @Override // androidx.navigation.NavController.b
        public void a(NavController controller, NavDestination destination, Bundle bundle) {
            f0.p(controller, "controller");
            f0.p(destination, "destination");
            NavigationBarView navigationBarView = this.f25319a.get();
            if (navigationBarView == null) {
                this.f25320b.i1(this);
                return;
            }
            if (destination instanceof androidx.navigation.h) {
                return;
            }
            Menu menu = navigationBarView.getMenu();
            f0.o(menu, "view.menu");
            int size = menu.size();
            for (int i10 = 0; i10 < size; i10++) {
                MenuItem item = menu.getItem(i10);
                f0.h(item, "getItem(index)");
                if (p.h(destination, item.getItemId())) {
                    item.setChecked(true);
                }
            }
        }
    }

    /* JADX INFO: compiled from: NavigationUI.kt */
    @t0({"SMAP\nNavigationUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationUI.kt\nandroidx/navigation/ui/NavigationUI$setupWithNavController$4\n+ 2 Menu.kt\nandroidx/core/view/MenuKt\n*L\n1#1,714:1\n56#2,4:715\n*S KotlinDebug\n*F\n+ 1 NavigationUI.kt\nandroidx/navigation/ui/NavigationUI$setupWithNavController$4\n*L\n499#1:715,4\n*E\n"})
    public static final class b implements NavController.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference<NavigationView> f25321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ NavController f25322b;

        b(WeakReference<NavigationView> weakReference, NavController navController) {
            this.f25321a = weakReference;
            this.f25322b = navController;
        }

        @Override // androidx.navigation.NavController.b
        public void a(NavController controller, NavDestination destination, Bundle bundle) {
            f0.p(controller, "controller");
            f0.p(destination, "destination");
            NavigationView navigationView = this.f25321a.get();
            if (navigationView == null) {
                this.f25322b.i1(this);
                return;
            }
            if (destination instanceof androidx.navigation.h) {
                return;
            }
            Menu menu = navigationView.getMenu();
            f0.o(menu, "view.menu");
            int size = menu.size();
            for (int i10 = 0; i10 < size; i10++) {
                MenuItem item = menu.getItem(i10);
                f0.h(item, "getItem(index)");
                item.setChecked(p.h(destination, item.getItemId()));
            }
        }
    }

    /* JADX INFO: compiled from: NavigationUI.kt */
    @t0({"SMAP\nNavigationUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationUI.kt\nandroidx/navigation/ui/NavigationUI$setupWithNavController$7\n+ 2 Menu.kt\nandroidx/core/view/MenuKt\n*L\n1#1,714:1\n56#2,4:715\n*S KotlinDebug\n*F\n+ 1 NavigationUI.kt\nandroidx/navigation/ui/NavigationUI$setupWithNavController$7\n*L\n573#1:715,4\n*E\n"})
    public static final class c implements NavController.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference<NavigationView> f25323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ NavController f25324b;

        c(WeakReference<NavigationView> weakReference, NavController navController) {
            this.f25323a = weakReference;
            this.f25324b = navController;
        }

        @Override // androidx.navigation.NavController.b
        public void a(NavController controller, NavDestination destination, Bundle bundle) {
            f0.p(controller, "controller");
            f0.p(destination, "destination");
            NavigationView navigationView = this.f25323a.get();
            if (navigationView == null) {
                this.f25324b.i1(this);
                return;
            }
            if (destination instanceof androidx.navigation.h) {
                return;
            }
            Menu menu = navigationView.getMenu();
            f0.o(menu, "view.menu");
            int size = menu.size();
            for (int i10 = 0; i10 < size; i10++) {
                MenuItem item = menu.getItem(i10);
                f0.h(item, "getItem(index)");
                item.setChecked(p.h(destination, item.getItemId()));
            }
        }
    }

    /* JADX INFO: compiled from: NavigationUI.kt */
    @t0({"SMAP\nNavigationUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationUI.kt\nandroidx/navigation/ui/NavigationUI$setupWithNavController$9\n+ 2 Menu.kt\nandroidx/core/view/MenuKt\n*L\n1#1,714:1\n56#2,4:715\n*S KotlinDebug\n*F\n+ 1 NavigationUI.kt\nandroidx/navigation/ui/NavigationUI$setupWithNavController$9\n*L\n638#1:715,4\n*E\n"})
    public static final class d implements NavController.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference<NavigationBarView> f25325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ NavController f25326b;

        d(WeakReference<NavigationBarView> weakReference, NavController navController) {
            this.f25325a = weakReference;
            this.f25326b = navController;
        }

        @Override // androidx.navigation.NavController.b
        public void a(NavController controller, NavDestination destination, Bundle bundle) {
            f0.p(controller, "controller");
            f0.p(destination, "destination");
            NavigationBarView navigationBarView = this.f25325a.get();
            if (navigationBarView == null) {
                this.f25326b.i1(this);
                return;
            }
            if (destination instanceof androidx.navigation.h) {
                return;
            }
            Menu menu = navigationBarView.getMenu();
            f0.o(menu, "view.menu");
            int size = menu.size();
            for (int i10 = 0; i10 < size; i10++) {
                MenuItem item = menu.getItem(i10);
                f0.h(item, "getItem(index)");
                if (p.h(destination, item.getItemId())) {
                    item.setChecked(true);
                }
            }
        }
    }

    private p() {
    }

    public static /* synthetic */ void A(Toolbar toolbar, NavController navController, androidx.navigation.ui.d dVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            dVar = new androidx.navigation.ui.d.a(navController.W()).a();
        }
        s(toolbar, navController, dVar);
    }

    public static /* synthetic */ void B(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, NavController navController, androidx.navigation.ui.d dVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            dVar = new androidx.navigation.ui.d.a(navController.W()).a();
        }
        v(collapsingToolbarLayout, toolbar, navController, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(NavController navController, androidx.navigation.ui.d configuration, View view) {
        f0.p(navController, "$navController");
        f0.p(configuration, "$configuration");
        j(navController, configuration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(NavController navController, androidx.navigation.ui.d configuration, View view) {
        f0.p(navController, "$navController");
        f0.p(configuration, "$configuration");
        j(navController, configuration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean E(NavController navController, NavigationView navigationView, MenuItem item) {
        f0.p(navController, "$navController");
        f0.p(navigationView, "$navigationView");
        f0.p(item, "item");
        boolean zK = k(item, navController);
        if (zK) {
            ViewParent parent = navigationView.getParent();
            if (parent instanceof androidx.customview.widget.c) {
                ((androidx.customview.widget.c) parent).close();
            } else {
                BottomSheetBehavior<?> bottomSheetBehaviorG = g(navigationView);
                if (bottomSheetBehaviorG != null) {
                    bottomSheetBehaviorG.c(5);
                }
            }
        }
        return zK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean F(NavController navController, boolean z10, NavigationView navigationView, MenuItem item) {
        f0.p(navController, "$navController");
        f0.p(navigationView, "$navigationView");
        f0.p(item, "item");
        boolean zL = l(item, navController, z10);
        if (zL) {
            ViewParent parent = navigationView.getParent();
            if (parent instanceof androidx.customview.widget.c) {
                ((androidx.customview.widget.c) parent).close();
            } else {
                BottomSheetBehavior<?> bottomSheetBehaviorG = g(navigationView);
                if (bottomSheetBehaviorG != null) {
                    bottomSheetBehaviorG.c(5);
                }
            }
        }
        return zL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean G(NavController navController, MenuItem item) {
        f0.p(navController, "$navController");
        f0.p(item, "item");
        return k(item, navController);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean H(NavController navController, boolean z10, MenuItem item) {
        f0.p(navController, "$navController");
        f0.p(item, "item");
        return l(item, navController, z10);
    }

    @dl.e
    @xh.m
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final BottomSheetBehavior<?> g(@dl.d View view) {
        f0.p(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.f) {
            CoordinatorLayout.Behavior behaviorF = ((CoordinatorLayout.f) layoutParams).f();
            if (behaviorF instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) behaviorF;
            }
            return null;
        }
        Object parent = view.getParent();
        if (parent instanceof View) {
            return g((View) parent);
        }
        return null;
    }

    @xh.m
    public static final boolean h(@dl.d NavDestination navDestination, @d0 int i10) {
        boolean z10;
        f0.p(navDestination, "<this>");
        Iterator<NavDestination> it = NavDestination.f24858l.c(navDestination).iterator();
        do {
            z10 = false;
            if (!it.hasNext()) {
                return false;
            }
            if (it.next().A() == i10) {
                z10 = true;
            }
        } while (!z10);
        return true;
    }

    @xh.m
    public static final boolean i(@dl.d NavController navController, @dl.e androidx.customview.widget.c cVar) {
        f0.p(navController, "navController");
        return j(navController, new androidx.navigation.ui.d.a(navController.W()).d(cVar).a());
    }

    @xh.m
    public static final boolean j(@dl.d NavController navController, @dl.d androidx.navigation.ui.d configuration) {
        f0.p(navController, "navController");
        f0.p(configuration, "configuration");
        androidx.customview.widget.c cVarC = configuration.c();
        NavDestination navDestinationU = navController.U();
        if (cVarC != null && navDestinationU != null && configuration.e(navDestinationU)) {
            cVarC.open();
            return true;
        }
        if (navController.J0()) {
            return true;
        }
        androidx.navigation.ui.d.b bVarB = configuration.b();
        if (bVarB != null) {
            return bVarB.a();
        }
        return false;
    }

    @xh.m
    public static final boolean k(@dl.d MenuItem item, @dl.d NavController navController) {
        f0.p(item, "item");
        f0.p(navController, "navController");
        j0.a aVarU = new j0.a().d(true).u(true);
        NavDestination navDestinationU = navController.U();
        f0.m(navDestinationU);
        NavGraph navGraphE = navDestinationU.E();
        f0.m(navGraphE);
        if (navGraphE.r0(item.getItemId()) instanceof ActivityNavigator.b) {
            aVarU.b(R.anim.nav_default_enter_anim).c(R.anim.nav_default_exit_anim).e(R.anim.nav_default_pop_enter_anim).f(R.anim.nav_default_pop_exit_anim);
        } else {
            aVarU.b(R.animator.nav_default_enter_anim).c(R.animator.nav_default_exit_anim).e(R.animator.nav_default_pop_enter_anim).f(R.animator.nav_default_pop_exit_anim);
        }
        if ((item.getOrder() & androidx.profileinstaller.o.c.f26824k) == 0) {
            aVarU.h(NavGraph.f24890r.b(navController.W()).A(), false, true);
        }
        try {
            navController.l0(item.getItemId(), null, aVarU.a());
            NavDestination navDestinationU2 = navController.U();
            return navDestinationU2 != null && h(navDestinationU2, item.getItemId());
        } catch (IllegalArgumentException e10) {
            Log.i(f25318b, "Ignoring onNavDestinationSelected for MenuItem " + NavDestination.f24858l.b(navController.Q(), item.getItemId()) + " as it cannot be found from the current destination " + navController.U(), e10);
            return false;
        }
    }

    @q
    @xh.m
    public static final boolean l(@dl.d MenuItem item, @dl.d NavController navController, boolean z10) {
        f0.p(item, "item");
        f0.p(navController, "navController");
        if (!(!z10)) {
            throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default".toString());
        }
        j0.a aVarD = new j0.a().d(true);
        NavDestination navDestinationU = navController.U();
        f0.m(navDestinationU);
        NavGraph navGraphE = navDestinationU.E();
        f0.m(navGraphE);
        if (navGraphE.r0(item.getItemId()) instanceof ActivityNavigator.b) {
            aVarD.b(R.anim.nav_default_enter_anim).c(R.anim.nav_default_exit_anim).e(R.anim.nav_default_pop_enter_anim).f(R.anim.nav_default_pop_exit_anim);
        } else {
            aVarD.b(R.animator.nav_default_enter_anim).c(R.animator.nav_default_exit_anim).e(R.animator.nav_default_pop_enter_anim).f(R.animator.nav_default_pop_exit_anim);
        }
        if ((item.getOrder() & androidx.profileinstaller.o.c.f26824k) == 0) {
            j0.a.p(aVarD, NavGraph.f24890r.b(navController.W()).A(), false, false, 4, null);
        }
        try {
            navController.l0(item.getItemId(), null, aVarD.a());
            NavDestination navDestinationU2 = navController.U();
            return navDestinationU2 != null && h(navDestinationU2, item.getItemId());
        } catch (IllegalArgumentException e10) {
            Log.i(f25318b, "Ignoring onNavDestinationSelected for MenuItem " + NavDestination.f24858l.b(navController.Q(), item.getItemId()) + " as it cannot be found from the current destination " + navController.U(), e10);
            return false;
        }
    }

    @xh.i
    @xh.m
    public static final void m(@dl.d AppCompatActivity activity, @dl.d NavController navController) {
        f0.p(activity, "activity");
        f0.p(navController, "navController");
        p(activity, navController, null, 4, null);
    }

    @xh.m
    public static final void n(@dl.d AppCompatActivity activity, @dl.d NavController navController, @dl.e androidx.customview.widget.c cVar) {
        f0.p(activity, "activity");
        f0.p(navController, "navController");
        o(activity, navController, new androidx.navigation.ui.d.a(navController.W()).d(cVar).a());
    }

    @xh.i
    @xh.m
    public static final void o(@dl.d AppCompatActivity activity, @dl.d NavController navController, @dl.d androidx.navigation.ui.d configuration) {
        f0.p(activity, "activity");
        f0.p(navController, "navController");
        f0.p(configuration, "configuration");
        navController.s(new androidx.navigation.ui.b(activity, configuration));
    }

    public static /* synthetic */ void p(AppCompatActivity appCompatActivity, NavController navController, androidx.navigation.ui.d dVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            dVar = new androidx.navigation.ui.d.a(navController.W()).a();
        }
        o(appCompatActivity, navController, dVar);
    }

    @xh.i
    @xh.m
    public static final void q(@dl.d Toolbar toolbar, @dl.d NavController navController) {
        f0.p(toolbar, "toolbar");
        f0.p(navController, "navController");
        A(toolbar, navController, null, 4, null);
    }

    @xh.m
    public static final void r(@dl.d Toolbar toolbar, @dl.d NavController navController, @dl.e androidx.customview.widget.c cVar) {
        f0.p(toolbar, "toolbar");
        f0.p(navController, "navController");
        s(toolbar, navController, new androidx.navigation.ui.d.a(navController.W()).d(cVar).a());
    }

    @xh.i
    @xh.m
    public static final void s(@dl.d Toolbar toolbar, @dl.d final NavController navController, @dl.d final androidx.navigation.ui.d configuration) {
        f0.p(toolbar, "toolbar");
        f0.p(navController, "navController");
        f0.p(configuration, "configuration");
        navController.s(new u(toolbar, configuration));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: androidx.navigation.ui.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p.C(navController, configuration, view);
            }
        });
    }

    @xh.i
    @xh.m
    public static final void t(@dl.d CollapsingToolbarLayout collapsingToolbarLayout, @dl.d Toolbar toolbar, @dl.d NavController navController) {
        f0.p(collapsingToolbarLayout, "collapsingToolbarLayout");
        f0.p(toolbar, "toolbar");
        f0.p(navController, "navController");
        B(collapsingToolbarLayout, toolbar, navController, null, 8, null);
    }

    @xh.m
    public static final void u(@dl.d CollapsingToolbarLayout collapsingToolbarLayout, @dl.d Toolbar toolbar, @dl.d NavController navController, @dl.e androidx.customview.widget.c cVar) {
        f0.p(collapsingToolbarLayout, "collapsingToolbarLayout");
        f0.p(toolbar, "toolbar");
        f0.p(navController, "navController");
        v(collapsingToolbarLayout, toolbar, navController, new androidx.navigation.ui.d.a(navController.W()).d(cVar).a());
    }

    @xh.i
    @xh.m
    public static final void v(@dl.d CollapsingToolbarLayout collapsingToolbarLayout, @dl.d Toolbar toolbar, @dl.d final NavController navController, @dl.d final androidx.navigation.ui.d configuration) {
        f0.p(collapsingToolbarLayout, "collapsingToolbarLayout");
        f0.p(toolbar, "toolbar");
        f0.p(navController, "navController");
        f0.p(configuration, "configuration");
        navController.s(new g(collapsingToolbarLayout, toolbar, configuration));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: androidx.navigation.ui.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p.D(navController, configuration, view);
            }
        });
    }

    @xh.m
    public static final void w(@dl.d NavigationBarView navigationBarView, @dl.d final NavController navController) {
        f0.p(navigationBarView, "navigationBarView");
        f0.p(navController, "navController");
        navigationBarView.setOnItemSelectedListener(new NavigationBarView.d() { // from class: androidx.navigation.ui.l
            @Override // com.google.android.material.navigation.NavigationBarView.d
            public final boolean a(MenuItem menuItem) {
                return p.G(navController, menuItem);
            }
        });
        navController.s(new d(new WeakReference(navigationBarView), navController));
    }

    @q
    @xh.m
    public static final void x(@dl.d NavigationBarView navigationBarView, @dl.d final NavController navController, final boolean z10) {
        f0.p(navigationBarView, "navigationBarView");
        f0.p(navController, "navController");
        if (!(!z10)) {
            throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default".toString());
        }
        navigationBarView.setOnItemSelectedListener(new NavigationBarView.d() { // from class: androidx.navigation.ui.o
            @Override // com.google.android.material.navigation.NavigationBarView.d
            public final boolean a(MenuItem menuItem) {
                return p.H(navController, z10, menuItem);
            }
        });
        navController.s(new a(new WeakReference(navigationBarView), navController));
    }

    @xh.m
    public static final void y(@dl.d final NavigationView navigationView, @dl.d final NavController navController) {
        f0.p(navigationView, "navigationView");
        f0.p(navController, "navController");
        navigationView.setNavigationItemSelectedListener(new NavigationView.c() { // from class: androidx.navigation.ui.m
            @Override // com.google.android.material.navigation.NavigationView.c
            public final boolean a(MenuItem menuItem) {
                return p.E(navController, navigationView, menuItem);
            }
        });
        navController.s(new b(new WeakReference(navigationView), navController));
    }

    @q
    @xh.m
    public static final void z(@dl.d final NavigationView navigationView, @dl.d final NavController navController, final boolean z10) {
        f0.p(navigationView, "navigationView");
        f0.p(navController, "navController");
        if (!(!z10)) {
            throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default".toString());
        }
        navigationView.setNavigationItemSelectedListener(new NavigationView.c() { // from class: androidx.navigation.ui.j
            @Override // com.google.android.material.navigation.NavigationView.c
            public final boolean a(MenuItem menuItem) {
                return p.F(navController, z10, navigationView, menuItem);
            }
        });
        navController.s(new c(new WeakReference(navigationView), navController));
    }
}
