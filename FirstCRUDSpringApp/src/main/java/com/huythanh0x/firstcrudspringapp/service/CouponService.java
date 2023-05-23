package com.huythanh0x.firstcrudspringapp.service;

import com.huythanh0x.firstcrudspringapp.entity.CouponCourseData;
import com.huythanh0x.firstcrudspringapp.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CouponService {
    @Autowired
    private CouponRepository repository;

    public CouponCourseData saveCoupon(CouponCourseData coupon) {
        return repository.save(coupon);
    }

    public List<CouponCourseData> saveCoupons(List<CouponCourseData> coupons) {
        return repository.saveAll(coupons);
    }

    public List<CouponCourseData> getCoupons() {
        return repository.findAll();
    }

    public CouponCourseData getCouponById(int id) {
        return repository.findById(id).orElse(null);
    }

    public CouponCourseData getCouponByCategory(String category) {
        return repository.findByCategory(category);
    }

    public String deleteCoupon(int id) {
        repository.deleteById(id);
        return "coupon was deleted" + id;
    }

    public CouponCourseData updateCoupon(CouponCourseData coupon) {
        CouponCourseData existingCoupon = repository.findById(coupon.getCourseId()).orElse(null);
        if (existingCoupon != null) {
            existingCoupon.setCategory(coupon.getCategory());
            existingCoupon.setSubCategory(coupon.getSubCategory());
            existingCoupon.setTitle(coupon.getTitle());
            existingCoupon.setContentLength(coupon.getContentLength());
            existingCoupon.setLevel(coupon.getLevel());
            existingCoupon.setAuthor(coupon.getAuthor());
            existingCoupon.setRating(coupon.getRating());
            existingCoupon.setReviews(coupon.getReviews());
            existingCoupon.setStudents(coupon.getStudents());
            existingCoupon.setCouponCode(coupon.getCouponCode());
            existingCoupon.setPreviewImage(coupon.getPreviewImage());
            existingCoupon.setCouponUrl(coupon.getCouponUrl());
            existingCoupon.setExpiredDate(coupon.getExpiredDate());
            existingCoupon.setUsesRemaining(coupon.getUsesRemaining());
            existingCoupon.setHeading(coupon.getHeading());
            existingCoupon.setDescription(coupon.getDescription());
            existingCoupon.setPreviewVideo(coupon.getPreviewVideo());
            existingCoupon.setLanguage(coupon.getLanguage());

            // Save the updated coupon to the repository
            return repository.save(existingCoupon);
        }
        return null;
    }

}
