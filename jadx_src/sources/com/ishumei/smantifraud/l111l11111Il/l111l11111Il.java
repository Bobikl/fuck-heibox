package com.ishumei.smantifraud.l111l11111Il;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class l111l11111Il extends l111l1111lI1l {
    private static int l111l1111lI1l = -1;
    private static String l111l1111lIl = "deviceId";
    private static int l111l1111llIl = -1;
    private static final String l11l1111I11l = "oldDeviceId";
    private static final String l11l1111I1l = "sid";
    private static final String l11l1111I1ll = "c";
    private static final String l11l1111Il = "t";
    private static String l11l1111lIIl = "deviceId";
    public final int l1111l111111Il;
    public final int l111l11111lIl;
    private final String l11l1111Il1l;
    private final String l11l1111Ill;
    private final String l11l111l11Il;
    private final String l11l11IlIIll;

    public l111l11111Il(int i10, String str, String str2, JSONObject jSONObject) {
        this.l111l11111I1l = i10;
        this.l111l11111Il = str;
        this.l11l1111Il1l = str2;
        int iOptInt = -1;
        if (jSONObject == null) {
            this.l11l1111Ill = null;
            this.l11l11IlIIll = null;
            this.l11l111l11Il = null;
            this.l1111l111111Il = -1;
        } else {
            this.l11l1111Ill = jSONObject.optString("deviceId");
            this.l11l11IlIIll = jSONObject.optString(l11l1111I11l);
            this.l11l111l11Il = jSONObject.optString("sid");
            this.l1111l111111Il = jSONObject.optInt("c", -1);
            iOptInt = jSONObject.optInt("t", -1);
        }
        this.l111l11111lIl = iOptInt;
    }

    public final String l111l11111lIl() {
        return this.l11l1111Ill;
    }
}
