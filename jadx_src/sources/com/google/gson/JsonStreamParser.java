package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class JsonStreamParser implements Iterator<JsonElement> {
    private final Object lock;
    private final JsonReader parser;

    public JsonStreamParser(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        this.parser = jsonReader;
        jsonReader.setLenient(true);
        this.lock = new Object();
    }

    public JsonStreamParser(String str) {
        this(new StringReader(str));
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean z10;
        synchronized (this.lock) {
            try {
                try {
                    try {
                        z10 = this.parser.peek() != JsonToken.END_DOCUMENT;
                    } catch (IOException e10) {
                        throw new JsonIOException(e10);
                    }
                } catch (MalformedJsonException e11) {
                    throw new JsonSyntaxException(e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public JsonElement next() throws JsonParseException {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        try {
            return Streams.parse(this.parser);
        } catch (JsonParseException e10) {
            if (e10.getCause() instanceof EOFException) {
                throw new NoSuchElementException();
            }
            throw e10;
        } catch (OutOfMemoryError e11) {
            throw new JsonParseException("Failed parsing JSON source to Json", e11);
        } catch (StackOverflowError e12) {
            throw new JsonParseException("Failed parsing JSON source to Json", e12);
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
