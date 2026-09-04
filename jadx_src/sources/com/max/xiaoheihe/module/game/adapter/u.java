package com.max.xiaoheihe.module.game.adapter;

import android.content.Context;
import android.view.View;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.bean.analytics.PageEventObj;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.game.a2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: GameListAdapter.java */
/* JADX INFO: loaded from: classes11.dex */
public class u extends com.max.hbcommon.base.adapter.u<GameObj> implements androidx.lifecycle.y {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.lifecycle.a0 f86371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f86372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a2 f86373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f86374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f86375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f86376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.max.hbcommon.analytics.g f86377h;

    /* JADX INFO: compiled from: GameListAdapter.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35643, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            u.n(u.this);
        }
    }

    public u(Context context, List<GameObj> list, com.max.hbcommon.analytics.g gVar, a2 a2Var, String str) {
        this(context, list, a2Var, str);
        this.f86377h = gVar;
    }

    public u(Context context, List<GameObj> list, a2 a2Var, String str) {
        super(context, list);
        this.f86371b = new androidx.lifecycle.a0(this);
        this.f86375f = false;
        this.f86376g = false;
        this.f86377h = null;
        this.f86372c = context;
        this.f86373d = a2Var;
        this.f86374e = str;
    }

    static /* synthetic */ void n(u uVar) {
        if (PatchProxy.proxy(new Object[]{uVar}, null, changeQuickRedirect, true, 35642, new Class[]{u.class}, Void.TYPE).isSupported) {
            return;
        }
        uVar.u();
    }

    private void u() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35639, new Class[0], Void.TYPE).isSupported || this.f86377h == null) {
            return;
        }
        PageEventObj pageEventObj = new PageEventObj();
        pageEventObj.setTime(String.valueOf(System.currentTimeMillis() / 1000));
        pageEventObj.setPath(this.f86377h.getPath());
        pageEventObj.setAddition(this.f86377h.getAdditional());
        pageEventObj.setType("4");
        ArrayList<ArrayList<PathSrcNode>> arrayListG = com.max.hbcommon.analytics.l.f66572a.g();
        if (!com.max.hbcommon.utils.c.w(arrayListG)) {
            pageEventObj.setSrc(arrayListG);
        }
        com.max.hbcommon.analytics.d.c(pageEventObj, true);
    }

    @Override // androidx.lifecycle.y
    @n0
    public Lifecycle getLifecycle() {
        return this.f86371b;
    }

    @Override // com.max.hbcommon.base.adapter.u
    public /* bridge */ /* synthetic */ int m(int i10, GameObj gameObj) {
        Object[] objArr = {new Integer(i10), gameObj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 35640, new Class[]{cls, Object.class}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : p(i10, gameObj);
    }

    public String o() {
        return this.f86374e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@n0 RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, 35634, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        this.f86371b.l(Lifecycle.Event.ON_RESUME);
        new v(this, recyclerView, false);
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
        if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 35641, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        t(eVar, (GameObj) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@n0 RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, 35635, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onDetachedFromRecyclerView(recyclerView);
        this.f86371b.l(Lifecycle.Event.ON_DESTROY);
    }

    public int p(int i10, GameObj gameObj) {
        Object[] objArr = {new Integer(i10), gameObj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 35636, new Class[]{cls, GameObj.class}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : GameHelper.c().b(gameObj);
    }

    @p0
    public View.OnClickListener q() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35638, new Class[0], View.OnClickListener.class);
        if (patchProxyResultProxy.isSupported) {
            return (View.OnClickListener) patchProxyResultProxy.result;
        }
        if (this.f86377h != null) {
            return new a();
        }
        return null;
    }

    public boolean r() {
        return this.f86375f;
    }

    public boolean s() {
        return this.f86376g;
    }

    public void t(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj) {
        if (PatchProxy.proxy(new Object[]{eVar, gameObj}, this, changeQuickRedirect, false, 35637, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameObj.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.game.adapter.viewholderbinder.gamelist.c.f86384a.a(new com.max.xiaoheihe.module.game.adapter.viewholderbinder.gamelist.d(this.f86372c, this, this.f86373d, this.f86374e, true), eVar.d()).f(eVar, gameObj);
    }

    public void v(boolean z10) {
        this.f86375f = z10;
    }

    public void w(String str) {
        this.f86374e = str;
    }

    public void x(boolean z10) {
        this.f86376g = z10;
    }
}
