package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: SavedStateViewModelFactory.kt */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final List<Class<?>> f24259a = CollectionsKt__CollectionsKt.L(Application.class, q0.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final List<Class<?>> f24260b = kotlin.collections.s.k(q0.class);

    @dl.e
    public static final <T> Constructor<T> c(@dl.d Class<T> modelClass, @dl.d List<? extends Class<?>> signature) {
        kotlin.jvm.internal.f0.p(modelClass, "modelClass");
        kotlin.jvm.internal.f0.p(signature, "signature");
        Object[] constructors = modelClass.getConstructors();
        kotlin.jvm.internal.f0.o(constructors, "modelClass.constructors");
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.f0.o(parameterTypes, "constructor.parameterTypes");
            List listKz = ArraysKt___ArraysKt.kz(parameterTypes);
            if (kotlin.jvm.internal.f0.g(signature, listKz)) {
                kotlin.jvm.internal.f0.n(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (signature.size() == listKz.size() && listKz.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final <T extends w0> T d(@dl.d Class<T> modelClass, @dl.d Constructor<T> constructor, @dl.d Object... params) {
        kotlin.jvm.internal.f0.p(modelClass, "modelClass");
        kotlin.jvm.internal.f0.p(constructor, "constructor");
        kotlin.jvm.internal.f0.p(params, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + modelClass, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e12.getCause());
        }
    }
}
