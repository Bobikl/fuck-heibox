package com.tencent.thumbplayer.tcmedia.adapter.strategy;

import com.tencent.thumbplayer.tcmedia.adapter.strategy.utils.TPStrategyUtils;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.tencent.thumbplayer.tcmedia.adapter.strategy.a.a f102418a;

    public b(com.tencent.thumbplayer.tcmedia.adapter.strategy.a.a aVar) {
        this.f102418a = aVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.strategy.a
    public int a(com.tencent.thumbplayer.tcmedia.adapter.b bVar) {
        int iA = this.f102418a.a();
        if (iA == 0) {
            if (b(bVar)) {
                return 2;
            }
            return TPStrategyUtils.isSystemPlayerEnable() ? 1 : 0;
        }
        if (iA == 1) {
            return b(bVar) ? 2 : 0;
        }
        if (iA == 2) {
            if (b(bVar)) {
                return 2;
            }
            return TPStrategyUtils.isSystemPlayerEnable() ? 1 : 0;
        }
        if (iA == 3) {
            return c(bVar) ? 1 : 0;
        }
        if (iA != 4) {
            return 0;
        }
        if (c(bVar)) {
            return 1;
        }
        return TPStrategyUtils.isThumbPlayerEnable() ? 2 : 0;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.strategy.a
    public int a(com.tencent.thumbplayer.tcmedia.adapter.b bVar, com.tencent.thumbplayer.tcmedia.adapter.strategy.a.b bVar2) {
        int iA = this.f102418a.a();
        if (bVar2 != null && bVar2.a() == 0) {
            return a(bVar);
        }
        if (!a(bVar2)) {
            return 0;
        }
        if (iA != 0) {
            if (iA != 2) {
                return (iA == 4 && bVar2 != null && bVar2.a() == 1 && b(bVar)) ? 2 : 0;
            }
            return (bVar2 != null && bVar2.a() == 2 && c(bVar)) ? 1 : 0;
        }
        if (bVar2 != null && bVar2.a() == 1) {
            return b(bVar) ? 2 : 0;
        }
        if (bVar2 != null && bVar2.a() == 2 && c(bVar)) {
            return 1;
        }
        return 0;
    }

    protected boolean a(com.tencent.thumbplayer.tcmedia.adapter.strategy.a.b bVar) {
        return false;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.strategy.a
    public int[] a() {
        int iB = this.f102418a.b();
        if (iB != 0) {
            if (iB == 1) {
                return new int[]{102};
            }
            if (iB != 2) {
                if (iB == 3) {
                    return new int[]{101};
                }
                if (iB != 4) {
                    return null;
                }
                return new int[]{101, 102};
            }
        }
        return new int[]{102, 101};
    }

    boolean b(com.tencent.thumbplayer.tcmedia.adapter.b bVar) {
        if (TPStrategyUtils.isTVPlatform()) {
            return TPStrategyUtils.isThumbPlayerEnable();
        }
        return TPStrategyUtils.isThumbPlayerEnable() && TPStrategyUtils.enablePlayByThumbPlayer(bVar);
    }

    boolean c(com.tencent.thumbplayer.tcmedia.adapter.b bVar) {
        if (TPStrategyUtils.isTVPlatform()) {
            return true;
        }
        return TPStrategyUtils.isSystemPlayerEnable() && TPStrategyUtils.enablePlayBySystemPlayer(bVar);
    }
}
