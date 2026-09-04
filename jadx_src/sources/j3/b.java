package j3;

import android.annotation.SuppressLint;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.m;

/* JADX INFO: compiled from: SimpleSQLiteQuery.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000bB#\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0012\u0010\u0011\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013B\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lj3/b;", "Lj3/j;", "Lj3/i;", "statement", "Lkotlin/b2;", "b", "", ak.aF, "()Ljava/lang/String;", com.tekartik.sqflite.b.f98602u, "", ak.av, "()I", "argCount", "query", "", "", "bindArgs", "<init>", "(Ljava/lang/String;[Ljava/lang/Object;)V", "(Ljava/lang/String;)V", "sqlite_release"}, k = 1, mv = {1, 7, 1})
public final class b implements j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final a f124203d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final String f124204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final Object[] f124205c;

    /* JADX INFO: compiled from: SimpleSQLiteQuery.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002J+\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lj3/b$a;", "", "Lj3/i;", "statement", "", UCropPlusActivity.ARG_INDEX, "arg", "Lkotlin/b2;", ak.av, "", "bindArgs", "b", "(Lj3/i;[Ljava/lang/Object;)V", "<init>", "()V", "sqlite_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        private final void a(i iVar, int i10, Object obj) {
            if (obj == null) {
                iVar.r0(i10);
                return;
            }
            if (obj instanceof byte[]) {
                iVar.l0(i10, (byte[]) obj);
                return;
            }
            if (obj instanceof Float) {
                iVar.F0(i10, ((Number) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                iVar.F0(i10, ((Number) obj).doubleValue());
                return;
            }
            if (obj instanceof Long) {
                iVar.d0(i10, ((Number) obj).longValue());
                return;
            }
            if (obj instanceof Integer) {
                iVar.d0(i10, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Short) {
                iVar.d0(i10, ((Number) obj).shortValue());
                return;
            }
            if (obj instanceof Byte) {
                iVar.d0(i10, ((Number) obj).byteValue());
                return;
            }
            if (obj instanceof String) {
                iVar.X(i10, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                iVar.d0(i10, ((Boolean) obj).booleanValue() ? 1L : 0L);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }

        @m
        @SuppressLint({"SyntheticAccessor"})
        public final void b(@dl.d i statement, @dl.e Object[] bindArgs) {
            f0.p(statement, "statement");
            if (bindArgs == null) {
                return;
            }
            int length = bindArgs.length;
            int i10 = 0;
            while (i10 < length) {
                Object obj = bindArgs[i10];
                i10++;
                a(statement, i10, obj);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@dl.d String query) {
        this(query, null);
        f0.p(query, "query");
    }

    public b(@dl.d String query, @dl.e Object[] objArr) {
        f0.p(query, "query");
        this.f124204b = query;
        this.f124205c = objArr;
    }

    @m
    @SuppressLint({"SyntheticAccessor"})
    public static final void d(@dl.d i iVar, @dl.e Object[] objArr) {
        f124203d.b(iVar, objArr);
    }

    @Override // j3.j
    public int a() {
        Object[] objArr = this.f124205c;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    @Override // j3.j
    public void b(@dl.d i statement) {
        f0.p(statement, "statement");
        f124203d.b(statement, this.f124205c);
    }

    @Override // j3.j
    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public String getF124204b() {
        return this.f124204b;
    }
}
