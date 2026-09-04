package pb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.max.hbcommon.bean.EncryptionParamsObj;
import com.max.hbcommon.component.card.CardParam;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: compiled from: ICommonService.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface b {
    @dl.d
    String A();

    @dl.e
    String B(@dl.e Context context, @dl.e String str);

    @dl.d
    String C();

    @dl.e
    String D(@dl.d String str);

    @dl.e
    com.max.hbcommon.component.card.a E(@dl.e Object obj, @dl.d CardParam<?> cardParam);

    @dl.d
    List<WeakReference<Activity>> a();

    @dl.e
    Bitmap b(@dl.e String str, int i10);

    @dl.e
    String c(@dl.e String str);

    @dl.e
    <T> T d(@dl.d EncryptionParamsObj encryptionParamsObj, @dl.d Class<T> cls);

    @dl.e
    String e(@dl.e String str);

    boolean f();

    void g(@dl.e String str, @dl.e String str2);

    @dl.e
    Context getApplicationContext();

    @dl.d
    String h();

    boolean i();

    void j(@dl.e Activity activity);

    @dl.d
    String k();

    @dl.e
    Bitmap l(@dl.e String str);

    boolean m(@dl.e Context context);

    @dl.e
    Activity n();

    @dl.d
    String o();

    int p(@dl.e String str);

    void q(@dl.d Context context);

    @dl.e
    String r(@dl.e String str);

    void s();

    boolean t();

    @dl.d
    String u();

    @dl.d
    String v(boolean z10);

    void w();

    @dl.d
    Intent x(@dl.d Context context);

    void y(@dl.e String str, @dl.e String str2);

    void z();
}
