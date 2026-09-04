package u1;

import android.os.Trace;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AndroidTrace.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {androidx.exifinterface.media.a.f23244d5, "", "sectionName", "Lkotlin/Function0;", "block", ak.av, "(Ljava/lang/String;Lyh/a;)Ljava/lang/Object;", "ui-util_release"}, k = 2, mv = {1, 7, 1})
public final class a {
    public static final <T> T a(@dl.d String sectionName, @dl.d yh.a<? extends T> block) {
        f0.p(sectionName, "sectionName");
        f0.p(block, "block");
        Trace.beginSection(sectionName);
        try {
            return block.invoke();
        } finally {
            c0.d(1);
            Trace.endSection();
            c0.c(1);
        }
    }
}
