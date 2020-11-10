package com.github.thestyleofme.presto.infra.utils;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

/**
 * <p>
 * description
 * </p>
 *
 * @author isacc 2020/3/26 23:28
 * @since 1.0
 */
public final class RestTemplateUtil {

    private RestTemplateUtil() {
        throw new IllegalStateException("util class");
    }

    /**
     * 封装请求头
     *
     * @return org.springframework.http.HttpHeaders
     */
    public static HttpHeaders applicationJsonHeaders() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        return httpHeaders;
    }

    /**
     * 封装请求头
     *
     * @return org.springframework.http.HttpHeaders
     */
    public static HttpHeaders applicationMultiDataHeaders() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.MULTIPART_FORM_DATA);
        return httpHeaders;
    }

}
