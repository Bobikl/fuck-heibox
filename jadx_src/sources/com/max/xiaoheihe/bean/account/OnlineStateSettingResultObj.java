package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: OnlineStateSettingResultObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class OnlineStateSettingResultObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private OnlineStateSettingObj settings;

    public OnlineStateSettingResultObj(@e OnlineStateSettingObj onlineStateSettingObj) {
        this.settings = onlineStateSettingObj;
    }

    public static /* synthetic */ OnlineStateSettingResultObj copy$default(OnlineStateSettingResultObj onlineStateSettingResultObj, OnlineStateSettingObj onlineStateSettingObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{onlineStateSettingResultObj, onlineStateSettingObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 13895, new Class[]{OnlineStateSettingResultObj.class, OnlineStateSettingObj.class, Integer.TYPE, Object.class}, OnlineStateSettingResultObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (OnlineStateSettingResultObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            onlineStateSettingObj = onlineStateSettingResultObj.settings;
        }
        return onlineStateSettingResultObj.copy(onlineStateSettingObj);
    }

    @e
    public final OnlineStateSettingObj component1() {
        return this.settings;
    }

    @d
    public final OnlineStateSettingResultObj copy(@e OnlineStateSettingObj onlineStateSettingObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{onlineStateSettingObj}, this, changeQuickRedirect, false, 13894, new Class[]{OnlineStateSettingObj.class}, OnlineStateSettingResultObj.class);
        return patchProxyResultProxy.isSupported ? (OnlineStateSettingResultObj) patchProxyResultProxy.result : new OnlineStateSettingResultObj(onlineStateSettingObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 13898, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnlineStateSettingResultObj) && f0.g(this.settings, ((OnlineStateSettingResultObj) obj).settings);
    }

    @e
    public final OnlineStateSettingObj getSettings() {
        return this.settings;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13897, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        OnlineStateSettingObj onlineStateSettingObj = this.settings;
        if (onlineStateSettingObj == null) {
            return 0;
        }
        return onlineStateSettingObj.hashCode();
    }

    public final void setSettings(@e OnlineStateSettingObj onlineStateSettingObj) {
        this.settings = onlineStateSettingObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13896, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "OnlineStateSettingResultObj(settings=" + this.settings + ')';
    }
}
