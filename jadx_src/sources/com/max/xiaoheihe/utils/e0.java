package com.max.xiaoheihe.utils;

import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.w0;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.view.TextViewSuffixWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: TextViewUtils.java */
/* JADX INFO: loaded from: classes13.dex */
public class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f95368a = "[一-龥]";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: TextViewUtils.java */
    public class a extends com.max.hbcustomview.spans.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f95369d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, d dVar) {
            super(i10);
            this.f95369d = dVar;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            d dVar;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 48903, new Class[]{View.class}, Void.TYPE).isSupported || (dVar = this.f95369d) == null) {
                return;
            }
            dVar.a();
        }
    }

    /* JADX INFO: compiled from: TextViewUtils.java */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f95370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextViewSuffixWrapper f95371c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.max.xiaoheihe.view.n f95372d;

        b(boolean z10, TextViewSuffixWrapper textViewSuffixWrapper, com.max.xiaoheihe.view.n nVar) {
            this.f95370b = z10;
            this.f95371c = textViewSuffixWrapper;
            this.f95372d = nVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 48904, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (this.f95370b) {
                this.f95371c.i(false);
            }
            com.max.xiaoheihe.view.n nVar = this.f95372d;
            if (nVar != null) {
                nVar.a();
            }
        }
    }

    /* JADX INFO: compiled from: TextViewUtils.java */
    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f95373b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextViewSuffixWrapper f95374c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.max.xiaoheihe.view.n f95375d;

        c(boolean z10, TextViewSuffixWrapper textViewSuffixWrapper, com.max.xiaoheihe.view.n nVar) {
            this.f95373b = z10;
            this.f95374c = textViewSuffixWrapper;
            this.f95375d = nVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 48905, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (this.f95373b) {
                this.f95374c.i(false);
            }
            com.max.xiaoheihe.view.n nVar = this.f95375d;
            if (nVar != null) {
                nVar.a();
            }
        }
    }

    /* JADX INFO: compiled from: TextViewUtils.java */
    public interface d {
        void a();
    }

    public static void a(TextView textView, CharSequence charSequence, com.max.xiaoheihe.view.n nVar, boolean z10, int i10) {
        if (PatchProxy.proxy(new Object[]{textView, charSequence, nVar, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10)}, null, changeQuickRedirect, true, 48895, new Class[]{TextView.class, CharSequence.class, com.max.xiaoheihe.view.n.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        TextViewSuffixWrapper textViewSuffixWrapper = new TextViewSuffixWrapper(textView);
        textViewSuffixWrapper.z(charSequence);
        textViewSuffixWrapper.B("...\uf0d7");
        textViewSuffixWrapper.C(i10);
        textViewSuffixWrapper.F(0, 4, R.color.text_primary_1_color, new c(z10, textViewSuffixWrapper, nVar));
        textViewSuffixWrapper.f(false);
    }

    public static void b(TextView textView, CharSequence charSequence, com.max.xiaoheihe.view.n nVar, boolean z10, int i10) {
        if (PatchProxy.proxy(new Object[]{textView, charSequence, nVar, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10)}, null, changeQuickRedirect, true, 48894, new Class[]{TextView.class, CharSequence.class, com.max.xiaoheihe.view.n.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        TextViewSuffixWrapper textViewSuffixWrapper = new TextViewSuffixWrapper(textView);
        textViewSuffixWrapper.z(charSequence);
        textViewSuffixWrapper.B("  查看全文");
        textViewSuffixWrapper.C(i10);
        textViewSuffixWrapper.F(0, 6, R.color.click_blue, nVar == null ? null : new b(z10, textViewSuffixWrapper, nVar));
        textViewSuffixWrapper.f(false);
    }

    private static int c(String str) {
        int i10 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48901, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        while (Pattern.compile("[一-龥]").matcher(str).find()) {
            i10++;
        }
        return i10;
    }

    public static SpannableStringBuilder d(String str, int i10, int i11, int i12, boolean z10, Typeface typeface, d dVar) {
        Object[] objArr = {str, new Integer(i10), new Integer(i11), new Integer(i12), new Byte(z10 ? (byte) 1 : (byte) 0), typeface, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 48891, new Class[]{String.class, cls, cls, cls, Boolean.TYPE, Typeface.class, d.class}, SpannableStringBuilder.class);
        if (patchProxyResultProxy.isSupported) {
            return (SpannableStringBuilder) patchProxyResultProxy.result;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new a(i10, dVar), i11, i12, 33);
        if (Build.VERSION.SDK_INT >= 28 && typeface != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(typeface), i11, i12, 33);
        } else if (z10) {
            spannableStringBuilder.setSpan(new StyleSpan(1), i11, i12, 33);
        }
        return spannableStringBuilder;
    }

    public static StaticLayout e(TextView textView, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{textView, new Integer(i10)}, null, changeQuickRedirect, true, 48893, new Class[]{TextView.class, Integer.TYPE}, StaticLayout.class);
        return patchProxyResultProxy.isSupported ? (StaticLayout) patchProxyResultProxy.result : f(textView, (i10 - textView.getCompoundPaddingLeft()) - textView.getCompoundPaddingRight());
    }

    @w0(api = 23)
    private static StaticLayout f(TextView textView, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{textView, new Integer(i10)}, null, changeQuickRedirect, true, 48897, new Class[]{TextView.class, Integer.TYPE}, StaticLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (StaticLayout) patchProxyResultProxy.result;
        }
        StaticLayout.Builder maxLines = StaticLayout.Builder.obtain(textView.getText(), 0, textView.getText().length(), textView.getPaint(), i10).setAlignment(Layout.Alignment.ALIGN_NORMAL).setTextDirection(TextDirectionHeuristics.FIRSTSTRONG_LTR).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).setMaxLines(Integer.MAX_VALUE);
        if (Build.VERSION.SDK_INT >= 26) {
            maxLines.setJustificationMode(textView.getJustificationMode());
        }
        if (textView.getEllipsize() != null && textView.getKeyListener() == null) {
            maxLines.setEllipsize(textView.getEllipsize()).setEllipsizedWidth(i10);
        }
        return maxLines.build();
    }

    private static StaticLayout g(TextView textView, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{textView, new Integer(i10)}, null, changeQuickRedirect, true, 48898, new Class[]{TextView.class, Integer.TYPE}, StaticLayout.class);
        return patchProxyResultProxy.isSupported ? (StaticLayout) patchProxyResultProxy.result : new StaticLayout(textView.getText(), 0, textView.getText().length(), textView.getPaint(), i10, Layout.Alignment.ALIGN_NORMAL, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding(), textView.getEllipsize(), i10);
    }

    public static int h(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48902, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (str == null || str.length() == 0) {
            return 0;
        }
        return str.length() + c(str);
    }

    public static int i(TextView textView, int i10) {
        Object[] objArr = {textView, new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 48892, new Class[]{TextView.class, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : e(textView, i10).getLineCount();
    }

    private static boolean j(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48900, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (str == null || str.length() == 0 || str.length() > 1) {
            return false;
        }
        return Pattern.matches("[一-龥]", str);
    }

    public static String k(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48896, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return str != null ? Pattern.compile("\t|\r|\n|\\s*").matcher(str).replaceAll("") : "";
    }

    public static String l(String str, int i10) {
        int i11 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Integer(i10)}, null, changeQuickRedirect, true, 48899, new Class[]{String.class, Integer.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (str == null || str.length() == 0) {
            return "";
        }
        int i12 = i10 * 2;
        if (h(str) <= i12) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        int i13 = 0;
        while (true) {
            int i14 = i12 - 2;
            if (i11 > i14 || i13 >= str.length()) {
                break;
            }
            char cCharAt = str.charAt(i13);
            i11 = j(String.valueOf(cCharAt)) ? i11 + 2 : i11 + 1;
            if (i11 > i14) {
                return sb2.toString() + "...";
            }
            sb2.append(cCharAt);
            i13++;
        }
        return sb2.toString() + "...";
    }
}
