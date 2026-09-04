package s4;

import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f139265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f139266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f139267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f139268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f139269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f139270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f139271g;

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f139265a = str;
        this.f139266b = str2;
        this.f139267c = str3;
        this.f139268d = str4;
        this.f139269e = str5;
        this.f139270f = str6;
        this.f139271g = str7;
    }

    public final String toString() {
        StringBuilder sb2;
        String strSubstring;
        StringBuilder sb3;
        String strSubstring2;
        StringBuilder sb4;
        String strSubstring3;
        StringBuffer stringBuffer = new StringBuffer(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(Calendar.getInstance().getTime()));
        stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP + this.f139265a);
        stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP + this.f139266b);
        stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP + this.f139267c);
        stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP + this.f139268d);
        if (e6.a.c(this.f139269e) || this.f139269e.length() < 20) {
            sb2 = new StringBuilder(Constants.ACCEPT_TIME_SEPARATOR_SP);
            strSubstring = this.f139269e;
        } else {
            sb2 = new StringBuilder(Constants.ACCEPT_TIME_SEPARATOR_SP);
            strSubstring = this.f139269e.substring(0, 20);
        }
        sb2.append(strSubstring);
        stringBuffer.append(sb2.toString());
        if (e6.a.c(this.f139270f) || this.f139270f.length() < 20) {
            sb3 = new StringBuilder(Constants.ACCEPT_TIME_SEPARATOR_SP);
            strSubstring2 = this.f139270f;
        } else {
            sb3 = new StringBuilder(Constants.ACCEPT_TIME_SEPARATOR_SP);
            strSubstring2 = this.f139270f.substring(0, 20);
        }
        sb3.append(strSubstring2);
        stringBuffer.append(sb3.toString());
        if (e6.a.c(this.f139271g) || this.f139271g.length() < 20) {
            sb4 = new StringBuilder(Constants.ACCEPT_TIME_SEPARATOR_SP);
            strSubstring3 = this.f139271g;
        } else {
            sb4 = new StringBuilder(Constants.ACCEPT_TIME_SEPARATOR_SP);
            strSubstring3 = this.f139271g.substring(0, 20);
        }
        sb4.append(strSubstring3);
        stringBuffer.append(sb4.toString());
        return stringBuffer.toString();
    }
}
