package com.max.xiaoheihe.module.bbs.adapter.viewholderbinder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.hbsearch.SearchNewActivity;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.WikiListObj;
import com.max.xiaoheihe.bean.bbs.WikiOrArticleWrapperObj;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.v0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: WikiSearchGridVHB.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class h extends j {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f80689f = 0;

    /* JADX INFO: compiled from: WikiSearchGridVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WikiOrArticleWrapperObj f80691c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ WikiListObj f80692d;

        a(WikiOrArticleWrapperObj wikiOrArticleWrapperObj, WikiListObj wikiListObj) {
            this.f80691c = wikiOrArticleWrapperObj;
            this.f80692d = wikiListObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27553, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if ((h.this.j() instanceof SearchNewActivity) && this.f80691c.getArticle() != null && this.f80691c.getArticle().getReport_id() != null) {
                com.max.hbcommon.utils.k.f(this.f80691c.getArticle().getReport_id(), UiKitSpanObj.TYPE_CLICK, this.f80691c.getArticle().getCustom_index(), this.f80691c.getArticle().getCustom_suggested_from());
            }
            WikiListObj wikiListObj = this.f80692d;
            if (wikiListObj != null && !com.max.hbcommon.utils.c.u(wikiListObj.getAppid())) {
                String appid = this.f80692d.getAppid();
                f0.o(appid, "wikidata.appid");
                if (!StringsKt__StringsKt.W2(appid, Constants.ACCEPT_TIME_SEPARATOR_SERVER, false, 2, null)) {
                    h.this.j().startActivity(ChannelsDetailActivity.l3(h.this.j(), null, null, this.f80692d.getAppid(), this.f80692d.getGame_type(), null, null, null, null, "wiki"));
                    return;
                }
            }
            WikiListObj wikiListObj2 = this.f80692d;
            if (wikiListObj2 == null || com.max.hbcommon.utils.c.u(wikiListObj2.getUrl())) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(h.this.j(), this.f80692d.getUrl());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@dl.d i param) {
        super(param);
        f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.viewholderbinder.j
    public void g(@dl.d s.e viewHolder, @dl.d WikiOrArticleWrapperObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 27552, new Class[]{s.e.class, WikiOrArticleWrapperObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        WikiListObj wiki = data.getWiki();
        ImageView imageView = (ImageView) viewHolder.i(R.id.iv_icon);
        TextView textView = (TextView) viewHolder.i(R.id.tv_name);
        TextView textView2 = (TextView) viewHolder.i(R.id.tv_desc);
        if (wiki != null) {
            com.max.hbimage.b.K(wiki.getAppicon(), imageView);
            textView.setText(wiki.getName());
            v0 v0Var = v0.f124986a;
            String strN0 = com.max.xiaoheihe.utils.d.n0(R.string.wiki_article_and_admin_num_format);
            f0.o(strN0, "getString(R.string.wiki_…cle_and_admin_num_format)");
            String str = String.format(strN0, Arrays.copyOf(new Object[]{wiki.getArticle_num()}, 1));
            f0.o(str, "format(format, *args)");
            textView2.setText(str);
        }
        viewHolder.b().setOnClickListener(new a(data, wiki));
    }
}
