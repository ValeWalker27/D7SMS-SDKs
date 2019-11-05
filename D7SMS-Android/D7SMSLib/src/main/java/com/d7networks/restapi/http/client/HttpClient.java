/*
 * D7SMSLib
 *
 */
package com.d7networks.restapi.http.client;

import com.d7networks.restapi.exceptions.APIException;
import com.d7networks.restapi.http.request.HttpBodyRequest;
import com.d7networks.restapi.http.request.HttpRequest;
import com.d7networks.restapi.http.response.HttpResponse;
import java.util.Map;
import java.util.AbstractMap.SimpleEntry;
import java.util.List;

public interface HttpClient {

     /**
     * Sets a timeout for HTTP requests
     * @param   timeout    The timeout in seconds
     */
    public void setTimeout(long timeout);

    /**
     * Execute a given HttpRequest to get string response back
     * @param   request     The given HttpRequest to execute
     * @param   callBack    Callback after execution
     */
    public void executeAsStringAsync(final HttpRequest request, final APICallBack<HttpResponse> callBack);

    /**
     * Execute a given HttpRequest to get binary response back
     * @param   request     The given HttpRequest to execute
     * @param   callBack    Callback after execution
     */
    public void executeAsBinaryAsync(final HttpRequest request, final APICallBack<HttpResponse> callBack);

    /**
     * Create a simple HTTP GET request with basic authentication
     */
    public HttpRequest get(String _queryUrl,
                    Map<String, String> _headers, List<SimpleEntry<String, Object>> _parameters,
                    String _username, String _password);

    /**
     * Create a simple HTTP GET request
     */
    public HttpRequest get(String _queryUrl,
                    Map<String, String> _headers, List<SimpleEntry<String, Object>> _parameters);

    /**
     * Create a simple HTTP HEAD request with basic authentication
     */
    public HttpRequest head(String _queryUrl,
            Map<String, String> _headers, List<SimpleEntry<String, Object>> _parameters,
            String _username, String _password);

    /**
    * Create a simple HTTP HEAD request
    */
    public HttpRequest head(String _queryUrl,
            Map<String, String> _headers, List<SimpleEntry<String, Object>> _parameters);

    /**
     * Create an HTTP POST request with parameters
     */
    public HttpRequest post(String _queryUrl,
                     Map<String, String> _headers, List<SimpleEntry<String, Object>> _parameters);


    /**
     * Create an HTTP POST request with parameters and with basic authentication
     */
    public HttpRequest post(String _queryUrl,
                     Map<String, String> _headers, List<SimpleEntry<String, Object>> _parameters,
                     String _username, String _password);

    /**
     * Create an HTTP POST request with body
     */
    public HttpBodyRequest postBody(String _queryUrl,
                             Map<String, String> _headers, String _body);

    /**
     * Create an HTTP POST request with body and with basic authentication
     */
    public HttpBodyRequest postBody(String _queryUrl,
                             Map<String, String> _headers, String _body,
                             String _username, String _password);

    /**
     * Create an HTTP PUT request with parameters
     */
    public HttpRequest put(String _queryUrl,
                    Map<String, String> _headers, List<SimpleEntry<String, Object>> _parameters);

    /**
     * Create an HTTP PUT request with parameters and with basic authentication
     */
    HttpRequest put(String _queryUrl,
                    Map<String, String> _headers, List<SimpleEntry<String, Object>> _parameters,
                    String _username, String _password);

    /**
     * Create an HTTP PUT request with body
     */
    HttpBodyRequest putBody(String _queryUrl,
                            Map<String, String> _headers, String _body);

    /**
     * Create an HTTP PUT request with body and with basic authentication
     */
    public HttpBodyRequest putBody(String _queryUrl,
                            Map<String, String> _headers, String _body,
                            String _username, String _password);

    /**
     * Create an HTTP PATCH request with parameters
     */
    public HttpRequest patch(String _queryUrl,
                      Map<String, String> _headers, List<SimpleEntry<String, Object>> _parameters);

    /**
     * Create an HTTP PATCH request with parameters and with basic authentication
     */
    HttpRequest patch(String _queryUrl,
                      Map<String, String> _headers, List<SimpleEntry<String, Object>> _parameters,
                      String _username, String _password);

    /**
     * Create an HTTP PATCH request with body
     */
    public HttpBodyRequest patchBody(String _queryUrl,
                              Map<String, String> _headers, String _body);

    /**
     * Create an HTTP PATCH request with body and with basic authentication
     */
    public HttpBodyRequest patchBody(String _queryUrl,
                              Map<String, String> _headers, String _body,
                              String _username, String _password);

    /**
     * Create an HTTP DELETE request with parameters
     */
    HttpRequest delete(String _queryUrl,
                       Map<String, String> _headers, List<SimpleEntry<String, Object>> _parameters);

    /**
     * Create an HTTP DELETE request with parameters and with basic authentication
     */
    public HttpRequest delete(String _queryUrl,
                       Map<String, String> _headers, List<SimpleEntry<String, Object>> _parameters,
                       String _username, String _password);

    /**
     * Create an HTTP DELETE request with body
     */
    public HttpBodyRequest deleteBody(String _queryUrl,
                               Map<String, String> _headers, String _body);

    /**
     * Create an HTTP DELETE request with body and with basic authentication
     */
    public HttpBodyRequest deleteBody(String _queryUrl,
                               Map<String, String> _headers, String _body,
                               String _username, String _password);
}