package com.max.xiaoheihe.module.bbs.adapter;

import android.content.Context;
import android.view.View;
import androidx.annotation.i0;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.module.bbs.utils.BBSKtUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WaterfallLinkAdapter.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class z<T extends FeedsContentBaseObj> extends com.max.hbcommon.base.adapter.u<T> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f80761g = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f80762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final List<T> f80763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final WeakReference<RecyclerView> f80764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f80765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private yh.l<? super Integer, b2> f80766f;

    /* JADX INFO: compiled from: WaterfallLinkAdapter.kt */
    public static final class a implements View.OnLongClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z<T> f80767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f80768c;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.adapter.z$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: WaterfallLinkAdapter.kt */
        public static final class C0690a implements com.max.xiaoheihe.module.news.g.e {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ z<T> f80769a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ T f80770b;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.adapter.z$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: WaterfallLinkAdapter.kt */
            public static final class RunnableC0691a implements Runnable {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ RecyclerView f80771b;

                RunnableC0691a(RecyclerView recyclerView) {
                    this.f80771b = recyclerView;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27514, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    this.f80771b.invalidateItemDecorations();
                }
            }

            C0690a(z<T> zVar, T t10) {
                this.f80769a = zVar;
                this.f80770b = t10;
            }

            @Override // com.max.xiaoheihe.module.news.g.e
            public final void a() {
                int iIndexOf;
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27513, new Class[0], Void.TYPE).isSupported && (iIndexOf = ((z) this.f80769a).f80763c.indexOf(this.f80770b)) >= 0 && iIndexOf < ((z) this.f80769a).f80763c.size()) {
                    ((z) this.f80769a).f80763c.remove(iIndexOf);
                    this.f80769a.notifyItemRemoved(iIndexOf);
                    RecyclerView recyclerView = (RecyclerView) ((z) this.f80769a).f80764d.get();
                    if (recyclerView != null) {
                        recyclerView.post(new RunnableC0691a(recyclerView));
                    }
                }
            }
        }

        a(z<T> zVar, T t10) {
            this.f80767b = zVar;
            this.f80768c = t10;
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27512, new Class[]{View.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (((z) this.f80767b).f80762b instanceof FragmentActivity) {
                com.max.xiaoheihe.module.news.g gVarC4 = com.max.xiaoheihe.module.news.g.c4(((BBSLinkObj) this.f80768c).getLinkid(), ((BBSLinkObj) this.f80768c).getFeedback(), ((BBSLinkObj) this.f80768c).getH_src(), "2");
                gVarC4.g4(new C0690a(this.f80767b, this.f80768c));
                gVarC4.show(((FragmentActivity) ((z) this.f80767b).f80762b).getSupportFragmentManager(), "NegativeFeedback");
            }
            return true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(@dl.d Context context, @dl.d List<T> list, @dl.d RecyclerView recyclerView) {
        this(context, list, (WeakReference<RecyclerView>) new WeakReference(recyclerView));
        f0.p(context, "context");
        f0.p(list, "list");
        f0.p(recyclerView, "recyclerView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(@dl.d Context mContext, @dl.d List<T> mNewList, @dl.d WeakReference<RecyclerView> mRecyclerViewRef) {
        super(mContext, mNewList);
        f0.p(mContext, "mContext");
        f0.p(mNewList, "mNewList");
        f0.p(mRecyclerViewRef, "mRecyclerViewRef");
        this.f80762b = mContext;
        this.f80763c = mNewList;
        this.f80764d = mRecyclerViewRef;
        this.f80765e = -1;
    }

    private final void q(com.max.hbcommon.base.adapter.s.e eVar, T t10) {
        BBSLinkObj bBSLinkObj;
        BBSUserInfoObj bBSUserInfoObjU;
        if (PatchProxy.proxy(new Object[]{eVar, t10}, this, changeQuickRedirect, false, 27507, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported || !(t10 instanceof BBSLinkObj) || (bBSUserInfoObjU = u((bBSLinkObj = (BBSLinkObj) t10))) == null) {
            return;
        }
        com.max.xiaoheihe.module.bbs.utils.b.L(this.f80762b, bBSLinkObj, bBSUserInfoObjU, eVar, new a(this, t10));
    }

    private final void r(com.max.hbcommon.base.adapter.s.e eVar, T t10) {
        if (PatchProxy.proxy(new Object[]{eVar, t10}, this, changeQuickRedirect, false, 27509, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        BBSLinkObj bBSLinkObj = t10 instanceof BBSLinkObj ? (BBSLinkObj) t10 : null;
        if (bBSLinkObj == null) {
            com.max.heybox.hblog.g.f74531b.v("[bindHashtagDetailLinkItemViewHolder] invalid param: data is null");
            return;
        }
        BBSUserInfoObj bBSUserInfoObjU = u(bBSLinkObj);
        if (bBSUserInfoObjU != null) {
            BBSKtUtils.f83254a.n(this.f80762b, bBSLinkObj, bBSUserInfoObjU, eVar, null, this.f80766f);
        }
    }

    private final BBSUserInfoObj u(BBSLinkObj bBSLinkObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSLinkObj}, this, changeQuickRedirect, false, 27508, new Class[]{BBSLinkObj.class}, BBSUserInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BBSUserInfoObj) patchProxyResultProxy.result;
        }
        if (!f0.g("28", bBSLinkObj.getContent_type()) && !f0.g("29", bBSLinkObj.getContent_type())) {
            return bBSLinkObj.getUser();
        }
        BBSUserInfoObj bBSUserInfoObj = new BBSUserInfoObj();
        bBSUserInfoObj.setAvartar(bBSLinkObj.getAuthor().getAvatar());
        bBSUserInfoObj.setUsername(bBSLinkObj.getAuthor().getNickname());
        return bBSUserInfoObj;
    }

    @Override // com.max.hbcommon.base.adapter.u
    public /* bridge */ /* synthetic */ int m(int i10, Object obj) {
        Object[] objArr = {new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 27510, new Class[]{cls, Object.class}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : s(i10, (FeedsContentBaseObj) obj);
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
        if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 27511, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        t(eVar, (FeedsContentBaseObj) obj);
    }

    public int s(int i10, @dl.d T data) {
        Object[] objArr = {new Integer(i10), data};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 27505, new Class[]{cls, FeedsContentBaseObj.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(data, "data");
        int i11 = this.f80765e;
        if (i11 != -1) {
            return i11;
        }
        return (f0.g("0", data.getContent_type()) || f0.g("1", data.getContent_type()) || f0.g("2", data.getContent_type()) || f0.g("4", data.getContent_type()) || f0.g("15", data.getContent_type()) || f0.g("16", data.getContent_type()) || f0.g("28", data.getContent_type()) || f0.g("29", data.getContent_type())) ? R.layout.item_concept_link : R.layout.item_concept_feeds_not_support;
    }

    public void t(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e T t10) {
        if (PatchProxy.proxy(new Object[]{eVar, t10}, this, changeQuickRedirect, false, 27506, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        Integer numValueOf = eVar != null ? Integer.valueOf(eVar.d()) : null;
        if (numValueOf != null && numValueOf.intValue() == R.layout.item_concept_link) {
            q(eVar, t10);
        } else if (numValueOf != null && numValueOf.intValue() == R.layout.item_waterfall_hashtag_detal_link) {
            r(eVar, t10);
        }
    }

    public final void v(@i0 int i10) {
        this.f80765e = i10;
    }

    public final void w(@dl.e yh.l<? super Integer, b2> lVar) {
        this.f80766f = lVar;
    }
}
