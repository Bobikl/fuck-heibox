package androidx.compose.ui.graphics.colorspace;

import com.umeng.analytics.pro.ak;
import fi.u;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Lab.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/g;", "Landroidx/compose/ui/graphics/colorspace/c;", "", "component", "", "f", "e", "", "v", "l", "b", "", "j", "()Z", "isWideGamut", "", "name", "id", "<init>", "(Ljava/lang/String;I)V", "g", ak.av, "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class g extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f13786h = 0.008856452f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f13787i = 7.787037f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f13788j = 0.13793103f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f13789k = 0.20689656f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@dl.d String name, int i10) {
        super(name, b.INSTANCE.b(), i10, null);
        f0.p(name, "name");
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    @dl.d
    public float[] b(@dl.d float[] v10) {
        f0.p(v10, "v");
        float f10 = v10[0];
        f fVar = f.f13774a;
        float f11 = f10 / fVar.e()[0];
        float f12 = v10[1] / fVar.e()[1];
        float f13 = v10[2] / fVar.e()[2];
        float fPow = f11 > f13786h ? (float) Math.pow(f11, 0.33333334f) : (f11 * f13787i) + f13788j;
        float fPow2 = f12 > f13786h ? (float) Math.pow(f12, 0.33333334f) : (f12 * f13787i) + f13788j;
        float fPow3 = f13 > f13786h ? (float) Math.pow(f13, 0.33333334f) : (f13 * f13787i) + f13788j;
        v10[0] = u.H((116.0f * fPow2) - 16.0f, 0.0f, 100.0f);
        v10[1] = u.H((fPow - fPow2) * 500.0f, -128.0f, 128.0f);
        v10[2] = u.H((fPow2 - fPow3) * 200.0f, -128.0f, 128.0f);
        return v10;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float e(int component) {
        return component == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float f(int component) {
        return component == 0 ? 0.0f : -128.0f;
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
        v10[0] = u.H(v10[0], 0.0f, 100.0f);
        v10[1] = u.H(v10[1], -128.0f, 128.0f);
        float fH = u.H(v10[2], -128.0f, 128.0f);
        v10[2] = fH;
        float f10 = (v10[0] + 16.0f) / 116.0f;
        float f11 = (v10[1] * 0.002f) + f10;
        float f12 = f10 - (fH * 0.005f);
        float f13 = f11 > f13789k ? f11 * f11 * f11 : (f11 - f13788j) * 0.12841855f;
        float f14 = f10 > f13789k ? f10 * f10 * f10 : (f10 - f13788j) * 0.12841855f;
        float f15 = f12 > f13789k ? f12 * f12 * f12 : (f12 - f13788j) * 0.12841855f;
        f fVar = f.f13774a;
        v10[0] = f13 * fVar.e()[0];
        v10[1] = f14 * fVar.e()[1];
        v10[2] = f15 * fVar.e()[2];
        return v10;
    }
}
