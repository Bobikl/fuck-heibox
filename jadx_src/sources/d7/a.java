package d7;

import b7.CheckResult;
import b7.d;
import com.bytedance.bpea.basics.BPEAException;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.EntryCategory;
import com.bytedance.bpea.entry.common.DataType;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.e;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.m;

/* JADX INFO: compiled from: BPEACertAuthEntry.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ld7/a;", "", "<init>", "()V", ak.av, "common-entry_release"}, k = 1, mv = {1, 4, 0})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1068a f108153a = new C1068a(null);

    /* JADX INFO: renamed from: d7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BPEACertAuthEntry.kt */
    @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\t\u001a\u00020\b2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ1\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0012\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J;\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u0003H\u0007J\u001a\u0010\u0018\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u0003H\u0007J\u001a\u0010\u0019\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u0003H\u0007J\u001a\u0010\u001a\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u0003H\u0007J\u001a\u0010\u001b\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u0003H\u0007¨\u0006\u001e"}, d2 = {"Ld7/a$a;", "", "", "", "dataTypes", "entryToken", "", "entryCategory", "Lb7/d;", "i", "([Ljava/lang/String;Ljava/lang/String;I)Lb7/d;", "Lcom/bytedance/bpea/basics/Cert;", "cert", "Lkotlin/b2;", ak.aF, "(Lcom/bytedance/bpea/basics/Cert;[Ljava/lang/String;Ljava/lang/String;)V", "sdkName", "methodName", "g", "(Lcom/bytedance/bpea/basics/Cert;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lb7/e;", ak.av, "(Lcom/bytedance/bpea/basics/Cert;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lb7/e;", RXScreenCaptureService.KEY_HEIGHT, "b", "d", "e", "f", "<init>", "()V", "common-entry_release"}, k = 1, mv = {1, 4, 0})
    public static final class C1068a {
        private C1068a() {
        }

        public /* synthetic */ C1068a(u uVar) {
            this();
        }

        private final d i(String[] dataTypes, String entryToken, int entryCategory) {
            d dVar = new d();
            dVar.h(dataTypes);
            dVar.i(entryToken);
            dVar.g(Integer.valueOf(entryCategory));
            return dVar;
        }

        @e
        @m
        public final CheckResult a(@e Cert cert, @e String[] dataTypes, @dl.d String sdkName, @dl.d String methodName) throws BPEAException {
            f0.q(sdkName, "sdkName");
            f0.q(methodName, "methodName");
            d dVarI = i(dataTypes, sdkName + '_' + methodName, EntryCategory.DIRECT_AUTH.getType());
            dVarI.a("sdkName", sdkName);
            dVarI.a("methodName", methodName);
            return c.f108163b.a(cert, dVarI);
        }

        @m
        public final void b(@e Cert cert, @dl.d String entryToken) throws BPEAException {
            f0.q(entryToken, "entryToken");
            c(cert, new String[]{"audio"}, entryToken);
        }

        @m
        public final void c(@e Cert cert, @e String[] dataTypes, @dl.d String entryToken) throws BPEAException {
            f0.q(entryToken, "entryToken");
            c.f108163b.a(cert, i(dataTypes, entryToken, EntryCategory.BPEA_ENTRY.getType()));
        }

        @m
        public final void d(@e Cert cert, @dl.d String entryToken) throws BPEAException {
            f0.q(entryToken, "entryToken");
            c(cert, new String[]{DataType.CLIPBOARD}, entryToken);
        }

        @m
        public final void e(@e Cert cert, @dl.d String entryToken) throws BPEAException {
            f0.q(entryToken, "entryToken");
            c(cert, new String[]{DataType.LAT_AND_LON}, entryToken);
        }

        @m
        public final void f(@e Cert cert, @dl.d String entryToken) throws BPEAException {
            f0.q(entryToken, "entryToken");
            c(cert, new String[]{"audio", "video"}, entryToken);
        }

        @m
        public final void g(@e Cert cert, @e String[] dataTypes, @dl.d String sdkName, @dl.d String methodName) throws BPEAException {
            f0.q(sdkName, "sdkName");
            f0.q(methodName, "methodName");
            d dVarI = i(dataTypes, sdkName + '_' + methodName, EntryCategory.DIRECT_AUTH.getType());
            dVarI.a("sdkName", sdkName);
            dVarI.a("methodName", methodName);
            c.f108163b.a(cert, dVarI);
        }

        @m
        public final void h(@e Cert cert, @dl.d String entryToken) throws BPEAException {
            f0.q(entryToken, "entryToken");
            c(cert, new String[]{"video"}, entryToken);
        }
    }

    @e
    @m
    public static final CheckResult a(@e Cert cert, @e String[] strArr, @dl.d String str, @dl.d String str2) throws BPEAException {
        return f108153a.a(cert, strArr, str, str2);
    }

    @m
    public static final void b(@e Cert cert, @dl.d String str) throws BPEAException {
        f108153a.b(cert, str);
    }

    @m
    public static final void c(@e Cert cert, @e String[] strArr, @dl.d String str) throws BPEAException {
        f108153a.c(cert, strArr, str);
    }

    @m
    public static final void d(@e Cert cert, @dl.d String str) throws BPEAException {
        f108153a.d(cert, str);
    }

    @m
    public static final void e(@e Cert cert, @dl.d String str) throws BPEAException {
        f108153a.e(cert, str);
    }

    @m
    public static final void f(@e Cert cert, @dl.d String str) throws BPEAException {
        f108153a.f(cert, str);
    }

    @m
    public static final void g(@e Cert cert, @e String[] strArr, @dl.d String str, @dl.d String str2) throws BPEAException {
        f108153a.g(cert, strArr, str, str2);
    }

    @m
    public static final void h(@e Cert cert, @dl.d String str) throws BPEAException {
        f108153a.h(cert, str);
    }
}
