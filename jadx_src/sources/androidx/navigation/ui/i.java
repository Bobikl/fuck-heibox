package androidx.navigation.ui;

import androidx.navigation.NavController;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: NavController.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nNavController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavController.kt\nandroidx/navigation/ui/NavControllerKt\n+ 2 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfigurationKt\n*L\n1#1,39:1\n248#2,9:40\n*S KotlinDebug\n*F\n+ 1 NavController.kt\nandroidx/navigation/ui/NavControllerKt\n*L\n30#1:40,9\n*E\n"})
public final class i {
    public static final boolean a(@dl.d NavController navController, @dl.e androidx.customview.widget.c cVar) {
        f0.p(navController, "<this>");
        return p.j(navController, new d.a(navController.W()).d(cVar).c(new AppBarConfigurationKt.a(AppBarConfigurationKt$AppBarConfiguration$1.f25287b)).a());
    }

    public static final boolean b(@dl.d NavController navController, @dl.d d appBarConfiguration) {
        f0.p(navController, "<this>");
        f0.p(appBarConfiguration, "appBarConfiguration");
        return p.j(navController, appBarConfiguration);
    }
}
