package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f50686i = 1.2f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f50687j = "default_bg";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CanvasSubtitleOutput f50688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WebView f50689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<com.google.android.exoplayer2.text.b> f50690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e f50691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f50692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f50693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f50694h;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50695a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f50695a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50695a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50695a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public WebViewSubtitleOutput(Context context) {
        this(context, null);
    }

    public WebViewSubtitleOutput(Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50690d = Collections.emptyList();
        this.f50691e = e.f50717m;
        this.f50692f = 0.0533f;
        this.f50693g = 0;
        this.f50694h = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        this.f50688b = canvasSubtitleOutput;
        WebView webView = new WebView(this, context, attributeSet) { // from class: com.google.android.exoplayer2.ui.WebViewSubtitleOutput.1
            @Override // android.webkit.WebView, android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                super.onTouchEvent(motionEvent);
                return false;
            }

            @Override // android.view.View
            public boolean performClick() {
                super.performClick();
                return false;
            }
        };
        this.f50689c = webView;
        webView.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(webView);
    }

    private static int b(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? 0 : -100;
        }
        return -50;
    }

    private static String c(@androidx.annotation.p0 Layout.Alignment alignment) {
        if (alignment == null) {
            return com.google.android.exoplayer2.text.ttml.d.f49794m0;
        }
        int i10 = a.f50695a[alignment.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? com.google.android.exoplayer2.text.ttml.d.f49794m0 : com.google.android.exoplayer2.text.ttml.d.f49800p0;
        }
        return com.google.android.exoplayer2.text.ttml.d.f49798o0;
    }

    private static String d(e eVar) {
        int i10 = eVar.f50721d;
        if (i10 == 1) {
            return com.google.android.exoplayer2.util.u0.H("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", k.b(eVar.f50722e));
        }
        if (i10 == 2) {
            return com.google.android.exoplayer2.util.u0.H("0.1em 0.12em 0.15em %s", k.b(eVar.f50722e));
        }
        if (i10 != 3) {
            return i10 != 4 ? "unset" : com.google.android.exoplayer2.util.u0.H("-0.05em -0.05em 0.15em %s", k.b(eVar.f50722e));
        }
        return com.google.android.exoplayer2.util.u0.H("0.06em 0.08em 0.15em %s", k.b(eVar.f50722e));
    }

    private String e(int i10, float f10) {
        float fH = t0.h(i10, f10, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return fH == -3.4028235E38f ? "unset" : com.google.android.exoplayer2.util.u0.H("%.2fpx", Float.valueOf(fH / getContext().getResources().getDisplayMetrics().density));
    }

    private static String f(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? "horizontal-tb" : "vertical-lr";
        }
        return "vertical-rl";
    }

    private static String h(com.google.android.exoplayer2.text.b bVar) {
        float f10 = bVar.f49389r;
        if (f10 == 0.0f) {
            return "";
        }
        int i10 = bVar.f49388q;
        return com.google.android.exoplayer2.util.u0.H("%s(%.2fdeg)", (i10 == 2 || i10 == 1) ? "skewY" : "skewX", Float.valueOf(f10));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:26:0x0107  */
    /* JADX WARN: Code duplicated, block: B:29:0x0121  */
    /* JADX WARN: Code duplicated, block: B:30:0x0124  */
    /* JADX WARN: Code duplicated, block: B:33:0x013b  */
    /* JADX WARN: Code duplicated, block: B:35:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0140  */
    /* JADX WARN: Code duplicated, block: B:38:0x0144 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0149  */
    /* JADX WARN: Code duplicated, block: B:48:0x015b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0183  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x021f  */
    /* JADX WARN: Code duplicated, block: B:63:0x023b  */
    private void i() {
        String strH;
        int iB;
        int i10;
        float f10;
        String strH2;
        int i11;
        int i12;
        int i13;
        String str;
        String str2;
        int i14;
        String str3;
        String str4;
        int i15;
        q.b bVarA;
        Iterator it;
        q.b bVar;
        Layout.Alignment alignment;
        String str5;
        boolean z10;
        WebViewSubtitleOutput webViewSubtitleOutput = this;
        StringBuilder sb2 = new StringBuilder();
        int i16 = 0;
        String strE = webViewSubtitleOutput.e(webViewSubtitleOutput.f50693g, webViewSubtitleOutput.f50692f);
        int i17 = 1;
        float f11 = f50686i;
        sb2.append(com.google.android.exoplayer2.util.u0.H("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", k.b(webViewSubtitleOutput.f50691e.f50718a), strE, Float.valueOf(f50686i), d(webViewSubtitleOutput.f50691e)));
        HashMap map = new HashMap();
        map.put(k.a(f50687j), com.google.android.exoplayer2.util.u0.H("background-color:%s;", k.b(webViewSubtitleOutput.f50691e.f50719b)));
        int i18 = 0;
        while (i18 < webViewSubtitleOutput.f50690d.size()) {
            com.google.android.exoplayer2.text.b bVar2 = webViewSubtitleOutput.f50690d.get(i18);
            float f12 = bVar2.f49380i;
            float f13 = f12 != -3.4028235E38f ? f12 * 100.0f : 50.0f;
            int iB2 = b(bVar2.f49381j);
            float f14 = bVar2.f49377f;
            if (f14 != -3.4028235E38f) {
                if (bVar2.f49378g != i17) {
                    Object[] objArr = new Object[i17];
                    objArr[i16] = Float.valueOf(f14 * 100.0f);
                    strH = com.google.android.exoplayer2.util.u0.H("%.2f%%", objArr);
                    iB = bVar2.f49388q == i17 ? -b(bVar2.f49379h) : b(bVar2.f49379h);
                } else if (f14 >= 0.0f) {
                    Object[] objArr2 = new Object[i17];
                    objArr2[i16] = Float.valueOf(f14 * f11);
                    strH = com.google.android.exoplayer2.util.u0.H("%.2fem", objArr2);
                    iB = i16;
                    i10 = iB;
                } else {
                    Object[] objArr3 = new Object[i17];
                    objArr3[i16] = Float.valueOf(((-f14) - 1.0f) * f11);
                    strH = com.google.android.exoplayer2.util.u0.H("%.2fem", objArr3);
                    iB = i16;
                    i10 = i17;
                }
                f10 = bVar2.f49382k;
                if (f10 != -3.4028235E38f) {
                    Object[] objArr4 = new Object[i17];
                    objArr4[0] = Float.valueOf(f10 * 100.0f);
                    strH2 = com.google.android.exoplayer2.util.u0.H("%.2f%%", objArr4);
                } else {
                    strH2 = "fit-content";
                }
                String strC = c(bVar2.f49374c);
                String strF = f(bVar2.f49388q);
                String strE2 = webViewSubtitleOutput.e(bVar2.f49386o, bVar2.f49387p);
                if (bVar2.f49384m) {
                    i11 = bVar2.f49385n;
                } else {
                    i11 = webViewSubtitleOutput.f50691e.f50720c;
                }
                String strB = k.b(i11);
                i12 = iB;
                i13 = bVar2.f49388q;
                str = com.google.android.exoplayer2.text.ttml.d.f49796n0;
                str2 = com.google.android.exoplayer2.text.ttml.d.f49793l0;
                if (i13 != 1) {
                    if (i10 != 0) {
                        str = com.google.android.exoplayer2.text.ttml.d.f49793l0;
                    }
                    str2 = "top";
                    i14 = 2;
                    str3 = str;
                } else if (i13 != 2) {
                    str3 = i10 != 0 ? "bottom" : "top";
                    i14 = 2;
                } else {
                    if (i10 == 0) {
                        str = com.google.android.exoplayer2.text.ttml.d.f49793l0;
                    }
                    str2 = "top";
                    i14 = 2;
                    str3 = str;
                }
                if (i13 != i14 || i13 == 1) {
                    str4 = "height";
                    i15 = i12;
                    i12 = iB2;
                } else {
                    str4 = "width";
                    i15 = iB2;
                }
                bVarA = q.a(bVar2.f49373b, getContext().getResources().getDisplayMetrics().density);
                it = map.keySet().iterator();
                while (it.hasNext()) {
                    Iterator it2 = it;
                    String str6 = (String) it.next();
                    q.b bVar3 = bVarA;
                    str5 = (String) map.put(str6, (String) map.get(str6));
                    if (str5 != null || str5.equals(map.get(str6))) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    com.google.android.exoplayer2.util.a.i(z10);
                    it = it2;
                    bVarA = bVar3;
                }
                bVar = bVarA;
                sb2.append(com.google.android.exoplayer2.util.u0.H("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i18), str2, Float.valueOf(f13), str3, strH, str4, strH2, strC, strF, strE2, strB, Integer.valueOf(i15), Integer.valueOf(i12), h(bVar2)));
                sb2.append(com.google.android.exoplayer2.util.u0.H("<span class='%s'>", f50687j));
                alignment = bVar2.f49375d;
                if (alignment != null) {
                    sb2.append(com.google.android.exoplayer2.util.u0.H("<span style='display:inline-block; text-align:%s;'>", c(alignment)));
                    sb2.append(bVar.f50783a);
                    sb2.append("</span>");
                } else {
                    sb2.append(bVar.f50783a);
                }
                sb2.append("</span>");
                sb2.append("</div>");
                i18++;
                f11 = f50686i;
                i16 = 0;
                webViewSubtitleOutput = this;
                i17 = 1;
            } else {
                Object[] objArr5 = new Object[i17];
                objArr5[i16] = Float.valueOf((1.0f - webViewSubtitleOutput.f50694h) * 100.0f);
                strH = com.google.android.exoplayer2.util.u0.H("%.2f%%", objArr5);
                iB = -100;
            }
            i10 = i16;
            f10 = bVar2.f49382k;
            if (f10 != -3.4028235E38f) {
                Object[] objArr6 = new Object[i17];
                objArr6[0] = Float.valueOf(f10 * 100.0f);
                strH2 = com.google.android.exoplayer2.util.u0.H("%.2f%%", objArr6);
            } else {
                strH2 = "fit-content";
            }
            String strC2 = c(bVar2.f49374c);
            String strF2 = f(bVar2.f49388q);
            String strE3 = webViewSubtitleOutput.e(bVar2.f49386o, bVar2.f49387p);
            if (bVar2.f49384m) {
                i11 = bVar2.f49385n;
            } else {
                i11 = webViewSubtitleOutput.f50691e.f50720c;
            }
            String strB2 = k.b(i11);
            i12 = iB;
            i13 = bVar2.f49388q;
            str = com.google.android.exoplayer2.text.ttml.d.f49796n0;
            str2 = com.google.android.exoplayer2.text.ttml.d.f49793l0;
            if (i13 != 1) {
                if (i10 != 0) {
                    str = com.google.android.exoplayer2.text.ttml.d.f49793l0;
                }
                str2 = "top";
                i14 = 2;
                str3 = str;
            } else if (i13 != 2) {
                if (i10 != 0) {
                }
                i14 = 2;
            } else {
                if (i10 == 0) {
                    str = com.google.android.exoplayer2.text.ttml.d.f49793l0;
                }
                str2 = "top";
                i14 = 2;
                str3 = str;
            }
            if (i13 != i14) {
                str4 = "height";
                i15 = i12;
                i12 = iB2;
            } else {
                str4 = "height";
                i15 = i12;
                i12 = iB2;
            }
            bVarA = q.a(bVar2.f49373b, getContext().getResources().getDisplayMetrics().density);
            it = map.keySet().iterator();
            while (it.hasNext()) {
                Iterator it3 = it;
                String str7 = (String) it.next();
                q.b bVar4 = bVarA;
                str5 = (String) map.put(str7, (String) map.get(str7));
                if (str5 != null) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                com.google.android.exoplayer2.util.a.i(z10);
                it = it3;
                bVarA = bVar4;
            }
            bVar = bVarA;
            sb2.append(com.google.android.exoplayer2.util.u0.H("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i18), str2, Float.valueOf(f13), str3, strH, str4, strH2, strC2, strF2, strE3, strB2, Integer.valueOf(i15), Integer.valueOf(i12), h(bVar2)));
            sb2.append(com.google.android.exoplayer2.util.u0.H("<span class='%s'>", f50687j));
            alignment = bVar2.f49375d;
            if (alignment != null) {
                sb2.append(com.google.android.exoplayer2.util.u0.H("<span style='display:inline-block; text-align:%s;'>", c(alignment)));
                sb2.append(bVar.f50783a);
                sb2.append("</span>");
            } else {
                sb2.append(bVar.f50783a);
            }
            sb2.append("</span>");
            sb2.append("</div>");
            i18++;
            f11 = f50686i;
            i16 = 0;
            webViewSubtitleOutput = this;
            i17 = 1;
        }
        sb2.append("</div></body></html>");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("<html><head><style>");
        for (String str8 : map.keySet()) {
            sb3.append(str8);
            sb3.append("{");
            sb3.append((String) map.get(str8));
            sb3.append(z5.g.f141884d);
        }
        sb3.append("</style></head>");
        sb2.insert(0, sb3.toString());
        this.f50689c.loadData(Base64.encodeToString(sb2.toString().getBytes(com.google.common.base.c.f56721c), 1), "text/html", "base64");
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public void a(List<com.google.android.exoplayer2.text.b> list, e eVar, float f10, int i10, float f11) {
        this.f50691e = eVar;
        this.f50692f = f10;
        this.f50693g = i10;
        this.f50694h = f11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            com.google.android.exoplayer2.text.b bVar = list.get(i11);
            if (bVar.f49376e != null) {
                arrayList.add(bVar);
            } else {
                arrayList2.add(bVar);
            }
        }
        if (!this.f50690d.isEmpty() || !arrayList2.isEmpty()) {
            this.f50690d = arrayList2;
            i();
        }
        this.f50688b.a(arrayList, eVar, f10, i10, f11);
        invalidate();
    }

    public void g() {
        this.f50689c.destroy();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!z10 || this.f50690d.isEmpty()) {
            return;
        }
        i();
    }
}
