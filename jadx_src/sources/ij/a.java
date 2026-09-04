package ij;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: DateFileFormatter.java */
/* JADX INFO: loaded from: classes5.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SimpleDateFormat f119390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f119391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f119392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private StringBuffer f119393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f119394e;

    public a() {
        this("yyyy:MM:dd HH:mm:ss");
    }

    public a(String str) {
        this.f119390a = null;
        this.f119392c = null;
        this.f119394e = 0;
        this.f119390a = new SimpleDateFormat(str, Locale.getDefault());
        this.f119393d = new StringBuffer();
        Calendar calendar = Calendar.getInstance();
        calendar.set(13, 0);
        this.f119391b = calendar.getTime();
    }

    private String b(int i10, String str, String str2) {
        int length = this.f119393d.length();
        int i11 = this.f119394e;
        if (length > i11) {
            StringBuffer stringBuffer = this.f119393d;
            stringBuffer.delete(i11, stringBuffer.length());
        }
        StringBuffer stringBuffer2 = this.f119393d;
        stringBuffer2.append(hj.b.b(i10));
        stringBuffer2.append(str);
        stringBuffer2.append(str2);
        stringBuffer2.append('\n');
        return stringBuffer2.toString();
    }

    private void c() {
        if (this.f119393d.length() > 0) {
            StringBuffer stringBuffer = this.f119393d;
            stringBuffer.delete(0, stringBuffer.length());
        }
        StringBuffer stringBuffer2 = this.f119393d;
        stringBuffer2.append(this.f119392c);
        stringBuffer2.append(' ');
        this.f119394e = stringBuffer2.length();
    }

    @Override // ij.b
    public synchronized String a(int i10, String str, String str2) {
        if (System.currentTimeMillis() - this.f119391b.getTime() <= 1000 && this.f119392c != null) {
            return b(i10, str, str2);
        }
        this.f119391b.setTime(System.currentTimeMillis());
        this.f119392c = this.f119390a.format(this.f119391b);
        c();
        return b(i10, str, str2);
    }
}
