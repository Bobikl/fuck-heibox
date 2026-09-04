package androidx.compose.ui.text;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.text.w, reason: from toString */
/* JADX INFO: compiled from: Placeholder.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\"\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R \u0010\u0006\u001a\u00020\u00058\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/text/w;", "", "Ls1/u;", "width", "height", "Landroidx/compose/ui/text/x;", "placeholderVerticalAlign", ak.av, "(JJI)Landroidx/compose/ui/text/w;", "other", "", "equals", "", "hashCode", "", "toString", "J", "e", "()J", "b", ak.aF, "I", "d", "()I", "<init>", "(JJILkotlin/jvm/internal/u;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class Placeholder {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long width;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long height;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int placeholderVerticalAlign;

    private Placeholder(long j10, long j11, int i10) {
        this.width = j10;
        this.height = j11;
        this.placeholderVerticalAlign = i10;
        if (!(!s1.v.s(j10))) {
            throw new IllegalArgumentException("width cannot be TextUnit.Unspecified".toString());
        }
        if (!(!s1.v.s(j11))) {
            throw new IllegalArgumentException("height cannot be TextUnit.Unspecified".toString());
        }
    }

    public /* synthetic */ Placeholder(long j10, long j11, int i10, kotlin.jvm.internal.u uVar) {
        this(j10, j11, i10);
    }

    public static /* synthetic */ Placeholder b(Placeholder placeholder, long j10, long j11, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = placeholder.width;
        }
        long j12 = j10;
        if ((i11 & 2) != 0) {
            j11 = placeholder.height;
        }
        long j13 = j11;
        if ((i11 & 4) != 0) {
            i10 = placeholder.placeholderVerticalAlign;
        }
        return placeholder.a(j12, j13, i10);
    }

    @dl.d
    public final Placeholder a(long width, long height, int placeholderVerticalAlign) {
        return new Placeholder(width, height, placeholderVerticalAlign, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getPlaceholderVerticalAlign() {
        return this.placeholderVerticalAlign;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getWidth() {
        return this.width;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Placeholder)) {
            return false;
        }
        Placeholder placeholder = (Placeholder) other;
        return s1.u.j(this.width, placeholder.width) && s1.u.j(this.height, placeholder.height) && x.k(this.placeholderVerticalAlign, placeholder.placeholderVerticalAlign);
    }

    public int hashCode() {
        return (((s1.u.o(this.width) * 31) + s1.u.o(this.height)) * 31) + x.l(this.placeholderVerticalAlign);
    }

    @dl.d
    public String toString() {
        return "Placeholder(width=" + ((Object) s1.u.u(this.width)) + ", height=" + ((Object) s1.u.u(this.height)) + ", placeholderVerticalAlign=" + ((Object) x.m(this.placeholderVerticalAlign)) + ')';
    }
}
