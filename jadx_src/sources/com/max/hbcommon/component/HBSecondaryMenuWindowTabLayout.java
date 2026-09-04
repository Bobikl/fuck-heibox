package com.max.hbcommon.component;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcommon.R;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: HBSecondaryMenuWindowTabLayout.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class HBSecondaryMenuWindowTabLayout extends TabLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private a Y3;

    @dl.d
    private ArrayList<KeyDescObj> Z3;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    @dl.d
    private LinearLayout f67008a4;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    @dl.d
    private PopupWindow f67009b4;

    /* JADX INFO: compiled from: HBSecondaryMenuWindowTabLayout.kt */
    public interface a {

        /* JADX INFO: renamed from: com.max.hbcommon.component.HBSecondaryMenuWindowTabLayout$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: HBSecondaryMenuWindowTabLayout.kt */
        public static final class C0539a {
            public static ChangeQuickRedirect changeQuickRedirect;

            public static void a(@dl.d a aVar, @dl.e String str, @dl.e String str2) {
            }
        }

        void a(@dl.e String str, @dl.e String str2);

        void b(int i10, int i11);
    }

    /* JADX INFO: compiled from: HBSecondaryMenuWindowTabLayout.kt */
    public static final class b implements TabLayout.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(@dl.d TabLayout.h tab) {
            if (PatchProxy.proxy(new Object[]{tab}, this, changeQuickRedirect, false, bb.c.d.f31343k8, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(tab, "tab");
            if (tab.k() < HBSecondaryMenuWindowTabLayout.this.getMPageList().size()) {
                KeyDescObj keyDescObj = HBSecondaryMenuWindowTabLayout.this.getMPageList().get(tab.k());
                kotlin.jvm.internal.f0.m(keyDescObj);
                KeyDescObj keyDescObj2 = keyDescObj;
                View viewG = tab.g();
                TextView textView = viewG != null ? (TextView) viewG.findViewById(R.id.text1) : null;
                if (textView != null) {
                    textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
                }
                if (!kotlin.jvm.internal.f0.g("1", keyDescObj2.getMulti())) {
                    if (viewG == null || textView == null) {
                        return;
                    }
                    textView.setTextColor(HBSecondaryMenuWindowTabLayout.this.getContext().getResources().getColor(R.color.text_primary_1_color));
                    return;
                }
                if (viewG != null) {
                    ImageView imageView = (ImageView) viewG.findViewById(R.id.icon);
                    if (textView != null) {
                        textView.setTextColor(HBSecondaryMenuWindowTabLayout.this.getContext().getResources().getColor(R.color.text_primary_1_color));
                    }
                    imageView.setImageTintList(ColorStateList.valueOf(HBSecondaryMenuWindowTabLayout.this.getContext().getResources().getColor(R.color.text_primary_1_color)));
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(@dl.d TabLayout.h tab) {
            if (PatchProxy.proxy(new Object[]{tab}, this, changeQuickRedirect, false, bb.c.d.f31366l8, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(tab, "tab");
            if (tab.k() < HBSecondaryMenuWindowTabLayout.this.getMPageList().size()) {
                KeyDescObj keyDescObj = HBSecondaryMenuWindowTabLayout.this.getMPageList().get(tab.k());
                kotlin.jvm.internal.f0.m(keyDescObj);
                KeyDescObj keyDescObj2 = keyDescObj;
                View viewG = tab.g();
                TextView textView = viewG != null ? (TextView) viewG.findViewById(R.id.text1) : null;
                if (textView != null) {
                    textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
                }
                if (!kotlin.jvm.internal.f0.g("1", keyDescObj2.getMulti())) {
                    if (textView != null) {
                        textView.setTextColor(HBSecondaryMenuWindowTabLayout.this.getContext().getResources().getColor(R.color.text_secondary_1_color));
                        return;
                    }
                    return;
                }
                if (viewG != null) {
                    ImageView imageView = (ImageView) viewG.findViewById(R.id.icon);
                    if (textView != null) {
                        textView.setTextColor(HBSecondaryMenuWindowTabLayout.this.getContext().getResources().getColor(R.color.text_secondary_1_color));
                    }
                    imageView.setImageTintList(ColorStateList.valueOf(HBSecondaryMenuWindowTabLayout.this.getContext().getResources().getColor(R.color.text_secondary_2_color)));
                }
                if (HBSecondaryMenuWindowTabLayout.this.f67009b4.isShowing()) {
                    HBSecondaryMenuWindowTabLayout.this.k0();
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(@dl.d TabLayout.h tab) {
            if (PatchProxy.proxy(new Object[]{tab}, this, changeQuickRedirect, false, bb.c.d.f31389m8, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(tab, "tab");
        }
    }

    /* JADX INFO: compiled from: HBSecondaryMenuWindowTabLayout.kt */
    public static final class c implements Animation.AnimationListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(@dl.d Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.d.f31435o8, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(@dl.d Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.d.f31458p8, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(@dl.d Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.d.f31412n8, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(animation, "animation");
            HBSecondaryMenuWindowTabLayout.this.f67008a4.setVisibility(0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HBSecondaryMenuWindowTabLayout(@dl.d Context context) {
        this(context, null);
        kotlin.jvm.internal.f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HBSecondaryMenuWindowTabLayout(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
        kotlin.jvm.internal.f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HBSecondaryMenuWindowTabLayout(@dl.d Context context, @dl.e AttributeSet attributeSet, @androidx.annotation.f int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.f0.p(context, "context");
        this.Z3 = new ArrayList<>();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f66483y3);
        kotlin.jvm.internal.f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        setTabContentStart((int) typedArrayObtainStyledAttributes.getDimension(R.styleable.TabLayout_tabContentStart, ViewUtils.f(context, 12.0f)));
        setMinWidth((int) typedArrayObtainStyledAttributes.getDimension(R.styleable.TabLayout_tabMinWidth, 10.0f));
        setTabPaddingStart((int) typedArrayObtainStyledAttributes.getDimension(R.styleable.TabLayout_tabPaddingStart, ViewUtils.f(context, 10.0f)));
        setTabPaddingEnd((int) typedArrayObtainStyledAttributes.getDimension(R.styleable.TabLayout_tabPaddingEnd, ViewUtils.f(context, 10.0f)));
        setTabMode(0);
        this.f67009b4 = new PopupWindow(context);
        this.f67008a4 = new LinearLayout(context);
        q0();
    }

    private final View i0(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Y7, new Class[]{Integer.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View viewInflate = View.inflate(getContext(), R.layout.item_text_view_2_padding, null);
        TabLayout.h hVarD = D(i10);
        TextView textView = (TextView) viewInflate.findViewById(R.id.text1);
        if (hVarD == null) {
            return viewInflate;
        }
        KeyDescObj keyDescObj = this.Z3.get(i10);
        textView.setText(keyDescObj != null ? keyDescObj.getDesc() : null);
        if (hVarD.o()) {
            textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
            textView.setTextColor(getContext().getResources().getColor(R.color.text_primary_1_color));
        } else {
            textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
            textView.setTextColor(getContext().getResources().getColor(R.color.text_secondary_1_color));
        }
        return viewInflate;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00da  */
    private final View j0(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Z7, new Class[]{Integer.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        String desc = null;
        if (this.Z3.get(i10) == null) {
            return null;
        }
        KeyDescObj keyDescObj = this.Z3.get(i10);
        View viewInflate = View.inflate(getContext(), R.layout.item_button_drop_down, null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.text1);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.icon);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        ic.a aVar = ic.a.f119343a;
        Context context = getContext();
        kotlin.jvm.internal.f0.o(context, "getContext(...)");
        layoutParams2.width = aVar.a(context, 8.0f);
        Context context2 = getContext();
        kotlin.jvm.internal.f0.o(context2, "getContext(...)");
        layoutParams2.height = aVar.a(context2, 8.0f);
        Context context3 = getContext();
        kotlin.jvm.internal.f0.o(context3, "getContext(...)");
        layoutParams2.leftMargin = aVar.a(context3, 4.0f);
        imageView.setImageResource(R.drawable.common_arrow_down_filled_24x24);
        if (com.max.hbcommon.utils.c.u(keyDescObj != null ? keyDescObj.getDesc() : null)) {
            if (kotlin.jvm.internal.f0.g("1", keyDescObj != null ? keyDescObj.getMulti() : null)) {
                List[] listArr = new List[1];
                KeyDescObj keyDescObj2 = this.Z3.get(i10);
                listArr[0] = keyDescObj2 != null ? keyDescObj2.getData() : null;
                if (!com.max.hbcommon.utils.c.w(listArr)) {
                    desc = keyDescObj.getData().get(0).getDesc();
                } else if (keyDescObj != null) {
                    desc = keyDescObj.getDesc();
                }
            } else if (keyDescObj != null) {
                desc = keyDescObj.getDesc();
            }
        } else if (keyDescObj != null) {
            desc = keyDescObj.getDesc();
        }
        textView.setText(desc);
        TabLayout.h hVarD = D(i10);
        if (hVarD == null) {
            return viewInflate;
        }
        if (hVarD.o()) {
            Resources resources = getContext().getResources();
            int i11 = R.color.text_primary_1_color;
            textView.setTextColor(resources.getColor(i11));
            textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
            imageView.setImageTintList(ColorStateList.valueOf(getContext().getResources().getColor(i11)));
            imageView.setRotation(0.0f);
        } else {
            textView.setTextColor(getContext().getResources().getColor(R.color.text_secondary_1_color));
            textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
            imageView.setImageTintList(ColorStateList.valueOf(getContext().getResources().getColor(R.color.text_secondary_2_color)));
            imageView.setRotation(0.0f);
        }
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(TabLayout.h hVar, HBSecondaryMenuWindowTabLayout this$0, int i10, View view) {
        if (PatchProxy.proxy(new Object[]{hVar, this$0, new Integer(i10), view}, null, changeQuickRedirect, true, bb.c.d.f31228f8, new Class[]{TabLayout.h.class, HBSecondaryMenuWindowTabLayout.class, Integer.TYPE, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        if (!hVar.o()) {
            this$0.R(hVar);
            return;
        }
        View viewG = hVar.g();
        kotlin.jvm.internal.f0.m(viewG);
        viewG.findViewById(R.id.icon).setRotation(180.0f);
        TabLayout.TabView view2 = hVar.f55494i;
        kotlin.jvm.internal.f0.o(view2, "view");
        this$0.r0(view2, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n0(TabLayout.h hVar, HBSecondaryMenuWindowTabLayout this$0, View view) {
        if (PatchProxy.proxy(new Object[]{hVar, this$0, view}, null, changeQuickRedirect, true, bb.c.d.f31251g8, new Class[]{TabLayout.h.class, HBSecondaryMenuWindowTabLayout.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        if (hVar.o()) {
            return;
        }
        this$0.R(hVar);
    }

    private final void o0(final int i10, final View view, boolean z10, final ArrayList<View> arrayList, final TextView textView, final int i11) {
        Object[] objArr = {new Integer(i10), view, new Byte(z10 ? (byte) 1 : (byte) 0), arrayList, textView, new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.f31135b8, new Class[]{cls, View.class, Boolean.TYPE, ArrayList.class, TextView.class, cls}, Void.TYPE).isSupported) {
            return;
        }
        final TextView textView2 = (TextView) view.findViewById(R.id.tv_title);
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_check);
        if (z10) {
            textView2.setTextColor(getContext().getResources().getColor(R.color.text_primary_1_color));
            textView2.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
            imageView.setVisibility(0);
        } else {
            textView2.setTextColor(getContext().getResources().getColor(R.color.text_secondary_1_color));
            textView2.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
            imageView.setVisibility(8);
            view.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    HBSecondaryMenuWindowTabLayout.p0(textView, textView2, arrayList, this, i10, i11, view, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0(TextView tabTitle, TextView textView, ArrayList views, HBSecondaryMenuWindowTabLayout this$0, int i10, int i11, View itemView, View view) {
        List<KeyDescObj> data;
        KeyDescObj keyDescObj;
        List<KeyDescObj> data2;
        KeyDescObj keyDescObj2;
        Object[] objArr = {tabTitle, textView, views, this$0, new Integer(i10), new Integer(i11), itemView, view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.d.f31320j8, new Class[]{TextView.class, TextView.class, ArrayList.class, HBSecondaryMenuWindowTabLayout.class, cls, cls, View.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(tabTitle, "$tabTitle");
        kotlin.jvm.internal.f0.p(views, "$views");
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(itemView, "$itemView");
        tabTitle.setText(textView.getText());
        Iterator it = views.iterator();
        while (it.hasNext()) {
            View view2 = (View) it.next();
            kotlin.jvm.internal.f0.m(view2);
            this$0.o0(i10, view2, false, views, tabTitle, i11);
        }
        this$0.o0(i10, itemView, true, views, tabTitle, i11);
        KeyDescObj keyDescObj3 = this$0.Z3.get(i10);
        String key = null;
        String key2 = keyDescObj3 != null ? keyDescObj3.getKey() : null;
        KeyDescObj keyDescObj4 = this$0.Z3.get(i10);
        String key3 = (keyDescObj4 == null || (data2 = keyDescObj4.getData()) == null || (keyDescObj2 = data2.get(i11)) == null) ? null : keyDescObj2.getKey();
        KeyDescObj keyDescObj5 = this$0.Z3.get(i10);
        if (keyDescObj5 != null) {
            keyDescObj5.setDesc(textView.getText().toString());
        }
        KeyDescObj keyDescObj6 = this$0.Z3.get(i10);
        if (keyDescObj6 != null) {
            KeyDescObj keyDescObj7 = this$0.Z3.get(i10);
            if (keyDescObj7 != null && (data = keyDescObj7.getData()) != null && (keyDescObj = data.get(i11)) != null) {
                key = keyDescObj.getKey();
            }
            keyDescObj6.setKey(key);
        }
        a aVar = this$0.Y3;
        if (aVar != null) {
            aVar.b(i10, i11);
        }
        a aVar2 = this$0.Y3;
        if (aVar2 != null) {
            aVar2.a(key2, key3);
        }
        this$0.l0(this$0.Z3);
        this$0.k0();
    }

    private final void q0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31158c8, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        h(new b());
    }

    private final void r0(View view, int i10) {
        if (PatchProxy.proxy(new Object[]{view, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31112a8, new Class[]{View.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new WindowManager.LayoutParams(-1, -1));
        linearLayout.setBackgroundColor(getContext().getResources().getColor(R.color.dialog_scrim_color));
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HBSecondaryMenuWindowTabLayout.s0(this.f67823b, view2);
            }
        });
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f67008a4 = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f67008a4.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f67008a4.setBackgroundResource(R.drawable.white_bottom_8dp);
        this.f67008a4.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HBSecondaryMenuWindowTabLayout.t0(view2);
            }
        });
        scrollView.addView(this.f67008a4);
        linearLayout.addView(scrollView);
        ViewGroup viewGroup = null;
        View viewInflate = View.inflate(getContext(), R.layout.divider, null);
        String str = "inflate(...)";
        kotlin.jvm.internal.f0.o(viewInflate, "inflate(...)");
        this.f67008a4.addView(viewInflate);
        KeyDescObj keyDescObj = this.Z3.get(i10);
        List<KeyDescObj> data = keyDescObj != null ? keyDescObj.getData() : null;
        ArrayList<View> arrayList = new ArrayList<>();
        if (data != null && !data.isEmpty()) {
            int size = data.size();
            int i11 = 0;
            while (i11 < size) {
                KeyDescObj keyDescObj2 = data.get(i11);
                View viewInflate2 = View.inflate(getContext(), R.layout.item_sort_type_menu, viewGroup);
                kotlin.jvm.internal.f0.o(viewInflate2, str);
                ((TextView) viewInflate2.findViewById(R.id.tv_title)).setText(keyDescObj2.getDesc());
                TextView textView = (TextView) view.findViewById(R.id.text1);
                boolean zG = kotlin.jvm.internal.f0.g(textView.getText().toString(), keyDescObj2.getDesc());
                kotlin.jvm.internal.f0.m(textView);
                int i12 = i11;
                ArrayList<View> arrayList2 = arrayList;
                o0(i10, viewInflate2, zG, arrayList, textView, i12);
                arrayList2.add(viewInflate2);
                this.f67008a4.addView(viewInflate2);
                i11 = i12 + 1;
                arrayList = arrayList2;
                str = str;
                size = size;
                data = data;
                viewGroup = null;
            }
            View view2 = new View(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            ic.a aVar = ic.a.f119343a;
            Context context = getContext();
            kotlin.jvm.internal.f0.o(context, "getContext(...)");
            ((ViewGroup.LayoutParams) layoutParams).height = aVar.a(context, 6.0f);
            view2.setLayoutParams(layoutParams);
            this.f67008a4.addView(view2);
        }
        PopupWindow popupWindow = new PopupWindow((View) linearLayout, -1, -1, true);
        this.f67009b4 = popupWindow;
        popupWindow.setTouchable(true);
        this.f67009b4.setBackgroundDrawable(new BitmapDrawable());
        this.f67009b4.setAnimationStyle(0);
        this.f67009b4.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.max.hbcommon.component.t
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                HBSecondaryMenuWindowTabLayout.u0(this.f67920b);
            }
        });
        if (this.f67009b4.isShowing()) {
            return;
        }
        ViewUtils.o0(this.f67009b4, this);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.filter_slide_in);
        animationLoadAnimation.setAnimationListener(new c());
        this.f67008a4.startAnimation(animationLoadAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(HBSecondaryMenuWindowTabLayout this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.d.f31274h8, new Class[]{HBSecondaryMenuWindowTabLayout.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.k0();
    }

    private final void setMinWidth(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.T7, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        try {
            Field declaredField = TabLayout.class.getDeclaredField(ak.aD);
            declaredField.setAccessible(true);
            declaredField.set(this, Integer.valueOf(i10));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void setTabContentStart(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.U7, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        try {
            Field declaredField = TabLayout.class.getDeclaredField(androidx.exifinterface.media.a.W4);
            declaredField.setAccessible(true);
            declaredField.set(this, Integer.valueOf(i10));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void setTabPaddingEnd(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.V7, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        try {
            Field declaredField = TabLayout.class.getDeclaredField(RXScreenCaptureService.KEY_HEIGHT);
            declaredField.setAccessible(true);
            declaredField.set(this, Integer.valueOf(i10));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void setTabPaddingStart(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.W7, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        try {
            Field declaredField = TabLayout.class.getDeclaredField("f");
            declaredField.setAccessible(true);
            declaredField.set(this, Integer.valueOf(i10));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(HBSecondaryMenuWindowTabLayout this$0) {
        if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, bb.c.d.f31297i8, new Class[]{HBSecondaryMenuWindowTabLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.v0();
    }

    private final void v0() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31205e8, new Class[0], Void.TYPE).isSupported && this.Z3.size() == getTabCount()) {
            int tabCount = getTabCount();
            for (int i10 = 0; i10 < tabCount; i10++) {
                TabLayout.h hVarD = D(i10);
                if (hVarD != null) {
                    KeyDescObj keyDescObj = this.Z3.get(i10);
                    kotlin.jvm.internal.f0.m(keyDescObj);
                    if (kotlin.jvm.internal.f0.g("1", keyDescObj.getMulti())) {
                        View viewG = hVarD.g();
                        kotlin.jvm.internal.f0.m(viewG);
                        viewG.findViewById(R.id.icon).setRotation(0.0f);
                    }
                }
            }
        }
    }

    @dl.d
    public final ArrayList<KeyDescObj> getMPageList() {
        return this.Z3;
    }

    @dl.e
    public final a getOnSecondWindowItemCheckedListener() {
        return this.Y3;
    }

    public final void k0() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2500, new Class[0], Void.TYPE).isSupported && this.f67009b4.isShowing()) {
            this.f67009b4.dismiss();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071 A[SYNTHETIC] */
    public final void l0(@dl.e ArrayList<KeyDescObj> arrayList) {
        TabLayout.TabView tabView;
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, bb.c.d.X7, new Class[]{ArrayList.class}, Void.TYPE).isSupported || arrayList == null) {
            return;
        }
        this.Z3 = arrayList;
        int tabCount = getTabCount();
        for (final int i10 = 0; i10 < tabCount; i10++) {
            final TabLayout.h hVarD = D(i10);
            if (hVarD != null && (tabView = hVarD.f55494i) != null) {
                tabView.removeAllViews();
            }
            if (hVarD != null) {
                KeyDescObj keyDescObj = arrayList.get(i10);
                if (kotlin.jvm.internal.f0.g("1", keyDescObj != null ? keyDescObj.getMulti() : null)) {
                    hVarD.v(j0(i10));
                    hVarD.f55494i.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.p
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            HBSecondaryMenuWindowTabLayout.m0(hVarD, this, i10, view);
                        }
                    });
                } else if (hVarD != null) {
                    hVarD.f55494i.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.q
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            HBSecondaryMenuWindowTabLayout.n0(hVarD, this, view);
                        }
                    });
                    hVarD.v(i0(i10));
                }
            } else if (hVarD != null) {
                hVarD.f55494i.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HBSecondaryMenuWindowTabLayout.n0(hVarD, this, view);
                    }
                });
                hVarD.v(i0(i10));
            }
        }
    }

    public final void setMPageList(@dl.d ArrayList<KeyDescObj> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, bb.c.d.S7, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(arrayList, "<set-?>");
        this.Z3 = arrayList;
    }

    public final void setOnSecondWindowItemCheckedListener(@dl.e a aVar) {
        this.Y3 = aVar;
    }
}
