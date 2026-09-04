package com.max.xiaoheihe.module.bbs.adapter;

import android.content.Context;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.ap;
import df.ve;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TopicAdaterHelper.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final v f80640a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f80641b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    private v() {
    }

    public final int a(@dl.d Context context, int i10, int i11, int i12) {
        Object[] objArr = {context, new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 27475, new Class[]{Context.class, cls, cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(context, "context");
        return ((ViewUtils.L(context) - (i10 * 2)) - (i11 * i12)) / (i12 - 1);
    }

    public final int b(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 27474, new Class[]{Context.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(context, "context");
        return ViewUtils.L(context) > ViewUtils.f(context, 390.0f) ? 5 : 4;
    }

    public final void c(@dl.d Context context, @dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BBSTopicObj data) {
        if (PatchProxy.proxy(new Object[]{context, viewHolder, data}, this, changeQuickRedirect, false, 27470, new Class[]{Context.class, com.max.hbcommon.base.adapter.s.e.class, BBSTopicObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        ve veVarA = ve.a(viewHolder.itemView);
        f0.o(veVarA, "bind(viewHolder.itemView)");
        veVarA.f116831g.setBackground(com.max.hbutils.utils.q.v(context, com.max.xiaoheihe.utils.d.e1(data.getSmall_pic_main_color()), 5.0f));
        QMUIRadiusImageView qMUIRadiusImageView = veVarA.f116828d;
        qMUIRadiusImageView.setCornerRadius(ViewUtils.o(context, qMUIRadiusImageView));
        com.max.hbimage.b.K(data.getSmall_pic_url(), veVarA.f116828d);
        veVarA.f116830f.setText(data.getName());
        veVarA.f116829e.setText(data.getExtra_desc());
    }

    public final void d(@dl.d Context mContext, @dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BBSTopicObj data, boolean z10, boolean z11) {
        Object[] objArr = {mContext, viewHolder, data, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 27471, new Class[]{Context.class, com.max.hbcommon.base.adapter.s.e.class, BBSTopicObj.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mContext, "mContext");
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        ap apVarA = ap.a(viewHolder.itemView);
        f0.o(apVarA, "bind(viewHolder.itemView)");
        f(mContext, apVarA, data);
        e(mContext, z10, apVarA);
        if (z11) {
            apVarA.f108606e.setVisibility(0);
        } else {
            apVarA.f108606e.setVisibility(8);
        }
    }

    public final void e(@dl.d Context mContext, boolean z10, @dl.d ap itemBinding) {
        if (PatchProxy.proxy(new Object[]{mContext, new Byte(z10 ? (byte) 1 : (byte) 0), itemBinding}, this, changeQuickRedirect, false, 27473, new Class[]{Context.class, Boolean.TYPE, ap.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mContext, "mContext");
        f0.p(itemBinding, "itemBinding");
        if (z10) {
            itemBinding.f108606e.setBackground(com.max.hbutils.utils.q.o(mContext, R.color.text_secondary_2_color, 8.0f));
            itemBinding.f108603b.setImageResource(R.drawable.special_minus_small_line_24x24);
        } else {
            itemBinding.f108606e.setBackground(ViewUtils.i(ViewUtils.f(mContext, 8.0f), com.max.xiaoheihe.utils.d.E(R.color.icon_gradient_dark_start_color), com.max.xiaoheihe.utils.d.E(R.color.icon_gradient_dark_end_color)));
            itemBinding.f108603b.setImageResource(R.drawable.special_add_small_line_24x24);
        }
    }

    public final void f(@dl.d Context mContext, @dl.d ap itemBinding, @dl.d BBSTopicObj data) {
        if (PatchProxy.proxy(new Object[]{mContext, itemBinding, data}, this, changeQuickRedirect, false, 27472, new Class[]{Context.class, ap.class, BBSTopicObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mContext, "mContext");
        f0.p(itemBinding, "itemBinding");
        f0.p(data, "data");
        QMUIRadiusImageView qMUIRadiusImageView = itemBinding.f108604c;
        qMUIRadiusImageView.setCornerRadius(ViewUtils.o(mContext, qMUIRadiusImageView));
        com.max.hbimage.b.U(data.getSmall_pic_url(), itemBinding.f108604c, com.max.hbutils.utils.q.m(mContext, itemBinding.f108604c, ViewUtils.f(mContext, 46.0f)));
        itemBinding.f108605d.setText(data.getName());
        if (ViewUtils.S(itemBinding.f108605d.getPaint(), data.getName()) > ViewUtils.f(mContext, 70.0f)) {
            itemBinding.f108605d.setTextSize(1, 10.0f);
        } else {
            itemBinding.f108605d.setTextSize(1, 11.0f);
        }
    }
}
