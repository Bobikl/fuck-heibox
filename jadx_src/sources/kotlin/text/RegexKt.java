package kotlin.text;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class RegexKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final k f(Matcher matcher, int i10, CharSequence charSequence) {
        if (matcher.find(i10)) {
            return new MatcherMatchResult(matcher, charSequence);
        }
        return null;
    }

    private static final /* synthetic */ <T extends Enum<T> & g> Set<T> g(final int i10) {
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        EnumSet fromInt$lambda$1 = EnumSet.allOf(Enum.class);
        f0.o(fromInt$lambda$1, "fromInt$lambda$1");
        f0.w();
        kotlin.collections.x.N0(fromInt$lambda$1, new yh.l<T, Boolean>() { // from class: kotlin.text.RegexKt$fromInt$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Boolean; */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Enum r10) {
                g gVar = (g) r10;
                return Boolean.valueOf((i10 & gVar.getMask()) == gVar.getValue());
            }
        });
        Set<T> setUnmodifiableSet = Collections.unmodifiableSet(fromInt$lambda$1);
        f0.o(setUnmodifiableSet, "unmodifiableSet(EnumSet.…mask == it.value }\n    })");
        return setUnmodifiableSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k h(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new MatcherMatchResult(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fi.l i(MatchResult matchResult) {
        return fi.u.W1(matchResult.start(), matchResult.end());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fi.l j(MatchResult matchResult, int i10) {
        return fi.u.W1(matchResult.start(i10), matchResult.end(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(Iterable<? extends g> iterable) {
        Iterator<? extends g> it = iterable.iterator();
        int value = 0;
        while (it.hasNext()) {
            value |= it.next().getValue();
        }
        return value;
    }
}
