package com.max.xiaoheihe.module.search.viewholderbinder;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.GeneralSearchInfo;
import com.max.xiaoheihe.module.search.SearchHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: SearchTitleVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nSearchTitleVHB.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchTitleVHB.kt\ncom/max/xiaoheihe/module/search/viewholderbinder/SearchTitleVHB\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,46:1\n262#2,2:47\n*S KotlinDebug\n*F\n+ 1 SearchTitleVHB.kt\ncom/max/xiaoheihe/module/search/viewholderbinder/SearchTitleVHB\n*L\n31#1:47,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class u extends a0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f91871l = 0;

    /* JADX INFO: compiled from: SearchTitleVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GeneralSearchInfo f91873c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ KeyDescObj f91874d;

        a(GeneralSearchInfo generalSearchInfo, KeyDescObj keyDescObj) {
            this.f91873c = generalSearchInfo;
            this.f91874d = keyDescObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43381, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            u.this.g(this.f91873c);
            com.max.xiaoheihe.base.router.b.j0(u.this.o().q(), this.f91874d.getProtocol());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(@dl.d z param) {
        super(param);
        f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0, cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, GeneralSearchInfo generalSearchInfo) {
        if (PatchProxy.proxy(new Object[]{eVar, generalSearchInfo}, this, changeQuickRedirect, false, 43380, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, generalSearchInfo);
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0
    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GeneralSearchInfo data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 43379, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GeneralSearchInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        super.f(viewHolder, data);
        KeyDescObj keyDescObj = (KeyDescObj) com.max.hbutils.utils.k.a(data.getInfo(), KeyDescObj.class);
        View view = viewHolder.itemView;
        if (com.max.hbcommon.utils.c.u(keyDescObj.getColor())) {
            view.setBackgroundColor(com.max.xiaoheihe.accelworld.l.h(o().q(), R.color.background_layer_2_color));
        } else {
            String color = keyDescObj.getColor();
            f0.m(color);
            view.setBackgroundColor(com.max.hbutils.utils.a.g(color));
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_arrow);
        if (imageView != null) {
            f0.o(imageView, "findViewById<ImageView>(R.id.iv_arrow)");
            imageView.setVisibility(com.max.hbcommon.utils.c.u(keyDescObj.getProtocol()) ^ true ? 0 : 8);
        }
        TextView textView = (TextView) view.findViewById(R.id.tv_title);
        if (textView != null) {
            f0.o(textView, "findViewById<TextView>(R.id.tv_title)");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(keyDescObj.getName());
            SearchHelper.f91573a.a().h(spannableStringBuilder);
            textView.setText(spannableStringBuilder);
        }
        view.setOnClickListener(new a(data, keyDescObj));
    }
}
