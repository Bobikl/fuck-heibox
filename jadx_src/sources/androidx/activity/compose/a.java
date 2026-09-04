package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ActivityComposeUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final /* synthetic */ <T> T a(Context context) {
        f0.p(context, "context");
        Object obj = context;
        while (obj instanceof ContextWrapper) {
            f0.y(3, androidx.exifinterface.media.a.f23244d5);
            if (obj instanceof Object) {
                return (T) obj;
            }
            Object obj2 = (T) ((ContextWrapper) obj).getBaseContext();
            f0.o(obj2, "innerContext.baseContext");
            obj = obj2;
        }
        return null;
    }
}
