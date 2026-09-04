package com.max.xiaoheihe.bean.game.recommend;

import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.bean.game.AllRecommendGameHeaderObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BannerObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class BannerObj extends GameRecommendBaseObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private ArrayList<AllRecommendGameHeaderObj> items;

    @Override // com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj
    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15336, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || !f0.g(BannerObj.class, obj.getClass())) {
            return false;
        }
        return k.f(this, obj);
    }

    @e
    public final ArrayList<AllRecommendGameHeaderObj> getItems() {
        return this.items;
    }

    public final void setItems(@e ArrayList<AllRecommendGameHeaderObj> arrayList) {
        this.items = arrayList;
    }
}
