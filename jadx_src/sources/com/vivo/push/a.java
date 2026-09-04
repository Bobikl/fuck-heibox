package com.vivo.push;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: BundleWapper.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bundle f106448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f106449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f106450c;

    public a(String str, String str2, Bundle bundle) {
        this.f106449b = str;
        this.f106450c = str2;
        this.f106448a = bundle;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    public static a a(Intent intent) {
        String string;
        if (intent == null) {
            com.vivo.push.util.p.a("BundleWapper", "create error : intent is null");
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            string = extras.getString("client_pkgname");
            if (TextUtils.isEmpty(string)) {
                string = null;
            }
        } else {
            string = null;
        }
        if (TextUtils.isEmpty(string)) {
            com.vivo.push.util.p.b("BundleWapper", "create warning: pkgName is null");
        }
        String str = intent.getPackage();
        if (TextUtils.isEmpty(str)) {
            String packageName = intent.getComponent() != null ? intent.getComponent().getPackageName() : null;
            if (TextUtils.isEmpty(packageName)) {
                com.vivo.push.util.p.b("BundleWapper", "create warning: targetPkgName is null");
            }
            str = packageName;
        }
        return new a(string, str, extras);
    }

    public final String a() {
        return this.f106449b;
    }

    public final String a(String str) {
        Bundle bundle = this.f106448a;
        if (bundle == null) {
            return null;
        }
        return bundle.getString(str);
    }

    public final void a(String str, int i10) {
        if (this.f106448a == null) {
            this.f106448a = new Bundle();
        }
        this.f106448a.putInt(str, i10);
    }

    public final void a(String str, long j10) {
        if (this.f106448a == null) {
            this.f106448a = new Bundle();
        }
        this.f106448a.putLong(str, j10);
    }

    public final void a(String str, Serializable serializable) {
        if (this.f106448a == null) {
            this.f106448a = new Bundle();
        }
        this.f106448a.putSerializable(str, serializable);
    }

    public final void a(String str, String str2) {
        if (this.f106448a == null) {
            this.f106448a = new Bundle();
        }
        this.f106448a.putString(str, str2);
    }

    public final void a(String str, ArrayList<String> arrayList) {
        if (this.f106448a == null) {
            this.f106448a = new Bundle();
        }
        this.f106448a.putStringArrayList(str, arrayList);
    }

    public final void a(String str, boolean z10) {
        if (this.f106448a == null) {
            this.f106448a = new Bundle();
        }
        this.f106448a.putBoolean(str, z10);
    }

    public final void a(String str, byte[] bArr) {
        if (this.f106448a == null) {
            this.f106448a = new Bundle();
        }
        this.f106448a.putByteArray(str, bArr);
    }

    public final int b(String str, int i10) {
        Bundle bundle = this.f106448a;
        return bundle == null ? i10 : bundle.getInt(str, i10);
    }

    public final long b(String str, long j10) {
        Bundle bundle = this.f106448a;
        return bundle == null ? j10 : bundle.getLong(str, j10);
    }

    public final Bundle b() {
        return this.f106448a;
    }

    public final byte[] b(String str) {
        Bundle bundle = this.f106448a;
        if (bundle == null) {
            return null;
        }
        return bundle.getByteArray(str);
    }

    public final ArrayList<String> c(String str) {
        Bundle bundle = this.f106448a;
        if (bundle == null) {
            return null;
        }
        return bundle.getStringArrayList(str);
    }

    public final Serializable d(String str) {
        Bundle bundle = this.f106448a;
        if (bundle == null) {
            return null;
        }
        return bundle.getSerializable(str);
    }

    public final boolean e(String str) {
        Bundle bundle = this.f106448a;
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean(str, false);
    }
}
