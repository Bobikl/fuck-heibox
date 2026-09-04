package com.tencent.liteav.videobase.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.max.xiaoheihe.module.game.pubg.PUBGFriendRankActivity;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.util.LiteavLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f100418f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static c f100419g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f100420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<BroadcastReceiver, ArrayList<b>> f100421b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, ArrayList<b>> f100422c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ArrayList<a> f100423d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f100424e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Intent f100426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ArrayList<b> f100427b;

        a(Intent intent, ArrayList<b> arrayList) {
            this.f100426a = intent;
            this.f100427b = arrayList;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IntentFilter f100428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BroadcastReceiver f100429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f100430c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f100431d;

        b(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f100428a = intentFilter;
            this.f100429b = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Receiver{");
            sb2.append(this.f100429b);
            sb2.append(" filter=");
            sb2.append(this.f100428a);
            if (this.f100431d) {
                sb2.append(" DEAD");
            }
            sb2.append(z5.g.f141884d);
            return sb2.toString();
        }
    }

    private c(Context context) {
        this.f100420a = context;
        this.f100424e = new Handler(context.getMainLooper()) { // from class: com.tencent.liteav.videobase.utils.c.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                int size;
                a[] aVarArr;
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                c cVar = c.this;
                while (true) {
                    synchronized (cVar.f100421b) {
                        size = cVar.f100423d.size();
                        if (size <= 0) {
                            return;
                        }
                        aVarArr = new a[size];
                        cVar.f100423d.toArray(aVarArr);
                        cVar.f100423d.clear();
                    }
                    for (int i10 = 0; i10 < size; i10++) {
                        a aVar = aVarArr[i10];
                        int size2 = aVar.f100427b.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            b bVar = aVar.f100427b.get(i11);
                            if (!bVar.f100431d) {
                                bVar.f100429b.onReceive(cVar.f100420a, aVar.f100426a);
                            }
                        }
                    }
                }
            }
        };
    }

    public static c a() {
        c cVar;
        synchronized (f100418f) {
            if (f100419g == null) {
                f100419g = new c(ContextUtils.getApplicationContext());
            }
            cVar = f100419g;
        }
        return cVar;
    }

    public final void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f100421b) {
            b bVar = new b(intentFilter, broadcastReceiver);
            ArrayList<b> arrayList = this.f100421b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f100421b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(bVar);
            for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                String action = intentFilter.getAction(i10);
                ArrayList<b> arrayList2 = this.f100422c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f100422c.put(action, arrayList2);
                }
                arrayList2.add(bVar);
            }
        }
    }

    public final boolean a(Intent intent) {
        int i10;
        String str;
        ArrayList arrayList;
        ArrayList<b> arrayList2;
        String str2;
        String str3;
        synchronized (this.f100421b) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f100420a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z10 = (intent.getFlags() & 8) != 0;
            if (z10) {
                LiteavLog.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<b> arrayList3 = this.f100422c.get(intent.getAction());
            if (arrayList3 != null) {
                if (z10) {
                    LiteavLog.v("LocalBroadcastManager", "Action list: ".concat(String.valueOf(arrayList3)));
                }
                ArrayList arrayList4 = null;
                int i11 = 0;
                while (i11 < arrayList3.size()) {
                    b bVar = arrayList3.get(i11);
                    if (z10) {
                        LiteavLog.v("LocalBroadcastManager", "Matching against filter " + bVar.f100428a);
                    }
                    if (bVar.f100430c) {
                        if (z10) {
                            LiteavLog.v("LocalBroadcastManager", "  Filter's target already added");
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
                        int iMatch = bVar.f100428a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (iMatch >= 0) {
                            if (z10) {
                                LiteavLog.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(bVar);
                            bVar.f100430c = true;
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
                            LiteavLog.v("LocalBroadcastManager", "  Filter did not match: ".concat(str3));
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
                        ((b) arrayList5.get(i12)).f100430c = false;
                    }
                    this.f100423d.add(new a(intent, arrayList5));
                    if (!this.f100424e.hasMessages(1)) {
                        this.f100424e.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
