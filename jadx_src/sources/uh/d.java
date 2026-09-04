package uh;

import dl.e;
import fi.l;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.jvm.internal.f0;
import kotlin.random.Random;
import kotlin.text.h;

/* JADX INFO: compiled from: JDK8PlatformImplementations.kt */
/* JADX INFO: loaded from: classes5.dex */
public class d extends th.a {

    /* JADX INFO: compiled from: JDK8PlatformImplementations.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final a f140807a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @e
        @xh.e
        public static final Integer f140808b;

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                num = obj instanceof Integer ? (Integer) obj : null;
            } catch (Throwable unused) {
            }
            if (num != null) {
                if (num.intValue() > 0) {
                    num2 = num;
                }
            }
            f140808b = num2;
        }

        private a() {
        }
    }

    private final boolean e(int i10) {
        Integer num = a.f140808b;
        return num == null || num.intValue() >= i10;
    }

    @Override // sh.l
    @dl.d
    public Random b() {
        return e(34) ? new ei.a() : super.b();
    }

    @Override // sh.l
    @e
    public h c(@dl.d MatchResult matchResult, @dl.d String name) {
        f0.p(matchResult, "matchResult");
        f0.p(name, "name");
        Matcher matcher = matchResult instanceof Matcher ? (Matcher) matchResult : null;
        if (matcher == null) {
            throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
        }
        l lVar = new l(matcher.start(name), matcher.end(name) - 1);
        if (lVar.D().intValue() < 0) {
            return null;
        }
        String strGroup = matcher.group(name);
        f0.o(strGroup, "matcher.group(name)");
        return new h(strGroup, lVar);
    }
}
