package androidx.compose.foundation.layout;

import androidx.compose.runtime.j2;
import androidx.compose.ui.unit.LayoutDirection;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00132\u00020\u0001:\u0007\u0013\u0014\u0015\t\u000b\u000e\u0016B\t\b\u0004¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H ¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0006\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/q;", "", "", UiKitSpanObj.TYPE_SIZE, "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/layout/e1;", "placeable", "beforeCrossAxisAlignmentLine", "d", "(ILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/layout/e1;I)I", "e", "(Landroidx/compose/ui/layout/e1;)Ljava/lang/Integer;", "", "f", "()Z", "isRelative", "<init>", "()V", ak.av, "b", ak.aF, "g", "Landroidx/compose/foundation/layout/q$a;", "Landroidx/compose/foundation/layout/q$b;", "Landroidx/compose/foundation/layout/q$d;", "Landroidx/compose/foundation/layout/q$e;", "Landroidx/compose/foundation/layout/q$f;", "Landroidx/compose/foundation/layout/q$g;", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final q f6372b = b.f6376e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final q f6373c = f.f6379e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final q f6374d = d.f6377e;

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/layout/q$a;", "Landroidx/compose/foundation/layout/q;", "Landroidx/compose/ui/layout/e1;", "placeable", "", "e", "(Landroidx/compose/ui/layout/e1;)Ljava/lang/Integer;", UiKitSpanObj.TYPE_SIZE, "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "beforeCrossAxisAlignmentLine", "d", "(ILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/layout/e1;I)I", "Landroidx/compose/foundation/layout/d;", "Landroidx/compose/foundation/layout/d;", "g", "()Landroidx/compose/foundation/layout/d;", "alignmentLineProvider", "", "f", "()Z", "isRelative", "<init>", "(Landroidx/compose/foundation/layout/d;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends q {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final androidx.compose.foundation.layout.d alignmentLineProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@dl.d androidx.compose.foundation.layout.d alignmentLineProvider) {
            super(null);
            kotlin.jvm.internal.f0.p(alignmentLineProvider, "alignmentLineProvider");
            this.alignmentLineProvider = alignmentLineProvider;
        }

        @Override // androidx.compose.foundation.layout.q
        public int d(int size, @dl.d LayoutDirection layoutDirection, @dl.d androidx.compose.ui.layout.e1 placeable, int beforeCrossAxisAlignmentLine) {
            kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.f0.p(placeable, "placeable");
            int iA = this.alignmentLineProvider.a(placeable);
            if (iA == Integer.MIN_VALUE) {
                return 0;
            }
            int i10 = beforeCrossAxisAlignmentLine - iA;
            return layoutDirection == LayoutDirection.Rtl ? size - i10 : i10;
        }

        @Override // androidx.compose.foundation.layout.q
        @dl.d
        public Integer e(@dl.d androidx.compose.ui.layout.e1 placeable) {
            kotlin.jvm.internal.f0.p(placeable, "placeable");
            return Integer.valueOf(this.alignmentLineProvider.a(placeable));
        }

        @Override // androidx.compose.foundation.layout.q
        public boolean f() {
            return true;
        }

        @dl.d
        /* JADX INFO: renamed from: g, reason: from getter */
        public final androidx.compose.foundation.layout.d getAlignmentLineProvider() {
            return this.alignmentLineProvider;
        }
    }

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/layout/q$b;", "Landroidx/compose/foundation/layout/q;", "", UiKitSpanObj.TYPE_SIZE, "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/layout/e1;", "placeable", "beforeCrossAxisAlignmentLine", "d", "(ILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/layout/e1;I)I", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends q {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dl.d
        public static final b f6376e = new b();

        private b() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.q
        public int d(int size, @dl.d LayoutDirection layoutDirection, @dl.d androidx.compose.ui.layout.e1 placeable, int beforeCrossAxisAlignmentLine) {
            kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.f0.p(placeable, "placeable");
            return size / 2;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.q$c, reason: from kotlin metadata */
    /* JADX INFO: compiled from: RowColumnImpl.kt */
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0019\u0010\u0015R \u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u0013\u0012\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001c\u0010\u0015¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/layout/q$c;", "", "Landroidx/compose/ui/layout/a;", "alignmentLine", "Landroidx/compose/foundation/layout/q;", ak.av, "Landroidx/compose/foundation/layout/d;", "alignmentLineProvider", "b", "(Landroidx/compose/foundation/layout/d;)Landroidx/compose/foundation/layout/q;", "Landroidx/compose/ui/c$c;", "vertical", "j", "(Landroidx/compose/ui/c$c;)Landroidx/compose/foundation/layout/q;", "Landroidx/compose/ui/c$b;", "horizontal", "i", "(Landroidx/compose/ui/c$b;)Landroidx/compose/foundation/layout/q;", "Center", "Landroidx/compose/foundation/layout/q;", ak.aF, "()Landroidx/compose/foundation/layout/q;", "getCenter$annotations", "()V", "Start", "g", "getStart$annotations", "End", "e", "getEnd$annotations", "<init>", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @j2
        public static /* synthetic */ void d() {
        }

        @j2
        public static /* synthetic */ void f() {
        }

        @j2
        public static /* synthetic */ void h() {
        }

        @dl.d
        public final q a(@dl.d androidx.compose.ui.layout.a alignmentLine) {
            kotlin.jvm.internal.f0.p(alignmentLine, "alignmentLine");
            return new a(new androidx.compose.foundation.layout.d.Value(alignmentLine));
        }

        @dl.d
        public final q b(@dl.d androidx.compose.foundation.layout.d alignmentLineProvider) {
            kotlin.jvm.internal.f0.p(alignmentLineProvider, "alignmentLineProvider");
            return new a(alignmentLineProvider);
        }

        @dl.d
        public final q c() {
            return q.f6372b;
        }

        @dl.d
        public final q e() {
            return q.f6374d;
        }

        @dl.d
        public final q g() {
            return q.f6373c;
        }

        @dl.d
        public final q i(@dl.d androidx.compose.ui.c.b horizontal) {
            kotlin.jvm.internal.f0.p(horizontal, "horizontal");
            return new e(horizontal);
        }

        @dl.d
        public final q j(@dl.d androidx.compose.ui.c.InterfaceC0079c vertical) {
            kotlin.jvm.internal.f0.p(vertical, "vertical");
            return new g(vertical);
        }
    }

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/layout/q$d;", "Landroidx/compose/foundation/layout/q;", "", UiKitSpanObj.TYPE_SIZE, "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/layout/e1;", "placeable", "beforeCrossAxisAlignmentLine", "d", "(ILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/layout/e1;I)I", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
    public static final class d extends q {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dl.d
        public static final d f6377e = new d();

        private d() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.q
        public int d(int size, @dl.d LayoutDirection layoutDirection, @dl.d androidx.compose.ui.layout.e1 placeable, int beforeCrossAxisAlignmentLine) {
            kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.f0.p(placeable, "placeable");
            if (layoutDirection == LayoutDirection.Ltr) {
                return size;
            }
            return 0;
        }
    }

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/layout/q$e;", "Landroidx/compose/foundation/layout/q;", "", UiKitSpanObj.TYPE_SIZE, "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/layout/e1;", "placeable", "beforeCrossAxisAlignmentLine", "d", "(ILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/layout/e1;I)I", "Landroidx/compose/ui/c$b;", "e", "Landroidx/compose/ui/c$b;", "g", "()Landroidx/compose/ui/c$b;", "horizontal", "<init>", "(Landroidx/compose/ui/c$b;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
    public static final class e extends q {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final androidx.compose.ui.c.b horizontal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@dl.d androidx.compose.ui.c.b horizontal) {
            super(null);
            kotlin.jvm.internal.f0.p(horizontal, "horizontal");
            this.horizontal = horizontal;
        }

        @Override // androidx.compose.foundation.layout.q
        public int d(int size, @dl.d LayoutDirection layoutDirection, @dl.d androidx.compose.ui.layout.e1 placeable, int beforeCrossAxisAlignmentLine) {
            kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.f0.p(placeable, "placeable");
            return this.horizontal.a(0, size, layoutDirection);
        }

        @dl.d
        /* JADX INFO: renamed from: g, reason: from getter */
        public final androidx.compose.ui.c.b getHorizontal() {
            return this.horizontal;
        }
    }

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/layout/q$f;", "Landroidx/compose/foundation/layout/q;", "", UiKitSpanObj.TYPE_SIZE, "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/layout/e1;", "placeable", "beforeCrossAxisAlignmentLine", "d", "(ILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/layout/e1;I)I", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
    public static final class f extends q {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dl.d
        public static final f f6379e = new f();

        private f() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.q
        public int d(int size, @dl.d LayoutDirection layoutDirection, @dl.d androidx.compose.ui.layout.e1 placeable, int beforeCrossAxisAlignmentLine) {
            kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.f0.p(placeable, "placeable");
            if (layoutDirection == LayoutDirection.Ltr) {
                return 0;
            }
            return size;
        }
    }

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/layout/q$g;", "Landroidx/compose/foundation/layout/q;", "", UiKitSpanObj.TYPE_SIZE, "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/layout/e1;", "placeable", "beforeCrossAxisAlignmentLine", "d", "(ILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/layout/e1;I)I", "Landroidx/compose/ui/c$c;", "e", "Landroidx/compose/ui/c$c;", "g", "()Landroidx/compose/ui/c$c;", "vertical", "<init>", "(Landroidx/compose/ui/c$c;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
    public static final class g extends q {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final androidx.compose.ui.c.InterfaceC0079c vertical;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(@dl.d androidx.compose.ui.c.InterfaceC0079c vertical) {
            super(null);
            kotlin.jvm.internal.f0.p(vertical, "vertical");
            this.vertical = vertical;
        }

        @Override // androidx.compose.foundation.layout.q
        public int d(int size, @dl.d LayoutDirection layoutDirection, @dl.d androidx.compose.ui.layout.e1 placeable, int beforeCrossAxisAlignmentLine) {
            kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.f0.p(placeable, "placeable");
            return this.vertical.a(0, size);
        }

        @dl.d
        /* JADX INFO: renamed from: g, reason: from getter */
        public final androidx.compose.ui.c.InterfaceC0079c getVertical() {
            return this.vertical;
        }
    }

    private q() {
    }

    public /* synthetic */ q(kotlin.jvm.internal.u uVar) {
        this();
    }

    public abstract int d(int size, @dl.d LayoutDirection layoutDirection, @dl.d androidx.compose.ui.layout.e1 placeable, int beforeCrossAxisAlignmentLine);

    @dl.e
    public Integer e(@dl.d androidx.compose.ui.layout.e1 placeable) {
        kotlin.jvm.internal.f0.p(placeable, "placeable");
        return null;
    }

    public boolean f() {
        return false;
    }
}
