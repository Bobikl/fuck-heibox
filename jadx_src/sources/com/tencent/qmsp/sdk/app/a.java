package com.tencent.qmsp.sdk.app;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.qmsp.sdk.base.IVendorCallback;
import com.tencent.qmsp.sdk.c.f;
import com.tencent.qmsp.sdk.c.i;
import com.tencent.qmsp.sdk.f.g;
import com.tencent.qmsp.sdk.f.h;
import com.tencent.qmsp.sdk.u.U;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    private static boolean isLogin = false;
    private static String mAppID;
    private static Context mContext;
    private static String mDevID;
    private static String mOAID;
    private static String mQImeiVer;
    private static String mUid;
    private static volatile AtomicInteger atomCbTimeout = new AtomicInteger(i.f101805a);
    private static volatile AtomicInteger atomConnTimeOut = new AtomicInteger(i.f101806b);
    private static volatile AtomicInteger atomReadTimeOut = new AtomicInteger(i.f101807c);
    private static volatile AtomicInteger atomUpdateInterval = new AtomicInteger(i.f101808d);
    private static byte[] LOGTag = {com.google.common.base.a.f56671x, 96, -3, 98, 31, 8};
    private static byte[] Txt1 = {com.google.common.base.a.A, 117, -93, 69, 47, 47, 114, -7, 101, 121, -67, 73, 58, 122};
    private static boolean isTaskRuning = false;

    /* JADX INFO: renamed from: com.tencent.qmsp.sdk.app.a$a, reason: collision with other inner class name */
    public static final class C0989a implements IVendorCallback {
        C0989a() {
        }

        @Override // com.tencent.qmsp.sdk.base.IVendorCallback
        public void onResult(boolean z10, String str, String str2) {
            String unused = a.mOAID = str2;
        }
    }

    a() {
    }

    private static int checkParam(Context context, String str, String str2, String str3, String str4) {
        if (context != null && str != null && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            return 0;
        }
        g.a(h.a(LOGTag), 0, h.a(h.f101942a));
        return -1;
    }

    public static String getAppID() {
        return mAppID;
    }

    public static AtomicInteger getAtomCbTimeout() {
        return atomCbTimeout;
    }

    public static AtomicInteger getAtomConnTimeOut() {
        return atomConnTimeOut;
    }

    public static AtomicInteger getAtomReadTimeOut() {
        return atomReadTimeOut;
    }

    public static AtomicInteger getAtomUpdateInterval() {
        return atomUpdateInterval;
    }

    public static Context getContext() {
        return mContext;
    }

    public static String getDevId() {
        return mDevID;
    }

    public static String getQImeiVer() {
        return mQImeiVer;
    }

    public static boolean getTaskStatus() {
        return isTaskRuning & isLogin;
    }

    public static String getUid() {
        return mUid;
    }

    public static String getmOAID() {
        if (mOAID == null) {
            mOAID = U.getOAIDSync(mContext);
        }
        return mOAID;
    }

    private static void init(Context context, String str, String str2, String str3, String str4) {
        mContext = context;
        mUid = str;
        mDevID = str2;
        mAppID = str3;
        mQImeiVer = str4;
        init_oaid(context);
    }

    public static void init_oaid(Context context) {
        try {
            U.init_o(context, true, false);
            U.getOAID(new C0989a());
            if (mOAID == null) {
                mOAID = U.getOAIDSync(context);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    protected static int login(Context context, String str, String str2, String str3, String str4) {
        try {
            if (checkParam(context, str, str2, str3, str4) != 0) {
                return 1;
            }
            if (isLogin) {
                g.d(h.a(LOGTag), 0, h.a(Txt1));
                return 2;
            }
            setTaskStatus(true);
            init(context, str, str2, str3, str4);
            com.tencent.qmsp.sdk.b.g.b().a();
            f.i().f();
            com.tencent.qmsp.sdk.a.a.a(2, 4);
            return 0;
        } catch (Exception e10) {
            com.tencent.qmsp.sdk.a.a.a(2, 5);
            logout();
            e10.printStackTrace();
            return 3;
        }
    }

    protected static int login(Context context, String str, String str2, String str3, String str4, com.tencent.qmsp.sdk.b.f fVar) {
        try {
            if (checkParam(context, str, str2, str3, str4) != 0) {
                return 1;
            }
            if (isLogin) {
                g.d(h.a(LOGTag), 0, h.a(Txt1));
                return 2;
            }
            setTaskStatus(true);
            init(context, str, str2, str3, str4);
            com.tencent.qmsp.sdk.b.g.b().a(fVar);
            f.i().f();
            com.tencent.qmsp.sdk.a.a.a(2, 4);
            return 0;
        } catch (Exception e10) {
            com.tencent.qmsp.sdk.a.a.a(2, 5);
            logout();
            e10.printStackTrace();
            return 3;
        }
    }

    protected static void logout() {
        try {
            setTaskStatus(false);
            b.e().d();
            f.i().a();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static void reset() {
        mContext = null;
        mUid = null;
        mDevID = null;
        mAppID = null;
        isLogin = false;
        mQImeiVer = null;
        mOAID = null;
    }

    private static void setTaskStatus(boolean z10) {
        isTaskRuning = z10;
        isLogin = z10;
    }

    public static void setmUid(String str) {
        mUid = str;
    }
}
