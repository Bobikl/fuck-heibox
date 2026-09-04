package com.max.hbcommon.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.R;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.hbutils.core.BaseApplication;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: LineListItemView.kt */
/* JADX INFO: loaded from: classes9.dex */
@kotlin.jvm.internal.t0({"SMAP\nLineListItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LineListItemView.kt\ncom/max/hbcommon/component/LineListItemView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"})
public final class LineListItemView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f67134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f67135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f67136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextView f67137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private HBLineHeightTextView f67138f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f67139g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f67140h;

    public LineListItemView(@dl.e Context context) {
        this(context, null);
    }

    public LineListItemView(@dl.e Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LineListItemView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public LineListItemView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f67134b = 4.0f;
        this.f67135c = BaseApplication.a().getResources().getColor(R.color.white_alpha40);
        this.f67136d = ViewUtils.f(BaseApplication.a(), 16.0f);
        this.f67139g = -1;
        a();
        b(attributeSet);
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Wb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TextView textView = new TextView(getContext());
        this.f67137e = textView;
        int i10 = R.id.tv_button;
        textView.setId(i10);
        int iF = ViewUtils.f(getContext(), this.f67134b);
        int iF2 = ViewUtils.f(getContext(), 8.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iF, iF);
        layoutParams.setMarginStart(iF2);
        layoutParams.setMarginEnd(iF2);
        TextView textView2 = this.f67137e;
        HBLineHeightTextView hBLineHeightTextView = null;
        if (textView2 == null) {
            kotlin.jvm.internal.f0.S("tv_point");
            textView2 = null;
        }
        textView2.setLayoutParams(layoutParams);
        TextView textView3 = this.f67137e;
        if (textView3 == null) {
            kotlin.jvm.internal.f0.S("tv_point");
            textView3 = null;
        }
        addView(textView3);
        Context context = getContext();
        kotlin.jvm.internal.f0.o(context, "getContext(...)");
        HBLineHeightTextView hBLineHeightTextView2 = new HBLineHeightTextView(context);
        this.f67138f = hBLineHeightTextView2;
        hBLineHeightTextView2.setTextSize(1, 12.0f);
        HBLineHeightTextView hBLineHeightTextView3 = this.f67138f;
        if (hBLineHeightTextView3 == null) {
            kotlin.jvm.internal.f0.S("tv_text");
            hBLineHeightTextView3 = null;
        }
        hBLineHeightTextView3.setGravity(16);
        HBLineHeightTextView hBLineHeightTextView4 = this.f67138f;
        if (hBLineHeightTextView4 == null) {
            kotlin.jvm.internal.f0.S("tv_text");
            hBLineHeightTextView4 = null;
        }
        hBLineHeightTextView4.setMaxLines(Integer.MAX_VALUE);
        HBLineHeightTextView hBLineHeightTextView5 = this.f67138f;
        if (hBLineHeightTextView5 == null) {
            kotlin.jvm.internal.f0.S("tv_text");
            hBLineHeightTextView5 = null;
        }
        hBLineHeightTextView5.setIncludeFontPadding(false);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(17, i10);
        HBLineHeightTextView hBLineHeightTextView6 = this.f67138f;
        if (hBLineHeightTextView6 == null) {
            kotlin.jvm.internal.f0.S("tv_text");
            hBLineHeightTextView6 = null;
        }
        hBLineHeightTextView6.setLayoutParams(layoutParams2);
        HBLineHeightTextView hBLineHeightTextView7 = this.f67138f;
        if (hBLineHeightTextView7 == null) {
            kotlin.jvm.internal.f0.S("tv_text");
        } else {
            hBLineHeightTextView = hBLineHeightTextView7;
        }
        addView(hBLineHeightTextView);
        c();
    }

    private final void b(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, bb.c.d.Yb, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f66466v1);
        kotlin.jvm.internal.f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        setLineHeight(typedArrayObtainStyledAttributes.getDimension(R.styleable.LineListItemView_itemLineHeight, this.f67136d));
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.LineListItemView_itemText);
        if (string != null) {
            setText(string);
        }
    }

    private final void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Xb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setColor(this.f67135c);
        setLineHeight(this.f67136d);
    }

    public final int getColor() {
        return this.f67139g;
    }

    public final int getDefaultColor() {
        return this.f67135c;
    }

    public final float getDefaultLineHeight() {
        return this.f67136d;
    }

    public final float getLineHeight() {
        return this.f67140h;
    }

    public final void setColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Ub, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f67139g = i10;
        TextView textView = this.f67137e;
        HBLineHeightTextView hBLineHeightTextView = null;
        if (textView == null) {
            kotlin.jvm.internal.f0.S("tv_point");
            textView = null;
        }
        textView.setBackground(ViewUtils.j(ViewUtils.f(getContext(), 4.0f) / 2.0f, i10));
        HBLineHeightTextView hBLineHeightTextView2 = this.f67138f;
        if (hBLineHeightTextView2 == null) {
            kotlin.jvm.internal.f0.S("tv_text");
        } else {
            hBLineHeightTextView = hBLineHeightTextView2;
        }
        hBLineHeightTextView.setTextColor(i10);
    }

    public final void setLineHeight(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.d.Vb, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f67140h = f10;
        TextView textView = this.f67137e;
        HBLineHeightTextView hBLineHeightTextView = null;
        if (textView == null) {
            kotlin.jvm.internal.f0.S("tv_point");
            textView = null;
        }
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) ((f10 - ViewUtils.f(getContext(), this.f67134b)) / 2.0f);
        HBLineHeightTextView hBLineHeightTextView2 = this.f67138f;
        if (hBLineHeightTextView2 == null) {
            kotlin.jvm.internal.f0.S("tv_text");
        } else {
            hBLineHeightTextView = hBLineHeightTextView2;
        }
        hBLineHeightTextView.setCustomLineHeight(f10);
    }

    public final void setText(@dl.d CharSequence text) {
        if (PatchProxy.proxy(new Object[]{text}, this, changeQuickRedirect, false, bb.c.d.Zb, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(text, "text");
        HBLineHeightTextView hBLineHeightTextView = this.f67138f;
        if (hBLineHeightTextView == null) {
            kotlin.jvm.internal.f0.S("tv_text");
            hBLineHeightTextView = null;
        }
        hBLineHeightTextView.setText(text);
    }
}
