package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import java.util.Map;
import kotlin.reflect.r;

/* JADX INFO: compiled from: ActivityNavigatorDestinationBuilder.kt */
/* JADX INFO: loaded from: classes6.dex */
@b0
public final class c extends NavDestinationBuilder<ActivityNavigator.b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private Context f24959i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private String f24960j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private kotlin.reflect.d<? extends Activity> f24961k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private String f24962l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private Uri f24963m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.e
    private String f24964n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @kotlin.k(message = "Use routes to create your ActivityNavigatorDestinationBuilder instead", replaceWith = @kotlin.s0(expression = "ActivityNavigatorDestinationBuilder(navigator, route = id.toString())", imports = {}))
    public c(@dl.d ActivityNavigator navigator, @androidx.annotation.d0 int i10) {
        super(navigator, i10);
        kotlin.jvm.internal.f0.p(navigator, "navigator");
        this.f24959i = navigator.n();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@dl.d ActivityNavigator navigator, @dl.d String route) {
        super(navigator, route);
        kotlin.jvm.internal.f0.p(navigator, "navigator");
        kotlin.jvm.internal.f0.p(route, "route");
        this.f24959i = navigator.n();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@dl.d ActivityNavigator navigator, @dl.d kotlin.reflect.d<? extends Object> route, @dl.d Map<r, m0<?>> typeMap) {
        super(navigator, route, typeMap);
        kotlin.jvm.internal.f0.p(navigator, "navigator");
        kotlin.jvm.internal.f0.p(route, "route");
        kotlin.jvm.internal.f0.p(typeMap, "typeMap");
        this.f24959i = navigator.n();
    }

    public final void A(@dl.e String str) {
        this.f24960j = str;
    }

    @Override // androidx.navigation.NavDestinationBuilder
    @dl.d
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public ActivityNavigator.b d() {
        ActivityNavigator.b bVar = (ActivityNavigator.b) super.d();
        bVar.A0(this.f24960j);
        kotlin.reflect.d<? extends Activity> dVar = this.f24961k;
        if (dVar != null) {
            bVar.u0(new ComponentName(this.f24959i, (Class<?>) xh.a.e(dVar)));
        }
        bVar.t0(this.f24962l);
        bVar.v0(this.f24963m);
        bVar.w0(this.f24964n);
        return bVar;
    }

    @dl.e
    public final String r() {
        return this.f24962l;
    }

    @dl.e
    public final kotlin.reflect.d<? extends Activity> s() {
        return this.f24961k;
    }

    @dl.e
    public final Uri t() {
        return this.f24963m;
    }

    @dl.e
    public final String u() {
        return this.f24964n;
    }

    @dl.e
    public final String v() {
        return this.f24960j;
    }

    public final void w(@dl.e String str) {
        this.f24962l = str;
    }

    public final void x(@dl.e kotlin.reflect.d<? extends Activity> dVar) {
        this.f24961k = dVar;
    }

    public final void y(@dl.e Uri uri) {
        this.f24963m = uri;
    }

    public final void z(@dl.e String str) {
        this.f24964n = str;
    }
}
