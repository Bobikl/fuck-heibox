package com.vivo.push.util;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.vivo.push.model.InsideNotificationItem;

/* JADX INFO: compiled from: DefaultNotifyDataAdapter.java */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements BaseNotifyDataAdapter {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f106664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f106665f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Resources f106666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f106667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f106668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f106669d;

    private int a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String[] strArrSplit = str.split("\\.");
            if (strArrSplit != null && strArrSplit.length > 0) {
                str = strArrSplit[0];
            }
            try {
                for (int i10 = Integer.parseInt(str); i10 > 0; i10--) {
                    String str3 = "vivo_push_ard" + i10 + str2;
                    p.c("DefaultNotifyDataAdapter", "get notify icon : ".concat(String.valueOf(str3)));
                    int identifier = this.f106666a.getIdentifier(str3, "drawable", this.f106667b);
                    if (identifier > 0) {
                        p.c("DefaultNotifyDataAdapter", "find notify icon : ".concat(String.valueOf(str3)));
                        return identifier;
                    }
                }
            } catch (Exception e10) {
                p.a("DefaultNotifyDataAdapter", e10);
            }
        }
        return -1;
    }

    private static boolean a(int i10) {
        return (i10 == -1 || i10 == 0) ? false : true;
    }

    private static boolean a(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        p.d("DefaultNotifyDataAdapter", "systemVersion is not suit ");
        return false;
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final int getDefaultNotifyIcon() {
        if (a(f106664e)) {
            return f106664e;
        }
        String str = this.f106669d;
        int iA = !a(str) ? -1 : a(str, "_notifyicon");
        f106664e = iA;
        if (a(iA)) {
            return f106664e;
        }
        for (String strSubstring = this.f106668c; !TextUtils.isEmpty(strSubstring); strSubstring = strSubstring.substring(0, strSubstring.length() - 1)) {
            int identifier = this.f106666a.getIdentifier("vivo_push_rom" + strSubstring + "_notifyicon", "drawable", this.f106667b);
            if (identifier > 0) {
                return identifier;
            }
        }
        return this.f106666a.getIdentifier("vivo_push_notifyicon", "drawable", this.f106667b);
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final int getDefaultSmallIconId() {
        if (a(f106665f)) {
            return f106665f;
        }
        String str = this.f106669d;
        int iA = !a(str) ? -1 : a(str, "_icon");
        f106665f = iA;
        if (a(iA)) {
            return f106665f;
        }
        for (String strSubstring = this.f106668c; !TextUtils.isEmpty(strSubstring); strSubstring = strSubstring.substring(0, strSubstring.length() - 1)) {
            int identifier = this.f106666a.getIdentifier("vivo_push_rom" + strSubstring + "_icon", "drawable", this.f106667b);
            if (identifier > 0) {
                return identifier;
            }
        }
        return this.f106666a.getIdentifier("vivo_push_icon", "drawable", this.f106667b);
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final int getNotifyMode(InsideNotificationItem insideNotificationItem) {
        return 2;
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final void init(Context context) {
        this.f106667b = context.getPackageName();
        this.f106666a = context.getResources();
        this.f106668c = j.a();
        this.f106669d = Build.VERSION.RELEASE;
    }
}
