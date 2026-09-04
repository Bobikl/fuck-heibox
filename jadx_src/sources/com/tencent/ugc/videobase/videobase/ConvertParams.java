package com.tencent.ugc.videobase.videobase;

import com.tencent.liteav.base.util.l;

/* JADX INFO: loaded from: classes4.dex */
public class ConvertParams {
    public final int height;
    public final boolean mirror;
    public final l rotation;
    public final int width;

    public ConvertParams() {
        this(0, 0);
    }

    public ConvertParams(int i10, int i11) {
        this(i10, i11, l.NORMAL, false);
    }

    public ConvertParams(int i10, int i11, l lVar, boolean z10) {
        this.width = i10;
        this.height = i11;
        this.rotation = lVar == null ? l.NORMAL : lVar;
        this.mirror = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConvertParams)) {
            return false;
        }
        ConvertParams convertParams = (ConvertParams) obj;
        return convertParams.width == this.width && convertParams.height == this.height && convertParams.rotation == this.rotation && convertParams.mirror == this.mirror;
    }

    public int hashCode() {
        return (((this.width * 32713) + this.height) << 4) + (this.rotation.ordinal() << 1) + (this.mirror ? 1 : 0);
    }
}
