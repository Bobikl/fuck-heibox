package cn.fly.verify;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.Signature;
import android.os.IBinder;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class cl extends cg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f36033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f36034d;

    public cl(Context context) {
        super(context);
        this.f36033c = ba.a("025e'fmfhfnHjhHge?kflYfnfm;lhg@fkfefnggijJlhgRgghn");
    }

    private final String a(IBinder iBinder, String str) {
        if (TextUtils.isEmpty(this.f36034d)) {
            try {
                final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
                fz.a(ax.g()).c(this.f36019b, 64).a(new fz.a() { // from class: cn.fly.verify.cl.1
                    @Override // cn.fly.verify.fz.a
                    public void a(fz.b bVar) {
                        if (bVar.k(new int[0]) != null) {
                            linkedBlockingQueue.offer(bVar.k(new int[0]));
                        } else {
                            linkedBlockingQueue.offer(Boolean.FALSE);
                        }
                    }
                });
                Object objPoll = linkedBlockingQueue.poll(300L, TimeUnit.MILLISECONDS);
                Signature[] signatureArrB = objPoll instanceof Boolean ? null : fk.b(objPoll, this.f36019b);
                if (signatureArrB != null && signatureArrB.length > 0) {
                    byte[] byteArray = signatureArrB[0].toByteArray();
                    MessageDigest messageDigest = MessageDigest.getInstance(ba.a("0041gnhmhfjh"));
                    if (messageDigest != null) {
                        byte[] bArrDigest = messageDigest.digest(byteArray);
                        StringBuilder sb2 = new StringBuilder();
                        for (byte b10 : bArrDigest) {
                            sb2.append(Integer.toHexString((b10 & 255) | 256).substring(1, 3));
                        }
                        this.f36034d = sb2.toString();
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return a(str, iBinder, this.f36033c, 1, this.f36019b, this.f36034d, str);
    }

    @Override // cn.fly.verify.cg
    protected Intent a() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(ba.a("017e%fmfhfn]jhLgeQkfl!fnfm,lhg4fkfe"), ba.a("033e,fmfhfn1jh(ge)kfl,fnfm(lhg*fkfefnggfe4hgk=fkghgegn[h;flfffkNeh")));
        intent.setAction(ba.a("040fek7fkfmSg6fn)e+fmfhfn5jh ge,kfl.fnfm1lhg_fkfefnijinikgifjgghnfjgnikilimgggfik"));
        return intent;
    }

    @Override // cn.fly.verify.cg
    public cg.b a(IBinder iBinder) {
        cg.b bVar = new cg.b();
        bVar.f36026a = a(iBinder, ba.a("004=ijgmgghn"));
        return bVar;
    }
}
