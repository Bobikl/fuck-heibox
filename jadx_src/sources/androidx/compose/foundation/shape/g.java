package androidx.compose.foundation.shape;

import androidx.compose.runtime.j2;
import androidx.compose.ui.platform.v0;
import androidx.compose.ui.platform.w0;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CornerSize.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u001a\u001d\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0005H\u0007\u001a\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007\" \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\n\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Ls1/h;", UiKitSpanObj.TYPE_SIZE, "Landroidx/compose/foundation/shape/f;", ak.aF, "(F)Landroidx/compose/foundation/shape/f;", "", ak.av, "", "percent", "b", "Landroidx/compose/foundation/shape/f;", "d", "()Landroidx/compose/foundation/shape/f;", "getZeroCornerSize$annotations", "()V", "ZeroCornerSize", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final f f7553a = new a();

    /* JADX INFO: compiled from: CornerSize.kt */
    @Metadata(bv = {}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u000e\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"androidx/compose/foundation/shape/g$a", "Landroidx/compose/foundation/shape/f;", "Landroidx/compose/ui/platform/w0;", "Lb1/m;", "shapeSize", "Ls1/e;", "density", "", "b", "(JLs1/e;)F", "", "toString", "e", "()Ljava/lang/String;", "valueOverride", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements f, w0 {
        a() {
        }

        @Override // androidx.compose.foundation.shape.f
        public float b(long shapeSize, @dl.d s1.e density) {
            f0.p(density, "density");
            return 0.0f;
        }

        @Override // androidx.compose.ui.platform.w0
        public /* synthetic */ kotlin.sequences.m c() {
            return v0.a(this);
        }

        @Override // androidx.compose.ui.platform.w0
        public /* synthetic */ String d() {
            return v0.b(this);
        }

        @Override // androidx.compose.ui.platform.w0
        @dl.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public String a() {
            return "ZeroCornerSize";
        }

        @dl.d
        public String toString() {
            return "ZeroCornerSize";
        }
    }

    @j2
    @dl.d
    public static final f a(float f10) {
        return new CornerSize(f10);
    }

    @j2
    @dl.d
    public static final f b(int i10) {
        return new CornerSize(i10);
    }

    @j2
    @dl.d
    public static final f c(float f10) {
        return new CornerSize(f10, null);
    }

    @dl.d
    public static final f d() {
        return f7553a;
    }

    @j2
    public static /* synthetic */ void e() {
    }
}
