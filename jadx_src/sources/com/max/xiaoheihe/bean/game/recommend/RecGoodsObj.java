package com.max.xiaoheihe.bean.game.recommend;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.mall.MallProductObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RecGoodsObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class RecGoodsObj extends GameRecommendBaseObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<MallProductObj> items;

    @e
    private String protocol;

    @Override // com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj
    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15400, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecGoodsObj) || !super.equals(obj)) {
            return false;
        }
        RecGoodsObj recGoodsObj = (RecGoodsObj) obj;
        return f0.g(this.items, recGoodsObj.items) && f0.g(this.protocol, recGoodsObj.protocol);
    }

    @e
    public final List<MallProductObj> getItems() {
        return this.items;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @Override // com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15401, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<MallProductObj> list = this.items;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.protocol;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setItems(@e List<MallProductObj> list) {
        this.items = list;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }
}
