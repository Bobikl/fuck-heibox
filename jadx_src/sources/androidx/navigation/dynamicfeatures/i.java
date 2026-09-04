package androidx.navigation.dynamicfeatures;

import androidx.annotation.d0;
import androidx.navigation.m0;
import java.util.Map;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.r;
import kotlin.s0;

/* JADX INFO: compiled from: DynamicIncludeNavGraphBuilder.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nDynamicIncludeNavGraphBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DynamicIncludeNavGraphBuilder.kt\nandroidx/navigation/dynamicfeatures/DynamicIncludeNavGraphBuilderKt\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n*L\n1#1,257:1\n73#1,3:258\n76#1,6:262\n131#1,3:269\n134#1,6:273\n159#1,3:279\n163#1,6:283\n159#1,10:289\n157#2:261\n157#2:268\n157#2:272\n157#2:282\n157#2:299\n157#2:300\n*S KotlinDebug\n*F\n+ 1 DynamicIncludeNavGraphBuilder.kt\nandroidx/navigation/dynamicfeatures/DynamicIncludeNavGraphBuilderKt\n*L\n48#1:258,3\n48#1:262,6\n96#1:269,3\n96#1:273,6\n113#1:279,3\n113#1:283,6\n113#1:289,10\n48#1:261\n75#1:268\n96#1:272\n113#1:282\n133#1:299\n161#1:300\n*E\n"})
public final class i {
    @kotlin.k(message = "Use routes to include your DynamicNavGraph instead", replaceWith = @s0(expression = "includeDynamic(route = id.toString(), moduleName, graphResourceName)", imports = {}))
    public static final void a(@dl.d m mVar, @d0 int i10, @dl.d String moduleName, @dl.d String graphResourceName) {
        f0.p(mVar, "<this>");
        f0.p(moduleName, "moduleName");
        f0.p(graphResourceName, "graphResourceName");
        mVar.s(new h((g) mVar.t().e(g.class), i10, moduleName, graphResourceName));
    }

    @kotlin.k(message = "Use routes to include your DynamicNavGraph instead", replaceWith = @s0(expression = "includeDynamic(route = id.toString(), moduleName, graphResourceName) { builder.invoke() }", imports = {}))
    public static final void b(@dl.d m mVar, @d0 int i10, @dl.d String moduleName, @dl.d String graphResourceName, @dl.d yh.l<? super h, b2> builder) {
        f0.p(mVar, "<this>");
        f0.p(moduleName, "moduleName");
        f0.p(graphResourceName, "graphResourceName");
        f0.p(builder, "builder");
        h hVar = new h((g) mVar.t().e(g.class), i10, moduleName, graphResourceName);
        builder.invoke(hVar);
        mVar.s(hVar);
    }

    public static final void c(@dl.d m mVar, @dl.d String route, @dl.d String moduleName, @dl.d String graphResourceName) {
        f0.p(mVar, "<this>");
        f0.p(route, "route");
        f0.p(moduleName, "moduleName");
        f0.p(graphResourceName, "graphResourceName");
        mVar.s(new h((g) mVar.t().e(g.class), route, moduleName, graphResourceName));
    }

    public static final void d(@dl.d m mVar, @dl.d String route, @dl.d String moduleName, @dl.d String graphResourceName, @dl.d yh.l<? super h, b2> builder) {
        f0.p(mVar, "<this>");
        f0.p(route, "route");
        f0.p(moduleName, "moduleName");
        f0.p(graphResourceName, "graphResourceName");
        f0.p(builder, "builder");
        h hVar = new h((g) mVar.t().e(g.class), route, moduleName, graphResourceName);
        builder.invoke(hVar);
        mVar.s(hVar);
    }

    public static final /* synthetic */ <T> void e(m mVar, String moduleName, String graphResourceName, Map<r, m0<?>> typeMap) {
        f0.p(mVar, "<this>");
        f0.p(moduleName, "moduleName");
        f0.p(graphResourceName, "graphResourceName");
        f0.p(typeMap, "typeMap");
        g gVar = (g) mVar.t().e(g.class);
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        mVar.s(new h(gVar, n0.d(Object.class), typeMap, moduleName, graphResourceName));
    }

    public static final /* synthetic */ <T> void f(m mVar, String moduleName, String graphResourceName, Map<r, m0<?>> typeMap, yh.l<? super h, b2> builder) {
        f0.p(mVar, "<this>");
        f0.p(moduleName, "moduleName");
        f0.p(graphResourceName, "graphResourceName");
        f0.p(typeMap, "typeMap");
        f0.p(builder, "builder");
        g gVar = (g) mVar.t().e(g.class);
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        h hVar = new h(gVar, n0.d(Object.class), typeMap, moduleName, graphResourceName);
        builder.invoke(hVar);
        mVar.s(hVar);
    }

    public static /* synthetic */ void g(m mVar, String moduleName, String graphResourceName, Map map, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            map = kotlin.collections.s0.z();
        }
        Map typeMap = map;
        f0.p(mVar, "<this>");
        f0.p(moduleName, "moduleName");
        f0.p(graphResourceName, "graphResourceName");
        f0.p(typeMap, "typeMap");
        g gVar = (g) mVar.t().e(g.class);
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        mVar.s(new h(gVar, n0.d(Object.class), typeMap, moduleName, graphResourceName));
    }

    public static /* synthetic */ void h(m mVar, String moduleName, String graphResourceName, Map map, yh.l builder, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            map = kotlin.collections.s0.z();
        }
        Map typeMap = map;
        f0.p(mVar, "<this>");
        f0.p(moduleName, "moduleName");
        f0.p(graphResourceName, "graphResourceName");
        f0.p(typeMap, "typeMap");
        f0.p(builder, "builder");
        g gVar = (g) mVar.t().e(g.class);
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        h hVar = new h(gVar, n0.d(Object.class), typeMap, moduleName, graphResourceName);
        builder.invoke(hVar);
        mVar.s(hVar);
    }
}
