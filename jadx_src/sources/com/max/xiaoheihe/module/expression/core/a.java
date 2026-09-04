package com.max.xiaoheihe.module.expression.core;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.max.hbcustomview.spans.AsyncCenterImageSpan;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.AccelWorldStringKt;
import com.max.xiaoheihe.utils.imageviewer.ImageViewerHelper;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: ExpressionTransformEngine.java */
/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f83581a = "<a\\s+([^>]*?)>(.*?)<\\/a>";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.expression.core.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ExpressionTransformEngine.java */
    public class C0733a extends com.max.hbcustomview.spans.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f83582d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f83583e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0733a(int i10, Context context, String str) {
            super(i10);
            this.f83582d = context;
            this.f83583e = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31477, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.T(this.f83582d, this.f83583e).A();
        }
    }

    /* JADX INFO: compiled from: ExpressionTransformEngine.java */
    public class b extends com.max.hbcustomview.spans.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f83584d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f83585e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, String str, Context context) {
            super(i10);
            this.f83584d = str;
            this.f83585e = context;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31478, new Class[]{View.class}, Void.TYPE).isSupported || this.f83584d == null) {
                return;
            }
            ImageViewerHelper.a(this.f83585e).m(ImageViewerHelper.d(view, 0), this.f83584d.split(Constants.ACCEPT_TIME_SEPARATOR_SP)).d(0).p();
        }
    }

    /* JADX INFO: compiled from: ExpressionTransformEngine.java */
    public class c extends com.max.hbcustomview.spans.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f83586d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f83587e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10, Context context, String str) {
            super(i10);
            this.f83586d = context;
            this.f83587e = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31479, new Class[]{View.class}, Void.TYPE).isSupported || l0.n0(this.f83586d, this.f83587e)) {
                return;
            }
            com.max.xiaoheihe.base.router.b.j0(this.f83586d, this.f83587e);
        }
    }

    /* JADX INFO: compiled from: ExpressionTransformEngine.java */
    public class d extends com.max.hbcustomview.spans.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f83588d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f83589e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10, String str, Context context) {
            super(i10);
            this.f83588d = str;
            this.f83589e = context;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31480, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b("zzzzgametest", "  id==" + this.f83588d);
            com.max.xiaoheihe.base.router.b.L(this.f83589e, null, this.f83588d, null, null).A();
        }
    }

    public static void a(String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 31474, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        int iC = c();
        for (int i10 = 0; i10 < mc.a.c().length; i10++) {
            if (mc.a.c()[i10] == str || i10 == mc.a.c().length - 1) {
                e(i10, str);
                return;
            }
        }
        e(iC, str);
    }

    public static void b(EditText editText) {
        if (PatchProxy.proxy(new Object[]{editText}, null, changeQuickRedirect, true, 31473, new Class[]{EditText.class}, Void.TYPE).isSupported) {
            return;
        }
        editText.dispatchKeyEvent(new KeyEvent(0L, 0L, 0, 67, 0, 0, 0, 0, 6));
    }

    private static int c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 31476, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        for (int i10 = 0; i10 < mc.a.c().length; i10++) {
            if (mc.a.c()[i10] == null || i10 == mc.a.c().length - 1) {
                return i10;
            }
        }
        return 0;
    }

    public static void d(EditText editText, String str) {
        if (PatchProxy.proxy(new Object[]{editText, str}, null, changeQuickRedirect, true, 31472, new Class[]{EditText.class, String.class}, Void.TYPE).isSupported || editText == null || str == null) {
            return;
        }
        editText.getText().toString();
        int selectionStart = editText.getSelectionStart();
        int selectionEnd = editText.getSelectionEnd();
        if (selectionStart < 0) {
            editText.append(str);
        } else {
            editText.getText().replace(Math.min(selectionStart, selectionEnd), Math.max(selectionStart, selectionEnd), str, 0, str.length());
        }
    }

    private static void e(int i10, String str) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), str}, null, changeQuickRedirect, true, 31475, new Class[]{Integer.TYPE, String.class}, Void.TYPE).isSupported) {
            return;
        }
        while (i10 > 0) {
            mc.a.c()[i10] = mc.a.c()[i10 - 1];
            i10--;
        }
        mc.a.c()[0] = str;
    }

    public static Spannable f(Context context, Spannable spannable, int i10, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, spannable, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 31470, new Class[]{Context.class, Spannable.class, Integer.TYPE, Boolean.TYPE}, Spannable.class);
        return patchProxyResultProxy.isSupported ? (Spannable) patchProxyResultProxy.result : g(context, spannable, i10, z10, true, true, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v27, types: [android.text.SpannableStringBuilder, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v28, types: [android.text.SpannableStringBuilder, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.text.SpannableStringBuilder, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.regex.Pattern] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.util.regex.Pattern] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.util.regex.Pattern] */
    /* JADX WARN: Type inference failed for: r8v18 */
    public static Spannable g(Context context, Spannable spannable, int i10, boolean z10, boolean z11, boolean z12, boolean z13, TextView textView) {
        int i11;
        ?? r10;
        Pattern pattern;
        SpannableStringBuilder spannableStringBuilder;
        int i12;
        Matcher matcher;
        ?? r11 = spannable;
        int i13 = 2;
        ?? r12 = {context, r11, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0), new Byte(z13 ? (byte) 1 : (byte) 0), textView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(r12, null, changeQuickRedirect2, true, 31471, new Class[]{Context.class, Spannable.class, Integer.TYPE, cls, cls, cls, cls, TextView.class}, Spannable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Spannable) patchProxyResultProxy.result;
        }
        new mc.b(context, r11, i10).a();
        if (z10) {
            r11 = (SpannableStringBuilder) r11;
            ?? Compile = Pattern.compile("(<a.?data-user-id=\\\"(.*?)\\\".*?>(.*?)</a>)");
            Matcher matcher2 = Compile.matcher(r11);
            while (matcher2.find()) {
                String strGroup = matcher2.group(3);
                String strGroup2 = matcher2.group(i13);
                r11.replace(matcher2.start(), matcher2.end(), strGroup + " ");
                if (z13) {
                    r11.setSpan(new C0733a(context.getResources().getColor(R.color.click_blue), context, strGroup2), matcher2.start(), matcher2.start() + strGroup.length(), 33);
                }
                matcher2 = Compile.matcher(r11);
                i13 = 2;
            }
        }
        if (z11) {
            r11 = (SpannableStringBuilder) r11;
            ?? Compile2 = Pattern.compile("(<a.*?data-urls=\\\"(.*?)\\\".*?>(.*?)</a>)");
            for (Matcher matcher3 = Compile2.matcher(r11); matcher3.find(); matcher3 = Compile2.matcher(r11)) {
                String str = "图" + matcher3.group(3);
                String strGroup3 = matcher3.group(2);
                r11.replace(matcher3.start(), matcher3.end(), str);
                Drawable drawable = context.getResources().getDrawable(R.drawable.ic_0icon_format_pic_16);
                drawable.setColorFilter(context.getResources().getColor(R.color.click_blue), PorterDuff.Mode.SRC_IN);
                drawable.setBounds(0, 0, ViewUtils.f(context, 16.0f), ViewUtils.f(context, 16.0f));
                r11.setSpan(new com.max.hbcustomview.spans.b(drawable, 0), matcher3.start(), matcher3.start() + 1, 33);
                r11.setSpan(new b(context.getResources().getColor(R.color.click_blue), strGroup3, context), matcher3.start() + 1, matcher3.start() + str.length(), 33);
            }
        }
        int i14 = 0;
        if (z12) {
            SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) r11;
            Pattern patternCompile = Pattern.compile(f83581a);
            Matcher matcher4 = patternCompile.matcher(spannableStringBuilder2);
            while (matcher4.find()) {
                Map<String, String> mapE = AccelWorldStringKt.e(matcher4.group(1));
                if ("text".equals(mapE.get("data-link-type"))) {
                    String str2 = mapE.get("href");
                    String str3 = mapE.get("icon-url");
                    String str4 = "图" + matcher4.group(2);
                    spannableStringBuilder2.replace(matcher4.start(), matcher4.end(), (CharSequence) str4);
                    int iF = ViewUtils.f(context, 3.0f);
                    if (com.max.hbcommon.utils.c.u(str3) || textView == null) {
                        matcher = matcher4;
                        spannableStringBuilder = spannableStringBuilder2;
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.common_article);
                        drawable2.setColorFilter(context.getResources().getColor(R.color.click_blue), PorterDuff.Mode.SRC_IN);
                        i12 = 0;
                        drawable2.setBounds(0, 0, ViewUtils.f(context, 13.0f), ViewUtils.f(context, 13.0f));
                        spannableStringBuilder.setSpan(new com.max.hbcustomview.spans.b(drawable2, 0, 0, iF), matcher.start(), matcher.start() + 1, 33);
                    } else {
                        int iF2 = ViewUtils.f(context, 14.0f);
                        matcher = matcher4;
                        spannableStringBuilder = spannableStringBuilder2;
                        spannableStringBuilder.setSpan(new AsyncCenterImageSpan(context, str3, textView, iF2, iF2, 0, iF, 0, 0), matcher.start(), matcher.start() + 1, 33);
                        i12 = 0;
                    }
                    spannableStringBuilder.setSpan(new c(context.getResources().getColor(R.color.click_blue), context, str2), matcher.start() + 1, matcher.start() + str4.length(), 33);
                    pattern = patternCompile;
                    matcher4 = pattern.matcher(spannableStringBuilder);
                } else {
                    pattern = patternCompile;
                    spannableStringBuilder = spannableStringBuilder2;
                    i12 = i14;
                }
                patternCompile = pattern;
                i14 = i12;
                spannableStringBuilder2 = spannableStringBuilder;
            }
            i11 = i14;
            r10 = spannableStringBuilder2;
        } else {
            i11 = 0;
        }
        if (z12) {
            r10 = r11;
            r10 = (SpannableStringBuilder) r10;
            ?? Compile3 = Pattern.compile(mc.d.f131848a);
            for (Matcher matcher5 = Compile3.matcher(r10); matcher5.find(); matcher5 = Compile3.matcher(r10)) {
                String str5 = lb.b.f131099o + matcher5.group(4) + lb.b.f131099o;
                String strGroup4 = matcher5.group(2);
                r10.replace(matcher5.start(), matcher5.end(), str5);
                Drawable drawableMutate = context.getResources().getDrawable(R.drawable.bbs_game_filled_24x24).getConstantState().newDrawable().mutate();
                drawableMutate.setColorFilter(context.getResources().getColor(R.color.click_blue), PorterDuff.Mode.SRC_IN);
                drawableMutate.setBounds(i11, i11, ViewUtils.f(context, 16.0f), ViewUtils.f(context, 16.0f));
                r10.setSpan(new com.max.hbcustomview.spans.b(drawableMutate, i11, ViewUtils.f(context, 4.0f), ViewUtils.f(context, 4.0f)), matcher5.start(), matcher5.start() + 1, 33);
                Drawable drawableMutate2 = context.getResources().getDrawable(R.color.transparent).getConstantState().newDrawable().mutate();
                drawableMutate2.setBounds(i11, i11, ViewUtils.f(context, 4.0f), ViewUtils.f(context, 4.0f));
                r10.setSpan(new com.max.hbcustomview.spans.b(drawableMutate2, 2), (matcher5.start() + str5.length()) - 1, matcher5.start() + str5.length(), 33);
                r10.setSpan(new d(context.getResources().getColor(R.color.click_blue), strGroup4, context), matcher5.start() + 1, (matcher5.start() + str5.length()) - 1, 33);
            }
        }
        r10 = r11;
        return r10;
    }
}
