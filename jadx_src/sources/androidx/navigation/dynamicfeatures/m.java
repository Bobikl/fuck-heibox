package androidx.navigation.dynamicfeatures;

import androidx.annotation.d0;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.b0;
import androidx.navigation.m0;
import androidx.navigation.q0;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.reflect.r;
import kotlin.s0;

/* JADX INFO: compiled from: DynamicNavGraphBuilder.kt */
/* JADX INFO: loaded from: classes6.dex */
@b0
@t0({"SMAP\nDynamicNavGraphBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DynamicNavGraphBuilder.kt\nandroidx/navigation/dynamicfeatures/DynamicNavGraphBuilder\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n*L\n1#1,300:1\n157#2:301\n*S KotlinDebug\n*F\n+ 1 DynamicNavGraphBuilder.kt\nandroidx/navigation/dynamicfeatures/DynamicNavGraphBuilder\n*L\n294#1:301\n*E\n"})
public final class m extends NavGraphBuilder {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @d0
    private int f25066o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.e
    private String f25067p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.e
    private String f25068q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f25069r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.e
    private String f25070s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @kotlin.k(message = "Use routes to create your DynamicNavGraphBuilder instead", replaceWith = @s0(expression = "DynamicNavGraphBuilder(provider, startDestination = startDestination.toString(), route = id.toString())", imports = {}))
    public m(@dl.d q0 provider, @d0 int i10, @d0 int i11) {
        super(provider, i10, i11);
        f0.p(provider, "provider");
        this.f25066o = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@dl.d q0 provider, @dl.d Object startDestination, @dl.e kotlin.reflect.d<?> dVar, @dl.d Map<r, m0<?>> typeMap) {
        super(provider, startDestination, dVar, typeMap);
        f0.p(provider, "provider");
        f0.p(startDestination, "startDestination");
        f0.p(typeMap, "typeMap");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@dl.d q0 provider, @dl.d String startDestination, @dl.e String str) {
        super(provider, startDestination, str);
        f0.p(provider, "provider");
        f0.p(startDestination, "startDestination");
        this.f25067p = startDestination;
    }

    public /* synthetic */ m(q0 q0Var, String str, String str2, int i10, u uVar) {
        this(q0Var, str, (i10 & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@dl.d q0 provider, @dl.d kotlin.reflect.d<?> startDestination, @dl.e kotlin.reflect.d<?> dVar, @dl.d Map<r, m0<?>> typeMap) {
        super(provider, startDestination, dVar, typeMap);
        f0.p(provider, "provider");
        f0.p(startDestination, "startDestination");
        f0.p(typeMap, "typeMap");
    }

    public final void A(@dl.e String str) {
        int iHashCode;
        if (str == null) {
            iHashCode = 0;
        } else {
            if (!(!kotlin.text.u.V1(str))) {
                throw new IllegalArgumentException("Cannot have an empty progress destination route".toString());
            }
            iHashCode = NavDestination.f24858l.a(this.f25070s).hashCode();
        }
        this.f25069r = iHashCode;
        this.f25070s = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.navigation.NavGraphBuilder, androidx.navigation.NavDestinationBuilder
    @dl.d
    /* JADX INFO: renamed from: r */
    public NavGraph d() {
        NavGraph navGraphD = super.d();
        if (navGraphD instanceof f.a) {
            ((f.a) navGraphD).X0(this.f25068q);
            if (navGraphD.F() != null) {
                ((f.a) navGraphD).Z0(NavDestination.f24858l.a(this.f25070s).hashCode());
            } else {
                ((f.a) navGraphD).Z0(w());
            }
            if (w() == 0) {
                ((f) t().e(f.class)).q().add(navGraphD);
            }
        }
        return navGraphD;
    }

    @dl.e
    public final String v() {
        return this.f25068q;
    }

    public final int w() {
        return this.f25069r;
    }

    @dl.e
    public final String x() {
        return this.f25070s;
    }

    public final void y(@dl.e String str) {
        this.f25068q = str;
    }

    public final void z(int i10) {
        if (this.f25070s != null) {
            A(null);
        }
        this.f25069r = i10;
    }
}
