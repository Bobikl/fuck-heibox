package i4;

import com.alipay.mobile.android.verify.logger.b;

/* JADX INFO: compiled from: LogcatAdapter.java */
/* JADX INFO: loaded from: classes6.dex */
public class a extends com.alipay.mobile.android.verify.logger.a {
    public a(b bVar) {
        super(bVar);
    }

    @Override // com.alipay.mobile.android.verify.logger.a, com.alipay.mobile.android.verify.logger.c
    public boolean isLoggable(int i10, String str) {
        return i10 >= 5;
    }
}
