package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.b0;
import okhttp3.v;
import okio.Buffer;
import retrofit2.f;

/* JADX INFO: compiled from: GsonRequestBodyConverter.java */
/* JADX INFO: loaded from: classes5.dex */
public final class b<T> implements f<T, b0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v f138942c = v.h("application/json; charset=UTF-8");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Charset f138943d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gson f138944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypeAdapter<T> f138945b;

    b(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f138944a = gson;
        this.f138945b = typeAdapter;
    }

    @Override // retrofit2.f
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public b0 convert(T t10) throws IOException {
        Buffer buffer = new Buffer();
        JsonWriter jsonWriterNewJsonWriter = this.f138944a.newJsonWriter(new OutputStreamWriter(buffer.outputStream(), f138943d));
        this.f138945b.write(jsonWriterNewJsonWriter, t10);
        jsonWriterNewJsonWriter.close();
        return b0.create(f138942c, buffer.readByteString());
    }
}
