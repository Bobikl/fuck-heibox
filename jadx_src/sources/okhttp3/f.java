package okhttp3;

import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: compiled from: Callback.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&¨\u0006\u000b"}, d2 = {"Lokhttp3/f;", "", "Lokhttp3/e;", "call", "Ljava/io/IOException;", "e", "Lkotlin/b2;", "onFailure", "Lokhttp3/c0;", "response", "onResponse", "okhttp"}, k = 1, mv = {1, 4, 0})
public interface f {
    void onFailure(@dl.d e eVar, @dl.d IOException iOException);

    void onResponse(@dl.d e eVar, @dl.d c0 c0Var) throws IOException;
}
