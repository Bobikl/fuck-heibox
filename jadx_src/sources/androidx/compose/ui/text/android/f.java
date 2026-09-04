package androidx.compose.ui.text.android;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0015¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/android/f;", "", "", androidx.constraintlayout.core.motion.utils.w.c.R, "", "upstream", "cache", "primary", "", ak.av, ak.aF, "d", "e", "f", "Landroidx/compose/ui/text/android/TextLayout;", "Landroidx/compose/ui/text/android/TextLayout;", "b", "()Landroidx/compose/ui/text/android/TextLayout;", com.google.android.exoplayer2.text.ttml.d.f49813w, "I", "cachedKey", "F", "cachedValue", "<init>", "(Landroidx/compose/ui/text/android/TextLayout;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final TextLayout layout;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int cachedKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float cachedValue;

    public f(@dl.d TextLayout layout) {
        kotlin.jvm.internal.f0.p(layout, "layout");
        this.layout = layout;
        this.cachedKey = -1;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    private final float a(int offset, boolean upstream, boolean cache, boolean primary) {
        boolean z10;
        int i10 = 1;
        if (upstream) {
            int iA = i.a(this.layout.getCom.google.android.exoplayer2.text.ttml.d.w java.lang.String(), offset, upstream);
            int iB = this.layout.B(iA);
            int iU = this.layout.u(iA);
            if (offset == iB || offset == iU) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        int i11 = offset * 4;
        if (!primary) {
            i10 = z10 ? 2 : 3;
        } else if (z10) {
            i10 = 0;
        }
        int i12 = i11 + i10;
        if (this.cachedKey == i12) {
            return this.cachedValue;
        }
        float fJ = primary ? this.layout.J(offset, upstream) : this.layout.L(offset, upstream);
        if (cache) {
            this.cachedKey = i12;
            this.cachedValue = fJ;
        }
        return fJ;
    }

    @dl.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextLayout getLayout() {
        return this.layout;
    }

    public final float c(int offset) {
        return a(offset, false, false, true);
    }

    public final float d(int offset) {
        return a(offset, true, true, true);
    }

    public final float e(int offset) {
        return a(offset, false, false, false);
    }

    public final float f(int offset) {
        return a(offset, true, true, false);
    }
}
