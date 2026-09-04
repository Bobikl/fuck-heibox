package com.google.android.exoplayer2.text.subrip;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.p0;
import com.google.android.exoplayer2.text.f;
import com.google.android.exoplayer2.text.g;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.v;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: SubripDecoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends f {
    private static final String A = "{\\an3}";
    private static final String B = "{\\an4}";
    private static final String C = "{\\an5}";
    private static final String D = "{\\an6}";
    private static final String E = "{\\an7}";
    private static final String F = "{\\an8}";
    private static final String G = "{\\an9}";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final float f49739q = 0.08f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final float f49740r = 0.92f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final float f49741s = 0.5f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f49742t = "SubripDecoder";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f49743u = "(?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Pattern f49744v = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Pattern f49745w = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f49746x = "\\{\\\\an[1-9]\\}";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f49747y = "{\\an1}";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f49748z = "{\\an2}";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final StringBuilder f49749o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ArrayList<String> f49750p;

    public a() {
        super(f49742t);
        this.f49749o = new StringBuilder();
        this.f49750p = new ArrayList<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x007b  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e6  */
    private com.google.android.exoplayer2.text.b A(Spanned spanned, @p0 String str) {
        byte b10;
        byte b11;
        com.google.android.exoplayer2.text.b.c cVarA = new com.google.android.exoplayer2.text.b.c().A(spanned);
        if (str == null) {
            return cVarA.a();
        }
        switch (str) {
            case "{\an1}":
                b10 = 0;
                break;
            case "{\an2}":
                b10 = 6;
                break;
            case "{\an3}":
                b10 = 3;
                break;
            case "{\an4}":
                b10 = 1;
                break;
            case "{\an5}":
                b10 = 7;
                break;
            case "{\an6}":
                b10 = 4;
                break;
            case "{\an7}":
                b10 = 2;
                break;
            case "{\an8}":
                b10 = 8;
                break;
            case "{\an9}":
                b10 = 5;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0 || b10 == 1 || b10 == 2) {
            cVarA.x(0);
        } else if (b10 == 3 || b10 == 4 || b10 == 5) {
            cVarA.x(2);
        } else {
            cVarA.x(1);
        }
        switch (str) {
            case "{\an1}":
                b11 = 0;
                break;
            case "{\an2}":
                b11 = 1;
                break;
            case "{\an3}":
                b11 = 2;
                break;
            case "{\an4}":
                b11 = 6;
                break;
            case "{\an5}":
                b11 = 7;
                break;
            case "{\an6}":
                b11 = 8;
                break;
            case "{\an7}":
                b11 = 3;
                break;
            case "{\an8}":
                b11 = 4;
                break;
            case "{\an9}":
                b11 = 5;
                break;
            default:
                b11 = -1;
                break;
        }
        if (b11 == 0 || b11 == 1 || b11 == 2) {
            cVarA.u(2);
        } else if (b11 == 3 || b11 == 4 || b11 == 5) {
            cVarA.u(0);
        } else {
            cVarA.u(1);
        }
        return cVarA.w(B(cVarA.i())).t(B(cVarA.f()), 0).a();
    }

    static float B(int i10) {
        if (i10 == 0) {
            return 0.08f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 == 2) {
            return f49740r;
        }
        throw new IllegalArgumentException();
    }

    private static long C(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j10 = (strGroup != null ? Long.parseLong(strGroup) * 60 * 60 * 1000 : 0L) + (Long.parseLong((String) com.google.android.exoplayer2.util.a.g(matcher.group(i10 + 2))) * 60 * 1000) + (Long.parseLong((String) com.google.android.exoplayer2.util.a.g(matcher.group(i10 + 3))) * 1000);
        String strGroup2 = matcher.group(i10 + 4);
        if (strGroup2 != null) {
            j10 += Long.parseLong(strGroup2);
        }
        return j10 * 1000;
    }

    private String D(String str, ArrayList<String> arrayList) {
        String strTrim = str.trim();
        StringBuilder sb2 = new StringBuilder(strTrim);
        Matcher matcher = f49745w.matcher(strTrim);
        int i10 = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i10;
            int length = strGroup.length();
            sb2.replace(iStart, iStart + length, "");
            i10 += length;
        }
        return sb2.toString();
    }

    @Override // com.google.android.exoplayer2.text.f
    protected g y(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        v vVar = new v();
        e0 e0Var = new e0(bArr, i10);
        while (true) {
            String strQ = e0Var.q();
            if (strQ == null) {
                break;
            }
            if (strQ.length() != 0) {
                try {
                    Integer.parseInt(strQ);
                    String strQ2 = e0Var.q();
                    if (strQ2 == null) {
                        u.m(f49742t, "Unexpected end");
                        break;
                    }
                    Matcher matcher = f49744v.matcher(strQ2);
                    if (matcher.matches()) {
                        vVar.a(C(matcher, 1));
                        vVar.a(C(matcher, 6));
                        this.f49749o.setLength(0);
                        this.f49750p.clear();
                        for (String strQ3 = e0Var.q(); !TextUtils.isEmpty(strQ3); strQ3 = e0Var.q()) {
                            if (this.f49749o.length() > 0) {
                                this.f49749o.append("<br>");
                            }
                            this.f49749o.append(D(strQ3, this.f49750p));
                        }
                        Spanned spannedFromHtml = Html.fromHtml(this.f49749o.toString());
                        String str = null;
                        for (int i11 = 0; i11 < this.f49750p.size(); i11++) {
                            String str2 = this.f49750p.get(i11);
                            if (str2.matches(f49746x)) {
                                str = str2;
                                break;
                            }
                        }
                        arrayList.add(A(spannedFromHtml, str));
                        arrayList.add(com.google.android.exoplayer2.text.b.f49365s);
                    } else {
                        u.m(f49742t, strQ2.length() != 0 ? "Skipping invalid timing: ".concat(strQ2) : new String("Skipping invalid timing: "));
                    }
                } catch (NumberFormatException unused) {
                    u.m(f49742t, strQ.length() != 0 ? "Skipping invalid index: ".concat(strQ) : new String("Skipping invalid index: "));
                }
            }
        }
        return new b((com.google.android.exoplayer2.text.b[]) arrayList.toArray(new com.google.android.exoplayer2.text.b[0]), vVar.d());
    }
}
