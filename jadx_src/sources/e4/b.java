package e4;

import android.content.Context;
import android.content.Intent;
import com.alipay.face.ui.OcrGuideFrontActivity;

/* JADX INFO: compiled from: FinTechOcrFacade.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c f118543a;

    public static void a() {
        f118543a = null;
    }

    public static void b(Context context) {
        context.startActivity(new Intent(context, (Class<?>) OcrGuideFrontActivity.class));
    }

    public static void c(c cVar) {
        f118543a = cVar;
    }
}
