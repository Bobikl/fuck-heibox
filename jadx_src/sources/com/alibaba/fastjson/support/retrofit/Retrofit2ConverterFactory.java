package com.alibaba.fastjson.support.retrofit;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.b0;
import okhttp3.d0;
import okhttp3.v;
import retrofit2.f;
import retrofit2.t;

/* JADX INFO: loaded from: classes6.dex */
public class Retrofit2ConverterFactory extends f.a {
    private Feature[] features;
    private SerializeConfig serializeConfig;
    private SerializerFeature[] serializerFeatures;
    private static final v MEDIA_TYPE = v.j("application/json; charset=UTF-8");
    private static final Feature[] EMPTY_SERIALIZER_FEATURES = new Feature[0];
    private ParserConfig parserConfig = ParserConfig.getGlobalInstance();
    private int featureValues = JSON.DEFAULT_PARSER_FEATURE;

    public final class RequestBodyConverter<T> implements f<T, b0> {
        RequestBodyConverter() {
        }

        @Override // retrofit2.f
        public b0 convert(T t10) throws IOException {
            return b0.create(Retrofit2ConverterFactory.MEDIA_TYPE, JSON.toJSONBytes(t10, Retrofit2ConverterFactory.this.serializeConfig == null ? SerializeConfig.globalInstance : Retrofit2ConverterFactory.this.serializeConfig, Retrofit2ConverterFactory.this.serializerFeatures == null ? SerializerFeature.EMPTY : Retrofit2ConverterFactory.this.serializerFeatures));
        }
    }

    public final class ResponseBodyConverter<T> implements f<d0, T> {
        private Type type;

        ResponseBodyConverter(Type type) {
            this.type = type;
        }

        @Override // retrofit2.f
        public T convert(d0 d0Var) throws IOException {
            try {
                return (T) JSON.parseObject(d0Var.string(), this.type, Retrofit2ConverterFactory.this.parserConfig, Retrofit2ConverterFactory.this.featureValues, Retrofit2ConverterFactory.this.features != null ? Retrofit2ConverterFactory.this.features : Retrofit2ConverterFactory.EMPTY_SERIALIZER_FEATURES);
            } finally {
                d0Var.close();
            }
        }
    }

    public ParserConfig getParserConfig() {
        return this.parserConfig;
    }

    public int getParserFeatureValues() {
        return this.featureValues;
    }

    public Feature[] getParserFeatures() {
        return this.features;
    }

    public SerializeConfig getSerializeConfig() {
        return this.serializeConfig;
    }

    public SerializerFeature[] getSerializerFeatures() {
        return this.serializerFeatures;
    }

    @Override // retrofit2.f.a
    public f<?, b0> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, t tVar) {
        return new RequestBodyConverter();
    }

    @Override // retrofit2.f.a
    public f<d0, ?> responseBodyConverter(Type type, Annotation[] annotationArr, t tVar) {
        return new ResponseBodyConverter(type);
    }

    public Retrofit2ConverterFactory setParserConfig(ParserConfig parserConfig) {
        this.parserConfig = parserConfig;
        return this;
    }

    public Retrofit2ConverterFactory setParserFeatureValues(int i10) {
        this.featureValues = i10;
        return this;
    }

    public Retrofit2ConverterFactory setParserFeatures(Feature[] featureArr) {
        this.features = featureArr;
        return this;
    }

    public Retrofit2ConverterFactory setSerializeConfig(SerializeConfig serializeConfig) {
        this.serializeConfig = serializeConfig;
        return this;
    }

    public Retrofit2ConverterFactory setSerializerFeatures(SerializerFeature[] serializerFeatureArr) {
        this.serializerFeatures = serializerFeatureArr;
        return this;
    }
}
