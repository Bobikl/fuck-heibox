package com.davemorrissey.labs.subscaleview.decoder;

import androidx.annotation.n0;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public interface DecoderFactory<T> {
    @n0
    T make() throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException;
}
