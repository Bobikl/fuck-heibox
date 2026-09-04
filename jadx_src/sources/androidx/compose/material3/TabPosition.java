package androidx.compose.material3;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.material3.w1, reason: from toString */
/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001c\b\u0000\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R \u0010\r\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR \u0010\u0010\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/material3/w1;", "", "other", "", "equals", "", "hashCode", "", "toString", "Ls1/h;", ak.av, "F", "()F", com.google.android.exoplayer2.text.ttml.d.f49793l0, "b", ak.aF, "width", com.google.android.exoplayer2.text.ttml.d.f49796n0, "<init>", "(FFLkotlin/jvm/internal/u;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class TabPosition {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float left;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float width;

    private TabPosition(float f10, float f11) {
        this.left = f10;
        this.width = f11;
    }

    public /* synthetic */ TabPosition(float f10, float f11, kotlin.jvm.internal.u uVar) {
        this(f10, f11);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    public final float b() {
        return s1.h.g(this.left + this.width);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabPosition)) {
            return false;
        }
        TabPosition tabPosition = (TabPosition) other;
        return s1.h.l(this.left, tabPosition.left) && s1.h.l(this.width, tabPosition.width);
    }

    public int hashCode() {
        return (s1.h.n(this.left) * 31) + s1.h.n(this.width);
    }

    @dl.d
    public String toString() {
        return "TabPosition(left=" + ((Object) s1.h.s(this.left)) + ", right=" + ((Object) s1.h.s(b())) + ", width=" + ((Object) s1.h.s(this.width)) + ')';
    }
}
