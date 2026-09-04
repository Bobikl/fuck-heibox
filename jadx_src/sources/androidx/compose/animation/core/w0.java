package androidx.compose.animation.core;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0018\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004¨\u0006\u001a"}, d2 = {"Landroidx/compose/animation/core/w0;", "", "", "b", "F", "StiffnessHigh", ak.aF, "StiffnessMedium", "d", "StiffnessMediumLow", "e", "StiffnessLow", "f", "StiffnessVeryLow", "g", "DampingRatioHighBouncy", RXScreenCaptureService.KEY_HEIGHT, "DampingRatioMediumBouncy", "i", "DampingRatioLowBouncy", "j", "DampingRatioNoBouncy", "k", "DefaultDisplacementThreshold", "<init>", "()V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final w0 f4547a = new w0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final float StiffnessHigh = 10000.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final float StiffnessMedium = 1500.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final float StiffnessMediumLow = 400.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final float StiffnessLow = 200.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final float StiffnessVeryLow = 50.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final float DampingRatioHighBouncy = 0.2f;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final float DampingRatioMediumBouncy = 0.5f;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final float DampingRatioLowBouncy = 0.75f;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final float DampingRatioNoBouncy = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final float DefaultDisplacementThreshold = 0.01f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f4558l = 0;

    private w0() {
    }
}
