package androidx.navigation.ui;

import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: Toolbar.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nToolbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toolbar.kt\nandroidx/navigation/ui/ToolbarKt\n+ 2 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfigurationKt\n*L\n1#1,73:1\n248#2,9:74\n248#2,9:83\n*S KotlinDebug\n*F\n+ 1 Toolbar.kt\nandroidx/navigation/ui/ToolbarKt\n*L\n47#1:74,9\n69#1:83,9\n*E\n"})
public final class t {
    public static final void a(@dl.d Toolbar toolbar, @dl.d NavController navController, @dl.e DrawerLayout drawerLayout) {
        f0.p(toolbar, "<this>");
        f0.p(navController, "navController");
        p.s(toolbar, navController, new d.a(navController.W()).d(drawerLayout).c(new AppBarConfigurationKt.a(AppBarConfigurationKt$AppBarConfiguration$1.f25287b)).a());
    }

    public static final void b(@dl.d Toolbar toolbar, @dl.d NavController navController, @dl.d d configuration) {
        f0.p(toolbar, "<this>");
        f0.p(navController, "navController");
        f0.p(configuration, "configuration");
        p.s(toolbar, navController, configuration);
    }

    public static /* synthetic */ void c(Toolbar toolbar, NavController navController, d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            dVar = new d.a(navController.W()).d(null).c(new AppBarConfigurationKt.a(AppBarConfigurationKt$AppBarConfiguration$1.f25287b)).a();
        }
        b(toolbar, navController, dVar);
    }
}
