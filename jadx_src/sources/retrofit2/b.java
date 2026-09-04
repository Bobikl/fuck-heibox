package retrofit2;

import java.io.IOException;
import okhttp3.a0;
import okio.Timeout;

/* JADX INFO: compiled from: Call.java */
/* JADX INFO: loaded from: classes5.dex */
public interface b<T> extends Cloneable {
    void N(d<T> dVar);

    void cancel();

    /* JADX INFO: renamed from: clone */
    b<T> mo815clone();

    s<T> execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    a0 request();

    Timeout timeout();
}
