package androidx.navigation.fragment;

import androidx.annotation.d0;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDestinationBuilder;
import androidx.navigation.b0;
import androidx.navigation.m0;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.r;
import kotlin.s0;

/* JADX INFO: compiled from: FragmentNavigatorDestinationBuilder.kt */
/* JADX INFO: loaded from: classes6.dex */
@b0
@t0({"SMAP\nFragmentNavigatorDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigatorDestinationBuilder.kt\nandroidx/navigation/fragment/FragmentNavigatorDestinationBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1#2:187\n*E\n"})
public final class i extends NavDestinationBuilder<FragmentNavigator.c> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private kotlin.reflect.d<? extends Fragment> f25140i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @kotlin.k(message = "Use routes to build your FragmentNavigatorDestination instead", replaceWith = @s0(expression = "FragmentNavigatorDestinationBuilder(navigator, route = id.toString(), fragmentClass) ", imports = {}))
    public i(@dl.d FragmentNavigator navigator, @d0 int i10, @dl.d kotlin.reflect.d<? extends Fragment> fragmentClass) {
        super(navigator, i10);
        f0.p(navigator, "navigator");
        f0.p(fragmentClass, "fragmentClass");
        this.f25140i = fragmentClass;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@dl.d FragmentNavigator navigator, @dl.d String route, @dl.d kotlin.reflect.d<? extends Fragment> fragmentClass) {
        super(navigator, route);
        f0.p(navigator, "navigator");
        f0.p(route, "route");
        f0.p(fragmentClass, "fragmentClass");
        this.f25140i = fragmentClass;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@dl.d FragmentNavigator navigator, @dl.d kotlin.reflect.d<? extends Object> route, @dl.d Map<r, m0<?>> typeMap, @dl.d kotlin.reflect.d<? extends Fragment> fragmentClass) {
        super(navigator, route, typeMap);
        f0.p(navigator, "navigator");
        f0.p(route, "route");
        f0.p(typeMap, "typeMap");
        f0.p(fragmentClass, "fragmentClass");
        this.f25140i = fragmentClass;
    }

    @Override // androidx.navigation.NavDestinationBuilder
    @dl.d
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public FragmentNavigator.c d() {
        FragmentNavigator.c cVar = (FragmentNavigator.c) super.d();
        String name = xh.a.e(this.f25140i).getName();
        f0.o(name, "fragmentClass.java.name");
        cVar.k0(name);
        return cVar;
    }
}
