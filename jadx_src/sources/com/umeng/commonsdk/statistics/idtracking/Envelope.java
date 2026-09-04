package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.analytics.pro.al;
import com.umeng.analytics.pro.bc;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class Envelope {
    private static final String dummyID1 = "1234567890987654321";
    private static final String dummyID2 = "02:00:00:00:00:00";
    private byte[] identity;
    private String mAddress;
    private byte[] mEntity;
    private int mLength;
    private int mTimestamp;
    private final byte[] SEED = {0, 0, 0, 0, 0, 0, 0, 0};
    private final int CODEX_ENCRYPT = 1;
    private final int CODEX_NORMAL = 0;
    private String mVersion = "1.0";
    private byte[] mSignature = null;
    private byte[] mGuid = null;
    private byte[] mChecksum = null;
    private int mSerialNo = 0;
    private boolean encrypt = false;

    private Envelope(byte[] bArr, String str, byte[] bArr2) throws Exception {
        this.mAddress = null;
        this.mTimestamp = 0;
        this.mLength = 0;
        this.mEntity = null;
        this.identity = null;
        if (bArr == null || bArr.length == 0) {
            throw new Exception("entity is null or empty");
        }
        this.mAddress = str;
        this.mLength = bArr.length;
        this.mEntity = com.umeng.commonsdk.statistics.common.b.a(bArr);
        this.mTimestamp = (int) (System.currentTimeMillis() / 1000);
        this.identity = bArr2;
    }

    private byte[] genCheckSum() {
        return DataHelper.hash((DataHelper.toHexString(this.mSignature) + this.mSerialNo + this.mTimestamp + this.mLength + DataHelper.toHexString(this.mGuid)).getBytes());
    }

    public static Envelope genEncryptEnvelope(Context context, String str, byte[] bArr) {
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            String string = sharedPreferences.getString("signature", null);
            int i10 = sharedPreferences.getInt("serial", 1);
            Envelope envelope = new Envelope(bArr, str, "123456789098765432102:00:00:00:00:00".getBytes());
            envelope.setEncrypt(true);
            envelope.setSignature(string);
            envelope.setSerialNumber(i10);
            envelope.seal();
            sharedPreferences.edit().putInt("serial", i10 + 1).putString("signature", envelope.getSignature()).commit();
            envelope.export(context);
            return envelope;
        } catch (Exception e10) {
            UMCrashManager.reportCrash(context, e10);
            return null;
        }
    }

    public static Envelope genEnvelope(Context context, String str, byte[] bArr) {
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            String string = sharedPreferences.getString("signature", null);
            int i10 = sharedPreferences.getInt("serial", 1);
            Envelope envelope = new Envelope(bArr, str, "123456789098765432102:00:00:00:00:00".getBytes());
            envelope.setSignature(string);
            envelope.setSerialNumber(i10);
            envelope.seal();
            sharedPreferences.edit().putInt("serial", i10 + 1).putString("signature", envelope.getSignature()).commit();
            envelope.export(context);
            return envelope;
        } catch (Exception e10) {
            UMCrashManager.reportCrash(context, e10);
            return null;
        }
    }

    private byte[] genGuid(byte[] bArr, int i10) {
        byte[] bArrHash = DataHelper.hash(this.identity);
        byte[] bArrHash2 = DataHelper.hash(this.mEntity);
        int length = bArrHash.length;
        int i11 = length * 2;
        byte[] bArr2 = new byte[i11];
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = i12 * 2;
            bArr2[i13] = bArrHash2[i12];
            bArr2[i13 + 1] = bArrHash[i12];
        }
        for (int i14 = 0; i14 < 2; i14++) {
            bArr2[i14] = bArr[i14];
            bArr2[(i11 - i14) - 1] = bArr[(bArr.length - i14) - 1];
        }
        byte[] bArr3 = {(byte) (i10 & 255), (byte) ((i10 >> 8) & 255), (byte) ((i10 >> 16) & 255), (byte) (i10 >>> 24)};
        for (int i15 = 0; i15 < i11; i15++) {
            bArr2[i15] = (byte) (bArr2[i15] ^ bArr3[i15 % 4]);
        }
        return bArr2;
    }

    private byte[] genSignature() {
        return genGuid(this.SEED, (int) (System.currentTimeMillis() / 1000));
    }

    public static String getSignature(Context context) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getString("signature", null);
    }

    public void export(Context context) {
        String str = this.mAddress;
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(context, "umid", null);
        String hexString = DataHelper.toHexString(this.mSignature);
        byte[] bArr = new byte[16];
        System.arraycopy(this.mSignature, 2, bArr, 0, 16);
        String hexString2 = DataHelper.toHexString(DataHelper.hash(bArr));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appkey", str);
            if (strImprintProperty != null) {
                jSONObject.put("umid", strImprintProperty);
            }
            jSONObject.put("signature", hexString);
            jSONObject.put("checksum", hexString2);
            File file = new File(context.getFilesDir(), ".umeng");
            if (!file.exists()) {
                file.mkdir();
            }
            HelperUtils.writeFile(new File(file, "exchangeIdentity.json"), jSONObject.toString());
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("appkey", str);
            jSONObject2.put("channel", UMUtils.getChannel(context));
            if (strImprintProperty != null) {
                jSONObject2.put("umid", HelperUtils.getUmengMD5(strImprintProperty));
            }
            HelperUtils.writeFile(new File(context.getFilesDir(), "exid.dat"), jSONObject2.toString());
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
    }

    public String getSignature() {
        return DataHelper.toHexString(this.mSignature);
    }

    public void seal() {
        if (this.mSignature == null) {
            this.mSignature = genSignature();
        }
        if (this.encrypt) {
            byte[] bArr = new byte[16];
            try {
                System.arraycopy(this.mSignature, 1, bArr, 0, 16);
                this.mEntity = DataHelper.encrypt(this.mEntity, bArr);
            } catch (Exception unused) {
            }
        }
        this.mGuid = genGuid(this.mSignature, this.mTimestamp);
        this.mChecksum = genCheckSum();
    }

    public void setEncrypt(boolean z10) {
        this.encrypt = z10;
    }

    public void setSerialNumber(int i10) {
        this.mSerialNo = i10;
    }

    public void setSignature(String str) {
        this.mSignature = DataHelper.reverseHexString(str);
    }

    public byte[] toBinary() {
        al alVar = new al();
        alVar.a(this.mVersion);
        alVar.b(this.mAddress);
        alVar.c(DataHelper.toHexString(this.mSignature));
        alVar.a(this.mSerialNo);
        alVar.b(this.mTimestamp);
        alVar.c(this.mLength);
        alVar.a(this.mEntity);
        alVar.d(this.encrypt ? 1 : 0);
        alVar.d(DataHelper.toHexString(this.mGuid));
        alVar.e(DataHelper.toHexString(this.mChecksum));
        try {
            return new bc().a(alVar);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public String toString() {
        return String.format("version : %s\n", this.mVersion) + String.format("address : %s\n", this.mAddress) + String.format("signature : %s\n", DataHelper.toHexString(this.mSignature)) + String.format("serial : %s\n", Integer.valueOf(this.mSerialNo)) + String.format("timestamp : %d\n", Integer.valueOf(this.mTimestamp)) + String.format("length : %d\n", Integer.valueOf(this.mLength)) + String.format("guid : %s\n", DataHelper.toHexString(this.mGuid)) + String.format("checksum : %s ", DataHelper.toHexString(this.mChecksum)) + String.format("codex : %d", Integer.valueOf(this.encrypt ? 1 : 0));
    }
}
