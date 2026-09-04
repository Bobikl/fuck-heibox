package com.max.xiaoheihe.module.search.viewholderbinder;

import android.view.View;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.GeneralSearchInfo;
import com.max.xiaoheihe.bean.search.SearchFeedbackInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchFeedbackVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class g extends a0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f91784l = 0;

    /* JADX INFO: compiled from: SearchFeedbackVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SearchFeedbackInfo f91786c;

        a(SearchFeedbackInfo searchFeedbackInfo) {
            this.f91786c = searchFeedbackInfo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43321, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(g.this.m(), this.f91786c.getProtocol());
        }
    }

    /* JADX INFO: compiled from: SearchFeedbackVHB.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GeneralSearchInfo f91787b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f91788c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f91789d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ SearchFeedbackInfo f91790e;

        b(GeneralSearchInfo generalSearchInfo, g gVar, com.max.hbcommon.base.adapter.s.e eVar, SearchFeedbackInfo searchFeedbackInfo) {
            this.f91787b = generalSearchInfo;
            this.f91788c = gVar;
            this.f91789d = eVar;
            this.f91790e = searchFeedbackInfo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43322, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f91787b.setCustom_clicked(true);
            this.f91788c.g(this.f91787b);
            this.f91788c.B(this.f91789d, this.f91790e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@dl.d z param) {
        super(param);
        f0.p(param, "param");
    }

    public final void B(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d SearchFeedbackInfo info) {
        if (PatchProxy.proxy(new Object[]{viewHolder, info}, this, changeQuickRedirect, false, 43319, new Class[]{com.max.hbcommon.base.adapter.s.e.class, SearchFeedbackInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(info, "info");
        TextView textView = (TextView) viewHolder.i(R.id.tv_desc);
        TextView textView2 = (TextView) viewHolder.i(R.id.tv_button);
        textView.setText("反馈成功");
        textView2.setText("点击进行详细反馈");
        textView2.setOnClickListener(new a(info));
    }

    public final void C(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d SearchFeedbackInfo info, @dl.d GeneralSearchInfo data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, info, data}, this, changeQuickRedirect, false, 43318, new Class[]{com.max.hbcommon.base.adapter.s.e.class, SearchFeedbackInfo.class, GeneralSearchInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(info, "info");
        f0.p(data, "data");
        TextView textView = (TextView) viewHolder.i(R.id.tv_desc);
        TextView textView2 = (TextView) viewHolder.i(R.id.tv_button);
        textView.setText("没有搜到您想要的内容");
        textView2.setText("点击进行反馈");
        textView2.setOnClickListener(new b(data, this, viewHolder, info));
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0, cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, GeneralSearchInfo generalSearchInfo) {
        if (PatchProxy.proxy(new Object[]{eVar, generalSearchInfo}, this, changeQuickRedirect, false, 43320, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, generalSearchInfo);
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0
    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GeneralSearchInfo data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 43317, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GeneralSearchInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        super.f(viewHolder, data);
        SearchFeedbackInfo info = (SearchFeedbackInfo) com.max.hbutils.utils.k.a(data.getInfo(), SearchFeedbackInfo.class);
        viewHolder.itemView.setTag(data);
        if (data.getCustom_clicked()) {
            f0.o(info, "info");
            B(viewHolder, info);
        } else {
            f0.o(info, "info");
            C(viewHolder, info, data);
        }
    }
}
