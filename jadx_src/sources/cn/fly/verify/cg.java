package cn.fly.verify;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public abstract class cg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f36018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final String f36019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36020c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f36021d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36022e = 0;

    public class a implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f36023a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final BlockingQueue<IBinder> f36025c;

        private a() {
            this.f36023a = false;
            this.f36025c = new LinkedBlockingQueue();
        }

        public IBinder a(long j10) throws InterruptedException {
            if (this.f36023a) {
                throw new IllegalStateException();
            }
            this.f36023a = true;
            BlockingQueue<IBinder> blockingQueue = this.f36025c;
            if (j10 <= 0) {
                j10 = 1500;
            }
            return blockingQueue.poll(j10, TimeUnit.MILLISECONDS);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f36025c.put(iBinder);
            } catch (Throwable unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f36026a;
    }

    public cg(Context context) {
        this.f36018a = context;
        this.f36019b = context.getPackageName();
    }

    private b a(Context context, Intent intent) throws Throwable {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new Throwable("unable to invoke in main thread!");
        }
        a aVar = new a();
        try {
            boolean zBindService = Build.VERSION.SDK_INT >= 34 ? context.bindService(intent, aVar, 513) : context.bindService(intent, aVar, 1);
            if (intent == null || !zBindService) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("bind service ");
                sb2.append(intent == null ? "null" : intent.getComponent());
                sb2.append(" failed!");
                throw new Throwable(sb2.toString());
            }
            long jC = c();
            es.a().a("wte " + jC, new Object[0]);
            IBinder iBinderA = aVar.a(c());
            if (iBinderA != null) {
                b bVarA = a(iBinderA);
                try {
                    context.unbindService(aVar);
                } catch (Throwable th2) {
                    es.a().a(th2);
                }
                return bVarA;
            }
            throw new Throwable("get binder " + intent.getComponent() + " failed!");
        } catch (Throwable th3) {
            try {
                context.unbindService(aVar);
            } catch (Throwable th4) {
                es.a().a(th4);
            }
            throw th3;
        }
    }

    private synchronized boolean a(Intent intent) {
        boolean z10;
        z10 = true;
        this.f36022e++;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            b bVarB = b();
            if (bVarB == null) {
                bVarB = a(this.f36018a, intent);
            }
            if (bVarB != null) {
                this.f36021d = bVarB.f36026a;
            } else {
                z10 = false;
            }
        } catch (Throwable th2) {
            es.a().a(th2);
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        es.a().a("oa use time: " + jElapsedRealtime2, new Object[0]);
        return z10;
    }

    private synchronized void e() {
        if (this.f36020c) {
            return;
        }
        if (a(a()) || this.f36022e >= 4) {
            this.f36020c = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004d A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:15:0x0048, B:17:0x004d), top: B:29:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005b A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #5 {all -> 0x005e, blocks: (B:22:0x0056, B:24:0x005b), top: B:35:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    protected int a(String str, IBinder iBinder, String str2, int i10) throws Throwable {
        Parcel parcelObtain;
        Parcel parcel;
        Parcel parcelObtain2 = null;
        try {
            parcelObtain = Parcel.obtain();
            try {
                parcelObtain2 = Parcel.obtain();
                parcelObtain.writeInterfaceToken(str2);
                iBinder.transact(i10, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                int i11 = parcelObtain2.readInt();
                try {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable unused) {
                }
                return i11;
            } catch (RemoteException unused2) {
                parcel = parcelObtain2;
                parcelObtain2 = parcelObtain;
                try {
                    es.a().a("getIntValue: " + str + " failed! (remoteException)", new Object[0]);
                    if (parcel != null) {
                        try {
                            parcel.recycle();
                            if (parcelObtain2 != null) {
                                parcelObtain2.recycle();
                            }
                        } catch (Throwable unused3) {
                            return 0;
                        }
                    } else if (parcelObtain2 != null) {
                        parcelObtain2.recycle();
                    }
                    return 0;
                } catch (Throwable th2) {
                    th = th2;
                    parcelObtain = parcelObtain2;
                    parcelObtain2 = parcel;
                    if (parcelObtain2 != null) {
                        try {
                            parcelObtain2.recycle();
                            if (parcelObtain != null) {
                                parcelObtain.recycle();
                            }
                        } catch (Throwable unused4) {
                            throw th;
                        }
                    } else if (parcelObtain != null) {
                        parcelObtain.recycle();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (parcelObtain2 != null) {
                    parcelObtain2.recycle();
                    if (parcelObtain != null) {
                        parcelObtain.recycle();
                    }
                } else if (parcelObtain != null) {
                    parcelObtain.recycle();
                }
                throw th;
            }
        } catch (RemoteException unused5) {
            parcel = null;
        } catch (Throwable th4) {
            th = th4;
            parcelObtain = null;
        }
    }

    protected Intent a() {
        return null;
    }

    protected b a(IBinder iBinder) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0064 A[Catch: all -> 0x0067, DONT_GENERATE, TRY_LEAVE, TryCatch #3 {all -> 0x0067, blocks: (B:23:0x005f, B:25:0x0064), top: B:42:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0070 A[Catch: all -> 0x0073, FINALLY_INSNS, TRY_LEAVE, TryCatch #1 {all -> 0x0073, blocks: (B:29:0x006b, B:31:0x0070), top: B:38:0x006b }] */
    protected String a(String str, IBinder iBinder, String str2, int i10, String... strArr) {
        Parcel parcelObtain;
        Parcel parcelObtain2;
        try {
            parcelObtain = Parcel.obtain();
            try {
                parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(str2);
                    if (strArr != null && strArr.length > 0) {
                        for (String str3 : strArr) {
                            parcelObtain.writeString(str3);
                        }
                    }
                    iBinder.transact(i10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    String string = parcelObtain2.readString();
                    try {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    } catch (Throwable unused) {
                    }
                    return string;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        es.a().a("getStringValue: " + str + " failed! " + th.getMessage(), new Object[0]);
                        if (parcelObtain2 != null) {
                            try {
                                parcelObtain2.recycle();
                                if (parcelObtain != null) {
                                }
                            } catch (Throwable unused2) {
                                return null;
                            }
                        } else if (parcelObtain != null) {
                        }
                        return null;
                    } finally {
                        if (parcelObtain2 != null) {
                            try {
                                parcelObtain2.recycle();
                                if (parcelObtain != null) {
                                    parcelObtain.recycle();
                                }
                            } catch (Throwable unused3) {
                            }
                        } else if (parcelObtain != null) {
                            parcelObtain.recycle();
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                parcelObtain2 = null;
            }
        } catch (Throwable th4) {
            th = th4;
            parcelObtain = null;
            parcelObtain2 = null;
        }
    }

    protected synchronized void a(String str) {
        if (str != null) {
            if (!Pattern.compile("^[0fF\\-]+").matcher(str).matches()) {
                this.f36021d = str;
            }
        }
    }

    protected b b() {
        return null;
    }

    protected long c() {
        return ((((long) (this.f36022e - 1)) * 2) + 2) * 1000;
    }

    public synchronized String d() {
        e();
        return this.f36021d;
    }
}
