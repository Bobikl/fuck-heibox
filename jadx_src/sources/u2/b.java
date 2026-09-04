package u2;

import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: InitializerViewModelFactory.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nInitializerViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactory\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,115:1\n13579#2,2:116\n*S KotlinDebug\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactory\n*L\n105#1:116,2\n*E\n"})
public final class b implements y0.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final g<?>[] f140744b;

    public b(@dl.d g<?>... initializers) {
        f0.p(initializers, "initializers");
        this.f140744b = initializers;
    }

    @Override // androidx.lifecycle.y0.b
    public /* synthetic */ w0 a(Class cls) {
        return z0.a(this, cls);
    }

    @Override // androidx.lifecycle.y0.b
    @dl.d
    public <T extends w0> T b(@dl.d Class<T> modelClass, @dl.d a extras) {
        f0.p(modelClass, "modelClass");
        f0.p(extras, "extras");
        T t10 = null;
        for (g<?> gVar : this.f140744b) {
            if (f0.g(gVar.a(), modelClass)) {
                T tInvoke = gVar.b().invoke(extras);
                t10 = tInvoke instanceof w0 ? tInvoke : null;
            }
        }
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("No initializer set for given class " + modelClass.getName());
    }
}
