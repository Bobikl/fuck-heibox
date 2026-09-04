package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: NoOpNavigator.kt */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@Navigator.b("NoOp")
public final class t0 extends Navigator<NavDestination> {
    @Override // androidx.navigation.Navigator
    @dl.d
    public NavDestination a() {
        return new NavDestination(this);
    }

    @Override // androidx.navigation.Navigator
    @dl.d
    public NavDestination d(@dl.d NavDestination destination, @dl.e Bundle bundle, @dl.e j0 j0Var, @dl.e Navigator.a aVar) {
        kotlin.jvm.internal.f0.p(destination, "destination");
        return destination;
    }

    @Override // androidx.navigation.Navigator
    public boolean k() {
        return true;
    }
}
