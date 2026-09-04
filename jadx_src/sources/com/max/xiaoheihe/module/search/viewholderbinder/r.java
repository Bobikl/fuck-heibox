package com.max.xiaoheihe.module.search.viewholderbinder;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.max.hbsearch.SearchNewFragment;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.GeneralSearchInfo;
import com.max.xiaoheihe.bean.search.RelevantSearchListObj;
import com.max.xiaoheihe.bean.search.RelevantSearchObj;
import com.max.xiaoheihe.module.search.SearchHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import df.tw;
import df.xx;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchRelevantSearchVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class r extends a0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f91837l = 0;

    /* JADX INFO: compiled from: SearchRelevantSearchVHB.kt */
    public static final class a extends com.max.hbcommon.base.adapter.s<RelevantSearchObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.search.viewholderbinder.r$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SearchRelevantSearchVHB.kt */
        public static final class ViewOnClickListenerC0863a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ RelevantSearchObj f91838b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TextView f91839c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ com.max.hbcommon.base.adapter.s.e f91840d;

            ViewOnClickListenerC0863a(RelevantSearchObj relevantSearchObj, TextView textView, com.max.hbcommon.base.adapter.s.e eVar) {
                this.f91838b = relevantSearchObj;
                this.f91839c = textView;
                this.f91840d = eVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43373, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                String report_id = this.f91838b.getReport_id();
                if (report_id != null) {
                    com.max.hbcommon.utils.k.f(report_id, UiKitSpanObj.TYPE_CLICK, String.valueOf(this.f91840d.getAbsoluteAdapterPosition()), null);
                }
                Context context = this.f91839c.getContext();
                f0.o(context, "context");
                String text = this.f91838b.getText();
                Bundle bundleE = SearchHelper.f91573a.a().e("main");
                bundleE.putString("quick_from", "relevant_search");
                bundleE.putBoolean(SearchNewFragment.f72180d4, true);
                b2 b2Var = b2.f124493a;
                com.max.xiaoheihe.base.router.b.y0(context, text, bundleE).A();
            }
        }

        a(Context context, List<RelevantSearchObj> list) {
            super(context, list, R.layout.item_relevan_search);
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e RelevantSearchObj relevantSearchObj) {
            View view;
            RelevantSearchObj relevantSearchObj2;
            if (PatchProxy.proxy(new Object[]{eVar, relevantSearchObj}, this, changeQuickRedirect, false, 43371, new Class[]{com.max.hbcommon.base.adapter.s.e.class, RelevantSearchObj.class}, Void.TYPE).isSupported || eVar == null || (view = eVar.itemView) == null) {
                return;
            }
            if (relevantSearchObj != null) {
                relevantSearchObj.setCustom_index(String.valueOf(eVar.getAbsoluteAdapterPosition()));
                b2 b2Var = b2.f124493a;
                relevantSearchObj2 = relevantSearchObj;
            } else {
                relevantSearchObj2 = null;
            }
            view.setTag(R.id.search_report_data, relevantSearchObj2);
            if (relevantSearchObj != null) {
                TextView textView = tw.a(view).f116083b;
                textView.setText(relevantSearchObj.getText());
                com.max.xiaoheihe.accelworld.l.q(textView, R.color.background_card_1_color, 3.0f);
                textView.setOnClickListener(new ViewOnClickListenerC0863a(relevantSearchObj, textView, eVar));
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, RelevantSearchObj relevantSearchObj) {
            if (PatchProxy.proxy(new Object[]{eVar, relevantSearchObj}, this, changeQuickRedirect, false, 43372, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, relevantSearchObj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(@dl.d z param) {
        super(param);
        f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0, cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, GeneralSearchInfo generalSearchInfo) {
        if (PatchProxy.proxy(new Object[]{eVar, generalSearchInfo}, this, changeQuickRedirect, false, 43370, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, generalSearchInfo);
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0
    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GeneralSearchInfo data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 43369, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GeneralSearchInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        super.f(viewHolder, data);
        RelevantSearchListObj relevantSearchListObj = (RelevantSearchListObj) com.max.hbutils.utils.k.a(data.getInfo(), RelevantSearchListObj.class);
        if (relevantSearchListObj != null) {
            viewHolder.itemView.setTag(R.id.search_report_data, relevantSearchListObj);
            xx xxVarA = xx.a(viewHolder.itemView);
            xxVarA.f117649c.setText(relevantSearchListObj.getHead_text());
            xxVarA.f117648b.setLayoutManager(new GridLayoutManager(m(), 2));
            if (xxVarA.f117648b.getItemDecorationCount() == 0) {
                xxVarA.f117648b.addItemDecoration(new fc.b(2, com.max.xiaoheihe.accelworld.l.c(8.0f, m()), false));
            }
            xxVarA.f117648b.setAdapter(new a(m(), relevantSearchListObj.getItems()));
        }
    }
}
