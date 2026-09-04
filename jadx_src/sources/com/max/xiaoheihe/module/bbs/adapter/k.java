package com.max.xiaoheihe.module.bbs.adapter;

import android.content.Context;
import android.view.View;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.module.bbs.HotNewsInfoWrapperObj;
import com.max.xiaoheihe.module.bbs.TYPE;
import com.max.xiaoheihe.module.bbs.component.BBSRankHotView;
import com.max.xiaoheihe.module.news.viewholderbinder.g0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: HotNewStyleAdapter.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class k extends com.max.hbcommon.base.adapter.u<HotNewsInfoWrapperObj> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f80524f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f80525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final com.max.xiaoheihe.module.news.adapter.a.b f80526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private final com.max.xiaoheihe.module.bbs.i<com.max.hbcommon.base.adapter.u<HotNewsInfoWrapperObj>> f80527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f80528e;

    /* JADX INFO: compiled from: HotNewStyleAdapter.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80529a;

        static {
            int[] iArr = new int[TYPE.valuesCustom().length];
            try {
                iArr[TYPE.RANK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TYPE.TITLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TYPE.NEWS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f80529a = iArr;
        }
    }

    /* JADX INFO: compiled from: HotNewStyleAdapter.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f80531c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<BBSLinkObj> f80532d;

        b(com.max.hbcommon.base.adapter.s.e eVar, Ref.ObjectRef<BBSLinkObj> objectRef) {
            this.f80531c = eVar;
            this.f80532d = objectRef;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27368, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            k.this.t(this.f80531c.getBindingAdapterPosition());
            com.max.xiaoheihe.module.bbs.utils.b.E(k.this.p(), this.f80532d.f124891b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@dl.d Context mContext, @dl.d List<HotNewsInfoWrapperObj> mLinkList, @dl.e com.max.xiaoheihe.module.news.adapter.a.b bVar, @dl.e com.max.xiaoheihe.module.bbs.i<com.max.hbcommon.base.adapter.u<HotNewsInfoWrapperObj>> iVar, boolean z10) {
        super(mContext, mLinkList);
        f0.p(mContext, "mContext");
        f0.p(mLinkList, "mLinkList");
        this.f80525b = mContext;
        this.f80526c = bVar;
        this.f80527d = iVar;
        this.f80528e = z10;
    }

    public /* synthetic */ k(Context context, List list, com.max.xiaoheihe.module.news.adapter.a.b bVar, com.max.xiaoheihe.module.bbs.i iVar, boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this(context, list, bVar, iVar, (i10 & 16) != 0 ? true : z10);
    }

    @Override // com.max.hbcommon.base.adapter.u
    public /* bridge */ /* synthetic */ int m(int i10, HotNewsInfoWrapperObj hotNewsInfoWrapperObj) {
        Object[] objArr = {new Integer(i10), hotNewsInfoWrapperObj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 27367, new Class[]{cls, Object.class}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, hotNewsInfoWrapperObj);
    }

    public int n(int i10, @dl.d HotNewsInfoWrapperObj data) {
        Object[] objArr = {new Integer(i10), data};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 27364, new Class[]{cls, HotNewsInfoWrapperObj.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(data, "data");
        int i11 = a.f80529a[data.f().ordinal()];
        if (i11 == 1) {
            return R.layout.item_community_hot_link;
        }
        if (i11 == 2) {
            return R.layout.item_hot_news_sub_title;
        }
        if (i11 == 3) {
            return R.layout.item_concept_feeds_news_normal;
        }
        throw new NoWhenBranchMatchedException();
    }

    @dl.e
    public final com.max.xiaoheihe.module.news.adapter.a.b o() {
        return this.f80526c;
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
        if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 27366, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        s(eVar, (HotNewsInfoWrapperObj) obj);
    }

    @dl.d
    public final Context p() {
        return this.f80525b;
    }

    @dl.e
    public final com.max.xiaoheihe.module.bbs.i<com.max.hbcommon.base.adapter.u<HotNewsInfoWrapperObj>> q() {
        return this.f80527d;
    }

    public final boolean r() {
        return this.f80528e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [T, com.max.xiaoheihe.bean.bbs.BBSLinkObj, java.lang.Object] */
    public void s(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d HotNewsInfoWrapperObj wrapper) {
        if (PatchProxy.proxy(new Object[]{viewHolder, wrapper}, this, changeQuickRedirect, false, 27363, new Class[]{com.max.hbcommon.base.adapter.s.e.class, HotNewsInfoWrapperObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(wrapper, "wrapper");
        if (viewHolder.d() != R.layout.item_community_hot_link) {
            if (viewHolder.d() == R.layout.item_concept_feeds_news_normal) {
                BBSLinkObj bBSLinkObjE = wrapper.e();
                f0.m(bBSLinkObjE);
                new com.max.xiaoheihe.module.news.viewholderbinder.c(new g0(this.f80525b, this, this.f80526c, null, true, null, null, 64, null)).g(viewHolder, bBSLinkObjE);
                return;
            }
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? E = wrapper.e();
        f0.m(E);
        objectRef.f124891b = E;
        View viewI = viewHolder.i(R.id.f76251rh);
        f0.o(viewI, "viewHolder.getView(R.id.rh)");
        BBSRankHotView bBSRankHotView = (BBSRankHotView) viewI;
        if (!com.max.hbcommon.utils.c.w(((BBSLinkObj) objectRef.f124891b).getThumbs())) {
            com.max.hbimage.b.d0(((BBSLinkObj) objectRef.f124891b).getThumbs().get(0), bBSRankHotView.getIv_img(), ViewUtils.f(this.f80525b, 2.0f));
        }
        bBSRankHotView.setShowReason(((BBSLinkObj) objectRef.f124891b).getBottom_rich_text());
        bBSRankHotView.setTitle(((BBSLinkObj) objectRef.f124891b).getTitle());
        bBSRankHotView.setComment(((BBSLinkObj) objectRef.f124891b).getComment_num());
        bBSRankHotView.setRank(viewHolder.getAdapterPosition() + 1);
        if (!this.f80528e) {
            bBSRankHotView.a();
        }
        viewHolder.itemView.setTag(objectRef.f124891b);
        viewHolder.itemView.setOnClickListener(new b(viewHolder, objectRef));
    }

    public final void t(int i10) {
        com.max.xiaoheihe.module.bbs.i<com.max.hbcommon.base.adapter.u<HotNewsInfoWrapperObj>> iVar;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 27365, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (iVar = this.f80527d) == null) {
            return;
        }
        iVar.q();
    }
}
