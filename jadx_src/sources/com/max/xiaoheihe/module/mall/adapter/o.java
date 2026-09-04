package com.max.xiaoheihe.module.mall.adapter;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.mall.MallProductObj;
import com.max.xiaoheihe.bean.mall.purchase.FlagsV2Obj;
import com.max.xiaoheihe.module.mall.component.MallProductViewV2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: MallProductAdapterV2.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nMallProductAdapterV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MallProductAdapterV2.kt\ncom/max/xiaoheihe/module/mall/adapter/RefreshTagsAction\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,840:1\n1855#2,2:841\n1855#2,2:843\n*S KotlinDebug\n*F\n+ 1 MallProductAdapterV2.kt\ncom/max/xiaoheihe/module/mall/adapter/RefreshTagsAction\n*L\n383#1:841,2\n386#1:843,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f89996b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f89997a;

    public o(int i10) {
        this.f89997a = i10;
    }

    private final int b(int i10, int i11, int i12, int i13) {
        return i11 + i10 + (i12 * 2) + i13;
    }

    private final void c(FlexboxLayout flexboxLayout, List<FlagsV2Obj> list, int i10) {
        if (PatchProxy.proxy(new Object[]{flexboxLayout, list, new Integer(i10)}, this, changeQuickRedirect, false, 41181, new Class[]{FlexboxLayout.class, List.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Context context = flexboxLayout.getContext();
        flexboxLayout.removeAllViews();
        if (list == null || list.isEmpty()) {
            flexboxLayout.setVisibility(8);
            return;
        }
        flexboxLayout.setVisibility(0);
        f0.o(context, "context");
        int iC = com.max.xiaoheihe.accelworld.l.c(6.0f, context);
        int iC2 = com.max.xiaoheihe.accelworld.l.c(4.0f, context);
        int size = list.size();
        int iB = 0;
        for (int i11 = 0; i11 < size && i11 <= 2; i11++) {
            FlagsV2Obj flagsV2Obj = list.get(i11);
            String text = flagsV2Obj.getText();
            if (!(text == null || text.length() == 0)) {
                TextView textViewG = g(context, flagsV2Obj, iC2, text);
                int i12 = f(flexboxLayout) ? iC : 0;
                iB = b(iB, e(textViewG, text), iC2, i12);
                if (iB > i10) {
                    return;
                }
                j(textViewG, i12);
                flexboxLayout.addView(textViewG);
            }
        }
    }

    private final GradientDrawable d(FlagsV2Obj flagsV2Obj, Context context) {
        GradientDrawable gradientDrawableI;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{flagsV2Obj, context}, this, changeQuickRedirect, false, 41183, new Class[]{FlagsV2Obj.class, Context.class}, GradientDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (GradientDrawable) patchProxyResultProxy.result;
        }
        String border_color = flagsV2Obj.getBorder_color();
        int iD = border_color != null ? com.max.hbutils.utils.a.d(border_color) : androidx.core.content.d.f(context, R.color.transparent);
        List<String> text_bg_colors = flagsV2Obj.getText_bg_colors();
        if (text_bg_colors == null || (gradientDrawableI = k(text_bg_colors, context)) == null) {
            gradientDrawableI = i(context);
        }
        gradientDrawableI.setShape(0);
        gradientDrawableI.setCornerRadius(com.max.accelworld.c.a(2.0f, context));
        return com.max.hbutils.utils.q.O(gradientDrawableI, context, iD, 0.5f);
    }

    private final int e(TextView textView, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{textView, str}, this, changeQuickRedirect, false, 41187, new Class[]{TextView.class, String.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (int) ViewUtils.S(textView.getPaint(), str);
    }

    private final boolean f(FlexboxLayout flexboxLayout) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{flexboxLayout}, this, changeQuickRedirect, false, 41186, new Class[]{FlexboxLayout.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return flexboxLayout.getChildCount() > 0;
    }

    private final TextView g(Context context, FlagsV2Obj flagsV2Obj, int i10, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, flagsV2Obj, new Integer(i10), str}, this, changeQuickRedirect, false, 41182, new Class[]{Context.class, FlagsV2Obj.class, Integer.TYPE, String.class}, TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = new TextView(context);
        textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
        textView.setPadding(i10, com.max.xiaoheihe.accelworld.l.c(1.0f, context), i10, com.max.xiaoheihe.accelworld.l.c(1.0f, context));
        textView.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.text_size_10));
        String text_color = flagsV2Obj.getText_color();
        textView.setTextColor(text_color != null ? com.max.hbutils.utils.a.d(text_color) : androidx.core.content.d.f(context, R.color.text_secondary_1_color));
        textView.setBackground(d(flagsV2Obj, context));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMinHeight(com.max.xiaoheihe.accelworld.l.c(16.0f, context));
        textView.setGravity(17);
        textView.setText(str);
        return textView;
    }

    private final List<FlagsV2Obj> h(Context context, MallProductObj mallProductObj) {
        List<String> flags;
        List<FlagsV2Obj> flags_v2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, mallProductObj}, this, changeQuickRedirect, false, 41180, new Class[]{Context.class, MallProductObj.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        if (mallProductObj != null && (flags_v2 = mallProductObj.getFlags_v2()) != null) {
            Iterator<T> it = flags_v2.iterator();
            while (it.hasNext()) {
                arrayList.add((FlagsV2Obj) it.next());
            }
        }
        if (mallProductObj != null && (flags = mallProductObj.getFlags()) != null) {
            Iterator<T> it2 = flags.iterator();
            while (it2.hasNext()) {
                arrayList.add(new FlagsV2Obj((String) it2.next(), com.max.accelworld.a.c(androidx.core.content.d.f(context, R.color.text_secondary_1_color)), com.max.accelworld.a.c(androidx.core.content.d.f(context, R.color.text_secondary_2_color)), null));
            }
        }
        return arrayList;
    }

    private final GradientDrawable i(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 41184, new Class[]{Context.class}, GradientDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (GradientDrawable) patchProxyResultProxy.result;
        }
        int iF = androidx.core.content.d.f(context, R.color.transparent);
        return new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{iF, iF});
    }

    private final void j(TextView textView, int i10) {
        if (PatchProxy.proxy(new Object[]{textView, new Integer(i10)}, this, changeQuickRedirect, false, 41188, new Class[]{TextView.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(-2, -2);
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i10;
        textView.setLayoutParams(layoutParams);
    }

    private final GradientDrawable k(List<String> list, Context context) {
        GradientDrawable gradientDrawable;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, context}, this, changeQuickRedirect, false, 41185, new Class[]{List.class, Context.class}, GradientDrawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (GradientDrawable) patchProxyResultProxy.result;
        }
        if (list == null) {
            return null;
        }
        int size = list.size();
        if (size == 1) {
            gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{com.max.hbutils.utils.a.d(list.get(0)), com.max.hbutils.utils.a.d(list.get(0))});
        } else {
            if (size != 2) {
                return null;
            }
            gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{com.max.hbutils.utils.a.d(list.get(0)), com.max.hbutils.utils.a.d(list.get(1))});
        }
        return gradientDrawable;
    }

    public final void a(@dl.d MallProductViewV2 mallProductView, @dl.e MallProductObj mallProductObj) {
        if (PatchProxy.proxy(new Object[]{mallProductView, mallProductObj}, this, changeQuickRedirect, false, 41179, new Class[]{MallProductViewV2.class, MallProductObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mallProductView, "mallProductView");
        FlexboxLayout flTags = mallProductView.getFlTags();
        Context context = mallProductView.getContext();
        f0.o(context, "context");
        List<FlagsV2Obj> listH = h(context, mallProductObj);
        int i10 = this.f89997a;
        Context context2 = mallProductView.getContext();
        f0.o(context2, "context");
        c(flTags, listH, i10 - com.max.accelworld.c.c(20, context2));
    }
}
