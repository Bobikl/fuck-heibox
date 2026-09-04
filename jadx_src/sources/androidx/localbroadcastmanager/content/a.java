package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.n0;
import com.max.xiaoheihe.module.game.pubg.PUBGFriendRankActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import z5.g;

/* JADX INFO: compiled from: LocalBroadcastManager.java */
/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f24375f = "LocalBroadcastManager";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f24376g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f24377h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f24378i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static a f24379j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<BroadcastReceiver, ArrayList<c>> f24381b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, ArrayList<c>> f24382c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList<b> f24383d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f24384e;

    /* JADX INFO: renamed from: androidx.localbroadcastmanager.content.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LocalBroadcastManager.java */
    public class HandlerC0182a extends Handler {
        HandlerC0182a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                a.this.a();
            }
        }
    }

    /* JADX INFO: compiled from: LocalBroadcastManager.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Intent f24386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ArrayList<c> f24387b;

        b(Intent intent, ArrayList<c> arrayList) {
            this.f24386a = intent;
            this.f24387b = arrayList;
        }
    }

    /* JADX INFO: compiled from: LocalBroadcastManager.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final IntentFilter f24388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final BroadcastReceiver f24389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f24390c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f24391d;

        c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f24388a = intentFilter;
            this.f24389b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Receiver{");
            sb2.append(this.f24389b);
            sb2.append(" filter=");
            sb2.append(this.f24388a);
            if (this.f24391d) {
                sb2.append(" DEAD");
            }
            sb2.append(g.f141884d);
            return sb2.toString();
        }
    }

    private a(Context context) {
        this.f24380a = context;
        this.f24384e = new HandlerC0182a(context.getMainLooper());
    }

    @n0
    public static a b(@n0 Context context) {
        a aVar;
        synchronized (f24378i) {
            if (f24379j == null) {
                f24379j = new a(context.getApplicationContext());
            }
            aVar = f24379j;
        }
        return aVar;
    }

    void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f24381b) {
                size = this.f24383d.size();
                if (size <= 0) {
                    return;
                }
                bVarArr = new b[size];
                this.f24383d.toArray(bVarArr);
                this.f24383d.clear();
            }
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = bVarArr[i10];
                int size2 = bVar.f24387b.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    c cVar = bVar.f24387b.get(i11);
                    if (!cVar.f24391d) {
                        cVar.f24389b.onReceive(this.f24380a, bVar.f24386a);
                    }
                }
            }
        }
    }

    public void c(@n0 BroadcastReceiver broadcastReceiver, @n0 IntentFilter intentFilter) {
        synchronized (this.f24381b) {
            c cVar = new c(intentFilter, broadcastReceiver);
            ArrayList<c> arrayList = this.f24381b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f24381b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                String action = intentFilter.getAction(i10);
                ArrayList<c> arrayList2 = this.f24382c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f24382c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    public boolean d(@n0 Intent intent) {
        int i10;
        String str;
        ArrayList arrayList;
        ArrayList<c> arrayList2;
        String str2;
        String str3;
        synchronized (this.f24381b) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f24380a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z10 = (intent.getFlags() & 8) != 0;
            if (z10) {
                Log.v(f24375f, "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<c> arrayList3 = this.f24382c.get(intent.getAction());
            if (arrayList3 != null) {
                if (z10) {
                    Log.v(f24375f, "Action list: " + arrayList3);
                }
                ArrayList arrayList4 = null;
                int i11 = 0;
                while (i11 < arrayList3.size()) {
                    c cVar = arrayList3.get(i11);
                    if (z10) {
                        Log.v(f24375f, "Matching against filter " + cVar.f24388a);
                    }
                    if (cVar.f24390c) {
                        if (z10) {
                            Log.v(f24375f, "  Filter's target already added");
                        }
                        i10 = i11;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = strResolveTypeIfNeeded;
                        arrayList = arrayList4;
                    } else {
                        i10 = i11;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = strResolveTypeIfNeeded;
                        int iMatch = cVar.f24388a.match(action, strResolveTypeIfNeeded, scheme, data, categories, f24375f);
                        if (iMatch >= 0) {
                            if (z10) {
                                Log.v(f24375f, "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(cVar);
                            cVar.f24390c = true;
                        } else if (z10) {
                            if (iMatch == -4) {
                                str3 = PUBGFriendRankActivity.Y;
                            } else if (iMatch == -3) {
                                str3 = "action";
                            } else if (iMatch != -2) {
                                str3 = iMatch != -1 ? "unknown reason" : "type";
                            } else {
                                str3 = "data";
                            }
                            Log.v(f24375f, "  Filter did not match: " + str3);
                        }
                        i11 = i10 + 1;
                        action = str;
                        arrayList3 = arrayList2;
                        strResolveTypeIfNeeded = str2;
                    }
                    arrayList4 = arrayList;
                    i11 = i10 + 1;
                    action = str;
                    arrayList3 = arrayList2;
                    strResolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int i12 = 0; i12 < arrayList5.size(); i12++) {
                        ((c) arrayList5.get(i12)).f24390c = false;
                    }
                    this.f24383d.add(new b(intent, arrayList5));
                    if (!this.f24384e.hasMessages(1)) {
                        this.f24384e.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public void e(@n0 Intent intent) {
        if (d(intent)) {
            a();
        }
    }

    public void f(@n0 BroadcastReceiver broadcastReceiver) {
        synchronized (this.f24381b) {
            ArrayList<c> arrayListRemove = this.f24381b.remove(broadcastReceiver);
            if (arrayListRemove == null) {
                return;
            }
            for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                c cVar = arrayListRemove.get(size);
                cVar.f24391d = true;
                for (int i10 = 0; i10 < cVar.f24388a.countActions(); i10++) {
                    String action = cVar.f24388a.getAction(i10);
                    ArrayList<c> arrayList = this.f24382c.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            c cVar2 = arrayList.get(size2);
                            if (cVar2.f24389b == broadcastReceiver) {
                                cVar2.f24391d = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.f24382c.remove(action);
                        }
                    }
                }
            }
        }
    }
}
