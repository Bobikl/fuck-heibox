package com.starlightc.ucropplus.model;

import android.graphics.Rect;
import com.meituan.robust.ChangeQuickRedirect;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RectInfo.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class RectInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int bottom;
    private int left;
    private int right;
    private int top;

    public RectInfo() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RectInfo(@d Rect rect) {
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
        if (!(obj instanceof RectInfo)) {
            return false;
        }
        RectInfo rectInfo = (RectInfo) obj;
        return rectInfo.left == this.left && rectInfo.top == this.top && rectInfo.right == this.right && rectInfo.bottom == this.bottom;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getTop() {
        return this.top;
    }

    public final void setBottom(int i10) {
        this.bottom = i10;
    }

    public final void setLeft(int i10) {
        this.left = i10;
    }

    public final void setRight(int i10) {
        this.right = i10;
    }

    public final void setTop(int i10) {
        this.top = i10;
    }
}
