package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcustomview.shinebuttonlib.ShineButton;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.utils.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: ChartSelectorView.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nChartSelectorView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChartSelectorView.kt\ncom/max/xiaoheihe/module/game/component/ChartSelectorView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,127:1\n177#2,2:128\n*S KotlinDebug\n*F\n+ 1 ChartSelectorView.kt\ncom/max/xiaoheihe/module/game/component/ChartSelectorView\n*L\n64#1:128,2\n*E\n"})
@o(parameters = 0)
public final class ChartSelectorView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f86585h = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f86586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f86587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f86588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e
    private ShineButton.g f86589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f86590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f86591g;

    /* JADX INFO: compiled from: ChartSelectorView.kt */
    public enum Type {
        TEXT,
        ICON;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static Type valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 36299, new Class[]{String.class}, Type.class);
            return (Type) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(Type.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 36298, new Class[0], Type[].class);
            return (Type[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: ChartSelectorView.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86592a;

        static {
            int[] iArr = new int[Type.valuesCustom().length];
            try {
                iArr[Type.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f86592a = iArr;
        }
    }

    /* JADX INFO: compiled from: ChartSelectorView.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36300, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ChartSelectorView chartSelectorView = ChartSelectorView.this;
            ChartSelectorView.c(chartSelectorView, true ^ chartSelectorView.getChecked(), false, 2, null);
        }
    }

    public ChartSelectorView(@e Context context) {
        this(context, null);
    }

    public ChartSelectorView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChartSelectorView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public ChartSelectorView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f86590f = true;
        this.f86591g = -1;
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36292, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOrientation(0);
        setGravity(16);
        setTv_desc(new TextView(getContext()));
        getTv_desc().setTextSize(1, 12.0f);
        addView(getTv_desc());
        setIv_icon(new ImageView(getContext()));
        int iF = ViewUtils.f(getContext(), 18.0f);
        getIv_icon().setLayoutParams(new LinearLayout.LayoutParams(iF, iF));
        addView(getIv_icon());
        int iF2 = ViewUtils.f(getContext(), 16.0f);
        setIv_selector(new ImageView(getContext()));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iF2, iF2);
        layoutParams.setMarginStart(ViewUtils.f(getContext(), 6.0f));
        getIv_selector().setLayoutParams(layoutParams);
        ImageView iv_selector = getIv_selector();
        int iF3 = ViewUtils.f(getContext(), 2.0f);
        iv_selector.setPadding(iF3, iF3, iF3, iF3);
        getIv_selector().setColorFilter(d.F(getContext(), R.color.text_primary_1_not_change_color));
        addView(getIv_selector());
        c(this, this.f86590f, false, 2, null);
        setOnClickListener(new b());
    }

    public static /* synthetic */ void c(ChartSelectorView chartSelectorView, boolean z10, boolean z11, int i10, Object obj) {
        Object[] objArr = {chartSelectorView, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 36295, new Class[]{ChartSelectorView.class, cls, cls, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        chartSelectorView.b(z10, z11);
    }

    public final void b(boolean z10, boolean z11) {
        ShineButton.g gVar;
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36294, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f86590f = z10;
        if (z10) {
            getIv_selector().setImageResource(R.drawable.common_correct_filled_24x24);
        } else {
            getIv_selector().setImageDrawable(null);
        }
        setColor(this.f86591g);
        if (!z11 || (gVar = this.f86589e) == null) {
            return;
        }
        gVar.a(this, this.f86590f);
    }

    @e
    public final ShineButton.g getCheckChangeListener() {
        return this.f86589e;
    }

    public final boolean getChecked() {
        return this.f86590f;
    }

    @dl.d
    public final ImageView getIv_icon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36288, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86587c;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_icon");
        return null;
    }

    @dl.d
    public final ImageView getIv_selector() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36290, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86588d;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_selector");
        return null;
    }

    public final int getMainColor() {
        return this.f86591g;
    }

    @dl.d
    public final TextView getTv_desc() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36286, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86586b;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_desc");
        return null;
    }

    public final void setCheckChangeListener(@e ShineButton.g gVar) {
        this.f86589e = gVar;
    }

    public final void setChecked(boolean z10) {
        this.f86590f = z10;
    }

    public final void setColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 36297, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f86591g = i10;
        int iO = ViewUtils.o(getContext(), getIv_selector());
        if (this.f86590f) {
            getIv_selector().setBackground(ViewUtils.G(iO, i10));
        } else {
            getIv_selector().setBackground(q.N(getContext(), i10, 2.0f));
        }
        getTv_desc().setTextColor(i10);
    }

    public final void setDesc(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36296, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_desc().setText(str);
    }

    public final void setIv_icon(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36289, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86587c = imageView;
    }

    public final void setIv_selector(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36291, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86588d = imageView;
    }

    public final void setMainColor(int i10) {
        this.f86591g = i10;
    }

    public final void setTv_desc(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36287, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86586b = textView;
    }

    public final void setType(@dl.d Type type) {
        if (PatchProxy.proxy(new Object[]{type}, this, changeQuickRedirect, false, 36293, new Class[]{Type.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(type, "type");
        if (a.f86592a[type.ordinal()] == 1) {
            getTv_desc().setVisibility(0);
            getIv_icon().setVisibility(8);
        } else {
            getTv_desc().setVisibility(8);
            getIv_icon().setVisibility(0);
        }
    }
}
