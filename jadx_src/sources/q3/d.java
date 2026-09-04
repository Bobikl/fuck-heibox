package q3;

import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.j;
import androidx.work.impl.model.o;
import androidx.work.impl.model.u;
import androidx.work.impl.model.x;
import androidx.work.impl.model.z;
import androidx.work.n;
import com.umeng.analytics.pro.ak;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: DiagnosticsWorker.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u001a.\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002\u001a1\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/work/impl/model/o;", "workNameDao", "Landroidx/work/impl/model/z;", "workTagDao", "Landroidx/work/impl/model/j;", "systemIdInfoDao", "", "Landroidx/work/impl/model/u;", "workSpecs", "", "d", "workSpec", "name", "", "systemId", "tags", ak.aF, "(Landroidx/work/impl/model/u;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;", "work-runtime_release"}, k = 2, mv = {1, 7, 1})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final String f138584a;

    static {
        String strI = n.i("DiagnosticsWrkr");
        f0.o(strI, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f138584a = strI;
    }

    private static final String c(u uVar, String str, Integer num, String str2) {
        return '\n' + uVar.id + "\t " + uVar.workerClassName + "\t " + num + "\t " + uVar.state.name() + "\t " + str + "\t " + str2 + '\t';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(o oVar, z zVar, j jVar, List<u> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        for (u uVar : list) {
            SystemIdInfo systemIdInfoD = jVar.d(x.a(uVar));
            sb2.append(c(uVar, CollectionsKt___CollectionsKt.h3(oVar.b(uVar.id), Constants.ACCEPT_TIME_SEPARATOR_SP, null, null, 0, null, null, 62, null), systemIdInfoD != null ? Integer.valueOf(systemIdInfoD.systemId) : null, CollectionsKt___CollectionsKt.h3(zVar.c(uVar.id), Constants.ACCEPT_TIME_SEPARATOR_SP, null, null, 0, null, null, 62, null)));
        }
        String string = sb2.toString();
        f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
