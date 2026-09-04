package a1;

import androidx.compose.runtime.internal.o;
import androidx.compose.ui.autofill.AutofillType;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: Autofill.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.ui.g
@o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001!B9\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R%\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"La1/m;", "", "other", "", "equals", "", "hashCode", "", "Landroidx/compose/ui/autofill/AutofillType;", "autofillTypes", "Ljava/util/List;", ak.aF, "()Ljava/util/List;", "Lb1/i;", "boundingBox", "Lb1/i;", "d", "()Lb1/i;", "g", "(Lb1/i;)V", "Lkotlin/Function1;", "", "Lkotlin/b2;", "onFill", "Lyh/l;", "f", "()Lyh/l;", "id", "I", "e", "()I", "<init>", "(Ljava/util/List;Lb1/i;Lyh/l;)V", ak.av, "ui_release"}, k = 1, mv = {1, 7, 1})
public final class m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final a f1157e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f1158f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f1159g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final List<AutofillType> f1160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private b1.i f1161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final yh.l<String, b2> f1162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1163d;

    /* JADX INFO: compiled from: Autofill.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u0016\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"La1/m$a;", "", "", "b", "previousId", "I", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b() {
            int i10;
            synchronized (this) {
                a aVar = m.f1157e;
                m.f1159g++;
                i10 = m.f1159g;
            }
            return i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(@dl.d List<? extends AutofillType> autofillTypes, @dl.e b1.i iVar, @dl.e yh.l<? super String, b2> lVar) {
        f0.p(autofillTypes, "autofillTypes");
        this.f1160a = autofillTypes;
        this.f1161b = iVar;
        this.f1162c = lVar;
        this.f1163d = f1157e.b();
    }

    public /* synthetic */ m(List list, b1.i iVar, yh.l lVar, int i10, u uVar) {
        this((i10 & 1) != 0 ? CollectionsKt__CollectionsKt.E() : list, (i10 & 2) != 0 ? null : iVar, lVar);
    }

    @dl.d
    public final List<AutofillType> c() {
        return this.f1160a;
    }

    @dl.e
    /* JADX INFO: renamed from: d, reason: from getter */
    public final b1.i getF1161b() {
        return this.f1161b;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getF1163d() {
        return this.f1163d;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof m)) {
            return false;
        }
        m mVar = (m) other;
        return f0.g(this.f1160a, mVar.f1160a) && f0.g(this.f1161b, mVar.f1161b) && f0.g(this.f1162c, mVar.f1162c);
    }

    @dl.e
    public final yh.l<String, b2> f() {
        return this.f1162c;
    }

    public final void g(@dl.e b1.i iVar) {
        this.f1161b = iVar;
    }

    public int hashCode() {
        int iHashCode = this.f1160a.hashCode() * 31;
        b1.i iVar = this.f1161b;
        int iHashCode2 = (iHashCode + (iVar != null ? iVar.hashCode() : 0)) * 31;
        yh.l<String, b2> lVar = this.f1162c;
        return iHashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }
}
