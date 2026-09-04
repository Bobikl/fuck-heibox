package androidx.compose.material3;

import androidx.compose.runtime.h2;
import androidx.compose.runtime.j2;
import androidx.compose.runtime.saveable.ListSaverKt;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@w
@j2
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0004B\u001f\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cR+\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0005R$\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\u0011\u0010\u0015\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\u0017\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u001d"}, d2 = {"Landroidx/compose/material3/TopAppBarState;", "", "", "<set-?>", ak.av, "Landroidx/compose/runtime/a1;", "e", "()F", "i", "(F)V", "heightOffsetLimit", "b", ak.aF, "g", "contentOffset", "Landroidx/compose/runtime/a1;", "_heightOffset", "newOffset", "d", RXScreenCaptureService.KEY_HEIGHT, "heightOffset", "collapsedFraction", "f", "overlappedFraction", "initialHeightOffsetLimit", "initialHeightOffset", "initialContentOffset", "<init>", "(FFF)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class TopAppBarState {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.saveable.e<TopAppBarState, ?> f11736e = ListSaverKt.a(new yh.p<androidx.compose.runtime.saveable.f, TopAppBarState, List<? extends Float>>() { // from class: androidx.compose.material3.TopAppBarState$Companion$Saver$1
        @Override // yh.p
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Float> invoke(@dl.d androidx.compose.runtime.saveable.f listSaver, @dl.d TopAppBarState it) {
            kotlin.jvm.internal.f0.p(listSaver, "$this$listSaver");
            kotlin.jvm.internal.f0.p(it, "it");
            return CollectionsKt__CollectionsKt.L(Float.valueOf(it.e()), Float.valueOf(it.d()), Float.valueOf(it.c()));
        }
    }, new yh.l<List<? extends Float>, TopAppBarState>() { // from class: androidx.compose.material3.TopAppBarState$Companion$Saver$2
        @Override // yh.l
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TopAppBarState invoke(@dl.d List<Float> it) {
            kotlin.jvm.internal.f0.p(it, "it");
            return new TopAppBarState(it.get(0).floatValue(), it.get(1).floatValue(), it.get(2).floatValue());
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 heightOffsetLimit;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 contentOffset;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private androidx.compose.runtime.a1<Float> _heightOffset;

    /* JADX INFO: renamed from: androidx.compose.material3.TopAppBarState$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: AppBar.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR!\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/material3/TopAppBarState$a;", "", "Landroidx/compose/runtime/saveable/e;", "Landroidx/compose/material3/TopAppBarState;", "Saver", "Landroidx/compose/runtime/saveable/e;", ak.av, "()Landroidx/compose/runtime/saveable/e;", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final androidx.compose.runtime.saveable.e<TopAppBarState, ?> a() {
            return TopAppBarState.f11736e;
        }
    }

    public TopAppBarState(float f10, float f11, float f12) {
        this.heightOffsetLimit = h2.g(Float.valueOf(f10), null, 2, null);
        this.contentOffset = h2.g(Float.valueOf(f12), null, 2, null);
        this._heightOffset = h2.g(Float.valueOf(f11), null, 2, null);
    }

    public final float b() {
        if (e() == 0.0f) {
            return 0.0f;
        }
        return d() / e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float c() {
        return ((Number) this.contentOffset.getValue()).floatValue();
    }

    public final float d() {
        return this._heightOffset.getValue().floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float e() {
        return ((Number) this.heightOffsetLimit.getValue()).floatValue();
    }

    public final float f() {
        if (e() == 0.0f) {
            return 0.0f;
        }
        return 1 - (fi.u.H(e() - c(), e(), 0.0f) / e());
    }

    public final void g(float f10) {
        this.contentOffset.setValue(Float.valueOf(f10));
    }

    public final void h(float f10) {
        this._heightOffset.setValue(Float.valueOf(fi.u.H(f10, e(), 0.0f)));
    }

    public final void i(float f10) {
        this.heightOffsetLimit.setValue(Float.valueOf(f10));
    }
}
