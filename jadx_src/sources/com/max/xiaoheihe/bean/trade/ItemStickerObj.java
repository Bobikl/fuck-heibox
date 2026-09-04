package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ItemStickerObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ItemStickerObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private Float float_value;

    @d
    private String img_url;

    @e
    private Integer placeholder;

    public ItemStickerObj(@d String img_url, @e Float f10, @e Integer num) {
        f0.p(img_url, "img_url");
        this.img_url = img_url;
        this.float_value = f10;
        this.placeholder = num;
    }

    public static /* synthetic */ ItemStickerObj copy$default(ItemStickerObj itemStickerObj, String str, Float f10, Integer num, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{itemStickerObj, str, f10, num, new Integer(i10), obj}, null, changeQuickRedirect, true, 16024, new Class[]{ItemStickerObj.class, String.class, Float.class, Integer.class, Integer.TYPE, Object.class}, ItemStickerObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ItemStickerObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = itemStickerObj.img_url;
        }
        if ((i10 & 2) != 0) {
            f10 = itemStickerObj.float_value;
        }
        if ((i10 & 4) != 0) {
            num = itemStickerObj.placeholder;
        }
        return itemStickerObj.copy(str, f10, num);
    }

    @d
    public final String component1() {
        return this.img_url;
    }

    @e
    public final Float component2() {
        return this.float_value;
    }

    @e
    public final Integer component3() {
        return this.placeholder;
    }

    @d
    public final ItemStickerObj copy(@d String img_url, @e Float f10, @e Integer num) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{img_url, f10, num}, this, changeQuickRedirect, false, 16023, new Class[]{String.class, Float.class, Integer.class}, ItemStickerObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ItemStickerObj) patchProxyResultProxy.result;
        }
        f0.p(img_url, "img_url");
        return new ItemStickerObj(img_url, f10, num);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16027, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemStickerObj)) {
            return false;
        }
        ItemStickerObj itemStickerObj = (ItemStickerObj) obj;
        return f0.g(this.img_url, itemStickerObj.img_url) && f0.g(this.float_value, itemStickerObj.float_value) && f0.g(this.placeholder, itemStickerObj.placeholder);
    }

    @e
    public final Float getFloat_value() {
        return this.float_value;
    }

    @d
    public final String getImg_url() {
        return this.img_url;
    }

    @e
    public final Integer getPlaceholder() {
        return this.placeholder;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16026, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = this.img_url.hashCode() * 31;
        Float f10 = this.float_value;
        int iHashCode2 = (iHashCode + (f10 == null ? 0 : f10.hashCode())) * 31;
        Integer num = this.placeholder;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final void setFloat_value(@e Float f10) {
        this.float_value = f10;
    }

    public final void setImg_url(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 16022, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.img_url = str;
    }

    public final void setPlaceholder(@e Integer num) {
        this.placeholder = num;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16025, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ItemStickerObj(img_url=" + this.img_url + ", float_value=" + this.float_value + ", placeholder=" + this.placeholder + ')';
    }
}
