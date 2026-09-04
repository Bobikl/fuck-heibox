package cn.fly.verify;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.text.TextUtils;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class ce extends cg {
    public ce(Context context) {
        super(context);
    }

    @Override // cn.fly.verify.cg
    protected Intent a() {
        Intent intent = new Intent();
        intent.setAction(bq.a("028d$elegemCiLej?i4el^fKelekemejedemglBf4hiUe$ffedfm-g)ekeeej]dg"));
        intent.setPackage(bq.a("014dKelegem:iIej_i;el*f6elekemejed"));
        return intent;
    }

    @Override // cn.fly.verify.cg
    protected cg.b a(IBinder iBinder) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ed edVar = new ed();
        edVar.a(countDownLatch);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(bq.a("042dSelegem;i0ejMiAelIfZelekem6dhGelehedgj,g_ekeeej^dgUemelVe^ejedemffhigeffgmfm9gNekeeejCdg"));
            parcelObtain.writeStrongBinder(edVar);
            iBinder.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            countDownLatch.await(2000L, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            try {
                es.a().a(th2);
            } catch (Throwable th3) {
                try {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                } catch (Throwable unused) {
                }
                throw th3;
            }
        }
        try {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        } catch (Throwable unused2) {
        }
        es.a().a("hord is null ? " + TextUtils.isEmpty(edVar.a()) + " cost " + (System.currentTimeMillis() - jCurrentTimeMillis), new Object[0]);
        if (TextUtils.isEmpty(edVar.a())) {
            return null;
        }
        cg.b bVar = new cg.b();
        bVar.f36026a = edVar.a();
        return bVar;
    }
}
