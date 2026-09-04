package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.rich.RichStackModelObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameImpressTagListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameImpressTagListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean is_empty;

    @d
    private List<RichStackModelObj> tag_list;

    public GameImpressTagListObj(boolean z10, @d List<RichStackModelObj> tag_list) {
        f0.p(tag_list, "tag_list");
        this.is_empty = z10;
        this.tag_list = tag_list;
    }

    public static /* synthetic */ GameImpressTagListObj copy$default(GameImpressTagListObj gameImpressTagListObj, boolean z10, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameImpressTagListObj, new Byte(z10 ? (byte) 1 : (byte) 0), list, new Integer(i10), obj}, null, changeQuickRedirect, true, 14829, new Class[]{GameImpressTagListObj.class, Boolean.TYPE, List.class, Integer.TYPE, Object.class}, GameImpressTagListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameImpressTagListObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            z10 = gameImpressTagListObj.is_empty;
        }
        if ((i10 & 2) != 0) {
            list = gameImpressTagListObj.tag_list;
        }
        return gameImpressTagListObj.copy(z10, list);
    }

    public final boolean component1() {
        return this.is_empty;
    }

    @d
    public final List<RichStackModelObj> component2() {
        return this.tag_list;
    }

    @d
    public final GameImpressTagListObj copy(boolean z10, @d List<RichStackModelObj> tag_list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), tag_list}, this, changeQuickRedirect, false, 14828, new Class[]{Boolean.TYPE, List.class}, GameImpressTagListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameImpressTagListObj) patchProxyResultProxy.result;
        }
        f0.p(tag_list, "tag_list");
        return new GameImpressTagListObj(z10, tag_list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14832, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameImpressTagListObj)) {
            return false;
        }
        GameImpressTagListObj gameImpressTagListObj = (GameImpressTagListObj) obj;
        return this.is_empty == gameImpressTagListObj.is_empty && f0.g(this.tag_list, gameImpressTagListObj.tag_list);
    }

    @d
    public final List<RichStackModelObj> getTag_list() {
        return this.tag_list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public int hashCode() {
        ?? r10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14831, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        boolean z10 = this.is_empty;
        if (z10) {
            r10 = z10;
            r10 = 1;
        }
        r10 = z10;
        return (r10 * 31) + this.tag_list.hashCode();
    }

    public final boolean is_empty() {
        return this.is_empty;
    }

    public final void setTag_list(@d List<RichStackModelObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 14827, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.tag_list = list;
    }

    public final void set_empty(boolean z10) {
        this.is_empty = z10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14830, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GameImpressTagListObj(is_empty=" + this.is_empty + ", tag_list=" + this.tag_list + ')';
    }
}
