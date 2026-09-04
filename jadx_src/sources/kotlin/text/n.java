package kotlin.text;

import java.io.IOException;
import kotlin.e2;
import kotlin.jvm.internal.f0;
import kotlin.u0;

/* JADX INFO: compiled from: Appendable.kt */
/* JADX INFO: loaded from: classes5.dex */
public class n {
    @dl.d
    public static final <T extends Appendable> T a(@dl.d T t10, @dl.d CharSequence... value) throws IOException {
        f0.p(t10, "<this>");
        f0.p(value, "value");
        for (CharSequence charSequence : value) {
            t10.append(charSequence);
        }
        return t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void b(@dl.d Appendable appendable, T t10, @dl.e yh.l<? super T, ? extends CharSequence> lVar) {
        f0.p(appendable, "<this>");
        if (lVar != null) {
            appendable.append(lVar.invoke(t10));
            return;
        }
        if (t10 == 0 ? true : t10 instanceof CharSequence) {
            appendable.append((CharSequence) t10);
        } else if (t10 instanceof Character) {
            appendable.append(((Character) t10).charValue());
        } else {
            appendable.append(String.valueOf(t10));
        }
    }

    @u0(version = "1.4")
    @sh.f
    private static final Appendable c(Appendable appendable) throws IOException {
        f0.p(appendable, "<this>");
        Appendable appendableAppend = appendable.append('\n');
        f0.o(appendableAppend, "append('\\n')");
        return appendableAppend;
    }

    @u0(version = "1.4")
    @sh.f
    private static final Appendable d(Appendable appendable, char c10) throws IOException {
        f0.p(appendable, "<this>");
        Appendable appendableAppend = appendable.append(c10);
        f0.o(appendableAppend, "append(value)");
        Appendable appendableAppend2 = appendableAppend.append('\n');
        f0.o(appendableAppend2, "append('\\n')");
        return appendableAppend2;
    }

    @u0(version = "1.4")
    @sh.f
    private static final Appendable e(Appendable appendable, CharSequence charSequence) throws IOException {
        f0.p(appendable, "<this>");
        Appendable appendableAppend = appendable.append(charSequence);
        f0.o(appendableAppend, "append(value)");
        Appendable appendableAppend2 = appendableAppend.append('\n');
        f0.o(appendableAppend2, "append('\\n')");
        return appendableAppend2;
    }

    @u0(version = "1.4")
    @dl.d
    @e2(markerClass = {kotlin.q.class})
    public static final <T extends Appendable> T f(@dl.d T t10, @dl.d CharSequence value, int i10, int i11) {
        f0.p(t10, "<this>");
        f0.p(value, "value");
        T t11 = (T) t10.append(value, i10, i11);
        f0.n(t11, "null cannot be cast to non-null type T of kotlin.text.StringsKt__AppendableKt.appendRange");
        return t11;
    }
}
