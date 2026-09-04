package com.max.xiaoheihe.module.bbs.adapter.viewholderbinder;

import android.content.Intent;
import android.view.View;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.WikiOrArticleWrapperObj;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WikiApplyAdditionVHB.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class e extends j {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f80682f = 0;

    /* JADX INFO: compiled from: WikiApplyAdditionVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WikiOrArticleWrapperObj f80683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f80684c;

        a(WikiOrArticleWrapperObj wikiOrArticleWrapperObj, e eVar) {
            this.f80683b = wikiOrArticleWrapperObj;
            this.f80684c = eVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27548, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (this.f80683b.getArticle() != null && this.f80683b.getArticle().getReport_id() != null) {
                com.max.hbcommon.utils.k.f(this.f80683b.getArticle().getReport_id(), UiKitSpanObj.TYPE_CLICK, this.f80683b.getArticle().getCustom_index(), this.f80683b.getArticle().getCustom_suggested_from());
            }
            Intent intent = new Intent(this.f80684c.j(), (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.P2);
            intent.putExtra("title", com.max.xiaoheihe.utils.d.n0(R.string.wiki_addition_form));
            this.f80684c.j().startActivity(intent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@dl.d i param) {
        super(param);
        f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.viewholderbinder.j
    public void g(@dl.d s.e viewHolder, @dl.d WikiOrArticleWrapperObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 27547, new Class[]{s.e.class, WikiOrArticleWrapperObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        viewHolder.itemView.setOnClickListener(new a(data, this));
    }
}
