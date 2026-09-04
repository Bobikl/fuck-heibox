package androidx.navigation;

import java.util.Map;
import kotlin.b2;
import kotlin.reflect.r;

/* JADX INFO: compiled from: ActivityNavigatorDestinationBuilder.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nActivityNavigatorDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigatorDestinationBuilder.kt\nandroidx/navigation/ActivityNavigatorDestinationBuilderKt\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n*L\n1#1,126:1\n157#2:127\n157#2:128\n157#2:129\n*S KotlinDebug\n*F\n+ 1 ActivityNavigatorDestinationBuilder.kt\nandroidx/navigation/ActivityNavigatorDestinationBuilderKt\n*L\n40#1:127\n49#1:128\n66#1:129\n*E\n"})
public final class d {
    @kotlin.k(message = "Use routes to build your ActivityDestination instead", replaceWith = @kotlin.s0(expression = "activity(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void a(@dl.d NavGraphBuilder navGraphBuilder, @androidx.annotation.d0 int i10, @dl.d yh.l<? super c, b2> builder) {
        kotlin.jvm.internal.f0.p(navGraphBuilder, "<this>");
        kotlin.jvm.internal.f0.p(builder, "builder");
        c cVar = new c((ActivityNavigator) navGraphBuilder.t().e(ActivityNavigator.class), i10);
        builder.invoke(cVar);
        navGraphBuilder.s(cVar);
    }

    public static final void b(@dl.d NavGraphBuilder navGraphBuilder, @dl.d String route, @dl.d yh.l<? super c, b2> builder) {
        kotlin.jvm.internal.f0.p(navGraphBuilder, "<this>");
        kotlin.jvm.internal.f0.p(route, "route");
        kotlin.jvm.internal.f0.p(builder, "builder");
        c cVar = new c((ActivityNavigator) navGraphBuilder.t().e(ActivityNavigator.class), route);
        builder.invoke(cVar);
        navGraphBuilder.s(cVar);
    }

    public static final /* synthetic */ <T> void c(NavGraphBuilder navGraphBuilder, Map<r, m0<?>> typeMap, yh.l<? super c, b2> builder) {
        kotlin.jvm.internal.f0.p(navGraphBuilder, "<this>");
        kotlin.jvm.internal.f0.p(typeMap, "typeMap");
        kotlin.jvm.internal.f0.p(builder, "builder");
        ActivityNavigator activityNavigator = (ActivityNavigator) navGraphBuilder.t().e(ActivityNavigator.class);
        kotlin.jvm.internal.f0.y(4, androidx.exifinterface.media.a.f23244d5);
        c cVar = new c(activityNavigator, kotlin.jvm.internal.n0.d(Object.class), typeMap);
        builder.invoke(cVar);
        navGraphBuilder.s(cVar);
    }

    public static /* synthetic */ void d(NavGraphBuilder navGraphBuilder, Map typeMap, yh.l builder, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            typeMap = kotlin.collections.s0.z();
        }
        kotlin.jvm.internal.f0.p(navGraphBuilder, "<this>");
        kotlin.jvm.internal.f0.p(typeMap, "typeMap");
        kotlin.jvm.internal.f0.p(builder, "builder");
        ActivityNavigator activityNavigator = (ActivityNavigator) navGraphBuilder.t().e(ActivityNavigator.class);
        kotlin.jvm.internal.f0.y(4, androidx.exifinterface.media.a.f23244d5);
        c cVar = new c(activityNavigator, kotlin.jvm.internal.n0.d(Object.class), typeMap);
        builder.invoke(cVar);
        navGraphBuilder.s(cVar);
    }
}
