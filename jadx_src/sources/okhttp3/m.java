package okhttp3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import okio.ByteString;

/* JADX INFO: compiled from: Credentials.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Lokhttp3/m;", "", "", g0.a.f118919c, g0.a.f118920d, "Ljava/nio/charset/Charset;", "charset", "b", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f132618a = new m();

    private m() {
    }

    @dl.d
    @xh.i
    @xh.m
    public static final String a(@dl.d String str, @dl.d String str2) {
        return c(str, str2, null, 4, null);
    }

    @dl.d
    @xh.i
    @xh.m
    public static final String b(@dl.d String username, @dl.d String password, @dl.d Charset charset) {
        kotlin.jvm.internal.f0.p(username, "username");
        kotlin.jvm.internal.f0.p(password, "password");
        kotlin.jvm.internal.f0.p(charset, "charset");
        return "Basic " + ByteString.INSTANCE.encodeString(username + ':' + password, charset).base64();
    }

    public static /* synthetic */ String c(String str, String str2, Charset ISO_8859_1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            ISO_8859_1 = StandardCharsets.ISO_8859_1;
            kotlin.jvm.internal.f0.o(ISO_8859_1, "ISO_8859_1");
        }
        return b(str, str2, ISO_8859_1);
    }
}
