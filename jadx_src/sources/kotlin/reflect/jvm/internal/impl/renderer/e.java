package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.text.u;

/* JADX INFO: compiled from: RenderingUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e {
    @dl.d
    public static final String a(@dl.d kotlin.reflect.jvm.internal.impl.name.d dVar) {
        f0.p(dVar, "<this>");
        List<f> listH = dVar.h();
        f0.o(listH, "pathSegments()");
        return c(listH);
    }

    @dl.d
    public static final String b(@dl.d f fVar) {
        f0.p(fVar, "<this>");
        if (!e(fVar)) {
            String strB = fVar.b();
            f0.o(strB, "asString()");
            return strB;
        }
        StringBuilder sb2 = new StringBuilder();
        String strB2 = fVar.b();
        f0.o(strB2, "asString()");
        sb2.append('`' + strB2);
        sb2.append('`');
        return sb2.toString();
    }

    @dl.d
    public static final String c(@dl.d List<f> pathSegments) {
        f0.p(pathSegments, "pathSegments");
        StringBuilder sb2 = new StringBuilder();
        for (f fVar : pathSegments) {
            if (sb2.length() > 0) {
                sb2.append(".");
            }
            sb2.append(b(fVar));
        }
        String string = sb2.toString();
        f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @dl.e
    public static final String d(@dl.d String lowerRendered, @dl.d String lowerPrefix, @dl.d String upperRendered, @dl.d String upperPrefix, @dl.d String foldedPrefix) {
        f0.p(lowerRendered, "lowerRendered");
        f0.p(lowerPrefix, "lowerPrefix");
        f0.p(upperRendered, "upperRendered");
        f0.p(upperPrefix, "upperPrefix");
        f0.p(foldedPrefix, "foldedPrefix");
        if (u.v2(lowerRendered, lowerPrefix, false, 2, null) && u.v2(upperRendered, upperPrefix, false, 2, null)) {
            String strSubstring = lowerRendered.substring(lowerPrefix.length());
            f0.o(strSubstring, "this as java.lang.String).substring(startIndex)");
            String strSubstring2 = upperRendered.substring(upperPrefix.length());
            f0.o(strSubstring2, "this as java.lang.String).substring(startIndex)");
            String str = foldedPrefix + strSubstring;
            if (f0.g(strSubstring, strSubstring2)) {
                return str;
            }
            if (f(strSubstring, strSubstring2)) {
                return str + '!';
            }
        }
        return null;
    }

    private static final boolean e(f fVar) {
        boolean z10;
        String strB = fVar.b();
        f0.o(strB, "asString()");
        if (!d.f127481a.contains(strB)) {
            int i10 = 0;
            while (true) {
                if (i10 >= strB.length()) {
                    z10 = false;
                    break;
                }
                char cCharAt = strB.charAt(i10);
                if ((Character.isLetterOrDigit(cCharAt) || cCharAt == '_') ? false : true) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x003e  */
    /* JADX WARN: Instruction removed from duplicated block: B:8:0x003e, please report this as an issue */
    public static final boolean f(@dl.d String lower, @dl.d String upper) {
        f0.p(lower, "lower");
        f0.p(upper, "upper");
        if (!f0.g(lower, u.l2(upper, "?", "", false, 4, null))) {
            if (u.K1(upper, "?", false, 2, null)) {
                if (!f0.g(lower + '?', upper)) {
                    if (f0.g('(' + lower + ")?", upper)) {
                        return false;
                    }
                }
            } else {
                if (f0.g('(' + lower + ")?", upper)) {
                    return false;
                }
            }
        }
        return true;
    }
}
