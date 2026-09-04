package androidx.compose.animation.core;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AnimationVectors.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\u0006\u0010!\u001a\u00020\t\u0012\u0006\u0010$\u001a\u00020\t\u0012\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\b+\u0010,J\u000f\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0090\u0002¢\u0006\u0004\b\n\u0010\u000bJ \u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0090\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0007H\u0016R*\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010!\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR*\u0010$\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\"\u0010\u001a\"\u0004\b#\u0010\u001cR*\u0010'\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0018\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR\u001a\u0010*\u001a\u00020\u00078\u0010X\u0090D¢\u0006\f\n\u0004\b\u0019\u0010(\u001a\u0004\b\u0017\u0010)¨\u0006-"}, d2 = {"Landroidx/compose/animation/core/o;", "Landroidx/compose/animation/core/p;", "Lkotlin/b2;", "d", "()V", "j", "()Landroidx/compose/animation/core/o;", "", UCropPlusActivity.ARG_INDEX, "", ak.av, "(I)F", "value", "e", "(IF)V", "", "toString", "", "other", "", "equals", "hashCode", "<set-?>", "b", "F", "f", "()F", "k", "(F)V", com.alipay.sdk.m.x.c.f39529d, ak.aF, "g", "l", "v2", RXScreenCaptureService.KEY_HEIGHT, "m", com.huawei.hms.feature.dynamic.b.f60699u, "i", "n", "v4", "I", "()I", UiKitSpanObj.TYPE_SIZE, "<init>", "(FFFF)V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public final class o extends p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f4472g = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float v1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float v2;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float v3;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float v4;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int size;

    public o(float f10, float f11, float f12, float f13) {
        super(null);
        this.v1 = f10;
        this.v2 = f11;
        this.v3 = f12;
        this.v4 = f13;
        this.size = 4;
    }

    @Override // androidx.compose.animation.core.p
    public float a(int index) {
        if (index == 0) {
            return this.v1;
        }
        if (index == 1) {
            return this.v2;
        }
        if (index == 2) {
            return this.v3;
        }
        if (index != 3) {
            return 0.0f;
        }
        return this.v4;
    }

    @Override // androidx.compose.animation.core.p
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // androidx.compose.animation.core.p
    public void d() {
        this.v1 = 0.0f;
        this.v2 = 0.0f;
        this.v3 = 0.0f;
        this.v4 = 0.0f;
    }

    @Override // androidx.compose.animation.core.p
    public void e(int index, float value) {
        if (index == 0) {
            this.v1 = value;
            return;
        }
        if (index == 1) {
            this.v2 = value;
        } else if (index == 2) {
            this.v3 = value;
        } else {
            if (index != 3) {
                return;
            }
            this.v4 = value;
        }
    }

    public boolean equals(@dl.e Object other) {
        if (other instanceof o) {
            o oVar = (o) other;
            if (oVar.v1 == this.v1) {
                if (oVar.v2 == this.v2) {
                    if (oVar.v3 == this.v3) {
                        if (oVar.v4 == this.v4) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getV1() {
        return this.v1;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getV2() {
        return this.v2;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getV3() {
        return this.v3;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.v1) * 31) + Float.floatToIntBits(this.v2)) * 31) + Float.floatToIntBits(this.v3)) * 31) + Float.floatToIntBits(this.v4);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getV4() {
        return this.v4;
    }

    @Override // androidx.compose.animation.core.p
    @dl.d
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public o c() {
        return new o(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final void k(float f10) {
        this.v1 = f10;
    }

    public final void l(float f10) {
        this.v2 = f10;
    }

    public final void m(float f10) {
        this.v3 = f10;
    }

    public final void n(float f10) {
        this.v4 = f10;
    }

    @dl.d
    public String toString() {
        return "AnimationVector4D: v1 = " + this.v1 + ", v2 = " + this.v2 + ", v3 = " + this.v3 + ", v4 = " + this.v4;
    }
}
