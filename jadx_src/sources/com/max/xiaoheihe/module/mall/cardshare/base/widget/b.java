package com.max.xiaoheihe.module.mall.cardshare.base.widget;

import android.view.View;
import android.widget.LinearLayout;
import com.max.hbcommon.component.bottomsheet.h;
import com.max.hbshare.d;
import com.max.xiaoheihe.bean.ShareInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.x70;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CreateSharePost.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: CreateSharePost.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f90129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ShareInfoObj f90130c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f90131d;

        a(h hVar, ShareInfoObj shareInfoObj, yh.a<b2> aVar) {
            this.f90129b = hVar;
            this.f90130c = shareInfoObj;
            this.f90131d = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41205, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f90129b.dismiss();
            tf.a.a(this.f90130c, d.f72590l);
            this.f90131d.invoke();
        }
    }

    @dl.d
    public static final View a(@dl.d h hVar, @dl.d x70 sharePanelViewBinding, @dl.d ShareInfoObj shareInfoObj, @dl.d yh.a<b2> sharePostWidgetClickCallback) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hVar, sharePanelViewBinding, shareInfoObj, sharePostWidgetClickCallback}, null, changeQuickRedirect, true, 41204, new Class[]{h.class, x70.class, ShareInfoObj.class, yh.a.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(hVar, "<this>");
        f0.p(sharePanelViewBinding, "sharePanelViewBinding");
        f0.p(shareInfoObj, "shareInfoObj");
        f0.p(sharePostWidgetClickCallback, "sharePostWidgetClickCallback");
        LinearLayout linearLayout = sharePanelViewBinding.f117435c;
        linearLayout.setOnClickListener(new a(hVar, shareInfoObj, sharePostWidgetClickCallback));
        f0.o(linearLayout, "sharePanelViewBinding.vg…allback()\n        }\n    }");
        return linearLayout;
    }
}
