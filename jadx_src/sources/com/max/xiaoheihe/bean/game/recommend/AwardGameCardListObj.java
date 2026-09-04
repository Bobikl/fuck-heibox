package com.max.xiaoheihe.bean.game.recommend;

import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AwardGameCardListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public class AwardGameCardListObj extends GameRecommendBaseObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String auto_scroll;

    @e
    private List<AwardGameList> award_series;

    @Override // com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj
    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15330, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || !f0.g(getClass(), obj.getClass())) {
            return false;
        }
        return k.f(this, obj);
    }

    @e
    public final String getAuto_scroll() {
        return this.auto_scroll;
    }

    @e
    public final List<AwardGameList> getAward_series() {
        return this.award_series;
    }

    public final void setAuto_scroll(@e String str) {
        this.auto_scroll = str;
    }

    public final void setAward_series(@e List<AwardGameList> list) {
        this.award_series = list;
    }
}
