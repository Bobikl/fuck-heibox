package androidx.compose.ui.platform;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.platform.p0, reason: from toString */
/* JADX INFO: compiled from: DeviceRenderNode.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0002\b:\b\u0080\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0004\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\u0006\u0010\"\u001a\u00020\u0004\u0012\u0006\u0010#\u001a\u00020\u0004\u0012\u0006\u0010$\u001a\u00020\u0004\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u0006\u0010&\u001a\u00020\u000b\u0012\u0006\u0010'\u001a\u00020\u000b\u0012\u0006\u0010(\u001a\u00020\u000b\u0012\u0006\u0010)\u001a\u00020\u000b\u0012\u0006\u0010*\u001a\u00020\u000b\u0012\u0006\u0010+\u001a\u00020\u0004\u0012\u0006\u0010,\u001a\u00020\u0004\u0012\u0006\u0010-\u001a\u00020\u000b\u0012\u0006\u0010.\u001a\u00020\u000b\u0012\u0006\u0010/\u001a\u00020\u000b\u0012\u0006\u00100\u001a\u00020\u000b\u0012\u0006\u00101\u001a\u00020\u000b\u0012\u0006\u00102\u001a\u00020\u000b\u0012\u0006\u00103\u001a\u00020\u0019\u0012\u0006\u00104\u001a\u00020\u0019\u0012\u0006\u00105\u001a\u00020\u000b\u0012\b\u00106\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\bp\u0010qJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0014\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0015\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0016\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0017\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0019HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0019HÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÆ\u0003Jû\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u00101\u001a\u00020\u000b2\b\b\u0002\u00102\u001a\u00020\u000b2\b\b\u0002\u00103\u001a\u00020\u00192\b\b\u0002\u00104\u001a\u00020\u00192\b\b\u0002\u00105\u001a\u00020\u000b2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u001dHÆ\u0001J\t\u00109\u001a\u000208HÖ\u0001J\t\u0010:\u001a\u00020\u0004HÖ\u0001J\u0013\u0010<\u001a\u00020\u00192\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010 \u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\b@\u0010AR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bB\u0010AR\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\bC\u0010AR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010@\u001a\u0004\bD\u0010AR\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010@\u001a\u0004\bE\u0010AR\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010@\u001a\u0004\bF\u0010AR\"\u0010&\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010'\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010G\u001a\u0004\bL\u0010I\"\u0004\bM\u0010KR\"\u0010(\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010G\u001a\u0004\bN\u0010I\"\u0004\bO\u0010KR\"\u0010)\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010G\u001a\u0004\bP\u0010I\"\u0004\bQ\u0010KR\"\u0010*\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010G\u001a\u0004\bR\u0010I\"\u0004\bS\u0010KR\"\u0010+\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010@\u001a\u0004\bT\u0010A\"\u0004\bU\u0010VR\"\u0010,\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010@\u001a\u0004\bW\u0010A\"\u0004\bX\u0010VR\"\u0010-\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010G\u001a\u0004\bY\u0010I\"\u0004\bZ\u0010KR\"\u0010.\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010G\u001a\u0004\b[\u0010I\"\u0004\b\\\u0010KR\"\u0010/\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010G\u001a\u0004\b]\u0010I\"\u0004\b^\u0010KR\"\u00100\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010G\u001a\u0004\b_\u0010I\"\u0004\b`\u0010KR\"\u00101\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010G\u001a\u0004\b=\u0010I\"\u0004\ba\u0010KR\"\u00102\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010G\u001a\u0004\bb\u0010I\"\u0004\bc\u0010KR\"\u00103\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010U\u001a\u0004\bG\u0010d\"\u0004\be\u0010fR\"\u00104\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010U\u001a\u0004\bg\u0010d\"\u0004\bh\u0010fR\"\u00105\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010G\u001a\u0004\bi\u0010I\"\u0004\bj\u0010KR$\u00106\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010o¨\u0006r"}, d2 = {"Landroidx/compose/ui/platform/p0;", "", "", ak.av, "", "l", "r", ak.aB, "t", ak.aG, "v", "", RXScreenCaptureService.KEY_WIDTH, "x", "b", ak.aF, "d", "e", "f", "g", RXScreenCaptureService.KEY_HEIGHT, "i", "j", "k", "m", "", "n", "o", "p", "Landroidx/compose/ui/graphics/y1;", "q", "uniqueId", com.google.android.exoplayer2.text.ttml.d.f49793l0, "top", com.google.android.exoplayer2.text.ttml.d.f49796n0, "bottom", "width", "height", "scaleX", "scaleY", "translationX", "translationY", "elevation", "ambientShadowColor", "spotShadowColor", "rotationZ", "rotationX", "rotationY", "cameraDistance", "pivotX", "pivotY", "clipToOutline", "clipToBounds", "alpha", "renderEffect", "y", "", "toString", "hashCode", "other", "equals", "J", androidx.exifinterface.media.a.T4, "()J", "I", "()I", androidx.exifinterface.media.a.f23244d5, "M", "C", "X", "H", "F", "Q", "()F", "k0", "(F)V", "R", "l0", "U", "n0", androidx.exifinterface.media.a.X4, "o0", "G", "d0", "B", "Z", "(I)V", androidx.exifinterface.media.a.R4, "m0", "P", "j0", "N", "h0", "O", "i0", "D", "a0", "e0", "K", "f0", "()Z", "c0", "(Z)V", androidx.exifinterface.media.a.S4, "b0", androidx.exifinterface.media.a.W4, "Y", "Landroidx/compose/ui/graphics/y1;", "L", "()Landroidx/compose/ui/graphics/y1;", "g0", "(Landroidx/compose/ui/graphics/y1;)V", "<init>", "(JIIIIIIFFFFFIIFFFFFFZZFLandroidx/compose/ui/graphics/y1;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class DeviceRenderNodeData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long uniqueId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int left;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int top;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int right;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int bottom;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int width;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int height;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private float scaleX;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private float scaleY;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private float translationX;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private float translationY;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private float elevation;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private int ambientShadowColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private int spotShadowColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private float rotationZ;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private float rotationX;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private float rotationY;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private float cameraDistance;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private float pivotX;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private float pivotY;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean clipToOutline;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean clipToBounds;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private float alpha;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private androidx.compose.ui.graphics.y1 renderEffect;

    public DeviceRenderNodeData(long j10, int i10, int i11, int i12, int i13, int i14, int i15, float f10, float f11, float f12, float f13, float f14, int i16, int i17, float f15, float f16, float f17, float f18, float f19, float f20, boolean z10, boolean z11, float f21, @dl.e androidx.compose.ui.graphics.y1 y1Var) {
        this.uniqueId = j10;
        this.left = i10;
        this.top = i11;
        this.right = i12;
        this.bottom = i13;
        this.width = i14;
        this.height = i15;
        this.scaleX = f10;
        this.scaleY = f11;
        this.translationX = f12;
        this.translationY = f13;
        this.elevation = f14;
        this.ambientShadowColor = i16;
        this.spotShadowColor = i17;
        this.rotationZ = f15;
        this.rotationX = f16;
        this.rotationY = f17;
        this.cameraDistance = f18;
        this.pivotX = f19;
        this.pivotY = f20;
        this.clipToOutline = z10;
        this.clipToBounds = z11;
        this.alpha = f21;
        this.renderEffect = y1Var;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final int getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final int getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final boolean getClipToBounds() {
        return this.clipToBounds;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final boolean getClipToOutline() {
        return this.clipToOutline;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final float getElevation() {
        return this.elevation;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final float getPivotX() {
        return this.pivotX;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final float getPivotY() {
        return this.pivotY;
    }

    @dl.e
    /* JADX INFO: renamed from: L, reason: from getter */
    public final androidx.compose.ui.graphics.y1 getRenderEffect() {
        return this.renderEffect;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final int getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final float getRotationX() {
        return this.rotationX;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final float getRotationY() {
        return this.rotationY;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final float getRotationZ() {
        return this.rotationZ;
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final float getScaleX() {
        return this.scaleX;
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final float getScaleY() {
        return this.scaleY;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final int getSpotShadowColor() {
        return this.spotShadowColor;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final int getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final float getTranslationX() {
        return this.translationX;
    }

    /* JADX INFO: renamed from: V, reason: from getter */
    public final float getTranslationY() {
        return this.translationY;
    }

    /* JADX INFO: renamed from: W, reason: from getter */
    public final long getUniqueId() {
        return this.uniqueId;
    }

    /* JADX INFO: renamed from: X, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    public final void Y(float f10) {
        this.alpha = f10;
    }

    public final void Z(int i10) {
        this.ambientShadowColor = i10;
    }

    public final long a() {
        return this.uniqueId;
    }

    public final void a0(float f10) {
        this.cameraDistance = f10;
    }

    public final float b() {
        return this.translationX;
    }

    public final void b0(boolean z10) {
        this.clipToBounds = z10;
    }

    public final float c() {
        return this.translationY;
    }

    public final void c0(boolean z10) {
        this.clipToOutline = z10;
    }

    public final float d() {
        return this.elevation;
    }

    public final void d0(float f10) {
        this.elevation = f10;
    }

    public final int e() {
        return this.ambientShadowColor;
    }

    public final void e0(float f10) {
        this.pivotX = f10;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceRenderNodeData)) {
            return false;
        }
        DeviceRenderNodeData deviceRenderNodeData = (DeviceRenderNodeData) other;
        return this.uniqueId == deviceRenderNodeData.uniqueId && this.left == deviceRenderNodeData.left && this.top == deviceRenderNodeData.top && this.right == deviceRenderNodeData.right && this.bottom == deviceRenderNodeData.bottom && this.width == deviceRenderNodeData.width && this.height == deviceRenderNodeData.height && kotlin.jvm.internal.f0.g(Float.valueOf(this.scaleX), Float.valueOf(deviceRenderNodeData.scaleX)) && kotlin.jvm.internal.f0.g(Float.valueOf(this.scaleY), Float.valueOf(deviceRenderNodeData.scaleY)) && kotlin.jvm.internal.f0.g(Float.valueOf(this.translationX), Float.valueOf(deviceRenderNodeData.translationX)) && kotlin.jvm.internal.f0.g(Float.valueOf(this.translationY), Float.valueOf(deviceRenderNodeData.translationY)) && kotlin.jvm.internal.f0.g(Float.valueOf(this.elevation), Float.valueOf(deviceRenderNodeData.elevation)) && this.ambientShadowColor == deviceRenderNodeData.ambientShadowColor && this.spotShadowColor == deviceRenderNodeData.spotShadowColor && kotlin.jvm.internal.f0.g(Float.valueOf(this.rotationZ), Float.valueOf(deviceRenderNodeData.rotationZ)) && kotlin.jvm.internal.f0.g(Float.valueOf(this.rotationX), Float.valueOf(deviceRenderNodeData.rotationX)) && kotlin.jvm.internal.f0.g(Float.valueOf(this.rotationY), Float.valueOf(deviceRenderNodeData.rotationY)) && kotlin.jvm.internal.f0.g(Float.valueOf(this.cameraDistance), Float.valueOf(deviceRenderNodeData.cameraDistance)) && kotlin.jvm.internal.f0.g(Float.valueOf(this.pivotX), Float.valueOf(deviceRenderNodeData.pivotX)) && kotlin.jvm.internal.f0.g(Float.valueOf(this.pivotY), Float.valueOf(deviceRenderNodeData.pivotY)) && this.clipToOutline == deviceRenderNodeData.clipToOutline && this.clipToBounds == deviceRenderNodeData.clipToBounds && kotlin.jvm.internal.f0.g(Float.valueOf(this.alpha), Float.valueOf(deviceRenderNodeData.alpha)) && kotlin.jvm.internal.f0.g(this.renderEffect, deviceRenderNodeData.renderEffect);
    }

    public final int f() {
        return this.spotShadowColor;
    }

    public final void f0(float f10) {
        this.pivotY = f10;
    }

    public final float g() {
        return this.rotationZ;
    }

    public final void g0(@dl.e androidx.compose.ui.graphics.y1 y1Var) {
        this.renderEffect = y1Var;
    }

    public final float h() {
        return this.rotationX;
    }

    public final void h0(float f10) {
        this.rotationX = f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [int] */
    /* JADX WARN: Type inference failed for: r0v43, types: [int] */
    /* JADX WARN: Type inference failed for: r1v31, types: [int] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iA = ((((((((((((((((((((((((((((((((((((((androidx.collection.k.a(this.uniqueId) * 31) + this.left) * 31) + this.top) * 31) + this.right) * 31) + this.bottom) * 31) + this.width) * 31) + this.height) * 31) + Float.floatToIntBits(this.scaleX)) * 31) + Float.floatToIntBits(this.scaleY)) * 31) + Float.floatToIntBits(this.translationX)) * 31) + Float.floatToIntBits(this.translationY)) * 31) + Float.floatToIntBits(this.elevation)) * 31) + this.ambientShadowColor) * 31) + this.spotShadowColor) * 31) + Float.floatToIntBits(this.rotationZ)) * 31) + Float.floatToIntBits(this.rotationX)) * 31) + Float.floatToIntBits(this.rotationY)) * 31) + Float.floatToIntBits(this.cameraDistance)) * 31) + Float.floatToIntBits(this.pivotX)) * 31) + Float.floatToIntBits(this.pivotY)) * 31;
        boolean z10 = this.clipToOutline;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iA + r10) * 31;
        boolean z11 = this.clipToBounds;
        int iFloatToIntBits = (((i10 + (z11 ? 1 : z11)) * 31) + Float.floatToIntBits(this.alpha)) * 31;
        androidx.compose.ui.graphics.y1 y1Var = this.renderEffect;
        return iFloatToIntBits + (y1Var == null ? 0 : y1Var.hashCode());
    }

    public final float i() {
        return this.rotationY;
    }

    public final void i0(float f10) {
        this.rotationY = f10;
    }

    public final float j() {
        return this.cameraDistance;
    }

    public final void j0(float f10) {
        this.rotationZ = f10;
    }

    public final float k() {
        return this.pivotX;
    }

    public final void k0(float f10) {
        this.scaleX = f10;
    }

    public final int l() {
        return this.left;
    }

    public final void l0(float f10) {
        this.scaleY = f10;
    }

    public final float m() {
        return this.pivotY;
    }

    public final void m0(int i10) {
        this.spotShadowColor = i10;
    }

    public final boolean n() {
        return this.clipToOutline;
    }

    public final void n0(float f10) {
        this.translationX = f10;
    }

    public final boolean o() {
        return this.clipToBounds;
    }

    public final void o0(float f10) {
        this.translationY = f10;
    }

    public final float p() {
        return this.alpha;
    }

    @dl.e
    public final androidx.compose.ui.graphics.y1 q() {
        return this.renderEffect;
    }

    public final int r() {
        return this.top;
    }

    public final int s() {
        return this.right;
    }

    public final int t() {
        return this.bottom;
    }

    @dl.d
    public String toString() {
        return "DeviceRenderNodeData(uniqueId=" + this.uniqueId + ", left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ", width=" + this.width + ", height=" + this.height + ", scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", elevation=" + this.elevation + ", ambientShadowColor=" + this.ambientShadowColor + ", spotShadowColor=" + this.spotShadowColor + ", rotationZ=" + this.rotationZ + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", cameraDistance=" + this.cameraDistance + ", pivotX=" + this.pivotX + ", pivotY=" + this.pivotY + ", clipToOutline=" + this.clipToOutline + ", clipToBounds=" + this.clipToBounds + ", alpha=" + this.alpha + ", renderEffect=" + this.renderEffect + ')';
    }

    public final int u() {
        return this.width;
    }

    public final int v() {
        return this.height;
    }

    public final float w() {
        return this.scaleX;
    }

    public final float x() {
        return this.scaleY;
    }

    @dl.d
    public final DeviceRenderNodeData y(long uniqueId, int left, int top, int right, int bottom, int width, int height, float scaleX, float scaleY, float translationX, float translationY, float elevation, int ambientShadowColor, int spotShadowColor, float rotationZ, float rotationX, float rotationY, float cameraDistance, float pivotX, float pivotY, boolean clipToOutline, boolean clipToBounds, float alpha, @dl.e androidx.compose.ui.graphics.y1 renderEffect) {
        return new DeviceRenderNodeData(uniqueId, left, top, right, bottom, width, height, scaleX, scaleY, translationX, translationY, elevation, ambientShadowColor, spotShadowColor, rotationZ, rotationX, rotationY, cameraDistance, pivotX, pivotY, clipToOutline, clipToBounds, alpha, renderEffect);
    }
}
