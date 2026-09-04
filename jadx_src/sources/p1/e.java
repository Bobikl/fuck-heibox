package p1;

import androidx.compose.runtime.m0;
import com.max.xiaoheihe.bean.game.GameObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: Locale.kt */
/* JADX INFO: loaded from: classes.dex */
@m0
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u0011\b\u0000\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016R\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u001a"}, d2 = {"Lp1/e;", "", "", "e", "other", "", "equals", "", "hashCode", "toString", "Lp1/g;", "platformLocale", "Lp1/g;", "b", "()Lp1/g;", ak.av, "()Ljava/lang/String;", ak.N, "d", GameObj.FILTER_HEAD_SCRIPT, ak.aF, "region", "<init>", "(Lp1/g;)V", "languageTag", "(Ljava/lang/String;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final a f138135b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final g f138136a;

    /* JADX INFO: compiled from: Locale.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lp1/e$a;", "", "Lp1/e;", ak.av, "()Lp1/e;", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final e a() {
            return new e(i.a().getCurrent().get(0));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(@dl.d String languageTag) {
        this(i.a().a(languageTag));
        f0.p(languageTag, "languageTag");
    }

    public e(@dl.d g platformLocale) {
        f0.p(platformLocale, "platformLocale");
        this.f138136a = platformLocale;
    }

    @dl.d
    public final String a() {
        return this.f138136a.c();
    }

    @dl.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final g getF138136a() {
        return this.f138136a;
    }

    @dl.d
    public final String c() {
        return this.f138136a.d();
    }

    @dl.d
    public final String d() {
        return this.f138136a.b();
    }

    @dl.d
    public final String e() {
        return this.f138136a.a();
    }

    public boolean equals(@dl.e Object other) {
        if (other == null || !(other instanceof e)) {
            return false;
        }
        if (this == other) {
            return true;
        }
        return f0.g(e(), ((e) other).e());
    }

    public int hashCode() {
        return e().hashCode();
    }

    @dl.d
    public String toString() {
        return e();
    }
}
