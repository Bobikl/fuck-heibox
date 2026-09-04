package com.max.hbuikit.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import bb.c;
import com.max.hbcommon.utils.l;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.hbcustomview.f;
import com.max.hbcustomview.spans.g;
import com.max.hbuikit.R;
import com.max.hbuikit.bean.UiKitCardObj;
import com.max.hbuikit.bean.UiKitImageObj;
import com.max.hbuikit.bean.UiKitLayoutObj;
import com.max.hbuikit.bean.UiKitLinearObj;
import com.max.hbuikit.bean.UiKitTextObj;
import com.max.hbuikit.bean.UiKitViewObj;
import com.max.hbuikit.bean.param.UiKitBackgroundGradientObj;
import com.max.hbuikit.bean.param.UiKitBackgroundObj;
import com.max.hbuikit.bean.param.UiKitBackgroundStrokeObj;
import com.max.hbuikit.bean.param.UiKitMargin;
import com.max.hbuikit.bean.param.UiKitPadding;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.max.hbutils.core.BaseApplication;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.model.RemoteTextRenderInfo;
import com.starlightc.ucropplus.model.TextRenderInfo;
import com.starlightc.ucropplus.view.TextRenderPreview;
import com.xiaomi.mipush.sdk.Constants;
import dl.d;
import dl.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.c1;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.s0;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.reflect.full.KClasses;
import kotlin.reflect.j;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.s;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.r0;
import xh.m;

