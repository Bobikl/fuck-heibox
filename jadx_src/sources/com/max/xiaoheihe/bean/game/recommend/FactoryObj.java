package com.max.xiaoheihe.bean.game.recommend;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FactoryObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class FactoryObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String color;

    @e
    private String img;

    @e
    private String medal_url;

    @e
    private String name;

    @e
    private String prot;

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15341, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FactoryObj)) {
            return false;
        }
        FactoryObj factoryObj = (FactoryObj) obj;
        return f0.g(this.img, factoryObj.img) && f0.g(this.prot, factoryObj.prot) && f0.g(this.color, factoryObj.color) && f0.g(this.name, factoryObj.name) && f0.g(this.medal_url, factoryObj.medal_url);
    }

    @e
    public final String getColor() {
        return this.color;
    }

    @e
    public final String getImg() {
        return this.img;
    }

    @e
    public final String getMedal_url() {
        return this.medal_url;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final String getProt() {
        return this.prot;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15342, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.img;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.prot;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.color;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.name;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setColor(@e String str) {
        this.color = str;
    }

    public final void setImg(@e String str) {
        this.img = str;
    }

    public final void setMedal_url(@e String str) {
        this.medal_url = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setProt(@e String str) {
        this.prot = str;
    }
}
