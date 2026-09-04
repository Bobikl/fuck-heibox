package com.max.xiaoheihe.module.bbs.adapter.viewholderbinder;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbsearch.SearchNewActivity;
import com.max.hbsearch.p;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.WikiOrArticleWrapperObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: WikiListTitleVHB.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class g extends j {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f80686f = 0;

    /* JADX INFO: compiled from: WikiListTitleVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WikiOrArticleWrapperObj f80688c;

        a(WikiOrArticleWrapperObj wikiOrArticleWrapperObj) {
            this.f80688c = wikiOrArticleWrapperObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27551, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if ((g.this.j() instanceof SearchNewActivity) && this.f80688c.getArticle() != null) {
                com.max.hbcommon.utils.k.f(this.f80688c.getArticle().getReport_id(), UiKitSpanObj.TYPE_CLICK, this.f80688c.getArticle().getCustom_index(), this.f80688c.getArticle().getCustom_suggested_from());
            }
            p pVarK = g.this.k();
            if (pVarK != null) {
                pVarK.q(15);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@dl.d i param) {
        super(param);
        f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.viewholderbinder.j
    public void g(@dl.d s.e viewHolder, @dl.d WikiOrArticleWrapperObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 27550, new Class[]{s.e.class, WikiOrArticleWrapperObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        viewHolder.p(R.id.tv_list_title, data.getTitle());
        String title = data.getTitle();
        f0.o(title, "data.title");
        if (StringsKt__StringsKt.W2(title, "词条", false, 2, null)) {
            ViewGroup.LayoutParams layoutParams = viewHolder.b().getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            ((RecyclerView.LayoutParams) layoutParams).setMargins(0, ViewUtils.f(j(), 8.0f), 0, 0);
        }
        if (k() != null) {
            viewHolder.i(R.id.tv_list_more).setVisibility(0);
            viewHolder.itemView.setOnClickListener(new a(data));
        } else {
            viewHolder.i(R.id.tv_list_more).setVisibility(8);
            viewHolder.itemView.setOnClickListener(null);
        }
    }
}
