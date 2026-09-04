package com.xiaomi.push;

import com.xiaomi.push.ef.c;
import java.io.File;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public class eg extends ef.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f107031a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ ef f322a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    File f323a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ String f324a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ Date f325a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ boolean f326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f107032b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    final /* synthetic */ Date f327b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    eg(ef efVar, int i10, Date date, Date date2, String str, String str2, boolean z10) {
        super();
        this.f322a = efVar;
        this.f107031a = i10;
        this.f325a = date;
        this.f327b = date2;
        this.f324a = str;
        this.f107032b = str2;
        this.f326a = z10;
    }

    @Override // com.xiaomi.push.ef.b, com.xiaomi.push.ak.b
    public void b() {
        if (z.d()) {
            try {
                File file = new File(this.f322a.f315a.getExternalFilesDir(null) + "/.logcache");
                file.mkdirs();
                if (file.isDirectory()) {
                    ee eeVar = new ee();
                    eeVar.a(this.f107031a);
                    this.f323a = eeVar.a(this.f322a.f315a, this.f325a, this.f327b, file);
                }
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.xiaomi.push.ak.b
    /* JADX INFO: renamed from: c */
    public void mo279c() {
        File file = this.f323a;
        if (file != null && file.exists()) {
            this.f322a.f316a.add(this.f322a.new c(this.f324a, this.f107032b, this.f323a, this.f326a));
        }
        this.f322a.a(0L);
    }
}
