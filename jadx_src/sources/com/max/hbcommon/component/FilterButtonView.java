package com.max.hbcommon.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.hbcommon.R;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FilterButtonView.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class FilterButtonView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private ImageView f66995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private TextView f66996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f66997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f66998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f66999f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f67000g;

    public FilterButtonView(@dl.e Context context) {
        this(context, null);
    }

    public FilterButtonView(@dl.e Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FilterButtonView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public FilterButtonView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f66997d = -1;
        this.f66998e = -1;
        this.f66999f = -1;
        a(attributeSet);
    }

    private final void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31250g7, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!this.f67000g) {
            TextView textView = this.f66996c;
            if (textView != null) {
                textView.setTextColor(this.f66997d);
            }
            ImageView imageView = this.f66995b;
            if (imageView != null) {
                imageView.setColorFilter(this.f66998e);
                return;
            }
            return;
        }
        int i10 = this.f66999f;
        TextView textView2 = this.f66996c;
        if (textView2 != null) {
            textView2.setTextColor(i10);
        }
        ImageView imageView2 = this.f66995b;
        if (imageView2 != null) {
            imageView2.setColorFilter(this.f66999f);
        }
    }

    public final void a(@dl.e AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, bb.c.d.f31111a7, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.C0);
        kotlin.jvm.internal.f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.FilterButtonView_fbvText);
        setOrientation(0);
        setGravity(17);
        removeAllViews();
        this.f66997d = getContext().getResources().getColor(R.color.text_primary_2_color);
        this.f66998e = getContext().getResources().getColor(R.color.text_secondary_1_color);
        this.f66999f = getContext().getResources().getColor(R.color.text_primary_1_color);
        this.f66995b = new ImageView(getContext());
        int iF = ViewUtils.f(getContext(), 16.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iF, iF);
        ImageView imageView = this.f66995b;
        if (imageView != null) {
            imageView.setLayoutParams(layoutParams);
        }
        ImageView imageView2 = this.f66995b;
        if (imageView2 != null) {
            imageView2.setColorFilter(this.f66998e);
        }
        ImageView imageView3 = this.f66995b;
        if (imageView3 != null) {
            imageView3.setImageResource(R.drawable.common_filter2_filled_24x24);
        }
        addView(this.f66995b);
        this.f66996c = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = ViewUtils.f(getContext(), 2.0f);
        TextView textView = this.f66996c;
        if (textView != null) {
            textView.setLayoutParams(layoutParams2);
        }
        TextView textView2 = this.f66996c;
        if (textView2 != null) {
            textView2.setTextSize(ViewUtils.g(getContext(), 12.0f));
        }
        TextView textView3 = this.f66996c;
        if (textView3 != null) {
            textView3.setTextColor(this.f66997d);
        }
        TextView textView4 = this.f66996c;
        if (textView4 != null) {
            textView4.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
        }
        setText(string);
        addView(this.f66996c);
    }

    public final boolean getChecked() {
        return this.f67000g;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@dl.e MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.d.f31296i7, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            if (!(getAlpha() == 0.0f)) {
                setAlpha(0.5f);
            }
        } else {
            if ((numValueOf != null && numValueOf.intValue() == 3) || (numValueOf != null && numValueOf.intValue() == 1)) {
                if (!(getAlpha() == 0.0f)) {
                    setAlpha(1.0f);
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @qa.a(note = "设置是否选中")
    public final void setChecked(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.f31273h7, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f67000g = z10;
        b();
    }

    @qa.a(note = "设置选中状态下颜色")
    public final void setCheckedColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31227f7, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f66999f = i10;
        b();
    }

    public final void setImage(int i10) {
        ImageView imageView;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31157c7, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (imageView = this.f66995b) == null) {
            return;
        }
        imageView.setImageResource(i10);
    }

    @qa.a(note = "设置正常状态下图标的颜色")
    public final void setNormalIconColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31204e7, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f66998e = i10;
        b();
    }

    @qa.a(note = "设置正常状态下文字的颜色")
    public final void setNormalTextColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31181d7, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f66997d = i10;
        b();
    }

    @qa.a(note = "设置文字")
    public final void setText(@dl.e String str) {
        TextView textView;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.d.f31134b7, new Class[]{String.class}, Void.TYPE).isSupported || (textView = this.f66996c) == null) {
            return;
        }
        textView.setText(str);
    }
}
