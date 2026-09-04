package com.huawei.hms.common.size;

import androidx.webkit.b;
import com.huawei.hms.common.internal.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class Size {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f60570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f60571b;

    public Size(int i10, int i11) {
        this.f60570a = i10;
        this.f60571b = i11;
    }

    public static Size parseSize(String str) {
        try {
            int iIndexOf = str.indexOf("x");
            if (iIndexOf < 0) {
                iIndexOf = str.indexOf(b.f28327e);
            }
            return new Size(Integer.parseInt(str.substring(0, iIndexOf)), Integer.parseInt(str.substring(iIndexOf + 1)));
        } catch (Exception unused) {
            throw new IllegalArgumentException("Size parses failed");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        return this.f60570a == size.f60570a && this.f60571b == size.f60571b;
    }

    public final int getHeight() {
        return this.f60571b;
    }

    public final int getWidth() {
        return this.f60570a;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(getWidth()), Integer.valueOf(getHeight()));
    }

    public final String toString() {
        return "Width is " + this.f60570a + " Height is " + this.f60571b;
    }
}
