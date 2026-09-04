package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import okhttp3.d0;
import retrofit2.f;

/* JADX INFO: compiled from: GsonResponseBodyConverter.java */
/* JADX INFO: loaded from: classes5.dex */
public final class c<T> implements f<d0, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gson f138946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypeAdapter<T> f138947b;

    c(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f138946a = gson;
        this.f138947b = typeAdapter;
    }

    @Override // retrofit2.f
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public T convert(d0 d0Var) throws IOException {
        JsonReader jsonReaderNewJsonReader = this.f138946a.newJsonReader(d0Var.charStream());
        try {
            T t10 = this.f138947b.read2(jsonReaderNewJsonReader);
            if (jsonReaderNewJsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new JsonIOException("JSON document was not fully consumed.");
            }
            d0Var.close();
            return t10;
        } catch (Throwable th2) {
            d0Var.close();
            throw th2;
        }
    }
}
