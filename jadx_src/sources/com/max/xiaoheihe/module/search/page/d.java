package com.max.xiaoheihe.module.search.page;

import android.app.Activity;
import android.os.Bundle;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.hbsearch.bean.SearchHotwordObj;
import com.max.hbsearch.y0;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.video.AbsVideoView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkListResultObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: SearchForbidUserPostFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class d extends y0 {

    @dl.d
    public static final a K = new a(null);
    public static final int L = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    private final ArrayList<BBSLinkObj> I = new ArrayList<>();

    @dl.e
    private s<BBSLinkObj> J;

    /* JADX INFO: compiled from: SearchForbidUserPostFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final Bundle a(@dl.d String topicid) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{topicid}, this, changeQuickRedirect, false, 42985, new Class[]{String.class}, Bundle.class);
            if (patchProxyResultProxy.isSupported) {
                return (Bundle) patchProxyResultProxy.result;
            }
            f0.p(topicid, "topicid");
            Bundle bundle = new Bundle();
            com.max.xiaoheihe.module.search.b bVar = com.max.xiaoheihe.module.search.b.f91614a;
            bundle.putString(bVar.j(), topicid);
            bundle.putInt(bVar.e(), 14);
            return bundle;
        }
    }

    /* JADX INFO: compiled from: SearchForbidUserPostFragment.kt */
    public static final class b extends s<BBSLinkObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b(Activity activity, ArrayList<BBSLinkObj> arrayList) {
            super(activity, arrayList, R.layout.item_link_list);
        }

        public void m(@dl.d s.e viewHolder, @dl.d BBSLinkObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42986, new Class[]{s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            com.max.xiaoheihe.module.bbs.utils.b.M(viewHolder, data, "default", ViewUtils.f(((com.max.hbcommon.base.d) d.this).mContext, 4.0f), null, null);
            AbsVideoView absVideoView = (AbsVideoView) viewHolder.i(R.id.video_view);
            if (absVideoView != null) {
                absVideoView.setFocusable(false);
                absVideoView.setFocusableInTouchMode(false);
                absVideoView.clearFocus();
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, BBSLinkObj bBSLinkObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSLinkObj}, this, changeQuickRedirect, false, 42987, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, bBSLinkObj);
        }
    }

    /* JADX INFO: compiled from: SearchForbidUserPostFragment.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<BBSLinkListResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f91646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f91647c;

        c(String str, d dVar) {
            this.f91646b = str;
            this.f91647c = dVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42989, new Class[0], Void.TYPE).isSupported && f0.g(this.f91646b, d.O5(this.f91647c)) && this.f91647c.isActive()) {
                super.onComplete();
                d.K5(this.f91647c, this.f91646b);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 42988, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (f0.g(this.f91646b, d.O5(this.f91647c)) && this.f91647c.isActive()) {
                super.onError(e10);
                d.K5(this.f91647c, this.f91646b);
            }
        }

        public void onNext(@dl.d Result<BBSLinkListResultObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 42990, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (f0.g(this.f91646b, d.O5(this.f91647c)) && this.f91647c.isActive()) {
                super.onNext(result);
                if (result.getResult() != null) {
                    BBSLinkListResultObj result2 = result.getResult();
                    f0.m(result2);
                    if (result2.getLinks() != null) {
                        if (d.N5(this.f91647c) == 0) {
                            this.f91647c.I.clear();
                        }
                        ArrayList arrayList = this.f91647c.I;
                        BBSLinkListResultObj result3 = result.getResult();
                        f0.m(result3);
                        arrayList.addAll(result3.getLinks());
                    }
                }
                d.P5(this.f91647c);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 42991, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSLinkListResultObj>) obj);
        }
    }

    public static final /* synthetic */ void K5(d dVar, String str) {
        if (PatchProxy.proxy(new Object[]{dVar, str}, null, changeQuickRedirect, true, 42982, new Class[]{d.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        dVar.Q3(str);
    }

    public static final /* synthetic */ int N5(d dVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar}, null, changeQuickRedirect, true, 42983, new Class[]{d.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : dVar.c4();
    }

    public static final /* synthetic */ String O5(d dVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar}, null, changeQuickRedirect, true, 42981, new Class[]{d.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : dVar.d4();
    }

    public static final /* synthetic */ void P5(d dVar) {
        if (PatchProxy.proxy(new Object[]{dVar}, null, changeQuickRedirect, true, 42984, new Class[]{d.class}, Void.TYPE).isSupported) {
            return;
        }
        dVar.Q5();
    }

    private final void Q5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42979, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        s<BBSLinkObj> sVar = this.J;
        f0.m(sVar);
        sVar.notifyDataSetChanged();
        if (this.I.isEmpty()) {
            y4();
        } else {
            E5(true);
            N4().setVisibility(8);
        }
    }

    private final void R5(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 42978, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().B4(null, c4(), a4(), str, U4(), null, null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c(str, this)));
    }

    @Override // com.max.hbsearch.y0, com.max.hbsearch.k
    @dl.e
    public List<SearchHotwordObj> Z3() {
        return null;
    }

    @Override // com.max.hbsearch.y0
    public void Z4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42975, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.J = new b(this.mContext, this.I);
    }

    @Override // com.max.hbsearch.y0
    public void a5() {
    }

    @Override // com.max.hbsearch.y0
    public void h5(@dl.d String q10, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{q10, str}, this, changeQuickRedirect, false, 42977, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(q10, "q");
        R5(q10);
    }

    @Override // com.max.hbsearch.k
    public int i4() {
        return 14;
    }

    @Override // com.max.hbsearch.y0, com.max.hbsearch.k
    @dl.d
    public String j4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42980, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String strN0 = com.max.xiaoheihe.utils.d.n0(R.string.search_user_post);
        f0.o(strN0, "getString(R.string.search_user_post)");
        return strN0;
    }

    @Override // com.max.hbsearch.y0
    public void j5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42976, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        P4().setAdapter(this.J);
    }
}
