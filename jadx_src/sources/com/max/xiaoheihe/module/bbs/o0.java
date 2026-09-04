package com.max.xiaoheihe.module.bbs;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.PostRecommendDetailObjV2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.a90;
import df.wb;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: UserBBSInfoFragmentKotlin.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nUserBBSInfoFragmentKotlin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserBBSInfoFragmentKotlin.kt\ncom/max/xiaoheihe/module/bbs/UserBBSInfoFragmentKotlinKt\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,56:1\n262#2,2:57\n262#2,2:59\n*S KotlinDebug\n*F\n+ 1 UserBBSInfoFragmentKotlin.kt\ncom/max/xiaoheihe/module/bbs/UserBBSInfoFragmentKotlinKt\n*L\n21#1:57,2\n26#1:59,2\n*E\n"})
public final class o0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: UserBBSInfoFragmentKotlin.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a90 f81430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f81431c;

        a(a90 a90Var, String str) {
            this.f81430b = a90Var;
            this.f81431c = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27057, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = this.f81430b.f108436d.getContext();
            kotlin.jvm.internal.f0.o(context, "tvButton.context");
            com.max.xiaoheihe.base.router.b.k0(context, this.f81431c);
        }
    }

    public static final boolean a(@dl.e wb wbVar, @dl.e PostRecommendDetailObjV2 postRecommendDetailObjV2, @dl.e View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{wbVar, postRecommendDetailObjV2, view}, null, changeQuickRedirect, true, 27056, new Class[]{wb.class, PostRecommendDetailObjV2.class, View.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (wbVar == null) {
            return false;
        }
        ConstraintLayout constraintLayoutB = wbVar.f117119k.b();
        kotlin.jvm.internal.f0.o(constraintLayoutB, "binding.vgRecommendPostV2.root");
        constraintLayoutB.setVisibility(postRecommendDetailObjV2 != null ? 0 : 8);
        if (postRecommendDetailObjV2 == null) {
            return false;
        }
        a90 a90Var = wbVar.f117119k;
        ConstraintLayout root = a90Var.b();
        kotlin.jvm.internal.f0.o(root, "root");
        root.setVisibility(0);
        TextView textView = a90Var.f108438f;
        String title = postRecommendDetailObjV2.getTitle();
        if (title == null) {
            title = "";
        }
        textView.setText(title);
        TextView textView2 = a90Var.f108437e;
        String subtitle = postRecommendDetailObjV2.getSubtitle();
        if (subtitle == null) {
            subtitle = "";
        }
        textView2.setText(subtitle);
        TextView textView3 = a90Var.f108436d;
        String botton_name = postRecommendDetailObjV2.getBotton_name();
        textView3.setText(botton_name != null ? botton_name : "");
        if (postRecommendDetailObjV2.getThumb() != null) {
            Glide.G(a90Var.f108434b).load(postRecommendDetailObjV2.getThumb()).C1(a90Var.f108434b);
        }
        com.max.xiaoheihe.accelworld.e.a(a90Var.f108436d, 14, R.color.text_secondary_2_color);
        com.max.xiaoheihe.accelworld.e.f(a90Var.f108436d, 12, 0, 8, 0);
        com.max.xiaoheihe.accelworld.l.q(a90Var.f108436d, R.color.date_picker_mark_count_enabled_day_text_color, 2.0f);
        String protocol = postRecommendDetailObjV2.getProtocol();
        if (protocol != null) {
            a90Var.f108436d.setOnClickListener(new a(a90Var, protocol));
        }
        if (view != null) {
            wbVar.f117113e.b().setVisibility(8);
            Space space = wbVar.f117119k.f108435c;
            kotlin.jvm.internal.f0.o(space, "binding.vgRecommendPostV2.space");
            ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
            layoutParams.height = ViewUtils.V(view) + ViewUtils.f(view.getContext(), 4.0f);
            space.setLayoutParams(layoutParams);
            view.setVisibility(0);
        }
        return true;
    }
}
