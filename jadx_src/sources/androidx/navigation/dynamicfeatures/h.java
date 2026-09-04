package androidx.navigation.dynamicfeatures;

import androidx.annotation.d0;
import androidx.navigation.NavDestinationBuilder;
import androidx.navigation.b0;
import androidx.navigation.m0;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.r;
import kotlin.s0;

/* JADX INFO: compiled from: DynamicIncludeNavGraphBuilder.kt */
/* JADX INFO: loaded from: classes6.dex */
@b0
@t0({"SMAP\nDynamicIncludeNavGraphBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DynamicIncludeNavGraphBuilder.kt\nandroidx/navigation/dynamicfeatures/DynamicIncludeNavGraphBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,257:1\n1#2:258\n*E\n"})
public final class h extends NavDestinationBuilder<g.a> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private g f25052i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private String f25053j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private String f25054k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private String f25055l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @kotlin.k(message = "Use routes to create your DynamicIncludeNavGraphBuilder instead", replaceWith = @s0(expression = "DynamicIncludeNavGraphBuilder(dynamicIncludeGraphNavigator, route = id.toString(), moduleName, graphResourceName)", imports = {}))
    public h(@dl.d g dynamicIncludeGraphNavigator, @d0 int i10, @dl.d String moduleName, @dl.d String graphResourceName) {
        super(dynamicIncludeGraphNavigator, i10);
        f0.p(dynamicIncludeGraphNavigator, "dynamicIncludeGraphNavigator");
        f0.p(moduleName, "moduleName");
        f0.p(graphResourceName, "graphResourceName");
        this.f25052i = dynamicIncludeGraphNavigator;
        this.f25053j = moduleName;
        this.f25054k = graphResourceName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@dl.d g dynamicIncludeGraphNavigator, @dl.d String route, @dl.d String moduleName, @dl.d String graphResourceName) {
        super(dynamicIncludeGraphNavigator, route);
        f0.p(dynamicIncludeGraphNavigator, "dynamicIncludeGraphNavigator");
        f0.p(route, "route");
        f0.p(moduleName, "moduleName");
        f0.p(graphResourceName, "graphResourceName");
        this.f25052i = dynamicIncludeGraphNavigator;
        this.f25053j = moduleName;
        this.f25054k = graphResourceName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@dl.d g dynamicIncludeGraphNavigator, @dl.d kotlin.reflect.d<?> route, @dl.d Map<r, m0<?>> typeMap, @dl.d String moduleName, @dl.d String graphResourceName) {
        super(dynamicIncludeGraphNavigator, route, typeMap);
        f0.p(dynamicIncludeGraphNavigator, "dynamicIncludeGraphNavigator");
        f0.p(route, "route");
        f0.p(typeMap, "typeMap");
        f0.p(moduleName, "moduleName");
        f0.p(graphResourceName, "graphResourceName");
        this.f25052i = dynamicIncludeGraphNavigator;
        this.f25053j = moduleName;
        this.f25054k = graphResourceName;
    }

    @Override // androidx.navigation.NavDestinationBuilder
    @dl.d
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public g.a d() {
        g.a aVar = (g.a) super.d();
        if (!(this.f25053j.length() > 0)) {
            throw new IllegalStateException("Module name cannot be empty".toString());
        }
        aVar.s0(this.f25053j);
        String str = this.f25055l;
        if (str == null) {
            aVar.q0(this.f25052i.m() + lg.a.f131414g + this.f25053j);
        } else {
            if (!(!(str == null || str.length() == 0))) {
                throw new IllegalStateException("Graph package name cannot be empty".toString());
            }
            aVar.q0(this.f25055l);
        }
        if (!(this.f25054k.length() > 0)) {
            throw new IllegalStateException("Graph resource name cannot be empty".toString());
        }
        aVar.r0(this.f25054k);
        return aVar;
    }

    @dl.e
    public final String r() {
        return this.f25055l;
    }

    public final void s(@dl.e String str) {
        this.f25055l = str;
    }
}
