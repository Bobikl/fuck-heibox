package b7;

import android.util.Log;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BPEALogUtil.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lb7/a;", "", "", "msg", "Lkotlin/b2;", ak.av, "tag", "b", "e", "f", "g", RXScreenCaptureService.KEY_HEIGHT, ak.aF, "d", "<init>", "()V", "basics_release"}, k = 1, mv = {1, 4, 0})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f30419a = "BPEA";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f30420b = new a();

    private a() {
    }

    public final void a(@dl.d String msg) {
        f0.q(msg, "msg");
        Log.d(f30419a, msg);
    }

    public final void b(@dl.d String tag, @dl.d String msg) {
        f0.q(tag, "tag");
        f0.q(msg, "msg");
        Log.d("BPEA_" + tag, msg);
    }

    public final void c(@dl.d String msg) {
        f0.q(msg, "msg");
        Log.e(f30419a, msg);
    }

    public final void d(@dl.d String tag, @dl.d String msg) {
        f0.q(tag, "tag");
        f0.q(msg, "msg");
        Log.e("BPEA_" + tag, msg);
    }

    public final void e(@dl.d String msg) {
        f0.q(msg, "msg");
        Log.i(f30419a, msg);
    }

    public final void f(@dl.d String tag, @dl.d String msg) {
        f0.q(tag, "tag");
        f0.q(msg, "msg");
        Log.i("BPEA_" + tag, msg);
    }

    public final void g(@dl.d String msg) {
        f0.q(msg, "msg");
        Log.w(f30419a, msg);
    }

    public final void h(@dl.d String tag, @dl.d String msg) {
        f0.q(tag, "tag");
        f0.q(msg, "msg");
        Log.w("BPEA_" + tag, msg);
    }
}
