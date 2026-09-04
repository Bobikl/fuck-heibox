package com.max.xiaoheihe.module.search.viewholderbinder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.GeneralSearchInfo;
import com.max.xiaoheihe.bean.SearchToolObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: SearchToolCardVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nSearchToolCardVHB.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchToolCardVHB.kt\ncom/max/xiaoheihe/module/search/viewholderbinder/SearchToolCardVHB\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,48:1\n262#2,2:49\n*S KotlinDebug\n*F\n+ 1 SearchToolCardVHB.kt\ncom/max/xiaoheihe/module/search/viewholderbinder/SearchToolCardVHB\n*L\n32#1:49,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class v extends a0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f91875l = 0;

    /* JADX INFO: compiled from: SearchToolCardVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GeneralSearchInfo f91877c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f91878d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ SearchToolObj f91879e;

        a(GeneralSearchInfo generalSearchInfo, com.max.hbcommon.base.adapter.s.e eVar, SearchToolObj searchToolObj) {
            this.f91877c = generalSearchInfo;
            this.f91878d = eVar;
            this.f91879e = searchToolObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43384, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            v.this.g(this.f91877c);
            Context context = this.f91878d.itemView.getContext();
            f0.o(context, "viewHolder.itemView.context");
            com.max.xiaoheihe.base.router.b.k0(context, this.f91879e.getProtocol());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(@dl.d z param) {
        super(param);
        f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0, cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, GeneralSearchInfo generalSearchInfo) {
        if (PatchProxy.proxy(new Object[]{eVar, generalSearchInfo}, this, changeQuickRedirect, false, 43383, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, generalSearchInfo);
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0
    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GeneralSearchInfo data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 43382, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GeneralSearchInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        super.f(viewHolder, data);
        SearchToolObj searchToolObj = (SearchToolObj) com.max.hbutils.utils.k.a(data.getInfo(), SearchToolObj.class);
        ImageView imageView = (ImageView) viewHolder.i(R.id.iv_image);
        TextView textView = (TextView) viewHolder.i(R.id.tv_title);
        TextView textView2 = (TextView) viewHolder.i(R.id.tv_desc);
        TextView tv_tag = (TextView) viewHolder.i(R.id.tv_tag);
        TextView textView3 = (TextView) viewHolder.i(R.id.tv_button);
        com.max.hbimage.b.K(searchToolObj.getImage(), imageView);
        textView.setText(searchToolObj.getTitle());
        textView2.setText(searchToolObj.getDesc());
        f0.o(tv_tag, "tv_tag");
        tv_tag.setVisibility(com.max.hbcommon.utils.c.u(searchToolObj.getTag()) ^ true ? 0 : 8);
        tv_tag.setText(searchToolObj.getTag());
        String btn_text = searchToolObj.getBtn_text();
        if (btn_text == null) {
            btn_text = "进入";
        }
        textView3.setText(btn_text);
        textView3.setBackground(ViewUtils.i(com.max.xiaoheihe.accelworld.l.c(3.0f, m()), com.max.xiaoheihe.utils.d.E(R.color.icon_gradient_dark_start_color), com.max.xiaoheihe.utils.d.E(R.color.icon_gradient_dark_end_color)));
        viewHolder.itemView.setTag(data);
        viewHolder.itemView.setOnClickListener(new a(data, viewHolder, searchToolObj));
    }
}
