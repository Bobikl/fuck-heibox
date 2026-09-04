package q7;

import android.content.Intent;
import com.bytedance.sdk.open.aweme.authorize.model.Authorization;
import com.bytedance.sdk.open.douyin.model.OpenRecord;
import m7.b;
import p7.c;

/* JADX INFO: loaded from: classes6.dex */
public interface a {
    boolean a();

    boolean b(b.a aVar);

    boolean c(int i10);

    boolean d();

    boolean e(l7.a.C1198a c1198a);

    boolean f(c.a aVar);

    boolean g();

    boolean h();

    boolean i();

    boolean isAppInstalled();

    boolean isAppSupportAuthorization();

    boolean isAppSupportShare();

    boolean j();

    boolean k(Authorization.Request request);

    boolean l(OpenRecord.Request request);

    boolean m(Intent intent, j7.a aVar);
}
