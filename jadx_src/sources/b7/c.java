package b7;

import com.bytedance.bpea.basics.BPEAException;
import com.bytedance.bpea.basics.Cert;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: CertChecker.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lb7/c;", "", "Lcom/bytedance/bpea/basics/Cert;", "cert", "Lb7/d;", com.umeng.analytics.pro.d.R, "Lb7/e;", ak.av, "basics_release"}, k = 1, mv = {1, 4, 0})
public interface c {
    @dl.d
    CheckResult a(@dl.e Cert cert, @dl.d d context) throws BPEAException;
}
