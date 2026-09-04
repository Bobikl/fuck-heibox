package androidx.room.util;

import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.room.t1;
import com.umeng.analytics.pro.ak;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: StringUtil.kt */
/* JADX INFO: loaded from: classes6.dex */
@xh.h(name = "StringUtil")
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u001a\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\"\"\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u0012\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Ljava/lang/StringBuilder;", "d", "builder", "", "count", "Lkotlin/b2;", ak.av, "", "input", "", "e", ak.aF, "", "[Ljava/lang/String;", "getEMPTY_STRING_ARRAY$annotations", "()V", "EMPTY_STRING_ARRAY", "room-runtime_release"}, k = 2, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final String[] f27286a = new String[0];

    public static final void a(@dl.d StringBuilder builder, int i10) {
        f0.p(builder, "builder");
        for (int i11 = 0; i11 < i10; i11++) {
            builder.append("?");
            if (i11 < i10 - 1) {
                builder.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
        }
    }

    public static /* synthetic */ void b() {
    }

    @dl.e
    public static final String c(@dl.e List<Integer> list) {
        if (list != null) {
            return CollectionsKt___CollectionsKt.h3(list, Constants.ACCEPT_TIME_SEPARATOR_SP, null, null, 0, null, null, 62, null);
        }
        return null;
    }

    @dl.d
    public static final StringBuilder d() {
        return new StringBuilder();
    }

    @dl.e
    public static final List<Integer> e(@dl.e String str) {
        List listT4;
        Integer numValueOf;
        if (str == null || (listT4 = StringsKt__StringsKt.T4(str, new char[]{','}, false, 0, 6, null)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listT4.iterator();
        while (it.hasNext()) {
            try {
                numValueOf = Integer.valueOf(Integer.parseInt((String) it.next()));
            } catch (NumberFormatException e10) {
                Log.e(t1.LOG_TAG, "Malformed integer list", e10);
                numValueOf = null;
            }
            if (numValueOf != null) {
                arrayList.add(numValueOf);
            }
        }
        return arrayList;
    }
}
