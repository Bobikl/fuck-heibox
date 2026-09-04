package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import okhttp3.b0;
import okhttp3.d0;

/* JADX INFO: compiled from: Converter.java */
/* JADX INFO: loaded from: classes5.dex */
public interface f<F, T> {

    /* JADX INFO: compiled from: Converter.java */
    public static abstract class a {
        protected static Type getParameterUpperBound(int i10, ParameterizedType parameterizedType) {
            return x.g(i10, parameterizedType);
        }

        protected static Class<?> getRawType(Type type) {
            return x.h(type);
        }

        @Nullable
        public f<?, b0> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, t tVar) {
            return null;
        }

        @Nullable
        public f<d0, ?> responseBodyConverter(Type type, Annotation[] annotationArr, t tVar) {
            return null;
        }

        @Nullable
        public f<?, String> stringConverter(Type type, Annotation[] annotationArr, t tVar) {
            return null;
        }
    }

    @Nullable
    T convert(F f10) throws IOException;
}
