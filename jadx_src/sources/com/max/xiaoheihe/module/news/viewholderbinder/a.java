package com.max.xiaoheihe.module.news.viewholderbinder;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.bean.rich.RichStackModelObj;
import com.max.xiaoheihe.view.richtext.RichStackModelView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

/* JADX INFO: compiled from: BaseNewsSupportSubVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public class a extends h0 implements com.max.xiaoheihe.module.news.adapter.a.InterfaceC0842a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f91355k = 0;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.news.viewholderbinder.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseNewsSupportSubVHB.kt */
    public static final class ViewOnClickListenerC0845a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RecyclerView.ViewHolder f91356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f91357c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<FeedsContentBaseObj> f91358d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ FeedsContentBaseObj f91359e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ LinearLayout f91360f;

        ViewOnClickListenerC0845a(RecyclerView.ViewHolder viewHolder, a aVar, List<FeedsContentBaseObj> list, FeedsContentBaseObj feedsContentBaseObj, LinearLayout linearLayout) {
            this.f91356b = viewHolder;
            this.f91357c = aVar;
            this.f91358d = list;
            this.f91359e = feedsContentBaseObj;
            this.f91360f = linearLayout;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42602, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            int absoluteAdapterPosition = this.f91356b.getAbsoluteAdapterPosition();
            com.max.hbcommon.base.adapter.u<?> uVarA = this.f91357c.p().a();
            kotlin.jvm.internal.f0.n(uVarA, "null cannot be cast to non-null type com.max.hbcommon.base.adapter.RVMultiTypeCommonAdapter<com.max.xiaoheihe.bean.news.FeedsContentBaseObj>");
            List<?> dataList = uVarA.getDataList();
            int i10 = absoluteAdapterPosition + 1;
            List<FeedsContentBaseObj> list = this.f91358d;
            kotlin.jvm.internal.f0.m(list);
            dataList.addAll(i10, list);
            com.max.hbcommon.base.adapter.u<?> uVarA2 = this.f91357c.p().a();
            List<FeedsContentBaseObj> list2 = this.f91358d;
            kotlin.jvm.internal.f0.m(list2);
            uVarA2.notifyItemRangeInserted(i10, list2.size());
            this.f91359e.setExpend(true);
            LinearLayout linearLayout = this.f91360f;
            if (linearLayout == null) {
                return;
            }
            linearLayout.setVisibility(8);
        }
    }

    /* JADX INFO: compiled from: BaseNewsSupportSubVHB.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RichStackModelView f91361b;

        b(RichStackModelView richStackModelView) {
            this.f91361b = richStackModelView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42603, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f91361b.performClick();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@dl.d g0 param) {
        super(param);
        kotlin.jvm.internal.f0.p(param, "param");
    }

    public final void M(@dl.e LinearLayout linearLayout, @dl.d RecyclerView.ViewHolder viewHolder, @dl.d FeedsContentBaseObj data) {
        if (PatchProxy.proxy(new Object[]{linearLayout, viewHolder, data}, this, changeQuickRedirect, false, 42601, new Class[]{LinearLayout.class, RecyclerView.ViewHolder.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        RichStackModelObj sub_rich_text = data.getSub_rich_text();
        List<FeedsContentBaseObj> events = data.getEvents();
        if (sub_rich_text == null) {
            if (linearLayout == null) {
                return;
            }
            linearLayout.setVisibility(8);
            return;
        }
        if (!com.max.hbcommon.utils.c.w(events) && data.isExpend()) {
            if (linearLayout == null) {
                return;
            }
            linearLayout.setVisibility(8);
            return;
        }
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        RichStackModelView richStackModelView = new RichStackModelView(p().c());
        richStackModelView.setRichStackData(sub_rich_text);
        if (linearLayout != null) {
            linearLayout.setGravity(17);
        }
        if (linearLayout != null) {
            linearLayout.addView(richStackModelView, new LinearLayout.LayoutParams(-2, -2));
        }
        int iE = com.max.xiaoheihe.utils.d.E(R.color.divider_secondary_2_color);
        if (linearLayout != null) {
            linearLayout.setBackground(ViewUtils.H(ViewUtils.o(m(), linearLayout), iE, iE));
        }
        if (!com.max.hbcommon.utils.c.w(events)) {
            richStackModelView.setOnClickListener(new ViewOnClickListenerC0845a(viewHolder, this, events, data, linearLayout));
        }
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new b(richStackModelView));
        }
    }

    @Override // com.max.xiaoheihe.module.news.adapter.a.InterfaceC0842a
    public void a(@dl.d RecyclerView recyclerView, int i10, int i11) {
        Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 42600, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(recyclerView, "recyclerView");
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void i(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42598, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void w(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BBSLinkObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42599, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
    }
}
