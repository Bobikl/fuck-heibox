package com.davemorrissey.labs.subscaleview.decoder;

import android.graphics.Bitmap;
import androidx.annotation.n0;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public class CompatDecoderFactory<T> implements DecoderFactory<T> {
    private final Bitmap.Config bitmapConfig;
    private final Class<? extends T> clazz;

    public CompatDecoderFactory(@n0 Class<? extends T> cls) {
        this(cls, null);
    }

    public CompatDecoderFactory(@n0 Class<? extends T> cls, Bitmap.Config config) {
        this.clazz = cls;
        this.bitmapConfig = config;
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.DecoderFactory
    @n0
    public T make() throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        return this.bitmapConfig == null ? this.clazz.newInstance() : this.clazz.getConstructor(Bitmap.Config.class).newInstance(this.bitmapConfig);
    }
}
