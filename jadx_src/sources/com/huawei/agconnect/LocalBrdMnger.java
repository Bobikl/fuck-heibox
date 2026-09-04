package com.huawei.agconnect;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import z5.g;

/* JADX INFO: loaded from: classes7.dex */
public class LocalBrdMnger {
    private static final int MSG_EXEC_PENDING_BROADCASTS = 1;
    private static final Object M_LOCK = new Object();
    private static LocalBrdMnger mInstance;
    private final Context mAppContext;
    private final Handler mHandler;
    private final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> mReceivers = new HashMap<>();
    private final HashMap<String, ArrayList<ReceiverRecord>> mActions = new HashMap<>();
    private final ArrayList<BroadcastRecord> mPendingBroadcasts = new ArrayList<>();

    public static class BroadcastRecord {
        final Intent intent;
        final ArrayList<ReceiverRecord> receivers;

        BroadcastRecord(Intent intent, ArrayList<ReceiverRecord> arrayList) {
            this.intent = intent;
            this.receivers = arrayList;
        }
    }

    public static class ReceiverRecord {
        boolean broadcasting;
        final IntentFilter filter;
        final BroadcastReceiver receiver;

        ReceiverRecord(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.filter = intentFilter;
            this.receiver = broadcastReceiver;
        }

        public String toString() {
            return "Receiver{" + this.receiver + " filter=" + this.filter + g.f141884d;
        }
    }

    private LocalBrdMnger(Context context) {
        this.mAppContext = context;
        this.mHandler = new Handler(context.getMainLooper()) { // from class: com.huawei.agconnect.LocalBrdMnger.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 1) {
                    LocalBrdMnger.this.executePendingBroadcasts();
                } else {
                    super.handleMessage(message);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executePendingBroadcasts() {
        int size;
        BroadcastRecord[] broadcastRecordArr;
        while (true) {
            synchronized (this.mReceivers) {
                size = this.mPendingBroadcasts.size();
                if (size <= 0) {
                    return;
                }
                broadcastRecordArr = new BroadcastRecord[size];
                this.mPendingBroadcasts.toArray(broadcastRecordArr);
                this.mPendingBroadcasts.clear();
            }
            for (int i10 = 0; i10 < size; i10++) {
                BroadcastRecord broadcastRecord = broadcastRecordArr[i10];
                for (int i11 = 0; i11 < broadcastRecord.receivers.size(); i11++) {
                    broadcastRecord.receivers.get(i11).receiver.onReceive(this.mAppContext, broadcastRecord.intent);
                }
            }
        }
    }

    public static LocalBrdMnger getInstance(Context context) {
        LocalBrdMnger localBrdMnger;
        synchronized (M_LOCK) {
            if (mInstance == null) {
                mInstance = new LocalBrdMnger(context.getApplicationContext());
            }
            localBrdMnger = mInstance;
        }
        return localBrdMnger;
    }

    public void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.mReceivers) {
            ReceiverRecord receiverRecord = new ReceiverRecord(intentFilter, broadcastReceiver);
            ArrayList<IntentFilter> arrayList = this.mReceivers.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.mReceivers.put(broadcastReceiver, arrayList);
            }
            arrayList.add(intentFilter);
            for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                String action = intentFilter.getAction(i10);
                ArrayList<ReceiverRecord> arrayList2 = this.mActions.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.mActions.put(action, arrayList2);
                }
                arrayList2.add(receiverRecord);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    public boolean sendBroadcast(Intent intent) {
        boolean z10;
        String str;
        String str2;
        int i10;
        ArrayList arrayList;
        Uri uri;
        boolean z11;
        synchronized (this.mReceivers) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.mAppContext.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            ArrayList<ReceiverRecord> arrayList2 = this.mActions.get(intent.getAction());
            boolean z12 = false;
            if (arrayList2 != null) {
                ArrayList arrayList3 = null;
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    ReceiverRecord receiverRecord = arrayList2.get(i11);
                    if (receiverRecord.broadcasting) {
                        i10 = i11;
                        str = action;
                        str2 = strResolveTypeIfNeeded;
                        uri = data;
                        arrayList = arrayList3;
                        z11 = z12;
                    } else {
                        str = action;
                        String str3 = strResolveTypeIfNeeded;
                        str2 = strResolveTypeIfNeeded;
                        i10 = i11;
                        Uri uri2 = data;
                        arrayList = arrayList3;
                        uri = data;
                        z11 = z12;
                        if (receiverRecord.filter.match(action, str3, scheme, uri2, categories, "LocalBroadcastManager") >= 0) {
                            arrayList3 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList3.add(receiverRecord);
                            receiverRecord.broadcasting = true;
                        }
                        i11 = i10 + 1;
                        z12 = z11;
                        action = str;
                        strResolveTypeIfNeeded = str2;
                        data = uri;
                    }
                    arrayList3 = arrayList;
                    i11 = i10 + 1;
                    z12 = z11;
                    action = str;
                    strResolveTypeIfNeeded = str2;
                    data = uri;
                }
                ?? r11 = arrayList3;
                z10 = z12;
                if (r11 != 0) {
                    for (?? r10 = z10; r10 < r11.size(); r10++) {
                        ((ReceiverRecord) r11.get(r10)).broadcasting = z10;
                    }
                    this.mPendingBroadcasts.add(new BroadcastRecord(intent, r11));
                    if (!this.mHandler.hasMessages(1)) {
                        this.mHandler.sendEmptyMessage(1);
                    }
                    return true;
                }
            } else {
                z10 = false;
            }
            return z10;
        }
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        synchronized (this.mReceivers) {
            ArrayList<IntentFilter> arrayListRemove = this.mReceivers.remove(broadcastReceiver);
            if (arrayListRemove == null) {
                return;
            }
            for (int i10 = 0; i10 < arrayListRemove.size(); i10++) {
                IntentFilter intentFilter = arrayListRemove.get(i10);
                for (int i11 = 0; i11 < intentFilter.countActions(); i11++) {
                    String action = intentFilter.getAction(i11);
                    ArrayList<ReceiverRecord> arrayList = this.mActions.get(action);
                    if (arrayList != null) {
                        int i12 = 0;
                        while (i12 < arrayList.size()) {
                            if (arrayList.get(i12).receiver == broadcastReceiver) {
                                arrayList.remove(i12);
                                i12--;
                            }
                            i12++;
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
