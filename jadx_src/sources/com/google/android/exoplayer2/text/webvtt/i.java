package com.google.android.exoplayer2.text.webvtt;

import androidx.annotation.p0;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.u0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: WebvttParserUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f50003a = Pattern.compile("^NOTE([ \t].*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f50004b = "WEBVTT";

    private i() {
    }

    @p0
    public static Matcher a(e0 e0Var) {
        String strQ;
        while (true) {
            String strQ2 = e0Var.q();
            if (strQ2 == null) {
                return null;
            }
            if (f50003a.matcher(strQ2).matches()) {
                do {
                    strQ = e0Var.q();
                    if (strQ == null) {
                        break;
                    }
                } while (!strQ.isEmpty());
            } else {
                Matcher matcher = f.f49953f.matcher(strQ2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(e0 e0Var) {
        String strQ = e0Var.q();
        return strQ != null && strQ.startsWith(f50004b);
    }

    public static float c(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) throws NumberFormatException {
        String[] strArrQ1 = u0.q1(str, "\\.");
        long j10 = 0;
        for (String str2 : u0.p1(strArrQ1[0], ":")) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (strArrQ1.length == 2) {
            j11 += Long.parseLong(strArrQ1[1]);
        }
        return j11 * 1000;
    }

    public static void e(e0 e0Var) throws ParserException {
        int iE = e0Var.e();
        if (b(e0Var)) {
            return;
        }
        e0Var.S(iE);
        String strValueOf = String.valueOf(e0Var.q());
        throw ParserException.a(strValueOf.length() != 0 ? "Expected WEBVTT. Got ".concat(strValueOf) : new String("Expected WEBVTT. Got "), null);
    }
}
