package com.huythanh0x.firstcrudspringapp.controller;

import com.huythanh0x.firstcrudspringapp.entity.CouponCourseData;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class FetchCouponData {
    public static ArrayList<CouponCourseData> fetchAllCoupons() throws IOException, JSONException {
        ArrayList<CouponCourseData> allCoupons = new ArrayList<>();
        URL apiUrl = new URL("http://huythanh0x.ddns.net:8080/fetch/all");
        HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder jsonResponse = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            jsonResponse.append(line);
        }
        reader.close();
        System.out.println(jsonResponse);
        JSONArray listCoupons = new JSONObject(jsonResponse.toString()).getJSONArray("coupons");
        for (int idx = 0; idx < listCoupons.length(); idx++) {
            CouponCourseData newCoupon = new CouponCourseData().parseCoupon((JSONObject) listCoupons.get(idx));
            allCoupons.add(newCoupon);
        }
        System.out.println("Just updated " + allCoupons.size() + " coupons");
        return allCoupons;
    }
}

