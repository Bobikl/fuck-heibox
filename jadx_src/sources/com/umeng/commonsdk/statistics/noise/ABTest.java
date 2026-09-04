package com.umeng.commonsdk.statistics.noise;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.idtracking.Envelope;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.d;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: loaded from: classes4.dex */
public class ABTest implements d {
    private static ABTest instance;
    private Context context;
    private boolean isInTest = false;
    private int mPolicy = -1;
    private int mInterval = -1;
    private int mGroup = -1;
    private float mProb13 = 0.0f;
    private float mProb07 = 0.0f;
    private String mPoli = null;

    private ABTest(Context context, String str, int i10) {
        this.context = context;
        onExperimentChanged(str, i10);
    }

    public static synchronized ABTest getService(Context context) {
        if (instance == null) {
            instance = new ABTest(context, UMEnvelopeBuild.imprintProperty(context, "client_test", null), Integer.valueOf(UMEnvelopeBuild.imprintProperty(context, "test_report_interval", "0")).intValue());
        }
        return instance;
    }

    private void parseFIXED(String str) {
        if (str == null) {
            return;
        }
        String[] strArrSplit = str.split("\\|");
        if (this.mProb13 > (strArrSplit[2].equals("SIG13") ? Float.valueOf(strArrSplit[3]).floatValue() : 0.0f)) {
            this.isInTest = false;
            return;
        }
        int iIntValue = strArrSplit[0].equals("FIXED") ? Integer.valueOf(strArrSplit[1]).intValue() : -1;
        int[] iArr = null;
        if (strArrSplit[4].equals("RPT")) {
            this.mPoli = "RPT";
            String[] strArrSplit2 = strArrSplit[5].split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            iArr = new int[strArrSplit2.length];
            for (int i10 = 0; i10 < strArrSplit2.length; i10++) {
                iArr[i10] = Integer.valueOf(strArrSplit2[i10]).intValue();
            }
        } else if (strArrSplit[4].equals("DOM")) {
            this.mPoli = "DOM";
            this.isInTest = true;
            try {
                String[] strArrSplit3 = strArrSplit[5].split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                iArr = new int[strArrSplit3.length];
                for (int i11 = 0; i11 < strArrSplit3.length; i11++) {
                    iArr[i11] = Integer.valueOf(strArrSplit3[i11]).intValue();
                }
            } catch (Exception unused) {
            }
        }
        if (iIntValue == -1) {
            this.isInTest = false;
            return;
        }
        this.isInTest = true;
        this.mGroup = iIntValue;
        if (iArr != null) {
            this.mPolicy = iArr[iIntValue - 1];
        }
    }

    private void parseSig7(String str) {
        float[] fArr;
        if (str == null) {
            return;
        }
        String[] strArrSplit = str.split("\\|");
        float f10 = 0.0f;
        if (this.mProb13 > (strArrSplit[2].equals("SIG13") ? Float.valueOf(strArrSplit[3]).floatValue() : 0.0f)) {
            this.isInTest = false;
            return;
        }
        int[] iArr = null;
        if (strArrSplit[0].equals("SIG7")) {
            String[] strArrSplit2 = strArrSplit[1].split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            fArr = new float[strArrSplit2.length];
            for (int i10 = 0; i10 < strArrSplit2.length; i10++) {
                fArr[i10] = Float.valueOf(strArrSplit2[i10]).floatValue();
            }
        } else {
            fArr = null;
        }
        if (strArrSplit[4].equals("RPT")) {
            this.mPoli = "RPT";
            String[] strArrSplit3 = strArrSplit[5].split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            iArr = new int[strArrSplit3.length];
            for (int i11 = 0; i11 < strArrSplit3.length; i11++) {
                iArr[i11] = Integer.valueOf(strArrSplit3[i11]).intValue();
            }
        } else if (strArrSplit[4].equals("DOM")) {
            this.isInTest = true;
            this.mPoli = "DOM";
            try {
                String[] strArrSplit4 = strArrSplit[5].split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                iArr = new int[strArrSplit4.length];
                for (int i12 = 0; i12 < strArrSplit4.length; i12++) {
                    iArr[i12] = Integer.valueOf(strArrSplit4[i12]).intValue();
                }
            } catch (Exception unused) {
            }
        }
        int i13 = 0;
        while (true) {
            if (i13 >= fArr.length) {
                i13 = -1;
                break;
            }
            f10 += fArr[i13];
            if (this.mProb07 < f10) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 == -1) {
            this.isInTest = false;
            return;
        }
        this.isInTest = true;
        this.mGroup = i13 + 1;
        if (iArr != null) {
            this.mPolicy = iArr[i13];
        }
    }

    private float prob(String str, int i10) {
        int i11 = i10 * 2;
        if (str == null) {
            return 0.0f;
        }
        return Integer.valueOf(str.substring(i11, i11 + 5), 16).intValue() / 1048576.0f;
    }

    public static boolean validate(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] strArrSplit = str.split("\\|");
        if (strArrSplit.length != 6) {
            return false;
        }
        if (strArrSplit[0].startsWith("SIG7") && strArrSplit[1].split(Constants.ACCEPT_TIME_SEPARATOR_SP).length == strArrSplit[5].split(Constants.ACCEPT_TIME_SEPARATOR_SP).length) {
            return true;
        }
        if (strArrSplit[0].startsWith("FIXED")) {
            int length = strArrSplit[5].split(Constants.ACCEPT_TIME_SEPARATOR_SP).length;
            int i10 = Integer.parseInt(strArrSplit[1]);
            if (length >= i10 && i10 >= 1) {
                return true;
            }
        }
        return false;
    }

    public int getGroup() {
        return this.mGroup;
    }

    public String getGroupInfo() {
        return !this.isInTest ? "error" : String.valueOf(this.mGroup);
    }

    public int getTestInterval() {
        return this.mInterval;
    }

    public String getTestName() {
        return this.mPoli;
    }

    public int getTestPolicy() {
        return this.mPolicy;
    }

    public boolean isInTest() {
        return this.isInTest;
    }

    public void onExperimentChanged(String str, int i10) {
        this.mInterval = i10;
        String signature = Envelope.getSignature(this.context);
        if (TextUtils.isEmpty(signature) || TextUtils.isEmpty(str)) {
            this.isInTest = false;
            return;
        }
        try {
            this.mProb13 = prob(signature, 12);
            this.mProb07 = prob(signature, 6);
            if (str.startsWith("SIG7")) {
                parseSig7(str);
            } else if (str.startsWith("FIXED")) {
                parseFIXED(str);
            }
        } catch (Exception e10) {
            this.isInTest = false;
            MLog.e("v:" + str, e10);
        }
    }

    @Override // com.umeng.commonsdk.statistics.internal.d
    public void onImprintChanged(ImprintHandler.a aVar) {
        onExperimentChanged(aVar.a("client_test", null), Integer.valueOf(aVar.a("test_report_interval", "0")).intValue());
    }

    public String toString() {
        return " p13:" + this.mProb13 + " p07:" + this.mProb07 + " policy:" + this.mPolicy + " interval:" + this.mInterval;
    }
}
