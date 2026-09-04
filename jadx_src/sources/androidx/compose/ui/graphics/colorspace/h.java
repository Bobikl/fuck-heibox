package androidx.compose.ui.graphics.colorspace;

import com.umeng.analytics.pro.ak;
import fi.u;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Oklab.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/h;", "Landroidx/compose/ui/graphics/colorspace/c;", "", "component", "", "f", "e", "", "v", "l", "b", "", "j", "()Z", "isWideGamut", "", "name", "id", "<init>", "(Ljava/lang/String;I)V", "g", ak.av, "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class h extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final float[] f13791h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final float[] f13792i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final float[] f13793j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final float[] f13794k;

    static {
        float[] transform = a.INSTANCE.a().getTransform();
        f fVar = f.f13774a;
        float[] fArrM = d.m(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, d.f(transform, fVar.d().g(), fVar.h().g()));
        f13791h = fArrM;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f13792i = fArr;
        f13793j = d.l(fArrM);
        f13794k = d.l(fArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@dl.d String name, int i10) {
        super(name, b.INSTANCE.b(), i10, null);
        f0.p(name, "name");
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    @dl.d
    public float[] b(@dl.d float[] v10) {
        f0.p(v10, "v");
        d.o(f13791h, v10);
        double d10 = 0.33333334f;
        v10[0] = Math.signum(v10[0]) * ((float) Math.pow(Math.abs(v10[0]), d10));
        v10[1] = Math.signum(v10[1]) * ((float) Math.pow(Math.abs(v10[1]), d10));
        v10[2] = Math.signum(v10[2]) * ((float) Math.pow(Math.abs(v10[2]), d10));
        d.o(f13792i, v10);
        return v10;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float e(int component) {
        return component == 0 ? 1.0f : 0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float f(int component) {
        return component == 0 ? 0.0f : -0.5f;
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
        v10[0] = u.H(v10[0], 0.0f, 1.0f);
        v10[1] = u.H(v10[1], -0.5f, 0.5f);
        v10[2] = u.H(v10[2], -0.5f, 0.5f);
        d.o(f13794k, v10);
        float f10 = v10[0];
        v10[0] = f10 * f10 * f10;
        float f11 = v10[1];
        v10[1] = f11 * f11 * f11;
        float f12 = v10[2];
        v10[2] = f12 * f12 * f12;
        d.o(f13793j, v10);
        return v10;
    }
}
