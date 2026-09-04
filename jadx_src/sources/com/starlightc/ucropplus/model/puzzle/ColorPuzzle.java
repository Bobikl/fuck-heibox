package com.starlightc.ucropplus.model.puzzle;

import android.graphics.drawable.GradientDrawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ColorPuzzle.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ColorPuzzle extends BasePuzzleInfo {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String end_color;

    @e
    private String orientation;

    @e
    private String radius;

    @e
    private String start_color;

    public ColorPuzzle(@e String str, @e String str2, @e String str3, @e String str4) {
        super(null, null, null, null, 15, null);
        this.radius = str;
        this.start_color = str2;
        this.end_color = str3;
        this.orientation = str4;
    }

    public static /* synthetic */ ColorPuzzle copy$default(ColorPuzzle colorPuzzle, String str, String str2, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{colorPuzzle, str, str2, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, 50166, new Class[]{ColorPuzzle.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, ColorPuzzle.class);
        if (patchProxyResultProxy.isSupported) {
            return (ColorPuzzle) patchProxyResultProxy.result;
        }
        return colorPuzzle.copy((i10 & 1) != 0 ? colorPuzzle.radius : str, (i10 & 2) != 0 ? colorPuzzle.start_color : str2, (i10 & 4) != 0 ? colorPuzzle.end_color : str3, (i10 & 8) != 0 ? colorPuzzle.orientation : str4);
    }

    @e
    public final String component1() {
        return this.radius;
    }

    @e
    public final String component2() {
        return this.start_color;
    }

    @e
    public final String component3() {
        return this.end_color;
    }

    @e
    public final String component4() {
        return this.orientation;
    }

    @d
    public final ColorPuzzle copy(@e String str, @e String str2, @e String str3, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 50165, new Class[]{String.class, String.class, String.class, String.class}, ColorPuzzle.class);
        return patchProxyResultProxy.isSupported ? (ColorPuzzle) patchProxyResultProxy.result : new ColorPuzzle(str, str2, str3, str4);
    }

    @Override // com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo
    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50164, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorPuzzle)) {
            return false;
        }
        ColorPuzzle colorPuzzle = (ColorPuzzle) obj;
        if (f0.g(colorPuzzle.radius, this.radius) && f0.g(colorPuzzle.start_color, this.start_color) && f0.g(colorPuzzle.end_color, this.end_color) && f0.g(colorPuzzle.orientation, this.orientation)) {
            return super.equals(obj);
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @d
    public final GradientDrawable.Orientation getDrawableOrientation() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50163, new Class[0], GradientDrawable.Orientation.class);
        if (patchProxyResultProxy.isSupported) {
            return (GradientDrawable.Orientation) patchProxyResultProxy.result;
        }
        String str = this.orientation;
        if (str != null) {
            switch (str.hashCode()) {
                case 48:
                    if (str.equals("0")) {
                        return GradientDrawable.Orientation.TOP_BOTTOM;
                    }
                    break;
                case 49:
                    if (str.equals("1")) {
                        return GradientDrawable.Orientation.TR_BL;
                    }
                    break;
                case 50:
                    if (str.equals("2")) {
                        return GradientDrawable.Orientation.RIGHT_LEFT;
                    }
                    break;
                case 51:
                    if (str.equals("3")) {
                        return GradientDrawable.Orientation.BR_TL;
                    }
                    break;
                case 52:
                    if (str.equals("4")) {
                        return GradientDrawable.Orientation.BOTTOM_TOP;
                    }
                    break;
                case 53:
                    if (str.equals("5")) {
                        return GradientDrawable.Orientation.BL_TR;
                    }
                    break;
                case 54:
                    if (str.equals("6")) {
                        return GradientDrawable.Orientation.LEFT_RIGHT;
                    }
                    break;
                case 55:
                    if (str.equals("7")) {
                        return GradientDrawable.Orientation.TL_BR;
                    }
                    break;
            }
        }
        return GradientDrawable.Orientation.RIGHT_LEFT;
    }

    @e
    public final String getEnd_color() {
        return this.end_color;
    }

    @e
    public final String getOrientation() {
        return this.orientation;
    }

    @e
    public final String getRadius() {
        return this.radius;
    }

    @e
    public final String getStart_color() {
        return this.start_color;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50168, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.radius;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.start_color;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.end_color;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.orientation;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setEnd_color(@e String str) {
        this.end_color = str;
    }

    public final void setOrientation(@e String str) {
        this.orientation = str;
    }

    public final void setRadius(@e String str) {
        this.radius = str;
    }

    public final void setStart_color(@e String str) {
        this.start_color = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50167, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ColorPuzzle(radius=" + this.radius + ", start_color=" + this.start_color + ", end_color=" + this.end_color + ", orientation=" + this.orientation + ')';
    }
}
