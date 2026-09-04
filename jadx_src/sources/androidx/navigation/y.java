package androidx.navigation;

import androidx.navigation.serialization.RouteSerializerKt;
import java.util.Map;
import kotlin.reflect.r;

/* JADX INFO: compiled from: NavDeepLinkDslBuilder.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nNavDeepLinkDslBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLinkDslBuilder.kt\nandroidx/navigation/NavDeepLinkDslBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n1#2:142\n*E\n"})
@x
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final NavDeepLink.a f25331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private kotlin.reflect.d<?> f25332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private Map<r, ? extends m0<?>> f25333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private String f25334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private String f25335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private String f25336f;

    public y() {
        this.f25331a = new NavDeepLink.a();
        this.f25333c = kotlin.collections.s0.z();
    }

    public y(@dl.d String basePath, @dl.d kotlin.reflect.d<?> route, @dl.d Map<r, m0<?>> typeMap) {
        kotlin.jvm.internal.f0.p(basePath, "basePath");
        kotlin.jvm.internal.f0.p(route, "route");
        kotlin.jvm.internal.f0.p(typeMap, "typeMap");
        this.f25331a = new NavDeepLink.a();
        this.f25333c = kotlin.collections.s0.z();
        if (!(basePath.length() > 0)) {
            throw new IllegalArgumentException("The basePath for NavDeepLink from KClass cannot be empty".toString());
        }
        this.f25334d = RouteSerializerKt.k(kotlinx.serialization.t.g(route), typeMap, basePath);
        this.f25332b = route;
        this.f25333c = typeMap;
    }

    @dl.d
    public final NavDeepLink a() {
        NavDeepLink.a aVar = this.f25331a;
        String str = this.f25334d;
        if (!((str == null && this.f25335e == null && this.f25336f == null) ? false : true)) {
            throw new IllegalStateException("The NavDeepLink must have an uri, action, and/or mimeType.".toString());
        }
        if (str != null) {
            aVar.g(str);
        }
        String str2 = this.f25335e;
        if (str2 != null) {
            aVar.e(str2);
        }
        String str3 = this.f25336f;
        if (str3 != null) {
            aVar.f(str3);
        }
        return aVar.a();
    }

    @dl.e
    public final String b() {
        return this.f25335e;
    }

    @dl.e
    public final String c() {
        return this.f25336f;
    }

    @dl.e
    public final String d() {
        return this.f25334d;
    }

    public final void e(@dl.e String str) {
        if (str != null) {
            if (str.length() == 0) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
            }
        }
        this.f25335e = str;
    }

    public final void f(@dl.e String str) {
        this.f25336f = str;
    }

    public final void g(@dl.e String str) {
        this.f25334d = str;
    }
}
