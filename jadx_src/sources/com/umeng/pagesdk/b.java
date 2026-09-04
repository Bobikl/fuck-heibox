package com.umeng.pagesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f105963a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Context f105964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC1053b f105965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BroadcastReceiver f105966d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f105968a = new b(0);
    }

    /* JADX INFO: renamed from: com.umeng.pagesdk.b$b, reason: collision with other inner class name */
    public interface InterfaceC1053b {
        void a(com.umeng.pagesdk.a aVar);
    }

    private b() {
        this.f105966d = new BroadcastReceiver() { // from class: com.umeng.pagesdk.b.1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                try {
                    if (intent.getAction().equals("android.intent.action.BATTERY_CHANGED")) {
                        int i10 = 0;
                        int intExtra = intent.getIntExtra("level", 0);
                        int intExtra2 = intent.getIntExtra("voltage", 0);
                        int intExtra3 = intent.getIntExtra("temperature", 0);
                        int intExtra4 = intent.getIntExtra("status", 0);
                        int i11 = -1;
                        if (intExtra4 != 1) {
                            if (intExtra4 == 2) {
                                i11 = 1;
                            } else if (intExtra4 == 4) {
                                i11 = 0;
                            } else if (intExtra4 == 5) {
                                i11 = 2;
                            }
                        }
                        int intExtra5 = intent.getIntExtra("plugged", 0);
                        if (intExtra5 == 1) {
                            i10 = 1;
                        } else if (intExtra5 == 2) {
                            i10 = 2;
                        }
                        com.umeng.pagesdk.a aVar = new com.umeng.pagesdk.a();
                        aVar.f105957a = intExtra;
                        aVar.f105958b = intExtra2;
                        aVar.f105960d = i11;
                        aVar.f105959c = intExtra3;
                        aVar.f105961e = i10;
                        aVar.f105962f = System.currentTimeMillis();
                        if (b.this.f105965c != null) {
                            b.this.f105965c.a(aVar);
                        }
                        b.this.b();
                    }
                } catch (Throwable unused) {
                }
            }
        };
    }

    /* synthetic */ b(byte b10) {
        this();
    }

    public static b a(Context context) {
        if (f105964b == null && context != null) {
            f105964b = context.getApplicationContext();
        }
        return a.f105968a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b() {
        try {
            f105964b.unregisterReceiver(this.f105966d);
            f105963a = false;
        } catch (Throwable unused) {
        }
    }

    public final synchronized com.umeng.pagesdk.a a() {
        com.umeng.pagesdk.a aVar;
        com.umeng.pagesdk.a aVar2 = null;
        try {
            Intent intentRegisterReceiver = f105964b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int i10 = 0;
            int intExtra = intentRegisterReceiver.getIntExtra("level", 0);
            int intExtra2 = intentRegisterReceiver.getIntExtra("voltage", 0);
            int intExtra3 = intentRegisterReceiver.getIntExtra("temperature", 0);
            int intExtra4 = intentRegisterReceiver.getIntExtra("status", 0);
            int i11 = -1;
            if (intExtra4 != 1) {
                if (intExtra4 == 2) {
                    i11 = 1;
                } else if (intExtra4 == 4) {
                    i11 = 0;
                } else if (intExtra4 == 5) {
                    i11 = 2;
                }
            }
            int intExtra5 = intentRegisterReceiver.getIntExtra("plugged", 0);
            if (intExtra5 == 1) {
                i10 = 1;
            } else if (intExtra5 == 2) {
                i10 = 2;
            }
            aVar = new com.umeng.pagesdk.a();
            try {
                aVar.f105957a = intExtra;
                aVar.f105958b = intExtra2;
                aVar.f105960d = i11;
                aVar.f105959c = intExtra3;
                aVar.f105961e = i10;
                aVar.f105962f = System.currentTimeMillis();
            } catch (Throwable unused) {
                aVar2 = aVar;
                aVar = aVar2;
            }
        } catch (Throwable unused2) {
        }
        return aVar;
    }

    public final synchronized void a(InterfaceC1053b interfaceC1053b) {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            f105964b.registerReceiver(this.f105966d, intentFilter);
            f105963a = true;
            this.f105965c = interfaceC1053b;
        } catch (Throwable unused) {
        }
    }
}
