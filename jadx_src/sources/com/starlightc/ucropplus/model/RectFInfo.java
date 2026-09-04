package com.starlightc.ucropplus.model;

import android.graphics.RectF;
import com.meituan.robust.ChangeQuickRedirect;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RectFInfo.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class RectFInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private float bottom;
    private float left;
    private float right;
    private float top;

    public RectFInfo() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RectFInfo(@d RectF rect) {
        this();
        f0.p(rect, "rect");
        this.left = rect.left;
        this.top = rect.top;
        this.right = rect.right;
        this.bottom = rect.bottom;
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RectFInfo)) {
            return false;
        }
        RectFInfo rectFInfo = (RectFInfo) obj;
        if (!(rectFInfo.left == this.left)) {
            return false;
        }
        if (!(rectFInfo.top == this.top)) {
            return false;
        }
        if (rectFInfo.right == this.right) {
            return (rectFInfo.bottom > this.bottom ? 1 : (rectFInfo.bottom == this.bottom ? 0 : -1)) == 0;
        }
        return false;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    public final void setBottom(float f10) {
        this.bottom = f10;
    }

    public final void setLeft(float f10) {
        this.left = f10;
    }

    public final void setRight(float f10) {
        this.right = f10;
    }

    public final void setTop(float f10) {
        this.top = f10;
    }
}
