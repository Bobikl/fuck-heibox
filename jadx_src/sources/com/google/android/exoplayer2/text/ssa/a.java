package com.google.android.exoplayer2.text.ssa;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.p0;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.text.f;
import com.google.android.exoplayer2.text.g;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.u0;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: SsaDecoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends f {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f49685t = "SsaDecoder";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Pattern f49686u = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final String f49687v = "Format:";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final String f49688w = "Style:";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f49689x = "Dialogue:";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final float f49690y = 0.05f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f49691o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private final b f49692p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Map<String, c> f49693q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f49694r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f49695s;

    public a() {
        this(null);
    }

    public a(@p0 List<byte[]> list) {
        super(f49685t);
        this.f49694r = -3.4028235E38f;
        this.f49695s = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.f49691o = false;
            this.f49692p = null;
            return;
        }
        this.f49691o = true;
        String strI = u0.I(list.get(0));
        com.google.android.exoplayer2.util.a.a(strI.startsWith(f49687v));
        this.f49692p = (b) com.google.android.exoplayer2.util.a.g(b.a(strI));
        F(new e0(list.get(1)));
    }

    private static int A(long j10, List<Long> list, List<List<com.google.android.exoplayer2.text.b>> list2) {
        int i10;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (list.get(size).longValue() == j10) {
                return size;
            }
            if (list.get(size).longValue() < j10) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        list.add(i10, Long.valueOf(j10));
        list2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList(list2.get(i10 - 1)));
        return i10;
    }

    private static float B(int i10) {
        if (i10 == 0) {
            return f49690y;
        }
        if (i10 != 1) {
            return i10 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static com.google.android.exoplayer2.text.b C(String str, @p0 c cVar, c.b bVar, float f10, float f11) {
        SpannableString spannableString = new SpannableString(str);
        com.google.android.exoplayer2.text.b.c cVarA = new com.google.android.exoplayer2.text.b.c().A(spannableString);
        if (cVar != null) {
            if (cVar.f49714c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.f49714c.intValue()), 0, spannableString.length(), 33);
            }
            float f12 = cVar.f49715d;
            if (f12 != -3.4028235E38f && f11 != -3.4028235E38f) {
                cVarA.C(f12 / f11, 1);
            }
            boolean z10 = cVar.f49716e;
            if (z10 && cVar.f49717f) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z10) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (cVar.f49717f) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (cVar.f49718g) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (cVar.f49719h) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i10 = bVar.f49735a;
        if (i10 == -1) {
            i10 = cVar != null ? cVar.f49713b : -1;
        }
        cVarA.B(L(i10)).x(K(i10)).u(J(i10));
        PointF pointF = bVar.f49736b;
        if (pointF == null || f11 == -3.4028235E38f || f10 == -3.4028235E38f) {
            cVarA.w(B(cVarA.i()));
            cVarA.t(B(cVarA.f()), 0);
        } else {
            cVarA.w(pointF.x / f10);
            cVarA.t(bVar.f49736b.y / f11, 0);
        }
        return cVarA.a();
    }

    private void D(String str, b bVar, List<List<com.google.android.exoplayer2.text.b>> list, List<Long> list2) {
        int i10;
        com.google.android.exoplayer2.util.a.a(str.startsWith(f49689x));
        String[] strArrSplit = str.substring(9).split(Constants.ACCEPT_TIME_SEPARATOR_SP, bVar.f49700e);
        if (strArrSplit.length != bVar.f49700e) {
            u.m(f49685t, str.length() != 0 ? "Skipping dialogue line with fewer columns than format: ".concat(str) : new String("Skipping dialogue line with fewer columns than format: "));
            return;
        }
        long jI = I(strArrSplit[bVar.f49696a]);
        if (jI == j.f46377b) {
            u.m(f49685t, str.length() != 0 ? "Skipping invalid timing: ".concat(str) : new String("Skipping invalid timing: "));
            return;
        }
        long jI2 = I(strArrSplit[bVar.f49697b]);
        if (jI2 == j.f46377b) {
            u.m(f49685t, str.length() != 0 ? "Skipping invalid timing: ".concat(str) : new String("Skipping invalid timing: "));
            return;
        }
        Map<String, c> map = this.f49693q;
        c cVar = (map == null || (i10 = bVar.f49698c) == -1) ? null : map.get(strArrSplit[i10].trim());
        String str2 = strArrSplit[bVar.f49699d];
        com.google.android.exoplayer2.text.b bVarC = C(c.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), cVar, c.b.b(str2), this.f49694r, this.f49695s);
        int iA = A(jI2, list2, list);
        for (int iA2 = A(jI, list2, list); iA2 < iA; iA2++) {
            list.get(iA2).add(bVarC);
        }
    }

    private void E(e0 e0Var, List<List<com.google.android.exoplayer2.text.b>> list, List<Long> list2) {
        b bVarA = this.f49691o ? this.f49692p : null;
        while (true) {
            String strQ = e0Var.q();
            if (strQ == null) {
                return;
            }
            if (strQ.startsWith(f49687v)) {
                bVarA = b.a(strQ);
            } else if (strQ.startsWith(f49689x)) {
                if (bVarA == null) {
                    u.m(f49685t, strQ.length() != 0 ? "Skipping dialogue line before complete format: ".concat(strQ) : new String("Skipping dialogue line before complete format: "));
                } else {
                    D(strQ, bVarA, list, list2);
                }
            }
        }
    }

    private void F(e0 e0Var) {
        while (true) {
            String strQ = e0Var.q();
            if (strQ == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strQ)) {
                G(e0Var);
            } else if ("[V4+ Styles]".equalsIgnoreCase(strQ)) {
                this.f49693q = H(e0Var);
            } else if ("[V4 Styles]".equalsIgnoreCase(strQ)) {
                u.h(f49685t, "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strQ)) {
                return;
            }
        }
    }

    private void G(e0 e0Var) {
        while (true) {
            String strQ = e0Var.q();
            if (strQ == null) {
                return;
            }
            if (e0Var.a() != 0 && e0Var.h() == 91) {
                return;
            }
            String[] strArrSplit = strQ.split(":");
            if (strArrSplit.length == 2) {
                String strG = com.google.common.base.a.g(strArrSplit[0].trim());
                strG.hashCode();
                if (strG.equals("playresx")) {
                    this.f49694r = Float.parseFloat(strArrSplit[1].trim());
                } else if (strG.equals("playresy")) {
                    try {
                        this.f49695s = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private static Map<String, c> H(e0 e0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVarA = null;
        while (true) {
            String strQ = e0Var.q();
            if (strQ == null || (e0Var.a() != 0 && e0Var.h() == 91)) {
                break;
            }
            if (strQ.startsWith(f49687v)) {
                aVarA = c.a.a(strQ);
            } else if (strQ.startsWith(f49688w)) {
                if (aVarA == null) {
                    u.m(f49685t, strQ.length() != 0 ? "Skipping 'Style:' line before 'Format:' line: ".concat(strQ) : new String("Skipping 'Style:' line before 'Format:' line: "));
                } else {
                    c cVarB = c.b(strQ, aVarA);
                    if (cVarB != null) {
                        linkedHashMap.put(cVarB.f49712a, cVarB);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long I(String str) {
        Matcher matcher = f49686u.matcher(str.trim());
        return !matcher.matches() ? j.f46377b : (Long.parseLong((String) u0.k(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) u0.k(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) u0.k(matcher.group(3))) * 1000000) + (Long.parseLong((String) u0.k(matcher.group(4))) * 10000);
    }

    private static int J(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                StringBuilder sb2 = new StringBuilder(30);
                sb2.append("Unknown alignment: ");
                sb2.append(i10);
                u.m(f49685t, sb2.toString());
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    private static int K(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                StringBuilder sb2 = new StringBuilder(30);
                sb2.append("Unknown alignment: ");
                sb2.append(i10);
                u.m(f49685t, sb2.toString());
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    @p0
    private static Layout.Alignment L(int i10) {
        switch (i10) {
            case -1:
                return null;
            case 0:
            default:
                StringBuilder sb2 = new StringBuilder(30);
                sb2.append("Unknown alignment: ");
                sb2.append(i10);
                u.m(f49685t, sb2.toString());
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // com.google.android.exoplayer2.text.f
    protected g y(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        e0 e0Var = new e0(bArr, i10);
        if (!this.f49691o) {
            F(e0Var);
        }
        E(e0Var, arrayList, arrayList2);
        return new d(arrayList, arrayList2);
    }
}
