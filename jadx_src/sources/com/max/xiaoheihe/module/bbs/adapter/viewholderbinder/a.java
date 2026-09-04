package com.max.xiaoheihe.module.bbs.adapter.viewholderbinder;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.u;
import com.max.hbsearch.SearchNewActivity;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.module.bbs.LinkListV2Fragment;
import com.max.xiaoheihe.module.bbs.adapter.m;
import com.max.xiaoheihe.utils.i0;
import com.mcxtzhang.swipemenulib.SwipeMenuLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LinkNormalVHB.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class a extends com.max.xiaoheihe.module.bbs.adapter.viewholderbinder.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f80642l = 0;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.adapter.viewholderbinder.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LinkNormalVHB.kt */
    public static final class ViewOnClickListenerC0688a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSLinkObj f80644c;

        ViewOnClickListenerC0688a(BBSLinkObj bBSLinkObj) {
            this.f80644c = bBSLinkObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27528, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if ((a.this.h() instanceof SearchNewActivity) && this.f80644c.getReport_id() != null) {
                com.max.hbcommon.utils.k.f(this.f80644c.getReport_id(), UiKitSpanObj.TYPE_CLICK, this.f80644c.getCustom_index(), this.f80644c.getCustom_suggested_from());
            }
            m.b bVarJ = a.this.j();
            if (bVarJ != null) {
                bVarJ.a(this.f80644c);
            }
            com.max.xiaoheihe.module.bbs.utils.b.E(a.this.h(), this.f80644c);
        }
    }

    /* JADX INFO: compiled from: LinkNormalVHB.kt */
    public static final class b implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSLinkObj f80646c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CheckBox f80647d;

        b(BBSLinkObj bBSLinkObj, CheckBox checkBox) {
            this.f80646c = bBSLinkObj;
            this.f80647d = checkBox;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27529, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (!i0.e(a.this.h())) {
                compoundButton.setChecked(!z10);
                return;
            }
            if (f0.g("1", this.f80646c.getIs_award_link())) {
                this.f80647d.setChecked(false);
                m.b bVarJ = a.this.j();
                if (bVarJ != null) {
                    bVarJ.c(this.f80646c, "0");
                    return;
                }
                return;
            }
            this.f80647d.setChecked(true);
            m.b bVarJ2 = a.this.j();
            if (bVarJ2 != null) {
                bVarJ2.c(this.f80646c, "1");
            }
        }
    }

    /* JADX INFO: compiled from: LinkNormalVHB.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSLinkObj f80649c;

        c(BBSLinkObj bBSLinkObj) {
            this.f80649c = bBSLinkObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            m.b bVarJ;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27530, new Class[]{View.class}, Void.TYPE).isSupported || a.this.j() == null || (bVarJ = a.this.j()) == null) {
                return;
            }
            bVarJ.d(this.f80649c);
        }
    }

    /* JADX INFO: compiled from: LinkNormalVHB.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ s.e f80651c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ BBSLinkObj f80652d;

        d(s.e eVar, BBSLinkObj bBSLinkObj) {
            this.f80651c = eVar;
            this.f80652d = bBSLinkObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27531, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context contextH = a.this.h();
            String strI = a.this.i();
            u<?> uVarF = a.this.f();
            f0.n(uVarF, "null cannot be cast to non-null type com.max.xiaoheihe.module.bbs.adapter.LinkListAdapter");
            List<BBSLinkObj> dataList = ((m) uVarF).getDataList();
            u<?> uVarF2 = a.this.f();
            f0.n(uVarF2, "null cannot be cast to non-null type com.max.xiaoheihe.module.bbs.adapter.LinkListAdapter");
            com.max.xiaoheihe.module.bbs.utils.b.h(contextH, strI, dataList, (m) uVarF2, this.f80651c.getAdapterPosition(), this.f80652d.getLinkid());
        }
    }

    /* JADX INFO: compiled from: LinkNormalVHB.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ s.e f80654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ BBSLinkObj f80655d;

        e(s.e eVar, BBSLinkObj bBSLinkObj) {
            this.f80654c = eVar;
            this.f80655d = bBSLinkObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27532, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            u<?> uVarF = a.this.f();
            f0.n(uVarF, "null cannot be cast to non-null type com.max.xiaoheihe.module.bbs.adapter.LinkListAdapter");
            ((m) uVarF).u(this.f80654c.getAdapterPosition(), this.f80655d.getH_src(), this.f80655d.getLinkid());
        }
    }

    /* JADX INFO: compiled from: LinkNormalVHB.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSLinkObj f80656b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CheckBox f80657c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f80658d;

        f(BBSLinkObj bBSLinkObj, CheckBox checkBox, a aVar) {
            this.f80656b = bBSLinkObj;
            this.f80657c = checkBox;
            this.f80658d = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27533, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f80656b.setChecked(this.f80657c.isChecked());
            u<?> uVarF = this.f80658d.f();
            f0.n(uVarF, "null cannot be cast to non-null type com.max.xiaoheihe.module.bbs.adapter.LinkListAdapter");
            ((m) uVarF).x(this.f80657c.isChecked());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@dl.d com.max.xiaoheihe.module.bbs.adapter.viewholderbinder.b param) {
        super(param);
        f0.p(param, "param");
    }

    @Override // cb.c
    public /* bridge */ /* synthetic */ void b(s.e eVar, BBSLinkObj bBSLinkObj) {
        if (PatchProxy.proxy(new Object[]{eVar, bBSLinkObj}, this, changeQuickRedirect, false, 27527, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        z(eVar, bBSLinkObj);
    }

    public void z(@dl.d s.e viewHolder, @dl.d BBSLinkObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 27526, new Class[]{s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        StringBuilder sb2 = new StringBuilder();
        List<?> dataList = f().getDataList();
        f0.o(dataList, "adapter.dataList");
        sb2.append(CollectionsKt___CollectionsKt.Y2(dataList, data));
        sb2.append("");
        data.setIndex(sb2.toString());
        String str = "default";
        if ((f0.g(LinkListV2Fragment.f79978z, k()) || f0.g(LinkListV2Fragment.f79976x, k()) || f0.g(LinkListV2Fragment.B, k())) && !f0.g("20", data.getLink_tag()) && o()) {
            str = com.max.xiaoheihe.module.bbs.utils.b.f83400e;
        }
        com.max.xiaoheihe.module.bbs.utils.b.M(viewHolder, data, str, (f0.g(LinkListV2Fragment.f79977y, k()) || f0.g(LinkListV2Fragment.f79978z, k())) ? 0 : ViewUtils.f(h(), 4.0f), m(), null);
        View viewB = viewHolder.b();
        if (viewHolder.d() == R.layout.item_update) {
            viewB.setTag(null);
            viewB.setOnClickListener(null);
        } else {
            viewB.setTag(data);
            viewB.setOnClickListener(new ViewOnClickListenerC0688a(data));
        }
        CheckBox checkBox = (CheckBox) viewHolder.i(R.id.cb_feedback_up);
        if (checkBox != null) {
            checkBox.setOnCheckedChangeListener(new b(data, checkBox));
        }
        View viewI = viewHolder.i(R.id.vg_share);
        if (viewI != null) {
            viewI.setOnClickListener(new c(data));
        }
        View viewI2 = viewHolder.i(R.id.tv_move);
        if (viewI2 != null) {
            viewI2.setOnClickListener(new d(viewHolder, data));
            if (R.layout.item_link_list_swipe_deleted == viewHolder.d()) {
                viewI2.setVisibility(8);
            }
        }
        View viewI3 = viewHolder.i(R.id.tv_del);
        if (viewI3 != null) {
            viewI3.setOnClickListener(new e(viewHolder, data));
        }
        View viewI4 = viewHolder.i(R.id.vg_checkbox);
        CheckBox checkBox2 = (CheckBox) viewHolder.i(R.id.f76243cb);
        SwipeMenuLayout swipeMenuLayout = (SwipeMenuLayout) viewHolder.i(R.id.sml);
        if (viewI4 == null || checkBox2 == null) {
            return;
        }
        if (!n()) {
            if (swipeMenuLayout != null) {
                swipeMenuLayout.setSwipeEnable(true);
            }
            viewI4.setVisibility(8);
        } else {
            if (swipeMenuLayout != null) {
                swipeMenuLayout.setSwipeEnable(false);
            }
            viewI4.setVisibility(0);
            checkBox2.setChecked(data.isChecked());
            checkBox2.setOnClickListener(new f(data, checkBox2, this));
        }
    }
}
