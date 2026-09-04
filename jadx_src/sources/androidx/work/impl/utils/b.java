package androidx.work.impl.utils;

import android.app.Application;
import androidx.annotation.w0;
import com.taobao.aranger.constant.Constants;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: ProcessUtils.kt */
/* JADX INFO: loaded from: classes6.dex */
@w0(28)
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Landroidx/work/impl/utils/b;", "", "", ak.av, "()Ljava/lang/String;", Constants.PARAM_PROCESS_NAME, "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final b f29273a = new b();

    private b() {
    }

    @androidx.annotation.u
    @dl.d
    public final String a() {
        String processName = Application.getProcessName();
        kotlin.jvm.internal.f0.o(processName, "getProcessName()");
        return processName;
    }
}
