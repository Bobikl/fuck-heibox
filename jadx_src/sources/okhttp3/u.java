package okhttp3;

import com.umeng.analytics.pro.ak;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: compiled from: Interceptor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0002\u0007\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lokhttp3/u;", "", "Lokhttp3/u$a;", "chain", "Lokhttp3/c0;", "intercept", "b", ak.av, "okhttp"}, k = 1, mv = {1, 4, 0})
public interface u {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f132673a;

    /* JADX INFO: compiled from: Interceptor.kt */
    @Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\nH&J\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH&J\b\u0010\u0010\u001a\u00020\nH&J\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH&J\b\u0010\u0012\u001a\u00020\nH&J\u0018\u0010\u0013\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH&¨\u0006\u0014"}, d2 = {"Lokhttp3/u$a;", "", "Lokhttp3/a0;", "request", "Lokhttp3/c0;", "proceed", "Lokhttp3/i;", com.alipay.zoloz.android.phone.mrpc.core.f.f39665q, "Lokhttp3/e;", "call", "", "connectTimeoutMillis", l5.a.f130839h0, "Ljava/util/concurrent/TimeUnit;", "unit", "withConnectTimeout", "readTimeoutMillis", "withReadTimeout", "writeTimeoutMillis", "withWriteTimeout", "okhttp"}, k = 1, mv = {1, 4, 0})
    public interface a {
        @dl.d
        e call();

        int connectTimeoutMillis();

        @dl.e
        i connection();

        @dl.d
        c0 proceed(@dl.d a0 request) throws IOException;

        int readTimeoutMillis();

        @dl.d
        a0 request();

        @dl.d
        a withConnectTimeout(int timeout, @dl.d TimeUnit unit);

        @dl.d
        a withReadTimeout(int timeout, @dl.d TimeUnit unit);

        @dl.d
        a withWriteTimeout(int timeout, @dl.d TimeUnit unit);

        int writeTimeoutMillis();
    }

    /* JADX INFO: renamed from: okhttp3.u$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Interceptor.kt */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\n\u001a\u00020\t2#\b\u0004\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002H\u0086\nø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"Lokhttp3/u$b;", "", "Lkotlin/Function1;", "Lokhttp3/u$a;", "Lkotlin/m0;", "name", "chain", "Lokhttp3/c0;", "block", "Lokhttp3/u;", ak.av, "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f132673a = new Companion();

        /* JADX INFO: renamed from: okhttp3.u$b$a */
        /* JADX INFO: compiled from: Interceptor.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lokhttp3/u$a;", "it", "Lokhttp3/c0;", "intercept", "(Lokhttp3/u$a;)Lokhttp3/c0;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        public static final class a implements u {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ yh.l f132674a;

            public a(yh.l lVar) {
                this.f132674a = lVar;
            }

            @Override // okhttp3.u
            @dl.d
            public final c0 intercept(@dl.d a it) {
                kotlin.jvm.internal.f0.p(it, "it");
                return (c0) this.f132674a.invoke(it);
            }
        }

        private Companion() {
        }

        @dl.d
        public final u a(@dl.d yh.l<? super a, c0> block) {
            kotlin.jvm.internal.f0.p(block, "block");
            return new a(block);
        }
    }

    @dl.d
    c0 intercept(@dl.d a chain) throws IOException;
}
