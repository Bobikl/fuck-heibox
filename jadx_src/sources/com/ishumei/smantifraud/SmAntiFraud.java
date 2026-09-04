package com.ishumei.smantifraud;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.ishumei.smantifraud.l1111l111111Il.l111l1111lIl;
import com.ishumei.smantifraud.l1111l111111Il.l111l11IlIlIl;
import com.ishumei.smantifraud.l1111l111111Il.l11l1111Il;
import com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l1111llIl;
import com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l111l11111Il;
import com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il;
import com.ishumei.smantifraud.l111l1111llIl.l111l11111lIl;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Random;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class SmAntiFraud {
    public static final String AREA_BJ = "bj";
    public static final String AREA_FJNY = "fjny";
    public static final String AREA_XJP = "xjp";
    public static final int SM_AF_ASYN_MODE = 1;
    public static final int SM_AF_SYN_MODE = 0;
    private static final String l1111l111111Il = "Smlog";
    private static IServerSmidCallback l111l11111lIl;
    public static SmOption option;

    public interface IDeviceIdCallback {
        void onResult(String str);
    }

    public interface IServerSmidCallback {
        void onError(int i10);

        void onSuccess(String str);
    }

    public static class SmOption {
        private static final int l1111l111111Il = 1024;
        private boolean l11l1111I11l;
        private Set<String> l11l1111Il1l;
        private boolean l11l1111Ill;
        private String l11l111l1Il;
        private byte[] l11l111l1lll;
        private boolean l111l11111lIl = false;
        private String l111l11111I1l = "";
        private String l111l11111Il = "";
        private boolean l111l1111l1Il = true;
        private boolean l111l1111llIl = true;
        private String l111l1111lI1l = null;
        private String l111l1111lIl = null;
        private String l11l1111lIIl = null;
        private boolean l11l1111I1l = false;
        private boolean l11l1111I1ll = false;
        private IServerSmidCallback l11l1111Il = null;
        private String l11l11IlIIll = "default";
        private String l11l111l11Il = null;
        private boolean l111l11IlIlIl = false;
        private String l11l111l1I1l = SmAntiFraud.AREA_BJ;

        private byte[] l111l11IlIlIl() {
            return this.l11l111l1lll;
        }

        private boolean l11l111l1I1l() {
            return this.l111l11111lIl;
        }

        private boolean l11l111l1Il() {
            return this.l11l1111Ill;
        }

        private boolean l11l111l1lll() {
            return this.l111l11IlIlIl;
        }

        public final String l1111l111111Il() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.l111l1111l1Il ? "1" : "0");
            sb2.append(this.l111l1111llIl ? "1" : "0");
            sb2.append(this.l11l1111I11l ? "1" : "0");
            sb2.append(this.l11l1111I1ll ? "1" : "0");
            sb2.append(SmAntiFraud.l111l11111lIl != null ? "1" : "0");
            Set<String> set = this.l11l1111Il1l;
            sb2.append((set == null || set.size() <= 0) ? "0" : "1");
            sb2.append(this.l111l11IlIlIl ? "1" : "0");
            return sb2.toString();
        }

        public final boolean l111l11111I1l() {
            return this.l11l1111I1ll;
        }

        public final String l111l11111Il() {
            return this.l11l111l11Il;
        }

        public final String l111l11111lIl() {
            return this.l11l111l1I1l;
        }

        public final IServerSmidCallback l111l1111l1Il() {
            return this.l11l1111Il;
        }

        public final boolean l111l1111lI1l() {
            return this.l11l1111I11l;
        }

        public final boolean l111l1111lIl() {
            return this.l11l1111I1l;
        }

        public final String l111l1111llIl() {
            return this.l11l1111lIIl;
        }

        public final boolean l11l1111I11l() {
            return this.l111l1111l1Il;
        }

        public final String l11l1111I1l() {
            return this.l111l11111I1l;
        }

        public final String l11l1111I1ll() {
            return this.l111l11111Il;
        }

        public final String l11l1111Il() {
            return this.l111l1111lI1l;
        }

        public final String l11l1111Il1l() {
            return this.l111l1111lIl;
        }

        public final Set<String> l11l1111Ill() {
            return this.l11l1111Il1l;
        }

        public final boolean l11l1111lIIl() {
            return this.l111l1111llIl;
        }

        public final String l11l111l11Il() {
            return this.l11l111l1Il;
        }

        public final String l11l11IlIIll() {
            return this.l11l11IlIIll;
        }

        public void setAppId(String str) {
            this.l11l11IlIIll = str;
        }

        public void setArea(String str) {
            this.l11l111l1I1l = str;
        }

        public void setChannel(String str) {
            this.l111l11111Il = str;
        }

        public void setCheckCrt(boolean z10) {
            this.l111l11IlIlIl = z10;
        }

        public void setCloudConf(boolean z10) {
            this.l111l1111llIl = z10;
        }

        public void setConfUrl(String str) {
            this.l11l1111lIIl = str;
        }

        public void setExtraInfo(String str) {
            if (str == null) {
                return;
            }
            if (str.length() > 1024) {
                this.l11l111l1Il = str.substring(0, 1024);
            } else {
                this.l11l111l1Il = str;
            }
        }

        public void setFirst(boolean z10) {
            this.l11l1111Ill = z10;
        }

        public void setHttpsCrt(byte[] bArr) {
            this.l11l111l1lll = bArr;
        }

        public void setNotCollect(Set<String> set) {
            this.l11l1111Il1l = set;
        }

        public void setOrganization(String str) {
            this.l111l11111I1l = str;
        }

        public void setPublicKey(String str) {
            this.l11l111l11Il = str;
        }

        public void setRetryUrl(String str) {
            this.l111l1111lIl = str;
        }

        public void setServerIdCallback(IServerSmidCallback iServerSmidCallback) {
            this.l11l1111Il = iServerSmidCallback;
        }

        public void setSynMode(boolean z10) {
            this.l111l11111lIl = z10;
        }

        public void setTransport(boolean z10) {
            this.l111l1111l1Il = z10;
        }

        public void setUrl(String str) {
            this.l111l1111lI1l = str;
        }

        public void setUsingHttps(boolean z10) {
            this.l11l1111I1ll = z10;
        }

        public void setUsingMD5(boolean z10) {
            this.l11l1111I11l = z10;
        }

        public void usingShortBoxData(boolean z10) {
            this.l11l1111I1l = z10;
        }
    }

    private SmAntiFraud() {
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0043 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x005d A[Catch: all -> 0x0012, Exception -> 0x01b3, TryCatch #1 {Exception -> 0x01b3, blocks: (B:24:0x0046, B:26:0x005d, B:29:0x006f, B:30:0x007b, B:31:0x0095, B:33:0x00a1, B:35:0x00b6, B:38:0x00c4, B:39:0x00d4, B:40:0x00d8, B:41:0x00df, B:43:0x00eb, B:44:0x00fe, B:55:0x0128, B:57:0x0139, B:58:0x0141, B:60:0x014f, B:62:0x0153, B:63:0x0164, B:65:0x016e, B:67:0x0176, B:69:0x017e, B:70:0x0197, B:72:0x019f, B:52:0x011d), top: B:83:0x0046, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x006f A[Catch: all -> 0x0012, Exception -> 0x01b3, LOOP:0: B:27:0x006c->B:29:0x006f, LOOP_END, TryCatch #1 {Exception -> 0x01b3, blocks: (B:24:0x0046, B:26:0x005d, B:29:0x006f, B:30:0x007b, B:31:0x0095, B:33:0x00a1, B:35:0x00b6, B:38:0x00c4, B:39:0x00d4, B:40:0x00d8, B:41:0x00df, B:43:0x00eb, B:44:0x00fe, B:55:0x0128, B:57:0x0139, B:58:0x0141, B:60:0x014f, B:62:0x0153, B:63:0x0164, B:65:0x016e, B:67:0x0176, B:69:0x017e, B:70:0x0197, B:72:0x019f, B:52:0x011d), top: B:83:0x0046, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a1 A[Catch: all -> 0x0012, Exception -> 0x01b3, TryCatch #1 {Exception -> 0x01b3, blocks: (B:24:0x0046, B:26:0x005d, B:29:0x006f, B:30:0x007b, B:31:0x0095, B:33:0x00a1, B:35:0x00b6, B:38:0x00c4, B:39:0x00d4, B:40:0x00d8, B:41:0x00df, B:43:0x00eb, B:44:0x00fe, B:55:0x0128, B:57:0x0139, B:58:0x0141, B:60:0x014f, B:62:0x0153, B:63:0x0164, B:65:0x016e, B:67:0x0176, B:69:0x017e, B:70:0x0197, B:72:0x019f, B:52:0x011d), top: B:83:0x0046, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c4 A[Catch: all -> 0x0012, Exception -> 0x01b3, TryCatch #1 {Exception -> 0x01b3, blocks: (B:24:0x0046, B:26:0x005d, B:29:0x006f, B:30:0x007b, B:31:0x0095, B:33:0x00a1, B:35:0x00b6, B:38:0x00c4, B:39:0x00d4, B:40:0x00d8, B:41:0x00df, B:43:0x00eb, B:44:0x00fe, B:55:0x0128, B:57:0x0139, B:58:0x0141, B:60:0x014f, B:62:0x0153, B:63:0x0164, B:65:0x016e, B:67:0x0176, B:69:0x017e, B:70:0x0197, B:72:0x019f, B:52:0x011d), top: B:83:0x0046, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d8 A[Catch: all -> 0x0012, Exception -> 0x01b3, TryCatch #1 {Exception -> 0x01b3, blocks: (B:24:0x0046, B:26:0x005d, B:29:0x006f, B:30:0x007b, B:31:0x0095, B:33:0x00a1, B:35:0x00b6, B:38:0x00c4, B:39:0x00d4, B:40:0x00d8, B:41:0x00df, B:43:0x00eb, B:44:0x00fe, B:55:0x0128, B:57:0x0139, B:58:0x0141, B:60:0x014f, B:62:0x0153, B:63:0x0164, B:65:0x016e, B:67:0x0176, B:69:0x017e, B:70:0x0197, B:72:0x019f, B:52:0x011d), top: B:83:0x0046, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00eb A[Catch: all -> 0x0012, Exception -> 0x01b3, TryCatch #1 {Exception -> 0x01b3, blocks: (B:24:0x0046, B:26:0x005d, B:29:0x006f, B:30:0x007b, B:31:0x0095, B:33:0x00a1, B:35:0x00b6, B:38:0x00c4, B:39:0x00d4, B:40:0x00d8, B:41:0x00df, B:43:0x00eb, B:44:0x00fe, B:55:0x0128, B:57:0x0139, B:58:0x0141, B:60:0x014f, B:62:0x0153, B:63:0x0164, B:65:0x016e, B:67:0x0176, B:69:0x017e, B:70:0x0197, B:72:0x019f, B:52:0x011d), top: B:83:0x0046, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0110  */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:50:0x011a  */
    /* JADX WARN: Code duplicated, block: B:51:0x011b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0122  */
    /* JADX WARN: Code duplicated, block: B:54:0x0125  */
    /* JADX WARN: Code duplicated, block: B:57:0x0139 A[Catch: all -> 0x0012, Exception -> 0x01b3, TryCatch #1 {Exception -> 0x01b3, blocks: (B:24:0x0046, B:26:0x005d, B:29:0x006f, B:30:0x007b, B:31:0x0095, B:33:0x00a1, B:35:0x00b6, B:38:0x00c4, B:39:0x00d4, B:40:0x00d8, B:41:0x00df, B:43:0x00eb, B:44:0x00fe, B:55:0x0128, B:57:0x0139, B:58:0x0141, B:60:0x014f, B:62:0x0153, B:63:0x0164, B:65:0x016e, B:67:0x0176, B:69:0x017e, B:70:0x0197, B:72:0x019f, B:52:0x011d), top: B:83:0x0046, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x014f A[Catch: all -> 0x0012, Exception -> 0x01b3, TryCatch #1 {Exception -> 0x01b3, blocks: (B:24:0x0046, B:26:0x005d, B:29:0x006f, B:30:0x007b, B:31:0x0095, B:33:0x00a1, B:35:0x00b6, B:38:0x00c4, B:39:0x00d4, B:40:0x00d8, B:41:0x00df, B:43:0x00eb, B:44:0x00fe, B:55:0x0128, B:57:0x0139, B:58:0x0141, B:60:0x014f, B:62:0x0153, B:63:0x0164, B:65:0x016e, B:67:0x0176, B:69:0x017e, B:70:0x0197, B:72:0x019f, B:52:0x011d), top: B:83:0x0046, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x016e A[Catch: all -> 0x0012, Exception -> 0x01b3, TryCatch #1 {Exception -> 0x01b3, blocks: (B:24:0x0046, B:26:0x005d, B:29:0x006f, B:30:0x007b, B:31:0x0095, B:33:0x00a1, B:35:0x00b6, B:38:0x00c4, B:39:0x00d4, B:40:0x00d8, B:41:0x00df, B:43:0x00eb, B:44:0x00fe, B:55:0x0128, B:57:0x0139, B:58:0x0141, B:60:0x014f, B:62:0x0153, B:63:0x0164, B:65:0x016e, B:67:0x0176, B:69:0x017e, B:70:0x0197, B:72:0x019f, B:52:0x011d), top: B:83:0x0046, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0176 A[Catch: all -> 0x0012, Exception -> 0x01b3, TryCatch #1 {Exception -> 0x01b3, blocks: (B:24:0x0046, B:26:0x005d, B:29:0x006f, B:30:0x007b, B:31:0x0095, B:33:0x00a1, B:35:0x00b6, B:38:0x00c4, B:39:0x00d4, B:40:0x00d8, B:41:0x00df, B:43:0x00eb, B:44:0x00fe, B:55:0x0128, B:57:0x0139, B:58:0x0141, B:60:0x014f, B:62:0x0153, B:63:0x0164, B:65:0x016e, B:67:0x0176, B:69:0x017e, B:70:0x0197, B:72:0x019f, B:52:0x011d), top: B:83:0x0046, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x019f A[Catch: all -> 0x0012, Exception -> 0x01b3, TRY_LEAVE, TryCatch #1 {Exception -> 0x01b3, blocks: (B:24:0x0046, B:26:0x005d, B:29:0x006f, B:30:0x007b, B:31:0x0095, B:33:0x00a1, B:35:0x00b6, B:38:0x00c4, B:39:0x00d4, B:40:0x00d8, B:41:0x00df, B:43:0x00eb, B:44:0x00fe, B:55:0x0128, B:57:0x0139, B:58:0x0141, B:60:0x014f, B:62:0x0153, B:63:0x0164, B:65:0x016e, B:67:0x0176, B:69:0x017e, B:70:0x0197, B:72:0x019f, B:52:0x011d), top: B:83:0x0046, outer: #0 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:21:0x0043, please report this as an issue */
    public static synchronized boolean create(Context context, SmOption smOption) {
        boolean z10;
        String str;
        String str2;
        int iHashCode;
        String str3;
        String strL111l11111Il;
        IServerSmidCallback iServerSmidCallback;
        SmOption smOption2;
        String strL11l1111Il;
        StringBuilder sb2;
        Random random;
        int i10;
        boolean z11 = true;
        try {
            if (context == null) {
                str = "context is null!";
                l111l11111lIl.l1111l111111Il = "context is null!";
                str2 = l1111l111111Il;
            } else if (smOption == null) {
                str = "SmOption is null!";
                l111l11111lIl.l1111l111111Il = "SmOption is null!";
                str2 = l1111l111111Il;
            } else {
                if (!TextUtils.isEmpty(smOption.l11l1111I1l())) {
                    if (TextUtils.isEmpty(smOption.l111l11111Il())) {
                        str = "SmOption.publicKey is null!";
                        l111l11111lIl.l1111l111111Il = "SmOption.publicKey is null!";
                        str2 = l1111l111111Il;
                    } else {
                        z10 = true;
                    }
                    if (!z10) {
                        return false;
                    }
                    try {
                        l111l11111lIl.l1111l111111Il = null;
                        l111l1111l1Il.l111l1111l1Il = false;
                        l111l1111l1Il.l1111l111111Il = context.getApplicationContext();
                        com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l1111l111111Il(context);
                        l111l1111l1Il.l111l11111I1l = System.currentTimeMillis();
                        if (l111l1111l1Il.l111l11111lIl == null) {
                            sb2 = new StringBuilder();
                            random = new Random(System.currentTimeMillis());
                            for (i10 = 0; i10 < 5; i10++) {
                                sb2.append(random.nextInt(10));
                            }
                            l111l1111l1Il.l111l11111lIl = System.currentTimeMillis() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + ((Object) sb2);
                        }
                        option = smOption;
                        if (TextUtils.isEmpty(smOption.l11l1111Il())) {
                            SmOption smOption3 = option;
                            smOption3.setUrl(l111l1111llIl.l1111l111111Il(smOption3.l111l11111lIl(), option.l111l11111I1l()));
                        } else {
                            z11 = false;
                        }
                        if (TextUtils.isEmpty(option.l11l1111Il1l())) {
                            if (z11) {
                                smOption2 = option;
                                strL11l1111Il = l111l1111llIl.l111l11111lIl(smOption2.l111l11111lIl(), option.l111l11111I1l());
                            } else {
                                smOption2 = option;
                                strL11l1111Il = smOption2.l11l1111Il();
                            }
                            smOption2.setRetryUrl(strL11l1111Il);
                        }
                        if (TextUtils.isEmpty(option.l111l1111llIl())) {
                            SmOption smOption4 = option;
                            smOption4.setConfUrl(l111l1111llIl.l111l11111I1l(smOption4.l111l11111lIl(), option.l11l1111I1ll));
                        }
                        l111l11111Il l111l11111ilL1111l111111Il = l111l11111Il.l1111l111111Il();
                        String strL111l11111lIl = option.l111l11111lIl();
                        iHashCode = strL111l11111lIl.hashCode();
                        if (iHashCode != 3144) {
                            str3 = AREA_BJ;
                        } else {
                            if (iHashCode != 118718) {
                                if (iHashCode != 3144079) {
                                    str3 = AREA_FJNY;
                                }
                                l111l11111ilL1111l111111Il.l1111l111111Il(option.l11l1111I1l());
                                if (option.l111l1111l1Il() != null) {
                                    l111l11111lIl = option.l111l1111l1Il();
                                }
                                strL111l11111Il = l111l11111Il.l1111l111111Il().l111l11111Il();
                                if (!TextUtils.isEmpty(strL111l11111Il) && (iServerSmidCallback = l111l11111lIl) != null) {
                                    iServerSmidCallback.onSuccess("B" + strL111l11111Il);
                                }
                                if (com.ishumei.smantifraud.l111l11111lIl.l111l11111Il.l1111l111111Il().l111l11111lIl()) {
                                    if (option.l11l1111I11l() && option.l11l1111lIIl()) {
                                        com.ishumei.smantifraud.l1111l111111Il.l111l1111l1Il.l1111l111111Il().l1111l111111Il(option.l111l1111llIl(), option.l11l1111Il1l(), option.l11l1111I1l());
                                    }
                                    if (option.l11l1111I11l()) {
                                        l111l1111lIl.l1111l111111Il().l1111l111111Il(option.l11l1111Il(), option.l11l1111Il1l());
                                    }
                                }
                                return TextUtils.isEmpty(l111l11111lIl.l1111l111111Il);
                            }
                            str3 = AREA_XJP;
                        }
                        strL111l11111lIl.equals(str3);
                        l111l11111ilL1111l111111Il.l1111l111111Il(option.l11l1111I1l());
                        if (option.l111l1111l1Il() != null) {
                            l111l11111lIl = option.l111l1111l1Il();
                        }
                        strL111l11111Il = l111l11111Il.l1111l111111Il().l111l11111Il();
                        if (!TextUtils.isEmpty(strL111l11111Il)) {
                            iServerSmidCallback.onSuccess("B" + strL111l11111Il);
                        }
                        if (com.ishumei.smantifraud.l111l11111lIl.l111l11111Il.l1111l111111Il().l111l11111lIl()) {
                            if (option.l11l1111I11l()) {
                                com.ishumei.smantifraud.l1111l111111Il.l111l1111l1Il.l1111l111111Il().l1111l111111Il(option.l111l1111llIl(), option.l11l1111Il1l(), option.l11l1111I1l());
                            }
                            if (option.l11l1111I11l()) {
                                l111l1111lIl.l1111l111111Il().l1111l111111Il(option.l11l1111Il(), option.l11l1111Il1l());
                            }
                        }
                    } catch (Exception e10) {
                        Log.e(l1111l111111Il, "smsdk init exception!", e10);
                        l111l11111lIl.l1111l111111Il = "smsdk init exception!;" + e10;
                    }
                    return TextUtils.isEmpty(l111l11111lIl.l1111l111111Il);
                }
                str = "SmOption.organization is null!";
                l111l11111lIl.l1111l111111Il = "SmOption.organization is null!";
                str2 = l1111l111111Il;
            }
            Log.e(str2, str);
            z10 = false;
            if (!z10) {
                return false;
            }
            l111l11111lIl.l1111l111111Il = null;
            l111l1111l1Il.l111l1111l1Il = false;
            l111l1111l1Il.l1111l111111Il = context.getApplicationContext();
            com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l1111l111111Il(context);
            l111l1111l1Il.l111l11111I1l = System.currentTimeMillis();
            if (l111l1111l1Il.l111l11111lIl == null) {
                sb2 = new StringBuilder();
                random = new Random(System.currentTimeMillis());
                while (i10 < 5) {
                    sb2.append(random.nextInt(10));
                }
                l111l1111l1Il.l111l11111lIl = System.currentTimeMillis() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + ((Object) sb2);
            }
            option = smOption;
            if (TextUtils.isEmpty(smOption.l11l1111Il())) {
                SmOption smOption5 = option;
                smOption5.setUrl(l111l1111llIl.l1111l111111Il(smOption5.l111l11111lIl(), option.l111l11111I1l()));
            } else {
                z11 = false;
            }
            if (TextUtils.isEmpty(option.l11l1111Il1l())) {
                if (z11) {
                    smOption2 = option;
                    strL11l1111Il = l111l1111llIl.l111l11111lIl(smOption2.l111l11111lIl(), option.l111l11111I1l());
                } else {
                    smOption2 = option;
                    strL11l1111Il = smOption2.l11l1111Il();
                }
                smOption2.setRetryUrl(strL11l1111Il);
            }
            if (TextUtils.isEmpty(option.l111l1111llIl())) {
                SmOption smOption6 = option;
                smOption6.setConfUrl(l111l1111llIl.l111l11111I1l(smOption6.l111l11111lIl(), option.l11l1111I1ll));
            }
            l111l11111Il l111l11111ilL1111l111111Il2 = l111l11111Il.l1111l111111Il();
            String strL111l11111lIl2 = option.l111l11111lIl();
            iHashCode = strL111l11111lIl2.hashCode();
            if (iHashCode != 3144) {
                str3 = AREA_BJ;
            } else {
                if (iHashCode != 118718) {
                    if (iHashCode != 3144079) {
                        str3 = AREA_FJNY;
                    }
                    l111l11111ilL1111l111111Il2.l1111l111111Il(option.l11l1111I1l());
                    if (option.l111l1111l1Il() != null) {
                        l111l11111lIl = option.l111l1111l1Il();
                    }
                    strL111l11111Il = l111l11111Il.l1111l111111Il().l111l11111Il();
                    if (!TextUtils.isEmpty(strL111l11111Il)) {
                        iServerSmidCallback.onSuccess("B" + strL111l11111Il);
                    }
                    if (com.ishumei.smantifraud.l111l11111lIl.l111l11111Il.l1111l111111Il().l111l11111lIl()) {
                        if (option.l11l1111I11l()) {
                            com.ishumei.smantifraud.l1111l111111Il.l111l1111l1Il.l1111l111111Il().l1111l111111Il(option.l111l1111llIl(), option.l11l1111Il1l(), option.l11l1111I1l());
                        }
                        if (option.l11l1111I11l()) {
                            l111l1111lIl.l1111l111111Il().l1111l111111Il(option.l11l1111Il(), option.l11l1111Il1l());
                        }
                    }
                    return TextUtils.isEmpty(l111l11111lIl.l1111l111111Il);
                }
                str3 = AREA_XJP;
            }
            strL111l11111lIl2.equals(str3);
            l111l11111ilL1111l111111Il2.l1111l111111Il(option.l11l1111I1l());
            if (option.l111l1111l1Il() != null) {
                l111l11111lIl = option.l111l1111l1Il();
            }
            strL111l11111Il = l111l11111Il.l1111l111111Il().l111l11111Il();
            if (!TextUtils.isEmpty(strL111l11111Il)) {
                iServerSmidCallback.onSuccess("B" + strL111l11111Il);
            }
            if (com.ishumei.smantifraud.l111l11111lIl.l111l11111Il.l1111l111111Il().l111l11111lIl()) {
                if (option.l11l1111I11l()) {
                    com.ishumei.smantifraud.l1111l111111Il.l111l1111l1Il.l1111l111111Il().l1111l111111Il(option.l111l1111llIl(), option.l11l1111Il1l(), option.l11l1111I1l());
                }
                if (option.l11l1111I11l()) {
                    l111l1111lIl.l1111l111111Il().l1111l111111Il(option.l11l1111Il(), option.l11l1111Il1l());
                }
            }
            return TextUtils.isEmpty(l111l11111lIl.l1111l111111Il);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void destroy() {
        l111l1111l1Il.l111l1111l1Il = true;
    }

    public static String getDeviceId() {
        synchronized (SmAntiFraud.class) {
            if (l111l1111l1Il.l111l1111l1Il) {
                return "Dc21zZGsgaGFzIGJlZW4gZGVzdHJveWVk";
            }
            if (TextUtils.isEmpty(l111l11111lIl.l1111l111111Il)) {
                l111l11111Il.l1111l111111Il();
                return l111l11111Il.l111l11111lIl();
            }
            Log.e(l1111l111111Il, l111l11111lIl.l1111l111111Il);
            try {
                throw new IllegalAccessException(l111l11111lIl.l1111l111111Il);
            } catch (Exception e10) {
                try {
                    return "D" + com.ishumei.smantifraud.l111l1111llIl.l111l1111llIl.l1111l111111Il(l11l1111Il.l1111l111111Il().l1111l111111Il(e10).getBytes());
                } catch (Exception e11) {
                    return "D" + Base64.encodeToString((l111l11111lIl.l1111l111111Il + ";" + e11).getBytes(), 0);
                }
            }
        }
    }

    public static void getDeviceId(IDeviceIdCallback iDeviceIdCallback) {
        if (iDeviceIdCallback == null) {
            throw new IllegalArgumentException("callback cannot be null.");
        }
        l111l11111Il.l1111l111111Il().l1111l111111Il(iDeviceIdCallback, Thread.currentThread() == Looper.getMainLooper().getThread());
    }

    public static String getSDKVersion() {
        return "3.8.0_build1";
    }

    public static IServerSmidCallback getServerIdCallback() {
        return l111l11111lIl;
    }

    public static String getVData() {
        if (option == null) {
            Log.e(l1111l111111Il, "SmOption is null.");
            return "DU21PcHRpb24gaXMgbnVsbC4=";
        }
        try {
            return "D" + com.ishumei.smantifraud.l111l1111llIl.l111l1111llIl.l1111l111111Il(l111l11IlIlIl.l1111l111111Il().l111l11111lIl().getBytes());
        } catch (Exception e10) {
            return "D" + l11l1111Il.l1111l111111Il().l1111l111111Il(e10);
        }
    }

    private static void l1111l111111Il(SmOption smOption) {
        IServerSmidCallback iServerSmidCallback;
        l111l11111lIl(smOption);
        String strL111l11111Il = l111l11111Il.l1111l111111Il().l111l11111Il();
        if (!TextUtils.isEmpty(strL111l11111Il) && (iServerSmidCallback = l111l11111lIl) != null) {
            iServerSmidCallback.onSuccess("B" + strL111l11111Il);
        }
        if (com.ishumei.smantifraud.l111l11111lIl.l111l11111Il.l1111l111111Il().l111l11111lIl()) {
            if (option.l11l1111I11l() && option.l11l1111lIIl()) {
                com.ishumei.smantifraud.l1111l111111Il.l111l1111l1Il.l1111l111111Il().l1111l111111Il(option.l111l1111llIl(), option.l11l1111Il1l(), option.l11l1111I1l());
            }
            if (option.l11l1111I11l()) {
                l111l1111lIl.l1111l111111Il().l1111l111111Il(option.l11l1111Il(), option.l11l1111Il1l());
            }
        }
    }

    private static boolean l1111l111111Il(Context context, SmOption smOption) {
        String str;
        if (context == null) {
            str = "context is null!";
        } else if (smOption == null) {
            str = "SmOption is null!";
        } else if (TextUtils.isEmpty(smOption.l11l1111I1l())) {
            str = "SmOption.organization is null!";
        } else {
            if (!TextUtils.isEmpty(smOption.l111l11111Il())) {
                return true;
            }
            str = "SmOption.publicKey is null!";
        }
        l111l11111lIl.l1111l111111Il = str;
        Log.e(l1111l111111Il, str);
        return false;
    }

    private static void l111l11111lIl(SmOption smOption) {
        boolean z10;
        SmOption smOption2;
        String strL11l1111Il;
        option = smOption;
        if (TextUtils.isEmpty(smOption.l11l1111Il())) {
            z10 = true;
            SmOption smOption3 = option;
            smOption3.setUrl(l111l1111llIl.l1111l111111Il(smOption3.l111l11111lIl(), option.l111l11111I1l()));
        } else {
            z10 = false;
        }
        if (TextUtils.isEmpty(option.l11l1111Il1l())) {
            if (z10) {
                smOption2 = option;
                strL11l1111Il = l111l1111llIl.l111l11111lIl(smOption2.l111l11111lIl(), option.l111l11111I1l());
            } else {
                smOption2 = option;
                strL11l1111Il = smOption2.l11l1111Il();
            }
            smOption2.setRetryUrl(strL11l1111Il);
        }
        if (TextUtils.isEmpty(option.l111l1111llIl())) {
            SmOption smOption4 = option;
            smOption4.setConfUrl(l111l1111llIl.l111l11111I1l(smOption4.l111l11111lIl(), option.l11l1111I1ll));
        }
        l111l11111Il l111l11111ilL1111l111111Il = l111l11111Il.l1111l111111Il();
        l111l1111llIl.l1111l111111Il(option.l111l11111lIl());
        l111l11111ilL1111l111111Il.l1111l111111Il(option.l11l1111I1l());
        if (option.l111l1111l1Il() != null) {
            l111l11111lIl = option.l111l1111l1Il();
        }
    }

    public static synchronized void registerServerIdCallback(IServerSmidCallback iServerSmidCallback) {
        l111l11111lIl = iServerSmidCallback;
    }

    public static void startDetector(AbsDetector absDetector) {
        if (option == null) {
            Log.e(l1111l111111Il, "SmOption is null.");
        } else {
            l111l11IlIlIl.l1111l111111Il().l1111l111111Il(absDetector);
        }
    }

    public static void stopDetector(AbsDetector absDetector) {
        if (option == null) {
            Log.e(l1111l111111Il, "SmOption is null.");
        } else {
            l111l11IlIlIl.l1111l111111Il().l111l11111lIl(absDetector);
        }
    }
}
