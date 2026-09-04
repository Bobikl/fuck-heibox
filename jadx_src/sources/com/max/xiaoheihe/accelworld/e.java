package com.max.xiaoheihe.accelworld;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.widget.TextView;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.hbexpression.widget.SimpleMarkerViewSpan;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AccelWordTextView.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void a(@dl.e TextView textView, int i10, @androidx.annotation.n int i11) {
        Object[] objArr = {textView, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.ov, new Class[]{TextView.class, cls, cls}, Void.TYPE).isSupported || textView == null) {
            return;
        }
        e(textView, R.drawable.special_right_small_line_24x24, i10, i11);
    }

    @dl.d
    public static final SimpleMarkerViewSpan b(@dl.d Context context, @dl.d String name, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, name, new Float(f10)}, null, changeQuickRedirect, true, bb.c.m.qv, new Class[]{Context.class, String.class, Float.TYPE}, SimpleMarkerViewSpan.class);
        if (patchProxyResultProxy.isSupported) {
            return (SimpleMarkerViewSpan) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(name, "name");
        SimpleMarkerViewSpan simpleMarkerViewSpan = new SimpleMarkerViewSpan();
        TextView textView = new TextView(context);
        textView.setText(name);
        textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.click_blue));
        textView.setTextSize(ViewUtils.i0(context, f10));
        simpleMarkerViewSpan.e(context, textView, 0, 4);
        return simpleMarkerViewSpan;
    }

    @dl.d
    public static final SimpleMarkerViewSpan c(@dl.d Context context, @dl.d String timeAndIpDesc, @androidx.annotation.n int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, timeAndIpDesc, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.rv, new Class[]{Context.class, String.class, Integer.TYPE}, SimpleMarkerViewSpan.class);
        if (patchProxyResultProxy.isSupported) {
            return (SimpleMarkerViewSpan) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(timeAndIpDesc, "timeAndIpDesc");
        SimpleMarkerViewSpan simpleMarkerViewSpan = new SimpleMarkerViewSpan();
        HBLineHeightTextView hBLineHeightTextView = new HBLineHeightTextView(context);
        hBLineHeightTextView.setText(timeAndIpDesc);
        hBLineHeightTextView.setTextColor(com.max.xiaoheihe.utils.d.E(i10));
        hBLineHeightTextView.setTextSize(1, 10.0f);
        hBLineHeightTextView.setIncludeFontPadding(false);
        hBLineHeightTextView.setCustomLineHeight(ViewUtils.f(context, 13.0f));
        simpleMarkerViewSpan.e(context, hBLineHeightTextView, 0, 0);
        return simpleMarkerViewSpan;
    }

    public static /* synthetic */ SimpleMarkerViewSpan d(Context context, String str, int i10, int i11, Object obj) {
        Object[] objArr = {context, str, new Integer(i10), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.sv, new Class[]{Context.class, String.class, cls, cls, Object.class}, SimpleMarkerViewSpan.class);
        if (patchProxyResultProxy.isSupported) {
            return (SimpleMarkerViewSpan) patchProxyResultProxy.result;
        }
        if ((i11 & 4) != 0) {
            i10 = R.color.text_secondary_1_color;
        }
        return c(context, str, i10);
    }

    public static final void e(@dl.e TextView textView, @androidx.annotation.v int i10, int i11, @androidx.annotation.n int i12) {
        Object[] objArr = {textView, new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.nv, new Class[]{TextView.class, cls, cls, cls}, Void.TYPE).isSupported || textView == null) {
            return;
        }
        Drawable drawableI = androidx.core.content.d.i(textView.getContext(), i10);
        int iApplyDimension = (int) TypedValue.applyDimension(1, i11, textView.getResources().getDisplayMetrics());
        if (drawableI != null) {
            drawableI.setBounds(0, 0, iApplyDimension, iApplyDimension);
        }
        if (drawableI != null) {
            androidx.core.graphics.drawable.d.n(drawableI, androidx.core.content.d.f(textView.getContext(), i12));
        }
        textView.setCompoundDrawables(null, null, drawableI, null);
    }

    public static final void f(@dl.e TextView textView, int i10, int i11, int i12, int i13) {
        Object[] objArr = {textView, new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.pv, new Class[]{TextView.class, cls, cls, cls, cls}, Void.TYPE).isSupported || textView == null) {
            return;
        }
        textView.setPadding((int) TypedValue.applyDimension(1, i10, textView.getResources().getDisplayMetrics()), (int) TypedValue.applyDimension(1, i11, textView.getResources().getDisplayMetrics()), (int) TypedValue.applyDimension(1, i12, textView.getResources().getDisplayMetrics()), (int) TypedValue.applyDimension(1, i13, textView.getResources().getDisplayMetrics()));
    }
}
