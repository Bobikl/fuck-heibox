package anet.channel.security;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.util.HMacUtil;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class a implements ISecurity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f29814a;

    a(String str) {
        this.f29814a = str;
    }

    @Override // anet.channel.security.ISecurity
    public byte[] decrypt(Context context, String str, String str2, byte[] bArr) {
        return null;
    }

    @Override // anet.channel.security.ISecurity
    public byte[] getBytes(Context context, String str) {
        return null;
    }

    @Override // anet.channel.security.ISecurity
    public boolean isSecOff() {
        return true;
    }

    @Override // anet.channel.security.ISecurity
    public boolean saveBytes(Context context, String str, byte[] bArr) {
        return false;
    }

    @Override // anet.channel.security.ISecurity
    public String sign(Context context, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(this.f29814a) && ISecurity.SIGN_ALGORITHM_HMAC_SHA1.equalsIgnoreCase(str)) {
            return HMacUtil.hmacSha1Hex(this.f29814a.getBytes(), str3.getBytes());
        }
        return null;
    }
}
