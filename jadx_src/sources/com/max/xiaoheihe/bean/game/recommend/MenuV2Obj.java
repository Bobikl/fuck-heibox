package com.max.xiaoheihe.bean.game.recommend;

import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.bean.MenuObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MenuV2Obj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class MenuV2Obj extends GameRecommendBaseObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<MenuObj> items;

    @Override // com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj
    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15388, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || !f0.g(MenuV2Obj.class, obj.getClass())) {
            return false;
        }
        return k.f(this, obj);
    }

    @e
    public final List<MenuObj> getItems() {
        return this.items;
    }

    public final void setItems(@e List<MenuObj> list) {
        this.items = list;
    }
}
