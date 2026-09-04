package androidx.compose.runtime.saveable;

import com.umeng.analytics.pro.ak;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;
import kotlin.text.u;
import yh.l;

/* JADX INFO: compiled from: SaveableStateRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e\u0018\u00010\r\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tH\u0016J\u001c\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e0\rH\u0016R(\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R.\u0010\u0014\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t0\u00130\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/saveable/d;", "Landroidx/compose/runtime/saveable/c;", "", "value", "", ak.av, "", "key", "e", "Lkotlin/Function0;", "valueProvider", "Landroidx/compose/runtime/saveable/c$a;", "b", "", "", ak.aF, "", "Ljava/util/Map;", "restored", "", "valueProviders", "Lkotlin/Function1;", "canBeSaved", "<init>", "(Ljava/util/Map;Lyh/l;)V", "runtime-saveable_release"}, k = 1, mv = {1, 7, 1})
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final l<Object, Boolean> f13137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<String, List<Object>> restored;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<String, List<yh.a<Object>>> valueProviders;

    /* JADX INFO: compiled from: SaveableStateRegistry.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"androidx/compose/runtime/saveable/d$a", "Landroidx/compose/runtime/saveable/c$a;", "Lkotlin/b2;", MiPushClient.COMMAND_UNREGISTER, "runtime-saveable_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements c.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13141b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.a<Object> f13142c;

        a(String str, yh.a<? extends Object> aVar) {
            this.f13141b = str;
            this.f13142c = aVar;
        }

        @Override // androidx.compose.runtime.saveable.c.a
        public void unregister() {
            List list = (List) d.this.valueProviders.remove(this.f13141b);
            if (list != null) {
                list.remove(this.f13142c);
            }
            if (list == null || !(!list.isEmpty())) {
                return;
            }
            d.this.valueProviders.put(this.f13141b, list);
        }
    }

    public d(@dl.e Map<String, ? extends List<? extends Object>> map, @dl.d l<Object, Boolean> canBeSaved) {
        Map<String, List<Object>> mapJ0;
        f0.p(canBeSaved, "canBeSaved");
        this.f13137a = canBeSaved;
        this.restored = (map == null || (mapJ0 = s0.J0(map)) == null) ? new LinkedHashMap<>() : mapJ0;
        this.valueProviders = new LinkedHashMap();
    }

    @Override // androidx.compose.runtime.saveable.c
    public boolean a(@dl.d Object value) {
        f0.p(value, "value");
        return this.f13137a.invoke(value).booleanValue();
    }

    @Override // androidx.compose.runtime.saveable.c
    @dl.d
    public c.a b(@dl.d String key, @dl.d yh.a<? extends Object> valueProvider) {
        f0.p(key, "key");
        f0.p(valueProvider, "valueProvider");
        if (!(!u.V1(key))) {
            throw new IllegalArgumentException("Registered key is empty or blank".toString());
        }
        Map<String, List<yh.a<Object>>> map = this.valueProviders;
        List<yh.a<Object>> arrayList = map.get(key);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(key, arrayList);
        }
        arrayList.add(valueProvider);
        return new a(key, valueProvider);
    }

    @Override // androidx.compose.runtime.saveable.c
    @dl.d
    public Map<String, List<Object>> c() {
        Map<String, List<Object>> mapJ0 = s0.J0(this.restored);
        for (Map.Entry<String, List<yh.a<Object>>> entry : this.valueProviders.entrySet()) {
            String key = entry.getKey();
            List<yh.a<Object>> value = entry.getValue();
            if (value.size() == 1) {
                Object objInvoke = value.get(0).invoke();
                if (objInvoke == null) {
                    continue;
                } else {
                    if (!a(objInvoke)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    mapJ0.put(key, CollectionsKt__CollectionsKt.r(objInvoke));
                }
            } else {
                int size = value.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    Object objInvoke2 = value.get(i10).invoke();
                    if (objInvoke2 != null && !a(objInvoke2)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    arrayList.add(objInvoke2);
                }
                mapJ0.put(key, arrayList);
            }
        }
        return mapJ0;
    }

    @Override // androidx.compose.runtime.saveable.c
    @dl.e
    public Object e(@dl.d String key) {
        f0.p(key, "key");
        List<Object> listRemove = this.restored.remove(key);
        if (listRemove == null || !(!listRemove.isEmpty())) {
            return null;
        }
        if (listRemove.size() > 1) {
            this.restored.put(key, listRemove.subList(1, listRemove.size()));
        }
        return listRemove.get(0);
    }
}
