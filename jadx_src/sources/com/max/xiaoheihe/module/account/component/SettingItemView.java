package com.max.xiaoheihe.module.account.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcustomview.SwitchButton.SwitchButton;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: SettingItemView.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
public final class SettingItemView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f78889g = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f78890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f78891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextView f78892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImageView f78893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SwitchButton f78894f;

    /* JADX INFO: compiled from: SettingItemView.kt */
    public enum Type {
        Arrow,
        SwitchButton;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static Type valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 24932, new Class[]{String.class}, Type.class);
            return (Type) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(Type.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 24931, new Class[0], Type[].class);
            return (Type[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: SettingItemView.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78895a;

        static {
            int[] iArr = new int[Type.valuesCustom().length];
            try {
                iArr[Type.Arrow.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.SwitchButton.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f78895a = iArr;
        }
    }

    public SettingItemView(@dl.e Context context) {
        this(context, null);
    }

    public SettingItemView(@dl.e Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SettingItemView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SettingItemView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
        b(attributeSet);
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24917, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setBackgroundResource(R.drawable.list_item_bg);
        TextView textView = new TextView(getContext());
        this.f78890b = textView;
        textView.setTextColor(getContext().getResources().getColor(R.color.text_primary_1_color));
        TextView textView2 = this.f78890b;
        if (textView2 == null) {
            f0.S("tvTitle");
            textView2 = null;
        }
        textView2.setTextSize(ViewUtils.g(getContext(), 13.0f));
        TextView textView3 = this.f78890b;
        if (textView3 == null) {
            f0.S("tvTitle");
            textView3 = null;
        }
        com.max.hbresource.a aVar = com.max.hbresource.a.f71893a;
        textView3.setTypeface(aVar.a(com.max.hbresource.a.f71895c));
        TextView textView4 = new TextView(getContext());
        this.f78891c = textView4;
        textView4.setTextColor(getContext().getResources().getColor(R.color.text_secondary_1_color));
        TextView textView5 = this.f78891c;
        if (textView5 == null) {
            f0.S("tvTitleDesc");
            textView5 = null;
        }
        textView5.setTextSize(ViewUtils.g(getContext(), 10.0f));
        TextView textView6 = this.f78891c;
        if (textView6 == null) {
            f0.S("tvTitleDesc");
            textView6 = null;
        }
        int i10 = com.max.hbresource.a.f71894b;
        textView6.setTypeface(aVar.a(i10));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = ViewUtils.f(getContext(), 3.0f);
        TextView textView7 = this.f78891c;
        if (textView7 == null) {
            f0.S("tvTitleDesc");
            textView7 = null;
        }
        textView7.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        TextView textView8 = this.f78890b;
        if (textView8 == null) {
            f0.S("tvTitle");
            textView8 = null;
        }
        linearLayout.addView(textView8);
        TextView textView9 = this.f78891c;
        if (textView9 == null) {
            f0.S("tvTitleDesc");
            textView9 = null;
        }
        linearLayout.addView(textView9);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(9);
        layoutParams2.leftMargin = ViewUtils.f(getContext(), 12.0f);
        addView(linearLayout, layoutParams2);
        this.f78893e = new ImageView(getContext());
        int iF = ViewUtils.f(getContext(), 20.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iF, iF);
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = ViewUtils.f(getContext(), 8.0f);
        ImageView imageView = this.f78893e;
        if (imageView == null) {
            f0.S("ivRightArrow");
            imageView = null;
        }
        imageView.setId(R.id.iv_arrow);
        ImageView imageView2 = this.f78893e;
        if (imageView2 == null) {
            f0.S("ivRightArrow");
            imageView2 = null;
        }
        imageView2.setColorFilter(getContext().getResources().getColor(R.color.text_secondary_2_color));
        ImageView imageView3 = this.f78893e;
        if (imageView3 == null) {
            f0.S("ivRightArrow");
            imageView3 = null;
        }
        imageView3.setImageResource(R.drawable.special_right_small_line_24x24);
        View view = this.f78893e;
        if (view == null) {
            f0.S("ivRightArrow");
            view = null;
        }
        addView(view, layoutParams3);
        setSb(new SwitchButton(new androidx.appcompat.view.d(getContext(), R.style.SettingSwitchStyle)));
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(11);
        layoutParams4.addRule(15);
        layoutParams4.rightMargin = ViewUtils.f(getContext(), 12.0f);
        addView(getSb(), layoutParams4);
        TextView textView10 = new TextView(getContext());
        this.f78892d = textView10;
        textView10.setTextColor(getContext().getResources().getColor(R.color.text_secondary_1_color));
        TextView textView11 = this.f78892d;
        if (textView11 == null) {
            f0.S("tvRightDesc");
            textView11 = null;
        }
        textView11.setTypeface(aVar.a(i10));
        TextView textView12 = this.f78892d;
        if (textView12 == null) {
            f0.S("tvRightDesc");
            textView12 = null;
        }
        textView12.setTextSize(ViewUtils.g(getContext(), 13.0f));
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(15);
        layoutParams5.addRule(0, R.id.iv_arrow);
        layoutParams5.rightMargin = ViewUtils.f(getContext(), 4.0f);
        View view2 = this.f78892d;
        if (view2 == null) {
            f0.S("tvRightDesc");
            view2 = null;
        }
        addView(view2, layoutParams5);
    }

    private final void b(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, 24918, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.B3);
        f0.o(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…tyleable.SettingItemView)");
        String string = typedArrayObtainStyledAttributes.getString(3);
        String string2 = typedArrayObtainStyledAttributes.getString(4);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(2, false);
        String string3 = typedArrayObtainStyledAttributes.getString(0);
        int i10 = typedArrayObtainStyledAttributes.getInt(1, 0);
        TextView textView = this.f78890b;
        TextView textView2 = null;
        if (textView == null) {
            f0.S("tvTitle");
            textView = null;
        }
        textView.setText(string);
        TextView textView3 = this.f78891c;
        if (textView3 == null) {
            f0.S("tvTitleDesc");
            textView3 = null;
        }
        textView3.setText(string2);
        d(z10);
        TextView textView4 = this.f78892d;
        if (textView4 == null) {
            f0.S("tvRightDesc");
        } else {
            textView2 = textView4;
        }
        textView2.setText(string3);
        if (i10 == 0) {
            setRightType(Type.Arrow);
        } else {
            if (i10 != 1) {
                return;
            }
            setRightType(Type.SwitchButton);
        }
    }

    public static /* synthetic */ void setChecked$default(SettingItemView settingItemView, boolean z10, boolean z11, int i10, Object obj) {
        Object[] objArr = {settingItemView, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 24927, new Class[]{SettingItemView.class, cls, cls, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        settingItemView.setChecked(z10, z11);
    }

    public final boolean c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24930, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : getSb().isChecked();
    }

    @qa.a(note = "设置是否显示左侧标签下方描述")
    public final void d(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 24924, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f78891c;
        if (textView == null) {
            f0.S("tvTitleDesc");
            textView = null;
        }
        textView.setVisibility(z10 ? 0 : 8);
    }

    @dl.d
    public final SwitchButton getSb() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24915, new Class[0], SwitchButton.class);
        if (patchProxyResultProxy.isSupported) {
            return (SwitchButton) patchProxyResultProxy.result;
        }
        SwitchButton switchButton = this.f78894f;
        if (switchButton != null) {
            return switchButton;
        }
        f0.S("sb");
        return null;
    }

    public final void setChecked(boolean z10, boolean z11) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 24926, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        getSb().setChecked(z10, z11);
    }

    public final void setOnCheckedChangeListener(@dl.e CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        if (PatchProxy.proxy(new Object[]{onCheckedChangeListener}, this, changeQuickRedirect, false, 24928, new Class[]{CompoundButton.OnCheckedChangeListener.class}, Void.TYPE).isSupported) {
            return;
        }
        getSb().setOnCheckedChangeListener(onCheckedChangeListener);
    }

    @qa.a(note = "设置右侧描述")
    public final void setRightDesc(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24923, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f78892d;
        if (textView == null) {
            f0.S("tvRightDesc");
            textView = null;
        }
        textView.setText(str);
    }

    public final void setRightType(@dl.e Type type) {
        if (PatchProxy.proxy(new Object[]{type}, this, changeQuickRedirect, false, 24925, new Class[]{Type.class}, Void.TYPE).isSupported) {
            return;
        }
        int i10 = type == null ? -1 : a.f78895a[type.ordinal()];
        TextView textView = null;
        if (i10 == 1) {
            ImageView imageView = this.f78893e;
            if (imageView == null) {
                f0.S("ivRightArrow");
                imageView = null;
            }
            imageView.setVisibility(0);
            TextView textView2 = this.f78892d;
            if (textView2 == null) {
                f0.S("tvRightDesc");
            } else {
                textView = textView2;
            }
            textView.setVisibility(0);
            getSb().setVisibility(8);
            return;
        }
        if (i10 != 2) {
            return;
        }
        ImageView imageView2 = this.f78893e;
        if (imageView2 == null) {
            f0.S("ivRightArrow");
            imageView2 = null;
        }
        imageView2.setVisibility(8);
        TextView textView3 = this.f78892d;
        if (textView3 == null) {
            f0.S("tvRightDesc");
        } else {
            textView = textView3;
        }
        textView.setVisibility(8);
        getSb().setVisibility(0);
    }

    public final void setSb(@dl.d SwitchButton switchButton) {
        if (PatchProxy.proxy(new Object[]{switchButton}, this, changeQuickRedirect, false, 24916, new Class[]{SwitchButton.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(switchButton, "<set-?>");
        this.f78894f = switchButton;
    }

    public final void setSwitchEnable(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 24929, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getSb().setEnabled(z10);
    }

    @qa.a(note = "设置左侧标题")
    public final void setTitle(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24919, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f78890b;
        if (textView == null) {
            f0.S("tvTitle");
            textView = null;
        }
        textView.setText(str);
    }

    public final void setTitleClickListener(@dl.d l<? super View, b2> onClick) {
        if (PatchProxy.proxy(new Object[]{onClick}, this, changeQuickRedirect, false, 24921, new Class[]{l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(onClick, "onClick");
        TextView textView = this.f78890b;
        if (textView == null) {
            f0.S("tvTitle");
            textView = null;
        }
        textView.setOnClickListener(new View.OnClickListener(onClick) { // from class: com.max.xiaoheihe.module.account.component.SettingItemView.b
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final /* synthetic */ l f78896b;

            {
                f0.p(onClick, "function");
                this.f78896b = onClick;
            }

            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24933, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f78896b.invoke(view);
            }
        });
    }

    @qa.a(note = "设置左侧标题描述")
    public final void setTitleDesc(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24922, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f78891c;
        if (textView == null) {
            f0.S("tvTitleDesc");
            textView = null;
        }
        textView.setText(str);
    }

    public final void setTitleRightCompoundDrawable(@dl.d Drawable rightDrawable, int i10) {
        if (PatchProxy.proxy(new Object[]{rightDrawable, new Integer(i10)}, this, changeQuickRedirect, false, 24920, new Class[]{Drawable.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(rightDrawable, "rightDrawable");
        TextView textView = this.f78890b;
        TextView textView2 = null;
        if (textView == null) {
            f0.S("tvTitle");
            textView = null;
        }
        textView.setCompoundDrawables(null, null, rightDrawable, null);
        TextView textView3 = this.f78890b;
        if (textView3 == null) {
            f0.S("tvTitle");
        } else {
            textView2 = textView3;
        }
        textView2.setCompoundDrawablePadding(i10);
    }
}
