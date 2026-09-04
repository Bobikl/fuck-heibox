package com.max.xiaoheihe.module.news.viewholderbinder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.bean.news.FeedsLinkListItemObj;
import com.max.xiaoheihe.bean.news.FeedsLinkListObj;
import com.max.xiaoheihe.view.uikit.HBUiKitView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: NewsHorLinkListVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class t extends h0 implements com.max.xiaoheihe.module.news.adapter.a.InterfaceC0842a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f91500k = 0;

    /* JADX INFO: compiled from: NewsHorLinkListVHB.kt */
    @t0({"SMAP\nNewsHorLinkListVHB.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewsHorLinkListVHB.kt\ncom/max/xiaoheihe/module/news/viewholderbinder/NewsHorLinkListVHB$contentBinding$1$1$2$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,102:1\n262#2,2:103\n*S KotlinDebug\n*F\n+ 1 NewsHorLinkListVHB.kt\ncom/max/xiaoheihe/module/news/viewholderbinder/NewsHorLinkListVHB$contentBinding$1$1$2$1\n*L\n63#1:103,2\n*E\n"})
    public static final class a extends com.max.hbcommon.base.adapter.s<FeedsLinkListItemObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.news.viewholderbinder.t$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: NewsHorLinkListVHB.kt */
        public static final class ViewOnClickListenerC0851a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f91502b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ BBSLinkObj f91503c;

            ViewOnClickListenerC0851a(t tVar, BBSLinkObj bBSLinkObj) {
                this.f91502b = tVar;
                this.f91503c = bBSLinkObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42724, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.module.bbs.utils.b.C(this.f91502b.m(), this.f91503c);
            }
        }

        /* JADX INFO: compiled from: NewsHorLinkListVHB.kt */
        public static final class b implements View.OnLongClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BBSLinkObj f91504b;

            b(BBSLinkObj bBSLinkObj) {
                this.f91504b = bBSLinkObj;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View it) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 42725, new Class[]{View.class}, Boolean.TYPE);
                if (patchProxyResultProxy.isSupported) {
                    return ((Boolean) patchProxyResultProxy.result).booleanValue();
                }
                BBSLinkObj bBSLinkObj = this.f91504b;
                kotlin.jvm.internal.f0.o(it, "it");
                a.m(bBSLinkObj, it);
                return true;
            }
        }

        a(Context context, List<FeedsLinkListItemObj> list) {
            super(context, list, R.layout.item_hor_link_v2);
        }

        public static final /* synthetic */ void m(BBSLinkObj bBSLinkObj, View view) {
            if (PatchProxy.proxy(new Object[]{bBSLinkObj, view}, null, changeQuickRedirect, true, 42723, new Class[]{BBSLinkObj.class, View.class}, Void.TYPE).isSupported) {
                return;
            }
            o(bBSLinkObj, view);
        }

        private static final void o(BBSLinkObj bBSLinkObj, View view) {
            if (PatchProxy.proxy(new Object[]{bBSLinkObj, view}, null, changeQuickRedirect, true, 42721, new Class[]{BBSLinkObj.class, View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = view.getContext();
            FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
            if (fragmentActivity != null) {
                com.max.xiaoheihe.module.news.g.c4(bBSLinkObj.getLinkid(), bBSLinkObj.getFeedback(), bBSLinkObj.getH_src(), "2").show(fragmentActivity.getSupportFragmentManager(), "NegativeFeedback");
            }
        }

        public void n(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e FeedsLinkListItemObj feedsLinkListItemObj) {
            BBSLinkObj info;
            if (PatchProxy.proxy(new Object[]{eVar, feedsLinkListItemObj}, this, changeQuickRedirect, false, 42720, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsLinkListItemObj.class}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            t tVar = t.this;
            if (feedsLinkListItemObj == null || (info = feedsLinkListItemObj.getInfo()) == null) {
                return;
            }
            ImageView imageView = (ImageView) eVar.i(R.id.iv_img);
            if (imageView != null) {
                kotlin.jvm.internal.f0.o(imageView, "getView<ImageView>(R.id.iv_img)");
                com.max.hbimage.b.K(info.getThumbImageUrl(), imageView);
            }
            TextView textView = (TextView) eVar.i(R.id.tv_title);
            if (textView != null) {
                kotlin.jvm.internal.f0.o(textView, "getView<TextView>(R.id.tv_title)");
                String title = info.getTitle();
                if (title == null) {
                    title = info.getDescription();
                }
                textView.setText(title);
            }
            TextView textView2 = (TextView) eVar.i(R.id.tv_comment_num);
            if (textView2 != null) {
                kotlin.jvm.internal.f0.o(textView2, "getView<TextView>(R.id.tv_comment_num)");
                String comment_num = info.getComment_num();
                if (comment_num == null) {
                    comment_num = "0";
                }
                textView2.setText(comment_num);
            }
            HBUiKitView hBUiKitView = (HBUiKitView) eVar.i(R.id.v_bottom_uikit);
            if (hBUiKitView != null) {
                kotlin.jvm.internal.f0.o(hBUiKitView, "getView<HBUiKitView>(R.id.v_bottom_uikit)");
                hBUiKitView.setDataToCreate(info.getBottom_uikit());
                hBUiKitView.setVisibility(info.getBottom_uikit() != null ? 0 : 8);
            }
            View viewI = eVar.i(R.id.v_border);
            if (viewI != null) {
                kotlin.jvm.internal.f0.o(viewI, "getView<View>(R.id.v_border)");
                viewI.setBackground(com.max.hbutils.utils.q.L(tVar.m(), R.color.divider_secondary_1_color, 0.5f, 5.0f));
            }
            View view = eVar.itemView;
            view.setTag(info);
            view.setOnClickListener(new ViewOnClickListenerC0851a(tVar, info));
            view.setOnLongClickListener(new b(info));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, FeedsLinkListItemObj feedsLinkListItemObj) {
            if (PatchProxy.proxy(new Object[]{eVar, feedsLinkListItemObj}, this, changeQuickRedirect, false, 42722, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            n(eVar, feedsLinkListItemObj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(@dl.d g0 param) {
        super(param);
        kotlin.jvm.internal.f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.news.adapter.a.InterfaceC0842a
    public void a(@dl.d RecyclerView recyclerView, int i10, int i11) {
        Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 42719, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(recyclerView, "recyclerView");
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void i(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        List<FeedsLinkListItemObj> link_list;
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42717, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        FeedsLinkListObj feedsLinkListObj = data instanceof FeedsLinkListObj ? (FeedsLinkListObj) data : null;
        if (feedsLinkListObj == null || (link_list = feedsLinkListObj.getLink_list()) == null) {
            return;
        }
        for (FeedsLinkListItemObj feedsLinkListItemObj : link_list) {
            BBSLinkObj info = feedsLinkListItemObj.getInfo();
            if (info != null) {
                info.setCustom_index(String.valueOf(link_list.indexOf(feedsLinkListItemObj)));
                info.setReport_id(feedsLinkListItemObj.getReport_id());
            }
        }
        RecyclerView recyclerView = (RecyclerView) viewHolder.i(R.id.rv_item);
        if (recyclerView != null) {
            kotlin.jvm.internal.f0.o(recyclerView, "getView<RecyclerView>(R.id.rv_item)");
            if (recyclerView.getItemDecorationCount() == 0) {
                recyclerView.addItemDecoration(new com.max.hbcustomview.d((int) com.max.accelworld.c.a(10.0f, m()), (int) com.max.accelworld.c.a(12.0f, m())));
            }
            recyclerView.setLayoutManager(new LinearLayoutManager(m(), 0, false));
            recyclerView.setAdapter(new a(m(), feedsLinkListObj.getLink_list()));
        }
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void w(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BBSLinkObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42718, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
    }
}
