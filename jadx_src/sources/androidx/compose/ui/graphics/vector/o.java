package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.m0;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ImageVector.kt */
/* JADX INFO: loaded from: classes.dex */
@m0
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002By\b\u0000\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0013\u0012\b\b\u0002\u0010 \u001a\u00020\u0013\u0012\b\b\u0002\u0010\"\u001a\u00020\u0013\u0012\b\b\u0002\u0010$\u001a\u00020\u0013\u0012\b\b\u0002\u0010&\u001a\u00020\u0013\u0012\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020(0'\u0012\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010'¢\u0006\u0004\b1\u00102J\u0011\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0096\u0002J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\f\u001a\u00020\u0003H\u0016R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u0017\u0010 \u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\"\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b!\u0010\u0017R\u0017\u0010$\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b#\u0010\u0017R\u0017\u0010&\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b%\u0010\u0017R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020(0'8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u0019\u0010+R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010*R\u0011\u00100\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00063"}, d2 = {"Landroidx/compose/ui/graphics/vector/o;", "Landroidx/compose/ui/graphics/vector/q;", "", "", UCropPlusActivity.ARG_INDEX, "b", "", "iterator", "", "other", "", "equals", "hashCode", "", ak.aF, "Ljava/lang/String;", "g", "()Ljava/lang/String;", "name", "", "d", "F", "j", "()F", androidx.constraintlayout.motion.widget.f.f18721i, "e", RXScreenCaptureService.KEY_HEIGHT, "pivotX", "f", "i", "pivotY", "l", "scaleX", "o", "scaleY", ak.aG, "translationX", "v", "translationY", "", "Landroidx/compose/ui/graphics/vector/f;", "k", "Ljava/util/List;", "()Ljava/util/List;", "clipPathData", "children", ak.aB, "()I", UiKitSpanObj.TYPE_SIZE, "<init>", "(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class o extends q implements Iterable<q>, zh.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String name;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float rotation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float pivotX;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float pivotY;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float scaleX;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float scaleY;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final float translationX;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final float translationY;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<f> clipPathData;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<q> children;

    /* JADX INFO: compiled from: ImageVector.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"androidx/compose/ui/graphics/vector/o$a", "", "Landroidx/compose/ui/graphics/vector/q;", "", "hasNext", "b", "Ljava/util/Iterator;", ak.av, "()Ljava/util/Iterator;", "it", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements Iterator<q>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final Iterator<q> it;

        a(o oVar) {
            this.it = oVar.children.iterator();
        }

        @dl.d
        public final Iterator<q> a() {
            return this.it;
        }

        @Override // java.util.Iterator
        @dl.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public q next() {
            return this.it.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.it.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public o() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(@dl.d String name, float f10, float f11, float f12, float f13, float f14, float f15, float f16, @dl.d List<? extends f> clipPathData, @dl.d List<? extends q> children) {
        super(null);
        f0.p(name, "name");
        f0.p(clipPathData, "clipPathData");
        f0.p(children, "children");
        this.name = name;
        this.rotation = f10;
        this.pivotX = f11;
        this.pivotY = f12;
        this.scaleX = f13;
        this.scaleY = f14;
        this.translationX = f15;
        this.translationY = f16;
        this.clipPathData = clipPathData;
        this.children = children;
    }

    public /* synthetic */ o(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, List list2, int i10, u uVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? 0.0f : f10, (i10 & 4) != 0 ? 0.0f : f11, (i10 & 8) != 0 ? 0.0f : f12, (i10 & 16) != 0 ? 1.0f : f13, (i10 & 32) == 0 ? f14 : 1.0f, (i10 & 64) != 0 ? 0.0f : f15, (i10 & 128) == 0 ? f16 : 0.0f, (i10 & 256) != 0 ? p.h() : list, (i10 & 512) != 0 ? CollectionsKt__CollectionsKt.E() : list2);
    }

    @dl.d
    public final q b(int index) {
        return this.children.get(index);
    }

    @dl.d
    public final List<f> e() {
        return this.clipPathData;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof o)) {
            return false;
        }
        o oVar = (o) other;
        if (!f0.g(this.name, oVar.name)) {
            return false;
        }
        if (!(this.rotation == oVar.rotation)) {
            return false;
        }
        if (!(this.pivotX == oVar.pivotX)) {
            return false;
        }
        if (!(this.pivotY == oVar.pivotY)) {
            return false;
        }
        if (!(this.scaleX == oVar.scaleX)) {
            return false;
        }
        if (!(this.scaleY == oVar.scaleY)) {
            return false;
        }
        if (this.translationX == oVar.translationX) {
            return ((this.translationY > oVar.translationY ? 1 : (this.translationY == oVar.translationY ? 0 : -1)) == 0) && f0.g(this.clipPathData, oVar.clipPathData) && f0.g(this.children, oVar.children);
        }
        return false;
    }

    @dl.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getPivotX() {
        return this.pivotX;
    }

    public int hashCode() {
        return (((((((((((((((((this.name.hashCode() * 31) + Float.floatToIntBits(this.rotation)) * 31) + Float.floatToIntBits(this.pivotX)) * 31) + Float.floatToIntBits(this.pivotY)) * 31) + Float.floatToIntBits(this.scaleX)) * 31) + Float.floatToIntBits(this.scaleY)) * 31) + Float.floatToIntBits(this.translationX)) * 31) + Float.floatToIntBits(this.translationY)) * 31) + this.clipPathData.hashCode()) * 31) + this.children.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getPivotY() {
        return this.pivotY;
    }

    @Override // java.lang.Iterable
    @dl.d
    public Iterator<q> iterator() {
        return new a(this);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final float getRotation() {
        return this.rotation;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final float getScaleX() {
        return this.scaleX;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final float getScaleY() {
        return this.scaleY;
    }

    public final int s() {
        return this.children.size();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final float getTranslationX() {
        return this.translationX;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final float getTranslationY() {
        return this.translationY;
    }
}
