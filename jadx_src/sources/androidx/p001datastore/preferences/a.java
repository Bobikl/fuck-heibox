package androidx.p001datastore.preferences;

import android.content.Context;
import com.umeng.analytics.pro.ak;
import dl.d;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import xh.h;

/* JADX INFO: compiled from: PreferenceDataStoreFile.kt */
/* JADX INFO: loaded from: classes.dex */
@h(name = "PreferenceDataStoreFile")
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"Landroid/content/Context;", "", "name", "Ljava/io/File;", ak.av, "datastore-preferences_release"}, k = 2, mv = {1, 5, 1})
public final class a {
    @d
    public static final File a(@d Context context, @d String name) {
        f0.p(context, "<this>");
        f0.p(name, "name");
        return androidx.p001datastore.Context.a(context, f0.C(name, ".preferences_pb"));
    }
}
