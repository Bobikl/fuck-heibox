package androidx.multidex;

import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public class MultiDexApplication extends Application {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        b.l(this);
    }
}
