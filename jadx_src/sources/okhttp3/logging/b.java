package okhttp3.logging;

import com.umeng.analytics.pro.ak;
import dl.d;
import fi.u;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import okio.Buffer;

/* JADX INFO: compiled from: utf8.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"Lokio/Buffer;", "", ak.av, "okhttp-logging-interceptor"}, k = 2, mv = {1, 4, 0})
public final class b {
    public static final boolean a(@d Buffer isProbablyUtf8) {
        f0.p(isProbablyUtf8, "$this$isProbablyUtf8");
        try {
            Buffer buffer = new Buffer();
            isProbablyUtf8.copyTo(buffer, 0L, u.C(isProbablyUtf8.size(), 64L));
            for (int i10 = 0; i10 < 16 && !buffer.exhausted(); i10++) {
                int utf8CodePoint = buffer.readUtf8CodePoint();
                if (Character.isISOControl(utf8CodePoint) && !Character.isWhitespace(utf8CodePoint)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
