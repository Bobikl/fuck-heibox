package nb;

import android.app.Activity;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.max.hbcommon.network.ApiException;
import com.max.hbcommon.network.interceptor.ErrorHandleInterceptor;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.e;
import com.max.hbutils.utils.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import okhttp3.d0;
import okhttp3.v;
import retrofit2.f;

/* JADX INFO: compiled from: CustomGsonResponseBodyConverter.java */
/* JADX INFO: loaded from: classes9.dex */
public class c<T> implements f<d0, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Charset f132034c = Charset.forName("UTF-8");
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gson f132035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypeAdapter<T> f132036b;

    public c(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f132035a = gson;
        this.f132036b = typeAdapter;
    }

    public T a(d0 d0Var) throws IOException {
        String strE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{d0Var}, this, changeQuickRedirect, false, bb.c.e.f31774ed, new Class[]{d0.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return (T) patchProxyResultProxy.result;
        }
        String strString = d0Var.string();
        Result result = (Result) this.f132035a.fromJson(strString, (Class) Result.class);
        if (com.max.hbcommon.utils.c.u(result.getProtocol())) {
            strE = result.getResult() != null ? k.e(k.p(result.getResult()), ErrorHandleInterceptor.f68099i) : null;
        } else {
            strE = result.getProtocol();
        }
        String str = strE;
        if (result.isOk()) {
            Activity activityA = e.b().a();
            if (activityA != null && !com.max.hbcommon.utils.c.u(str)) {
                ob.a.p().c(activityA, str);
            }
        } else if (!result.isOk() && !ErrorHandleInterceptor.w(result.getStatus())) {
            d0Var.close();
            throw new ApiException(result.getStatus(), result.getMsg(), result.getReferer_path(), str, result);
        }
        v f132480d = d0Var.getF132480d();
        try {
            return this.f132036b.read2(this.f132035a.newJsonReader(new InputStreamReader(new ByteArrayInputStream(strString.getBytes()), f132480d != null ? f132480d.f(f132034c) : f132034c)));
        } finally {
            d0Var.close();
        }
    }

    @Override // retrofit2.f
    public /* bridge */ /* synthetic */ Object convert(d0 d0Var) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{d0Var}, this, changeQuickRedirect, false, bb.c.e.f31791fd, new Class[]{Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(d0Var);
    }
}
