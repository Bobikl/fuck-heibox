package com.max.xiaoheihe.module.search.viewholderbinder;

import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.GeneralSearchInfo;
import com.max.xiaoheihe.bean.game.recommend.SpaceObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchSpaceVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class s extends a0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f91866l = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(@dl.d z param) {
        super(param);
        f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0, cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, GeneralSearchInfo generalSearchInfo) {
        if (PatchProxy.proxy(new Object[]{eVar, generalSearchInfo}, this, changeQuickRedirect, false, 43375, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, generalSearchInfo);
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0
    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GeneralSearchInfo data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 43374, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GeneralSearchInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        super.f(viewHolder, data);
        SpaceObj spaceObj = (SpaceObj) com.max.hbutils.utils.k.a(data.getInfo(), SpaceObj.class);
        View view = viewHolder.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = spaceObj.getHeightPx();
        view.setLayoutParams(layoutParams);
        if (com.max.hbcommon.utils.c.u(spaceObj.getBg_color())) {
            view.setBackgroundColor(com.max.xiaoheihe.accelworld.l.h(o().q(), R.color.background_layer_2_color));
            return;
        }
        String bg_color = spaceObj.getBg_color();
        f0.m(bg_color);
        view.setBackgroundColor(com.max.hbutils.utils.a.g(bg_color));
    }
}
