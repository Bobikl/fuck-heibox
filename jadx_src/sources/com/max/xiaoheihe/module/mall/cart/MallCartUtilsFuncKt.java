package com.max.xiaoheihe.module.mall.cart;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.max.hbcommon.utils.c;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.mall.cart.MallProductActionObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MallCartUtilsFunc.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class MallCartUtilsFuncKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: MallCartUtilsFunc.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f90266b;

        a(yh.a<b2> aVar) {
            this.f90266b = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41427, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f90266b.invoke();
        }
    }

    public static final void a(@d final Context mContext, @d ImageView ivCopy, @d TextView tvDesc, @d final MallProductActionObj data) {
        if (PatchProxy.proxy(new Object[]{mContext, ivCopy, tvDesc, data}, null, changeQuickRedirect, true, 41424, new Class[]{Context.class, ImageView.class, TextView.class, MallProductActionObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mContext, "mContext");
        f0.p(ivCopy, "ivCopy");
        f0.p(tvDesc, "tvDesc");
        f0.p(data, "data");
        boolean z10 = !c.u(data.getCdkey());
        yh.a<b2> aVar = new yh.a<b2>() { // from class: com.max.xiaoheihe.module.mall.cart.MallCartUtilsFuncKt$refreshOrderActionItem$copyCdk$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41426, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41425, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.utils.d.o(mContext, data.getCdkey());
                com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.text_copied));
            }
        };
        if (z10) {
            ivCopy.setVisibility(0);
            a aVar2 = new a(aVar);
            ivCopy.setOnClickListener(aVar2);
            tvDesc.setOnClickListener(aVar2);
        } else {
            ivCopy.setVisibility(8);
            ivCopy.setOnClickListener(null);
            tvDesc.setOnClickListener(null);
        }
        tvDesc.setText(data.getCdkey());
    }
}
