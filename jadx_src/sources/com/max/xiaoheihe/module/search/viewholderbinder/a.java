package com.max.xiaoheihe.module.search.viewholderbinder;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.module.search.SearchHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchTopicLinkListVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class a extends com.max.hbcommon.base.adapter.s<BBSLinkObj> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f91752c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f91753b;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.search.viewholderbinder.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SearchTopicLinkListVHB.kt */
    public static final class ViewOnClickListenerC0860a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSLinkObj f91754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f91755c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f91756d;

        ViewOnClickListenerC0860a(BBSLinkObj bBSLinkObj, com.max.hbcommon.base.adapter.s.e eVar, a aVar) {
            this.f91754b = bBSLinkObj;
            this.f91755c = eVar;
            this.f91756d = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43293, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.k.f(this.f91754b.getReport_id(), UiKitSpanObj.TYPE_CLICK, String.valueOf(this.f91755c.getAbsoluteAdapterPosition()), this.f91754b.getCustom_suggested_from());
            com.max.xiaoheihe.module.bbs.utils.b.E(this.f91756d.m(), this.f91754b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@dl.d Context context, @dl.d List<? extends BBSLinkObj> list) {
        super(context, list, R.layout.item_hor_link);
        f0.p(context, "context");
        f0.p(list, "list");
        this.f91753b = context;
    }

    @dl.d
    public final Context m() {
        return this.f91753b;
    }

    public void n(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e BBSLinkObj bBSLinkObj) {
        if (PatchProxy.proxy(new Object[]{eVar, bBSLinkObj}, this, changeQuickRedirect, false, 43291, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported || eVar == null || bBSLinkObj == null) {
            return;
        }
        eVar.itemView.setTag(bBSLinkObj);
        com.max.hbimage.b.K(bBSLinkObj.getImg(), (ImageView) eVar.i(R.id.iv_image));
        TextView textView = (TextView) eVar.i(R.id.tv_title);
        String title = bBSLinkObj.getTitle();
        if (title == null) {
            title = bBSLinkObj.getDescription();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(title);
        SearchHelper.f91573a.a().h(spannableStringBuilder);
        textView.setText(spannableStringBuilder);
        View viewI = eVar.i(R.id.v_border);
        viewI.setBackground(com.max.hbutils.utils.q.L(viewI.getContext(), R.color.divider_secondary_1_color, 0.5f, 5.0f));
        eVar.itemView.setOnClickListener(new ViewOnClickListenerC0860a(bBSLinkObj, eVar, this));
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, BBSLinkObj bBSLinkObj) {
        if (PatchProxy.proxy(new Object[]{eVar, bBSLinkObj}, this, changeQuickRedirect, false, 43292, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        n(eVar, bBSLinkObj);
    }
}
