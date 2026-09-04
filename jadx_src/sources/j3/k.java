package j3;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.m;

/* JADX INFO: compiled from: SupportSQLiteQueryBuilder.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J\"\u0010\b\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002J'\u0010\u000b\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00032\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\r\u001a\u00020\u0000J\u001f\u0010\u000e\u001a\u00020\u00002\u0010\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0012\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0011\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0004J\u0006\u0010\u001d\u001a\u00020\u001c¨\u0006!"}, d2 = {"Lj3/k;", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "name", "clause", "Lkotlin/b2;", ak.av, "", com.tekartik.sqflite.b.f98606y, "b", "(Ljava/lang/StringBuilder;[Ljava/lang/String;)V", "f", "d", "([Ljava/lang/String;)Lj3/k;", "selection", "bindArgs", "k", "(Ljava/lang/String;[Ljava/lang/Object;)Lj3/k;", "groupBy", "g", "having", RXScreenCaptureService.KEY_HEIGHT, "orderBy", "j", "limit", "i", "Lj3/j;", "e", "table", "<init>", "(Ljava/lang/String;)V", "sqlite_release"}, k = 1, mv = {1, 7, 1})
public final class k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    public static final a f124225j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f124226k = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final String f124227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f124228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private String[] f124229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private String f124230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private Object[] f124231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private String f124232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private String f124233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private String f124234h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private String f124235i;

    /* JADX INFO: compiled from: SupportSQLiteQueryBuilder.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u001c\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lj3/k$a;", "", "", "tableName", "Lj3/k;", ak.av, "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "limitPattern", "Ljava/util/regex/Pattern;", "<init>", "()V", "sqlite_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        @m
        public final k a(@dl.d String tableName) {
            f0.p(tableName, "tableName");
            return new k(tableName, null);
        }
    }

    private k(String str) {
        this.f124227a = str;
    }

    public /* synthetic */ k(String str, u uVar) {
        this(str);
    }

    private final void a(StringBuilder sb2, String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return;
        }
        sb2.append(str);
        sb2.append(str2);
    }

    private final void b(StringBuilder sb2, String[] strArr) {
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        sb2.append(' ');
    }

    @dl.d
    @m
    public static final k c(@dl.d String str) {
        return f124225j.a(str);
    }

    @dl.d
    public final k d(@dl.e String[] columns) {
        this.f124229c = columns;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0025  */
    /* JADX WARN: Code duplicated, block: B:32:0x0049  */
    @dl.d
    public final j e() {
        boolean z10;
        boolean z11;
        String str = this.f124232f;
        if (str == null || str.length() == 0) {
            String str2 = this.f124233g;
            if (str2 == null || str2.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause".toString());
        }
        StringBuilder sb2 = new StringBuilder(120);
        sb2.append("SELECT ");
        if (this.f124228b) {
            sb2.append("DISTINCT ");
        }
        String[] strArr = this.f124229c;
        if (strArr != null) {
            z11 = strArr.length == 0;
        }
        if (z11) {
            sb2.append("* ");
        } else {
            f0.m(strArr);
            b(sb2, strArr);
        }
        sb2.append("FROM ");
        sb2.append(this.f124227a);
        a(sb2, " WHERE ", this.f124230d);
        a(sb2, " GROUP BY ", this.f124232f);
        a(sb2, " HAVING ", this.f124233g);
        a(sb2, " ORDER BY ", this.f124234h);
        a(sb2, " LIMIT ", this.f124235i);
        String string = sb2.toString();
        f0.o(string, "StringBuilder(capacity).…builderAction).toString()");
        return new b(string, this.f124231e);
    }

    @dl.d
    public final k f() {
        this.f124228b = true;
        return this;
    }

    @dl.d
    public final k g(@dl.e String groupBy) {
        this.f124232f = groupBy;
        return this;
    }

    @dl.d
    public final k h(@dl.e String having) {
        this.f124233g = having;
        return this;
    }

    @dl.d
    public final k i(@dl.d String limit) {
        f0.p(limit, "limit");
        boolean zMatches = f124226k.matcher(limit).matches();
        boolean z10 = true;
        if (!(limit.length() == 0) && !zMatches) {
            z10 = false;
        }
        if (z10) {
            this.f124235i = limit;
            return this;
        }
        throw new IllegalArgumentException(("invalid LIMIT clauses:" + limit).toString());
    }

    @dl.d
    public final k j(@dl.e String orderBy) {
        this.f124234h = orderBy;
        return this;
    }

    @dl.d
    public final k k(@dl.e String selection, @dl.e Object[] bindArgs) {
        this.f124230d = selection;
        this.f124231e = bindArgs;
        return this;
    }
}
