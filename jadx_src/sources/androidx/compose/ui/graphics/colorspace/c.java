package androidx.compose.ui.graphics.colorspace;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ColorSpace.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\b&\u0018\u0000 \"2\u00020\u0001:\u0001\u0011B$\b\u0000\u0012\u0006\u0010\u001b\u001a\u00020\u0012\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010$\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010,B\u001c\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0012\u0012\u0006\u0010\u001f\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b+\u0010-J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&J\u001e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0002H\u0016R\u0017\u0010\u001b\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001f\u001a\u00020\u001c8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\b\u0010\u001eR\u001a\u0010$\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0011\u0010%\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010#R\u0014\u0010(\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/ui/graphics/colorspace/c;", "", "", "component", "", "f", "e", "r", "g", "b", "", "k", "v", "l", "x", "y", ak.aD, ak.av, "", "toString", "other", "", "equals", "hashCode", "Ljava/lang/String;", RXScreenCaptureService.KEY_HEIGHT, "()Ljava/lang/String;", "name", "Landroidx/compose/ui/graphics/colorspace/b;", "J", "()J", Constants.KEY_MODEL, ak.aF, "I", "d", "()I", "id", "componentCount", "j", "()Z", "isWideGamut", "i", "isSrgb", "<init>", "(Ljava/lang/String;JILkotlin/jvm/internal/u;)V", "(Ljava/lang/String;JLkotlin/jvm/internal/u;)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public abstract class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f13759e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f13760f = 63;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long model;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int id;

    private c(String str, long j10) {
        this(str, j10, -1, null);
    }

    private c(String str, long j10, int i10) {
        this.name = str;
        this.model = j10;
        this.id = i10;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i10 < -1 || i10 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public /* synthetic */ c(String str, long j10, int i10, u uVar) {
        this(str, j10, i10);
    }

    public /* synthetic */ c(String str, long j10, u uVar) {
        this(str, j10);
    }

    @dl.d
    public final float[] a(float x10, float y10, float z10) {
        float[] fArr = new float[b.j(this.model)];
        fArr[0] = x10;
        fArr[1] = y10;
        fArr[2] = z10;
        return b(fArr);
    }

    @dl.d
    public abstract float[] b(@dl.d float[] v10);

    public final int c() {
        return b.j(this.model);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public abstract float e(int component);

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !f0.g(n0.d(getClass()), n0.d(other.getClass()))) {
            return false;
        }
        c cVar = (c) other;
        if (this.id == cVar.id && f0.g(this.name, cVar.name)) {
            return b.h(this.model, cVar.model);
        }
        return false;
    }

    public abstract float f(int component);

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getModel() {
        return this.model;
    }

    @dl.d
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + b.k(this.model)) * 31) + this.id;
    }

    public boolean i() {
        return false;
    }

    public abstract boolean j();

    @dl.d
    public final float[] k(float r10, float g10, float b10) {
        return l(new float[]{r10, g10, b10});
    }

    @dl.d
    public abstract float[] l(@dl.d float[] v10);

    @dl.d
    public String toString() {
        return this.name + " (id=" + this.id + ", model=" + ((Object) b.l(this.model)) + ')';
    }
}
