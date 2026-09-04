package androidx.compose.runtime.saveable;

import com.umeng.analytics.pro.ak;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: SaveableStateRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u000bJ\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H&J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005H&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0001H&J\u001c\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r0\fH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/saveable/c;", "", "", "key", "e", "Lkotlin/Function0;", "valueProvider", "Landroidx/compose/runtime/saveable/c$a;", "b", "value", "", ak.av, "", "", ak.aF, "runtime-saveable_release"}, k = 1, mv = {1, 7, 1})
public interface c {

    /* JADX INFO: compiled from: SaveableStateRegistry.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/saveable/c$a;", "", "Lkotlin/b2;", MiPushClient.COMMAND_UNREGISTER, "runtime-saveable_release"}, k = 1, mv = {1, 7, 1})
    public interface a {
        void unregister();
    }

    boolean a(@dl.d Object value);

    @dl.d
    a b(@dl.d String str, @dl.d yh.a<? extends Object> aVar);

    @dl.d
    Map<String, List<Object>> c();

    @dl.e
    Object e(@dl.d String key);
}
