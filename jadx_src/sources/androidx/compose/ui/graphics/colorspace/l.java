package androidx.compose.ui.graphics.colorspace;

import fi.u;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Xyz.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/l;", "Landroidx/compose/ui/graphics/colorspace/c;", "", "x", "m", "", "component", "f", "e", "", "v", "l", "b", "", "j", "()Z", "isWideGamut", "", "name", "id", "<init>", "(Ljava/lang/String;I)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class l extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@dl.d String name, int i10) {
        super(name, b.INSTANCE.d(), i10, null);
        f0.p(name, "name");
    }

    private final float m(float x10) {
        return u.H(x10, -2.0f, 2.0f);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    @dl.d
    public float[] b(@dl.d float[] v10) {
        f0.p(v10, "v");
        v10[0] = m(v10[0]);
        v10[1] = m(v10[1]);
        v10[2] = m(v10[2]);
        return v10;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float e(int component) {
        return 2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float f(int component) {
        return -2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    /* JADX INFO: renamed from: j */
    public boolean getIsWideGamut() {
        return true;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    @dl.d
    public float[] l(@dl.d float[] v10) {
        f0.p(v10, "v");
        v10[0] = m(v10[0]);
        v10[1] = m(v10[1]);
        v10[2] = m(v10[2]);
        return v10;
    }
}
