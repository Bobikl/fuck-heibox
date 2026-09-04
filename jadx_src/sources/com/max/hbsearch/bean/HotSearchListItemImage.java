package com.max.hbsearch.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.enums.EnumEntriesKt;
import kotlin.enums.a;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchHotWelcomObj.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class HotSearchListItemImage {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String image;

    @e
    private Integer style;

    /* JADX INFO: compiled from: SearchHotWelcomObj.kt */
    public enum ImageStyle {
        LandscapeImage(0),
        SquareImage(1),
        SquareInLandscapeImage(2);

        private static final /* synthetic */ a $ENTRIES = EnumEntriesKt.b(values());
        public static ChangeQuickRedirect changeQuickRedirect;
        private final int code;

        ImageStyle(int i10) {
            this.code = i10;
        }

        @d
        public static a<ImageStyle> getEntries() {
            return $ENTRIES;
        }

        public static ImageStyle valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.k.f33682l7, new Class[]{String.class}, ImageStyle.class);
            return (ImageStyle) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(ImageStyle.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static ImageStyle[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.k.f33659k7, new Class[0], ImageStyle[].class);
            return (ImageStyle[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }

        public final int getCode() {
            return this.code;
        }
    }

    public HotSearchListItemImage(@e String str, @e Integer num) {
        this.image = str;
        this.style = num;
    }

    public static /* synthetic */ HotSearchListItemImage copy$default(HotSearchListItemImage hotSearchListItemImage, String str, Integer num, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hotSearchListItemImage, str, num, new Integer(i10), obj}, null, changeQuickRedirect, true, c.k.f33567g7, new Class[]{HotSearchListItemImage.class, String.class, Integer.class, Integer.TYPE, Object.class}, HotSearchListItemImage.class);
        if (patchProxyResultProxy.isSupported) {
            return (HotSearchListItemImage) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = hotSearchListItemImage.image;
        }
        if ((i10 & 2) != 0) {
            num = hotSearchListItemImage.style;
        }
        return hotSearchListItemImage.copy(str, num);
    }

    @e
    public final String component1() {
        return this.image;
    }

    @e
    public final Integer component2() {
        return this.style;
    }

    @d
    public final HotSearchListItemImage copy(@e String str, @e Integer num) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, num}, this, changeQuickRedirect, false, c.k.f33544f7, new Class[]{String.class, Integer.class}, HotSearchListItemImage.class);
        return patchProxyResultProxy.isSupported ? (HotSearchListItemImage) patchProxyResultProxy.result : new HotSearchListItemImage(str, num);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.f33636j7, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotSearchListItemImage)) {
            return false;
        }
        HotSearchListItemImage hotSearchListItemImage = (HotSearchListItemImage) obj;
        return f0.g(this.image, hotSearchListItemImage.image) && f0.g(this.style, hotSearchListItemImage.style);
    }

    @e
    public final String getImage() {
        return this.image;
    }

    @e
    public final Integer getStyle() {
        return this.style;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33613i7, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.image;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.style;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final void setImage(@e String str) {
        this.image = str;
    }

    public final void setStyle(@e Integer num) {
        this.style = num;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33590h7, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "HotSearchListItemImage(image=" + this.image + ", style=" + this.style + ')';
    }
}
