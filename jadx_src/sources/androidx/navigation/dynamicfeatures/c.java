package androidx.navigation.dynamicfeatures;

import android.content.ComponentName;
import android.net.Uri;
import androidx.annotation.d0;
import androidx.navigation.ActivityNavigator;
import androidx.navigation.NavDestination;
import androidx.navigation.NavDestinationBuilder;
import androidx.navigation.b0;
import androidx.navigation.m0;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.reflect.r;
import kotlin.s0;

/* JADX INFO: compiled from: DynamicActivityNavigatorDestinationBuilder.kt */
/* JADX INFO: loaded from: classes6.dex */
@b0
public final class c extends NavDestinationBuilder<ActivityNavigator.b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private b f24990i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private String f24991j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private String f24992k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private String f24993l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private String f24994m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.e
    private Uri f24995n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.e
    private String f24996o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @kotlin.k(message = "Use routes to build your DynamicActivityDestination instead", replaceWith = @s0(expression = "DynamicActivityNavigatorDestinationBuilder(activityNavigator, route = id.toString())", imports = {}))
    public c(@dl.d b activityNavigator, @d0 int i10) {
        super(activityNavigator, i10);
        f0.p(activityNavigator, "activityNavigator");
        this.f24990i = activityNavigator;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@dl.d b activityNavigator, @dl.d String route) {
        super(activityNavigator, route);
        f0.p(activityNavigator, "activityNavigator");
        f0.p(route, "route");
        this.f24990i = activityNavigator;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@dl.d b activityNavigator, @dl.d kotlin.reflect.d<?> route, @dl.d Map<r, m0<?>> typeMap) {
        super(activityNavigator, route, typeMap);
        f0.p(activityNavigator, "activityNavigator");
        f0.p(route, "route");
        f0.p(typeMap, "typeMap");
        this.f24990i = activityNavigator;
    }

    public final void A(@dl.e String str) {
        this.f24996o = str;
    }

    public final void B(@dl.e String str) {
        this.f24991j = str;
    }

    public final void C(@dl.e String str) {
        this.f24992k = str;
    }

    @Override // androidx.navigation.NavDestinationBuilder
    @dl.d
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public b.a d() {
        NavDestination navDestinationD = super.d();
        f0.n(navDestinationD, "null cannot be cast to non-null type androidx.navigation.dynamicfeatures.DynamicActivityNavigator.Destination");
        b.a aVar = (b.a) navDestinationD;
        String str = this.f24993l;
        if (str != null) {
            String strQ = this.f24992k;
            if (strQ != null) {
                f0.m(strQ);
            } else {
                strQ = this.f24990i.q();
            }
            aVar.u0(new ComponentName(strQ, str));
        }
        aVar.A0(this.f24992k);
        aVar.D0(this.f24991j);
        aVar.t0(this.f24994m);
        aVar.v0(this.f24995n);
        aVar.w0(this.f24996o);
        return aVar;
    }

    @dl.e
    public final String r() {
        return this.f24994m;
    }

    @dl.e
    public final String s() {
        return this.f24993l;
    }

    @dl.e
    public final Uri t() {
        return this.f24995n;
    }

    @dl.e
    public final String u() {
        return this.f24996o;
    }

    @dl.e
    public final String v() {
        return this.f24991j;
    }

    @dl.e
    public final String w() {
        return this.f24992k;
    }

    public final void x(@dl.e String str) {
        this.f24994m = str;
    }

    public final void y(@dl.e String str) {
        this.f24993l = str;
    }

    public final void z(@dl.e Uri uri) {
        this.f24995n = uri;
    }
}
