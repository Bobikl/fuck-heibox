package cn.fly.verify;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public class cj extends cg {
    public cj(Context context) {
        super(context);
    }

    private String a(String str, String str2) {
        String str3;
        Bundle bundleB = b(str, str2);
        if (a(bundleB)) {
            str3 = "002)fkfe";
        } else {
            if (bundleB == null) {
                return null;
            }
            str3 = "007[fh-hDhkhk f6gl<h";
        }
        return bundleB.getString(ba.a(str3));
    }

    private boolean a(Bundle bundle) {
        return bundle != null && bundle.getInt(ba.a("004e<fmfeCh"), -1) == 0;
    }

    private Bundle b(String str, String str2) {
        Bundle bundleCall = null;
        try {
            Uri uri = Uri.parse(ba.a("036e,fm%gkhgkmnnegKfn.g+fihhfkMfIfnfkfeUhgkYfk*kAgeHnQfkfeKhgk7fk'k<ge"));
            int i10 = Build.VERSION.SDK_INT;
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = this.f36018a.getContentResolver().acquireUnstableContentProviderClient(uri);
            bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call(str, str2, null);
            if (i10 >= 24) {
                contentProviderClientAcquireUnstableContentProviderClient.close();
            } else {
                contentProviderClientAcquireUnstableContentProviderClient.release();
            }
        } catch (Throwable th2) {
            es.a().a(th2);
        }
        return bundleCall;
    }

    @Override // cn.fly.verify.cg
    protected cg.b b() {
        cg.b bVar = new cg.b();
        bVar.f36026a = a(ba.a("007<glJhkYijhfgghn"), (String) null);
        return bVar;
    }
}
