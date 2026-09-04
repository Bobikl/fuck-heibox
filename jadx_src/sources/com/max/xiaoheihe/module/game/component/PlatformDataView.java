package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.core.content.res.i;
import bb.d;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PlatformDataView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class PlatformDataView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f86936f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f86937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f86938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f86939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f86940e;

    public PlatformDataView(@e Context context) {
        this(context, null);
    }

    public PlatformDataView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlatformDataView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public PlatformDataView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
        b(attributeSet);
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36904, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setGravity(16);
        setTv_value(new TextView(getContext()));
        getTv_value().setId(R.id.tv_value);
        getTv_value().setTextSize(1, 22.0f);
        getTv_value().setTextColor(getContext().getResources().getColor(R.color.white));
        d.d(getTv_value(), 4);
        addView(getTv_value());
        setTv_delta(new TextView(getContext()));
        getTv_delta().setTextSize(1, 9.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(17, R.id.tv_value);
        layoutParams.addRule(6, R.id.tv_value);
        layoutParams.addRule(8, R.id.tv_value);
        getTv_delta().setGravity(17);
        getTv_delta().setLayoutParams(layoutParams);
        addView(getTv_delta());
        getTv_delta().setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, R.id.tv_value);
        linearLayout.setLayoutParams(layoutParams2);
        addView(linearLayout);
        setIv_icon(new ImageView(getContext()));
        int iF = ViewUtils.f(getContext(), 12.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iF, iF);
        layoutParams3.rightMargin = ViewUtils.f(getContext(), 2.0f);
        linearLayout.addView(getIv_icon(), layoutParams3);
        setTv_desc(new TextView(getContext()));
        getTv_desc().setTextColor(getContext().getResources().getColor(R.color.white_alpha50));
        getTv_desc().setTextSize(1, 10.0f);
        linearLayout.addView(getTv_desc());
    }

    private final void b(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, 36905, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.V2);
        f0.o(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…yleable.PlatformDataView)");
        String string = typedArrayObtainStyledAttributes.getString(3);
        String string2 = typedArrayObtainStyledAttributes.getString(0);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(2, false);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        float f10 = typedArrayObtainStyledAttributes.getFloat(4, 22.0f);
        setValue(string);
        setDesc(string2);
        c(z10);
        if (resourceId != -1) {
            getIv_icon().setImageResource(resourceId);
        }
        getTv_value().setTextSize(1, f10);
    }

    public final void c(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 36908, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getIv_icon().setVisibility(z10 ? 0 : 8);
    }

    @dl.d
    public final ImageView getIv_icon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36900, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86939d;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_icon");
        return null;
    }

    @dl.d
    public final TextView getTv_delta() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36898, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86938c;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_delta");
        return null;
    }

    @dl.d
    public final TextView getTv_desc() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36902, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86940e;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_desc");
        return null;
    }

    @dl.d
    public final TextView getTv_value() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36896, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86937b;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_value");
        return null;
    }

    public final void setDelta(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36909, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        int iQ = n.q(str);
        if (iQ == 0) {
            getTv_delta().setVisibility(8);
            return;
        }
        getTv_delta().setVisibility(0);
        if (iQ > 0) {
            TextView tv_delta = getTv_delta();
            StringBuilder sb2 = new StringBuilder();
            sb2.append('+');
            sb2.append(Math.abs(iQ));
            tv_delta.setText(sb2.toString());
            getTv_delta().setTextColor(i.e(getResources(), R.color.correct_color, null));
            return;
        }
        TextView tv_delta2 = getTv_delta();
        StringBuilder sb3 = new StringBuilder();
        sb3.append('-');
        sb3.append(Math.abs(iQ));
        tv_delta2.setText(sb3.toString());
        getTv_delta().setTextColor(i.e(getResources(), R.color.alert_color, null));
    }

    public final void setDesc(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36907, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_desc().setText(str);
    }

    public final void setIv_icon(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36901, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86939d = imageView;
    }

    public final void setTv_delta(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36899, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86938c = textView;
    }

    public final void setTv_desc(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36903, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86940e = textView;
    }

    public final void setTv_value(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36897, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86937b = textView;
    }

    public final void setValue(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36906, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_value().setText(str);
    }
}
