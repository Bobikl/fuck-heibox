package androidx.navigation.dynamicfeatures.fragment;

import androidx.annotation.d0;
import androidx.fragment.app.Fragment;
import androidx.navigation.dynamicfeatures.m;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.fragment.i;
import androidx.navigation.m0;
import java.util.Map;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.t0;
import kotlin.k;
import kotlin.reflect.d;
import kotlin.reflect.r;
import kotlin.s0;
import yh.l;

/* JADX INFO: compiled from: DynamicFragmentNavigatorDestinationBuilder.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nDynamicFragmentNavigatorDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DynamicFragmentNavigatorDestinationBuilder.kt\nandroidx/navigation/dynamicfeatures/fragment/DynamicFragmentNavigatorDestinationBuilderKt\n+ 2 FragmentNavigatorDestinationBuilder.kt\nandroidx/navigation/fragment/FragmentNavigatorDestinationBuilderKt\n+ 3 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n*L\n1#1,229:1\n75#1,3:235\n78#1,5:239\n115#1,3:250\n118#1,5:254\n162#1,3:278\n166#1,5:282\n162#1,9:287\n57#2,2:230\n59#2,2:233\n80#2,2:245\n82#2,2:248\n108#2,3:260\n112#2,5:264\n108#2,9:269\n157#3:232\n157#3:238\n157#3:244\n157#3:247\n157#3:253\n157#3:259\n157#3:263\n157#3:281\n157#3:296\n*S KotlinDebug\n*F\n+ 1 DynamicFragmentNavigatorDestinationBuilder.kt\nandroidx/navigation/dynamicfeatures/fragment/DynamicFragmentNavigatorDestinationBuilderKt\n*L\n57#1:235,3\n57#1:239,5\n101#1:250,3\n101#1:254,5\n146#1:278,3\n146#1:282,5\n146#1:287,9\n42#1:230,2\n42#1:233,2\n90#1:245,2\n90#1:248,2\n133#1:260,3\n133#1:264,5\n133#1:269,9\n42#1:232\n57#1:238\n77#1:244\n90#1:247\n101#1:253\n117#1:259\n133#1:263\n146#1:281\n164#1:296\n*E\n"})
public final class c {
    @k(message = "Use routes to create your DynamicFragmentDestination instead", replaceWith = @s0(expression = "fragment(route = id.toString())", imports = {}))
    public static final /* synthetic */ <F extends Fragment> void a(m mVar, @d0 int i10) {
        f0.p(mVar, "<this>");
        FragmentNavigator fragmentNavigator = (FragmentNavigator) mVar.t().e(FragmentNavigator.class);
        f0.y(4, "F");
        mVar.s(new i(fragmentNavigator, i10, (d<? extends Fragment>) n0.d(Fragment.class)));
    }

    @k(message = "Use routes to create your DynamicFragmentDestination instead", replaceWith = @s0(expression = "fragment(route = id.toString(), fragmentClassName) { builder.invoke() }", imports = {}))
    public static final void b(@dl.d m mVar, @d0 int i10, @dl.d String fragmentClassName, @dl.d l<? super b, b2> builder) {
        f0.p(mVar, "<this>");
        f0.p(fragmentClassName, "fragmentClassName");
        f0.p(builder, "builder");
        b bVar = new b((a) mVar.t().e(a.class), i10, fragmentClassName);
        builder.invoke(bVar);
        mVar.s(bVar);
    }

    @k(message = "Use routes to create your DynamicFragmentDestination instead", replaceWith = @s0(expression = "fragment(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final /* synthetic */ <F extends Fragment> void c(m mVar, @d0 int i10, l<? super b, b2> builder) {
        f0.p(mVar, "<this>");
        f0.p(builder, "builder");
        f0.y(4, "F");
        String name = Fragment.class.getName();
        f0.o(name, "F::class.java.name");
        b bVar = new b((a) mVar.t().e(a.class), i10, name);
        builder.invoke(bVar);
        mVar.s(bVar);
    }

    public static final /* synthetic */ <F extends Fragment> void d(m mVar, String route) {
        f0.p(mVar, "<this>");
        f0.p(route, "route");
        FragmentNavigator fragmentNavigator = (FragmentNavigator) mVar.t().e(FragmentNavigator.class);
        f0.y(4, "F");
        mVar.s(new i(fragmentNavigator, route, (d<? extends Fragment>) n0.d(Fragment.class)));
    }

    public static final void e(@dl.d m mVar, @dl.d String route, @dl.d String fragmentClassName, @dl.d l<? super b, b2> builder) {
        f0.p(mVar, "<this>");
        f0.p(route, "route");
        f0.p(fragmentClassName, "fragmentClassName");
        f0.p(builder, "builder");
        b bVar = new b((a) mVar.t().e(a.class), route, fragmentClassName);
        builder.invoke(bVar);
        mVar.s(bVar);
    }

    public static final /* synthetic */ <T> void f(m mVar, String fragmentClassName, Map<r, m0<?>> typeMap, l<? super b, b2> builder) {
        f0.p(mVar, "<this>");
        f0.p(fragmentClassName, "fragmentClassName");
        f0.p(typeMap, "typeMap");
        f0.p(builder, "builder");
        a aVar = (a) mVar.t().e(a.class);
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        b bVar = new b(aVar, n0.d(Object.class), typeMap, fragmentClassName);
        builder.invoke(bVar);
        mVar.s(bVar);
    }

    public static final /* synthetic */ <F extends Fragment> void g(m mVar, String route, l<? super b, b2> builder) {
        f0.p(mVar, "<this>");
        f0.p(route, "route");
        f0.p(builder, "builder");
        f0.y(4, "F");
        String name = Fragment.class.getName();
        f0.o(name, "F::class.java.name");
        b bVar = new b((a) mVar.t().e(a.class), route, name);
        builder.invoke(bVar);
        mVar.s(bVar);
    }

    public static final /* synthetic */ <F extends Fragment, T> void h(m mVar, Map<r, m0<?>> typeMap) {
        f0.p(mVar, "<this>");
        f0.p(typeMap, "typeMap");
        FragmentNavigator fragmentNavigator = (FragmentNavigator) mVar.t().e(FragmentNavigator.class);
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        d dVarD = n0.d(Object.class);
        f0.y(4, "F");
        mVar.s(new i(fragmentNavigator, dVarD, typeMap, n0.d(Fragment.class)));
    }

    public static final /* synthetic */ <F extends Fragment, T> void i(m mVar, Map<r, m0<?>> typeMap, l<? super b, b2> builder) {
        f0.p(mVar, "<this>");
        f0.p(typeMap, "typeMap");
        f0.p(builder, "builder");
        f0.y(4, "F");
        String name = Fragment.class.getName();
        f0.o(name, "F::class.java.name");
        a aVar = (a) mVar.t().e(a.class);
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        b bVar = new b(aVar, n0.d(Object.class), typeMap, name);
        builder.invoke(bVar);
        mVar.s(bVar);
    }

    public static /* synthetic */ void j(m mVar, String fragmentClassName, Map typeMap, l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            typeMap = kotlin.collections.s0.z();
        }
        f0.p(mVar, "<this>");
        f0.p(fragmentClassName, "fragmentClassName");
        f0.p(typeMap, "typeMap");
        f0.p(builder, "builder");
        a aVar = (a) mVar.t().e(a.class);
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        b bVar = new b(aVar, n0.d(Object.class), typeMap, fragmentClassName);
        builder.invoke(bVar);
        mVar.s(bVar);
    }

    public static /* synthetic */ void k(m mVar, Map typeMap, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            typeMap = kotlin.collections.s0.z();
        }
        f0.p(mVar, "<this>");
        f0.p(typeMap, "typeMap");
        FragmentNavigator fragmentNavigator = (FragmentNavigator) mVar.t().e(FragmentNavigator.class);
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        d dVarD = n0.d(Object.class);
        f0.y(4, "F");
        mVar.s(new i(fragmentNavigator, dVarD, typeMap, n0.d(Fragment.class)));
    }

    public static /* synthetic */ void l(m mVar, Map typeMap, l builder, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            typeMap = kotlin.collections.s0.z();
        }
        f0.p(mVar, "<this>");
        f0.p(typeMap, "typeMap");
        f0.p(builder, "builder");
        f0.y(4, "F");
        String name = Fragment.class.getName();
        f0.o(name, "F::class.java.name");
        a aVar = (a) mVar.t().e(a.class);
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        b bVar = new b(aVar, n0.d(Object.class), typeMap, name);
        builder.invoke(bVar);
        mVar.s(bVar);
    }
}
