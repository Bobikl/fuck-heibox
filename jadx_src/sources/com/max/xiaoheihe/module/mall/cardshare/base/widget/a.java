package com.max.xiaoheihe.module.mall.cardshare.base.widget;

import android.view.View;
import android.widget.LinearLayout;
import com.max.hbcommon.component.bottomsheet.h;
import com.max.hbshare.d;
import com.max.xiaoheihe.accelworld.r;
import com.max.xiaoheihe.bean.ShareInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.x70;
import kotlin.jvm.internal.f0;
import kotlin.text.u;

/* JADX INFO: compiled from: CopyLink.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.mall.cardshare.base.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CopyLink.kt */
    public static final class ViewOnClickListenerC0825a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f90126b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ShareInfoObj f90127c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ LinearLayout f90128d;

        ViewOnClickListenerC0825a(h hVar, ShareInfoObj shareInfoObj, LinearLayout linearLayout) {
            this.f90126b = hVar;
            this.f90127c = shareInfoObj;
            this.f90128d = linearLayout;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            boolean z10 = true;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41203, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f90126b.dismiss();
            tf.a.a(this.f90127c, d.f72588j);
            String copyUrl = this.f90127c.getShare_url();
            if (copyUrl != null && !u.V1(copyUrl)) {
                z10 = false;
            }
            if (z10) {
                r.a("复制失败，链接失效");
                return;
            }
            LinearLayout onClick = this.f90128d;
            f0.o(onClick, "onClick");
            f0.o(copyUrl, "copyUrl");
            com.max.accelworld.b.c(onClick, "", copyUrl);
        }
    }

    @dl.d
    public static final View a(@dl.d h hVar, @dl.d x70 sharePanelViewBinding, @dl.d ShareInfoObj shareInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hVar, sharePanelViewBinding, shareInfoObj}, null, changeQuickRedirect, true, 41202, new Class[]{h.class, x70.class, ShareInfoObj.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(hVar, "<this>");
        f0.p(sharePanelViewBinding, "sharePanelViewBinding");
        f0.p(shareInfoObj, "shareInfoObj");
        LinearLayout linearLayout = sharePanelViewBinding.f117434b;
        linearLayout.setOnClickListener(new ViewOnClickListenerC0825a(hVar, shareInfoObj, linearLayout));
        f0.o(linearLayout, "sharePanelViewBinding.vg…        }\n        }\n    }");
        return linearLayout;
    }
}
