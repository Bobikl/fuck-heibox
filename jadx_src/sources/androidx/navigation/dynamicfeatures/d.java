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

/* JADX INFO: compiled from: DynamicActivityNavigatorDestinationBuilder.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nDynamicActivityNavigatorDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DynamicActivityNavigatorDestinationBuilder.kt\nandroidx/navigation/dynamicfeatures/DynamicActivityNavigatorDestinationBuilderKt\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n*L\n1#1,163:1\n157#2:164\n157#2:165\n157#2:166\n*S KotlinDebug\n*F\n+ 1 DynamicActivityNavigatorDestinationBuilder.kt\nandroidx/navigation/dynamicfeatures/DynamicActivityNavigatorDestinationBuilderKt\n*L\n47#1:164\n62#1:165\n80#1:166\n*E\n"})
public final class d {
    @kotlin.k(message = "Use routes to build your DynamicActivityDestination instead", replaceWith = @s0(expression = "activity(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void a(@dl.d m mVar, @d0 int i10, @dl.d yh.l<? super c, b2> builder) {
        f0.p(mVar, "<this>");
        f0.p(builder, "builder");
        c cVar = new c((b) mVar.t().e(b.class), i10);
        builder.invoke(cVar);
        mVar.s(cVar);
    }

    public static final void b(@dl.d m mVar, @dl.d String route, @dl.d yh.l<? super c, b2> builder) {
        f0.p(mVar, "<this>");
        f0.p(route, "route");
        f0.p(builder, "builder");
        c cVar = new c((b) mVar.t().e(b.class), route);
        builder.invoke(cVar);
        mVar.s(cVar);
    }

    public static final /* synthetic */ <T> void c(m mVar, Map<r, m0<?>> typeMap, yh.l<? super c, b2> builder) {
        f0.p(mVar, "<this>");
        f0.p(typeMap, "typeMap");
        f0.p(builder, "builder");
        b bVar = (b) mVar.t().e(b.class);
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        c cVar = new c(bVar, n0.d(Object.class), typeMap);
        builder.invoke(cVar);
        mVar.s(cVar);
    }

    public static /* synthetic */ void d(m mVar, Map typeMap, yh.l builder, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            typeMap = kotlin.collections.s0.z();
        }
        f0.p(mVar, "<this>");
        f0.p(typeMap, "typeMap");
        f0.p(builder, "builder");
        b bVar = (b) mVar.t().e(b.class);
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        c cVar = new c(bVar, n0.d(Object.class), typeMap);
        builder.invoke(cVar);
        mVar.s(cVar);
    }
}
