package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import okhttp3.d0;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: compiled from: OptionalConverterFactory.java */
/* JADX INFO: loaded from: classes5.dex */
@IgnoreJRERequirement
public final class m extends f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final f.a f138995a = new m();

    /* JADX INFO: compiled from: OptionalConverterFactory.java */
    @IgnoreJRERequirement
    public static final class a<T> implements f<d0, Optional<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final f<d0, T> f138996a;

        a(f<d0, T> fVar) {
            this.f138996a = fVar;
        }

        @Override // retrofit2.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Optional<T> convert(d0 d0Var) throws IOException {
            return Optional.ofNullable(this.f138996a.convert(d0Var));
        }
    }

    m() {
    }

    @Override // retrofit2.f.a
    @Nullable
    public f<d0, ?> responseBodyConverter(Type type, Annotation[] annotationArr, t tVar) {
        if (f.a.getRawType(type) != Optional.class) {
            return null;
        }
        return new a(tVar.n(f.a.getParameterUpperBound(0, (ParameterizedType) type), annotationArr));
    }
}
