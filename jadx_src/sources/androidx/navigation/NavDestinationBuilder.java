package androidx.navigation;

import androidx.annotation.RestrictTo;
import androidx.navigation.NavDestination;
import androidx.navigation.serialization.RouteSerializerKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.b2;
import kotlin.reflect.r;

/* JADX INFO: compiled from: NavDestinationBuilder.kt */
/* JADX INFO: loaded from: classes6.dex */
@b0
@kotlin.jvm.internal.t0({"SMAP\nNavDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestinationBuilder.kt\nandroidx/navigation/NavDestinationBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,398:1\n1855#2,2:399\n1855#2,2:401\n1855#2,2:405\n215#3,2:403\n215#3,2:407\n*S KotlinDebug\n*F\n+ 1 NavDestinationBuilder.kt\nandroidx/navigation/NavDestinationBuilder\n*L\n95#1:399,2\n238#1:401,2\n295#1:405,2\n294#1:403,2\n296#1:407,2\n*E\n"})
public class NavDestinationBuilder<D extends NavDestination> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Navigator<? extends D> f24881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f24882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final String f24883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<r, ? extends m0<?>> f24884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private CharSequence f24885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private Map<String, p> f24886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private List<NavDeepLink> f24887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private Map<Integer, k> f24888h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.k(message = "Use routes to build your NavDestination instead", replaceWith = @kotlin.s0(expression = "NavDestinationBuilder(navigator, route = id.toString())", imports = {}))
    public NavDestinationBuilder(@dl.d Navigator<? extends D> navigator, @androidx.annotation.d0 int i10) {
        this(navigator, i10, (String) null);
        kotlin.jvm.internal.f0.p(navigator, "navigator");
    }

    public NavDestinationBuilder(@dl.d Navigator<? extends D> navigator, @androidx.annotation.d0 int i10, @dl.e String str) {
        kotlin.jvm.internal.f0.p(navigator, "navigator");
        this.f24881a = navigator;
        this.f24882b = i10;
        this.f24883c = str;
        this.f24886f = new LinkedHashMap();
        this.f24887g = new ArrayList();
        this.f24888h = new LinkedHashMap();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDestinationBuilder(@dl.d Navigator<? extends D> navigator, @dl.e String str) {
        this(navigator, -1, str);
        kotlin.jvm.internal.f0.p(navigator, "navigator");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavDestinationBuilder(@dl.d Navigator<? extends D> navigator, @dl.e kotlin.reflect.d<?> dVar, @dl.d Map<r, m0<?>> typeMap) {
        kotlinx.serialization.g gVarG;
        kotlinx.serialization.g gVarG2;
        kotlin.jvm.internal.f0.p(navigator, "navigator");
        kotlin.jvm.internal.f0.p(typeMap, "typeMap");
        int iH = (dVar == null || (gVarG2 = kotlinx.serialization.t.g(dVar)) == null) ? -1 : RouteSerializerKt.h(gVarG2);
        String strL = null;
        if (dVar != null && (gVarG = kotlinx.serialization.t.g(dVar)) != null) {
            strL = RouteSerializerKt.l(gVarG, typeMap, null, 2, null);
        }
        this(navigator, iH, strL);
        if (dVar != null) {
            for (i iVar : RouteSerializerKt.i(kotlinx.serialization.t.g(dVar), typeMap)) {
                this.f24886f.put(iVar.d(), iVar.c());
            }
        }
        this.f24884d = typeMap;
    }

    @kotlin.k(message = "Building NavDestinations using IDs with the Kotlin DSL has been deprecated in favor of using routes. When using routes there is no need for actions.")
    public final void a(int i10, @dl.d yh.l<? super l, b2> actionBuilder) {
        kotlin.jvm.internal.f0.p(actionBuilder, "actionBuilder");
        Map<Integer, k> map = this.f24888h;
        Integer numValueOf = Integer.valueOf(i10);
        l lVar = new l();
        actionBuilder.invoke(lVar);
        map.put(numValueOf, lVar.a());
    }

    public final void b(@dl.d String name, @dl.d p argument) {
        kotlin.jvm.internal.f0.p(name, "name");
        kotlin.jvm.internal.f0.p(argument, "argument");
        this.f24886f.put(name, argument);
    }

    public final void c(@dl.d String name, @dl.d yh.l<? super q, b2> argumentBuilder) {
        kotlin.jvm.internal.f0.p(name, "name");
        kotlin.jvm.internal.f0.p(argumentBuilder, "argumentBuilder");
        Map<String, p> map = this.f24886f;
        q qVar = new q();
        argumentBuilder.invoke(qVar);
        map.put(name, qVar.a());
    }

    @dl.d
    public D d() {
        D d10 = (D) o();
        d10.a0(this.f24885e);
        for (Map.Entry<String, p> entry : this.f24886f.entrySet()) {
            d10.e(entry.getKey(), entry.getValue());
        }
        Iterator<T> it = this.f24887g.iterator();
        while (it.hasNext()) {
            d10.g((NavDeepLink) it.next());
        }
        for (Map.Entry<Integer, k> entry2 : this.f24888h.entrySet()) {
            d10.W(entry2.getKey().intValue(), entry2.getValue());
        }
        String str = this.f24883c;
        if (str != null) {
            d10.d0(str);
        }
        int i10 = this.f24882b;
        if (i10 != -1) {
            d10.Z(i10);
        }
        return d10;
    }

    public final void e(@dl.d NavDeepLink navDeepLink) {
        kotlin.jvm.internal.f0.p(navDeepLink, "navDeepLink");
        this.f24887g.add(navDeepLink);
    }

    public final void f(@dl.d String uriPattern) {
        kotlin.jvm.internal.f0.p(uriPattern, "uriPattern");
        this.f24887g.add(new NavDeepLink(uriPattern));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final <T> void g(@dl.d String basePath, @dl.d kotlin.reflect.d<T> route, @dl.d yh.l<? super y, b2> navDeepLink) {
        kotlin.jvm.internal.f0.p(basePath, "basePath");
        kotlin.jvm.internal.f0.p(route, "route");
        kotlin.jvm.internal.f0.p(navDeepLink, "navDeepLink");
        if (!(this.f24884d != null)) {
            throw new IllegalStateException(("Cannot add deeplink from KClass [" + route + "]. Use the NavDestinationBuilder constructor that takes a KClass with the same arguments.").toString());
        }
        kotlinx.serialization.g gVarG = kotlinx.serialization.t.g(route);
        Map<r, ? extends m0<?>> map = this.f24884d;
        Map<r, ? extends m0<?>> map2 = null;
        if (map == null) {
            kotlin.jvm.internal.f0.S("typeMap");
            map = null;
        }
        for (i iVar : RouteSerializerKt.i(gVarG, map)) {
            p pVar = this.f24886f.get(iVar.d());
            if (!(pVar != null && kotlin.jvm.internal.f0.g(pVar.b(), iVar.c().b()))) {
                throw new IllegalArgumentException(("Cannot add deeplink from KClass [" + route + "]. DeepLink contains unknown argument [" + iVar.d() + "]. Ensure deeplink arguments matches the destination's route from KClass").toString());
            }
        }
        Map<r, ? extends m0<?>> map3 = this.f24884d;
        if (map3 == null) {
            kotlin.jvm.internal.f0.S("typeMap");
        } else {
            map2 = map3;
        }
        e(NavDeepLinkDslBuilderKt.b(basePath, route, map2, navDeepLink));
    }

    public final /* synthetic */ <T> void h(String basePath, yh.l<? super y, b2> navDeepLink) {
        kotlin.jvm.internal.f0.p(basePath, "basePath");
        kotlin.jvm.internal.f0.p(navDeepLink, "navDeepLink");
        kotlin.jvm.internal.f0.y(4, androidx.exifinterface.media.a.f23244d5);
        g(basePath, kotlin.jvm.internal.n0.d(Object.class), navDeepLink);
    }

    public final void i(@dl.d yh.l<? super y, b2> navDeepLink) {
        kotlin.jvm.internal.f0.p(navDeepLink, "navDeepLink");
        List<NavDeepLink> list = this.f24887g;
        y yVar = new y();
        navDeepLink.invoke(yVar);
        list.add(yVar.a());
    }

    @xh.h(name = "deepLinkSafeArgs")
    public final /* synthetic */ <T> void j(String basePath) {
        kotlin.jvm.internal.f0.p(basePath, "basePath");
        kotlin.jvm.internal.f0.y(4, androidx.exifinterface.media.a.f23244d5);
        g(basePath, kotlin.jvm.internal.n0.d(Object.class), new yh.l<y, b2>() { // from class: androidx.navigation.NavDestinationBuilder$deepLink$1
            public final void a(y deepLink) {
                kotlin.jvm.internal.f0.p(deepLink, "$this$deepLink");
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(y yVar) {
                a(yVar);
                return b2.f124493a;
            }
        });
    }

    public final int k() {
        return this.f24882b;
    }

    @dl.e
    public final CharSequence l() {
        return this.f24885e;
    }

    @dl.d
    protected final Navigator<? extends D> m() {
        return this.f24881a;
    }

    @dl.e
    public final String n() {
        return this.f24883c;
    }

    @dl.d
    protected D o() {
        return (D) this.f24881a.a();
    }

    public final void p(@dl.e CharSequence charSequence) {
        this.f24885e = charSequence;
    }
}
