package com.tencent.thumbplayer.tcmedia.common;

import com.tencent.thumbplayer.tcmedia.adapter.a.b;
import com.tencent.thumbplayer.tcmedia.core.player.TPDynamicStatisticParams;
import com.tencent.thumbplayer.tcmedia.core.player.TPGeneralPlayFlowParams;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class a implements com.tencent.thumbplayer.tcmedia.tplayer.a.a.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f102556a;

    public a(b bVar) {
        this.f102556a = bVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.a.a.a
    public TPDynamicStatisticParams a(boolean z10) {
        b bVar = this.f102556a;
        if (bVar == null) {
            TPLogUtil.e("TPPlayerInfoGetterImpl", "playerBase is null, return default dynamic statistic params");
            return new TPDynamicStatisticParams();
        }
        TPDynamicStatisticParams tPDynamicStatisticParamsC = bVar.c(z10);
        if (tPDynamicStatisticParamsC != null) {
            return tPDynamicStatisticParamsC;
        }
        TPLogUtil.e("TPPlayerInfoGetterImpl", "cannot get params from core, return default dynamic statistic params");
        return new TPDynamicStatisticParams();
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.a.a.a
    public TPGeneralPlayFlowParams a() {
        b bVar = this.f102556a;
        if (bVar == null) {
            TPLogUtil.e("TPPlayerInfoGetterImpl", "playerBase is null, return default general play flow params");
            return new TPGeneralPlayFlowParams();
        }
        TPGeneralPlayFlowParams tPGeneralPlayFlowParamsV = bVar.v();
        if (tPGeneralPlayFlowParamsV != null) {
            return tPGeneralPlayFlowParamsV;
        }
        TPLogUtil.e("TPPlayerInfoGetterImpl", "cannot get params from core, return default general play flow params");
        return new TPGeneralPlayFlowParams();
    }
}
