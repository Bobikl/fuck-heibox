package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GetGameHistoryObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GetGameHistoryObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String key;

    @d
    private List<GameObj> value;

    public GetGameHistoryObj(@e String str, @d List<GameObj> value) {
        f0.p(value, "value");
        this.key = str;
        this.value = value;
    }

    public static /* synthetic */ GetGameHistoryObj copy$default(GetGameHistoryObj getGameHistoryObj, String str, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{getGameHistoryObj, str, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 14889, new Class[]{GetGameHistoryObj.class, String.class, List.class, Integer.TYPE, Object.class}, GetGameHistoryObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GetGameHistoryObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = getGameHistoryObj.key;
        }
        if ((i10 & 2) != 0) {
            list = getGameHistoryObj.value;
        }
        return getGameHistoryObj.copy(str, list);
    }

    @e
    public final String component1() {
        return this.key;
    }

    @d
    public final List<GameObj> component2() {
        return this.value;
    }

    @d
    public final GetGameHistoryObj copy(@e String str, @d List<GameObj> value) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, value}, this, changeQuickRedirect, false, 14888, new Class[]{String.class, List.class}, GetGameHistoryObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GetGameHistoryObj) patchProxyResultProxy.result;
        }
        f0.p(value, "value");
        return new GetGameHistoryObj(str, value);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14892, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetGameHistoryObj)) {
            return false;
        }
        GetGameHistoryObj getGameHistoryObj = (GetGameHistoryObj) obj;
        return f0.g(this.key, getGameHistoryObj.key) && f0.g(this.value, getGameHistoryObj.value);
    }

    @e
    public final String getKey() {
        return this.key;
    }

    @d
    public final List<GameObj> getValue() {
        return this.value;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14891, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.key;
        return ((str != null ? str.hashCode() : 0) * 31) + this.value.hashCode();
    }

    public final void setKey(@e String str) {
        this.key = str;
    }

    public final void setValue(@d List<GameObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 14887, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.value = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14890, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GetGameHistoryObj(key=" + this.key + ", value=" + this.value + ')';
    }
}
