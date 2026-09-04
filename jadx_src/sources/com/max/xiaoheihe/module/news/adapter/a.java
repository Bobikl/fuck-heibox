package com.max.xiaoheihe.module.news.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.core.view.j1;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.u;
import com.max.hbuikit.bean.UiKitViewObj;
import com.max.hbuikit.utils.UiKitTemplateManager;
import com.max.video.AbsVideoView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.bean.news.FeedsUiKitObj;
import com.max.xiaoheihe.module.game.a2;
import com.max.xiaoheihe.module.news.NewsHelper;
import com.max.xiaoheihe.module.news.viewholderbinder.g0;
import com.max.xiaoheihe.module.news.viewholderbinder.h0;
import com.max.xiaoheihe.module.news.viewholderbinder.i0;
import com.max.xiaoheihe.module.news.viewholderbinder.o;
import com.max.xiaoheihe.view.uikit.HBUiKitView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ConceptFeedsAdapter.java */
/* JADX INFO: loaded from: classes12.dex */
public class a extends u<FeedsContentBaseObj> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f91286i = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f91287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f91288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.max.hbcommon.view.a f91289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AbsVideoView f91290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f91291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a2 f91292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<WeakReference<InterfaceC0842a>> f91293h;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.news.adapter.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ConceptFeedsAdapter.java */
    public interface InterfaceC0842a {
        void a(@n0 RecyclerView recyclerView, int i10, int i11);
    }

    /* JADX INFO: compiled from: ConceptFeedsAdapter.java */
    public interface b {
        void B3(int i10);

        void G2(int i10);
    }

    public a(Context context, List<FeedsContentBaseObj> list) {
        this(context, list, null);
    }

    public a(Context context, List<FeedsContentBaseObj> list, b bVar) {
        super(context, list);
        this.f91288c = true;
        this.f91293h = new ArrayList();
        this.f91287b = context;
        this.f91291f = bVar;
        this.f91292g = new a2();
    }

    @Override // com.max.hbcommon.base.adapter.u, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 42560, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (!BBSLinkObj.CONTENT_TYPE_UI_KIT.equals(getDataList().get(i10).getContent_type())) {
            return super.getItemViewType(i10);
        }
        FeedsUiKitObj feedsUiKitObj = (FeedsUiKitObj) getDataList().get(i10);
        o.a aVar = o.f91489k;
        Integer numValueOf = aVar.a().get(feedsUiKitObj.getUi_kit().getTemplate_id());
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(j1.D());
            aVar.a().put(feedsUiKitObj.getUi_kit().getTemplate_id(), numValueOf);
        }
        return numValueOf.intValue();
    }

    @Override // com.max.hbcommon.base.adapter.u
    public /* bridge */ /* synthetic */ int m(int i10, FeedsContentBaseObj feedsContentBaseObj) {
        Object[] objArr = {new Integer(i10), feedsContentBaseObj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 42563, new Class[]{cls, Object.class}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : o(i10, feedsContentBaseObj);
    }

    public void n() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42562, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f91292g.f();
    }

    public int o(int i10, FeedsContentBaseObj feedsContentBaseObj) {
        Object[] objArr = {new Integer(i10), feedsContentBaseObj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 42559, new Class[]{cls, FeedsContentBaseObj.class}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : NewsHelper.b().c(feedsContentBaseObj);
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Object obj) {
        if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 42564, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        p(eVar, (FeedsContentBaseObj) obj);
    }

    @Override // com.max.hbcommon.base.adapter.u, com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 42565, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : onCreateViewHolder(viewGroup, i10);
    }

    @Override // com.max.hbcommon.base.adapter.u, com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
    public s.e onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 42558, new Class[]{ViewGroup.class, Integer.TYPE}, s.e.class);
        if (patchProxyResultProxy.isSupported) {
            return (s.e) patchProxyResultProxy.result;
        }
        o.a aVar = o.f91489k;
        if (!aVar.a().containsValue(Integer.valueOf(i10))) {
            return super.onCreateViewHolder(viewGroup, i10);
        }
        HBUiKitView hBUiKitView = new HBUiKitView(this.f91287b);
        hBUiKitView.setId(R.id.v_ui_kit);
        for (String str : aVar.a().keySet()) {
            Integer num = o.f91489k.a().get(str);
            if (num != null && num.intValue() == i10) {
                UiKitViewObj uiKitViewObjG = UiKitTemplateManager.f().g(str);
                if (uiKitViewObjG == null) {
                    break;
                }
                hBUiKitView.setDataToCreate(uiKitViewObjG);
                hBUiKitView.setTag(R.id.v_ui_kit, uiKitViewObjG.getTemplate_id());
                break;
            }
        }
        s.e eVar = new s.e(R.layout.item_news_feeds_ui_kit, hBUiKitView);
        setListener(viewGroup, R.layout.item_news_feeds_ui_kit, hBUiKitView, eVar);
        return eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void p(s.e eVar, FeedsContentBaseObj feedsContentBaseObj) {
        h0 h0VarA;
        if (PatchProxy.proxy(new Object[]{eVar, feedsContentBaseObj}, this, changeQuickRedirect, false, 42561, new Class[]{s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported || (h0VarA = i0.f91463a.a(new g0(this.f91287b, this, this.f91291f, this.f91292g, this.f91288c, this.f91290e, Boolean.TRUE), eVar.d())) == 0) {
            return;
        }
        h0VarA.g(eVar, feedsContentBaseObj);
        if (h0VarA instanceof InterfaceC0842a) {
            InterfaceC0842a interfaceC0842a = (InterfaceC0842a) h0VarA;
            if (this.f91293h.contains(interfaceC0842a)) {
                return;
            }
            this.f91293h.add(new WeakReference<>(interfaceC0842a));
        }
    }

    public void q(RecyclerView recyclerView, int i10, int i11) {
        Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 42557, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(this.f91293h)) {
            return;
        }
        for (WeakReference<InterfaceC0842a> weakReference : this.f91293h) {
            if (weakReference.get() != null) {
                weakReference.get().a(recyclerView, i10, i11);
            }
        }
    }
}
