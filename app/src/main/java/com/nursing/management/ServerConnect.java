package com.nursing.management;

import android.content.Context;
import android.util.Log;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HTTP;
import org.json.JSONArray;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class ServerConnect {
    HttpClient httpClient;
    Context context;

    public ServerConnect() {
        HttpParams httpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(httpParams, 10000);
        HttpConnectionParams.setSoTimeout(httpParams, 7000);
        httpClient = new DefaultHttpClient(httpParams);
    }

    public JSONArray execQuery(String dbAddress, String query) {
        String dbServer = "13.125.162.181";
        String url = "http://%s/nursing_connect.php";
        String result = "";

        if(dbAddress == null) {
            dbAddress = dbServer;
        }

        ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
        nameValuePairs.add(new BasicNameValuePair("query", query));
        InputStream inputStream = null;

        try {
            HttpPost httpPost = new HttpPost(String.format(url, dbAddress));
            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs, HTTP.UTF_8));
            HttpResponse response = httpClient.execute(httpPost);

            HttpEntity entity = response.getEntity();
            inputStream = entity.getContent();
        } catch(ConnectTimeoutException e) {
            return null;
        } catch(UnknownHostException e) {
            return null;
        } catch(Exception e) {
            return null;
        }

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"), 8);
            StringBuilder sb = new StringBuilder();
            String line = null;
            while((line = bufferedReader.readLine()) != null) {
                sb.append(line + "\n");
            }
            inputStream.close();
            result = sb.toString();
        } catch(Exception e) {

        }

        JSONArray jsonArray = null;
        try {
            jsonArray = new JSONArray(result);
        } catch(Exception e) {

        }

        return jsonArray;
    }
}