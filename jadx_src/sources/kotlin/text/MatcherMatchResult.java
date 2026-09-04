package kotlin.text;

import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class MatcherMatchResult implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Matcher f128517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final CharSequence f128518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final i f128519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private List<String> f128520d;

    /* JADX INFO: compiled from: Regex.kt */
    public static final class a extends kotlin.collections.b<String> {
        a() {
        }

        public /* bridge */ boolean a(String str) {
            return super.contains(str);
        }

        @Override // kotlin.collections.b, java.util.List
        @dl.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String get(int i10) {
            String strGroup = MatcherMatchResult.this.f().group(i10);
            return strGroup == null ? "" : strGroup;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return a((String) obj);
            }
            return false;
        }

        public /* bridge */ int e(String str) {
            return super.indexOf(str);
        }

        public /* bridge */ int g(String str) {
            return super.lastIndexOf(str);
        }

        @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
        /* JADX INFO: renamed from: getSize */
        public int getF140741e() {
            return MatcherMatchResult.this.f().groupCount() + 1;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return e((String) obj);
            }
            return -1;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return g((String) obj);
            }
            return -1;
        }
    }

    public MatcherMatchResult(@dl.d Matcher matcher, @dl.d CharSequence input) {
        f0.p(matcher, "matcher");
        f0.p(input, "input");
        this.f128517a = matcher;
        this.f128518b = input;
        this.f128519c = new MatcherMatchResult$groups$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchResult f() {
        return this.f128517a;
    }

    @Override // kotlin.text.k
    @dl.d
    public k.b a() {
        return k.a.a(this);
    }

    @Override // kotlin.text.k
    @dl.d
    public i b() {
        return this.f128519c;
    }

    @Override // kotlin.text.k
    @dl.d
    public List<String> c() {
        if (this.f128520d == null) {
            this.f128520d = new a();
        }
        List<String> list = this.f128520d;
        f0.m(list);
        return list;
    }

    @Override // kotlin.text.k
    @dl.d
    public fi.l d() {
        return RegexKt.i(f());
    }

    @Override // kotlin.text.k
    @dl.d
    public String getValue() {
        String strGroup = f().group();
        f0.o(strGroup, "matchResult.group()");
        return strGroup;
    }

    @Override // kotlin.text.k
    @dl.e
    public k next() {
        int iEnd = f().end() + (f().end() == f().start() ? 1 : 0);
        if (iEnd > this.f128518b.length()) {
            return null;
        }
        Matcher matcher = this.f128517a.pattern().matcher(this.f128518b);
        f0.o(matcher, "matcher.pattern().matcher(input)");
        return RegexKt.f(matcher, iEnd, this.f128518b);
    }
}
