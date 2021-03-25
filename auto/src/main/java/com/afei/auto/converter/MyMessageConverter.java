package com.afei.auto.converter;

import com.afei.auto.model.Pension;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/**
 * 自定义 MessageConverter 消息转化器
 * @author shihengfei
 */
public class MyMessageConverter implements HttpMessageConverter<Pension> {


    @Override
    public boolean canRead(Class<?> clazz, MediaType mediaType) {
        return false;
    }

    @Override
    public boolean canWrite(Class<?> clazz, MediaType mediaType) {
        // 类型是否匹配
        return clazz.isAssignableFrom(Pension.class);
    }

    /**
     * 获取支持的媒体类型 shf
     * @return
     */
    @Override
    public List<MediaType> getSupportedMediaTypes() {
        return MediaType.parseMediaTypes("application/shf");
    }

    @Override
    public Pension read(Class<? extends Pension> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        return null;
    }

    @Override
    public void write(Pension pension, MediaType contentType, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        // 自定义数据的处理
        String data = pension.getAge()+";"+pension.getName();
        // 写出数据
        OutputStream body = outputMessage.getBody();
        body.write(data.getBytes());
    }
}
