package androidx.compose.animation.core;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AnimationVectors.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010!\u001a\u00020\t¢\u0006\u0004\b\"\u0010\u001cJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0090\u0002¢\u0006\u0004\b\n\u0010\u000bJ \u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0090\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0007H\u0016R*\u0010\f\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\u00020\u00078\u0010X\u0090D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0017\u0010\u001f¨\u0006#"}, d2 = {"Landroidx/compose/animation/core/l;", "Landroidx/compose/animation/core/p;", "Lkotlin/b2;", "d", "()V", "g", "()Landroidx/compose/animation/core/l;", "", UCropPlusActivity.ARG_INDEX, "", ak.av, "(I)F", "value", "e", "(IF)V", "", "toString", "", "other", "", "equals", "hashCode", "<set-?>", "b", "F", "f", "()F", RXScreenCaptureService.KEY_HEIGHT, "(F)V", ak.aF, "I", "()I", UiKitSpanObj.TYPE_SIZE, "initVal", "<init>", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public final class l extends p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f4447d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int size;

    public l(float f10) {
        super(null);
        this.value = f10;
        this.size = 1;
    }

    @Override // androidx.compose.animation.core.p
    public float a(int index) {
        if (index == 0) {
            return this.value;
        }
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.p
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // androidx.compose.animation.core.p
    public void d() {
        this.value = 0.0f;
    }

    @Override // androidx.compose.animation.core.p
    public void e(int index, float value) {
        if (index == 0) {
            this.value = value;
        }
    }

    public boolean equals(@dl.e Object other) {
        if (other instanceof l) {
            if (((l) other).value == this.value) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    @Override // androidx.compose.animation.core.p
    @dl.d
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public l c() {
        return new l(0.0f);
    }

    public final void h(float f10) {
        this.value = f10;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.value);
    }

    @dl.d
    public String toString() {
        return "AnimationVector1D: value = " + this.value;
    }
}
