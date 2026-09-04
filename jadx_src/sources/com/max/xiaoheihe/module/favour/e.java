package com.max.xiaoheihe.module.favour;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.s;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.df;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CheckableLinkConceptFeedsAdapter.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
@SuppressLint({"NotifyDataSetChanged"})
public class e extends com.max.xiaoheihe.module.news.adapter.a implements FavourLinkFolderFragment.b {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f83886o = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final Context f83887j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f83888k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f83889l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f83890m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.e
    private l0.h<BBSLinkObj> f83891n;

    /* JADX INFO: compiled from: CheckableLinkConceptFeedsAdapter.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSLinkObj f83892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CheckBox f83893c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f83894d;

        a(BBSLinkObj bBSLinkObj, CheckBox checkBox, e eVar) {
            this.f83892b = bBSLinkObj;
            this.f83893c = checkBox;
            this.f83894d = eVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31620, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f83892b.setChecked(this.f83893c.isChecked());
            e.s(this.f83894d, this.f83893c.isChecked());
        }
    }

    /* JADX INFO: compiled from: CheckableLinkConceptFeedsAdapter.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FeedsContentBaseObj f83895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f83896c;

        b(FeedsContentBaseObj feedsContentBaseObj, e eVar) {
            this.f83895b = feedsContentBaseObj;
            this.f83896c = eVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31621, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.k.b(this.f83895b.getAd_report());
            com.max.xiaoheihe.module.bbs.utils.b.C(this.f83896c.f83887j, this.f83895b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@dl.d Context context, @dl.d List<? extends BBSLinkObj> linkDataList) {
        super(context, linkDataList);
        f0.p(context, "context");
        f0.p(linkDataList, "linkDataList");
        this.f83887j = context;
    }

    public static final /* synthetic */ void s(e eVar, boolean z10) {
        if (PatchProxy.proxy(new Object[]{eVar, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 31619, new Class[]{e.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        eVar.w(z10);
    }

    private final void t(boolean z10) {
        l0.h<BBSLinkObj> hVar;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 31614, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || (hVar = this.f83891n) == null) {
            return;
        }
        if (z10) {
            hVar.a(null);
        } else {
            hVar.b(null);
        }
    }

    private final void u(View view, FeedsContentBaseObj feedsContentBaseObj) {
        if (PatchProxy.proxy(new Object[]{view, feedsContentBaseObj}, this, changeQuickRedirect, false, 31612, new Class[]{View.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (feedsContentBaseObj.getAd_report() != null && !f0.g("1", feedsContentBaseObj.getIsReported())) {
            com.max.hbcommon.utils.k.c(feedsContentBaseObj.getAd_report());
            feedsContentBaseObj.setIsReported("1");
        }
        view.setTag(feedsContentBaseObj);
        view.setOnClickListener(new b(feedsContentBaseObj, this));
    }

    private final void w(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 31613, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            this.f83888k++;
        } else {
            this.f83888k--;
        }
        if (this.f83888k == this.mDataList.size()) {
            t(true);
        } else {
            t(false);
        }
    }

    @Override // com.max.xiaoheihe.module.favour.FavourLinkFolderFragment.b
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31615, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f83889l = true;
        this.f83888k = 0;
        notifyDataSetChanged();
    }

    @Override // com.max.xiaoheihe.module.favour.FavourLinkFolderFragment.b
    public void b(int i10) {
        this.f83888k = i10;
    }

    @Override // com.max.xiaoheihe.module.favour.FavourLinkFolderFragment.b
    public void g(@dl.e l0.h<BBSLinkObj> hVar) {
        this.f83891n = hVar;
    }

    @Override // com.max.xiaoheihe.module.favour.FavourLinkFolderFragment.b
    public void k() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31616, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f83889l = false;
        notifyDataSetChanged();
        this.f83888k = 0;
    }

    @Override // com.max.xiaoheihe.module.news.adapter.a, com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Object obj) {
        if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 31618, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        p(eVar, (FeedsContentBaseObj) obj);
    }

    @Override // com.max.xiaoheihe.module.news.adapter.a, com.max.hbcommon.base.adapter.u, com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 31617, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : onCreateViewHolder(viewGroup, i10);
    }

    @Override // com.max.xiaoheihe.module.news.adapter.a, com.max.hbcommon.base.adapter.u, com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
    @dl.d
    public s.e onCreateViewHolder(@dl.d ViewGroup parent, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parent, new Integer(i10)}, this, changeQuickRedirect, false, 31610, new Class[]{ViewGroup.class, Integer.TYPE}, s.e.class);
        if (patchProxyResultProxy.isSupported) {
            return (s.e) patchProxyResultProxy.result;
        }
        f0.p(parent, "parent");
        s.e eVarOnCreateViewHolder = super.onCreateViewHolder(parent, i10);
        f0.o(eVarOnCreateViewHolder, "super.onCreateViewHolder(parent, viewType)");
        View viewB = eVarOnCreateViewHolder.b();
        if (viewB == null) {
            return eVarOnCreateViewHolder;
        }
        df dfVarD = df.d(this.mInflater, parent, false);
        dfVarD.f109777c.addView(viewB);
        f0.o(dfVarD, "inflate(\n            mIn…(innerItemView)\n        }");
        s.e eVar = new s.e(i10, dfVarD.b());
        setListener(parent, i10, dfVarD.b(), eVar);
        return eVar;
    }

    @Override // com.max.xiaoheihe.module.news.adapter.a
    public void p(@dl.e s.e eVar, @dl.e FeedsContentBaseObj feedsContentBaseObj) {
        View childAt;
        if (PatchProxy.proxy(new Object[]{eVar, feedsContentBaseObj}, this, changeQuickRedirect, false, 31611, new Class[]{s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        super.p(eVar, feedsContentBaseObj);
        BBSLinkObj bBSLinkObj = feedsContentBaseObj instanceof BBSLinkObj ? (BBSLinkObj) feedsContentBaseObj : null;
        if (eVar == null || bBSLinkObj == null) {
            return;
        }
        bBSLinkObj.setIndex(String.valueOf(eVar.getBindingAdapterPosition()));
        View viewI = eVar.i(R.id.vg_checkbox);
        CheckBox checkBox = (CheckBox) eVar.i(R.id.f76243cb);
        if (viewI != null && checkBox != null) {
            if (this.f83889l) {
                viewI.setVisibility(0);
                checkBox.setChecked(bBSLinkObj.isChecked());
                checkBox.setOnClickListener(new a(bBSLinkObj, checkBox, this));
            } else {
                viewI.setVisibility(8);
            }
        }
        FrameLayout frameLayout = (FrameLayout) eVar.i(R.id.fl_link_container);
        if (frameLayout != null && (childAt = frameLayout.getChildAt(0)) != null && !f0.g(bBSLinkObj.getIs_deleted(), "1")) {
            u(childAt, bBSLinkObj);
        }
        TextView textView = (TextView) eVar.i(R.id.bbs_name);
        if (textView != null) {
            textView.setTextColor(f0.g(bBSLinkObj.getIs_deleted(), "1") ? this.f83887j.getColor(R.color.text_secondary_1_color) : this.f83887j.getColor(R.color.text_primary_1_color));
        }
    }

    public final void v(boolean z10) {
        this.f83890m = z10;
    }
}
