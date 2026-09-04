package com.max.xiaoheihe.module.bbs.concept;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.OneTimeValidExposureWatcher;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.module.bbs.i;
import com.max.xiaoheihe.module.bbs.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import mb.z0;
import ng.j;

/* JADX INFO: compiled from: ConceptTopicLinkListFragment.java */
/* JADX INFO: loaded from: classes10.dex */
public class a extends com.max.hbcommon.base.d implements com.max.xiaoheihe.view.callback.a, y {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.max.xiaoheihe.module.news.adapter.a f81117b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private z0 f81119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.max.xiaoheihe.module.bbs.c.h f81120e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private i<com.max.xiaoheihe.module.news.adapter.a> f81123h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<FeedsContentBaseObj> f81118c = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<FeedsContentBaseObj> f81121f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<FeedsContentBaseObj> f81122g = new ArrayList();

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.concept.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ConceptTopicLinkListFragment.java */
    public class C0694a implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0694a() {
        }

        @Override // pg.d
        public void k(j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 28161, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            a.this.f81121f.clear();
            a.this.f81122g.clear();
            a.this.f81120e.a3(null);
        }
    }

    /* JADX INFO: compiled from: ConceptTopicLinkListFragment.java */
    public class b implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.b
        public void f(j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 28162, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            a.this.f81120e.g3(null);
        }
    }

    /* JADX INFO: compiled from: ConceptTopicLinkListFragment.java */
    public class c extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 28163, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            a.this.f81120e.f3(i11);
        }
    }

    /* JADX INFO: compiled from: ConceptTopicLinkListFragment.java */
    public class d implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28164, new Class[0], Void.TYPE).isSupported || a.this.f81123h == null) {
                return;
            }
            a.this.f81123h.q();
        }
    }

    private void P3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28153, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.bbs.utils.b.U(this.mContext, this.f81119d.f131840c.f131495b);
        this.f81117b = new com.max.xiaoheihe.module.news.adapter.a(this.mContext, this.f81118c);
        this.f81119d.f131840c.f131496c.setBackgroundResource(R.color.divider_color);
        this.f81119d.f131840c.f131495b.setAdapter(this.f81117b);
        this.f81119d.f131840c.f131496c.S(new C0694a());
        this.f81119d.f131840c.f131496c.f0(new b());
        this.f81119d.f131840c.f131495b.clearOnScrollListeners();
        this.f81119d.f131840c.f131495b.addOnScrollListener(new c());
        this.f81123h = new i<>(this, this.f81119d.f131840c.f131495b, BBSLinkObj.class);
        new OneTimeValidExposureWatcher(this, this.f81119d.f131840c.f131495b);
    }

    public static a Q3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 28150, new Class[0], a.class);
        return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : new a();
    }

    @Override // com.max.xiaoheihe.module.bbs.y
    public void C3() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28156, new Class[0], Void.TYPE).isSupported && this.mIsPrepared) {
            this.f81119d.f131840c.f131496c.A(0);
            this.f81119d.f131840c.f131496c.p(0);
        }
    }

    @Override // com.max.xiaoheihe.view.callback.a
    public void D3() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28160, new Class[0], Void.TYPE).isSupported && this.mIsPrepared) {
            this.f81119d.f131840c.f131496c.F();
            this.f81119d.f131840c.f131495b.scrollToPosition(0);
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.y
    public void E2() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28158, new Class[0], Void.TYPE).isSupported && this.mIsPrepared) {
            showEmpty();
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.y
    public void K0() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28157, new Class[0], Void.TYPE).isSupported && this.mIsPrepared) {
            showError();
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.y
    public void c1() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28154, new Class[0], Void.TYPE).isSupported && this.mIsPrepared) {
            this.f81119d.f131840c.f131495b.post(new d());
        }
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28152, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        z0 z0VarC = z0.c(this.mInflater);
        this.f81119d = z0VarC;
        setContentView(z0VarC);
        P3();
        showLoading();
    }

    @Override // com.max.xiaoheihe.module.bbs.y
    public void l0(boolean z10, List<FeedsContentBaseObj> list) {
        int i10;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), list}, this, changeQuickRedirect, false, 28155, new Class[]{Boolean.TYPE, List.class}, Void.TYPE).isSupported || !this.mIsPrepared || this.f81117b == null) {
            return;
        }
        showContentView();
        int size = this.f81118c.size();
        if (list != null) {
            if (z10) {
                this.f81118c.clear();
            }
            i10 = 0;
            for (FeedsContentBaseObj feedsContentBaseObj : list) {
                if (!this.f81118c.contains(feedsContentBaseObj)) {
                    this.f81118c.add(feedsContentBaseObj);
                    i10++;
                }
            }
        } else {
            i10 = 0;
        }
        if (this.f81118c.isEmpty()) {
            this.f81119d.f131839b.b().setVisibility(0);
            this.f81119d.f131839b.f131709d.setText(R.string.no_post);
            this.f81119d.f131839b.f131708c.setImageResource(R.drawable.common_tag_post_46x45);
        } else {
            this.f81119d.f131839b.b().setVisibility(8);
        }
        if (z10) {
            this.f81117b.notifyDataSetChanged();
        } else {
            this.f81117b.notifyItemRangeChanged(size, i10);
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 28151, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onAttach(context);
        if (getParentFragment() instanceof com.max.xiaoheihe.module.bbs.c.h) {
            this.f81120e = (com.max.xiaoheihe.module.bbs.c.h) getParentFragment();
            return;
        }
        throw new RuntimeException(getParentFragment() + " or " + context + " must implement GameListListener");
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28159, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        D3();
    }
}
