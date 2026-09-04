package com.max.xiaoheihe.module.bbs;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSOfficialMessagesObj;
import com.max.xiaoheihe.bean.bbs.BBSUserNotifyObj;
import com.max.xiaoheihe.module.trade.TradeMsgActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.umeng.message.common.inter.ITagManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: UserNotifyListFragment.java */
/* JADX INFO: loaded from: classes10.dex */
public class q0 extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    SmartRefreshLayout f83177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    RecyclerView f83178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f83179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<BBSUserNotifyObj> f83180e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.max.xiaoheihe.module.bbs.adapter.o f83181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f83182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f83183h;

    /* JADX INFO: compiled from: UserNotifyListFragment.java */
    public class a extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 27076, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            rect.set(ViewUtils.f(((com.max.hbcommon.base.d) q0.this).mContext, 14.0f), ViewUtils.f(((com.max.hbcommon.base.d) q0.this).mContext, 7.0f), ViewUtils.f(((com.max.hbcommon.base.d) q0.this).mContext, 14.0f), ViewUtils.f(((com.max.hbcommon.base.d) q0.this).mContext, 7.0f));
        }
    }

    /* JADX INFO: compiled from: UserNotifyListFragment.java */
    public class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 27077, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            q0.this.f83179d = 0;
            if (q0.this.f83182g.equals("2")) {
                q0.T3(q0.this);
            } else {
                q0.U3(q0.this);
            }
        }
    }

    /* JADX INFO: compiled from: UserNotifyListFragment.java */
    public class c implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 27078, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            q0.R3(q0.this, 30);
            if (q0.this.f83182g.equals("2")) {
                q0.T3(q0.this);
            } else {
                q0.U3(q0.this);
            }
        }
    }

    /* JADX INFO: compiled from: UserNotifyListFragment.java */
    public class d extends com.max.hbcommon.network.d<Result<List<BBSUserNotifyObj>>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27080, new Class[0], Void.TYPE).isSupported && q0.this.isActive()) {
                super.onComplete();
                q0.this.f83177b.A(0);
                q0.this.f83177b.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 27079, new Class[]{Throwable.class}, Void.TYPE).isSupported && q0.this.isActive()) {
                super.onError(th2);
                q0.V3(q0.this);
                q0.this.f83177b.A(0);
                q0.this.f83177b.p(0);
            }
        }

        public void onNext(Result<List<BBSUserNotifyObj>> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 27081, new Class[]{Result.class}, Void.TYPE).isSupported && q0.this.isActive()) {
                super.onNext(result);
                q0.W3(q0.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 27082, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<List<BBSUserNotifyObj>>) obj);
        }
    }

    /* JADX INFO: compiled from: UserNotifyListFragment.java */
    public class e extends com.max.hbcommon.network.d<Result<BBSOfficialMessagesObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27084, new Class[0], Void.TYPE).isSupported && q0.this.isActive()) {
                super.onComplete();
                q0.this.f83177b.A(0);
                q0.this.f83177b.p(0);
                com.max.hbcommon.utils.d.b("cqtest", "finish");
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 27083, new Class[]{Throwable.class}, Void.TYPE).isSupported && q0.this.isActive()) {
                super.onError(th2);
                q0.N3(q0.this);
                q0.this.f83177b.A(0);
                q0.this.f83177b.p(0);
                com.max.hbcommon.utils.d.b("cqtest", "error");
            }
        }

        public void onNext(Result<BBSOfficialMessagesObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 27085, new Class[]{Result.class}, Void.TYPE).isSupported && q0.this.isActive()) {
                com.max.hbcommon.utils.d.b("cqtest", ITagManager.SUCCESS);
                super.onNext(result);
                q0.W3(q0.this, result.getResult().getMessages());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 27086, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSOfficialMessagesObj>) obj);
        }
    }

    static /* synthetic */ void N3(q0 q0Var) {
        if (PatchProxy.proxy(new Object[]{q0Var}, null, changeQuickRedirect, true, 27075, new Class[]{q0.class}, Void.TYPE).isSupported) {
            return;
        }
        q0Var.showError();
    }

    static /* synthetic */ int R3(q0 q0Var, int i10) {
        int i11 = q0Var.f83179d + i10;
        q0Var.f83179d = i11;
        return i11;
    }

    static /* synthetic */ void T3(q0 q0Var) {
        if (PatchProxy.proxy(new Object[]{q0Var}, null, changeQuickRedirect, true, 27071, new Class[]{q0.class}, Void.TYPE).isSupported) {
            return;
        }
        q0Var.Y3();
    }

    static /* synthetic */ void U3(q0 q0Var) {
        if (PatchProxy.proxy(new Object[]{q0Var}, null, changeQuickRedirect, true, 27072, new Class[]{q0.class}, Void.TYPE).isSupported) {
            return;
        }
        q0Var.X3();
    }

    static /* synthetic */ void V3(q0 q0Var) {
        if (PatchProxy.proxy(new Object[]{q0Var}, null, changeQuickRedirect, true, 27073, new Class[]{q0.class}, Void.TYPE).isSupported) {
            return;
        }
        q0Var.showError();
    }

    static /* synthetic */ void W3(q0 q0Var, List list) {
        if (PatchProxy.proxy(new Object[]{q0Var, list}, null, changeQuickRedirect, true, 27074, new Class[]{q0.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        q0Var.c4(list);
    }

    private void X3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27067, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) ("1".equals(this.f83182g) ? com.max.xiaoheihe.network.i.a().h9(this.f83179d, 30) : com.max.xiaoheihe.network.i.a().N3(this.f83179d, 30)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    private void Y3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27070, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().W8(this.f83183h, this.f83179d, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    public static q0 Z3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 27063, new Class[0], q0.class);
        if (patchProxyResultProxy.isSupported) {
            return (q0) patchProxyResultProxy.result;
        }
        q0 q0Var = new q0();
        q0Var.setArguments(new Bundle());
        return q0Var;
    }

    public static q0 a4(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 27064, new Class[]{String.class}, q0.class);
        if (patchProxyResultProxy.isSupported) {
            return (q0) patchProxyResultProxy.result;
        }
        q0 q0Var = new q0();
        Bundle bundle = new Bundle();
        bundle.putString("list_type", str);
        q0Var.setArguments(bundle);
        return q0Var;
    }

    public static q0 b4(String str, String str2, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, null, changeQuickRedirect, true, 27065, new Class[]{String.class, String.class, String.class}, q0.class);
        if (patchProxyResultProxy.isSupported) {
            return (q0) patchProxyResultProxy.result;
        }
        q0 q0Var = new q0();
        Bundle bundle = new Bundle();
        bundle.putString("list_type", str);
        bundle.putString("name", str2);
        bundle.putString("sender_id", str3);
        q0Var.setArguments(bundle);
        return q0Var;
    }

    private void c4(List<BBSUserNotifyObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 27068, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (list != null) {
            if (this.f83179d == 0) {
                this.f83180e.clear();
            }
            this.f83180e.addAll(list);
            this.f83181f.notifyDataSetChanged();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27066, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        this.f83177b = (SmartRefreshLayout) view.findViewById(R.id.srl);
        this.f83178c = (RecyclerView) view.findViewById(R.id.rv);
        if (getArguments() != null) {
            this.f83182g = getArguments().getString("list_type");
            this.f83183h = getArguments().getString("sender_id");
        }
        if ("1".equals(this.f83182g)) {
            this.mTitleBar.setTitle(com.max.xiaoheihe.utils.d.A() + "开放平台通知");
        } else if ("2".equals(this.f83182g)) {
            this.mTitleBar.setTitle(getArguments().getString("name"));
        } else {
            this.mTitleBar.setTitle(com.max.xiaoheihe.utils.d.A());
        }
        this.mTitleBarDivider.setVisibility(0);
        if (this.mContext instanceof TradeMsgActivity) {
            this.mTitleBar.setVisibility(8);
            this.mTitleBarDivider.setVisibility(8);
        }
        this.f83181f = new com.max.xiaoheihe.module.bbs.adapter.o(this.mContext, this.f83180e);
        this.f83178c.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.f83178c.addItemDecoration(new a());
        this.f83178c.setAdapter(this.f83181f);
        this.f83177b.S(new b());
        this.f83177b.f0(new c());
        showLoading();
        if (this.f83182g.equals("2")) {
            Y3();
        } else {
            X3();
        }
        Activity activity = this.mContext;
        if (activity instanceof UserNotifyListActivity) {
            ((UserNotifyListActivity) activity).M1("4");
        }
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27069, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        this.f83179d = 0;
        if (this.f83182g.equals("2")) {
            Y3();
        } else {
            X3();
        }
    }
}
