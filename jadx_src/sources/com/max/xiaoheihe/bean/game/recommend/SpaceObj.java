package com.max.xiaoheihe.bean.game.recommend;

import androidx.compose.runtime.internal.o;
import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;
import com.max.hbutils.core.BaseApplication;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.accelworld.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SpaceObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SpaceObj extends GameRecommendBaseObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @SerializedName(alternate = {"color"}, value = "bg_color")
    @e
    @JSONField(alternateNames = {"color"}, name = "bg_color")
    private String bg_color;

    @e
    private String height;

    @Override // com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj
    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15411, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpaceObj) || !super.equals(obj)) {
            return false;
        }
        SpaceObj spaceObj = (SpaceObj) obj;
        return f0.g(this.height, spaceObj.height) && f0.g(this.bg_color, spaceObj.bg_color);
    }

    @e
    public final String getBg_color() {
        return this.bg_color;
    }

    @e
    public final String getHeight() {
        return this.height;
    }

    public final float getHeightDp() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15412, new Class[0], Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : n.p(this.height);
    }

    public final int getHeightPx() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15413, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        float heightDp = getHeightDp();
        BaseApplication baseApplicationA = BaseApplication.a();
        f0.o(baseApplicationA, "getInstance()");
        return l.c(heightDp, baseApplicationA);
    }

    @Override // com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15414, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.height;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.bg_color;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setBg_color(@e String str) {
        this.bg_color = str;
    }

    public final void setHeight(@e String str) {
        this.height = str;
    }
}
