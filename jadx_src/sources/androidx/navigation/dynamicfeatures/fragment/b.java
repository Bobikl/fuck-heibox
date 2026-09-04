package androidx.navigation.dynamicfeatures.fragment;

import androidx.annotation.d0;
import androidx.navigation.NavDestination;
import androidx.navigation.NavDestinationBuilder;
import androidx.navigation.b0;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.m0;
import dl.d;
import dl.e;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.k;
import kotlin.reflect.r;
import kotlin.s0;

/* JADX INFO: compiled from: DynamicFragmentNavigatorDestinationBuilder.kt */
/* JADX INFO: loaded from: classes6.dex */
@b0
public final class b extends NavDestinationBuilder<FragmentNavigator.c> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @d
    private String f25014i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @e
    private String f25015j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @k(message = "Use routes to create your DynamicFragmentDestinationBuilder instead", replaceWith = @s0(expression = "DynamicFragmentNavigatorDestinationBuilder(navigator, route = id.toString(), fragmentClassName)", imports = {}))
    public b(@d a navigator, @d0 int i10, @d String fragmentClassName) {
        super(navigator, i10);
        f0.p(navigator, "navigator");
        f0.p(fragmentClassName, "fragmentClassName");
        this.f25014i = fragmentClassName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@d a navigator, @d String route, @d String fragmentClassName) {
        super(navigator, route);
        f0.p(navigator, "navigator");
        f0.p(route, "route");
        f0.p(fragmentClassName, "fragmentClassName");
        this.f25014i = fragmentClassName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@d a navigator, @d kotlin.reflect.d<?> route, @d Map<r, m0<?>> typeMap, @d String fragmentClassName) {
        super(navigator, route, typeMap);
        f0.p(navigator, "navigator");
        f0.p(route, "route");
        f0.p(typeMap, "typeMap");
        f0.p(fragmentClassName, "fragmentClassName");
        this.f25014i = fragmentClassName;
    }

    @Override // androidx.navigation.NavDestinationBuilder
    @d
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public a.C0190a d() {
        NavDestination navDestinationD = super.d();
        f0.n(navDestinationD, "null cannot be cast to non-null type androidx.navigation.dynamicfeatures.fragment.DynamicFragmentNavigator.Destination");
        a.C0190a c0190a = (a.C0190a) navDestinationD;
        c0190a.k0(this.f25014i);
        c0190a.n0(this.f25015j);
        return c0190a;
    }

    @e
    public final String r() {
        return this.f25015j;
    }

    public final void s(@e String str) {
        this.f25015j = str;
    }
}
