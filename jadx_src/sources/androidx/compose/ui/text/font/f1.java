package androidx.compose.ui.text.font;

import androidx.compose.runtime.m2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: FontFamilyResolver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\u0004R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/f1;", "Landroidx/compose/runtime/m2;", "", "", "b", "()Z", "cacheable", ak.av, "Landroidx/compose/ui/text/font/f1$a;", "Landroidx/compose/ui/text/font/f1$b;", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public interface f1 extends m2<Object> {

    /* JADX INFO: compiled from: FontFamilyResolver.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\u00038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u000e¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/font/f1$a;", "Landroidx/compose/ui/text/font/f1;", "Landroidx/compose/runtime/m2;", "", "Landroidx/compose/ui/text/font/AsyncFontListLoader;", "b", "Landroidx/compose/ui/text/font/AsyncFontListLoader;", ak.aF, "()Landroidx/compose/ui/text/font/AsyncFontListLoader;", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "getValue", "()Ljava/lang/Object;", "value", "", "()Z", "cacheable", "<init>", "(Landroidx/compose/ui/text/font/AsyncFontListLoader;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class a implements f1, m2<Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f16545c = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final AsyncFontListLoader current;

        public a(@dl.d AsyncFontListLoader current) {
            kotlin.jvm.internal.f0.p(current, "current");
            this.current = current;
        }

        @Override // androidx.compose.ui.text.font.f1
        /* JADX INFO: renamed from: b */
        public boolean getCacheable() {
            return this.current.getCacheable();
        }

        @dl.d
        /* JADX INFO: renamed from: c, reason: from getter */
        public final AsyncFontListLoader getCurrent() {
            return this.current;
        }

        @Override // androidx.compose.runtime.m2
        @dl.d
        public Object getValue() {
            return this.current.getValue();
        }
    }

    /* JADX INFO: compiled from: FontFamilyResolver.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/font/f1$b;", "Landroidx/compose/ui/text/font/f1;", "", "b", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "value", "", ak.aF, "Z", "()Z", "cacheable", "<init>", "(Ljava/lang/Object;Z)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements f1 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f16547d = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final Object value;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean cacheable;

        public b(@dl.d Object value, boolean z10) {
            kotlin.jvm.internal.f0.p(value, "value");
            this.value = value;
            this.cacheable = z10;
        }

        public /* synthetic */ b(Object obj, boolean z10, int i10, kotlin.jvm.internal.u uVar) {
            this(obj, (i10 & 2) != 0 ? true : z10);
        }

        @Override // androidx.compose.ui.text.font.f1
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getCacheable() {
            return this.cacheable;
        }

        @Override // androidx.compose.runtime.m2
        @dl.d
        public Object getValue() {
            return this.value;
        }
    }

    /* JADX INFO: renamed from: b */
    boolean getCacheable();
}
