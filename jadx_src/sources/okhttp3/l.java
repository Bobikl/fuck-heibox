package okhttp3;

import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: CookieJar.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \b2\u00020\u0001:\u0001\tJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\n"}, d2 = {"Lokhttp3/l;", "", "Lokhttp3/t;", "url", "", "Lokhttp3/Cookie;", "cookies", "Lkotlin/b2;", "b", ak.av, "okhttp"}, k = 1, mv = {1, 4, 0})
public interface l {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final l f132606a = new Companion.C1215a();

    /* JADX INFO: renamed from: okhttp3.l$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: CookieJar.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\b"}, d2 = {"Lokhttp3/l$a;", "", "Lokhttp3/l;", "NO_COOKIES", "Lokhttp3/l;", "<init>", "()V", ak.av, "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f132608a = null;

        /* JADX INFO: renamed from: okhttp3.l$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CookieJar.kt */
        @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lokhttp3/l$a$a;", "Lokhttp3/l;", "Lokhttp3/t;", "url", "", "Lokhttp3/Cookie;", "cookies", "Lkotlin/b2;", "b", ak.av, "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
        public static final class C1215a implements l {
            @Override // okhttp3.l
            @dl.d
            public List<Cookie> a(@dl.d t url) {
                kotlin.jvm.internal.f0.p(url, "url");
                return CollectionsKt__CollectionsKt.E();
            }

            @Override // okhttp3.l
            public void b(@dl.d t url, @dl.d List<Cookie> cookies) {
                kotlin.jvm.internal.f0.p(url, "url");
                kotlin.jvm.internal.f0.p(cookies, "cookies");
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    @dl.d
    List<Cookie> a(@dl.d t url);

    void b(@dl.d t tVar, @dl.d List<Cookie> list);
}
