package androidx.compose.ui.graphics;

import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Outline.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\b\tB\t\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/graphics/f1;", "", "Lb1/i;", ak.av, "()Lb1/i;", "bounds", "<init>", "()V", "b", ak.aF, "Landroidx/compose/ui/graphics/f1$a;", "Landroidx/compose/ui/graphics/f1$b;", "Landroidx/compose/ui/graphics/f1$c;", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public abstract class f1 {

    /* JADX INFO: compiled from: Outline.kt */
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/f1$a;", "Landroidx/compose/ui/graphics/f1;", "", "other", "", "equals", "", "hashCode", "Landroidx/compose/ui/graphics/l1;", ak.av, "Landroidx/compose/ui/graphics/l1;", "b", "()Landroidx/compose/ui/graphics/l1;", FlutterActivityLaunchConfigs.EXTRA_PATH, "Lb1/i;", "()Lb1/i;", "bounds", "<init>", "(Landroidx/compose/ui/graphics/l1;)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends f1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final l1 path;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@dl.d l1 path) {
            super(null);
            kotlin.jvm.internal.f0.p(path, "path");
            this.path = path;
        }

        @Override // androidx.compose.ui.graphics.f1
        @dl.d
        /* JADX INFO: renamed from: a */
        public b1.i getF13847a() {
            return this.path.getBounds();
        }

        @dl.d
        /* JADX INFO: renamed from: b, reason: from getter */
        public final l1 getPath() {
            return this.path;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && kotlin.jvm.internal.f0.g(this.path, ((a) other).path);
        }

        public int hashCode() {
            return this.path.hashCode();
        }
    }

    /* JADX INFO: compiled from: Outline.kt */
    @androidx.compose.runtime.m0
    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\f¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/graphics/f1$b;", "Landroidx/compose/ui/graphics/f1;", "", "other", "", "equals", "", "hashCode", "Lb1/i;", "rect", "Lb1/i;", "b", "()Lb1/i;", ak.av, "bounds", "<init>", "(Lb1/i;)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends f1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final b1.i f13847a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@dl.d b1.i rect) {
            super(null);
            kotlin.jvm.internal.f0.p(rect, "rect");
            this.f13847a = rect;
        }

        @Override // androidx.compose.ui.graphics.f1
        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public b1.i getF13847a() {
            return this.f13847a;
        }

        @dl.d
        public final b1.i b() {
            return this.f13847a;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && kotlin.jvm.internal.f0.g(this.f13847a, ((b) other).f13847a);
        }

        public int hashCode() {
            return this.f13847a.hashCode();
        }
    }

    /* JADX INFO: compiled from: Outline.kt */
    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\t\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/graphics/f1$c;", "Landroidx/compose/ui/graphics/f1;", "", "other", "", "equals", "", "hashCode", "Landroidx/compose/ui/graphics/l1;", "b", "Landroidx/compose/ui/graphics/l1;", ak.aF, "()Landroidx/compose/ui/graphics/l1;", "roundRectPath", "Lb1/k;", "roundRect", "Lb1/k;", "()Lb1/k;", "Lb1/i;", ak.av, "()Lb1/i;", "bounds", "<init>", "(Lb1/k;)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    @androidx.compose.runtime.m0
    public static final class c extends f1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final b1.k f13848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private final l1 roundRectPath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(@dl.d b1.k roundRect) {
            super(0 == true ? 1 : 0);
            kotlin.jvm.internal.f0.p(roundRect, "roundRect");
            l1 l1VarA = null;
            this.f13848a = roundRect;
            if (!g1.i(roundRect)) {
                l1VarA = o.a();
                l1VarA.p(roundRect);
            }
            this.roundRectPath = l1VarA;
        }

        @Override // androidx.compose.ui.graphics.f1
        @dl.d
        /* JADX INFO: renamed from: a */
        public b1.i getF13847a() {
            return b1.l.g(this.f13848a);
        }

        @dl.d
        /* JADX INFO: renamed from: b, reason: from getter */
        public final b1.k getF13848a() {
            return this.f13848a;
        }

        @dl.e
        /* JADX INFO: renamed from: c, reason: from getter */
        public final l1 getRoundRectPath() {
            return this.roundRectPath;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && kotlin.jvm.internal.f0.g(this.f13848a, ((c) other).f13848a);
        }

        public int hashCode() {
            return this.f13848a.hashCode();
        }
    }

    private f1() {
    }

    public /* synthetic */ f1(kotlin.jvm.internal.u uVar) {
        this();
    }

    @dl.d
    /* JADX INFO: renamed from: a */
    public abstract b1.i getF13847a();
}
