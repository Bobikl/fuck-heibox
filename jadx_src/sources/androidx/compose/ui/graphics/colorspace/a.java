package androidx.compose.ui.graphics.colorspace;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: Adaptation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\t\b&\u0018\u0000 \n2\u00020\u0001:\u0001\u0005B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/a;", "", "", ak.av, "[F", "d", "()[F", "transform", "<init>", "([F)V", "b", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final a f13748c = new C0081a(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final a f13749d = new c(new float[]{0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f});

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final a f13750e = new b(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f});

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final float[] transform;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Adaptation.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"androidx/compose/ui/graphics/colorspace/a$a", "Landroidx/compose/ui/graphics/colorspace/a;", "", "toString", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final class C0081a extends a {
        C0081a(float[] fArr) {
            super(fArr, null);
        }

        @dl.d
        public String toString() {
            return "Bradford";
        }
    }

    /* JADX INFO: compiled from: Adaptation.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"androidx/compose/ui/graphics/colorspace/a$b", "Landroidx/compose/ui/graphics/colorspace/a;", "", "toString", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends a {
        b(float[] fArr) {
            super(fArr, null);
        }

        @dl.d
        public String toString() {
            return "Ciecat02";
        }
    }

    /* JADX INFO: compiled from: Adaptation.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"androidx/compose/ui/graphics/colorspace/a$c", "Landroidx/compose/ui/graphics/colorspace/a;", "", "toString", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final class c extends a {
        c(float[] fArr) {
            super(fArr, null);
        }

        @dl.d
        public String toString() {
            return "VonKries";
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.a$d, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Adaptation.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006¨\u0006\r"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/a$d;", "", "Landroidx/compose/ui/graphics/colorspace/a;", "Bradford", "Landroidx/compose/ui/graphics/colorspace/a;", ak.av, "()Landroidx/compose/ui/graphics/colorspace/a;", "VonKries", ak.aF, "Ciecat02", "b", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @dl.d
        public final a a() {
            return a.f13748c;
        }

        @dl.d
        public final a b() {
            return a.f13750e;
        }

        @dl.d
        public final a c() {
            return a.f13749d;
        }
    }

    private a(float[] fArr) {
        this.transform = fArr;
    }

    public /* synthetic */ a(float[] fArr, u uVar) {
        this(fArr);
    }

    @dl.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final float[] getTransform() {
        return this.transform;
    }
}
