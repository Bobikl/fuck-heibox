package cn.fly.verify;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class ch extends cg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f36027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BroadcastReceiver f36028d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f36030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f36031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f36032c;

        public a(String str) {
            this.f36030a = str;
        }

        public void a(long j10) {
            this.f36031b = j10;
        }

        public void a(String str) {
            this.f36032c = str;
        }

        public boolean a() {
            return this.f36031b > System.currentTimeMillis();
        }
    }

    public ch(Context context) {
        super(context);
        this.f36027c = new a(ba.a("004,fmFf^fkfe"));
    }

    /* JADX WARN: Code duplicated, block: B:54:0x007e A[DONT_GENERATE, EXC_TOP_SPLITTER, PHI: r9
  0x007e: PHI (r9v3 android.database.Cursor) = (r9v2 android.database.Cursor), (r9v6 android.database.Cursor) binds: [B:36:0x008b, B:30:0x007c] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    private String a(Context context, a aVar, boolean z10) {
        Cursor cursorQuery;
        String string;
        if (aVar == null) {
            return null;
        }
        if (!z10 && aVar.a()) {
            return aVar.f36032c;
        }
        try {
            cursorQuery = context.getContentResolver().query(Uri.parse(ba.a("036eNfm-gkhgkmnne[fmfhfnfhZhQfkiffifnghZi5gefh4h_fnfm:lhgDfkfehkfegj n")), null, null, new String[]{aVar.f36030a}, null);
            if (cursorQuery == null) {
                if (cursorQuery != null) {
                }
                return null;
            }
            try {
                cursorQuery.moveToFirst();
                int columnIndex = cursorQuery.getColumnIndex(ba.a("0057ff.fiWfi%h"));
                if (columnIndex >= 0) {
                    string = cursorQuery.getString(columnIndex);
                    aVar.a(string);
                } else {
                    string = null;
                }
                if (!z10) {
                    int columnIndex2 = cursorQuery.getColumnIndex(ba.a("007h8gkBl_fkflCh fe"));
                    if (columnIndex2 >= 0) {
                        aVar.a(cursorQuery.getLong(columnIndex2));
                    }
                    int columnIndex3 = cursorQuery.getColumnIndex(ba.a("004e[fmfe'h"));
                    if (columnIndex3 >= 0 && cursorQuery.getInt(columnIndex3) != 1000) {
                        e();
                    }
                }
                try {
                    cursorQuery.close();
                } catch (Throwable unused) {
                }
                return string;
            } catch (Throwable th2) {
                th = th2;
                try {
                    es.a().a(th);
                    return null;
                } finally {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            cursorQuery = null;
        }
    }

    private void e() {
        try {
            if (this.f36028d == null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(ba.a("044e^fmfhfnfh_hPfkiffifngh iXgefh1hEfnfm+lhgNfkfefnhfgfheggijgifjijinikgifjgghnfjgfhmhfgikfik"));
                BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: cn.fly.verify.ch.1
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        String stringExtra;
                        ArrayList<String> stringArrayListExtra;
                        if (context == null || intent == null) {
                            return;
                        }
                        try {
                            boolean zContains = false;
                            if (intent.getIntExtra(ba.a("016FfmRlhgPggfegifm>k:fkghgeieLifCgl"), 0) == 2 && (stringArrayListExtra = intent.getStringArrayListExtra(ba.a("017(fm0lhg-ggfeinPfe%gj_fHgl>hFhgfkhk*k"))) != null) {
                                zContains = stringArrayListExtra.contains(context.getPackageName());
                            }
                            if (zContains && (stringExtra = intent.getStringExtra(ba.a("010Ufm6lhgSggfehege%lh"))) != null && stringExtra.equals(ba.a("004;fm(fHfkfe"))) {
                                ch.this.f36027c.a(0L);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                };
                this.f36028d = broadcastReceiver;
                if (Build.VERSION.SDK_INT < 33) {
                    this.f36018a.registerReceiver(broadcastReceiver, intentFilter, ba.a("048e5fmfhfnfh>h:fkiffifnghGiTgefh]h:fnfm:lhg7fkfefnXlh4flfhfkhkhkfkfm,gYfnijinikgifjgghnfjgfhmhfgikfik"), null);
                } else {
                    this.f36018a.registerReceiver(broadcastReceiver, intentFilter, ba.a("048e$fmfhfnfh]h,fkiffifngh2iEgefhUhGfnfmHlhg8fkfefnFlhXflfhfkhkhkfkfmHgKfnijinikgifjgghnfjgfhmhfgikfik"), null, 4);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // cn.fly.verify.cg
    public synchronized String d() {
        Context context = this.f36018a;
        if (context == null) {
            return null;
        }
        return a(context.getApplicationContext(), this.f36027c, false);
    }
}
