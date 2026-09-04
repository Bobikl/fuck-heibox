package androidx.navigation;

import androidx.annotation.RestrictTo;
import java.util.Map;
import kotlin.b2;
import kotlin.reflect.r;

/* JADX INFO: compiled from: NavDeepLinkDslBuilder.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class NavDeepLinkDslBuilderKt {
    public static final /* synthetic */ <T> NavDeepLink a(String basePath, Map<r, m0<?>> typeMap, yh.l<? super y, b2> deepLinkBuilder) {
        kotlin.jvm.internal.f0.p(basePath, "basePath");
        kotlin.jvm.internal.f0.p(typeMap, "typeMap");
        kotlin.jvm.internal.f0.p(deepLinkBuilder, "deepLinkBuilder");
        kotlin.jvm.internal.f0.y(4, androidx.exifinterface.media.a.f23244d5);
        return b(basePath, kotlin.jvm.internal.n0.d(Object.class), typeMap, deepLinkBuilder);
    }

    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T> NavDeepLink b(@dl.d String basePath, @dl.d kotlin.reflect.d<T> route, @dl.d Map<r, m0<?>> typeMap, @dl.d yh.l<? super y, b2> deepLinkBuilder) {
        kotlin.jvm.internal.f0.p(basePath, "basePath");
        kotlin.jvm.internal.f0.p(route, "route");
        kotlin.jvm.internal.f0.p(typeMap, "typeMap");
        kotlin.jvm.internal.f0.p(deepLinkBuilder, "deepLinkBuilder");
        y yVar = new y(basePath, route, typeMap);
        deepLinkBuilder.invoke(yVar);
        return yVar.a();
    }

    @dl.d
    public static final NavDeepLink c(@dl.d yh.l<? super y, b2> deepLinkBuilder) {
        kotlin.jvm.internal.f0.p(deepLinkBuilder, "deepLinkBuilder");
        y yVar = new y();
        deepLinkBuilder.invoke(yVar);
        return yVar.a();
    }

    public static /* synthetic */ NavDeepLink d(String basePath, Map typeMap, yh.l deepLinkBuilder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            typeMap = kotlin.collections.s0.z();
        }
        if ((i10 & 4) != 0) {
            deepLinkBuilder = new yh.l<y, b2>() { // from class: androidx.navigation.NavDeepLinkDslBuilderKt$navDeepLink$1
                public final void a(y yVar) {
                    kotlin.jvm.internal.f0.p(yVar, "$this$null");
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(y yVar) {
                    a(yVar);
                    return b2.f124493a;
                }
            };
        }
        kotlin.jvm.internal.f0.p(basePath, "basePath");
        kotlin.jvm.internal.f0.p(typeMap, "typeMap");
        kotlin.jvm.internal.f0.p(deepLinkBuilder, "deepLinkBuilder");
        kotlin.jvm.internal.f0.y(4, androidx.exifinterface.media.a.f23244d5);
        return b(basePath, kotlin.jvm.internal.n0.d(Object.class), typeMap, deepLinkBuilder);
    }
}
