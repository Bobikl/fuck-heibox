package a.a.a.a.c.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import f.b;

/* JADX INFO: compiled from: NetworkChangeObservableImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class d extends g.a {

    /* JADX INFO: compiled from: NetworkChangeObservableImpl.java */
    public class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f1135a;

        public a(Context context) {
            this.f1135a = context;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            d.this.a(this.f1135a);
        }
    }

    public d(Context context) {
        if (context == null) {
            return;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            applicationContext.registerReceiver(new a(applicationContext), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e10) {
            b.g("network register failed " + e10, new Object[0]);
        }
    }
}
