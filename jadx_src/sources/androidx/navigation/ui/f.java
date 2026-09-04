package androidx.navigation.ui;

import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: CollapsingToolbarLayout.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nCollapsingToolbarLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollapsingToolbarLayout.kt\nandroidx/navigation/ui/CollapsingToolbarLayoutKt\n+ 2 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfigurationKt\n*L\n1#1,79:1\n248#2,9:80\n248#2,9:89\n*S KotlinDebug\n*F\n+ 1 CollapsingToolbarLayout.kt\nandroidx/navigation/ui/CollapsingToolbarLayoutKt\n*L\n51#1:80,9\n75#1:89,9\n*E\n"})
public final class f {
    public static final void a(@dl.d CollapsingToolbarLayout collapsingToolbarLayout, @dl.d Toolbar toolbar, @dl.d NavController navController, @dl.e DrawerLayout drawerLayout) {
        f0.p(collapsingToolbarLayout, "<this>");
        f0.p(toolbar, "toolbar");
        f0.p(navController, "navController");
        p.v(collapsingToolbarLayout, toolbar, navController, new d.a(navController.W()).d(drawerLayout).c(new AppBarConfigurationKt.a(AppBarConfigurationKt$AppBarConfiguration$1.f25287b)).a());
    }

    public static final void b(@dl.d CollapsingToolbarLayout collapsingToolbarLayout, @dl.d Toolbar toolbar, @dl.d NavController navController, @dl.d d configuration) {
        f0.p(collapsingToolbarLayout, "<this>");
        f0.p(toolbar, "toolbar");
        f0.p(navController, "navController");
        f0.p(configuration, "configuration");
        p.v(collapsingToolbarLayout, toolbar, navController, configuration);
    }

    public static /* synthetic */ void c(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, NavController navController, d dVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            dVar = new d.a(navController.W()).d(null).c(new AppBarConfigurationKt.a(AppBarConfigurationKt$AppBarConfiguration$1.f25287b)).a();
        }
        b(collapsingToolbarLayout, toolbar, navController, dVar);
    }
}
