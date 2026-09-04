package androidx.compose.ui.node;

import androidx.compose.ui.graphics.o2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: NodeCoordinator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0000R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0012\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0016\u0010\u0014\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0016\u0010\u0016\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR\u001f\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/node/r;", "", "other", "Lkotlin/b2;", "b", "Landroidx/compose/ui/graphics/v0;", "scope", ak.av, "", ak.aF, "", "F", "scaleX", "scaleY", "translationX", "d", "translationY", "e", "rotationX", "f", "rotationY", "g", "rotationZ", RXScreenCaptureService.KEY_HEIGHT, "cameraDistance", "Landroidx/compose/ui/graphics/o2;", "i", "J", "transformOrigin", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float translationX;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float translationY;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float rotationX;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private float rotationY;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float rotationZ;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float scaleX = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float scaleY = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private float cameraDistance = 8.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private long transformOrigin = o2.INSTANCE.a();

    public final void a(@dl.d androidx.compose.ui.graphics.v0 scope) {
        kotlin.jvm.internal.f0.p(scope, "scope");
        this.scaleX = scope.S();
        this.scaleY = scope.b0();
        this.translationX = scope.H();
        this.translationY = scope.G();
        this.rotationX = scope.X();
        this.rotationY = scope.N();
        this.rotationZ = scope.O();
        this.cameraDistance = scope.u();
        this.transformOrigin = scope.d1();
    }

    public final void b(@dl.d r other) {
        kotlin.jvm.internal.f0.p(other, "other");
        this.scaleX = other.scaleX;
        this.scaleY = other.scaleY;
        this.translationX = other.translationX;
        this.translationY = other.translationY;
        this.rotationX = other.rotationX;
        this.rotationY = other.rotationY;
        this.rotationZ = other.rotationZ;
        this.cameraDistance = other.cameraDistance;
        this.transformOrigin = other.transformOrigin;
    }

    public final boolean c(@dl.d r other) {
        kotlin.jvm.internal.f0.p(other, "other");
        if (this.scaleX == other.scaleX) {
            if (this.scaleY == other.scaleY) {
                if (this.translationX == other.translationX) {
                    if (this.translationY == other.translationY) {
                        if (this.rotationX == other.rotationX) {
                            if (this.rotationY == other.rotationY) {
                                if (this.rotationZ == other.rotationZ) {
                                    if ((this.cameraDistance == other.cameraDistance) && o2.i(this.transformOrigin, other.transformOrigin)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
