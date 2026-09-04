package io.flutter.plugins.sharedpreferences;

import androidx.annotation.n0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface SharedPreferencesListEncoder {
    @n0
    List<String> decode(@n0 String str);

    @n0
    String encode(@n0 List<String> list);
}
