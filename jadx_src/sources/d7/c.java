package d7;

import b7.CheckResult;
import com.bytedance.bpea.basics.BPEAException;
import com.bytedance.bpea.basics.Cert;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PrivacyCertCheckerHolder.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Ld7/c;", "", "Lcom/bytedance/bpea/basics/Cert;", "cert", "Lb7/d;", "certContext", "Lb7/e;", ak.av, "<init>", "()V", "common-entry_release"}, k = 1, mv = {1, 4, 0})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b7.c f108162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f108163b = new c();

    static {
        try {
            Class<?> cls = Class.forName("com.bytedance.bpea.core.checker.CertCheckerProvider");
            Field getInstance = cls.getDeclaredField("INSTANCE");
            f0.h(getInstance, "getInstance");
            getInstance.setAccessible(true);
            Object obj = getInstance.get(null);
            Field getChecker = cls.getDeclaredField("CHECKER");
            f0.h(getChecker, "getChecker");
            getChecker.setAccessible(true);
            Object obj2 = getChecker.get(obj);
            if (obj2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.bpea.basics.CertChecker");
            }
            f108162a = (b7.c) obj2;
            if (f108162a != null) {
                b7.a.f30420b.a("checker working");
            } else {
                b7.a.f30420b.a("checker not work");
            }
        } catch (Throwable unused) {
        }
    }

    private c() {
    }

    @e
    public final CheckResult a(@e Cert cert, @d b7.d certContext) throws BPEAException {
        f0.q(certContext, "certContext");
        b7.c cVar = f108162a;
        if (cVar != null) {
            return cVar.a(cert, certContext);
        }
        return null;
    }
}
