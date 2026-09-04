package wf;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.account.TipsStateObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: OnlineConfig.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final C1276a f141043a = new C1276a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f141044b = 0;

    /* JADX INFO: renamed from: wf.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: OnlineConfig.kt */
    public static final class C1276a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private C1276a() {
        }

        public /* synthetic */ C1276a(u uVar) {
            this();
        }

        public final void a(@d TipsStateObj tipsStateObj) {
            if (PatchProxy.proxy(new Object[]{tipsStateObj}, this, changeQuickRedirect, false, 42830, new Class[]{TipsStateObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(tipsStateObj, "tipsStateObj");
            b.a(tipsStateObj);
            b.b(tipsStateObj);
        }
    }
}
