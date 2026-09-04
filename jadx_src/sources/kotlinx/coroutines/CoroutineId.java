package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.StringsKt__StringsKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: renamed from: kotlinx.coroutines.o0, reason: from toString */
/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001cB\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0016J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/o0;", "Lkotlinx/coroutines/g3;", "", "Lkotlin/coroutines/a;", "toString", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "p0", "oldState", "Lkotlin/b2;", "j0", "", "O", "id", "R", "", "hashCode", "", "other", "", "equals", ak.aF, "J", "c0", "()J", "<init>", "(J)V", "d", ak.av, "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@IgnoreJRERequirement
public final /* data */ class CoroutineId extends kotlin.coroutines.a implements g3<String> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long id;

    /* JADX INFO: renamed from: kotlinx.coroutines.o0$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: CoroutineContext.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/o0$a;", "Lkotlin/coroutines/CoroutineContext$b;", "Lkotlinx/coroutines/o0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class Companion implements CoroutineContext.b<CoroutineId> {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    public CoroutineId(long j10) {
        super(INSTANCE);
        this.id = j10;
    }

    public static /* synthetic */ CoroutineId V(CoroutineId coroutineId, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = coroutineId.id;
        }
        return coroutineId.R(j10);
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @dl.d
    public final CoroutineId R(long id2) {
        return new CoroutineId(id2);
    }

    public final long c0() {
        return this.id;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CoroutineId) && this.id == ((CoroutineId) other).id;
    }

    public int hashCode() {
        return androidx.collection.k.a(this.id);
    }

    @Override // kotlinx.coroutines.g3
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void z(@dl.d CoroutineContext coroutineContext, @dl.d String str) {
        Thread.currentThread().setName(str);
    }

    @Override // kotlinx.coroutines.g3
    @dl.d
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public String o0(@dl.d CoroutineContext context) {
        String strC0;
        CoroutineName coroutineName = (CoroutineName) context.f(CoroutineName.INSTANCE);
        if (coroutineName == null || (strC0 = coroutineName.c0()) == null) {
            strC0 = "coroutine";
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        int iG3 = StringsKt__StringsKt.G3(name, " @", 0, false, 6, null);
        if (iG3 < 0) {
            iG3 = name.length();
        }
        StringBuilder sb2 = new StringBuilder(strC0.length() + iG3 + 10);
        String strSubstring = name.substring(0, iG3);
        kotlin.jvm.internal.f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb2.append(strSubstring);
        sb2.append(" @");
        sb2.append(strC0);
        sb2.append('#');
        sb2.append(this.id);
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder(capacity).…builderAction).toString()");
        threadCurrentThread.setName(string);
        return name;
    }

    @dl.d
    public String toString() {
        return "CoroutineId(" + this.id + ')';
    }
}