/* JADX INFO: compiled from: UiKitUtil.kt */
/* JADX INFO: loaded from: classes13.dex */
@t0({"SMAP\nUiKitUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UiKitUtil.kt\ncom/max/hbuikit/utils/UiKitUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,683:1\n571#1,4:684\n575#1,3:699\n578#1,4:703\n583#1,6:708\n589#1,4:715\n593#1,5:720\n800#2,11:688\n1855#2:702\n1856#2:707\n1855#2:714\n1856#2:719\n800#2,11:725\n1855#2,2:736\n800#2,11:738\n1855#2,2:749\n*S KotlinDebug\n*F\n+ 1 UiKitUtil.kt\ncom/max/hbuikit/utils/UiKitUtil\n*L\n545#1:684,4\n545#1:699,3\n545#1:703,4\n545#1:708,6\n545#1:715,4\n545#1:720,5\n545#1:688,11\n545#1:702\n545#1:707\n545#1:714\n545#1:719\n574#1:725,11\n577#1:736,2\n585#1:738,11\n588#1:749,2\n*E\n"})
public final class UiKitUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final UiKitUtil f73232a = new UiKitUtil();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private static final HashMap<kotlin.reflect.d<?>, List<j<?>>> f73233b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private static final HashMap<kotlin.reflect.d<?>, List<j<?>>> f73234c = new HashMap<>();
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: UiKitUtil.kt */
    public static abstract class Operator {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ Operator[] $VALUES;

        @d
        public static final a Companion;
        public static ChangeQuickRedirect changeQuickRedirect;

        @d
        private final String symbol;
        public static final Operator ADD = new ADD("ADD", 0);
        public static final Operator SUBTRACT = new SUBTRACT("SUBTRACT", 1);
        public static final Operator MULTIPLY = new MULTIPLY("MULTIPLY", 2);
        public static final Operator DIVIDE = new DIVIDE("DIVIDE", 3);

        /* JADX INFO: compiled from: UiKitUtil.kt */
        public static final class ADD extends Operator {
            public static ChangeQuickRedirect changeQuickRedirect;

            ADD(String str, int i10) {
                super(str, i10, "+", null);
            }

            @Override // com.max.hbuikit.utils.UiKitUtil.Operator
            public double apply(double d10, double d11) {
                return d10 + d11;
            }
        }

        /* JADX INFO: compiled from: UiKitUtil.kt */
        public static final class DIVIDE extends Operator {
            public static ChangeQuickRedirect changeQuickRedirect;

            DIVIDE(String str, int i10) {
                super(str, i10, "/", null);
            }

            @Override // com.max.hbuikit.utils.UiKitUtil.Operator
            public double apply(double d10, double d11) {
                return d10 / d11;
            }
        }

        /* JADX INFO: compiled from: UiKitUtil.kt */
        public static final class MULTIPLY extends Operator {
            public static ChangeQuickRedirect changeQuickRedirect;

            MULTIPLY(String str, int i10) {
                super(str, i10, androidx.webkit.b.f28327e, null);
            }

            @Override // com.max.hbuikit.utils.UiKitUtil.Operator
            public double apply(double d10, double d11) {
                return d10 * d11;
            }
        }

        /* JADX INFO: compiled from: UiKitUtil.kt */
        public static final class SUBTRACT extends Operator {
            public static ChangeQuickRedirect changeQuickRedirect;

            SUBTRACT(String str, int i10) {
                super(str, i10, Constants.ACCEPT_TIME_SEPARATOR_SERVER, null);
            }

            @Override // com.max.hbuikit.utils.UiKitUtil.Operator
            public double apply(double d10, double d11) {
                return d10 - d11;
            }
        }

        /* JADX INFO: compiled from: UiKitUtil.kt */
        @t0({"SMAP\nUiKitUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UiKitUtil.kt\ncom/max/hbuikit/utils/UiKitUtil$Operator$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,683:1\n1#2:684\n*E\n"})
        public static final class a {
            public static ChangeQuickRedirect changeQuickRedirect;

            private a() {
            }

            public /* synthetic */ a(u uVar) {
                this();
            }

            @e
            public final Operator a(@d String symbol) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{symbol}, this, changeQuickRedirect, false, c.k.pm, new Class[]{String.class}, Operator.class);
                if (patchProxyResultProxy.isSupported) {
                    return (Operator) patchProxyResultProxy.result;
                }
                f0.p(symbol, "symbol");
                for (Operator operator : Operator.values()) {
                    if (f0.g(operator.getSymbol(), symbol)) {
                        return operator;
                    }
                }
                return null;
            }
        }

        private static final /* synthetic */ Operator[] $values() {
            return new Operator[]{ADD, SUBTRACT, MULTIPLY, DIVIDE};
        }

        static {
            Operator[] operatorArr$values = $values();
            $VALUES = operatorArr$values;
            $ENTRIES = EnumEntriesKt.b(operatorArr$values);
            Companion = new a(null);
        }

        private Operator(String str, int i10, String str2) {
            super(str, i10);
            this.symbol = str2;
        }

        public /* synthetic */ Operator(String str, int i10, String str2, u uVar) {
            this(str, i10, str2);
        }

        @d
        public static kotlin.enums.a<Operator> getEntries() {
            return $ENTRIES;
        }

        public static Operator valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.k.om, new Class[]{String.class}, Operator.class);
            return (Operator) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(Operator.class, str));
        }

        public static Operator[] values() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.k.nm, new Class[0], Operator[].class);
            return (Operator[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : $VALUES.clone());
        }

        public abstract double apply(double d10, double d11);

        @d
        public final String getSymbol() {
            return this.symbol;
        }
    }

    /* JADX INFO: compiled from: UiKitUtil.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @d
        public static final a f73235a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f73236b = ViewUtils.L(BaseApplication.a());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f73237c = ViewUtils.J(BaseApplication.a());
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public final int a() {
            return f73237c;
        }

        public final int b() {
            return f73236b;
        }
    }

    /* JADX INFO: compiled from: UiKitUtil.kt */
    public static final class b extends com.max.hbcustomview.spans.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ UiKitSpanObj f73238d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f73239e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Ref.IntRef intRef, UiKitSpanObj uiKitSpanObj, Context context) {
            super(intRef.f124889b);
            this.f73238d = uiKitSpanObj;
            this.f73239e = context;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@d View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, c.k.vm, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(view, "view");
            String click_action = this.f73238d.getClick_action();
            if (click_action != null) {
                ob.a.p().c(this.f73239e, click_action);
            }
        }
    }

    private UiKitUtil() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:138:0x02d7  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @e
    @m
    public static final HBLineHeightTextView B(@d Context context, @e HBLineHeightTextView hBLineHeightTextView, @e UiKitTextObj uiKitTextObj) {
        int iG;
        int iG2;
        String str;
        UiKitBackgroundStrokeObj background_stroke;
        UiKitBackgroundStrokeObj background_stroke2;
        UiKitBackgroundGradientObj background_gradient;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, hBLineHeightTextView, uiKitTextObj}, null, changeQuickRedirect, true, c.k.Ul, new Class[]{Context.class, HBLineHeightTextView.class, UiKitTextObj.class}, HBLineHeightTextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (HBLineHeightTextView) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        if (hBLineHeightTextView != null && uiKitTextObj != null) {
            v(context, hBLineHeightTextView, uiKitTextObj);
            String line_height = uiKitTextObj.getLine_height();
            if (line_height != null) {
                hBLineHeightTextView.setCustomLineHeight(ViewUtils.f(context, n.p(line_height)));
            }
            hBLineHeightTextView.setTextColor(l.g(uiKitTextObj.getText_color()));
            hBLineHeightTextView.setTextSize(1, n.p(uiKitTextObj.getText_size()));
            hBLineHeightTextView.setMovementMethod(LinkMovementMethod.getInstance());
            String text = uiKitTextObj.getText();
            if (text == null) {
                text = "";
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
            Boolean show_underline = uiKitTextObj.getShow_underline();
            Boolean bool = Boolean.TRUE;
            if (f0.g(show_underline, bool)) {
                UnderlineSpan underlineSpan = new UnderlineSpan();
                String text2 = uiKitTextObj.getText();
                spannableStringBuilder.setSpan(underlineSpan, 0, text2 != null ? text2.length() : 0, 17);
            }
            if (f0.g(uiKitTextObj.getShow_strike(), bool)) {
                StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
                String text3 = uiKitTextObj.getText();
                spannableStringBuilder.setSpan(strikethroughSpan, 0, text3 != null ? text3.length() : 0, 17);
            }
            hBLineHeightTextView.setTypeface(m(uiKitTextObj.getFont_name(), uiKitTextObj.getBold()));
            List<UiKitSpanObj> span_list = uiKitTextObj.getSpan_list();
            TextUtils.TruncateAt truncateAt = null;
            if (span_list != null) {
                for (UiKitSpanObj uiKitSpanObj : span_list) {
                    int iQ = n.q(uiKitSpanObj.getStart());
                    int iQ2 = n.q(uiKitSpanObj.getEnd());
                    Ref.IntRef intRef = new Ref.IntRef();
                    intRef.f124889b = l.g(uiKitTextObj.getText_color());
                    int iQ3 = n.q(uiKitTextObj.getText_size());
                    if (uiKitSpanObj.getText_color() != null) {
                        intRef.f124889b = l.g(uiKitSpanObj.getText_color());
                    }
                    if (uiKitSpanObj.getText_size() != null) {
                        iQ3 = n.q(uiKitSpanObj.getText_size());
                    }
                    if (uiKitSpanObj.getBackground() == null) {
                        if (uiKitSpanObj.getText_color() != null) {
                            spannableStringBuilder.setSpan(new b(intRef, uiKitSpanObj, context), iQ, iQ2, 17);
                        }
                        if (uiKitSpanObj.getText_size() != null) {
                            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(iQ3, true), iQ, iQ2, 17);
                        }
                        if (uiKitSpanObj.getFont_name() != null) {
                            String font_name = uiKitSpanObj.getFont_name();
                            Boolean bold = uiKitSpanObj.getBold();
                            spannableStringBuilder.setSpan(new g(m(font_name, bold != null ? bold.booleanValue() : false)), iQ, iQ2, 17);
                        }
                    } else if (uiKitSpanObj.getBackground() != null) {
                        UiKitBackgroundObj background = uiKitSpanObj.getBackground();
                        int iG3 = l.g(background != null ? background.getBackground_color() : null);
                        UiKitBackgroundObj background2 = uiKitSpanObj.getBackground();
                        if (background2 == null || (background_gradient = background2.getBackground_gradient()) == null) {
                            iG = iG3;
                            iG2 = iG;
                        } else {
                            iG = l.g(background_gradient.getBackground_color_start());
                            iG2 = l.g(background_gradient.getBackground_color_end());
                        }
                        UiKitBackgroundObj background3 = uiKitSpanObj.getBackground();
                        int iF = ViewUtils.f(context, n.p(background3 != null ? background3.getBackground_corner_radius() : null));
                        String text4 = uiKitTextObj.getText();
                        if (text4 != null) {
                            String strSubstring = text4.substring(iQ, iQ2);
                            f0.o(strSubstring, "substring(...)");
                            str = strSubstring;
                        } else {
                            str = null;
                        }
                        float f10 = ViewUtils.f(context, iQ3);
                        int i10 = intRef.f124889b;
                        UiKitPadding padding = uiKitSpanObj.getPadding();
                        int iLeftPx = padding != null ? padding.leftPx() : 0;
                        UiKitPadding padding2 = uiKitSpanObj.getPadding();
                        int i11 = padding2 != null ? padding2.topPx() : 0;
                        UiKitPadding padding3 = uiKitSpanObj.getPadding();
                        int iRightPx = padding3 != null ? padding3.rightPx() : 0;
                        UiKitPadding padding4 = uiKitSpanObj.getPadding();
                        int iBottomPx = padding4 != null ? padding4.bottomPx() : 0;
                        UiKitBackgroundObj background4 = uiKitSpanObj.getBackground();
                        int iG4 = l.g((background4 == null || (background_stroke2 = background4.getBackground_stroke()) == null) ? null : background_stroke2.getColor());
                        UiKitBackgroundObj background5 = uiKitSpanObj.getBackground();
                        f fVar = new f(str, f10, i10, iG, iG2, iF, iLeftPx, i11, iRightPx, iBottomPx, iG4, ViewUtils.f(context, n.p((background5 == null || (background_stroke = background5.getBackground_stroke()) == null) ? null : background_stroke.getWidth())));
                        UiKitMargin margin = uiKitSpanObj.getMargin();
                        int iLeftPx2 = margin != null ? margin.leftPx() : 0;
                        UiKitMargin margin2 = uiKitSpanObj.getMargin();
                        int iRightPx2 = margin2 != null ? margin2.rightPx() : 0;
                        UiKitMargin margin3 = uiKitSpanObj.getMargin();
                        int i12 = margin3 != null ? margin3.topPx() : 0;
                        UiKitMargin margin4 = uiKitSpanObj.getMargin();
                        spannableStringBuilder.setSpan(new com.max.hbcustomview.spans.b(fVar, 0, iLeftPx2, iRightPx2, i12, margin4 != null ? margin4.bottomPx() : 0), iQ, iQ2, 17);
                    }
                }
            }
            hBLineHeightTextView.setText(spannableStringBuilder);
            String max_lines = uiKitTextObj.getMax_lines();
            if (max_lines != null) {
                hBLineHeightTextView.setMaxLines(n.q(max_lines));
            }
            String ellipsize = uiKitTextObj.getEllipsize();
            if (ellipsize != null) {
                switch (ellipsize.hashCode()) {
                    case 48:
                        if (!ellipsize.equals("0")) {
                            truncateAt = TextUtils.TruncateAt.END;
                        }
                        break;
                    case 49:
                        if (ellipsize.equals("1")) {
                            truncateAt = TextUtils.TruncateAt.START;
                        } else {
                            truncateAt = TextUtils.TruncateAt.END;
                        }
                        break;
                    case 50:
                        if (ellipsize.equals("2")) {
                            truncateAt = TextUtils.TruncateAt.MIDDLE;
                        } else {
                            truncateAt = TextUtils.TruncateAt.END;
                        }
                        break;
                    default:
                        truncateAt = TextUtils.TruncateAt.END;
                        break;
                }
                hBLineHeightTextView.setEllipsize(truncateAt);
            }
            String gravity = uiKitTextObj.getGravity();
            if (gravity != null) {
                hBLineHeightTextView.setGravity(l(gravity));
            }
            String max_width = uiKitTextObj.getMax_width();
            if (max_width != null) {
                hBLineHeightTextView.setMaxWidth(ViewUtils.f(context, n.p(max_width)));
            }
            String max_height = uiKitTextObj.getMax_height();
            if (max_height != null) {
                hBLineHeightTextView.setMaxHeight(ViewUtils.f(context, n.p(max_height)));
            }
            String min_width = uiKitTextObj.getMin_width();
            if (min_width != null) {
                hBLineHeightTextView.setMinWidth(ViewUtils.f(context, n.p(min_width)));
            }
            String min_height = uiKitTextObj.getMin_height();
            if (min_height != null) {
                hBLineHeightTextView.setMinHeight(ViewUtils.f(context, n.p(min_height)));
            }
        }
        return hBLineHeightTextView;
    }

    @e
    @m
    public static final Drawable d(@d Context context, @e UiKitBackgroundObj uiKitBackgroundObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, uiKitBackgroundObj}, null, changeQuickRedirect, true, c.k.Sl, new Class[]{Context.class, UiKitBackgroundObj.class}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        if (uiKitBackgroundObj == null) {
            return null;
        }
        float fP = n.p(uiKitBackgroundObj.getBackground_corner_radius());
        GradientDrawable gradientDrawableE = ViewUtils.E(ViewUtils.f(context, fP), context.getResources().getColor(R.color.transparent));
        UiKitBackgroundGradientObj background_gradient = uiKitBackgroundObj.getBackground_gradient();
        if (background_gradient != null) {
            gradientDrawableE = ViewUtils.w(ViewUtils.f(context, fP), l.g(background_gradient.getBackground_color_start()), l.g(background_gradient.getBackground_color_end()), g(background_gradient.getBackground_color_orientation()));
        }
        String background_color = uiKitBackgroundObj.getBackground_color();
        if (background_color != null) {
            gradientDrawableE = ViewUtils.E(ViewUtils.f(context, fP), l.g(background_color));
        }
        UiKitBackgroundStrokeObj background_stroke = uiKitBackgroundObj.getBackground_stroke();
        if (background_stroke != null) {
            f0.n(gradientDrawableE, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            q.O(gradientDrawableE, context, l.g(background_stroke.getColor()), n.p(background_stroke.getWidth()));
        }
        String pressed_color = uiKitBackgroundObj.getPressed_color();
        if (pressed_color == null) {
            return gradientDrawableE;
        }
        f0.n(gradientDrawableE, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        return ViewUtils.F(gradientDrawableE, ViewUtils.f(context, fP), l.g(pressed_color));
    }

    @d
    public static final HashMap<kotlin.reflect.d<?>, List<j<?>>> e() {
        return f73234c;
    }

    @m
    public static /* synthetic */ void f() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @d
    @m
    public static final GradientDrawable.Orientation g(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.k.em, new Class[]{String.class}, GradientDrawable.Orientation.class);
        if (patchProxyResultProxy.isSupported) {
            return (GradientDrawable.Orientation) patchProxyResultProxy.result;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case 49:
                    if (str.equals("1")) {
                        return GradientDrawable.Orientation.TL_BR;
                    }
                    break;
                case 50:
                    if (str.equals("2")) {
                        return GradientDrawable.Orientation.TOP_BOTTOM;
                    }
                    break;
                case 51:
                    if (str.equals("3")) {
                        return GradientDrawable.Orientation.TR_BL;
                    }
                    break;
                case 52:
                    if (str.equals("4")) {
                        return GradientDrawable.Orientation.RIGHT_LEFT;
                    }
                    break;
                case 53:
                    if (str.equals("5")) {
                        return GradientDrawable.Orientation.BR_TL;
                    }
                    break;
                case 54:
                    if (str.equals("6")) {
                        return GradientDrawable.Orientation.BOTTOM_TOP;
                    }
                    break;
                case 55:
                    if (str.equals("7")) {
                        return GradientDrawable.Orientation.BL_TR;
                    }
                    break;
            }
        }
        return GradientDrawable.Orientation.LEFT_RIGHT;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @m
    public static final int h(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.k.dm, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (str != null) {
            switch (str.hashCode()) {
                case 49:
                    if (str.equals("1")) {
                        return 49;
                    }
                    break;
                case 50:
                    if (str.equals("2")) {
                        return 53;
                    }
                    break;
                case 51:
                    if (str.equals("3")) {
                        return 19;
                    }
                    break;
                case 52:
                    if (str.equals("4")) {
                        return 17;
                    }
                    break;
                case 53:
                    if (str.equals("5")) {
                        return 21;
                    }
                    break;
                case 54:
                    if (str.equals("6")) {
                        return 83;
                    }
                    break;
                case 55:
                    if (str.equals("7")) {
                        return 81;
                    }
                    break;
                case 56:
                    if (str.equals("8")) {
                        return 85;
                    }
                    break;
            }
        }
        return 51;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @d
    @m
    public static final ImageView.ScaleType i(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.k.fm, new Class[]{String.class}, ImageView.ScaleType.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView.ScaleType) patchProxyResultProxy.result;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -2021672893:
                    if (str.equals("fit_center")) {
                        return ImageView.ScaleType.FIT_CENTER;
                    }
                    break;
                case -1364013995:
                    if (str.equals(com.google.android.exoplayer2.text.ttml.d.f49794m0)) {
                        return ImageView.ScaleType.CENTER;
                    }
                    break;
                case -1274273297:
                    if (str.equals("fit_xy")) {
                        return ImageView.ScaleType.FIT_XY;
                    }
                    break;
                case -1081239615:
                    if (str.equals("matrix")) {
                        return ImageView.ScaleType.MATRIX;
                    }
                    break;
                case -847785043:
                    if (str.equals("fit_end")) {
                        return ImageView.ScaleType.FIT_END;
                    }
                    break;
                case 225732390:
                    if (str.equals("center_inside")) {
                        return ImageView.ScaleType.CENTER_INSIDE;
                    }
                    break;
                case 1335468724:
                    if (str.equals("fit_start")) {
                        return ImageView.ScaleType.FIT_START;
                    }
                    break;
            }
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    @d
    public static final HashMap<kotlin.reflect.d<?>, List<j<?>>> j() {
        return f73233b;
    }

    @m
    public static /* synthetic */ void k() {
    }

    @m
    public static final int l(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.k.cm, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (f0.g(str, "1")) {
            return 17;
        }
        return f0.g(str, "2") ? 21 : 19;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @d
    @m
    public static final Typeface m(@e String str, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, c.k.Wl, new Class[]{String.class, Boolean.TYPE}, Typeface.class);
        if (patchProxyResultProxy.isSupported) {
            return (Typeface) patchProxyResultProxy.result;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -2100942490:
                    if (str.equals("Impact")) {
                        Typeface typefaceB = bb.d.a().b(1);
                        f0.m(typefaceB);
                        return typefaceB;
                    }
                    break;
                case -1457787660:
                    if (str.equals("FontAwesome")) {
                        Typeface typefaceB2 = bb.d.a().b(0);
                        f0.m(typefaceB2);
                        return typefaceB2;
                    }
                    break;
                case -1273197556:
                    if (str.equals("PingFangSC-Medium")) {
                        Typeface typefaceA = com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c);
                        if (typefaceA == null) {
                            typefaceA = Typeface.DEFAULT;
                        }
                        f0.m(typefaceA);
                        return typefaceA;
                    }
                    break;
                case -923889023:
                    if (str.equals("Helvetica-Bold")) {
                        Typeface typefaceB3 = bb.d.a().b(5);
                        f0.m(typefaceB3);
                        return typefaceB3;
                    }
                    break;
                case -816292751:
                    if (str.equals("Helvetica")) {
                        Typeface typefaceB4 = bb.d.a().b(2);
                        f0.m(typefaceB4);
                        return typefaceB4;
                    }
                    break;
                case 1823760468:
                    if (str.equals("DINCondensed-Bold")) {
                        Typeface typefaceB5 = bb.d.a().b(3);
                        f0.m(typefaceB5);
                        return typefaceB5;
                    }
                    break;
                case 2129464019:
                    if (str.equals("ALIBABA Font")) {
                        Typeface typefaceB6 = bb.d.a().b(4);
                        f0.m(typefaceB6);
                        return typefaceB6;
                    }
                    break;
            }
        }
        Typeface typefaceA2 = com.max.hbresource.a.f71893a.a(z10 ? com.max.hbresource.a.f71895c : com.max.hbresource.a.f71894b);
        if (typefaceA2 == null) {
            typefaceA2 = Typeface.DEFAULT;
        }
        f0.m(typefaceA2);
        return typefaceA2;
    }

    public static /* synthetic */ Typeface n(String str, boolean z10, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, c.k.Xl, new Class[]{String.class, Boolean.TYPE, Integer.TYPE, Object.class}, Typeface.class);
        if (patchProxyResultProxy.isSupported) {
            return (Typeface) patchProxyResultProxy.result;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m(str, z10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    @e
    @m
    public static final ViewGroup.MarginLayoutParams o(@d Context context, @e UiKitViewObj uiKitViewObj) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, uiKitViewObj}, null, changeQuickRedirect, true, c.k.Tl, new Class[]{Context.class, UiKitViewObj.class}, ViewGroup.MarginLayoutParams.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewGroup.MarginLayoutParams) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        if (uiKitViewObj == null) {
            return null;
        }
        int widthPx = uiKitViewObj.getWidthPx();
        int heightPx = uiKitViewObj.getHeightPx();
        String parent_type = uiKitViewObj.getParent_type();
        if (parent_type != null) {
            switch (parent_type) {
                case "linear":
                    marginLayoutParams = new LinearLayout.LayoutParams(widthPx, heightPx);
                    break;
                case "scroll":
                    marginLayoutParams = new FrameLayout.LayoutParams(widthPx, heightPx);
                    break;
                case "relative":
                    marginLayoutParams = new RelativeLayout.LayoutParams(widthPx, heightPx);
                    break;
                case "card":
                    marginLayoutParams = new FrameLayout.LayoutParams(widthPx, heightPx);
                    break;
                default:
                    marginLayoutParams = new ViewGroup.MarginLayoutParams(widthPx, heightPx);
                    break;
            }
        } else {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(widthPx, heightPx);
        }
        UiKitMargin margin = uiKitViewObj.getMargin();
        marginLayoutParams.leftMargin = margin != null ? margin.leftPx() : 0;
        UiKitMargin margin2 = uiKitViewObj.getMargin();
        marginLayoutParams.topMargin = margin2 != null ? margin2.topPx() : 0;
        UiKitMargin margin3 = uiKitViewObj.getMargin();
        marginLayoutParams.rightMargin = margin3 != null ? margin3.rightPx() : 0;
        UiKitMargin margin4 = uiKitViewObj.getMargin();
        marginLayoutParams.bottomMargin = margin4 != null ? margin4.bottomPx() : 0;
        return marginLayoutParams;
    }

    @m
    public static final int p(float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, null, changeQuickRedirect, true, c.k.Ql, new Class[]{Float.TYPE}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int i10 = (int) f10;
        if (i10 == -1) {
            return -2;
        }
        if (i10 == -2) {
            return -1;
        }
        return ViewUtils.f(BaseApplication.a(), f10);
    }

    @m
    public static final /* synthetic */ <T> T q(T a10, T b10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{a10, b10}, null, changeQuickRedirect, true, c.k.im, new Class[]{Object.class, Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return (T) patchProxyResultProxy.result;
        }
        f0.p(a10, "a");
        f0.p(b10, "b");
        try {
            List<j> list = e().get(n0.d(a10.getClass()));
            if (list == null) {
                Collection collectionV = KClasses.v(n0.d(a10.getClass()));
                ArrayList arrayList = new ArrayList();
                for (T t10 : collectionV) {
                    if (t10 instanceof j) {
                        arrayList.add(t10);
                    }
                }
                e().put(n0.d(a10.getClass()), arrayList);
                list = arrayList;
            }
            for (j jVar : list) {
                kotlin.reflect.jvm.b.b(jVar, true);
                Object objCall = jVar.getGetter().call(a10);
                if (objCall == null) {
                    objCall = jVar.getGetter().call(b10);
                }
                jVar.getSetter().call(b10, objCall);
            }
            List<j> list2 = j().get(n0.d(a10.getClass()));
            if (list2 == null) {
                Collection collectionJ = KClasses.J(n0.d(a10.getClass()));
                ArrayList arrayList2 = new ArrayList();
                for (T t11 : collectionJ) {
                    if (t11 instanceof j) {
                        arrayList2.add(t11);
                    }
                }
                j().put(n0.d(a10.getClass()), arrayList2);
                list2 = arrayList2;
            }
            for (j jVar2 : list2) {
                kotlin.reflect.jvm.b.b(jVar2, true);
                Object objCall2 = jVar2.getGetter().call(a10);
                if (objCall2 == null) {
                    objCall2 = jVar2.getGetter().call(b10);
                }
                jVar2.getSetter().call(b10, objCall2);
            }
        } catch (Throwable th2) {
            Log.e("merge", "error " + th2.getMessage());
        }
        return b10;
    }

    @d
    @m
    public static final UiKitViewObj r(@d UiKitViewObj data) {
        List<UiKitViewObj> children;
        List<UiKitViewObj> children2;
        int i10 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{data}, null, changeQuickRedirect, true, c.k.gm, new Class[]{UiKitViewObj.class}, UiKitViewObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (UiKitViewObj) patchProxyResultProxy.result;
        }
        f0.p(data, "data");
        if (data.is_merged()) {
            return data;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        UiKitViewObj uiKitViewObjG = UiKitTemplateManager.f73221c.a().g(data.getTemplate_id());
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        Log.d("mergeData", "getTemplate  " + data.getTemplate_id() + "  " + (jCurrentTimeMillis2 - jCurrentTimeMillis));
        if (data.getTemplate_id() == null || uiKitViewObjG == null) {
            if ((data instanceof UiKitLayoutObj) && (children = ((UiKitLayoutObj) data).getChildren()) != null) {
                int size = children.size();
                while (i10 < size) {
                    children.set(i10, r(children.get(i10)));
                    i10++;
                }
            }
            data.set_merged(true);
            return data;
        }
        s(data, uiKitViewObjG);
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        Log.d("mergeData", "merge  " + data.getTemplate_id() + "  " + (jCurrentTimeMillis3 - jCurrentTimeMillis2));
        if ((uiKitViewObjG instanceof UiKitLayoutObj) && (data instanceof UiKitLayoutObj) && (children2 = ((UiKitLayoutObj) uiKitViewObjG).getChildren()) != null) {
            int size2 = children2.size();
            while (i10 < size2) {
                children2.set(i10, r(children2.get(i10)));
                i10++;
            }
        }
        Log.d("mergeData", "mergeChild  " + data.getTemplate_id() + "  " + (System.currentTimeMillis() - jCurrentTimeMillis3));
        uiKitViewObjG.set_merged(true);
        return uiKitViewObjG;
    }

    @d
    @m
    public static final UiKitViewObj s(@d UiKitViewObj sourceBean, @d UiKitViewObj targetBean) {
        List<UiKitViewObj> children;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{sourceBean, targetBean}, null, changeQuickRedirect, true, c.k.hm, new Class[]{UiKitViewObj.class, UiKitViewObj.class}, UiKitViewObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (UiKitViewObj) patchProxyResultProxy.result;
        }
        f0.p(sourceBean, "sourceBean");
        f0.p(targetBean, "targetBean");
        List<UiKitViewObj> children2 = null;
        boolean z10 = sourceBean instanceof UiKitLayoutObj;
        if (z10 && (targetBean instanceof UiKitLayoutObj)) {
            children2 = ((UiKitLayoutObj) targetBean).getChildren();
        }
        try {
            List<j> list = e().get(n0.d(sourceBean.getClass()));
            if (list == null) {
                Collection collectionV = KClasses.v(n0.d(sourceBean.getClass()));
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionV) {
                    if (obj instanceof j) {
                        arrayList.add(obj);
                    }
                }
                e().put(n0.d(sourceBean.getClass()), arrayList);
                list = arrayList;
            }
            for (j jVar : list) {
                kotlin.reflect.jvm.b.b(jVar, true);
                Object objCall = jVar.getGetter().call(sourceBean);
                if (objCall == null) {
                    objCall = jVar.getGetter().call(targetBean);
                }
                jVar.getSetter().call(targetBean, objCall);
            }
            List<j> list2 = j().get(n0.d(sourceBean.getClass()));
            if (list2 == null) {
                Collection collectionJ = KClasses.J(n0.d(sourceBean.getClass()));
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : collectionJ) {
                    if (obj2 instanceof j) {
                        arrayList2.add(obj2);
                    }
                }
                j().put(n0.d(sourceBean.getClass()), arrayList2);
                list2 = arrayList2;
            }
            for (j jVar2 : list2) {
                kotlin.reflect.jvm.b.b(jVar2, true);
                Object objCall2 = jVar2.getGetter().call(sourceBean);
                if (objCall2 == null) {
                    objCall2 = jVar2.getGetter().call(targetBean);
                }
                jVar2.getSetter().call(targetBean, objCall2);
            }
        } catch (Throwable th2) {
            Log.e("merge", "error " + th2.getMessage());
        }
        System.currentTimeMillis();
        if (z10 && (targetBean instanceof UiKitLayoutObj) && !com.max.hbcommon.utils.c.w(children2)) {
            UiKitLayoutObj uiKitLayoutObj = (UiKitLayoutObj) targetBean;
            uiKitLayoutObj.setChildren(children2);
            List<UiKitViewObj> children3 = ((UiKitLayoutObj) sourceBean).getChildren();
            if (children3 != null) {
                for (UiKitViewObj uiKitViewObj : children3) {
                    String view_id = uiKitViewObj.getView_id();
                    if (view_id != null && (children = uiKitLayoutObj.getChildren()) != null) {
                        int size = children.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            UiKitViewObj uiKitViewObj2 = children.get(i10);
                            if (f0.g(view_id, uiKitViewObj2.getView_id())) {
                                children.set(i10, s(uiKitViewObj, uiKitViewObj2));
                            }
                        }
                    }
                }
            }
        }
        return targetBean;
    }

    @e
    @m
    public static final ViewGroup u(@d Context context, @e ViewGroup viewGroup, @e UiKitLayoutObj uiKitLayoutObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, viewGroup, uiKitLayoutObj}, null, changeQuickRedirect, true, c.k.Zl, new Class[]{Context.class, ViewGroup.class, UiKitLayoutObj.class}, ViewGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewGroup) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        if (viewGroup != null && uiKitLayoutObj != null) {
            v(context, viewGroup, uiKitLayoutObj);
            viewGroup.setClipChildren(uiKitLayoutObj.getClip_child());
        }
        return viewGroup;
    }

    @e
    @m
    public static final View v(@d Context context, @e View view, @e UiKitViewObj uiKitViewObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, view, uiKitViewObj}, null, changeQuickRedirect, true, c.k.Rl, new Class[]{Context.class, View.class, UiKitViewObj.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        if (view != null && uiKitViewObj != null) {
            String view_id = uiKitViewObj.getView_id();
            if (view_id != null) {
                view.setId(com.max.hbuikit.utils.b.f73246b.a().c(view_id));
            }
            view.setLayoutParams(o(context, uiKitViewObj));
            UiKitPadding padding = uiKitViewObj.getPadding();
            int iLeftPx = padding != null ? padding.leftPx() : 0;
            UiKitPadding padding2 = uiKitViewObj.getPadding();
            int i10 = padding2 != null ? padding2.topPx() : 0;
            UiKitPadding padding3 = uiKitViewObj.getPadding();
            int iRightPx = padding3 != null ? padding3.rightPx() : 0;
            UiKitPadding padding4 = uiKitViewObj.getPadding();
            view.setPadding(iLeftPx, i10, iRightPx, padding4 != null ? padding4.bottomPx() : 0);
            String alpha = uiKitViewObj.getAlpha();
            view.setAlpha(alpha != null ? n.p(alpha) : 1.0f);
            view.setVisibility(f0.g(uiKitViewObj.getVisibility(), "0") ? 8 : 0);
            if (!(view instanceof CardView)) {
                view.setBackground(d(context, uiKitViewObj.getBackground()));
            }
            if (uiKitViewObj.getClick_action_list() != null) {
                k.f(r0.a(e1.e()), null, null, new UiKitUtil$setBaseViewParams$1$1$3(uiKitViewObj, new WeakReference(view), context, null), 3, null);
            } else {
                view.setClickable(false);
            }
        }
        return view;
    }

    @e
    @m
    public static final CardView w(@d Context context, @e CardView cardView, @e UiKitCardObj uiKitCardObj) {
        String background_color;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, cardView, uiKitCardObj}, null, changeQuickRedirect, true, c.k.bm, new Class[]{Context.class, CardView.class, UiKitCardObj.class}, CardView.class);
        if (patchProxyResultProxy.isSupported) {
            return (CardView) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        if (cardView != null) {
            cardView.setCardElevation(0.0f);
            cardView.setCardBackgroundColor(context.getResources().getColor(R.color.transparent));
            if (uiKitCardObj != null) {
                u(context, cardView, uiKitCardObj);
                UiKitBackgroundObj background = uiKitCardObj.getBackground();
                if (background != null && (background_color = background.getBackground_color()) != null) {
                    cardView.setCardBackgroundColor(l.g(background_color));
                }
                cardView.setClipToOutline(true);
                cardView.setRadius(ViewUtils.f(context, n.p(uiKitCardObj.getCorner_radius())));
            }
        }
        return cardView;
    }

    @e
    @m
    public static final ImageView x(@d Context context, @e ImageView imageView, @e UiKitImageObj uiKitImageObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, imageView, uiKitImageObj}, null, changeQuickRedirect, true, c.k.Yl, new Class[]{Context.class, ImageView.class, UiKitImageObj.class}, ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        if (imageView != null && uiKitImageObj != null) {
            v(context, imageView, uiKitImageObj);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            com.max.hbimage.b.d0(!com.max.hbcommon.utils.c.u(uiKitImageObj.getNew_image_url()) ? uiKitImageObj.getNew_image_url() : uiKitImageObj.getImage_url(), imageView, ViewUtils.f(context, n.p(uiKitImageObj.getImage_radius())));
            if (com.max.hbcommon.utils.c.u(uiKitImageObj.getImage_color())) {
                imageView.clearColorFilter();
            } else {
                imageView.setColorFilter(l.g(uiKitImageObj.getImage_color()));
            }
        }
        return imageView;
    }

    @e
    @m
    public static final LinearLayout y(@d Context context, @e LinearLayout linearLayout, @e UiKitLinearObj uiKitLinearObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, linearLayout, uiKitLinearObj}, null, changeQuickRedirect, true, c.k.am, new Class[]{Context.class, LinearLayout.class, UiKitLinearObj.class}, LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        if (linearLayout != null && uiKitLinearObj != null) {
            u(context, linearLayout, uiKitLinearObj);
            linearLayout.setOrientation(f0.g(uiKitLinearObj.getOrientation(), "1") ? 1 : 0);
            String gravity = uiKitLinearObj.getGravity();
            if (gravity != null) {
                linearLayout.setGravity(h(gravity));
            }
        }
        return linearLayout;
    }

    @m
    public static final void z(@e UiKitViewObj uiKitViewObj) {
        if (PatchProxy.proxy(new Object[]{uiKitViewObj}, null, changeQuickRedirect, true, c.k.Pl, new Class[]{UiKitViewObj.class}, Void.TYPE).isSupported || uiKitViewObj == null || !uiKitViewObj.isLayout()) {
            return;
        }
        UiKitLayoutObj uiKitLayoutObj = (UiKitLayoutObj) uiKitViewObj;
        if (com.max.hbcommon.utils.c.w(uiKitLayoutObj.getChildren())) {
            return;
        }
        List<UiKitViewObj> children = uiKitLayoutObj.getChildren();
        f0.m(children);
        for (UiKitViewObj uiKitViewObj2 : children) {
            uiKitViewObj2.setParent_type(uiKitLayoutObj.getType());
            if (uiKitViewObj2.isLayout()) {
                z(uiKitViewObj2);
            }
        }
    }

    @e
    public final TextRenderPreview A(@d Context context, @e TextRenderPreview textRenderPreview, @e UiKitTextObj uiKitTextObj) {
        TextRenderInfo textRenderInfo;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, textRenderPreview, uiKitTextObj}, this, changeQuickRedirect, false, c.k.Vl, new Class[]{Context.class, TextRenderPreview.class, UiKitTextObj.class}, TextRenderPreview.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextRenderPreview) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        if (textRenderPreview != null && uiKitTextObj != null) {
            v(context, textRenderPreview, uiKitTextObj);
            RemoteTextRenderInfo render_info = uiKitTextObj.getRender_info();
            if (render_info != null && (textRenderInfo = render_info.toTextRenderInfo()) != null) {
                String text_color = uiKitTextObj.getText_color();
                textRenderInfo.setTextColor(text_color != null ? com.max.hbutils.utils.a.d(text_color) : -1);
                textRenderInfo.setTextSize(n.p(uiKitTextObj.getText_size()));
                textRenderPreview.initWithRenderInfo(textRenderInfo);
                String text = uiKitTextObj.getText();
                if (text == null) {
                    text = "";
                }
                textRenderPreview.setSampleText(text);
                textRenderPreview.setTextSize(n.p(uiKitTextObj.getText_size()));
                textRenderPreview.setTypeface(n(uiKitTextObj.getFont_name(), false, 2, null));
            }
        }
        return textRenderPreview;
    }

    public final void a(@d String message) {
        if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, c.k.mm, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(message, "message");
        com.max.heybox.hblog.g.f74531b.v("assertionFailureAndLogError Assertion failed: " + message);
    }

    public final int b(float f10) {
        DisplayMetrics displayMetrics;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, c.k.lm, new Class[]{Float.TYPE}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Resources resources = BaseApplication.a().getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return 0;
        }
        return (int) ((f10 * displayMetrics.density) + 0.5f);
    }

    public final int c(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.k.jm, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (str == null) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        List<String> listU4 = StringsKt__StringsKt.U4(str, new String[]{" "}, false, 0, 6, null);
        a aVar = a.f73235a;
        Map mapW = s0.W(c1.a(RXScreenCaptureService.KEY_WIDTH, Double.valueOf(t(aVar.b()))), c1.a(RXScreenCaptureService.KEY_HEIGHT, Double.valueOf(t(aVar.a()))));
        for (String str2 : listU4) {
            Double dI0 = s.I0(str2);
            if (dI0 != null) {
                arrayList.add(dI0);
            } else if (mapW.containsKey(str2)) {
                Object obj = mapW.get(str2);
                f0.m(obj);
                arrayList.add(obj);
            } else {
                Operator operatorA = Operator.Companion.a(str2);
                if (operatorA == null) {
                    a("Unsupported operator " + str2);
                    return 0;
                }
                if (arrayList.size() < 2) {
                    a("Invalid postfix expression");
                    return 0;
                }
                arrayList.add(Double.valueOf(operatorA.apply(((Number) arrayList.remove(arrayList.size() - 1)).doubleValue(), ((Number) arrayList.remove(arrayList.size() - 1)).doubleValue())));
            }
        }
        Double d10 = (Double) CollectionsKt___CollectionsKt.q3(arrayList);
        if (d10 != null) {
            return b((float) d10.doubleValue());
        }
        return 0;
    }

    public final int t(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.k.km, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (int) ((i10 / BaseApplication.a().getResources().getDisplayMetrics().density) + 0.5f);
    }
}
