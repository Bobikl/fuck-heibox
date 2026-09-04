package nb;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.b0;
import okhttp3.d0;
import retrofit2.f;
import retrofit2.t;

/* JADX INFO: compiled from: CustomGsonConverterFactory.java */
/* JADX INFO: loaded from: classes9.dex */
public class a extends f.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gson f132029a;

    private a(Gson gson) {
        if (gson == null) {
            throw new NullPointerException("gson == null");
        }
        this.f132029a = gson;
    }

    public static a a(Gson gson) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gson}, null, changeQuickRedirect, true, bb.c.e.Zc, new Class[]{Gson.class}, a.class);
        return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : new a(gson);
    }

    @Override // retrofit2.f.a
    public f<?, b0> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, t tVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{type, annotationArr, annotationArr2, tVar}, this, changeQuickRedirect, false, bb.c.e.f31723bd, new Class[]{Type.class, Annotation[].class, Annotation[].class, t.class}, f.class);
        return patchProxyResultProxy.isSupported ? (f) patchProxyResultProxy.result : new b(this.f132029a, this.f132029a.getAdapter(TypeToken.get(type)));
    }

    @Override // retrofit2.f.a
    public f<d0, ?> responseBodyConverter(Type type, Annotation[] annotationArr, t tVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{type, annotationArr, tVar}, this, changeQuickRedirect, false, bb.c.e.f31706ad, new Class[]{Type.class, Annotation[].class, t.class}, f.class);
        return patchProxyResultProxy.isSupported ? (f) patchProxyResultProxy.result : new c(this.f132029a, this.f132029a.getAdapter(TypeToken.get(type)));
    }
}
