package androidx.compose.ui.graphics;

import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: Vertices.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0017\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001BJ\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002ø\u0001\u0000J\u0019\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0002ø\u0001\u0000R \u0010\u000f\u001a\u00020\u000b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0017\u0010\u001d\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/Vertices;", "", "", "Landroidx/compose/ui/graphics/l0;", "colors", "", ak.av, "Lb1/f;", "points", "", "b", "Landroidx/compose/ui/graphics/q2;", "I", "g", "()I", "vertexMode", "[F", "e", "()[F", "positions", ak.aF, "f", "textureCoordinates", "d", "[I", "()[I", "", "[S", "()[S", "indices", "", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/u;)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class Vertices {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int vertexMode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final float[] positions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final float[] textureCoordinates;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final int[] colors;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final short[] indices;

    private Vertices(int i10, final List<b1.f> list, List<b1.f> list2, List<l0> list3, List<Integer> list4) {
        boolean z10;
        this.vertexMode = i10;
        yh.l<Integer, Boolean> lVar = new yh.l<Integer, Boolean>() { // from class: androidx.compose.ui.graphics.Vertices$outOfBounds$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @dl.d
            public final Boolean a(int i11) {
                return Boolean.valueOf(i11 < 0 || i11 >= list.size());
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                return a(num.intValue());
            }
        };
        if (list2.size() != list.size()) {
            throw new IllegalArgumentException("positions and textureCoordinates lengths must match.");
        }
        if (list3.size() != list.size()) {
            throw new IllegalArgumentException("positions and colors lengths must match.");
        }
        int size = list4.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                z10 = false;
                break;
            } else {
                if (lVar.invoke(list4.get(i11)).booleanValue()) {
                    z10 = true;
                    break;
                }
                i11++;
            }
        }
        if (z10) {
            throw new IllegalArgumentException("indices values must be valid indices in the positions list.");
        }
        this.positions = b(list);
        this.textureCoordinates = b(list2);
        this.colors = a(list3);
        int size2 = list4.size();
        short[] sArr = new short[size2];
        for (int i12 = 0; i12 < size2; i12++) {
            sArr[i12] = (short) list4.get(i12).intValue();
        }
        this.indices = sArr;
    }

    public /* synthetic */ Vertices(int i10, List list, List list2, List list3, List list4, kotlin.jvm.internal.u uVar) {
        this(i10, list, list2, list3, list4);
    }

    private final int[] a(List<l0> colors) {
        int size = colors.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = n0.s(colors.get(i10).M());
        }
        return iArr;
    }

    private final float[] b(List<b1.f> points) {
        int size = points.size() * 2;
        float[] fArr = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            long f30368a = points.get(i10 / 2).getF30368a();
            fArr[i10] = i10 % 2 == 0 ? b1.f.p(f30368a) : b1.f.r(f30368a);
        }
        return fArr;
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final int[] getColors() {
        return this.colors;
    }

    @dl.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final short[] getIndices() {
        return this.indices;
    }

    @dl.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public final float[] getPositions() {
        return this.positions;
    }

    @dl.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final float[] getTextureCoordinates() {
        return this.textureCoordinates;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getVertexMode() {
        return this.vertexMode;
    }
}
