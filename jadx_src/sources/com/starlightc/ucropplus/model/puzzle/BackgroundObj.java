package com.starlightc.ucropplus.model.puzzle;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BackgroundObj.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class BackgroundObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String background_alpha;

    @e
    private String background_crop_radius;

    @e
    private HBRectF background_crop_rect;

    @e
    private String background_puzzle_index;

    @e
    private String background_url;

    @e
    private String blur;

    @e
    private String rotation;

    public BackgroundObj(@e String str, @e String str2, @e HBRectF hBRectF, @e String str3, @e String str4, @e String str5, @e String str6) {
        this.blur = str;
        this.background_url = str2;
        this.background_crop_rect = hBRectF;
        this.background_puzzle_index = str3;
        this.background_crop_radius = str4;
        this.background_alpha = str5;
        this.rotation = str6;
    }

    public static /* synthetic */ BackgroundObj copy$default(BackgroundObj backgroundObj, String str, String str2, HBRectF hBRectF, String str3, String str4, String str5, String str6, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{backgroundObj, str, str2, hBRectF, str3, str4, str5, str6, new Integer(i10), obj}, null, changeQuickRedirect, true, 50159, new Class[]{BackgroundObj.class, String.class, String.class, HBRectF.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, BackgroundObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BackgroundObj) patchProxyResultProxy.result;
        }
        return backgroundObj.copy((i10 & 1) != 0 ? backgroundObj.blur : str, (i10 & 2) != 0 ? backgroundObj.background_url : str2, (i10 & 4) != 0 ? backgroundObj.background_crop_rect : hBRectF, (i10 & 8) != 0 ? backgroundObj.background_puzzle_index : str3, (i10 & 16) != 0 ? backgroundObj.background_crop_radius : str4, (i10 & 32) != 0 ? backgroundObj.background_alpha : str5, (i10 & 64) != 0 ? backgroundObj.rotation : str6);
    }

    @e
    public final String component1() {
        return this.blur;
    }

    @e
    public final String component2() {
        return this.background_url;
    }

    @e
    public final HBRectF component3() {
        return this.background_crop_rect;
    }

    @e
    public final String component4() {
        return this.background_puzzle_index;
    }

    @e
    public final String component5() {
        return this.background_crop_radius;
    }

    @e
    public final String component6() {
        return this.background_alpha;
    }

    @e
    public final String component7() {
        return this.rotation;
    }

    @d
    public final BackgroundObj copy(@e String str, @e String str2, @e HBRectF hBRectF, @e String str3, @e String str4, @e String str5, @e String str6) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, hBRectF, str3, str4, str5, str6}, this, changeQuickRedirect, false, 50158, new Class[]{String.class, String.class, HBRectF.class, String.class, String.class, String.class, String.class}, BackgroundObj.class);
        return patchProxyResultProxy.isSupported ? (BackgroundObj) patchProxyResultProxy.result : new BackgroundObj(str, str2, hBRectF, str3, str4, str5, str6);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50157, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackgroundObj)) {
            return false;
        }
        BackgroundObj backgroundObj = (BackgroundObj) obj;
        return f0.g(backgroundObj.blur, this.blur) && f0.g(backgroundObj.background_url, this.background_url) && f0.g(backgroundObj.background_crop_rect, this.background_crop_rect) && f0.g(backgroundObj.background_puzzle_index, this.background_puzzle_index) && f0.g(backgroundObj.background_crop_radius, this.background_crop_radius) && f0.g(backgroundObj.background_alpha, this.background_alpha) && f0.g(backgroundObj.rotation, this.rotation);
    }

    @e
    public final String getBackground_alpha() {
        return this.background_alpha;
    }

    @e
    public final String getBackground_crop_radius() {
        return this.background_crop_radius;
    }

    @e
    public final HBRectF getBackground_crop_rect() {
        return this.background_crop_rect;
    }

    @e
    public final String getBackground_puzzle_index() {
        return this.background_puzzle_index;
    }

    @e
    public final String getBackground_url() {
        return this.background_url;
    }

    @e
    public final String getBlur() {
        return this.blur;
    }

    @e
    public final String getRotation() {
        return this.rotation;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50161, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.blur;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.background_url;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        HBRectF hBRectF = this.background_crop_rect;
        int iHashCode3 = (iHashCode2 + (hBRectF == null ? 0 : hBRectF.hashCode())) * 31;
        String str3 = this.background_puzzle_index;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.background_crop_radius;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.background_alpha;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.rotation;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setBackground_alpha(@e String str) {
        this.background_alpha = str;
    }

    public final void setBackground_crop_radius(@e String str) {
        this.background_crop_radius = str;
    }

    public final void setBackground_crop_rect(@e HBRectF hBRectF) {
        this.background_crop_rect = hBRectF;
    }

    public final void setBackground_puzzle_index(@e String str) {
        this.background_puzzle_index = str;
    }

    public final void setBackground_url(@e String str) {
        this.background_url = str;
    }

    public final void setBlur(@e String str) {
        this.blur = str;
    }

    public final void setRotation(@e String str) {
        this.rotation = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50160, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "BackgroundObj(blur=" + this.blur + ", background_url=" + this.background_url + ", background_crop_rect=" + this.background_crop_rect + ", background_puzzle_index=" + this.background_puzzle_index + ", background_crop_radius=" + this.background_crop_radius + ", background_alpha=" + this.background_alpha + ", rotation=" + this.rotation + ')';
    }
}
