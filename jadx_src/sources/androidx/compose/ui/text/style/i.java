package androidx.compose.ui.text.style;

import androidx.compose.runtime.j2;
import androidx.compose.runtime.m0;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: TextDecoration.kt */
/* JADX INFO: loaded from: classes.dex */
@m0
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\fB\u0011\b\u0000\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000H\u0086\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/style/i;", "", "decoration", "f", "other", "", "d", "", "toString", "equals", "", "hashCode", ak.av, "I", "e", "()I", "mask", "<init>", "(I)V", "b", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final i f16946c = new i(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final i f16947d = new i(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final i f16948e = new i(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int mask;

    /* JADX INFO: renamed from: androidx.compose.ui.text.style.i$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: TextDecoration.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u000bJ\u0014\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R \u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR \u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0007\u0012\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\tR \u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0007\u0012\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0010\u0010\t¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/style/i$a;", "", "", "Landroidx/compose/ui/text/style/i;", "decorations", ak.av, d4.d.f108133a, "Landroidx/compose/ui/text/style/i;", "d", "()Landroidx/compose/ui/text/style/i;", "getNone$annotations", "()V", "Underline", "f", "getUnderline$annotations", "LineThrough", "b", "getLineThrough$annotations", "<init>", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @j2
        public static /* synthetic */ void c() {
        }

        @j2
        public static /* synthetic */ void e() {
        }

        @j2
        public static /* synthetic */ void g() {
        }

        @dl.d
        public final i a(@dl.d List<i> decorations) {
            f0.p(decorations, "decorations");
            Integer numValueOf = 0;
            int size = decorations.size();
            for (int i10 = 0; i10 < size; i10++) {
                numValueOf = Integer.valueOf(numValueOf.intValue() | decorations.get(i10).getMask());
            }
            return new i(numValueOf.intValue());
        }

        @dl.d
        public final i b() {
            return i.f16948e;
        }

        @dl.d
        public final i d() {
            return i.f16946c;
        }

        @dl.d
        public final i f() {
            return i.f16947d;
        }
    }

    public i(int i10) {
        this.mask = i10;
    }

    public final boolean d(@dl.d i other) {
        f0.p(other, "other");
        int i10 = this.mask;
        return (other.mask | i10) == i10;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMask() {
        return this.mask;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof i) && this.mask == ((i) other).mask;
    }

    @dl.d
    public final i f(@dl.d i decoration) {
        f0.p(decoration, "decoration");
        return new i(decoration.mask | this.mask);
    }

    public int hashCode() {
        return this.mask;
    }

    @dl.d
    public String toString() {
        if (this.mask == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.mask & f16947d.mask) != 0) {
            arrayList.add("Underline");
        }
        if ((this.mask & f16948e.mask) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + androidx.compose.ui.text.f0.l(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
