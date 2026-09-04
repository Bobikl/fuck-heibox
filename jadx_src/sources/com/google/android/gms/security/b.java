package com.google.android.gms.security;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class b extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f52746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ a.InterfaceC0413a f52747b;

    b(Context context, a.InterfaceC0413a interfaceC0413a) {
        this.f52746a = context;
        this.f52747b = interfaceC0413a;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        try {
            a.a(this.f52746a);
            return 0;
        } catch (GooglePlayServicesNotAvailableException e10) {
            return Integer.valueOf(e10.f52307b);
        } catch (GooglePlayServicesRepairableException e11) {
            return Integer.valueOf(e11.b());
        }
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            this.f52747b.b();
        } else {
            this.f52747b.a(num.intValue(), a.f52742b.e(this.f52746a, num.intValue(), "pi"));
        }
    }
}
