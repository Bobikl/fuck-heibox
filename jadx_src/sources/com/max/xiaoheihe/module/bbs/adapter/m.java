package com.max.xiaoheihe.module.bbs.adapter;

import android.content.Context;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.module.bbs.LinkListV2Fragment;
import com.max.xiaoheihe.module.favour.FavourLinkFolderFragment;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareListener;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: LinkListAdapter.java */
/* JADX INFO: loaded from: classes10.dex */
public class m extends com.max.hbcommon.base.adapter.u<BBSLinkObj> implements FavourLinkFolderFragment.b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f80548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f80549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private UMShareListener f80550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f80551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f80552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f80553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f80554h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final m f80555i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f80556j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private l0.h f80557k;

    /* JADX INFO: compiled from: LinkListAdapter.java */
    public class a extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f80558b;

        a(int i10) {
            this.f80558b = i10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27389, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(m.this.f80548b.getString(R.string.cancel_collect_success));
            super.onComplete();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 27390, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 27391, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(result);
            ((com.max.hbcommon.base.adapter.s) m.this).mDataList.remove(this.f80558b);
            m.this.notifyItemRemoved(this.f80558b);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 27392, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    /* JADX INFO: compiled from: LinkListAdapter.java */
    public interface b {
        void a(BBSLinkObj bBSLinkObj);

        void b(BBSLinkObj bBSLinkObj);

        void c(BBSLinkObj bBSLinkObj, String str);

        void d(BBSLinkObj bBSLinkObj);
    }

    public m(Context context, List<BBSLinkObj> list, String str) {
        super(context, list);
        this.f80554h = false;
        this.f80555i = this;
        this.f80556j = 0;
        this.f80548b = context;
        this.f80551e = str;
        if (LinkListV2Fragment.f79978z.equals(str) || LinkListV2Fragment.f79976x.equals(this.f80551e) || LinkListV2Fragment.B.equals(this.f80551e)) {
            this.f80552f = true;
        }
    }

    public m(Context context, List<BBSLinkObj> list, String str, String str2) {
        this(context, list, str);
        this.f80553g = str2;
    }

    @Override // com.max.xiaoheihe.module.favour.FavourLinkFolderFragment.b
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27384, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f80554h = true;
        this.f80556j = 0;
        notifyDataSetChanged();
    }

    @Override // com.max.xiaoheihe.module.favour.FavourLinkFolderFragment.b
    public void b(int i10) {
        this.f80556j = i10;
    }

    @Override // com.max.xiaoheihe.module.favour.FavourLinkFolderFragment.b
    public void g(l0.h hVar) {
        this.f80557k = hVar;
    }

    @Override // com.max.xiaoheihe.module.favour.FavourLinkFolderFragment.b
    public void k() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27385, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f80554h = false;
        notifyDataSetChanged();
        this.f80556j = 0;
    }

    @Override // com.max.hbcommon.base.adapter.u
    public /* bridge */ /* synthetic */ int m(int i10, BBSLinkObj bBSLinkObj) {
        Object[] objArr = {new Integer(i10), bBSLinkObj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 27387, new Class[]{cls, Object.class}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : q(i10, bBSLinkObj);
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
        if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 27388, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        t(eVar, (BBSLinkObj) obj);
    }

    public void p(boolean z10) {
        l0.h hVar;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27383, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || (hVar = this.f80557k) == null) {
            return;
        }
        if (z10) {
            hVar.a(null);
        } else {
            hVar.b(null);
        }
    }

    public int q(int i10, BBSLinkObj bBSLinkObj) {
        Object[] objArr = {new Integer(i10), bBSLinkObj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 27380, new Class[]{cls, BBSLinkObj.class}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : LinkHelper.b().c(this.f80551e, this.f80552f, bBSLinkObj);
    }

    public UMShareListener r() {
        return this.f80550d;
    }

    public b s() {
        return this.f80549c;
    }

    public void t(com.max.hbcommon.base.adapter.s.e eVar, BBSLinkObj bBSLinkObj) {
        if (PatchProxy.proxy(new Object[]{eVar, bBSLinkObj}, this, changeQuickRedirect, false, 27381, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.bbs.adapter.viewholderbinder.d.f80680a.a(new com.max.xiaoheihe.module.bbs.adapter.viewholderbinder.b(this.f80548b, this, this.f80551e, this.f80550d, this.f80553g, this.f80557k, this.f80549c, this.f80554h, this.f80552f)).b(eVar, bBSLinkObj);
    }

    public io.reactivex.disposables.b u(int i10, String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), str, str2}, this, changeQuickRedirect, false, 27386, new Class[]{Integer.TYPE, String.class, String.class}, io.reactivex.disposables.b.class);
        return patchProxyResultProxy.isSupported ? (io.reactivex.disposables.b) patchProxyResultProxy.result : (io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().r3(str, str2, null, "2", new HashMap(16)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a(i10));
    }

    public void v(UMShareListener uMShareListener) {
        this.f80550d = uMShareListener;
    }

    public void w(b bVar) {
        this.f80549c = bVar;
    }

    public void x(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27382, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            this.f80556j++;
        } else {
            this.f80556j--;
        }
        if (this.f80556j == this.mDataList.size()) {
            p(true);
        } else {
            p(false);
        }
    }
}
