package androidx.compose.ui.graphics.colorspace;

import com.huawei.hms.support.api.entity.core.CommonCode;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: Connector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 \u00042\u00020\u0001:\u0002\u000b\u0005B>\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bB$\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u001c\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001dJ\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u0012\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR \u0010\u0016\u001a\u00020\u00138\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/e;", "", "", "r", "g", "b", "", "d", "v", "e", "Landroidx/compose/ui/graphics/colorspace/c;", ak.av, "Landroidx/compose/ui/graphics/colorspace/c;", ak.aF, "()Landroidx/compose/ui/graphics/colorspace/c;", "source", "destination", "transformSource", "transformDestination", "Landroidx/compose/ui/graphics/colorspace/i;", "I", "()I", "renderIntent", "f", "[F", "transform", "<init>", "(Landroidx/compose/ui/graphics/colorspace/c;Landroidx/compose/ui/graphics/colorspace/c;Landroidx/compose/ui/graphics/colorspace/c;Landroidx/compose/ui/graphics/colorspace/c;I[FLkotlin/jvm/internal/u;)V", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "(Landroidx/compose/ui/graphics/colorspace/c;Landroidx/compose/ui/graphics/colorspace/c;ILkotlin/jvm/internal/u;)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public class e {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final c source;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final c destination;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final c transformSource;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final c transformDestination;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int renderIntent;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final float[] transform;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.e$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Connector.kt */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/e$a;", "", "Landroidx/compose/ui/graphics/colorspace/c;", "source", "destination", "Landroidx/compose/ui/graphics/colorspace/i;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "", "b", "(Landroidx/compose/ui/graphics/colorspace/c;Landroidx/compose/ui/graphics/colorspace/c;I)[F", "Landroidx/compose/ui/graphics/colorspace/e;", ak.aF, "(Landroidx/compose/ui/graphics/colorspace/c;)Landroidx/compose/ui/graphics/colorspace/e;", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Connector.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"androidx/compose/ui/graphics/colorspace/e$a$a", "Landroidx/compose/ui/graphics/colorspace/e;", "", "v", "e", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
        public static final class C0082a extends e {
            C0082a(c cVar, int i10) {
                super(cVar, cVar, i10, null);
            }

            @Override // androidx.compose.ui.graphics.colorspace.e
            @dl.d
            public float[] e(@dl.d float[] v10) {
                f0.p(v10, "v");
                return v10;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] b(c source, c destination, int intent) {
            if (!i.h(intent, i.INSTANCE.a())) {
                return null;
            }
            long j10 = source.getCom.taobao.accs.common.Constants.KEY_MODEL java.lang.String();
            androidx.compose.ui.graphics.colorspace.b.Companion companion = androidx.compose.ui.graphics.colorspace.b.INSTANCE;
            boolean zH = androidx.compose.ui.graphics.colorspace.b.h(j10, companion.c());
            boolean zH2 = androidx.compose.ui.graphics.colorspace.b.h(destination.getCom.taobao.accs.common.Constants.KEY_MODEL java.lang.String(), companion.c());
            if (zH && zH2) {
                return null;
            }
            if (!zH && !zH2) {
                return null;
            }
            if (!zH) {
                source = destination;
            }
            f0.n(source, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            Rgb rgb = (Rgb) source;
            float[] fArrG = zH ? rgb.getWhitePoint().g() : f.f13774a.e();
            float[] fArrG2 = zH2 ? rgb.getWhitePoint().g() : f.f13774a.e();
            return new float[]{fArrG[0] / fArrG2[0], fArrG[1] / fArrG2[1], fArrG[2] / fArrG2[2]};
        }

        @dl.d
        public final e c(@dl.d c source) {
            f0.p(source, "source");
            return new C0082a(source, i.INSTANCE.c());
        }
    }

    /* JADX INFO: compiled from: Connector.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B$\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/e$b;", "Landroidx/compose/ui/graphics/colorspace/e;", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "source", "destination", "Landroidx/compose/ui/graphics/colorspace/i;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "", "f", "(Landroidx/compose/ui/graphics/colorspace/Rgb;Landroidx/compose/ui/graphics/colorspace/Rgb;I)[F", "v", "e", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/compose/ui/graphics/colorspace/Rgb;", "mSource", "i", "mDestination", "j", "[F", "mTransform", "<init>", "(Landroidx/compose/ui/graphics/colorspace/Rgb;Landroidx/compose/ui/graphics/colorspace/Rgb;ILkotlin/jvm/internal/u;)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends e {

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final Rgb mSource;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final Rgb mDestination;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final float[] mTransform;

        private b(Rgb rgb, Rgb rgb2, int i10) {
            super(rgb, rgb2, rgb, rgb2, i10, null, null);
            this.mSource = rgb;
            this.mDestination = rgb2;
            this.mTransform = f(rgb, rgb2, i10);
        }

        public /* synthetic */ b(Rgb rgb, Rgb rgb2, int i10, u uVar) {
            this(rgb, rgb2, i10);
        }

        private final float[] f(Rgb source, Rgb destination, int intent) {
            if (d.h(source.getWhitePoint(), destination.getWhitePoint())) {
                return d.m(destination.getInverseTransform(), source.getTransform());
            }
            float[] transform = source.getTransform();
            float[] inverseTransform = destination.getInverseTransform();
            float[] fArrG = source.getWhitePoint().g();
            float[] fArrG2 = destination.getWhitePoint().g();
            WhitePoint whitePoint = source.getWhitePoint();
            f fVar = f.f13774a;
            if (!d.h(whitePoint, fVar.d())) {
                float[] transform2 = a.INSTANCE.a().getTransform();
                float[] fArrE = fVar.e();
                float[] fArrCopyOf = Arrays.copyOf(fArrE, fArrE.length);
                f0.o(fArrCopyOf, "copyOf(this, size)");
                transform = d.m(d.f(transform2, fArrG, fArrCopyOf), source.getTransform());
            }
            if (!d.h(destination.getWhitePoint(), fVar.d())) {
                float[] transform3 = a.INSTANCE.a().getTransform();
                float[] fArrE2 = fVar.e();
                float[] fArrCopyOf2 = Arrays.copyOf(fArrE2, fArrE2.length);
                f0.o(fArrCopyOf2, "copyOf(this, size)");
                inverseTransform = d.l(d.m(d.f(transform3, fArrG2, fArrCopyOf2), destination.getTransform()));
            }
            if (i.h(intent, i.INSTANCE.a())) {
                transform = d.n(new float[]{fArrG[0] / fArrG2[0], fArrG[1] / fArrG2[1], fArrG[2] / fArrG2[2]}, transform);
            }
            return d.m(inverseTransform, transform);
        }

        @Override // androidx.compose.ui.graphics.colorspace.e
        @dl.d
        public float[] e(@dl.d float[] v10) {
            f0.p(v10, "v");
            v10[0] = (float) this.mSource.q().invoke(Double.valueOf(v10[0])).doubleValue();
            v10[1] = (float) this.mSource.q().invoke(Double.valueOf(v10[1])).doubleValue();
            v10[2] = (float) this.mSource.q().invoke(Double.valueOf(v10[2])).doubleValue();
            d.o(this.mTransform, v10);
            v10[0] = (float) this.mDestination.v().invoke(Double.valueOf(v10[0])).doubleValue();
            v10[1] = (float) this.mDestination.v().invoke(Double.valueOf(v10[1])).doubleValue();
            v10[2] = (float) this.mDestination.v().invoke(Double.valueOf(v10[2])).doubleValue();
            return v10;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private e(c cVar, c cVar2, int i10) {
        long j10 = cVar.getCom.taobao.accs.common.Constants.KEY_MODEL java.lang.String();
        androidx.compose.ui.graphics.colorspace.b.Companion companion = androidx.compose.ui.graphics.colorspace.b.INSTANCE;
        this(cVar, cVar2, androidx.compose.ui.graphics.colorspace.b.h(j10, companion.c()) ? d.e(cVar, f.f13774a.d(), null, 2, null) : cVar, androidx.compose.ui.graphics.colorspace.b.h(cVar2.getCom.taobao.accs.common.Constants.KEY_MODEL java.lang.String(), companion.c()) ? d.e(cVar2, f.f13774a.d(), null, 2, null) : cVar2, i10, INSTANCE.b(cVar, cVar2, i10), null);
    }

    public /* synthetic */ e(c cVar, c cVar2, int i10, u uVar) {
        this(cVar, cVar2, i10);
    }

    private e(c cVar, c cVar2, c cVar3, c cVar4, int i10, float[] fArr) {
        this.source = cVar;
        this.destination = cVar2;
        this.transformSource = cVar3;
        this.transformDestination = cVar4;
        this.renderIntent = i10;
        this.transform = fArr;
    }

    public /* synthetic */ e(c cVar, c cVar2, c cVar3, c cVar4, int i10, float[] fArr, u uVar) {
        this(cVar, cVar2, cVar3, cVar4, i10, fArr);
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getRenderIntent() {
        return this.renderIntent;
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getSource() {
        return this.source;
    }

    @dl.d
    public final float[] d(float r10, float g10, float b10) {
        return e(new float[]{r10, g10, b10});
    }

    @dl.d
    public float[] e(@dl.d float[] v10) {
        f0.p(v10, "v");
        float[] fArrL = this.transformSource.l(v10);
        float[] fArr = this.transform;
        if (fArr != null) {
            fArrL[0] = fArrL[0] * fArr[0];
            fArrL[1] = fArrL[1] * fArr[1];
            fArrL[2] = fArrL[2] * fArr[2];
        }
        return this.transformDestination.b(fArrL);
    }
}
