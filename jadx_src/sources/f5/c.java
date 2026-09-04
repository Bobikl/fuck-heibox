package f5;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Collections;
import org.android.agoo.common.AgooConstants;
import org.json.JSONObject;
import z5.l;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f118754a = 1010;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f118755b;

    public interface a {
        void a(boolean z10, JSONObject jSONObject, String str);
    }

    public static boolean a(x5.a aVar, int i10, int i11, Intent intent) {
        if (i10 != 1010 || intent == null) {
            return false;
        }
        a aVar2 = f118755b;
        if (aVar2 == null) {
            return true;
        }
        f118755b = null;
        if (i11 == -1) {
            h5.a.d(aVar, h5.b.f119113l, h5.b.f119138x0, intent.toUri(1));
            aVar2.a(true, l.q(intent), "OK");
        } else if (i11 != 0) {
            h5.a.i(aVar, h5.b.f119113l, h5.b.f119136w0, "" + i11);
        } else {
            h5.a.d(aVar, h5.b.f119113l, h5.b.f119134v0, intent.toUri(1));
            aVar2.a(false, null, "CANCELED");
        }
        return true;
    }

    public static boolean b(x5.a aVar, Activity activity, int i10, String str, String str2, a aVar2) {
        try {
            h5.a.c(aVar, h5.b.f119113l, h5.b.f119132u0);
            activity.startActivityForResult(new Intent(str2, Uri.parse(str)), i10);
            f118755b = aVar2;
            return true;
        } catch (Throwable th2) {
            aVar2.a(false, null, "UNKNOWN_ERROR");
            h5.a.e(aVar, h5.b.f119113l, h5.b.f119140y0, th2);
            return false;
        }
    }

    public static boolean c(x5.a aVar, Context context) {
        return l.y(aVar, context, Collections.singletonList(new l5.a.b(AgooConstants.TAOBAO_PACKAGE, 0, "")), false);
    }
}
