package cn.fly.verify;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import cn.fly.verify.common.exception.VerifyException;
import cn.fly.verify.pure.entity.PreVerifyResult;
import com.max.hbcommon.bean.segmentfilter.FilterGroup;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile q f36959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f36960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<String, Integer> f36961c;

    /* JADX INFO: renamed from: cn.fly.verify.q$1, reason: invalid class name */
    public class AnonymousClass1 extends Handler {
        AnonymousClass1(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            final Message message2 = new Message();
            message2.copyFrom(message);
            new ar() { // from class: cn.fly.verify.q.1.1
                @Override // cn.fly.verify.ar
                public void a() {
                    f.a().a("receive message " + message2);
                    Message message3 = message2;
                    int i10 = message3.what;
                    Bundle data = message3.getData();
                    if (data != null) {
                        final String string = data.getString("operator");
                        final String string2 = data.getString("id");
                        final String string3 = data.getString("secret");
                        final int i11 = data.getInt(FilterGroup.TYPE_MULTI);
                        Integer numValueOf = data.containsKey("channel") ? Integer.valueOf(data.getInt("channel")) : null;
                        String string4 = data.containsKey("channelAccount") ? data.getString("channelAccount") : null;
                        final e eVar = new e(g.PREVERIFY);
                        eVar.a((Integer) 2);
                        s sVarA = as.a(null, i10, string2, string3, i11, numValueOf, string4, eVar);
                        if (sVarA != null) {
                            final Integer num = numValueOf;
                            final String str = string4;
                            sVarA.a(true, new cn.fly.verify.common.callback.b() { // from class: cn.fly.verify.q.1.1.1
                                @Override // cn.fly.verify.common.callback.b
                                public void a(VerifyException verifyException) {
                                }

                                @Override // cn.fly.verify.common.callback.b
                                public void a(Object obj) {
                                    e eVar2 = eVar;
                                    if (eVar2 != null) {
                                        eVar2.a(string, string2);
                                    }
                                    if (obj instanceof PreVerifyResult) {
                                        q.this.a(string, string2, string3, i11, num, str, ((PreVerifyResult) obj).getExpireAt());
                                    }
                                }
                            });
                        }
                    }
                }
            }.b();
        }
    }

    private q() {
        try {
            HashMap<String, Integer> map = new HashMap<>();
            this.f36961c = map;
            map.put("CMCC", 1);
            this.f36961c.put("CUCC", 2);
            this.f36961c.put("CTCC", 4);
            this.f36961c.put("CUXW", 3);
            this.f36960b = new AnonymousClass1(Looper.getMainLooper());
        } catch (Throwable th2) {
            f.a().a(th2);
        }
    }

    public static q a() {
        if (f36959a == null) {
            synchronized (q.class) {
                if (f36959a == null) {
                    f36959a = new q();
                }
            }
        }
        return f36959a;
    }

    public void a(String str) {
        try {
            Handler handler = this.f36960b;
            if (handler != null) {
                handler.removeMessages(this.f36961c.get(str).intValue());
                f.a().a("cancel: " + str);
            }
        } catch (Throwable th2) {
            f.a().a(th2);
        }
    }

    public void a(String str, String str2, String str3, int i10, Integer num, String str4, long j10) {
        try {
            Handler handler = this.f36960b;
            if (handler != null) {
                handler.removeMessages(this.f36961c.get(str).intValue());
                Message messageObtain = Message.obtain();
                messageObtain.what = this.f36961c.get(str).intValue();
                messageObtain.getData().putString("operator", str);
                messageObtain.getData().putString("id", str2);
                messageObtain.getData().putString("secret", str3);
                messageObtain.getData().putInt(FilterGroup.TYPE_MULTI, i10);
                if (num != null) {
                    messageObtain.getData().putInt("channel", num.intValue());
                }
                if (str4 != null) {
                    messageObtain.getData().putString("channelAccount", str4);
                }
                long jCurrentTimeMillis = j10 - System.currentTimeMillis();
                if (jCurrentTimeMillis < 0) {
                    jCurrentTimeMillis = 3600000;
                }
                this.f36960b.sendMessageDelayed(messageObtain, jCurrentTimeMillis);
                f.a().a("submit: " + str + ", " + str2 + ", " + j10);
            }
        } catch (Throwable th2) {
            f.a().a(th2);
        }
    }
}
