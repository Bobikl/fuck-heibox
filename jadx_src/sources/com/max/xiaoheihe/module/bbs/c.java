package com.max.xiaoheihe.module.bbs;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.Event;
import com.max.hbcommon.base.adapter.OneTimeValidExposureWatcher;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.FeedsHistoryLinkInfo;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mb.b1;

/* JADX INFO: compiled from: ChannelsLinkListFragment.java */
/* JADX INFO: loaded from: classes10.dex */
public class c extends com.max.hbcommon.base.d implements com.max.xiaoheihe.view.callback.a, y {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f80779b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b1 f80782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private h f80783f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private i f80784g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.max.xiaoheihe.module.bbs.i f80785h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<FeedsContentBaseObj> f80780c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<FeedsContentBaseObj> f80781d = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<FeedsContentBaseObj> f80786i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<FeedsContentBaseObj> f80787j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<FeedsHistoryLinkInfo> f80788k = new ArrayList();

    /* JADX INFO: compiled from: ChannelsLinkListFragment.java */
    public class a extends com.max.xiaoheihe.module.news.adapter.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(Context context, List list) {
            super(context, list);
        }

        @Override // com.max.xiaoheihe.module.news.adapter.a, com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 26036, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            p(eVar, (FeedsContentBaseObj) obj);
        }

        @Override // com.max.xiaoheihe.module.news.adapter.a
        public void p(com.max.hbcommon.base.adapter.s.e eVar, FeedsContentBaseObj feedsContentBaseObj) {
            if (PatchProxy.proxy(new Object[]{eVar, feedsContentBaseObj}, this, changeQuickRedirect, false, 26035, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
                return;
            }
            super.p(eVar, feedsContentBaseObj);
            com.max.xiaoheihe.accelworld.l.q(eVar.itemView, R.color.background_layer_2_color, 0.0f);
            if (feedsContentBaseObj instanceof BBSLinkObj) {
                com.max.xiaoheihe.module.news.viewholderbinder.h0.v((BBSLinkObj) feedsContentBaseObj);
            }
            c.L3(c.this, eVar);
        }
    }

    /* JADX INFO: compiled from: ChannelsLinkListFragment.java */
    public class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 26037, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            c.this.f80786i.clear();
            c.this.f80787j.clear();
            c.this.f80783f.a3(c.O3(c.this, true));
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ChannelsLinkListFragment.java */
    public class C0692c implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0692c() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 26038, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            c.this.f80783f.g3(c.O3(c.this, false));
        }
    }

    /* JADX INFO: compiled from: ChannelsLinkListFragment.java */
    public class d extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 26039, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            c.this.f80783f.f3(i11);
        }
    }

    /* JADX INFO: compiled from: ChannelsLinkListFragment.java */
    public class e extends com.max.xiaoheihe.module.bbs.i<g> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e(androidx.lifecycle.y yVar, RecyclerView recyclerView, Class cls) {
            super(yVar, recyclerView, cls);
        }

        @Override // com.max.xiaoheihe.module.bbs.i, com.max.hbcommon.base.adapter.AbsListItemReportHelper
        public void m(@androidx.annotation.n0 Object obj, @androidx.annotation.n0 Event event) {
            if (PatchProxy.proxy(new Object[]{obj, event}, this, changeQuickRedirect, false, 26040, new Class[]{Object.class, Event.class}, Void.TYPE).isSupported) {
                return;
            }
            super.m(obj, event);
            if (event == Event.SCROLL_IN && (obj instanceof BBSLinkObj)) {
                BBSLinkObj bBSLinkObj = (BBSLinkObj) obj;
                if (com.max.hbcommon.utils.c.u(bBSLinkObj.getLinkid())) {
                    return;
                }
                c.this.f80788k.remove(new FeedsHistoryLinkInfo(bBSLinkObj.getLinkid(), 0L));
            }
        }
    }

    /* JADX INFO: compiled from: ChannelsLinkListFragment.java */
    public class f implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26041, new Class[0], Void.TYPE).isSupported || c.this.f80785h == null) {
                return;
            }
            c.this.f80785h.q();
        }
    }

    /* JADX INFO: compiled from: ChannelsLinkListFragment.java */
    public class g extends com.max.hbcommon.base.adapter.t {
        public g(com.max.hbcommon.base.adapter.s sVar) {
            super(sVar);
        }
    }

    /* JADX INFO: compiled from: ChannelsLinkListFragment.java */
    public interface h {
        void a3(Map<String, String> map);

        void f3(int i10);

        void g3(Map<String, String> map);
    }

    /* JADX INFO: compiled from: ChannelsLinkListFragment.java */
    public interface i {
        boolean B2();

        View J0();
    }

    static /* synthetic */ void L3(c cVar, com.max.hbcommon.base.adapter.s.e eVar) {
        if (PatchProxy.proxy(new Object[]{cVar, eVar}, null, changeQuickRedirect, true, 26033, new Class[]{c.class, com.max.hbcommon.base.adapter.s.e.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.T3(eVar);
    }

    static /* synthetic */ Map O3(c cVar, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 26034, new Class[]{c.class, Boolean.TYPE}, Map.class);
        return patchProxyResultProxy.isSupported ? (Map) patchProxyResultProxy.result : cVar.V3(z10);
    }

    private void T3(com.max.hbcommon.base.adapter.s.e eVar) {
        if (!PatchProxy.proxy(new Object[]{eVar}, this, changeQuickRedirect, false, 26031, new Class[]{com.max.hbcommon.base.adapter.s.e.class}, Void.TYPE).isSupported && eVar.getAdapterPosition() == 0 && eVar.d() == R.layout.item_channels_link_top && this.f80784g.B2()) {
            eVar.setIsRecyclable(false);
            RelativeLayout relativeLayout = (RelativeLayout) eVar.itemView;
            View viewJ0 = this.f80784g.J0();
            if (relativeLayout.indexOfChild(viewJ0) < 0) {
                if (viewJ0.getParent() instanceof ViewGroup) {
                    ((ViewGroup) viewJ0.getParent()).removeView(viewJ0);
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
                layoutParams.addRule(11);
                relativeLayout.addView(viewJ0, layoutParams);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) eVar.i(R.id.llt).getLayoutParams();
                layoutParams2.addRule(0, R.id.vg_filter);
                layoutParams2.rightMargin = -ViewUtils.f(this.mContext, 18.0f);
            }
        }
    }

    private String U3(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 26021, new Class[]{Boolean.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (!com.max.hbcommon.utils.c.w(this.f80788k)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator<FeedsHistoryLinkInfo> it = this.f80788k.iterator();
            while (it.hasNext() && (jCurrentTimeMillis - it.next().getTimestamp() > 3600000 || this.f80788k.size() > 60)) {
                it.remove();
            }
            com.max.hbcommon.utils.d.b("zzzzrefresh", "mHistoryLinks size " + this.f80788k.size());
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator<FeedsHistoryLinkInfo> it2 = this.f80788k.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getLinkid());
            }
            if (!z10) {
                Y3(arrayList, this.f80780c);
            }
            com.max.hbcommon.utils.d.b("zzzzrefresh", "unexposedLinks size " + arrayList.size());
            if (arrayList.size() > 50) {
                return com.max.xiaoheihe.utils.d.T0(arrayList.subList(0, 50), ',');
            }
            if (arrayList.size() > 0) {
                return com.max.xiaoheihe.utils.d.T0(arrayList, ',');
            }
        }
        return null;
    }

    private Map<String, String> V3(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 26020, new Class[]{Boolean.TYPE}, Map.class);
        if (patchProxyResultProxy.isSupported) {
            return (Map) patchProxyResultProxy.result;
        }
        String strU3 = U3(z10);
        if (com.max.hbcommon.utils.c.u(strU3)) {
            return null;
        }
        HashMap map = new HashMap(16);
        map.put("unexposed", strU3);
        return map;
    }

    private void W3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26019, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f80782e.f131495b.setLayoutManager(new LinearLayoutManager(this.mContext));
        g gVar = new g(new a(this.mContext, this.f80780c));
        this.f80779b = gVar;
        this.f80782e.f131495b.setAdapter(gVar);
        this.f80782e.f131496c.setBackgroundResource(R.color.divider_secondary_2_color);
        this.f80782e.f131496c.S(new b());
        this.f80782e.f131496c.f0(new C0692c());
        this.f80782e.f131495b.clearOnScrollListeners();
        this.f80782e.f131495b.addOnScrollListener(new d());
        this.f80785h = new e(this, this.f80782e.f131495b, BBSLinkObj.class);
        new OneTimeValidExposureWatcher(this, this.f80782e.f131495b);
    }

    public static c X3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 26016, new Class[0], c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new c();
    }

    private void Y3(ArrayList<String> arrayList, List<FeedsContentBaseObj> list) {
        if (PatchProxy.proxy(new Object[]{arrayList, list}, this, changeQuickRedirect, false, 26022, new Class[]{ArrayList.class, List.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(arrayList) || com.max.hbcommon.utils.c.w(list)) {
            return;
        }
        for (FeedsContentBaseObj feedsContentBaseObj : list) {
            if (feedsContentBaseObj instanceof BBSLinkObj) {
                String linkid = ((BBSLinkObj) feedsContentBaseObj).getLinkid();
                if (!com.max.hbcommon.utils.c.u(linkid)) {
                    arrayList.remove(linkid);
                }
            }
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.y
    public void C3() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26028, new Class[0], Void.TYPE).isSupported && this.mIsPrepared) {
            this.f80782e.f131496c.A(0);
            this.f80782e.f131496c.p(0);
        }
    }

    @Override // com.max.xiaoheihe.view.callback.a
    public void D3() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26030, new Class[0], Void.TYPE).isSupported && this.mIsPrepared) {
            this.f80782e.f131496c.F();
            this.f80782e.f131495b.scrollToPosition(0);
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.y
    public void E2() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26027, new Class[0], Void.TYPE).isSupported && this.mIsPrepared) {
            showEmpty();
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.y
    public void K0() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26026, new Class[0], Void.TYPE).isSupported && this.mIsPrepared) {
            showError();
        }
    }

    public boolean S3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26032, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.f80780c.size() > 0;
    }

    @Override // com.max.xiaoheihe.module.bbs.y
    public void c1() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26024, new Class[0], Void.TYPE).isSupported && this.mIsPrepared) {
            this.f80782e.f131495b.post(new f());
        }
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26018, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        b1 b1VarC = b1.c(this.mInflater);
        this.f80782e = b1VarC;
        setContentView(b1VarC);
        W3();
        showLoading();
    }

    @Override // com.max.hbcommon.base.d
    public boolean isNotPage() {
        return true;
    }

    @Override // com.max.xiaoheihe.module.bbs.y
    public void l0(boolean z10, List<FeedsContentBaseObj> list) {
        int size;
        int i10;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), list}, this, changeQuickRedirect, false, 26025, new Class[]{Boolean.TYPE, List.class}, Void.TYPE).isSupported || !this.mIsPrepared || this.f80779b == null) {
            return;
        }
        showContentView();
        if (list != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (FeedsContentBaseObj feedsContentBaseObj : list) {
                if (feedsContentBaseObj instanceof BBSLinkObj) {
                    String linkid = ((BBSLinkObj) feedsContentBaseObj).getLinkid();
                    if (!com.max.hbcommon.utils.c.u(linkid)) {
                        FeedsHistoryLinkInfo feedsHistoryLinkInfo = new FeedsHistoryLinkInfo(linkid, jCurrentTimeMillis);
                        this.f80788k.remove(feedsHistoryLinkInfo);
                        this.f80788k.add(feedsHistoryLinkInfo);
                    }
                }
            }
            if (z10) {
                this.f80780c.clear();
            }
            size = this.f80780c.size();
            i10 = 0;
            for (FeedsContentBaseObj feedsContentBaseObj2 : list) {
                if (!this.f80780c.contains(feedsContentBaseObj2)) {
                    this.f80780c.add(feedsContentBaseObj2);
                    i10++;
                }
            }
            this.f80781d.clear();
            this.f80781d.addAll(list);
        } else {
            size = 0;
            i10 = 0;
        }
        if (this.f80780c.isEmpty()) {
            this.f80779b.E(R.layout.empty_view);
            View viewInflate = this.mInflater.inflate(R.layout.empty_view, (ViewGroup) this.f80782e.f131495b, false);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_empty);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_empty);
            imageView.setImageResource(R.drawable.common_tag_post_46x45);
            textView.setText(R.string.no_post);
            this.f80779b.m(R.layout.empty_view, viewInflate);
        } else {
            this.f80779b.E(R.layout.empty_view);
        }
        if (size > 0) {
            this.f80779b.notifyItemRangeInserted(size, i10);
        } else {
            this.f80779b.notifyDataSetChanged();
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 26017, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onAttach(context);
        if (!(getParentFragment() instanceof h)) {
            throw new RuntimeException(getParentFragment() + " or " + context + " must implement onRefreshListener");
        }
        this.f80783f = (h) getParentFragment();
        if (getParentFragment() instanceof i) {
            this.f80784g = (i) getParentFragment();
            return;
        }
        throw new RuntimeException(getParentFragment() + " or " + context + " must implement sortFilterViewProvider");
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26029, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        D3();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26023, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
    }
}
