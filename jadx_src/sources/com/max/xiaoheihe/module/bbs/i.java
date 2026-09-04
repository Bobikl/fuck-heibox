package com.max.xiaoheihe.module.bbs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.max.hbcommon.base.adapter.AbsListItemReportHelper;
import com.max.hbcommon.base.adapter.Event;
import com.max.hbcommon.bean.analytics.BBSLinkViewShowsObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.mall.RecommendBoardItem;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;

/* JADX INFO: compiled from: FeedListItemReportHelper.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public class i<L extends RecyclerView.Adapter<?>> extends AbsListItemReportHelper<L, Object, BBSLinkViewShowsObj> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f81203r = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private final Class<?> f81204p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.e
    private String f81205q;

    /* JADX INFO: compiled from: FeedListItemReportHelper.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f81206a;

        static {
            int[] iArr = new int[Event.valuesCustom().length];
            try {
                iArr[Event.SCROLL_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Event.SCROLL_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f81206a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@dl.d androidx.lifecycle.y context, @dl.d RecyclerView recyclerView, @dl.d Class<?> onlyClass) {
        super(context, recyclerView, false, 4, null);
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(recyclerView, "recyclerView");
        kotlin.jvm.internal.f0.p(onlyClass, "onlyClass");
        this.f81204p = onlyClass;
    }

    @Override // com.max.hbcommon.base.adapter.AbsListItemReportHelper, com.max.hbcommon.base.adapter.a0
    public void a(int i10, @dl.e RecyclerView.ViewHolder viewHolder, float f10) {
        Object objF;
        if (PatchProxy.proxy(new Object[]{new Integer(i10), viewHolder, new Float(f10)}, this, changeQuickRedirect, false, 26287, new Class[]{Integer.TYPE, RecyclerView.ViewHolder.class, Float.TYPE}, Void.TYPE).isSupported || (objF = f(i10, viewHolder)) == null) {
            return;
        }
        if (viewHolder instanceof com.max.hbcommon.base.adapter.s.e) {
            com.max.hbcommon.base.adapter.s.e eVar = (com.max.hbcommon.base.adapter.s.e) viewHolder;
            Object objH = eVar.h(99);
            if ((objH instanceof com.max.xiaoheihe.module.news.viewholderbinder.h0) && (objF instanceof FeedsContentBaseObj)) {
                ((com.max.xiaoheihe.module.news.viewholderbinder.h0) objH).c(eVar, objF);
            }
        }
        super.a(i10, viewHolder, f10);
    }

    @Override // com.max.hbcommon.base.adapter.AbsListItemReportHelper, com.max.hbcommon.base.adapter.a0
    public void b(int i10, @dl.e RecyclerView.ViewHolder viewHolder) {
        Object objF;
        if (PatchProxy.proxy(new Object[]{new Integer(i10), viewHolder}, this, changeQuickRedirect, false, 26288, new Class[]{Integer.TYPE, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported || (objF = f(i10, viewHolder)) == null) {
            return;
        }
        if (viewHolder instanceof com.max.hbcommon.base.adapter.s.e) {
            com.max.hbcommon.base.adapter.s.e eVar = (com.max.hbcommon.base.adapter.s.e) viewHolder;
            Object objH = eVar.h(99);
            if ((objH instanceof com.max.xiaoheihe.module.news.viewholderbinder.h0) && (objF instanceof FeedsContentBaseObj)) {
                ((com.max.xiaoheihe.module.news.viewholderbinder.h0) objH).e(eVar, objF);
            }
        }
        super.b(i10, viewHolder);
    }

    @Override // com.max.hbcommon.base.adapter.AbsListItemReportHelper, com.max.hbcommon.base.adapter.a0
    public void c(int i10, @dl.e RecyclerView.ViewHolder viewHolder) {
        Object objF;
        if (PatchProxy.proxy(new Object[]{new Integer(i10), viewHolder}, this, changeQuickRedirect, false, 26286, new Class[]{Integer.TYPE, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported || (objF = f(i10, viewHolder)) == null) {
            return;
        }
        if (viewHolder instanceof com.max.hbcommon.base.adapter.s.e) {
            com.max.hbcommon.base.adapter.s.e eVar = (com.max.hbcommon.base.adapter.s.e) viewHolder;
            Object objH = eVar.h(99);
            if ((objH instanceof com.max.xiaoheihe.module.news.viewholderbinder.h0) && (objF instanceof FeedsContentBaseObj)) {
                ((com.max.xiaoheihe.module.news.viewholderbinder.h0) objH).d(eVar, objF);
            }
        }
        super.c(i10, viewHolder);
    }

    @Override // com.max.hbcommon.base.adapter.AbsListItemReportHelper
    @dl.e
    public Object f(int i10, @dl.e RecyclerView.ViewHolder viewHolder) {
        Object tag;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), viewHolder}, this, changeQuickRedirect, false, 26291, new Class[]{Integer.TYPE, RecyclerView.ViewHolder.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (viewHolder == null || (tag = viewHolder.itemView.getTag()) == null || !this.f81204p.isAssignableFrom(tag.getClass())) {
            return null;
        }
        return tag;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.max.hbcommon.bean.analytics.BBSLinkViewShowsObj, java.lang.Object] */
    @Override // com.max.hbcommon.base.adapter.AbsListItemReportHelper
    public /* bridge */ /* synthetic */ BBSLinkViewShowsObj i(Object obj, Event event) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, event}, this, changeQuickRedirect, false, 26292, new Class[]{Object.class, Event.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : s(obj, event);
    }

    @Override // com.max.hbcommon.base.adapter.AbsListItemReportHelper
    public boolean k(@dl.d Object entity, @dl.d Event event) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{entity, event}, this, changeQuickRedirect, false, 26285, new Class[]{Object.class, Event.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        kotlin.jvm.internal.f0.p(entity, "entity");
        kotlin.jvm.internal.f0.p(event, "event");
        if (!(entity instanceof BBSLinkObj)) {
            return false;
        }
        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j.f81208a);
        sb2.append(", needPostEvent event = ");
        sb2.append(event);
        sb2.append(" title = ");
        BBSLinkObj bBSLinkObj = (BBSLinkObj) entity;
        sb2.append(bBSLinkObj.getTitle());
        sb2.append(", ");
        sb2.append(bBSLinkObj.isShowTracked());
        sb2.append(' ');
        sb2.append(bBSLinkObj.isHideTracked());
        aVar.q(sb2.toString());
        int i10 = a.f81206a[event.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (bBSLinkObj.isHideTracked()) {
                return false;
            }
        } else if (bBSLinkObj.isShowTracked()) {
            return false;
        }
        return true;
    }

    @Override // com.max.hbcommon.base.adapter.AbsListItemReportHelper
    public void l(@dl.d List<? extends Triple<? extends BBSLinkViewShowsObj, ? extends Event, Integer>> tripleList) {
        if (PatchProxy.proxy(new Object[]{tripleList}, this, changeQuickRedirect, false, 26290, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(tripleList, "tripleList");
        com.max.xiaoheihe.utils.d.f();
    }

    @Override // com.max.hbcommon.base.adapter.AbsListItemReportHelper
    public void m(@dl.d Object entity, @dl.d Event event) {
        if (PatchProxy.proxy(new Object[]{entity, event}, this, changeQuickRedirect, false, 26283, new Class[]{Object.class, Event.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(entity, "entity");
        kotlin.jvm.internal.f0.p(event, "event");
        super.m(entity, event);
        if (entity instanceof FeedsContentBaseObj) {
            int i10 = a.f81206a[event.ordinal()];
            if (i10 == 1) {
                ((FeedsContentBaseObj) entity).setShowTracked(true);
            } else {
                if (i10 != 2) {
                    return;
                }
                ((FeedsContentBaseObj) entity).setHideTracked(true);
            }
        }
    }

    @Override // com.max.hbcommon.base.adapter.AbsListItemReportHelper
    public /* bridge */ /* synthetic */ void n(BBSLinkViewShowsObj bBSLinkViewShowsObj, Event event, int i10) {
        if (PatchProxy.proxy(new Object[]{bBSLinkViewShowsObj, event, new Integer(i10)}, this, changeQuickRedirect, false, 26294, new Class[]{Object.class, Event.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        t(bBSLinkViewShowsObj, event, i10);
    }

    @Override // com.max.hbcommon.base.adapter.AbsListItemReportHelper
    public /* bridge */ /* synthetic */ void p(BBSLinkViewShowsObj bBSLinkViewShowsObj, Event event, int i10) {
        if (PatchProxy.proxy(new Object[]{bBSLinkViewShowsObj, event, new Integer(i10)}, this, changeQuickRedirect, false, 26293, new Class[]{Object.class, Event.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        u(bBSLinkViewShowsObj, event, i10);
    }

    @dl.d
    public final Class<?> r() {
        return this.f81204p;
    }

    @dl.d
    public BBSLinkViewShowsObj s(@dl.d Object entity, @dl.d Event event) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{entity, event}, this, changeQuickRedirect, false, 26282, new Class[]{Object.class, Event.class}, BBSLinkViewShowsObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BBSLinkViewShowsObj) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(entity, "entity");
        kotlin.jvm.internal.f0.p(event, "event");
        if (entity instanceof LinkInfoObj) {
            LinkInfoObj linkInfoObj = (LinkInfoObj) entity;
            linkInfoObj.setTime("" + com.max.hbutils.utils.w.C());
            BBSLinkViewShowsObj bBSLinkViewShowsObjGenerateLinkViewShowInfo = LinkInfoObj.generateLinkViewShowInfo(linkInfoObj);
            kotlin.jvm.internal.f0.o(bBSLinkViewShowsObjGenerateLinkViewShowInfo, "generateLinkViewShowInfo(entity)");
            return bBSLinkViewShowsObjGenerateLinkViewShowInfo;
        }
        if (entity instanceof RecommendBoardItem) {
            return ((RecommendBoardItem) entity).generateShowInfo();
        }
        if (!(entity instanceof BBSLinkObj)) {
            return new BBSLinkViewShowsObj();
        }
        BBSLinkObj bBSLinkObj = (BBSLinkObj) entity;
        bBSLinkObj.setTime("" + com.max.hbutils.utils.w.C());
        BBSLinkViewShowsObj bBSLinkViewShowsObjGenerateLinkViewShowInfo2 = BBSLinkObj.generateLinkViewShowInfo(bBSLinkObj);
        String str = this.f81205q;
        if (!(str == null || str.length() == 0)) {
            bBSLinkViewShowsObjGenerateLinkViewShowInfo2.setQuick_from(this.f81205q);
        }
        kotlin.jvm.internal.f0.o(bBSLinkViewShowsObjGenerateLinkViewShowInfo2, "generateLinkViewShowInfo…          }\n            }");
        return bBSLinkViewShowsObjGenerateLinkViewShowInfo2;
    }

    public void t(@dl.d BBSLinkViewShowsObj entity, @dl.d Event event, int i10) {
        if (PatchProxy.proxy(new Object[]{entity, event, new Integer(i10)}, this, changeQuickRedirect, false, 26289, new Class[]{BBSLinkViewShowsObj.class, Event.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(entity, "entity");
        kotlin.jvm.internal.f0.p(event, "event");
        if (entity.getId() <= 0) {
            return;
        }
        com.max.heybox.hblog.g.f74531b.q(j.f81208a + ", onItemExposure event = " + event + ", bindingAdapterPosition = " + i10);
        int i11 = a.f81206a[event.ordinal()];
        if (i11 == 1) {
            com.max.xiaoheihe.utils.d.d(true, com.max.hbutils.utils.k.p(entity));
        } else {
            if (i11 != 2) {
                return;
            }
            com.max.xiaoheihe.utils.d.d(false, com.max.hbutils.utils.k.p(entity));
        }
    }

    public void u(@dl.d BBSLinkViewShowsObj entity, @dl.d Event event, int i10) {
        if (PatchProxy.proxy(new Object[]{entity, event, new Integer(i10)}, this, changeQuickRedirect, false, 26284, new Class[]{BBSLinkViewShowsObj.class, Event.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(entity, "entity");
        kotlin.jvm.internal.f0.p(event, "event");
        com.max.heybox.hblog.g.f74531b.q(j.f81208a + ", putEntity event = " + event + ", bindingAdapterPosition = " + i10);
        super.p(entity, event, i10);
    }

    public final void v(@dl.e String str) {
        this.f81205q = str;
    }
}
