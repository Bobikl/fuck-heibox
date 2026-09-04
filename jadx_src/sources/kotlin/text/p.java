package kotlin.text;

import java.util.Set;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RegexExtensions.kt */
/* JADX INFO: loaded from: classes5.dex */
public class p extends o {
    @sh.f
    private static final Regex t(String str) {
        f0.p(str, "<this>");
        return new Regex(str);
    }

    @sh.f
    private static final Regex u(String str, Set<? extends RegexOption> options) {
        f0.p(str, "<this>");
        f0.p(options, "options");
        return new Regex(str, options);
    }

    @sh.f
    private static final Regex v(String str, RegexOption option) {
        f0.p(str, "<this>");
        f0.p(option, "option");
        return new Regex(str, option);
    }
}
