package androidx.p001datastore.preferences.core;

import androidx.p001datastore.core.CorruptionException;
import androidx.p001datastore.core.i;
import androidx.p001datastore.preferences.PreferencesProto;
import androidx.p001datastore.preferences.b;
import com.umeng.analytics.pro.ak;
import dl.e;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.c;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PreferencesSerializer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J \u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002J\u001b\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Landroidx/datastore/preferences/core/d;", "Landroidx/datastore/core/i;", "Landroidx/datastore/preferences/core/a;", "", "value", "Landroidx/datastore/preferences/PreferencesProto$Value;", "d", "", "name", "Landroidx/datastore/preferences/core/MutablePreferences;", "mutablePreferences", "Lkotlin/b2;", ak.av, "Ljava/io/InputStream;", "input", ak.aG, "(Ljava/io/InputStream;Lkotlin/coroutines/c;)Ljava/lang/Object;", "t", "Ljava/io/OutputStream;", "output", "e", "(Landroidx/datastore/preferences/core/a;Ljava/io/OutputStream;Lkotlin/coroutines/c;)Ljava/lang/Object;", "b", "Ljava/lang/String;", ak.aF, "()Ljava/lang/String;", "fileExtension", "()Landroidx/datastore/preferences/core/a;", "defaultValue", "<init>", "()V", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1})
public final class d implements i<androidx.p001datastore.preferences.core.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final d f22233a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final String fileExtension = "preferences_pb";

    /* JADX INFO: compiled from: PreferencesSerializer.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22235a;

        static {
            int[] iArr = new int[PreferencesProto.Value.ValueCase.values().length];
            iArr[PreferencesProto.Value.ValueCase.BOOLEAN.ordinal()] = 1;
            iArr[PreferencesProto.Value.ValueCase.FLOAT.ordinal()] = 2;
            iArr[PreferencesProto.Value.ValueCase.DOUBLE.ordinal()] = 3;
            iArr[PreferencesProto.Value.ValueCase.INTEGER.ordinal()] = 4;
            iArr[PreferencesProto.Value.ValueCase.LONG.ordinal()] = 5;
            iArr[PreferencesProto.Value.ValueCase.STRING.ordinal()] = 6;
            iArr[PreferencesProto.Value.ValueCase.STRING_SET.ordinal()] = 7;
            iArr[PreferencesProto.Value.ValueCase.VALUE_NOT_SET.ordinal()] = 8;
            f22235a = iArr;
        }
    }

    private d() {
    }

    private final void a(String str, PreferencesProto.Value value, MutablePreferences mutablePreferences) throws CorruptionException {
        PreferencesProto.Value.ValueCase valueCaseF0 = value.F0();
        switch (valueCaseF0 == null ? -1 : a.f22235a[valueCaseF0.ordinal()]) {
            case -1:
                throw new CorruptionException("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                mutablePreferences.o(c.a(str), Boolean.valueOf(value.Y0()));
                return;
            case 2:
                mutablePreferences.o(c.c(str), Float.valueOf(value.L0()));
                return;
            case 3:
                mutablePreferences.o(c.b(str), Double.valueOf(value.S0()));
                return;
            case 4:
                mutablePreferences.o(c.d(str), Integer.valueOf(value.X()));
                return;
            case 5:
                mutablePreferences.o(c.e(str), Long.valueOf(value.b0()));
                return;
            case 6:
                androidx.p001datastore.preferences.core.a.C0158a<String> c0158aF = c.f(str);
                String string = value.getString();
                f0.o(string, "value.string");
                mutablePreferences.o(c0158aF, string);
                return;
            case 7:
                androidx.p001datastore.preferences.core.a.C0158a<Set<String>> c0158aG = c.g(str);
                List<String> listN0 = value.Y().n0();
                f0.o(listN0, "value.stringSet.stringsList");
                mutablePreferences.o(c0158aG, CollectionsKt___CollectionsKt.V5(listN0));
                return;
            case 8:
                throw new CorruptionException("Value not set.", null, 2, null);
        }
    }

    private final PreferencesProto.Value d(Object value) {
        if (value instanceof Boolean) {
            PreferencesProto.Value valueBuild = PreferencesProto.Value.k3().k2(((Boolean) value).booleanValue()).build();
            f0.o(valueBuild, "newBuilder().setBoolean(value).build()");
            return valueBuild;
        }
        if (value instanceof Float) {
            PreferencesProto.Value valueBuild2 = PreferencesProto.Value.k3().m2(((Number) value).floatValue()).build();
            f0.o(valueBuild2, "newBuilder().setFloat(value).build()");
            return valueBuild2;
        }
        if (value instanceof Double) {
            PreferencesProto.Value valueBuild3 = PreferencesProto.Value.k3().l2(((Number) value).doubleValue()).build();
            f0.o(valueBuild3, "newBuilder().setDouble(value).build()");
            return valueBuild3;
        }
        if (value instanceof Integer) {
            PreferencesProto.Value valueBuild4 = PreferencesProto.Value.k3().n2(((Number) value).intValue()).build();
            f0.o(valueBuild4, "newBuilder().setInteger(value).build()");
            return valueBuild4;
        }
        if (value instanceof Long) {
            PreferencesProto.Value valueBuild5 = PreferencesProto.Value.k3().o2(((Number) value).longValue()).build();
            f0.o(valueBuild5, "newBuilder().setLong(value).build()");
            return valueBuild5;
        }
        if (value instanceof String) {
            PreferencesProto.Value valueBuild6 = PreferencesProto.Value.k3().p2((String) value).build();
            f0.o(valueBuild6, "newBuilder().setString(value).build()");
            return valueBuild6;
        }
        if (!(value instanceof Set)) {
            throw new IllegalStateException(f0.C("PreferencesSerializer does not support type: ", value.getClass().getName()));
        }
        PreferencesProto.Value valueBuild7 = PreferencesProto.Value.k3().r2(PreferencesProto.d.T2().b2((Set) value)).build();
        f0.o(valueBuild7, "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()");
        return valueBuild7;
    }

    @Override // androidx.p001datastore.core.i
    @dl.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public androidx.p001datastore.preferences.core.a s() {
        return b.b();
    }

    @dl.d
    public final String c() {
        return fileExtension;
    }

    @Override // androidx.p001datastore.core.i
    @e
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object t(@dl.d androidx.p001datastore.preferences.core.a aVar, @dl.d OutputStream outputStream, @dl.d c<? super b2> cVar) throws IOException {
        Map<androidx.p001datastore.preferences.core.a.C0158a<?>, Object> mapA = aVar.a();
        PreferencesProto.b.a aVarN2 = PreferencesProto.b.N2();
        for (Map.Entry<androidx.p001datastore.preferences.core.a.C0158a<?>, Object> entry : mapA.entrySet()) {
            aVarN2.d2(entry.getKey().getName(), d(entry.getValue()));
        }
        aVarN2.build().writeTo(outputStream);
        return b2.f124493a;
    }

    @Override // androidx.p001datastore.core.i
    @e
    public Object u(@dl.d InputStream inputStream, @dl.d c<? super androidx.p001datastore.preferences.core.a> cVar) throws IOException {
        PreferencesProto.b bVarA = b.INSTANCE.a(inputStream);
        MutablePreferences mutablePreferencesC = b.c(new androidx.datastore.preferences.core.a.b[0]);
        Map<String, PreferencesProto.Value> mapS1 = bVarA.s1();
        f0.o(mapS1, "preferencesProto.preferencesMap");
        for (Map.Entry<String, PreferencesProto.Value> entry : mapS1.entrySet()) {
            String name = entry.getKey();
            PreferencesProto.Value value = entry.getValue();
            d dVar = f22233a;
            f0.o(name, "name");
            f0.o(value, "value");
            dVar.a(name, value, mutablePreferencesC);
        }
        return mutablePreferencesC.e();
    }
}
