package androidx.compose.ui.text.style;

import androidx.compose.runtime.j2;
import androidx.compose.runtime.m0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import s1.v;

/* JADX INFO: renamed from: androidx.compose.ui.text.style.o, reason: from toString */
/* JADX INFO: compiled from: TextIndent.kt */
/* JADX INFO: loaded from: classes.dex */
@m0
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u000eB\u001e\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/style/o;", "", "Ls1/u;", "firstLine", "restLine", "b", "(JJ)Landroidx/compose/ui/text/style/o;", "other", "", "equals", "", "hashCode", "", "toString", ak.av, "J", "d", "()J", "e", "<init>", "(JJLkotlin/jvm/internal/u;)V", ak.aF, "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class TextIndent {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final TextIndent f16966d = new TextIndent(0, 0, 3, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long firstLine;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long restLine;

    /* JADX INFO: renamed from: androidx.compose.ui.text.style.o$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: TextIndent.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/style/o$a;", "", "Landroidx/compose/ui/text/style/o;", d4.d.f108133a, "Landroidx/compose/ui/text/style/o;", ak.av, "()Landroidx/compose/ui/text/style/o;", "getNone$annotations", "()V", "<init>", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @j2
        public static /* synthetic */ void b() {
        }

        @dl.d
        public final TextIndent a() {
            return TextIndent.f16966d;
        }
    }

    private TextIndent(long j10, long j11) {
        this.firstLine = j10;
        this.restLine = j11;
    }

    public /* synthetic */ TextIndent(long j10, long j11, int i10, u uVar) {
        this((i10 & 1) != 0 ? v.m(0) : j10, (i10 & 2) != 0 ? v.m(0) : j11, null);
    }

    public /* synthetic */ TextIndent(long j10, long j11, u uVar) {
        this(j10, j11);
    }

    public static /* synthetic */ TextIndent c(TextIndent textIndent, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = textIndent.firstLine;
        }
        if ((i10 & 2) != 0) {
            j11 = textIndent.restLine;
        }
        return textIndent.b(j10, j11);
    }

    @dl.d
    public final TextIndent b(long firstLine, long restLine) {
        return new TextIndent(firstLine, restLine, null);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getFirstLine() {
        return this.firstLine;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getRestLine() {
        return this.restLine;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextIndent)) {
            return false;
        }
        TextIndent textIndent = (TextIndent) other;
        return s1.u.j(this.firstLine, textIndent.firstLine) && s1.u.j(this.restLine, textIndent.restLine);
    }

    public int hashCode() {
        return (s1.u.o(this.firstLine) * 31) + s1.u.o(this.restLine);
    }

    @dl.d
    public String toString() {
        return "TextIndent(firstLine=" + ((Object) s1.u.u(this.firstLine)) + ", restLine=" + ((Object) s1.u.u(this.restLine)) + ')';
    }
}
