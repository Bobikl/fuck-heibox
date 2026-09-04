package com.tencent.ugc.videobase.utils;

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
import z5.g;

/* JADX INFO: loaded from: classes4.dex */
public final class LocalBroadcastManager {
    private static final boolean DEBUG = false;
    static final int MSG_EXEC_PENDING_BROADCASTS = 1;
    private static final String TAG = "LocalBroadcastManager";
    private static LocalBroadcastManager mInstance;
    private static final Object mLock = new Object();
    private final Context mAppContext;
    private final Handler mMainHandler;
    private final HashMap<BroadcastReceiver, ArrayList<b>> mReceivers = new HashMap<>();
    private final HashMap<String, ArrayList<b>> mActions = new HashMap<>();
    private final ArrayList<a> mPendingBroadcasts = new ArrayList<>();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Intent f103901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ArrayList<b> f103902b;

        a(Intent intent, ArrayList<b> arrayList) {
            this.f103901a = intent;
            this.f103902b = arrayList;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final IntentFilter f103903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final BroadcastReceiver f103904b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f103905c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f103906d;

        b(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f103903a = intentFilter;
            this.f103904b = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Receiver{");
            sb2.append(this.f103904b);
            sb2.append(" filter=");
            sb2.append(this.f103903a);
            if (this.f103906d) {
                sb2.append(" DEAD");
            }
            sb2.append(g.f141884d);
            return sb2.toString();
        }
    }

    private LocalBroadcastManager(Context context) {
        this.mAppContext = context;
        this.mMainHandler = new Handler(context.getMainLooper()) { // from class: com.tencent.ugc.videobase.utils.LocalBroadcastManager.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what == 1) {
                    LocalBroadcastManager.this.executePendingBroadcasts();
                } else {
                    super.handleMessage(message);
                }
            }
        };
    }

    public static LocalBroadcastManager getInstance() {
        LocalBroadcastManager localBroadcastManager;
        synchronized (mLock) {
            if (mInstance == null) {
                mInstance = new LocalBroadcastManager(ContextUtils.getApplicationContext());
            }
            localBroadcastManager = mInstance;
        }
        return localBroadcastManager;
    }

    final void executePendingBroadcasts() {
        int size;
        a[] aVarArr;
        while (true) {
            synchronized (this.mReceivers) {
                size = this.mPendingBroadcasts.size();
                if (size <= 0) {
                    return;
                }
                aVarArr = new a[size];
                this.mPendingBroadcasts.toArray(aVarArr);
                this.mPendingBroadcasts.clear();
            }
            for (int i10 = 0; i10 < size; i10++) {
                a aVar = aVarArr[i10];
                int size2 = aVar.f103902b.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    b bVar = aVar.f103902b.get(i11);
                    if (!bVar.f103906d) {
                        bVar.f103904b.onReceive(this.mAppContext, aVar.f103901a);
                    }
                }
            }
        }
    }

    public final void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.mReceivers) {
            b bVar = new b(intentFilter, broadcastReceiver);
            ArrayList<b> arrayList = this.mReceivers.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.mReceivers.put(broadcastReceiver, arrayList);
            }
            arrayList.add(bVar);
            for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                String action = intentFilter.getAction(i10);
                ArrayList<b> arrayList2 = this.mActions.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.mActions.put(action, arrayList2);
                }
                arrayList2.add(bVar);
            }
        }
    }

    public final boolean sendBroadcast(Intent intent) {
        int i10;
        String str;
        ArrayList arrayList;
        ArrayList<b> arrayList2;
        String str2;
        String str3;
        synchronized (this.mReceivers) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.mAppContext.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z10 = (intent.getFlags() & 8) != 0;
            if (z10) {
                LiteavLog.v(TAG, "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<b> arrayList3 = this.mActions.get(intent.getAction());
            if (arrayList3 != null) {
                if (z10) {
                    LiteavLog.v(TAG, "Action list: ".concat(String.valueOf(arrayList3)));
                }
                ArrayList arrayList4 = null;
                int i11 = 0;
                while (i11 < arrayList3.size()) {
                    b bVar = arrayList3.get(i11);
                    if (z10) {
                        LiteavLog.v(TAG, "Matching against filter " + bVar.f103903a);
                    }
                    if (bVar.f103905c) {
                        if (z10) {
                            LiteavLog.v(TAG, "  Filter's target already added");
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
                        int iMatch = bVar.f103903a.match(action, strResolveTypeIfNeeded, scheme, data, categories, TAG);
                        if (iMatch >= 0) {
                            if (z10) {
                                LiteavLog.v(TAG, "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(bVar);
                            bVar.f103905c = true;
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
                            LiteavLog.v(TAG, "  Filter did not match: ".concat(str3));
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
                        ((b) arrayList5.get(i12)).f103905c = false;
                    }
                    this.mPendingBroadcasts.add(new a(intent, arrayList5));
                    if (!this.mMainHandler.hasMessages(1)) {
                        this.mMainHandler.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public final void sendBroadcastSync(Intent intent) {
        if (sendBroadcast(intent)) {
            executePendingBroadcasts();
        }
    }

    public final void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        synchronized (this.mReceivers) {
            ArrayList<b> arrayListRemove = this.mReceivers.remove(broadcastReceiver);
            if (arrayListRemove == null) {
                return;
            }
            for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                b bVar = arrayListRemove.get(size);
                bVar.f103906d = true;
                for (int i10 = 0; i10 < bVar.f103903a.countActions(); i10++) {
                    String action = bVar.f103903a.getAction(i10);
                    ArrayList<b> arrayList = this.mActions.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            b bVar2 = arrayList.get(size2);
                            if (bVar2.f103904b == broadcastReceiver) {
                                bVar2.f103906d = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.mActions.remove(action);
                        }
                    }
                }
            }
        }
    }
}
