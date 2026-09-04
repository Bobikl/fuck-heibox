package androidx.navigation.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: Activity.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Activity.kt\nandroidx/navigation/ui/ActivityKt\n+ 2 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfigurationKt\n*L\n1#1,78:1\n248#2,9:79\n248#2,9:88\n*S KotlinDebug\n*F\n+ 1 Activity.kt\nandroidx/navigation/ui/ActivityKt\n*L\n50#1:79,9\n74#1:88,9\n*E\n"})
public final class c {
    public static final void a(@dl.d AppCompatActivity appCompatActivity, @dl.d NavController navController, @dl.e DrawerLayout drawerLayout) {
        f0.p(appCompatActivity, "<this>");
        f0.p(navController, "navController");
        p.o(appCompatActivity, navController, new d.a(navController.W()).d(drawerLayout).c(new AppBarConfigurationKt.a(AppBarConfigurationKt$AppBarConfiguration$1.f25287b)).a());
    }

    public static final void b(@dl.d AppCompatActivity appCompatActivity, @dl.d NavController navController, @dl.d d configuration) {
        f0.p(appCompatActivity, "<this>");
        f0.p(navController, "navController");
        f0.p(configuration, "configuration");
        p.o(appCompatActivity, navController, configuration);
    }

    public static /* synthetic */ void c(AppCompatActivity appCompatActivity, NavController navController, d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            dVar = new d.a(navController.W()).d(null).c(new AppBarConfigurationKt.a(AppBarConfigurationKt$AppBarConfiguration$1.f25287b)).a();
        }
        b(appCompatActivity, navController, dVar);
    }
}
