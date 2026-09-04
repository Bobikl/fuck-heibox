package eg;

import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ExplainScope.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J2\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0007J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r¨\u0006\u0016"}, d2 = {"Leg/c;", "", "", "", "permissions", "message", "positiveText", "negativeText", "Lkotlin/b2;", "d", "Lcom/permissionx/guolindev/dialog/c;", "dialog", ak.av, "Lcom/permissionx/guolindev/dialog/d;", "dialogFragment", "b", "Leg/r;", "pb", "Leg/b;", "chainTask", "<init>", "(Leg/r;Leg/b;)V", "permissionx_release"}, k = 1, mv = {1, 5, 1})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final r f118621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final b f118622b;

    public c(@dl.d r pb2, @dl.d b chainTask) {
        f0.p(pb2, "pb");
        f0.p(chainTask, "chainTask");
        this.f118621a = pb2;
        this.f118622b = chainTask;
    }

    public static /* synthetic */ void e(c cVar, List list, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        cVar.d(list, str, str2, str3);
    }

    public final void a(@dl.d com.permissionx.guolindev.dialog.c dialog) {
        f0.p(dialog, "dialog");
        this.f118621a.F(this.f118622b, true, dialog);
    }

    public final void b(@dl.d com.permissionx.guolindev.dialog.d dialogFragment) {
        f0.p(dialogFragment, "dialogFragment");
        this.f118621a.G(this.f118622b, true, dialogFragment);
    }

    @xh.i
    public final void c(@dl.d List<String> permissions, @dl.d String message, @dl.d String positiveText) {
        f0.p(permissions, "permissions");
        f0.p(message, "message");
        f0.p(positiveText, "positiveText");
        e(this, permissions, message, positiveText, null, 8, null);
    }

    @xh.i
    public final void d(@dl.d List<String> permissions, @dl.d String message, @dl.d String positiveText, @dl.e String str) {
        f0.p(permissions, "permissions");
        f0.p(message, "message");
        f0.p(positiveText, "positiveText");
        this.f118621a.H(this.f118622b, true, permissions, message, positiveText, str);
    }
}
