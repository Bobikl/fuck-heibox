package com.starlightc.ucropplus.model.puzzle;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.view.widget.stickeritem.LabelStickerItem;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: LabelPuzzle.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class LabelPuzzle extends BasePuzzleInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int labelColor;

    @d
    private LabelStickerItem.LabelType labelType;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private float f98067x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private float f98068x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private float f98069y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private float f98070y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelPuzzle(float f10, float f11, float f12, float f13, @d LabelStickerItem.LabelType labelType, int i10) {
        super(null, null, null, null, 15, null);
        f0.p(labelType, "labelType");
        this.f98067x1 = f10;
        this.f98069y1 = f11;
        this.f98068x2 = f12;
        this.f98070y2 = f13;
        this.labelType = labelType;
        this.labelColor = i10;
        setType(BasePuzzleInfo.PUZZLE_TYPE_LABEL);
    }

    public /* synthetic */ LabelPuzzle(float f10, float f11, float f12, float f13, LabelStickerItem.LabelType labelType, int i10, int i11, u uVar) {
        this((i11 & 1) != 0 ? 0.0f : f10, (i11 & 2) != 0 ? 0.0f : f11, (i11 & 4) != 0 ? 0.0f : f12, (i11 & 8) != 0 ? 0.0f : f13, (i11 & 16) != 0 ? LabelStickerItem.LabelType.RECTANGLE : labelType, i10);
    }

    public static /* synthetic */ LabelPuzzle copy$default(LabelPuzzle labelPuzzle, float f10, float f11, float f12, float f13, LabelStickerItem.LabelType labelType, int i10, int i11, Object obj) {
        float f14 = f10;
        float f15 = f11;
        float f16 = f12;
        float f17 = f13;
        int i12 = i10;
        Object[] objArr = {labelPuzzle, new Float(f14), new Float(f15), new Float(f16), new Float(f17), labelType, new Integer(i12), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        Class cls2 = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 50187, new Class[]{LabelPuzzle.class, cls, cls, cls, cls, LabelStickerItem.LabelType.class, cls2, cls2, Object.class}, LabelPuzzle.class);
        if (patchProxyResultProxy.isSupported) {
            return (LabelPuzzle) patchProxyResultProxy.result;
        }
        if ((i11 & 1) != 0) {
            f14 = labelPuzzle.f98067x1;
        }
        if ((i11 & 2) != 0) {
            f15 = labelPuzzle.f98069y1;
        }
        if ((i11 & 4) != 0) {
            f16 = labelPuzzle.f98068x2;
        }
        if ((i11 & 8) != 0) {
            f17 = labelPuzzle.f98070y2;
        }
        LabelStickerItem.LabelType labelType2 = (i11 & 16) != 0 ? labelPuzzle.labelType : labelType;
        if ((i11 & 32) != 0) {
            i12 = labelPuzzle.labelColor;
        }
        return labelPuzzle.copy(f14, f15, f16, f17, labelType2, i12);
    }

    public final float component1() {
        return this.f98067x1;
    }

    public final float component2() {
        return this.f98069y1;
    }

    public final float component3() {
        return this.f98068x2;
    }

    public final float component4() {
        return this.f98070y2;
    }

    @d
    public final LabelStickerItem.LabelType component5() {
        return this.labelType;
    }

    public final int component6() {
        return this.labelColor;
    }

    @d
    public final LabelPuzzle copy(float f10, float f11, float f12, float f13, @d LabelStickerItem.LabelType labelType, int i10) {
        Object[] objArr = {new Float(f10), new Float(f11), new Float(f12), new Float(f13), labelType, new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50186, new Class[]{cls, cls, cls, cls, LabelStickerItem.LabelType.class, Integer.TYPE}, LabelPuzzle.class);
        if (patchProxyResultProxy.isSupported) {
            return (LabelPuzzle) patchProxyResultProxy.result;
        }
        f0.p(labelType, "labelType");
        return new LabelPuzzle(f10, f11, f12, f13, labelType, i10);
    }

    @Override // com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo
    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50185, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LabelPuzzle)) {
            return false;
        }
        LabelPuzzle labelPuzzle = (LabelPuzzle) obj;
        if (!(labelPuzzle.f98067x1 == this.f98067x1)) {
            return false;
        }
        if (!(labelPuzzle.f98069y1 == this.f98069y1)) {
            return false;
        }
        if (!(labelPuzzle.f98068x2 == this.f98068x2)) {
            return false;
        }
        if ((labelPuzzle.f98070y2 == this.f98070y2) && labelPuzzle.labelType == this.labelType && labelPuzzle.labelColor == this.labelColor) {
            return super.equals(obj);
        }
        return false;
    }

    public final int getLabelColor() {
        return this.labelColor;
    }

    @d
    public final LabelStickerItem.LabelType getLabelType() {
        return this.labelType;
    }

    public final float getX1() {
        return this.f98067x1;
    }

    public final float getX2() {
        return this.f98068x2;
    }

    public final float getY1() {
        return this.f98069y1;
    }

    public final float getY2() {
        return this.f98070y2;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50189, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (((((((((Float.floatToIntBits(this.f98067x1) * 31) + Float.floatToIntBits(this.f98069y1)) * 31) + Float.floatToIntBits(this.f98068x2)) * 31) + Float.floatToIntBits(this.f98070y2)) * 31) + this.labelType.hashCode()) * 31) + this.labelColor;
    }

    public final void setLabelColor(int i10) {
        this.labelColor = i10;
    }

    public final void setLabelType(@d LabelStickerItem.LabelType labelType) {
        if (PatchProxy.proxy(new Object[]{labelType}, this, changeQuickRedirect, false, 50184, new Class[]{LabelStickerItem.LabelType.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(labelType, "<set-?>");
        this.labelType = labelType;
    }

    public final void setX1(float f10) {
        this.f98067x1 = f10;
    }

    public final void setX2(float f10) {
        this.f98068x2 = f10;
    }

    public final void setY1(float f10) {
        this.f98069y1 = f10;
    }

    public final void setY2(float f10) {
        this.f98070y2 = f10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50188, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "LabelPuzzle(x1=" + this.f98067x1 + ", y1=" + this.f98069y1 + ", x2=" + this.f98068x2 + ", y2=" + this.f98070y2 + ", labelType=" + this.labelType + ", labelColor=" + this.labelColor + ')';
    }
}
