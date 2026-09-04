package com.max.hbcustomview;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.i;

/* JADX INFO: compiled from: HBSearchTextLogoView.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class HBSearchTextLogoView extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final a f68504f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final String f68505g = "低价购买正品游戏";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f68506h = 90.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f68507i = 14.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f68508j = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f68509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private String f68510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private TextView f68511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private ImageView f68512e;

    /* JADX INFO: compiled from: HBSearchTextLogoView.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public HBSearchTextLogoView(@dl.d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public HBSearchTextLogoView(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public HBSearchTextLogoView(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f68510c = f68505g;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Z0);
            f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            this.f68509b = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HBSearchTextLogoView_isDarkStyle, true);
            String string = typedArrayObtainStyledAttributes.getString(R.styleable.HBSearchTextLogoView_searchText);
            if (string != null) {
                this.f68510c = string;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        a();
    }

    public /* synthetic */ HBSearchTextLogoView(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32619v6, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(layoutParams);
        addView(imageView);
        this.f68512e = imageView;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 16;
        layoutParams2.setMarginStart(ViewUtils.f(getContext(), f68506h));
        layoutParams2.setMarginEnd(ViewUtils.f(getContext(), f68507i));
        TextView textView = new TextView(getContext());
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        textView.setTextSize(1, 9.0f);
        textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        textView.setIncludeFontPadding(false);
        textView.setMaxLines(1);
        addView(textView);
        this.f68511d = textView;
    }

    public final void b(boolean z10, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), str}, this, changeQuickRedirect, false, bb.c.f.f32641w6, new Class[]{Boolean.TYPE, String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f68509b = z10;
        this.f68510c = str == null ? f68505g : str;
        if (z10) {
            ImageView imageView = this.f68512e;
            if (imageView != null) {
                imageView.setBackgroundResource(R.drawable.heybox_search_logo_light);
            }
        } else {
            ImageView imageView2 = this.f68512e;
            if (imageView2 != null) {
                imageView2.setBackgroundResource(R.drawable.heybox_search_logo_dark);
            }
        }
        TextView textView = this.f68511d;
        if (textView != null) {
            textView.setText(str);
            if (z10) {
                textView.setTextColor(textView.getContext().getColor(R.color.text_primary_1_color_day));
            } else {
                textView.setTextColor(textView.getContext().getColor(R.color.white));
            }
        }
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        float fMeasureText;
        TextPaint paint;
        String string;
        CharSequence text;
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32663x6, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        TextView textView = this.f68511d;
        if (textView == null || (paint = textView.getPaint()) == null) {
            fMeasureText = 0.0f;
        } else {
            TextView textView2 = this.f68511d;
            if (textView2 == null || (text = textView2.getText()) == null || (string = text.toString()) == null) {
                string = "";
            }
            fMeasureText = paint.measureText(string);
        }
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            size = ViewUtils.f(getContext(), 105.0f) + ((int) fMeasureText);
            size2 = ViewUtils.f(getContext(), 20.0f);
        } else if (mode == Integer.MIN_VALUE) {
            size = ViewUtils.f(getContext(), 105.0f) + ((int) fMeasureText);
        } else if (mode2 == Integer.MIN_VALUE) {
            size2 = ViewUtils.f(getContext(), 20.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, mode), View.MeasureSpec.makeMeasureSpec(size2, mode2));
    }
}
