package com.max.xiaoheihe.bean.mall;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: OrderDetailActivityObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class OrderDetailActivityObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String content;

    @e
    private String content_color;

    @e
    private String protocol;

    @e
    private String title;

    @e
    private String title_color;

    public OrderDetailActivityObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        this.content = str;
        this.protocol = str2;
        this.title_color = str3;
        this.content_color = str4;
        this.title = str5;
    }

    public static /* synthetic */ OrderDetailActivityObj copy$default(OrderDetailActivityObj orderDetailActivityObj, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{orderDetailActivityObj, str, str2, str3, str4, str5, new Integer(i10), obj}, null, changeQuickRedirect, true, 15542, new Class[]{OrderDetailActivityObj.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, OrderDetailActivityObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (OrderDetailActivityObj) patchProxyResultProxy.result;
        }
        return orderDetailActivityObj.copy((i10 & 1) != 0 ? orderDetailActivityObj.content : str, (i10 & 2) != 0 ? orderDetailActivityObj.protocol : str2, (i10 & 4) != 0 ? orderDetailActivityObj.title_color : str3, (i10 & 8) != 0 ? orderDetailActivityObj.content_color : str4, (i10 & 16) != 0 ? orderDetailActivityObj.title : str5);
    }

    @e
    public final String component1() {
        return this.content;
    }

    @e
    public final String component2() {
        return this.protocol;
    }

    @e
    public final String component3() {
        return this.title_color;
    }

    @e
    public final String component4() {
        return this.content_color;
    }

    @e
    public final String component5() {
        return this.title;
    }

    @d
    public final OrderDetailActivityObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, this, changeQuickRedirect, false, 15541, new Class[]{String.class, String.class, String.class, String.class, String.class}, OrderDetailActivityObj.class);
        return patchProxyResultProxy.isSupported ? (OrderDetailActivityObj) patchProxyResultProxy.result : new OrderDetailActivityObj(str, str2, str3, str4, str5);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15545, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderDetailActivityObj)) {
            return false;
        }
        OrderDetailActivityObj orderDetailActivityObj = (OrderDetailActivityObj) obj;
        return f0.g(this.content, orderDetailActivityObj.content) && f0.g(this.protocol, orderDetailActivityObj.protocol) && f0.g(this.title_color, orderDetailActivityObj.title_color) && f0.g(this.content_color, orderDetailActivityObj.content_color) && f0.g(this.title, orderDetailActivityObj.title);
    }

    @e
    public final String getContent() {
        return this.content;
    }

    @e
    public final String getContent_color() {
        return this.content_color;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    @e
    public final String getTitle_color() {
        return this.title_color;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15544, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.content;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.protocol;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title_color;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.content_color;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.title;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setContent(@e String str) {
        this.content = str;
    }

    public final void setContent_color(@e String str) {
        this.content_color = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    public final void setTitle_color(@e String str) {
        this.title_color = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15543, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "OrderDetailActivityObj(content=" + this.content + ", protocol=" + this.protocol + ", title_color=" + this.title_color + ", content_color=" + this.content_color + ", title=" + this.title + ')';
    }
}
