package com.max.xiaoheihe.bean.mall.cart;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MallCartOrderDetailObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class MallOrderNotifyObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String background;

    @e
    private String icon;

    @e
    private String message;

    @e
    private String text_color;

    public MallOrderNotifyObj(@e String str, @e String str2, @e String str3, @e String str4) {
        this.background = str;
        this.icon = str2;
        this.text_color = str3;
        this.message = str4;
    }

    public static /* synthetic */ MallOrderNotifyObj copy$default(MallOrderNotifyObj mallOrderNotifyObj, String str, String str2, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallOrderNotifyObj, str, str2, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, 15607, new Class[]{MallOrderNotifyObj.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, MallOrderNotifyObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MallOrderNotifyObj) patchProxyResultProxy.result;
        }
        return mallOrderNotifyObj.copy((i10 & 1) != 0 ? mallOrderNotifyObj.background : str, (i10 & 2) != 0 ? mallOrderNotifyObj.icon : str2, (i10 & 4) != 0 ? mallOrderNotifyObj.text_color : str3, (i10 & 8) != 0 ? mallOrderNotifyObj.message : str4);
    }

    @e
    public final String component1() {
        return this.background;
    }

    @e
    public final String component2() {
        return this.icon;
    }

    @e
    public final String component3() {
        return this.text_color;
    }

    @e
    public final String component4() {
        return this.message;
    }

    @d
    public final MallOrderNotifyObj copy(@e String str, @e String str2, @e String str3, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 15606, new Class[]{String.class, String.class, String.class, String.class}, MallOrderNotifyObj.class);
        return patchProxyResultProxy.isSupported ? (MallOrderNotifyObj) patchProxyResultProxy.result : new MallOrderNotifyObj(str, str2, str3, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15610, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallOrderNotifyObj)) {
            return false;
        }
        MallOrderNotifyObj mallOrderNotifyObj = (MallOrderNotifyObj) obj;
        return f0.g(this.background, mallOrderNotifyObj.background) && f0.g(this.icon, mallOrderNotifyObj.icon) && f0.g(this.text_color, mallOrderNotifyObj.text_color) && f0.g(this.message, mallOrderNotifyObj.message);
    }

    @e
    public final String getBackground() {
        return this.background;
    }

    @e
    public final String getIcon() {
        return this.icon;
    }

    @e
    public final String getMessage() {
        return this.message;
    }

    @e
    public final String getText_color() {
        return this.text_color;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15609, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.background;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.icon;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.text_color;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.message;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setBackground(@e String str) {
        this.background = str;
    }

    public final void setIcon(@e String str) {
        this.icon = str;
    }

    public final void setMessage(@e String str) {
        this.message = str;
    }

    public final void setText_color(@e String str) {
        this.text_color = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15608, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MallOrderNotifyObj(background=" + this.background + ", icon=" + this.icon + ", text_color=" + this.text_color + ", message=" + this.message + ')';
    }
}
