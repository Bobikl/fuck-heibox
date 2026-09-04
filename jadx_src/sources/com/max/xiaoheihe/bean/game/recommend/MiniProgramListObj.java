package com.max.xiaoheihe.bean.game.recommend;

import androidx.compose.runtime.internal.o;
import com.max.hbminiprogram.bean.MiniProgramObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MiniProgramListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class MiniProgramListObj extends GameRecommendBaseObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<MiniProgramObj> items;

    @Override // com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj
    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15389, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof MiniProgramListObj) && super.equals(obj) && f0.g(this.items, ((MiniProgramListObj) obj).items);
    }

    @e
    public final List<MiniProgramObj> getItems() {
        return this.items;
    }

    public final void setItems(@e List<MiniProgramObj> list) {
        this.items = list;
    }
}
