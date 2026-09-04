package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: CallAdapter.java */
/* JADX INFO: loaded from: classes5.dex */
public interface c<R, T> {

    /* JADX INFO: compiled from: CallAdapter.java */
    public static abstract class a {
        protected static Type b(int i10, ParameterizedType parameterizedType) {
            return x.g(i10, parameterizedType);
        }

        protected static Class<?> c(Type type) {
            return x.h(type);
        }

        @Nullable
        public abstract c<?, ?> a(Type type, Annotation[] annotationArr, t tVar);
    }

    Type a();

    T b(b<R> bVar);
}
