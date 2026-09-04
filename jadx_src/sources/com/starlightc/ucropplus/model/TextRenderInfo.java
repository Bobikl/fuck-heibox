package com.starlightc.ucropplus.model;

import androidx.annotation.l;
import androidx.compose.foundation.b0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: TextRenderInfo.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class TextRenderInfo implements Serializable {

    @d
    public static final Companion Companion = new Companion(null);
    public static final int NO_ID = -1;
    public static final float STRAND_STROKE_TEXT_SIZE = 23.0f;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f98065id;
    private boolean isRemoteTypeface;

    @e
    private String setTypefaceName;
    private int shadowColor;
    private boolean shadowEnable;
    private float shadowOffsetX;
    private float shadowOffsetY;

    @e
    private ArrayList<StrokeObj> strokeList;
    private int textColor;
    private float textSize;

    @e
    private String typeface;

    @e
    private String typefaceName;
    private boolean useRate;

    /* JADX INFO: compiled from: TextRenderInfo.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }
    }

    public TextRenderInfo() {
        this(0, false, 0.0f, 0.0f, null, 0, 0, 0.0f, null, null, false, null, false, 8191, null);
    }

    public TextRenderInfo(@l int i10, boolean z10, float f10, float f11, @e ArrayList<StrokeObj> arrayList, int i11, @l int i12, float f12, @e String str, @e String str2, boolean z11, @e String str3, boolean z12) {
        this.shadowColor = i10;
        this.shadowEnable = z10;
        this.shadowOffsetX = f10;
        this.shadowOffsetY = f11;
        this.strokeList = arrayList;
        this.f98065id = i11;
        this.textColor = i12;
        this.textSize = f12;
        this.typeface = str;
        this.typefaceName = str2;
        this.isRemoteTypeface = z11;
        this.setTypefaceName = str3;
        this.useRate = z12;
    }

    public /* synthetic */ TextRenderInfo(int i10, boolean z10, float f10, float f11, ArrayList arrayList, int i11, int i12, float f12, String str, String str2, boolean z11, String str3, boolean z12, int i13, u uVar) {
        this((i13 & 1) != 0 ? -7829368 : i10, (i13 & 2) != 0 ? false : z10, (i13 & 4) != 0 ? 0.0f : f10, (i13 & 8) == 0 ? f11 : 0.0f, (i13 & 16) != 0 ? null : arrayList, (i13 & 32) != 0 ? -1 : i11, (i13 & 64) == 0 ? i12 : -1, (i13 & 128) != 0 ? 15.0f : f12, (i13 & 256) != 0 ? null : str, (i13 & 512) != 0 ? null : str2, (i13 & 1024) != 0 ? false : z11, (i13 & 2048) == 0 ? str3 : null, (i13 & 4096) == 0 ? z12 : false);
    }

    public static /* synthetic */ TextRenderInfo copy$default(TextRenderInfo textRenderInfo, int i10, boolean z10, float f10, float f11, ArrayList arrayList, int i11, int i12, float f12, String str, String str2, boolean z11, String str3, boolean z12, int i13, Object obj) {
        Object[] objArr = {textRenderInfo, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), new Float(f10), new Float(f11), arrayList, new Integer(i11), new Integer(i12), new Float(f12), str, str2, new Byte(z11 ? (byte) 1 : (byte) 0), str3, new Byte(z12 ? (byte) 1 : (byte) 0), new Integer(i13), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        Class cls2 = Boolean.TYPE;
        Class cls3 = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 50129, new Class[]{TextRenderInfo.class, cls, cls2, cls3, cls3, ArrayList.class, cls, cls, cls3, String.class, String.class, cls2, String.class, cls2, cls, Object.class}, TextRenderInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextRenderInfo) patchProxyResultProxy.result;
        }
        return textRenderInfo.copy((i13 & 1) != 0 ? textRenderInfo.shadowColor : i10, (i13 & 2) != 0 ? textRenderInfo.shadowEnable : z10 ? 1 : 0, (i13 & 4) != 0 ? textRenderInfo.shadowOffsetX : f10, (i13 & 8) != 0 ? textRenderInfo.shadowOffsetY : f11, (i13 & 16) != 0 ? textRenderInfo.strokeList : arrayList, (i13 & 32) != 0 ? textRenderInfo.f98065id : i11, (i13 & 64) != 0 ? textRenderInfo.textColor : i12, (i13 & 128) != 0 ? textRenderInfo.textSize : f12, (i13 & 256) != 0 ? textRenderInfo.typeface : str, (i13 & 512) != 0 ? textRenderInfo.typefaceName : str2, (i13 & 1024) != 0 ? textRenderInfo.isRemoteTypeface : z11 ? 1 : 0, (i13 & 2048) != 0 ? textRenderInfo.setTypefaceName : str3, (i13 & 4096) != 0 ? textRenderInfo.useRate : z12 ? 1 : 0);
    }

    public final int component1() {
        return this.shadowColor;
    }

    @e
    public final String component10() {
        return this.typefaceName;
    }

    public final boolean component11() {
        return this.isRemoteTypeface;
    }

    @e
    public final String component12() {
        return this.setTypefaceName;
    }

    public final boolean component13() {
        return this.useRate;
    }

    public final boolean component2() {
        return this.shadowEnable;
    }

    public final float component3() {
        return this.shadowOffsetX;
    }

    public final float component4() {
        return this.shadowOffsetY;
    }

    @e
    public final ArrayList<StrokeObj> component5() {
        return this.strokeList;
    }

    public final int component6() {
        return this.f98065id;
    }

    public final int component7() {
        return this.textColor;
    }

    public final float component8() {
        return this.textSize;
    }

    @e
    public final String component9() {
        return this.typeface;
    }

    @d
    public final TextRenderInfo copy(@l int i10, boolean z10, float f10, float f11, @e ArrayList<StrokeObj> arrayList, int i11, @l int i12, float f12, @e String str, @e String str2, boolean z11, @e String str3, boolean z12) {
        Object[] objArr = {new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), new Float(f10), new Float(f11), arrayList, new Integer(i11), new Integer(i12), new Float(f12), str, str2, new Byte(z11 ? (byte) 1 : (byte) 0), str3, new Byte(z12 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        Class cls2 = Boolean.TYPE;
        Class cls3 = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50128, new Class[]{cls, cls2, cls3, cls3, ArrayList.class, cls, cls, cls3, String.class, String.class, cls2, String.class, cls2}, TextRenderInfo.class);
        return patchProxyResultProxy.isSupported ? (TextRenderInfo) patchProxyResultProxy.result : new TextRenderInfo(i10, z10, f10, f11, arrayList, i11, i12, f12, str, str2, z11, str3, z12);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50132, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextRenderInfo)) {
            return false;
        }
        TextRenderInfo textRenderInfo = (TextRenderInfo) obj;
        return this.shadowColor == textRenderInfo.shadowColor && this.shadowEnable == textRenderInfo.shadowEnable && Float.compare(this.shadowOffsetX, textRenderInfo.shadowOffsetX) == 0 && Float.compare(this.shadowOffsetY, textRenderInfo.shadowOffsetY) == 0 && f0.g(this.strokeList, textRenderInfo.strokeList) && this.f98065id == textRenderInfo.f98065id && this.textColor == textRenderInfo.textColor && Float.compare(this.textSize, textRenderInfo.textSize) == 0 && f0.g(this.typeface, textRenderInfo.typeface) && f0.g(this.typefaceName, textRenderInfo.typefaceName) && this.isRemoteTypeface == textRenderInfo.isRemoteTypeface && f0.g(this.setTypefaceName, textRenderInfo.setTypefaceName) && this.useRate == textRenderInfo.useRate;
    }

    public final int getId() {
        return this.f98065id;
    }

    @e
    public final String getSetTypefaceName() {
        return this.setTypefaceName;
    }

    public final int getShadowColor() {
        return this.shadowColor;
    }

    public final boolean getShadowEnable() {
        return this.shadowEnable;
    }

    public final float getShadowOffsetX() {
        return this.shadowOffsetX;
    }

    public final float getShadowOffsetY() {
        return this.shadowOffsetY;
    }

    @e
    public final ArrayList<StrokeObj> getStrokeList() {
        return this.strokeList;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final float getTextSize() {
        return this.textSize;
    }

    @e
    public final String getTypeface() {
        return this.typeface;
    }

    @e
    public final String getTypefaceName() {
        return this.typefaceName;
    }

    public final boolean getUseRate() {
        return this.useRate;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50131, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iA = ((((((this.shadowColor * 31) + b0.a(this.shadowEnable)) * 31) + Float.floatToIntBits(this.shadowOffsetX)) * 31) + Float.floatToIntBits(this.shadowOffsetY)) * 31;
        ArrayList<StrokeObj> arrayList = this.strokeList;
        int iHashCode = (((((((iA + (arrayList == null ? 0 : arrayList.hashCode())) * 31) + this.f98065id) * 31) + this.textColor) * 31) + Float.floatToIntBits(this.textSize)) * 31;
        String str = this.typeface;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.typefaceName;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + b0.a(this.isRemoteTypeface)) * 31;
        String str3 = this.setTypefaceName;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + b0.a(this.useRate);
    }

    public final boolean isRemoteTypeface() {
        return this.isRemoteTypeface;
    }

    public final void setId(int i10) {
        this.f98065id = i10;
    }

    public final void setRemoteTypeface(boolean z10) {
        this.isRemoteTypeface = z10;
    }

    public final void setSetTypefaceName(@e String str) {
        this.setTypefaceName = str;
    }

    public final void setShadowColor(int i10) {
        this.shadowColor = i10;
    }

    public final void setShadowEnable(boolean z10) {
        this.shadowEnable = z10;
    }

    public final void setShadowOffsetX(float f10) {
        this.shadowOffsetX = f10;
    }

    public final void setShadowOffsetY(float f10) {
        this.shadowOffsetY = f10;
    }

    public final void setStrokeList(@e ArrayList<StrokeObj> arrayList) {
        this.strokeList = arrayList;
    }

    public final void setTextColor(int i10) {
        this.textColor = i10;
    }

    public final void setTextSize(float f10) {
        this.textSize = f10;
    }

    public final void setTypeface(@e String str) {
        this.typeface = str;
    }

    public final void setTypefaceName(@e String str) {
        this.typefaceName = str;
    }

    public final void setUseRate(boolean z10) {
        this.useRate = z10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50130, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TextRenderInfo(shadowColor=" + this.shadowColor + ", shadowEnable=" + this.shadowEnable + ", shadowOffsetX=" + this.shadowOffsetX + ", shadowOffsetY=" + this.shadowOffsetY + ", strokeList=" + this.strokeList + ", id=" + this.f98065id + ", textColor=" + this.textColor + ", textSize=" + this.textSize + ", typeface=" + this.typeface + ", typefaceName=" + this.typefaceName + ", isRemoteTypeface=" + this.isRemoteTypeface + ", setTypefaceName=" + this.setTypefaceName + ", useRate=" + this.useRate + ')';
    }
}
