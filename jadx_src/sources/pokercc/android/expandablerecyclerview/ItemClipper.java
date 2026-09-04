package pokercc.android.expandablerecyclerview;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.i1;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: renamed from: pokercc.android.expandablerecyclerview.c, reason: from toString */
/* JADX INFO: compiled from: ItemClipper.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0007J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0016¨\u0006\u001a"}, d2 = {"Lpokercc/android/expandablerecyclerview/c;", "", "", com.google.android.exoplayer2.text.ttml.d.f49793l0, "top", com.google.android.exoplayer2.text.ttml.d.f49796n0, "bottom", "Lkotlin/b2;", ak.aF, ak.av, "", "toString", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "clipRect", "", "b", "Z", "borderExists", "Landroid/view/View;", "Landroid/view/View;", "target", "()Z", "skipDraw", "<init>", "(Landroid/view/View;)V", "expandableRecyclerView_release"}, k = 1, mv = {1, 4, 1})
@i1
public final class ItemClipper {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Rect clipRect;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean borderExists;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final View target;

    public ItemClipper(@dl.d View target) {
        f0.p(target, "target");
        this.target = target;
        this.clipRect = new Rect();
    }

    public final void a() {
        if (this.borderExists) {
            this.clipRect.setEmpty();
            this.target.setClipBounds(null);
            this.borderExists = false;
        }
    }

    public final boolean b() {
        return this.clipRect.isEmpty() || this.clipRect.top >= this.target.getHeight() || this.clipRect.bottom <= 0;
    }

    public final void c(float f10, float f11, float f12, float f13) {
        float y10 = this.target.getY();
        this.clipRect.set((int) Math.ceil(f10), (int) Math.ceil(f11 - y10), (int) Math.floor(f12), (int) Math.floor(f13 - y10));
        this.target.setClipBounds(this.clipRect);
        this.borderExists = true;
    }

    @dl.d
    public String toString() {
        return "ItemClipper(clipRect=" + this.clipRect + ",skipDraw=" + b() + ')';
    }
}
