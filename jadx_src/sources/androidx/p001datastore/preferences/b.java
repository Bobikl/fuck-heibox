package androidx.p001datastore.preferences;

import androidx.p001datastore.core.CorruptionException;
import androidx.p001datastore.preferences.protobuf.InvalidProtocolBufferException;
import com.umeng.analytics.pro.ak;
import dl.d;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: PreferencesMapCompat.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/datastore/preferences/b;", "", "<init>", "()V", ak.av, "datastore-preferences-proto"}, k = 1, mv = {1, 5, 1})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: androidx.datastore.preferences.b$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: PreferencesMapCompat.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Landroidx/datastore/preferences/b$a;", "", "Ljava/io/InputStream;", "input", "Landroidx/datastore/preferences/PreferencesProto$b;", ak.av, "<init>", "()V", "datastore-preferences-proto"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @d
        public final PreferencesProto.b a(@d InputStream input) throws IOException {
            f0.p(input, "input");
            try {
                PreferencesProto.b bVarV2 = PreferencesProto.b.V2(input);
                f0.o(bVarV2, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
                return bVarV2;
            } catch (InvalidProtocolBufferException e10) {
                throw new CorruptionException("Unable to parse preferences proto.", e10);
            }
        }
    }
}
