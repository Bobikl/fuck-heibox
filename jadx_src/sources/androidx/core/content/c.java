package androidx.core.content;

import android.content.ContentValues;
import kotlin.Pair;

/* JADX INFO: compiled from: ContentValues.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    @dl.d
    public static final ContentValues a(@dl.d Pair<String, ? extends Object>... pairs) {
        kotlin.jvm.internal.f0.p(pairs, "pairs");
        ContentValues contentValues = new ContentValues(pairs.length);
        for (Pair<String, ? extends Object> pair : pairs) {
            String strA = pair.a();
            Object objB = pair.b();
            if (objB == null) {
                contentValues.putNull(strA);
            } else if (objB instanceof String) {
                contentValues.put(strA, (String) objB);
            } else if (objB instanceof Integer) {
                contentValues.put(strA, (Integer) objB);
            } else if (objB instanceof Long) {
                contentValues.put(strA, (Long) objB);
            } else if (objB instanceof Boolean) {
                contentValues.put(strA, (Boolean) objB);
            } else if (objB instanceof Float) {
                contentValues.put(strA, (Float) objB);
            } else if (objB instanceof Double) {
                contentValues.put(strA, (Double) objB);
            } else if (objB instanceof byte[]) {
                contentValues.put(strA, (byte[]) objB);
            } else if (objB instanceof Byte) {
                contentValues.put(strA, (Byte) objB);
            } else {
                if (!(objB instanceof Short)) {
                    throw new IllegalArgumentException("Illegal value type " + objB.getClass().getCanonicalName() + " for key \"" + strA + kotlin.text.y.f128593b);
                }
                contentValues.put(strA, (Short) objB);
            }
        }
        return contentValues;
    }
}
