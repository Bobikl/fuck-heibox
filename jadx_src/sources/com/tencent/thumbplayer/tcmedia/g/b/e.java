package com.tencent.thumbplayer.tcmedia.g.b;

import android.media.MediaFormat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f102681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f102682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f102683f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f102687j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f102688k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f102689l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<byte[]> f102678a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f102679b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f102680c = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f102684g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f102685h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f102686i = -1;

    public e(String str) {
        this.f102687j = str;
    }

    public static int a(MediaFormat mediaFormat, String str) {
        return a(mediaFormat, str, -1);
    }

    public static int a(MediaFormat mediaFormat, String str, int i10) {
        return mediaFormat.containsKey(str) ? mediaFormat.getInteger(str) : i10;
    }

    public static e a(MediaFormat mediaFormat) {
        e eVar = new e(mediaFormat.getString(org.apache.tools.ant.taskdefs.email.b.I));
        try {
            eVar.f102683f = a(mediaFormat, "sample-rate");
            eVar.f102686i = a(mediaFormat, "max-input-size");
            eVar.f102678a = com.tencent.thumbplayer.tcmedia.g.h.c.a(mediaFormat);
            if (eVar.a()) {
                eVar.f102681d = a(mediaFormat, "rotation-degrees");
                eVar.f102679b = a(mediaFormat, "width");
                eVar.f102680c = a(mediaFormat, "height");
                eVar.f102684g = a(mediaFormat, "max-width");
                eVar.f102685h = a(mediaFormat, "max-height");
            } else {
                eVar.f102682e = a(mediaFormat, "channel-count");
            }
        } catch (Throwable th2) {
            com.tencent.thumbplayer.tcmedia.g.h.b.b("FormatWrapper", "create format error", th2);
        }
        return eVar;
    }

    private static String a(String str, byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(", length:");
        sb2.append(bArr.length);
        sb2.append("  [");
        for (int i10 = 0; i10 < Math.min(bArr.length, 20); i10++) {
            if (i10 != 0) {
                sb2.append(" ,");
            }
            sb2.append((int) bArr[i10]);
        }
        sb2.append("]");
        return sb2.toString();
    }

    public static void a(ArrayList<byte[]> arrayList) {
        if (arrayList != null && com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                sb2.append(a(com.tencent.thumbplayer.tcmedia.g.h.c.f102790a[i10], arrayList.get(i10)));
                sb2.append("\n");
            }
            com.tencent.thumbplayer.tcmedia.g.h.b.b("FormatWrapper", "csdData size:" + arrayList.size() + "    " + sb2.toString());
        }
    }

    public final boolean a() {
        if (!this.f102688k) {
            this.f102688k = true;
            this.f102689l = com.tencent.thumbplayer.tcmedia.g.h.c.a(this.f102687j);
        }
        return this.f102689l;
    }

    public final boolean a(e eVar) {
        if (this.f102678a.size() != eVar.f102678a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f102678a.size(); i10++) {
            if (!this.f102678a.get(i10).equals(eVar.f102678a.get(i10))) {
                return false;
            }
        }
        return true;
    }
}
