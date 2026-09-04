package com.max.xiaoheihe.module.search.page;

import android.os.Bundle;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.GridLayoutManager;
import com.max.hbcommon.bean.WikiObj;
import com.max.hbsearch.bean.SearchHotwordObj;
import com.max.hbsearch.y0;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.SearchWikiListObj;
import com.max.xiaoheihe.bean.bbs.WikiArticelObj;
import com.max.xiaoheihe.bean.bbs.WikiListObj;
import com.max.xiaoheihe.bean.bbs.WikiOrArticleWrapperObj;
import com.max.xiaoheihe.module.bbs.adapter.a0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: SearchWikiFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class k extends y0 {

    @dl.d
    public static final a K = new a(null);
    public static final int L = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    private final ArrayList<WikiOrArticleWrapperObj> I = new ArrayList<>();

    @dl.e
    private a0 J;

    /* JADX INFO: compiled from: SearchWikiFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final Bundle a(@dl.e WikiObj wikiObj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{wikiObj}, this, changeQuickRedirect, false, 43155, new Class[]{WikiObj.class}, Bundle.class);
            if (patchProxyResultProxy.isSupported) {
                return (Bundle) patchProxyResultProxy.result;
            }
            Bundle bundle = new Bundle();
            com.max.xiaoheihe.module.search.b bVar = com.max.xiaoheihe.module.search.b.f91614a;
            bundle.putSerializable(bVar.m(), wikiObj);
            bundle.putInt(bVar.e(), 15);
            return bundle;
        }
    }

    /* JADX INFO: compiled from: SearchWikiFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<SearchWikiListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f91690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f91691c;

        b(String str, k kVar) {
            this.f91690b = str;
            this.f91691c = kVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43157, new Class[0], Void.TYPE).isSupported && f0.g(this.f91690b, k.M5(this.f91691c)) && this.f91691c.isActive()) {
                super.onComplete();
                k.K5(this.f91691c, this.f91690b);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 43156, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (f0.g(this.f91690b, k.M5(this.f91691c)) && this.f91691c.isActive()) {
                super.onError(e10);
                k.K5(this.f91691c, this.f91690b);
            }
        }

        public void onNext(@dl.d Result<SearchWikiListObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 43158, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (f0.g(this.f91690b, k.M5(this.f91691c)) && this.f91691c.isActive()) {
                super.onNext(result);
                if (result.getResult() != null) {
                    if (k.L5(this.f91691c) == 0) {
                        this.f91691c.I.clear();
                        if (k.N5(this.f91691c) == null) {
                            WikiOrArticleWrapperObj wikiOrArticleWrapperObj = new WikiOrArticleWrapperObj();
                            wikiOrArticleWrapperObj.setItemType(3);
                            this.f91691c.I.add(wikiOrArticleWrapperObj);
                        }
                        SearchWikiListObj result2 = result.getResult();
                        f0.m(result2);
                        if (!com.max.hbcommon.utils.c.w(result2.getWikis())) {
                            WikiOrArticleWrapperObj wikiOrArticleWrapperObj2 = new WikiOrArticleWrapperObj();
                            wikiOrArticleWrapperObj2.setItemType(2);
                            wikiOrArticleWrapperObj2.setTitle("百科");
                            this.f91691c.I.add(wikiOrArticleWrapperObj2);
                            SearchWikiListObj result3 = result.getResult();
                            f0.m(result3);
                            List<WikiListObj> wikis = result3.getWikis();
                            f0.o(wikis, "result.result!!.wikis");
                            for (WikiListObj wikiListObj : wikis) {
                                WikiOrArticleWrapperObj wikiOrArticleWrapperObj3 = new WikiOrArticleWrapperObj();
                                wikiOrArticleWrapperObj3.setItemType(1);
                                wikiOrArticleWrapperObj3.setWiki(wikiListObj);
                                this.f91691c.I.add(wikiOrArticleWrapperObj3);
                            }
                        }
                        SearchWikiListObj result4 = result.getResult();
                        f0.m(result4);
                        if (!com.max.hbcommon.utils.c.w(result4.getSearch_result())) {
                            SearchWikiListObj result5 = result.getResult();
                            f0.m(result5);
                            List<WikiArticelObj> search_result = result5.getSearch_result();
                            f0.o(search_result, "result.result!!.search_result");
                            WikiOrArticleWrapperObj wikiOrArticleWrapperObj4 = new WikiOrArticleWrapperObj();
                            wikiOrArticleWrapperObj4.setItemType(2);
                            wikiOrArticleWrapperObj4.setTitle("词条");
                            this.f91691c.I.add(wikiOrArticleWrapperObj4);
                            for (WikiArticelObj wikiArticelObj : search_result) {
                                WikiOrArticleWrapperObj wikiOrArticleWrapperObj5 = new WikiOrArticleWrapperObj();
                                wikiOrArticleWrapperObj5.setItemType(0);
                                wikiOrArticleWrapperObj5.setArticle(wikiArticelObj);
                                this.f91691c.I.add(wikiOrArticleWrapperObj5);
                            }
                        }
                    } else {
                        SearchWikiListObj result6 = result.getResult();
                        f0.m(result6);
                        if (!com.max.hbcommon.utils.c.w(result6.getSearch_result())) {
                            SearchWikiListObj result7 = result.getResult();
                            f0.m(result7);
                            List<WikiArticelObj> search_result2 = result7.getSearch_result();
                            f0.o(search_result2, "result.result!!.search_result");
                            for (WikiArticelObj wikiArticelObj2 : search_result2) {
                                WikiOrArticleWrapperObj wikiOrArticleWrapperObj6 = new WikiOrArticleWrapperObj();
                                wikiOrArticleWrapperObj6.setItemType(0);
                                wikiOrArticleWrapperObj6.setArticle(wikiArticelObj2);
                                this.f91691c.I.add(wikiOrArticleWrapperObj6);
                            }
                        }
                    }
                }
                k.P5(this.f91691c);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 43159, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SearchWikiListObj>) obj);
        }
    }

    public static final /* synthetic */ void K5(k kVar, String str) {
        if (PatchProxy.proxy(new Object[]{kVar, str}, null, changeQuickRedirect, true, 43151, new Class[]{k.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        kVar.Q3(str);
    }

    public static final /* synthetic */ int L5(k kVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{kVar}, null, changeQuickRedirect, true, 43152, new Class[]{k.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : kVar.c4();
    }

    public static final /* synthetic */ String M5(k kVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{kVar}, null, changeQuickRedirect, true, 43150, new Class[]{k.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : kVar.d4();
    }

    public static final /* synthetic */ WikiObj N5(k kVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{kVar}, null, changeQuickRedirect, true, 43153, new Class[]{k.class}, WikiObj.class);
        return patchProxyResultProxy.isSupported ? (WikiObj) patchProxyResultProxy.result : kVar.W4();
    }

    public static final /* synthetic */ void P5(k kVar) {
        if (PatchProxy.proxy(new Object[]{kVar}, null, changeQuickRedirect, true, 43154, new Class[]{k.class}, Void.TYPE).isSupported) {
            return;
        }
        kVar.Q5();
    }

    private final void Q5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43148, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        a0 a0Var = this.J;
        f0.m(a0Var);
        a0Var.notifyDataSetChanged();
        if (this.I.isEmpty()) {
            y4();
        } else {
            E5(true);
            N4().setVisibility(8);
        }
    }

    private final void R5(String str) {
        String wiki_id;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 43147, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        WikiObj wikiObjW4 = W4();
        if (wikiObjW4 == null || (wiki_id = wikiObjW4.getWiki_id()) == null) {
            wiki_id = null;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().w1(str, wiki_id, c4(), a4()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(str, this)));
    }

    @Override // com.max.hbsearch.y0, com.max.hbsearch.k
    @dl.e
    public List<SearchHotwordObj> Z3() {
        return null;
    }

    @Override // com.max.hbsearch.y0
    public void Z4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43144, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.J = new a0(this.mContext, this.I);
    }

    @Override // com.max.hbsearch.y0
    public void a5() {
    }

    @Override // com.max.hbsearch.y0
    public void h5(@dl.d String q10, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{q10, str}, this, changeQuickRedirect, false, 43146, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(q10, "q");
        R5(q10);
    }

    @Override // com.max.hbsearch.k
    public int i4() {
        return 15;
    }

    @Override // com.max.hbsearch.y0, com.max.hbsearch.k
    @dl.d
    public String j4() {
        String strN0;
        String str;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43149, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (W4() != null) {
            strN0 = com.max.xiaoheihe.utils.d.n0(R.string.wiki_internal_search_format);
            str = "getString(R.string.wiki_internal_search_format)";
        } else {
            strN0 = com.max.xiaoheihe.utils.d.n0(R.string.search_all_hint);
            str = "getString(\n            R…search_all_hint\n        )";
        }
        f0.o(strN0, str);
        return strN0;
    }

    @Override // com.max.hbsearch.y0
    public void j5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43145, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        P4().setLayoutManager(new GridLayoutManager(this.mContext, 2));
        P4().setPadding(ViewUtils.f(this.mContext, 8.0f), ViewUtils.f(this.mContext, 4.0f), ViewUtils.f(this.mContext, 8.0f), ViewUtils.f(this.mContext, 4.0f));
        P4().setBackgroundResource(R.color.background_layer_2_color);
        P4().setAdapter(this.J);
    }
}
