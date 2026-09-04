package com.max.xiaoheihe.bean.game.gameoverview;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CareerRecordObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class CareerRecordObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: bg, reason: collision with root package name */
    @e
    private String f76977bg;

    @e
    private String color;

    @e
    private String desc;

    @e
    private String icon;

    @e
    private String protocol;

    @e
    private String value;

    public CareerRecordObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        this.desc = str;
        this.value = str2;
        this.color = str3;
        this.f76977bg = str4;
        this.icon = str5;
        this.protocol = str6;
    }

    public static /* synthetic */ CareerRecordObj copy$default(CareerRecordObj careerRecordObj, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{careerRecordObj, str, str2, str3, str4, str5, str6, new Integer(i10), obj}, null, changeQuickRedirect, true, 15210, new Class[]{CareerRecordObj.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, CareerRecordObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (CareerRecordObj) patchProxyResultProxy.result;
        }
        return careerRecordObj.copy((i10 & 1) != 0 ? careerRecordObj.desc : str, (i10 & 2) != 0 ? careerRecordObj.value : str2, (i10 & 4) != 0 ? careerRecordObj.color : str3, (i10 & 8) != 0 ? careerRecordObj.f76977bg : str4, (i10 & 16) != 0 ? careerRecordObj.icon : str5, (i10 & 32) != 0 ? careerRecordObj.protocol : str6);
    }

    @e
    public final String component1() {
        return this.desc;
    }

    @e
    public final String component2() {
        return this.value;
    }

    @e
    public final String component3() {
        return this.color;
    }

    @e
    public final String component4() {
        return this.f76977bg;
    }

    @e
    public final String component5() {
        return this.icon;
    }

    @e
    public final String component6() {
        return this.protocol;
    }

    @d
    public final CareerRecordObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6}, this, changeQuickRedirect, false, 15209, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, CareerRecordObj.class);
        return patchProxyResultProxy.isSupported ? (CareerRecordObj) patchProxyResultProxy.result : new CareerRecordObj(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15213, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CareerRecordObj)) {
            return false;
        }
        CareerRecordObj careerRecordObj = (CareerRecordObj) obj;
        return f0.g(this.desc, careerRecordObj.desc) && f0.g(this.value, careerRecordObj.value) && f0.g(this.color, careerRecordObj.color) && f0.g(this.f76977bg, careerRecordObj.f76977bg) && f0.g(this.icon, careerRecordObj.icon) && f0.g(this.protocol, careerRecordObj.protocol);
    }

    @e
    public final String getBg() {
        return this.f76977bg;
    }

    @e
    public final String getColor() {
        return this.color;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getIcon() {
        return this.icon;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @e
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15212, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.desc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.color;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f76977bg;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.icon;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.protocol;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setBg(@e String str) {
        this.f76977bg = str;
    }

    public final void setColor(@e String str) {
        this.color = str;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setIcon(@e String str) {
        this.icon = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setValue(@e String str) {
        this.value = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15211, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CareerRecordObj(desc=" + this.desc + ", value=" + this.value + ", color=" + this.color + ", bg=" + this.f76977bg + ", icon=" + this.icon + ", protocol=" + this.protocol + ')';
    }
}
