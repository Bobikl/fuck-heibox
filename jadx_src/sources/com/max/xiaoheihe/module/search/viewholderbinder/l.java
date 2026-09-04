package com.max.xiaoheihe.module.search.viewholderbinder;

import com.max.xiaoheihe.bean.GeneralSearchInfo;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchGameVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class l extends a0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f91810l = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@dl.d z param) {
        super(param);
        f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0, cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, GeneralSearchInfo generalSearchInfo) {
        if (PatchProxy.proxy(new Object[]{eVar, generalSearchInfo}, this, changeQuickRedirect, false, 43347, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, generalSearchInfo);
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0
    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GeneralSearchInfo data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 43346, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GeneralSearchInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        super.f(viewHolder, data);
        GameObj gameListData = (GameObj) com.max.hbutils.utils.k.a(data.getInfo(), GameObj.class);
        gameListData.setReport_id(data.getReport_id());
        gameListData.setCustom_index(data.getReport_idx());
        gameListData.setCustom_suggested_from(data.getSuggested_from());
        com.max.xiaoheihe.module.game.adapter.viewholderbinder.gamelist.e eVarA = com.max.xiaoheihe.module.game.adapter.viewholderbinder.gamelist.c.f86384a.a(new com.max.xiaoheihe.module.game.adapter.viewholderbinder.gamelist.d(m(), h(), i(), k(), false), viewHolder.d());
        f0.o(gameListData, "gameListData");
        eVarA.f(viewHolder, gameListData);
    }
}
