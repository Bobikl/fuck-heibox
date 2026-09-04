package com.starlightc.ucropplus.model;

import androidx.compose.foundation.b0;
import com.max.hbcommon.utils.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.view.widget.stickeritem.BaseStickerItem;
import com.starlightc.ucropplus.view.widget.stickeritem.LabelStickerItem;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: StickerStateInfo.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class StickerStateInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String bitmapPath;
    private boolean canDelete;
    private boolean canEdit;

    @e
    private RectFInfo deleteRect;

    @e
    private RectFInfo detectDeleteRect;

    @e
    private RectFInfo detectEditRect;

    @e
    private RectFInfo detectRotateRect;

    @e
    private RectFInfo dstRect;

    @e
    private RectFInfo editRect;

    @e
    private RectFInfo helpBox;

    @e
    private RectInfo helpToolsRect;
    private float initWidth;
    private boolean isDrawHelpTool;
    private int labelColor;

    @d
    private LabelStickerItem.LabelType labelType;

    @e
    private float[] matrix;
    private float rotateAngle;

    @e
    private RectFInfo rotateRect;
    private float scale;

    @e
    private RectInfo srcRect;

    @d
    private String text;

    @d
    private ArrayList<String> textContent;

    @d
    private TextRenderInfo textRenderInfo;

    @e
    private BaseStickerItem.StickerType type;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private float f98060x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private float f98061x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private float f98062y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private float f98063y2;

    public StickerStateInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 0.0f, 0.0f, false, 0.0f, null, null, null, false, false, 0.0f, 0.0f, 0.0f, 0.0f, null, 0, 268435455, null);
    }

    public StickerStateInfo(@e BaseStickerItem.StickerType stickerType, @d String text, @d ArrayList<String> textContent, @d TextRenderInfo textRenderInfo, @e String str, @e RectInfo rectInfo, @e RectFInfo rectFInfo, @e RectInfo rectInfo2, @e RectFInfo rectFInfo2, @e RectFInfo rectFInfo3, @e RectFInfo rectFInfo4, @e RectFInfo rectFInfo5, @e float[] fArr, float f10, float f11, boolean z10, float f12, @e RectFInfo rectFInfo6, @e RectFInfo rectFInfo7, @e RectFInfo rectFInfo8, boolean z11, boolean z12, float f13, float f14, float f15, float f16, @d LabelStickerItem.LabelType labelType, int i10) {
        f0.p(text, "text");
        f0.p(textContent, "textContent");
        f0.p(textRenderInfo, "textRenderInfo");
        f0.p(labelType, "labelType");
        this.type = stickerType;
        this.text = text;
        this.textContent = textContent;
        this.textRenderInfo = textRenderInfo;
        this.bitmapPath = str;
        this.srcRect = rectInfo;
        this.dstRect = rectFInfo;
        this.helpToolsRect = rectInfo2;
        this.deleteRect = rectFInfo2;
        this.rotateRect = rectFInfo3;
        this.editRect = rectFInfo4;
        this.helpBox = rectFInfo5;
        this.matrix = fArr;
        this.rotateAngle = f10;
        this.scale = f11;
        this.isDrawHelpTool = z10;
        this.initWidth = f12;
        this.detectRotateRect = rectFInfo6;
        this.detectDeleteRect = rectFInfo7;
        this.detectEditRect = rectFInfo8;
        this.canEdit = z11;
        this.canDelete = z12;
        this.f98060x1 = f13;
        this.f98062y1 = f14;
        this.f98061x2 = f15;
        this.f98063y2 = f16;
        this.labelType = labelType;
        this.labelColor = i10;
    }

    public /* synthetic */ StickerStateInfo(BaseStickerItem.StickerType stickerType, String str, ArrayList arrayList, TextRenderInfo textRenderInfo, String str2, RectInfo rectInfo, RectFInfo rectFInfo, RectInfo rectInfo2, RectFInfo rectFInfo2, RectFInfo rectFInfo3, RectFInfo rectFInfo4, RectFInfo rectFInfo5, float[] fArr, float f10, float f11, boolean z10, float f12, RectFInfo rectFInfo6, RectFInfo rectFInfo7, RectFInfo rectFInfo8, boolean z11, boolean z12, float f13, float f14, float f15, float f16, LabelStickerItem.LabelType labelType, int i10, int i11, u uVar) {
        this((i11 & 1) != 0 ? null : stickerType, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? new ArrayList() : arrayList, (i11 & 8) != 0 ? new TextRenderInfo(0, false, 0.0f, 0.0f, null, 0, 0, 0.0f, null, null, false, null, false, 8191, null) : textRenderInfo, (i11 & 16) != 0 ? null : str2, (i11 & 32) != 0 ? null : rectInfo, (i11 & 64) != 0 ? null : rectFInfo, (i11 & 128) != 0 ? null : rectInfo2, (i11 & 256) != 0 ? null : rectFInfo2, (i11 & 512) != 0 ? null : rectFInfo3, (i11 & 1024) != 0 ? null : rectFInfo4, (i11 & 2048) != 0 ? null : rectFInfo5, (i11 & 4096) != 0 ? null : fArr, (i11 & 8192) != 0 ? 0.0f : f10, (i11 & 16384) != 0 ? 1.0f : f11, (i11 & 32768) != 0 ? false : z10, (i11 & 65536) != 0 ? 0.0f : f12, (i11 & 131072) != 0 ? null : rectFInfo6, (i11 & 262144) != 0 ? null : rectFInfo7, (i11 & 524288) != 0 ? null : rectFInfo8, (i11 & 1048576) != 0 ? true : z11, (i11 & 2097152) == 0 ? z12 : true, (i11 & 4194304) != 0 ? 0.0f : f13, (i11 & 8388608) != 0 ? 0.0f : f14, (i11 & 16777216) != 0 ? 0.0f : f15, (i11 & 33554432) == 0 ? f16 : 0.0f, (i11 & 67108864) != 0 ? LabelStickerItem.LabelType.RECTANGLE : labelType, (i11 & 134217728) != 0 ? -1 : i10);
    }

    public static /* synthetic */ StickerStateInfo copy$default(StickerStateInfo stickerStateInfo, BaseStickerItem.StickerType stickerType, String str, ArrayList arrayList, TextRenderInfo textRenderInfo, String str2, RectInfo rectInfo, RectFInfo rectFInfo, RectInfo rectInfo2, RectFInfo rectFInfo2, RectFInfo rectFInfo3, RectFInfo rectFInfo4, RectFInfo rectFInfo5, float[] fArr, float f10, float f11, boolean z10, float f12, RectFInfo rectFInfo6, RectFInfo rectFInfo7, RectFInfo rectFInfo8, boolean z11, boolean z12, float f13, float f14, float f15, float f16, LabelStickerItem.LabelType labelType, int i10, int i11, Object obj) {
        Object[] objArr = {stickerStateInfo, stickerType, str, arrayList, textRenderInfo, str2, rectInfo, rectFInfo, rectInfo2, rectFInfo2, rectFInfo3, rectFInfo4, rectFInfo5, fArr, new Float(f10), new Float(f11), new Byte(z10 ? (byte) 1 : (byte) 0), new Float(f12), rectFInfo6, rectFInfo7, rectFInfo8, new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0), new Float(f13), new Float(f14), new Float(f15), new Float(f16), labelType, new Integer(i10), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 50115, new Class[]{StickerStateInfo.class, BaseStickerItem.StickerType.class, String.class, ArrayList.class, TextRenderInfo.class, String.class, RectInfo.class, RectFInfo.class, RectInfo.class, RectFInfo.class, RectFInfo.class, RectFInfo.class, RectFInfo.class, float[].class, cls, cls, cls2, cls, RectFInfo.class, RectFInfo.class, RectFInfo.class, cls2, cls2, cls, cls, cls, cls, LabelStickerItem.LabelType.class, cls3, cls3, Object.class}, StickerStateInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (StickerStateInfo) patchProxyResultProxy.result;
        }
        return stickerStateInfo.copy((i11 & 1) != 0 ? stickerStateInfo.type : stickerType, (i11 & 2) != 0 ? stickerStateInfo.text : str, (i11 & 4) != 0 ? stickerStateInfo.textContent : arrayList, (i11 & 8) != 0 ? stickerStateInfo.textRenderInfo : textRenderInfo, (i11 & 16) != 0 ? stickerStateInfo.bitmapPath : str2, (i11 & 32) != 0 ? stickerStateInfo.srcRect : rectInfo, (i11 & 64) != 0 ? stickerStateInfo.dstRect : rectFInfo, (i11 & 128) != 0 ? stickerStateInfo.helpToolsRect : rectInfo2, (i11 & 256) != 0 ? stickerStateInfo.deleteRect : rectFInfo2, (i11 & 512) != 0 ? stickerStateInfo.rotateRect : rectFInfo3, (i11 & 1024) != 0 ? stickerStateInfo.editRect : rectFInfo4, (i11 & 2048) != 0 ? stickerStateInfo.helpBox : rectFInfo5, (i11 & 4096) != 0 ? stickerStateInfo.matrix : fArr, (i11 & 8192) != 0 ? stickerStateInfo.rotateAngle : f10, (i11 & 16384) != 0 ? stickerStateInfo.scale : f11, (i11 & 32768) != 0 ? stickerStateInfo.isDrawHelpTool : z10 ? 1 : 0, (i11 & 65536) != 0 ? stickerStateInfo.initWidth : f12, (i11 & 131072) != 0 ? stickerStateInfo.detectRotateRect : rectFInfo6, (i11 & 262144) != 0 ? stickerStateInfo.detectDeleteRect : rectFInfo7, (i11 & 524288) != 0 ? stickerStateInfo.detectEditRect : rectFInfo8, (i11 & 1048576) != 0 ? stickerStateInfo.canEdit : z11 ? 1 : 0, (i11 & 2097152) != 0 ? stickerStateInfo.canDelete : z12 ? 1 : 0, (i11 & 4194304) != 0 ? stickerStateInfo.f98060x1 : f13, (i11 & 8388608) != 0 ? stickerStateInfo.f98062y1 : f14, (i11 & 16777216) != 0 ? stickerStateInfo.f98061x2 : f15, (i11 & 33554432) != 0 ? stickerStateInfo.f98063y2 : f16, (i11 & 67108864) != 0 ? stickerStateInfo.labelType : labelType, (i11 & 134217728) != 0 ? stickerStateInfo.labelColor : i10);
    }

    @e
    public final BaseStickerItem.StickerType component1() {
        return this.type;
    }

    @e
    public final RectFInfo component10() {
        return this.rotateRect;
    }

    @e
    public final RectFInfo component11() {
        return this.editRect;
    }

    @e
    public final RectFInfo component12() {
        return this.helpBox;
    }

    @e
    public final float[] component13() {
        return this.matrix;
    }

    public final float component14() {
        return this.rotateAngle;
    }

    public final float component15() {
        return this.scale;
    }

    public final boolean component16() {
        return this.isDrawHelpTool;
    }

    public final float component17() {
        return this.initWidth;
    }

    @e
    public final RectFInfo component18() {
        return this.detectRotateRect;
    }

    @e
    public final RectFInfo component19() {
        return this.detectDeleteRect;
    }

    @d
    public final String component2() {
        return this.text;
    }

    @e
    public final RectFInfo component20() {
        return this.detectEditRect;
    }

    public final boolean component21() {
        return this.canEdit;
    }

    public final boolean component22() {
        return this.canDelete;
    }

    public final float component23() {
        return this.f98060x1;
    }

    public final float component24() {
        return this.f98062y1;
    }

    public final float component25() {
        return this.f98061x2;
    }

    public final float component26() {
        return this.f98063y2;
    }

    @d
    public final LabelStickerItem.LabelType component27() {
        return this.labelType;
    }

    public final int component28() {
        return this.labelColor;
    }

    @d
    public final ArrayList<String> component3() {
        return this.textContent;
    }

    @d
    public final TextRenderInfo component4() {
        return this.textRenderInfo;
    }

    @e
    public final String component5() {
        return this.bitmapPath;
    }

    @e
    public final RectInfo component6() {
        return this.srcRect;
    }

    @e
    public final RectFInfo component7() {
        return this.dstRect;
    }

    @e
    public final RectInfo component8() {
        return this.helpToolsRect;
    }

    @e
    public final RectFInfo component9() {
        return this.deleteRect;
    }

    @d
    public final StickerStateInfo copy(@e BaseStickerItem.StickerType stickerType, @d String text, @d ArrayList<String> textContent, @d TextRenderInfo textRenderInfo, @e String str, @e RectInfo rectInfo, @e RectFInfo rectFInfo, @e RectInfo rectInfo2, @e RectFInfo rectFInfo2, @e RectFInfo rectFInfo3, @e RectFInfo rectFInfo4, @e RectFInfo rectFInfo5, @e float[] fArr, float f10, float f11, boolean z10, float f12, @e RectFInfo rectFInfo6, @e RectFInfo rectFInfo7, @e RectFInfo rectFInfo8, boolean z11, boolean z12, float f13, float f14, float f15, float f16, @d LabelStickerItem.LabelType labelType, int i10) {
        Object[] objArr = {stickerType, text, textContent, textRenderInfo, str, rectInfo, rectFInfo, rectInfo2, rectFInfo2, rectFInfo3, rectFInfo4, rectFInfo5, fArr, new Float(f10), new Float(f11), new Byte(z10 ? (byte) 1 : (byte) 0), new Float(f12), rectFInfo6, rectFInfo7, rectFInfo8, new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0), new Float(f13), new Float(f14), new Float(f15), new Float(f16), labelType, new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        Class cls2 = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50114, new Class[]{BaseStickerItem.StickerType.class, String.class, ArrayList.class, TextRenderInfo.class, String.class, RectInfo.class, RectFInfo.class, RectInfo.class, RectFInfo.class, RectFInfo.class, RectFInfo.class, RectFInfo.class, float[].class, cls, cls, cls2, cls, RectFInfo.class, RectFInfo.class, RectFInfo.class, cls2, cls2, cls, cls, cls, cls, LabelStickerItem.LabelType.class, Integer.TYPE}, StickerStateInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (StickerStateInfo) patchProxyResultProxy.result;
        }
        f0.p(text, "text");
        f0.p(textContent, "textContent");
        f0.p(textRenderInfo, "textRenderInfo");
        f0.p(labelType, "labelType");
        return new StickerStateInfo(stickerType, text, textContent, textRenderInfo, str, rectInfo, rectFInfo, rectInfo2, rectFInfo2, rectFInfo3, rectFInfo4, rectFInfo5, fArr, f10, f11, z10, f12, rectFInfo6, rectFInfo7, rectFInfo8, z11, z12, f13, f14, f15, f16, labelType, i10);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50113, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerStateInfo)) {
            return false;
        }
        StickerStateInfo stickerStateInfo = (StickerStateInfo) obj;
        if (stickerStateInfo.type != this.type || !f0.g(stickerStateInfo.text, this.text) || !c.y(stickerStateInfo.textContent, this.textContent) || !f0.g(stickerStateInfo.textRenderInfo, this.textRenderInfo) || !f0.g(stickerStateInfo.bitmapPath, this.bitmapPath) || !f0.g(stickerStateInfo.srcRect, this.srcRect) || !f0.g(stickerStateInfo.dstRect, this.dstRect) || !f0.g(stickerStateInfo.helpToolsRect, this.helpToolsRect) || !f0.g(stickerStateInfo.deleteRect, this.deleteRect) || !f0.g(stickerStateInfo.rotateRect, this.rotateRect) || !f0.g(stickerStateInfo.editRect, this.editRect) || !f0.g(stickerStateInfo.helpBox, this.helpBox) || !Arrays.equals(stickerStateInfo.matrix, this.matrix)) {
            return false;
        }
        if (!(stickerStateInfo.rotateAngle == this.rotateAngle)) {
            return false;
        }
        if (!(stickerStateInfo.scale == this.scale) || stickerStateInfo.isDrawHelpTool != this.isDrawHelpTool) {
            return false;
        }
        if (!(stickerStateInfo.initWidth == this.initWidth) || !f0.g(stickerStateInfo.detectRotateRect, this.detectRotateRect) || !f0.g(stickerStateInfo.detectDeleteRect, this.detectDeleteRect) || !f0.g(stickerStateInfo.detectEditRect, this.detectEditRect) || stickerStateInfo.canEdit != this.canEdit || stickerStateInfo.canDelete != this.canDelete) {
            return false;
        }
        if (!(stickerStateInfo.f98060x1 == this.f98060x1)) {
            return false;
        }
        if (!(stickerStateInfo.f98062y1 == this.f98062y1)) {
            return false;
        }
        if (stickerStateInfo.f98061x2 == this.f98061x2) {
            return ((stickerStateInfo.f98063y2 > this.f98063y2 ? 1 : (stickerStateInfo.f98063y2 == this.f98063y2 ? 0 : -1)) == 0) && stickerStateInfo.labelType == this.labelType && stickerStateInfo.labelColor == this.labelColor;
        }
        return false;
    }

    @e
    public final String getBitmapPath() {
        return this.bitmapPath;
    }

    public final boolean getCanDelete() {
        return this.canDelete;
    }

    public final boolean getCanEdit() {
        return this.canEdit;
    }

    @e
    public final RectFInfo getDeleteRect() {
        return this.deleteRect;
    }

    @e
    public final RectFInfo getDetectDeleteRect() {
        return this.detectDeleteRect;
    }

    @e
    public final RectFInfo getDetectEditRect() {
        return this.detectEditRect;
    }

    @e
    public final RectFInfo getDetectRotateRect() {
        return this.detectRotateRect;
    }

    @e
    public final RectFInfo getDstRect() {
        return this.dstRect;
    }

    @e
    public final RectFInfo getEditRect() {
        return this.editRect;
    }

    @e
    public final RectFInfo getHelpBox() {
        return this.helpBox;
    }

    @e
    public final RectInfo getHelpToolsRect() {
        return this.helpToolsRect;
    }

    public final float getInitWidth() {
        return this.initWidth;
    }

    public final int getLabelColor() {
        return this.labelColor;
    }

    @d
    public final LabelStickerItem.LabelType getLabelType() {
        return this.labelType;
    }

    @e
    public final float[] getMatrix() {
        return this.matrix;
    }

    public final float getRotateAngle() {
        return this.rotateAngle;
    }

    @e
    public final RectFInfo getRotateRect() {
        return this.rotateRect;
    }

    public final float getScale() {
        return this.scale;
    }

    @e
    public final RectInfo getSrcRect() {
        return this.srcRect;
    }

    @d
    public final String getText() {
        return this.text;
    }

    @d
    public final ArrayList<String> getTextContent() {
        return this.textContent;
    }

    @d
    public final TextRenderInfo getTextRenderInfo() {
        return this.textRenderInfo;
    }

    @e
    public final BaseStickerItem.StickerType getType() {
        return this.type;
    }

    public final float getX1() {
        return this.f98060x1;
    }

    public final float getX2() {
        return this.f98061x2;
    }

    public final float getY1() {
        return this.f98062y1;
    }

    public final float getY2() {
        return this.f98063y2;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50117, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        BaseStickerItem.StickerType stickerType = this.type;
        int iHashCode = (((((((stickerType == null ? 0 : stickerType.hashCode()) * 31) + this.text.hashCode()) * 31) + this.textContent.hashCode()) * 31) + this.textRenderInfo.hashCode()) * 31;
        String str = this.bitmapPath;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        RectInfo rectInfo = this.srcRect;
        int iHashCode3 = (iHashCode2 + (rectInfo == null ? 0 : rectInfo.hashCode())) * 31;
        RectFInfo rectFInfo = this.dstRect;
        int iHashCode4 = (iHashCode3 + (rectFInfo == null ? 0 : rectFInfo.hashCode())) * 31;
        RectInfo rectInfo2 = this.helpToolsRect;
        int iHashCode5 = (iHashCode4 + (rectInfo2 == null ? 0 : rectInfo2.hashCode())) * 31;
        RectFInfo rectFInfo2 = this.deleteRect;
        int iHashCode6 = (iHashCode5 + (rectFInfo2 == null ? 0 : rectFInfo2.hashCode())) * 31;
        RectFInfo rectFInfo3 = this.rotateRect;
        int iHashCode7 = (iHashCode6 + (rectFInfo3 == null ? 0 : rectFInfo3.hashCode())) * 31;
        RectFInfo rectFInfo4 = this.editRect;
        int iHashCode8 = (iHashCode7 + (rectFInfo4 == null ? 0 : rectFInfo4.hashCode())) * 31;
        RectFInfo rectFInfo5 = this.helpBox;
        int iHashCode9 = (iHashCode8 + (rectFInfo5 == null ? 0 : rectFInfo5.hashCode())) * 31;
        float[] fArr = this.matrix;
        int iHashCode10 = (((((((((iHashCode9 + (fArr == null ? 0 : Arrays.hashCode(fArr))) * 31) + Float.floatToIntBits(this.rotateAngle)) * 31) + Float.floatToIntBits(this.scale)) * 31) + b0.a(this.isDrawHelpTool)) * 31) + Float.floatToIntBits(this.initWidth)) * 31;
        RectFInfo rectFInfo6 = this.detectRotateRect;
        int iHashCode11 = (iHashCode10 + (rectFInfo6 == null ? 0 : rectFInfo6.hashCode())) * 31;
        RectFInfo rectFInfo7 = this.detectDeleteRect;
        int iHashCode12 = (iHashCode11 + (rectFInfo7 == null ? 0 : rectFInfo7.hashCode())) * 31;
        RectFInfo rectFInfo8 = this.detectEditRect;
        return ((((((((((((((((iHashCode12 + (rectFInfo8 != null ? rectFInfo8.hashCode() : 0)) * 31) + b0.a(this.canEdit)) * 31) + b0.a(this.canDelete)) * 31) + Float.floatToIntBits(this.f98060x1)) * 31) + Float.floatToIntBits(this.f98062y1)) * 31) + Float.floatToIntBits(this.f98061x2)) * 31) + Float.floatToIntBits(this.f98063y2)) * 31) + this.labelType.hashCode()) * 31) + this.labelColor;
    }

    public final boolean isDrawHelpTool() {
        return this.isDrawHelpTool;
    }

    public final void setBitmapPath(@e String str) {
        this.bitmapPath = str;
    }

    public final void setCanDelete(boolean z10) {
        this.canDelete = z10;
    }

    public final void setCanEdit(boolean z10) {
        this.canEdit = z10;
    }

    public final void setDeleteRect(@e RectFInfo rectFInfo) {
        this.deleteRect = rectFInfo;
    }

    public final void setDetectDeleteRect(@e RectFInfo rectFInfo) {
        this.detectDeleteRect = rectFInfo;
    }

    public final void setDetectEditRect(@e RectFInfo rectFInfo) {
        this.detectEditRect = rectFInfo;
    }

    public final void setDetectRotateRect(@e RectFInfo rectFInfo) {
        this.detectRotateRect = rectFInfo;
    }

    public final void setDrawHelpTool(boolean z10) {
        this.isDrawHelpTool = z10;
    }

    public final void setDstRect(@e RectFInfo rectFInfo) {
        this.dstRect = rectFInfo;
    }

    public final void setEditRect(@e RectFInfo rectFInfo) {
        this.editRect = rectFInfo;
    }

    public final void setHelpBox(@e RectFInfo rectFInfo) {
        this.helpBox = rectFInfo;
    }

    public final void setHelpToolsRect(@e RectInfo rectInfo) {
        this.helpToolsRect = rectInfo;
    }

    public final void setInitWidth(float f10) {
        this.initWidth = f10;
    }

    public final void setLabelColor(int i10) {
        this.labelColor = i10;
    }

    public final void setLabelType(@d LabelStickerItem.LabelType labelType) {
        if (PatchProxy.proxy(new Object[]{labelType}, this, changeQuickRedirect, false, 50112, new Class[]{LabelStickerItem.LabelType.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(labelType, "<set-?>");
        this.labelType = labelType;
    }

    public final void setMatrix(@e float[] fArr) {
        this.matrix = fArr;
    }

    public final void setRotateAngle(float f10) {
        this.rotateAngle = f10;
    }

    public final void setRotateRect(@e RectFInfo rectFInfo) {
        this.rotateRect = rectFInfo;
    }

    public final void setScale(float f10) {
        this.scale = f10;
    }

    public final void setSrcRect(@e RectInfo rectInfo) {
        this.srcRect = rectInfo;
    }

    public final void setText(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 50109, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.text = str;
    }

    public final void setTextContent(@d ArrayList<String> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 50110, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(arrayList, "<set-?>");
        this.textContent = arrayList;
    }

    public final void setTextRenderInfo(@d TextRenderInfo textRenderInfo) {
        if (PatchProxy.proxy(new Object[]{textRenderInfo}, this, changeQuickRedirect, false, 50111, new Class[]{TextRenderInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textRenderInfo, "<set-?>");
        this.textRenderInfo = textRenderInfo;
    }

    public final void setType(@e BaseStickerItem.StickerType stickerType) {
        this.type = stickerType;
    }

    public final void setX1(float f10) {
        this.f98060x1 = f10;
    }

    public final void setX2(float f10) {
        this.f98061x2 = f10;
    }

    public final void setY1(float f10) {
        this.f98062y1 = f10;
    }

    public final void setY2(float f10) {
        this.f98063y2 = f10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50116, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "StickerStateInfo(type=" + this.type + ", text=" + this.text + ", textContent=" + this.textContent + ", textRenderInfo=" + this.textRenderInfo + ", bitmapPath=" + this.bitmapPath + ", srcRect=" + this.srcRect + ", dstRect=" + this.dstRect + ", helpToolsRect=" + this.helpToolsRect + ", deleteRect=" + this.deleteRect + ", rotateRect=" + this.rotateRect + ", editRect=" + this.editRect + ", helpBox=" + this.helpBox + ", matrix=" + Arrays.toString(this.matrix) + ", rotateAngle=" + this.rotateAngle + ", scale=" + this.scale + ", isDrawHelpTool=" + this.isDrawHelpTool + ", initWidth=" + this.initWidth + ", detectRotateRect=" + this.detectRotateRect + ", detectDeleteRect=" + this.detectDeleteRect + ", detectEditRect=" + this.detectEditRect + ", canEdit=" + this.canEdit + ", canDelete=" + this.canDelete + ", x1=" + this.f98060x1 + ", y1=" + this.f98062y1 + ", x2=" + this.f98061x2 + ", y2=" + this.f98063y2 + ", labelType=" + this.labelType + ", labelColor=" + this.labelColor + ')';
    }
}
