package com.huythanh0x.firstcrudspringapp.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.json.JSONException;
import org.json.JSONObject;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CouponCourseData {
    @Id
    private int courseId;
    private String category;
    private String subCategory;
    private String title;
    private int contentLength;
    private String level;
    private String author;
    private float rating;
    private int reviews;
    private int students;
    private String couponCode;
    private String previewImage;
    private String couponUrl;
    private String expiredDate;
    private int usesRemaining;
    private String heading;
    @Column(columnDefinition = "TEXT")
    private String description;
    private String previewVideo;
    private String language;

    public CouponCourseData parseCoupon(JSONObject jsonObject) {
        try {
            courseId = jsonObject.getInt("courseId");
            category = jsonObject.getString("category");
            subCategory = jsonObject.getString("subCategory");
            title = jsonObject.getString("title");
            contentLength = jsonObject.getInt("contentLength");
            level = jsonObject.getString("level");
            author = jsonObject.getString("author");
            rating = (float) jsonObject.getDouble("rating");
            reviews = jsonObject.getInt("reviews");
            students = jsonObject.getInt("students");
            couponCode = jsonObject.getString("couponCode");
            previewImage = jsonObject.getString("previewImage");
            couponUrl = jsonObject.getString("couponUrl");
            expiredDate = jsonObject.getString("expiredDate");
            usesRemaining = jsonObject.getInt("usesRemaining");
            heading = jsonObject.getString("heading");
            description = jsonObject.getString("description");
            previewVideo = jsonObject.getString("previewVideo");
            language = jsonObject.getString("language");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
        return this;
    }
}
