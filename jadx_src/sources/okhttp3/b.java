package okhttp3;

import com.umeng.analytics.pro.ak;
import java.io.IOException;
import kotlin.Metadata;
import okhttp3.internal.authenticator.JavaNetAuthenticator;

/* JADX INFO: compiled from: Authenticator.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\tJ\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\n"}, d2 = {"Lokhttp3/b;", "", "Lokhttp3/e0;", "route", "Lokhttp3/c0;", "response", "Lokhttp3/a0;", "authenticate", ak.aF, ak.av, "okhttp"}, k = 1, mv = {1, 4, 0})
public interface b {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final b f132372a = new Companion.C1210a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final b f132373b = new JavaNetAuthenticator(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: okhttp3.b$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Authenticator.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\t"}, d2 = {"Lokhttp3/b$a;", "", "Lokhttp3/b;", "JAVA_NET_AUTHENTICATOR", "Lokhttp3/b;", "NONE", "<init>", "()V", ak.av, "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f132375a = null;

        /* JADX INFO: renamed from: okhttp3.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Authenticator.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lokhttp3/b$a$a;", "Lokhttp3/b;", "Lokhttp3/e0;", "route", "Lokhttp3/c0;", "response", "Lokhttp3/a0;", "authenticate", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
        public static final class C1210a implements b {
            @Override // okhttp3.b
            @dl.e
            public a0 authenticate(@dl.e e0 route, @dl.d c0 response) {
                kotlin.jvm.internal.f0.p(response, "response");
                return null;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    @dl.e
    a0 authenticate(@dl.e e0 route, @dl.d c0 response) throws IOException;
}
