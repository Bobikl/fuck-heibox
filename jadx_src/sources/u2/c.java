package u2;

import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import yh.l;

/* JADX INFO: compiled from: InitializerViewModelFactory.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nInitializerViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,115:1\n37#2,2:116\n*S KotlinDebug\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder\n*L\n54#1:116,2\n*E\n"})
@f
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final List<g<?>> f140745a = new ArrayList();

    public final <T extends w0> void a(@dl.d kotlin.reflect.d<T> clazz, @dl.d l<? super a, ? extends T> initializer) {
        f0.p(clazz, "clazz");
        f0.p(initializer, "initializer");
        this.f140745a.add(new g<>(xh.a.e(clazz), initializer));
    }

    @dl.d
    public final y0.b b() {
        g[] gVarArr = (g[]) this.f140745a.toArray(new g[0]);
        return new b((g[]) Arrays.copyOf(gVarArr, gVarArr.length));
    }
}
