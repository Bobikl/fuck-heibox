package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class GameRecommendedPlatformObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 769926463463950726L;
    private String count;
    private String delta;
    private String key;
    private String name;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14850, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameRecommendedPlatformObj)) {
            return false;
        }
        GameRecommendedPlatformObj gameRecommendedPlatformObj = (GameRecommendedPlatformObj) obj;
        return Objects.equals(getKey(), gameRecommendedPlatformObj.getKey()) && Objects.equals(getName(), gameRecommendedPlatformObj.getName()) && Objects.equals(getDelta(), gameRecommendedPlatformObj.getDelta()) && Objects.equals(getCount(), gameRecommendedPlatformObj.getCount());
    }

    public String getCount() {
        return this.count;
    }

    public String getDelta() {
        return this.delta;
    }

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14851, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Objects.hash(getKey(), getName(), getDelta(), getCount());
    }

    public void setCount(String str) {
        this.count = str;
    }

    public void setDelta(String str) {
        this.delta = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setName(String str) {
        this.name = str;
    }
}
