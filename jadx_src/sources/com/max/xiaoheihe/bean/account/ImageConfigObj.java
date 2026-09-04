package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: AppClientStaticObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ImageConfigObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String img_author;

    @e
    private String img_draft;

    @e
    private String img_hcoin;

    @e
    private String img_inspiration;

    @e
    private String img_task;

    public ImageConfigObj() {
        this(null, null, null, null, null, 31, null);
    }

    public ImageConfigObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        this.img_task = str;
        this.img_hcoin = str2;
        this.img_author = str3;
        this.img_draft = str4;
        this.img_inspiration = str5;
    }

    public /* synthetic */ ImageConfigObj(String str, String str2, String str3, String str4, String str5, int i10, u uVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? "" : str5);
    }

    public static /* synthetic */ ImageConfigObj copy$default(ImageConfigObj imageConfigObj, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{imageConfigObj, str, str2, str3, str4, str5, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.sP, new Class[]{ImageConfigObj.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, ImageConfigObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageConfigObj) patchProxyResultProxy.result;
        }
        return imageConfigObj.copy((i10 & 1) != 0 ? imageConfigObj.img_task : str, (i10 & 2) != 0 ? imageConfigObj.img_hcoin : str2, (i10 & 4) != 0 ? imageConfigObj.img_author : str3, (i10 & 8) != 0 ? imageConfigObj.img_draft : str4, (i10 & 16) != 0 ? imageConfigObj.img_inspiration : str5);
    }

    @e
    public final String component1() {
        return this.img_task;
    }

    @e
    public final String component2() {
        return this.img_hcoin;
    }

    @e
    public final String component3() {
        return this.img_author;
    }

    @e
    public final String component4() {
        return this.img_draft;
    }

    @e
    public final String component5() {
        return this.img_inspiration;
    }

    @d
    public final ImageConfigObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, this, changeQuickRedirect, false, c.m.rP, new Class[]{String.class, String.class, String.class, String.class, String.class}, ImageConfigObj.class);
        return patchProxyResultProxy.isSupported ? (ImageConfigObj) patchProxyResultProxy.result : new ImageConfigObj(str, str2, str3, str4, str5);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.vP, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageConfigObj)) {
            return false;
        }
        ImageConfigObj imageConfigObj = (ImageConfigObj) obj;
        return f0.g(this.img_task, imageConfigObj.img_task) && f0.g(this.img_hcoin, imageConfigObj.img_hcoin) && f0.g(this.img_author, imageConfigObj.img_author) && f0.g(this.img_draft, imageConfigObj.img_draft) && f0.g(this.img_inspiration, imageConfigObj.img_inspiration);
    }

    @e
    public final String getImg_author() {
        return this.img_author;
    }

    @e
    public final String getImg_draft() {
        return this.img_draft;
    }

    @e
    public final String getImg_hcoin() {
        return this.img_hcoin;
    }

    @e
    public final String getImg_inspiration() {
        return this.img_inspiration;
    }

    @e
    public final String getImg_task() {
        return this.img_task;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.uP, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.img_task;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.img_hcoin;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.img_author;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.img_draft;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.img_inspiration;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setImg_author(@e String str) {
        this.img_author = str;
    }

    public final void setImg_draft(@e String str) {
        this.img_draft = str;
    }

    public final void setImg_hcoin(@e String str) {
        this.img_hcoin = str;
    }

    public final void setImg_inspiration(@e String str) {
        this.img_inspiration = str;
    }

    public final void setImg_task(@e String str) {
        this.img_task = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.tP, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ImageConfigObj(img_task=" + this.img_task + ", img_hcoin=" + this.img_hcoin + ", img_author=" + this.img_author + ", img_draft=" + this.img_draft + ", img_inspiration=" + this.img_inspiration + ')';
    }
}
