package androidx.navigation;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.b2;

/* JADX INFO: compiled from: NavDestinationBuilder.kt */
/* JADX INFO: loaded from: classes6.dex */
@b0
@kotlin.jvm.internal.t0({"SMAP\nNavDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestinationBuilder.kt\nandroidx/navigation/NavActionBuilder\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,398:1\n37#2,2:399\n*S KotlinDebug\n*F\n+ 1 NavDestinationBuilder.kt\nandroidx/navigation/NavActionBuilder\n*L\n335#1:399,2\n*E\n"})
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f25181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Map<String, Object> f25182b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private j0 f25183c;

    @dl.d
    public final k a() {
        Bundle bundleB;
        int i10 = this.f25181a;
        j0 j0Var = this.f25183c;
        if (this.f25182b.isEmpty()) {
            bundleB = null;
        } else {
            Pair[] pairArr = (Pair[]) kotlin.collections.u0.J1(this.f25182b).toArray(new Pair[0]);
            bundleB = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
        return new k(i10, j0Var, bundleB);
    }

    @dl.d
    public final Map<String, Object> b() {
        return this.f25182b;
    }

    public final int c() {
        return this.f25181a;
    }

    public final void d(@dl.d yh.l<? super NavOptionsBuilder, b2> optionsBuilder) {
        kotlin.jvm.internal.f0.p(optionsBuilder, "optionsBuilder");
        NavOptionsBuilder navOptionsBuilder = new NavOptionsBuilder();
        optionsBuilder.invoke(navOptionsBuilder);
        this.f25183c = navOptionsBuilder.b();
    }

    public final void e(int i10) {
        this.f25181a = i10;
    }
}
