package z8;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.n0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public class a0 {
    private a0() {
    }

    @v8.a
    @Deprecated
    public static void a(@n0 Context context, @n0 SharedPreferences.Editor editor, @n0 String str) {
        throw new IllegalStateException("world-readable shared preferences should only be used by apk");
    }
}
