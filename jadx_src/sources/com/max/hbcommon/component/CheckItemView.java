package com.max.hbcommon.component;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.R;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: CheckItemView.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class CheckItemView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f66967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f66968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private Type f66969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f66970e;

    /* JADX INFO: compiled from: CheckItemView.kt */
    public enum Type {
        Single,
        Multiple;

        private static final /* synthetic */ kotlin.enums.a $ENTRIES = EnumEntriesKt.b(values());
        public static ChangeQuickRedirect changeQuickRedirect;

        @dl.d
        public static kotlin.enums.a<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.d.A6, new Class[]{String.class}, Type.class);
            return (Type) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(Type.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.d.f31677z6, new Class[0], Type[].class);
            return (Type[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: CheckItemView.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66971a;

        static {
            int[] iArr = new int[Type.valuesCustom().length];
            try {
                iArr[Type.Single.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.Multiple.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f66971a = iArr;
        }
    }

    public CheckItemView(@dl.e Context context) {
        this(context, null);
    }

    public CheckItemView(@dl.e Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CheckItemView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public CheckItemView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f66969d = Type.Single;
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31589v6, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66968c = new ImageView(getContext());
        int iF = ViewUtils.f(getContext(), 16.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iF, iF);
        layoutParams.addRule(15);
        layoutParams.addRule(11);
        layoutParams.rightMargin = ViewUtils.f(getContext(), 12.0f);
        View view = this.f66968c;
        View view2 = null;
        if (view == null) {
            kotlin.jvm.internal.f0.S("iv_check");
            view = null;
        }
        addView(view, layoutParams);
        TextView textView = new TextView(getContext());
        this.f66967b = textView;
        textView.setTextSize(1, 14.0f);
        TextView textView2 = this.f66967b;
        if (textView2 == null) {
            kotlin.jvm.internal.f0.S("tv_text");
            textView2 = null;
        }
        textView2.setTextColor(getContext().getResources().getColor(R.color.text_primary_1_color));
        TextView textView3 = this.f66967b;
        if (textView3 == null) {
            kotlin.jvm.internal.f0.S("tv_text");
            textView3 = null;
        }
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        TextView textView4 = this.f66967b;
        if (textView4 == null) {
            kotlin.jvm.internal.f0.S("tv_text");
            textView4 = null;
        }
        textView4.setMaxLines(1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(0, R.id.check_item_iv_check);
        layoutParams2.addRule(9);
        layoutParams2.leftMargin = ViewUtils.f(getContext(), 12.0f);
        View view3 = this.f66967b;
        if (view3 == null) {
            kotlin.jvm.internal.f0.S("tv_text");
        } else {
            view2 = view3;
        }
        addView(view2, layoutParams2);
    }

    public final boolean b() {
        return this.f66970e;
    }

    @dl.d
    public final Type getType() {
        return this.f66969d;
    }

    public final void setChecked(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.f31611w6, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f66970e = z10;
        int i10 = a.f66971a[this.f66969d.ordinal()];
        ImageView imageView = null;
        if (i10 == 1) {
            ImageView imageView2 = this.f66968c;
            if (imageView2 == null) {
                kotlin.jvm.internal.f0.S("iv_check");
            } else {
                imageView = imageView2;
            }
            imageView.setImageResource(z10 ? R.drawable.ic_checked : R.drawable.bg_transpant);
            return;
        }
        if (i10 != 2) {
            return;
        }
        ImageView imageView3 = this.f66968c;
        if (imageView3 == null) {
            kotlin.jvm.internal.f0.S("iv_check");
        } else {
            imageView = imageView3;
        }
        imageView.setImageResource(z10 ? R.drawable.account_cb_checked_16_16x16 : R.drawable.common_cb_unchecked);
    }

    public final void setText(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.d.f31633x6, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f66967b;
        if (textView == null) {
            kotlin.jvm.internal.f0.S("tv_text");
            textView = null;
        }
        textView.setText(str);
    }

    public final void setType(@dl.d Type type) {
        if (PatchProxy.proxy(new Object[]{type}, this, changeQuickRedirect, false, bb.c.d.f31655y6, new Class[]{Type.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(type, "type");
        this.f66969d = type;
        setChecked(this.f66970e);
    }
}
