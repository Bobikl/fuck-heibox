package com.max.xiaoheihe.bean.game.recommend;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FactoryListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class FactoryListObj extends GameRecommendBaseObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private ArrayList<FactoryObj> list;

    @Override // com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj
    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15339, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof FactoryListObj) && super.equals(obj) && f0.g(this.list, ((FactoryListObj) obj).list);
    }

    @e
    public final ArrayList<FactoryObj> getList() {
        return this.list;
    }

    @Override // com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15340, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ArrayList<FactoryObj> arrayList = this.list;
        if (arrayList != null) {
            return arrayList.hashCode();
        }
        return 0;
    }

    public final void setList(@e ArrayList<FactoryObj> arrayList) {
        this.list = arrayList;
    }
}
