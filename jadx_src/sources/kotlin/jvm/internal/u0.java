package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: SpreadBuilder.java */
/* JADX INFO: loaded from: classes5.dex */
public class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<Object> f124977a;

    public u0(int i10) {
        this.f124977a = new ArrayList<>(i10);
    }

    public void a(Object obj) {
        this.f124977a.add(obj);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.f124977a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f124977a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f124977a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f124977a.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f124977a.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public int c() {
        return this.f124977a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f124977a.toArray(objArr);
    }
}
