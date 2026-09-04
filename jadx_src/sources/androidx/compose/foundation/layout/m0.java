package androidx.compose.foundation.layout;

import androidx.compose.runtime.j2;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Padding.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001:\u0001\nJ \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u0004H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0018\u0010\n\u001a\u00020\u0004H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\bø\u0001\u0003\u0082\u0002\u0015\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/m0;", "", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Ls1/h;", "b", "(Landroidx/compose/ui/unit/LayoutDirection;)F", "d", "()F", ak.aF, ak.av, "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public interface m0 {

    /* JADX INFO: compiled from: Padding.kt */
    @Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B2\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0004ø\u0001\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0018\u0010\n\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\bJ\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R#\u0010\u0016\u001a\u00020\u00048\u0002X\u0083\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\n\u0010\u0013\u0012\u0004\b\u0014\u0010\u0015R#\u0010\u0018\u001a\u00020\u00048\u0002X\u0083\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u0012\u0004\b\u0017\u0010\u0015R#\u0010\u001a\u001a\u00020\u00048\u0002X\u0083\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\t\u0010\u0013\u0012\u0004\b\u0019\u0010\u0015R#\u0010\u001c\u001a\u00020\u00048\u0002X\u0083\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u0012\u0004\b\u001b\u0010\u0015\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/layout/m0$a;", "Landroidx/compose/foundation/layout/m0;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Ls1/h;", "b", "(Landroidx/compose/ui/unit/LayoutDirection;)F", "d", "()F", ak.aF, ak.av, "", "other", "", "equals", "", "hashCode", "", "toString", "F", "getLeft-D9Ej5fM$annotations", "()V", com.google.android.exoplayer2.text.ttml.d.f49793l0, "getTop-D9Ej5fM$annotations", "top", "getRight-D9Ej5fM$annotations", com.google.android.exoplayer2.text.ttml.d.f49796n0, "getBottom-D9Ej5fM$annotations", "bottom", "<init>", "(FFFFLkotlin/jvm/internal/u;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
    @androidx.compose.runtime.m0
    public static final class a implements m0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final float left;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final float top;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final float right;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final float bottom;

        private a(float f10, float f11, float f12, float f13) {
            this.left = f10;
            this.top = f11;
            this.right = f12;
            this.bottom = f13;
        }

        public /* synthetic */ a(float f10, float f11, float f12, float f13, int i10, kotlin.jvm.internal.u uVar) {
            this((i10 & 1) != 0 ? s1.h.g(0) : f10, (i10 & 2) != 0 ? s1.h.g(0) : f11, (i10 & 4) != 0 ? s1.h.g(0) : f12, (i10 & 8) != 0 ? s1.h.g(0) : f13, null);
        }

        public /* synthetic */ a(float f10, float f11, float f12, float f13, kotlin.jvm.internal.u uVar) {
            this(f10, f11, f12, f13);
        }

        @j2
        private static /* synthetic */ void e() {
        }

        @j2
        private static /* synthetic */ void f() {
        }

        @j2
        private static /* synthetic */ void g() {
        }

        @j2
        private static /* synthetic */ void h() {
        }

        @Override // androidx.compose.foundation.layout.m0
        /* JADX INFO: renamed from: a, reason: from getter */
        public float getBottom() {
            return this.bottom;
        }

        @Override // androidx.compose.foundation.layout.m0
        public float b(@dl.d LayoutDirection layoutDirection) {
            kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
            return this.left;
        }

        @Override // androidx.compose.foundation.layout.m0
        public float c(@dl.d LayoutDirection layoutDirection) {
            kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
            return this.right;
        }

        @Override // androidx.compose.foundation.layout.m0
        /* JADX INFO: renamed from: d, reason: from getter */
        public float getTop() {
            return this.top;
        }

        public boolean equals(@dl.e Object other) {
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return s1.h.l(this.left, aVar.left) && s1.h.l(this.top, aVar.top) && s1.h.l(this.right, aVar.right) && s1.h.l(this.bottom, aVar.bottom);
        }

        public int hashCode() {
            return (((((s1.h.n(this.left) * 31) + s1.h.n(this.top)) * 31) + s1.h.n(this.right)) * 31) + s1.h.n(this.bottom);
        }

        @dl.d
        public String toString() {
            return "PaddingValues.Absolute(left=" + ((Object) s1.h.s(this.left)) + ", top=" + ((Object) s1.h.s(this.top)) + ", right=" + ((Object) s1.h.s(this.right)) + ", bottom=" + ((Object) s1.h.s(this.bottom)) + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    float getBottom();

    float b(@dl.d LayoutDirection layoutDirection);

    float c(@dl.d LayoutDirection layoutDirection);

    /* JADX INFO: renamed from: d */
    float getTop();
}
