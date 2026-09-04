package com.max.xiaoheihe.module.bbs.adapter.viewholderbinder;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.u;
import com.max.hbsearch.SearchNewActivity;
import com.max.hbsearch.p;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.WikiOrArticleWrapperObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WikiViewHolderBinder.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public abstract class j extends cb.c<WikiOrArticleWrapperObj> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f80697e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private i f80698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private Context f80699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private u<?> f80700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private p f80701d;

    public j(@dl.d i param) {
        f0.p(param, "param");
        this.f80698a = param;
        this.f80699b = param.g();
        this.f80700c = this.f80698a.f();
        this.f80701d = this.f80698a.h();
    }

    private final void h(s.e eVar, WikiOrArticleWrapperObj wikiOrArticleWrapperObj) {
        View viewI;
        if (PatchProxy.proxy(new Object[]{eVar, wikiOrArticleWrapperObj}, this, changeQuickRedirect, false, 27566, new Class[]{s.e.class, WikiOrArticleWrapperObj.class}, Void.TYPE).isSupported || (viewI = eVar.i(R.id.divider)) == null) {
            return;
        }
        if ((this.f80699b instanceof SearchNewActivity) && wikiOrArticleWrapperObj.getArticle() != null) {
            Boolean showDivider = wikiOrArticleWrapperObj.getArticle().getShowDivider();
            f0.o(showDivider, "data.article.showDivider");
            if (showDivider.booleanValue()) {
                viewI.setVisibility(0);
                return;
            }
        }
        viewI.setVisibility(8);
    }

    @Override // cb.c
    public /* bridge */ /* synthetic */ void b(s.e eVar, WikiOrArticleWrapperObj wikiOrArticleWrapperObj) {
        if (PatchProxy.proxy(new Object[]{eVar, wikiOrArticleWrapperObj}, this, changeQuickRedirect, false, 27567, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, wikiOrArticleWrapperObj);
    }

    public void f(@dl.d s.e viewHolder, @dl.d WikiOrArticleWrapperObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 27564, new Class[]{s.e.class, WikiOrArticleWrapperObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        m(viewHolder, data);
        g(viewHolder, data);
        h(viewHolder, data);
    }

    public abstract void g(@dl.d s.e eVar, @dl.d WikiOrArticleWrapperObj wikiOrArticleWrapperObj);

    @dl.d
    public final u<?> i() {
        return this.f80700c;
    }

    @dl.d
    public final Context j() {
        return this.f80699b;
    }

    @dl.e
    public final p k() {
        return this.f80701d;
    }

    @dl.d
    public final i l() {
        return this.f80698a;
    }

    public final void m(@dl.d s.e viewHolder, @dl.d WikiOrArticleWrapperObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 27565, new Class[]{s.e.class, WikiOrArticleWrapperObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
    }

    public final void n(@dl.d u<?> uVar) {
        if (PatchProxy.proxy(new Object[]{uVar}, this, changeQuickRedirect, false, 27563, new Class[]{u.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(uVar, "<set-?>");
        this.f80700c = uVar;
    }

    public final void o(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 27562, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<set-?>");
        this.f80699b = context;
    }

    public final void p(@dl.e p pVar) {
        this.f80701d = pVar;
    }

    public final void q(@dl.d i iVar) {
        if (PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, 27561, new Class[]{i.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(iVar, "<set-?>");
        this.f80698a = iVar;
    }
}
