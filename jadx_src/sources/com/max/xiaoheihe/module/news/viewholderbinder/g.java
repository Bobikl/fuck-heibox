package com.max.xiaoheihe.module.news.viewholderbinder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.news.FeedsContentArtRecObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: NewsArtRecVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class g extends h0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f91420k = 0;

    /* JADX INFO: compiled from: NewsArtRecVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f91422c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ FeedsContentArtRecObj f91423d;

        a(com.max.hbcommon.base.adapter.s.e eVar, FeedsContentArtRecObj feedsContentArtRecObj) {
            this.f91422c = eVar;
            this.f91423d = feedsContentArtRecObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42665, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            g.this.p().a().getDataList().remove(this.f91422c.getAdapterPosition());
            g.this.p().a().notifyItemRemoved(this.f91422c.getAdapterPosition());
            g.M(g.this, this.f91423d, "2");
        }
    }

    /* JADX INFO: compiled from: NewsArtRecVHB.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FeedsContentArtRecObj f91425c;

        b(FeedsContentArtRecObj feedsContentArtRecObj) {
            this.f91425c = feedsContentArtRecObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42666, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            g.M(g.this, this.f91425c, "4");
            com.max.xiaoheihe.base.router.b.e(g.this.p().c(), null, null, null, null, null, 48, null).A();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@dl.d g0 param) {
        super(param);
        kotlin.jvm.internal.f0.p(param, "param");
    }

    public static final /* synthetic */ io.reactivex.disposables.b M(g gVar, FeedsContentArtRecObj feedsContentArtRecObj, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gVar, feedsContentArtRecObj, str}, null, changeQuickRedirect, true, 42664, new Class[]{g.class, FeedsContentArtRecObj.class, String.class}, io.reactivex.disposables.b.class);
        return patchProxyResultProxy.isSupported ? (io.reactivex.disposables.b) patchProxyResultProxy.result : gVar.N(feedsContentArtRecObj, str);
    }

    private final io.reactivex.disposables.b N(FeedsContentArtRecObj feedsContentArtRecObj, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{feedsContentArtRecObj, str}, this, changeQuickRedirect, false, 42663, new Class[]{FeedsContentArtRecObj.class, String.class}, io.reactivex.disposables.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (io.reactivex.disposables.b) patchProxyResultProxy.result;
        }
        io.reactivex.g0 g0VarJ5 = com.max.xiaoheihe.network.i.a().l5(feedsContentArtRecObj.getCard_type(), str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d());
        kotlin.jvm.internal.f0.o(g0VarJ5, "createHeyBoxService()\n  …cribeWith(BaseObserver())");
        return (io.reactivex.disposables.b) g0VarJ5;
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void i(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42661, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        ViewGroup.LayoutParams layoutParams = viewHolder.b().getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RecyclerView.LayoutParams(-1, ViewUtils.f(p().c(), 90.0f));
        }
        viewHolder.b().setLayoutParams(layoutParams);
        layoutParams.height = ((ViewUtils.L(p().c()) - ViewUtils.f(p().c(), 24.0f)) * 9) / 35;
        viewHolder.b().requestLayout();
        FeedsContentArtRecObj feedsContentArtRecObj = (FeedsContentArtRecObj) data;
        ImageView imageView = (ImageView) viewHolder.i(R.id.iv_img);
        TextView textView = (TextView) viewHolder.i(R.id.tv_rec_write);
        ImageView imageView2 = (ImageView) viewHolder.i(R.id.iv_close);
        com.max.hbimage.b.d0(feedsContentArtRecObj.getCard_img(), imageView, ViewUtils.f(p().c(), 2.0f));
        imageView2.setOnClickListener(new a(viewHolder, feedsContentArtRecObj));
        textView.setOnClickListener(new b(feedsContentArtRecObj));
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void w(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BBSLinkObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42662, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
    }
}
