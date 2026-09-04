package nb;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.b0;
import okhttp3.v;
import okio.Buffer;
import retrofit2.f;

/* JADX INFO: compiled from: CustomGsonRequestBodyConverter.java */
/* JADX INFO: loaded from: classes9.dex */
public class b<T> implements f<T, b0> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gson f132032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypeAdapter<T> f132033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v f132030c = v.j("application/json; charset=UTF-8");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Charset f132031d = Charset.forName("UTF-8");

    public b(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f132032a = gson;
        this.f132033b = typeAdapter;
    }

    public b0 a(T t10) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, bb.c.e.f31740cd, new Class[]{Object.class}, b0.class);
        if (patchProxyResultProxy.isSupported) {
            return (b0) patchProxyResultProxy.result;
        }
        Buffer buffer = new Buffer();
        JsonWriter jsonWriterNewJsonWriter = this.f132032a.newJsonWriter(new OutputStreamWriter(buffer.outputStream(), f132031d));
        this.f132033b.write(jsonWriterNewJsonWriter, t10);
        jsonWriterNewJsonWriter.close();
        return b0.create(f132030c, buffer.readByteString());
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, okhttp3.b0] */
    @Override // retrofit2.f
    public /* bridge */ /* synthetic */ b0 convert(Object obj) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.e.f31757dd, new Class[]{Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(obj);
    }
}
