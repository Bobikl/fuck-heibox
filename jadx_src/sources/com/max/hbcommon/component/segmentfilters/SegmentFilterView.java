package com.max.hbcommon.component.segmentfilters;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.R;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: SegmentFilterView.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nSegmentFilterView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentFilterView.kt\ncom/max/hbcommon/component/segmentfilters/SegmentFilterView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,440:1\n169#2,2:441\n*S KotlinDebug\n*F\n+ 1 SegmentFilterView.kt\ncom/max/hbcommon/component/segmentfilters/SegmentFilterView\n*L\n375#1:441,2\n*E\n"})
public final class SegmentFilterView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f67873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f67874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f67875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f67876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f67877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f67878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f67879h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f67880i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f67881j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private a f67882k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private KeyDescObj f67883l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private List<KeyDescObj> f67884m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final q0 f67885n;

    /* JADX INFO: compiled from: SegmentFilterView.kt */
    public interface a {
        void a(@dl.d KeyDescObj keyDescObj, int i10);
    }

    public SegmentFilterView(@dl.e Context context) {
        this(context, null);
    }

    public SegmentFilterView(@dl.e Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SegmentFilterView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SegmentFilterView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f67874c = true;
        this.f67877f = R.color.text_primary_1_color;
        this.f67878g = R.color.text_secondary_1_color;
        this.f67879h = R.color.background_layer_2_color;
        this.f67880i = R.color.transparent;
        this.f67881j = R.color.divider_primary_1_color;
        this.f67884m = new ArrayList();
        this.f67885n = r0.a(e1.e());
        f(attributeSet);
    }

    public static final /* synthetic */ TextView a(SegmentFilterView segmentFilterView, KeyDescObj keyDescObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{segmentFilterView, keyDescObj}, null, changeQuickRedirect, true, bb.c.e.f31816h4, new Class[]{SegmentFilterView.class, KeyDescObj.class}, TextView.class);
        return patchProxyResultProxy.isSupported ? (TextView) patchProxyResultProxy.result : segmentFilterView.e(keyDescObj);
    }

    public static final /* synthetic */ void b(SegmentFilterView segmentFilterView) {
        if (PatchProxy.proxy(new Object[]{segmentFilterView}, null, changeQuickRedirect, true, bb.c.e.f31833i4, new Class[]{SegmentFilterView.class}, Void.TYPE).isSupported) {
            return;
        }
        segmentFilterView.k();
    }

    private final TextView e(KeyDescObj keyDescObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{keyDescObj}, this, changeQuickRedirect, false, bb.c.e.Z3, new Class[]{KeyDescObj.class}, TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = new TextView(getContext());
        textView.setId(R.id.tv_num);
        textView.setText(String.valueOf(com.max.hbutils.utils.n.q(keyDescObj.getNum())));
        textView.setTextSize(1, 8.0f);
        textView.setTextColor(androidx.core.content.res.i.e(getContext().getResources(), R.color.text_secondary_1_color, null));
        textView.setGravity(17);
        textView.setTypeface(bb.d.a().b(2));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        textView.setLayoutParams(layoutParams);
        int i10 = R.id.tv_tab_title;
        layoutParams.addRule(17, i10);
        layoutParams.addRule(6, i10);
        layoutParams.setMarginStart(ViewUtils.f(getContext(), 2.0f));
        layoutParams.topMargin = -ViewUtils.f(getContext(), 1.0f);
        return textView;
    }

    private final void k() {
        com.max.hbresource.a aVar;
        int i10;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31782f4, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof RelativeLayout) {
                Object tag = childAt.getTag();
                f0.n(tag, "null cannot be cast to non-null type com.max.hbcommon.bean.KeyDescObj");
                KeyDescObj keyDescObj = (KeyDescObj) tag;
                if (keyDescObj.isChecked()) {
                    ((RelativeLayout) childAt).setBackground(com.max.hbutils.utils.q.o(getContext(), this.f67879h, ViewUtils.h0(getContext(), ViewUtils.m(getContext(), ViewUtils.W(childAt), ViewUtils.f(getContext(), 30.0f)))));
                } else {
                    childAt.setBackgroundResource(this.f67880i);
                }
                int color = getContext().getResources().getColor(keyDescObj.isChecked() ? this.f67877f : this.f67878g);
                TextView textView = (TextView) childAt.findViewById(R.id.tv_tab_title);
                if (keyDescObj.isChecked()) {
                    aVar = com.max.hbresource.a.f71893a;
                    i10 = com.max.hbresource.a.f71895c;
                } else {
                    aVar = com.max.hbresource.a.f71893a;
                    i10 = com.max.hbresource.a.f71894b;
                }
                textView.setTypeface(aVar.a(i10));
                textView.setTextColor(color);
                ImageView imageView = (ImageView) childAt.findViewById(R.id.tv_icon);
                if (imageView != null) {
                    imageView.setColorFilter(color);
                }
                TextView textView2 = (TextView) childAt.findViewById(R.id.tv_num);
                if (com.max.hbutils.utils.n.q(keyDescObj.getNum()) > 0) {
                    if (textView2 == null) {
                        ((RelativeLayout) childAt).addView(e(keyDescObj));
                    } else {
                        textView2.setText(String.valueOf(com.max.hbutils.utils.n.q(keyDescObj.getNum())));
                    }
                } else if (textView2 != null) {
                    textView2.setVisibility(8);
                }
            } else {
                Object tag2 = getChildAt(i11 - 1).getTag();
                f0.n(tag2, "null cannot be cast to non-null type com.max.hbcommon.bean.KeyDescObj");
                KeyDescObj keyDescObj2 = (KeyDescObj) tag2;
                int i12 = i11 + 1;
                KeyDescObj keyDescObj3 = null;
                View childAt2 = i12 < childCount ? getChildAt(i12) : null;
                if (childAt2 != null) {
                    Object tag3 = childAt2.getTag();
                    f0.n(tag3, "null cannot be cast to non-null type com.max.hbcommon.bean.KeyDescObj");
                    keyDescObj3 = (KeyDescObj) tag3;
                }
                boolean z10 = keyDescObj3 != null && keyDescObj3.isChecked();
                if (keyDescObj2.isChecked() || z10) {
                    childAt.setVisibility(4);
                } else {
                    childAt.setVisibility(0);
                }
            }
        }
    }

    public final void c(int i10) {
        if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.e.f31697a4, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && i10 >= 0 && i10 < this.f67884m.size()) {
            KeyDescObj keyDescObj = this.f67884m.get(i10);
            if (keyDescObj.isChecked()) {
                return;
            }
            com.max.hbcommon.utils.g.c(this.f67884m, keyDescObj);
            k();
            this.f67883l = keyDescObj;
            a aVar = this.f67882k;
            if (aVar != null) {
                aVar.a(keyDescObj, i10);
            }
        }
    }

    public final void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.X3, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        j();
    }

    public final void f(@dl.e AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, bb.c.e.W3, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        setGravity(16);
        setOrientation(0);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.S2);
        f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f67873b = typedArrayObtainStyledAttributes.getDimension(R.styleable.SegmentFilterView_divLineHeight, ViewUtils.f(getContext(), 18.0f));
        this.f67874c = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SegmentFilterView_isAverage, true);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SegmentFilterView_backgroundColorRes, R.color.background_card_1_color);
        this.f67875d = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SegmentFilterView_isShowIcon, false);
        this.f67876e = ViewUtils.i0(getContext(), typedArrayObtainStyledAttributes.getDimension(R.styleable.SegmentFilterView_tabTextSize, ViewUtils.f(getContext(), 14.0f)));
        setBackground(ViewUtils.H(ViewUtils.m(getContext(), ViewUtils.W(this), ViewUtils.f(getContext(), 30.0f)), getContext().getResources().getColor(resourceId), getContext().getResources().getColor(resourceId)));
    }

    public final boolean g() {
        return this.f67874c;
    }

    @dl.e
    public final KeyDescObj getCurrent() {
        return this.f67883l;
    }

    public final int getCurrentIndex() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31714b4, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : CollectionsKt___CollectionsKt.Y2(this.f67884m, this.f67883l);
    }

    public final float getDivLineHeight() {
        return this.f67873b;
    }

    public final int getLineColorId() {
        return this.f67881j;
    }

    @dl.d
    public final List<KeyDescObj> getList() {
        return this.f67884m;
    }

    @dl.e
    public final a getMOnTabCheckedListener() {
        return this.f67882k;
    }

    @dl.d
    public final q0 getMainScope() {
        return this.f67885n;
    }

    public final int getNormalBgColorId() {
        return this.f67880i;
    }

    public final int getNormalTextColorId() {
        return this.f67878g;
    }

    public final int getSelectBgColorId() {
        return this.f67879h;
    }

    public final int getSelectTextColorId() {
        return this.f67877f;
    }

    public final float getTextSize() {
        return this.f67876e;
    }

    @qa.a(note = "设置模块是否平均分配宽度")
    public final void h(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.e.f31731c4, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f67874c = z10;
        j();
    }

    public final boolean i() {
        return this.f67875d;
    }

    public final void j() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.Y3, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        KeyDescObj keyDescObjA = com.max.hbcommon.utils.g.a(this.f67884m);
        if (this.f67884m.size() <= 0) {
            kotlinx.coroutines.k.f(this.f67885n, null, null, new SegmentFilterView$refresh$2(this, null), 3, null);
            return;
        }
        if (keyDescObjA == null) {
            if (this.f67883l != null) {
                for (KeyDescObj keyDescObj : this.f67884m) {
                    KeyDescObj keyDescObj2 = this.f67883l;
                    if (f0.g(keyDescObj2 != null ? keyDescObj2.getKey() : null, keyDescObj.getKey())) {
                        keyDescObjA = keyDescObj;
                        break;
                    }
                }
            } else {
                this.f67883l = this.f67884m.get(0);
            }
            if (keyDescObjA != null) {
                com.max.hbcommon.utils.g.c(this.f67884m, keyDescObjA);
            } else {
                List<KeyDescObj> list = this.f67884m;
                com.max.hbcommon.utils.g.c(list, list.get(0));
            }
        } else {
            com.max.hbcommon.utils.g.c(this.f67884m, keyDescObjA);
        }
        kotlinx.coroutines.k.f(this.f67885n, null, null, new SegmentFilterView$refresh$1(this, null), 3, null);
    }

    public final void setAverage(boolean z10) {
        this.f67874c = z10;
    }

    public final void setCurrent(@dl.e KeyDescObj keyDescObj) {
        this.f67883l = keyDescObj;
    }

    public final void setData(@dl.e List<KeyDescObj> list) {
        if (list != null) {
            this.f67884m = list;
        }
    }

    public final void setDivLineHeight(float f10) {
        this.f67873b = f10;
    }

    @qa.a(note = "设置分割线高度")
    public final void setDividerLineHeight(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.e.f31765e4, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f67873b = ViewUtils.f(getContext(), f10);
        j();
    }

    public final void setLineColorId(int i10) {
        this.f67881j = i10;
    }

    public final void setList(@dl.d List<KeyDescObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.e.V3, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.f67884m = list;
    }

    public final void setLittleWhiteStyle() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31799g4, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f67874c = false;
        int iF = ViewUtils.f(getContext(), 3.0f);
        Resources resources = getContext().getResources();
        int i10 = R.color.white_alpha5;
        setBackground(ViewUtils.G(iF, androidx.core.content.res.i.e(resources, i10, null)));
        this.f67878g = R.color.white_alpha50;
        this.f67877f = R.color.white_alpha80;
        this.f67879h = i10;
        this.f67881j = i10;
        this.f67873b = ViewUtils.f(getContext(), 12.0f);
        int iF2 = ViewUtils.f(getContext(), 1.0f);
        setPadding(iF2, iF2, iF2, iF2);
        setTabTextSize(12.0f);
    }

    public final void setMOnTabCheckedListener(@dl.e a aVar) {
        this.f67882k = aVar;
    }

    public final void setNormalBgColorId(int i10) {
        this.f67880i = i10;
    }

    public final void setNormalTextColorId(int i10) {
        this.f67878g = i10;
    }

    public final void setSelectBgColorId(int i10) {
        this.f67879h = i10;
    }

    public final void setSelectTextColorId(int i10) {
        this.f67877f = i10;
    }

    public final void setShowIcon(boolean z10) {
        this.f67875d = z10;
    }

    @qa.a
    public final void setTabTextSize(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.e.f31748d4, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f67876e = f10;
        j();
    }

    public final void setTextSize(float f10) {
        this.f67876e = f10;
    }
}
