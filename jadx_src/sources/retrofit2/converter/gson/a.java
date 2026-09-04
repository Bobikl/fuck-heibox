package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.b0;
import okhttp3.d0;
import retrofit2.f;
import retrofit2.t;

/* JADX INFO: compiled from: GsonConverterFactory.java */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gson f138941a;

    private a(Gson gson) {
        this.f138941a = gson;
    }

    public static a a() {
        return b(new Gson());
    }

    public static a b(Gson gson) {
        if (gson != null) {
            return new a(gson);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // retrofit2.f.a
    public f<?, b0> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, t tVar) {
        return new b(this.f138941a, this.f138941a.getAdapter(TypeToken.get(type)));
    }

    @Override // retrofit2.f.a
    public f<d0, ?> responseBodyConverter(Type type, Annotation[] annotationArr, t tVar) {
        return new c(this.f138941a, this.f138941a.getAdapter(TypeToken.get(type)));
    }
}
